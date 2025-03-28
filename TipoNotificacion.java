package org.abidoc.model;

public class TipoNotificacion {
    private int id;
    private String descripcion;
    private String rutaPlantilla;

    public TipoNotificacion(int id, String rutaPlantilla, String descripcion) {
        this.id = id;
        this.rutaPlantilla = rutaPlantilla;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRutaPlantilla() {
        return rutaPlantilla;
    }

    public void setRutaPlantilla(String rutaPlantilla) {
        this.rutaPlantilla = rutaPlantilla;
    }
}
