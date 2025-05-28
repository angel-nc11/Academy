package org.academy.Model;

import java.sql.Date;

public class UsuarioModel {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private int tipo_usuario_id;
    private Date update_date;
    private String estado;

    public UsuarioModel(String nombre, String correo, String contrasena, int tipo_usuario_id) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipo_usuario_id = tipo_usuario_id;
    }

    public UsuarioModel() {
    }


    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTipo_usuario_id() {
        return tipo_usuario_id;
    }

    public void setTipo_usuario_id(int tipo_usuario_id) {
        this.tipo_usuario_id = tipo_usuario_id;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
