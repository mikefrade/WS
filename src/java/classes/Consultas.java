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

    public Usuario buscaUsuario() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Usuario> lista = (List<Usuario>) s.createQuery("from Usuario u where u.nome ='marcos'").list();
        System.err.println(lista.get(0).toString());
        s.getTransaction().commit();
        return lista.get(0);
    }

    public String usuarioValido() {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        String resultado = "false";

        List<Usuario> lista = (List<Usuario>) s.createQuery("from Usuario u where u.email ='marcos@teste.com.br'").list();
        s.getTransaction().commit();

        if (!lista.isEmpty()) {
            resultado = "true";
        }

        return resultado;
    }
}
