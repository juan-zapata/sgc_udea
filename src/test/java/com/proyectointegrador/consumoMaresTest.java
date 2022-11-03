package com.proyectointegrador;

import co.edu.udea.exception.OrgSistemasSecurityException;
import co.edu.udea.wsClient.OrgSistemasWebServiceClient;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

public class consumoMaresTest {

    @Test
    void test() throws OrgSistemasSecurityException {

        OrgSistemasWebServiceClient client = new OrgSistemasWebServiceClient(false);

        /*client.addParam("facultad", "25");
        client.addParam("version", "5");
        client.addParam("programa", "504");

         */
        client.addParam("codigoMateria", "2508315");

        Object response = client.obtener("consultarmateriasmares",
                "5facbdd992ecd3e667df2b544e22a80a8274fd59");


    }


}
