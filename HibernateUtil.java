/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanliquancafe.hibernate;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import quanliquancafe.model.NhanVien;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author admin
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactorys;
    
    
    static {
        try {
            Configuration configurations = new  Configuration();
            configurations.configure("hibernate.cfg.xml");
            //configurations.addAnnotatedClass(NhanVien.class);
            //sessionFactorys = new AnnotationConfiguration().configure().buildSessionFactory();
            StandardServiceRegistryBuilder builders = new StandardServiceRegistryBuilder()
                    .applySettings(configurations.getProperties());
            sessionFactorys = configurations.buildSessionFactory(builders.build());
            
            
            
            
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactorys;
    }
    
    public static void main(String[] args) {
        
    }
}
