package app;

public class Cuenta {
//atributos
    private String titular;
    private double cantidad = 0;
    final public double MAX_LIMITE = 1000; //CONSTANTE
    final public double PI = 3.14159; //CONSTANTE
//constructores
    public Cuenta (String titular)
    {//this.titular=titular;
    this(titular,0);}
    public Cuenta (String titular, double cantidad)
    {
        this.titular = titular;
        if (cantidad < 0) {
           this.cantidad = 0;
        } else {
            this.cantidad = cantidad;//se puede hacer if en los constructores
        }
    }
//metodos    
//getters y setters
    public String getTitular() {
        if(this.titular.equals("Pepe"))
        return this.titular + ("VIP");
        return titular;
    }
    public void setTitular(String titular) {
        if(titular.equals("Nadie"))
        return;
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    

    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;   
        }
    }
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
    public String toString(){
        return "Titular: "+ titular + "\n Cantidad depositada: " + cantidad;
      }
    }

