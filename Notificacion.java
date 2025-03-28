package org.abidoc.model;

import java.util.Date;

public class Notificacion {
    private int id;
    private Date fechaNotificacion;
    private int idUsuario;
    private int idTipoNotificacion;

    public Notificacion(int id, Date fechaNotificacion, int idUsuario, int idTipoNotificacion) {
        this.id = id;
        this.fechaNotificacion = fechaNotificacion;
        this.idUsuario = idUsuario;
        this.idTipoNotificacion = idTipoNotificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipoNotificacion() {
        return idTipoNotificacion;
    }

    public void setIdTipoNotificacion(int idTipoNotificacion) {
        this.idTipoNotificacion = idTipoNotificacion;
    }
}
