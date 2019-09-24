package ar.com.ada.billeteravirtual;

import javax.persistence.*;

/**
 * Persona
 */
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @Column(name = "persona_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pesonaId;
    private String nombre;
    private String dni;
    private int edad;
    private String email;
    private Usuario usuario;
    private int billeteraId;


    public Persona() {
    }

    public int getPersonaId() {
        return pesonaId;
    }

    public void setPersonaId(int pesonaId) {
        this.pesonaId = pesonaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + "]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.usuario.setPersona(this); //Vinculamos ambos objetos entre si
    }
    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    public int getPesonaId() {
        return pesonaId;
    }

    public void setPesonaId(int pesonaId) {
        this.pesonaId = pesonaId;
    }

    public int getBilleteraId() {
        return billeteraId;
    }

    public void setBilleteraId(int billeteraId) {
        this.billeteraId = billeteraId;
    }

    public Persona(int pesonaId, String nombre, String dni, int edad, String email, Usuario usuario, int billeteraId) {
        this.pesonaId = pesonaId;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.email = email;
        this.usuario = usuario;
        this.billeteraId = billeteraId;
    }

}