/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import hibernate.Usuario;
import hibernateutil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author mikef
 */
public class Consultas {

    public Usuario login() {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Usuario> lista = (List<Usuario>) s.createQuery("from Usuario u where u.email ='mikefrade@hotmail.com'").list();
//        Usuario u = (Usuario) s.createQuery("from Usuario u where u.email ='mikefrade@hotmail.com'");
//        System.out.println(u.getEmail()); 
           System.out.println(lista.get(0));
        
                
        return lista.get(0);
    }
}
