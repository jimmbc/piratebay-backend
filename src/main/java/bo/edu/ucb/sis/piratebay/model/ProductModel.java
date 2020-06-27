package bo.edu.ucb.sis.piratebay.model;

import java.util.Date;

public class ProductModel {
    private Integer requisition_id;
    private Date fecha;
    private String nombre;
    private String address;

    public ProductModel() {
    }

    public ProductModel(Integer requisition_id, Date fecha, String nombre, String address) {
        this.requisition_id = requisition_id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.address = address;
    }

    public Integer getRequisition_id() {
        return requisition_id;
    }

    public void setRequisition_id(Integer requisition_id) {
        this.requisition_id = requisition_id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "requisition_id=" + requisition_id +
                ", fecha=" + fecha +
                ", nombre='" + nombre + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
