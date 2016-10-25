/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

<<<<<<< HEAD:src/java/classes/ConsultaUsuario.java
=======
import classes.Consultas;
>>>>>>> 5aceea03eb213c94381ab43817dfef387ac7fb7d:src/java/rest/ConsultaUsuario.java
import com.google.gson.Gson;
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
    public String buscausuario() {
<<<<<<< HEAD:src/java/classes/ConsultaUsuario.java
        Usuario usu;
        Consultas con = new Consultas();
        Gson gson = new Gson();
        usu = con.buscaUsuario();
        String json = gson.toJson(usu);
=======
        Consultas con = new Consultas();
        Gson gson = new Gson();
        String json = gson.toJson(con.login());
>>>>>>> 5aceea03eb213c94381ab43817dfef387ac7fb7d:src/java/rest/ConsultaUsuario.java
        return json;
    }
    


}
