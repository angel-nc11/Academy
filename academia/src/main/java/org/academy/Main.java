package org.academy;

import org.academy.DAO.UsuarioDAO;
import org.academy.Model.AdministracionModel;
import org.academy.Model.UsuarioModel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UsuarioModel usuario = new UsuarioModel();
        AdministracionModel administracionModel = new AdministracionModel();

        // ingresar usuarios
        /*
        usuario.setNombre("Maria Perez");
        usuario.setCorreo("perezmaria@gmail.com");
        usuario.setContrasena("administracion#123");
        usuario.setTipo_usuario_id(2);
        */

        //ingresar usuario administracion
        administracionModel
                .setUsuario_id(2);
        administracionModel.setAcademia_id(1);
        administracionModel.setCargo("Director General");


    }
}
