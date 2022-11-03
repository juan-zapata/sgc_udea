package com.proyectointegrador.sgc_udea.service;

import co.edu.udea.exception.OrgSistemasSecurityException;
import co.edu.udea.wsClient.OrgSistemasWebServiceClient;
import com.proyectointegrador.sgc_udea.dto.MicroCurriculoDTO;
import com.proyectointegrador.sgc_udea.model.MicroCurriculoEntity;
import com.proyectointegrador.sgc_udea.repository.MicroCurriculoRepository;
import com.proyectointegrador.sgc_udea.request.ConsultarMateriasRequisitosRequest;
import com.proyectointegrador.sgc_udea.response.ConsultarMateriasMares;
import com.proyectointegrador.sgc_udea.response.ConsultarRequisitosMateria;
import com.proyectointegrador.sgc_udea.response.MateriasProgramaVersion;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MicroCurriculoService {

    private final MicroCurriculoRepository microCurriculoRepository;
    private final OrgSistemasWebServiceClient orgSistemasWebServiceClient;

    private static final String TOKEN = "5facbdd992ecd3e667df2b544e22a80a8274fd59";
    private static final String CONSULTAR_MATERIAS_PROGRAMA_VERSION = "consultarmateriasprogramaversion";
    private static final String CONSULTAR_REQUISITOS_MATERIA = "consultarrequisitosmateria";
    private static final String CONSULTAR_MATERIAS_MARES = "consultarmateriasmares";


    public MicroCurriculoService(MicroCurriculoRepository microCurriculoRepository, OrgSistemasWebServiceClient orgSistemasWebServiceClient) {
        this.microCurriculoRepository = microCurriculoRepository;
        this.orgSistemasWebServiceClient = orgSistemasWebServiceClient;
    }

    private List<MateriasProgramaVersion> consultarMateriasPrograma(ConsultarMateriasRequisitosRequest materia) throws OrgSistemasSecurityException {
        orgSistemasWebServiceClient.addParam("facultad", materia.getFacultad());
        orgSistemasWebServiceClient.addParam("version", materia.getVersion());
        orgSistemasWebServiceClient.addParam("programa", materia.getPrograma());
        return orgSistemasWebServiceClient.obtenerBean(CONSULTAR_MATERIAS_PROGRAMA_VERSION, TOKEN, MateriasProgramaVersion.class);
    }

    private List<ConsultarMateriasMares> consultarMateriasMares(String codigoMateria) throws OrgSistemasSecurityException {
        orgSistemasWebServiceClient.addParam("codigoMateria", codigoMateria);
        return orgSistemasWebServiceClient.obtenerBean(CONSULTAR_MATERIAS_MARES,
                TOKEN, ConsultarMateriasMares.class);
    }


    @Transactional
    public List<MateriasProgramaVersion> consultarRequisitosMateria(ConsultarMateriasRequisitosRequest materia) throws OrgSistemasSecurityException {
        orgSistemasWebServiceClient.addParam("facultad", materia.getFacultad());
        orgSistemasWebServiceClient.addParam("version", materia.getVersion());
        orgSistemasWebServiceClient.addParam("programa", materia.getPrograma());
        return consultarMateriasPrograma(materia).stream().filter(consulta -> {
            orgSistemasWebServiceClient.addParam("materia", consulta.getMateria().toString());
            try {
                consulta.setCreditos(consultarMateriasMares(consulta.getMateria().toString()).get(0).getCreditos());
                List<ConsultarRequisitosMateria> response = orgSistemasWebServiceClient.obtenerBean(CONSULTAR_REQUISITOS_MATERIA,
                        TOKEN, ConsultarRequisitosMateria.class);
                consulta.setRequisitos(response);
                return true;
            } catch (OrgSistemasSecurityException e) {
                throw new RuntimeException(e);
            }
        }).toList();

    }

    public MicroCurriculoEntity save(MicroCurriculoDTO micro) {
        ModelMapper mm = new ModelMapper();
        return microCurriculoRepository.save(mm.map(micro, MicroCurriculoEntity.class));
    }

    public MicroCurriculoEntity update(MicroCurriculoDTO micro) {
        ModelMapper mm = new ModelMapper();
        return microCurriculoRepository.save(mm.map(micro, MicroCurriculoEntity.class));
    }

    public List<MicroCurriculoEntity> listar() {
        return microCurriculoRepository.findAll();
    }

    public MicroCurriculoEntity listarPorId(Integer id) {
        Optional<MicroCurriculoEntity> elemento = microCurriculoRepository.findById(id);
        return elemento.orElseGet(MicroCurriculoEntity::new);
    }

    public void deleteByid(Integer id) {
        this.microCurriculoRepository.deleteById(id);
    }
}
