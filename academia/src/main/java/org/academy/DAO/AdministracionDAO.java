package org.academy.DAO;

import org.academy.Model.AdministracionModel;
import org.academy.Model.JDBCUtil;

import java.sql.*;

public class AdministracionDAO {
    public void insertarAdministracion(AdministracionModel administracionModel) {
        String sql = "INSERT INTO administracion (usuario_id, academia_id, cargo) VALUES (?,?,?)";
        try (Connection conn = JDBCUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setInt(1,administracionModel.getUsuario_id());
            stmt.setInt(2,administracionModel.getAcademia_id());
            stmt.setString(3,administracionModel.getCargo());

            int filas = stmt.executeUpdate();

            if (filas >0){
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()){
                    if (generatedKeys.next()){
                        int idGenerado = generatedKeys.getInt(1);
                        administracionModel.setId(idGenerado);

                        System.out.println("Usuario insertado exitosamente");
                        System.out.println("-- "+administracionModel.getCargo());
                    }

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
