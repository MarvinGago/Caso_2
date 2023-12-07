/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_2;

import java.lang.reflect.Constructor;

/**
 *
 * @author CPUw1010
 */
public class Movimiento {
    
    String deudor;
    String acreedor;
    double monto;
    String cuenta;
    String descripcion;
    String participante;
    String quienPago;
    double montoTotal;
    String moneda;

    public Movimiento(String deudor, String acreedor, double monto, String cuenta, String descripcion, String participante, String quienPago, double montoTotal, String moneda) {
        this.deudor = deudor;
        this.acreedor = acreedor;
        this.monto = monto;
        this.cuenta = cuenta;
        this.descripcion = descripcion;
        this.participante = participante;
        this.quienPago = quienPago;
        this.montoTotal = montoTotal;
        this.moneda = moneda;
    }

    public String getDeudor() {
        return deudor;
    }

    public void setDeudor(String deudor) {
        this.deudor = deudor;
    }

    public String getAcreedor() {
        return acreedor;
    }

    public void setAcreedor(String acreedor) {
        this.acreedor = acreedor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getQuienPago() {
        return quienPago;
    }

    public void setQuienPago(String quienPago) {
        this.quienPago = quienPago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

  

   
    
    
  


    
}
