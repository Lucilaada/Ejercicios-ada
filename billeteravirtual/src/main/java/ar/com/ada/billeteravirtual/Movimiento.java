package ar.com.ada.billeteravirtual;

import java.util.Date;

/**
 * Movimiento
 */
public class Movimiento {

    private Date fechaMovimiento;
    private float ubicacion;
    private String tipoOperacion;
    private String conceptoOperacion;
    private String detalle;
    private Integer estado;
    private int idMovimiento;


    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public float getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(float ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getConceptoOperacion() {
        return conceptoOperacion;
    }

    public void setConceptoOperacion(String conceptoOperacion) {
        this.conceptoOperacion = conceptoOperacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Movimiento(Date fechaMovimiento, float ubicacion, String tipoOperacion, String conceptoOperacion,
            String detalle, Integer estado, int idMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
        this.ubicacion = ubicacion;
        this.tipoOperacion = tipoOperacion;
        this.conceptoOperacion = conceptoOperacion;
        this.detalle = detalle;
        this.estado = estado;
        this.idMovimiento = idMovimiento;
    }

}