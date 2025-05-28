package org.academy.Model;

import java.sql.Date;

public class AdministracionModel {

    private int id;
    private int usuario_id;
    private int academia_id;
    private String cargo;
    private Date update_date;
    private String estado;

    public AdministracionModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getAcademia_id() {
        return academia_id;
    }

    public void setAcademia_id(int academia_id) {
        this.academia_id = academia_id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
