package ar.com.ada.billeteravirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Cuenta
 */
public class Cuenta {
    private String moneda;
    private int saldo;
    private int saldoDisponible;
    private int dineroDisponible;
    private List<Movimiento> movimientos = new ArrayList<Movimiento>();
    private int cuentaId;



    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(int dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setCuentas(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public Cuenta(String moneda, int saldo, int saldoDisponible, int dineroDisponible, List<Movimiento> movimientos,
            int cuentaId) {
        this.moneda = moneda;
        this.saldo = saldo;
        this.saldoDisponible = saldoDisponible;
        this.dineroDisponible = dineroDisponible;
        this.movimientos = movimientos;
        this.cuentaId = cuentaId;
    }

    

    
}