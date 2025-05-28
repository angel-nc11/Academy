package org.academy.DAO;
import org.academy.Model.JDBCUtil;
import org.academy.Model.UsuarioModel;
import org.jetbrains.annotations.NotNull;

import java.sql.*;

public class UsuarioDAO {

    public void insertarUsuario(@NotNull UsuarioModel usuarioModel){
        String sql = "INSERT INTO usuario (nombre, correo, contrasena, tipo_usuario_id) VALUES (?,?,?,?)";
        try (Connection conn = JDBCUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))

        {
            stmt.setString(1, usuarioModel.getNombre());
            stmt.setString(2, usuarioModel.getCorreo());
            stmt.setString(3, usuarioModel.getContrasena());
            stmt.setInt(4,usuarioModel.getTipo_usuario_id());

            int filas = stmt.executeUpdate();

            if (filas >0){
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()){
                    if (generatedKeys.next()){
                        int idGenerado = generatedKeys.getInt(1);
                        usuarioModel.setId(idGenerado);

                        System.out.println("Usuario insertado exitosamente");
                        System.out.println("-- "+usuarioModel.getNombre()+", "+usuarioModel.getCorreo());
                    }

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
