package org.abidoc.model;

public class Domicilio {
    private int id;
    private String calle;
    private String numExterior;
    private String numInterior;
    private int idUsuario;
    private int idColonia;
    private int idTipoDomicilio;

    public Domicilio(int id, String calle, String numExterior, String numInterior, int idUsuario, int idColonia, int idTipoDomicilio) {
        this.id = id;
        this.calle = calle;
        this.numExterior = numExterior;
        this.numInterior = numInterior;
        this.idUsuario = idUsuario;
        this.idColonia = idColonia;
        this.idTipoDomicilio = idTipoDomicilio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumExterior() {
        return numExterior;
    }

    public void setNumExterior(String numExterior) {
        this.numExterior = numExterior;
    }

    public String getNumInterior() {
        return numInterior;
    }

    public void setNumInterior(String numInterior) {
        this.numInterior = numInterior;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(int idColonia) {
        this.idColonia = idColonia;
    }

    public int getIdTipoDomicilio() {
        return idTipoDomicilio;
    }

    public void setIdTipoDomicilio(int idTipoDomicilio) {
        this.idTipoDomicilio = idTipoDomicilio;
    }
}
