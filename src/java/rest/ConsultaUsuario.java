/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import classes.Consultas;
import hibernate.Usuario;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mikef
 */

@Path("/usuario")
public class ConsultaUsuario {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String buscausuario(){
        Usuario usu = new Usuario();
        Consultas con = new Consultas();
        usu = con.login();
        return usu.toString();      
      
    }
    
}