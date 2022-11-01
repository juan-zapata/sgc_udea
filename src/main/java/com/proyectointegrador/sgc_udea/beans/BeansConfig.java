package com.proyectointegrador.sgc_udea.beans;


import co.edu.udea.exception.OrgSistemasSecurityException;
import co.edu.udea.wsClient.OrgSistemasWebServiceClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public OrgSistemasWebServiceClient orgSistemasWebServiceClient() throws OrgSistemasSecurityException {
        return new OrgSistemasWebServiceClient(false);
    }




}
