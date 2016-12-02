package petapp.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;



@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String correo;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	@OneToMany
	@JoinColumn(name="usuario")
	private List<Telefono> telefonos;
	
	@OneToMany
	@JoinColumn(name="usuario")
	private List<Comentario> comentarios;

	@OneToMany
	@JoinColumn(name="usuario")
	private List<Valoracion> valoraciones;
	
	@OneToMany
	@JoinColumn(name="usuario")
	private List<VeterinariaUsuario> veteUsuarios;
	
	@OneToMany
	@JoinColumn(name="medico")
	private List<Diagnostico> diagVeterinarios;
	
	@OneToMany
	@JoinColumn(name="usuario")
	private List<Diagnostico> diagUsuarios;
	
	@OneToMany
	@JoinColumn(name="usuario")
	private List<Mascota> mascotas;

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public List<Valoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public List<VeterinariaUsuario> getVeteUsuarios() {
		return veteUsuarios;
	}

	public void setVeteUsuarios(List<VeterinariaUsuario> veteUsuarios) {
		this.veteUsuarios = veteUsuarios;
	}

	public List<Diagnostico> getDiagVeterinarios() {
		return diagVeterinarios;
	}

	public void setDiagVeterinarios(List<Diagnostico> diagVeterinarios) {
		this.diagVeterinarios = diagVeterinarios;
	}

	public List<Diagnostico> getDiagUsuarios() {
		return diagUsuarios;
	}

	public void setDiagUsuarios(List<Diagnostico> diagUsuarios) {
		this.diagUsuarios = diagUsuarios;
	}

	public List<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	

}
