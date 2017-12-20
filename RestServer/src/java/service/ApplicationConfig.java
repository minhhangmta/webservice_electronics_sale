/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

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
        resources.add(service.ChitiethdFacadeREST.class);
        resources.add(service.DanhmucFacadeREST.class);
        resources.add(service.DonhangFacadeREST.class);
        resources.add(service.KhachhangFacadeREST.class);
        resources.add(service.LienheFacadeREST.class);
        resources.add(service.NhacungcapFacadeREST.class);
        resources.add(service.QuyenFacadeREST.class);
        resources.add(service.SanphamFacadeREST.class);
        resources.add(service.TaikhoanFacadeREST.class);
        resources.add(service.TrangthaiFacadeREST.class);
    }
    
}