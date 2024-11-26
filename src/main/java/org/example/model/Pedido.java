package org.example.model;

public class Pedido {
    private int id;
    private String nombreCliente;
    private String descripcion;
    private String estado;

    public Pedido(int id, String nombreCliente, String descripcion, String estado) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "ID=" + id +
                ", Cliente='" + nombreCliente + '\'' +
                ", Descripción='" + descripcion + '\'' +
                ", Estado='" + estado + '\'' +
                '}';
    }
}
