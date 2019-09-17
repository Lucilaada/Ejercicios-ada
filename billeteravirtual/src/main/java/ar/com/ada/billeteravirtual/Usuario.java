package ar.com.ada.billeteravirtual;
import javax.persistence.*;


/**
 * Usuario
 */
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioID;
    private String username;
    private String contrasenia;
    private String email;
    @Column(name = "persona_id")
    private int personaID;

    public Usuario(int usuarioID, String username, String contrasenia, String email, int personaID) {
        this.usuarioID = usuarioID;
        this.username = username;
        this.contrasenia = contrasenia;
        this.email = email;
        this.personaID = personaID;
    }
    

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario() {
    }


	public int getPersonaID() {
		return personaID;
	}


	public void setPersonaID(int personaID) {
		this.personaID = personaID;
	}

}