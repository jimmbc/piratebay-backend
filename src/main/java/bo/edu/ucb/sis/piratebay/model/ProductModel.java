package bo.edu.ucb.sis.piratebay.model;

import java.util.Date;

public class ProductModel {
    private Integer requisition_id;
    private Date fecha_pagado;
    private Date fecha_preparado;
    private Date fecha_despachado;
    private Date fecha_entregado;
    private String nombre;
    private String address;
    private String pelicula;
    private Integer Quantity;
    private Integer Quantity_commit;
    private Integer Quantity_received;
    private Integer status;

    public ProductModel(Integer requisition_id, String nombre, Date fecha_pagado, Date fecha_preparado, Date fecha_despachado, Date fecha_entregado) {
        this.requisition_id = requisition_id;
        this.nombre = nombre;
        this.fecha_pagado = fecha_pagado;
        this.fecha_preparado = fecha_preparado;
        this.fecha_despachado = fecha_despachado;
        this.fecha_entregado = fecha_entregado;
    }

    public Integer getQuantity_commit() {
        return Quantity_commit;
    }

    public void setQuantity_commit(Integer quantity_commit) {
        Quantity_commit = quantity_commit;
    }

    public Integer getQuantity_received() {
        return Quantity_received;
    }

    public void setQuantity_received(Integer quantity_received) {
        Quantity_received = quantity_received;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private String nombre_emp;
    private Integer courier_id;
    public ProductModel() {
    }

    public ProductModel(Integer requisition_id, Date fecha_pagado, Date fecha_preparado, Date fecha_despachado, Date fecha_entregado, String nombre, String pelicula, String nombre_emp, Integer courier_id) {
        this.requisition_id = requisition_id;
        this.fecha_pagado = fecha_pagado;
        this.fecha_preparado = fecha_preparado;
        this.fecha_despachado = fecha_despachado;
        this.fecha_entregado = fecha_entregado;
        this.nombre = nombre;
        this.pelicula = pelicula;
        this.nombre_emp = nombre_emp;
        this.courier_id = courier_id;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public ProductModel(String pelicula, Integer quantity) {
        this.pelicula = pelicula;
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "requisition_id=" + requisition_id +
                ", fecha_pagado=" + fecha_pagado +
                ", fecha_preparado=" + fecha_preparado +
                ", fecha_despachado=" + fecha_despachado +
                ", fecha_entregado=" + fecha_entregado +
                ", nombre='" + nombre + '\'' +
                ", address='" + address + '\'' +
                ", pelicula='" + pelicula + '\'' +
                ", Quantity=" + Quantity +
                ", nombre_emp='" + nombre_emp + '\'' +
                ", courier_id=" + courier_id +
                '}';
    }

    public ProductModel(Integer requisition_id, String nombre, String address, String pelicula, Integer quantity, Date fecha_pagado, Date fecha_preparado) {
        this.requisition_id = requisition_id;
        this.nombre = nombre;
        this.address = address;
        this.pelicula = pelicula;
        Quantity = quantity;
        this.fecha_pagado = fecha_pagado;
        this.fecha_preparado = fecha_preparado;
    }

    public ProductModel(Integer requisition_id, Date fecha_pagado, Date fecha_preparado, Date fecha_despachado, String nombre, String pelicula) {
        this.requisition_id = requisition_id;
        this.fecha_pagado = fecha_pagado;
        this.fecha_preparado = fecha_preparado;
        this.fecha_despachado = fecha_despachado;
        this.nombre = nombre;
        this.pelicula = pelicula;
    }

    public ProductModel(Integer requisition_id, Date fecha_pagado, Date fecha_preparado, String nombre, String pelicula) {
        this.requisition_id = requisition_id;
        this.fecha_pagado = fecha_pagado;
        this.fecha_preparado = fecha_preparado;
        this.nombre = nombre;
        this.pelicula = pelicula;
    }



    public ProductModel(Integer requisition_id, Date fecha_pagado, String nombre, String address) {
        this.requisition_id = requisition_id;
        this.fecha_pagado = fecha_pagado;
        this.nombre = nombre;
        this.address = address;
    }

    public ProductModel(Integer requisition_id, String nombre, String address, Date fecha_pagado, Date fecha_preparado, Date fecha_despachado) {
        this.requisition_id = requisition_id;
        this.fecha_pagado = fecha_pagado;
        this.fecha_preparado = fecha_preparado;
        this.fecha_despachado = fecha_despachado;
        this.nombre = nombre;
        this.address = address;
    }

    public Integer getRequisition_id() {
        return requisition_id;
    }

    public void setRequisition_id(Integer requisition_id) {
        this.requisition_id = requisition_id;
    }

    public Date getFecha_pagado() {
        return fecha_pagado;
    }

    public void setFecha_pagado(Date fecha_pagado) {
        this.fecha_pagado = fecha_pagado;
    }

    public Date getFecha_preparado() {
        return fecha_preparado;
    }

    public void setFecha_preparado(Date fecha_preparado) {
        this.fecha_preparado = fecha_preparado;
    }

    public Date getFecha_despachado() {
        return fecha_despachado;
    }

    public void setFecha_despachado(Date fecha_despachado) {
        this.fecha_despachado = fecha_despachado;
    }

    public Date getFecha_entregado() {
        return fecha_entregado;
    }

    public void setFecha_entregado(Date fecha_entregado) {
        this.fecha_entregado = fecha_entregado;
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

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public Integer getCourier_id() {
        return courier_id;
    }

    public void setCourier_id(Integer courier_id) {
        this.courier_id = courier_id;
    }
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
}
