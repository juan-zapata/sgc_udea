package com.proyectointegrador.sgc_udea.repository;

import com.proyectointegrador.sgc_udea.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {
}
