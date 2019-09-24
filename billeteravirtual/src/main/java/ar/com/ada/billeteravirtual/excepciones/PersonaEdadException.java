package ar.com.ada.billeteravirtual.excepciones;

import ar.com.ada.billeteravirtual.Persona;

/**
 * personaEdadException
 */
public class PersonaEdadException extends PersonaInfoException{
    public PersonaEdadException(Persona p, String mensaje) {
        super(p, mensaje);
        // TODO Auto-generated constructor stub
    }

    
}