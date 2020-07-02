package bo.edu.ucb.sis.piratebay.model;

import java.util.Date;

public class OrderModel {
    private Integer requisitionId;
    private Date fechaPagado;
    private Date fechaPreparado;
    private Date fechaDespachado;
    private Date fechaEntregado;
    private int status;
    private int clientClientId;

    @Override
    public String toString() {
        return "OrderModel{" +
                "requisitionId=" + requisitionId +
                ", fechaPagado=" + fechaPagado +
                ", fechaPreparado=" + fechaPreparado +
                ", fechaDespachado=" + fechaDespachado +
                ", fechaEntregado=" + fechaEntregado +
                ", status=" + status +
                ", clientClientId=" + clientClientId +
                '}';
    }

    public Integer getRequisitionId() {
        return requisitionId;
    }

    public void setRequisitionId(Integer requisitionId) {
        this.requisitionId = requisitionId;
    }

    public Date getFechaPagado() {
        return fechaPagado;
    }

    public void setFechaPagado(Date fechaPagado) {
        this.fechaPagado = fechaPagado;
    }

    public Date getFechaPreparado() {
        return fechaPreparado;
    }

    public void setFechaPreparado(Date fechaPreparado) {
        this.fechaPreparado = fechaPreparado;
    }

    public Date getFechaDespachado() {
        return fechaDespachado;
    }

    public void setFechaDespachado(Date fechaDespachado) {
        this.fechaDespachado = fechaDespachado;
    }

    public Date getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(Date fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getClientClientId() {
        return clientClientId;
    }

    public void setClientClientId(int clientClientId) {
        this.clientClientId = clientClientId;
    }

    public OrderModel(Integer requisitionId, Date fechaPagado, Date fechaPreparado, Date fechaDespachado, Date fechaEntregado, int status, int clientClientId) {
        this.requisitionId = requisitionId;
        this.fechaPagado = fechaPagado;
        this.fechaPreparado = fechaPreparado;
        this.fechaDespachado = fechaDespachado;
        this.fechaEntregado = fechaEntregado;
        this.status = status;
        this.clientClientId = clientClientId;
    }

    public OrderModel(){

    }
}
