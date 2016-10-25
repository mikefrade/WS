/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;
import hibernate.Seguranca;
import hibernate.Usuario;
import javax.json.Json;
import javax.ws.rs.Path;

/**
 *
 * @author Marcos Benevides
 */
@Path("login")
public class ConsultaLogin {

    public String login(String email, String senha) {
        Consultas con = new Consultas();
        Gson gson = new Gson();
        Seguranca usu = con.requisicaoLogin(email);
        if (usu.getPassword().equals(senha)) {
            String json = gson.toJson(usu);
            return json;
        }
        String json = gson.toJson("");
        return json;
    }

}
