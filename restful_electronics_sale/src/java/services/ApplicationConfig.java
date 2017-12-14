/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author minhh
 */
@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(services.ChitiethdFacadeREST.class);
        resources.add(services.DanhmucFacadeREST.class);
        resources.add(services.DonhangFacadeREST.class);
        resources.add(services.KhachhangFacadeREST.class);
        resources.add(services.LienheFacadeREST.class);
        resources.add(services.NhacungcapFacadeREST.class);
        resources.add(services.QuyenFacadeREST.class);
        resources.add(services.SanphamFacadeREST.class);
        resources.add(services.TaikhoanFacadeREST.class);
        resources.add(services.TrangthaiFacadeREST.class);
    }
    
}
