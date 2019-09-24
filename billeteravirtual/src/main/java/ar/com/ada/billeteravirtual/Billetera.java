package ar.com.ada.billeteravirtual;

import java.util.ArrayList;
import java.util.List;

/**
 * Billetera
 */
public class Billetera {

    public List<Cuenta> cuentas = new ArrayList<Cuenta>();
    private int billeteraId;

    public Billetera(List<Cuenta> cuentas, int billeteraId) {
        this.cuentas = cuentas;
        this.billeteraId = billeteraId;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public int getBilleteraId() {
        return billeteraId;
    }

    public void setBilleteraId(int billeteraId) {
        this.billeteraId = billeteraId;
    }

    
    
}