package petapp.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Veterinaria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String direccion;
	
	private String sitioWeb;
	private byte[] imagen;
	
	@NotNull
	private String horario;
	
	@OneToMany
	@JoinColumn(name="veterinaria")
	private List<VeterinariaUsuario> veterinariaUsuarios;
	
	@OneToMany
	@JoinColumn(name="veterinaria")
	private List<VeterinariaMascota> veterinariaMascotas;
	
	@OneToMany
	@JoinColumn(name="veterinaria")
	private List<Valoracion> valoraciones;
	
	@OneToMany
	@JoinColumn(name="veterinaria")
	private List<Comentario> comentarios;
	
	@OneToMany
	@JoinColumn(name="veterinaria")
	private List<Telefono> telefonos;

	
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public List<VeterinariaUsuario> getVeterinariaUsuarios() {
		return veterinariaUsuarios;
	}

	public void setVeterinariaUsuarios(List<VeterinariaUsuario> veterinariaUsuarios) {
		this.veterinariaUsuarios = veterinariaUsuarios;
	}

	public List<VeterinariaMascota> getVeterinariaMascotas() {
		return veterinariaMascotas;
	}

	public void setVeterinariaMascotas(List<VeterinariaMascota> veterinariaMascotas) {
		this.veterinariaMascotas = veterinariaMascotas;
	}

	public List<Valoracion> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(List<Valoracion> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	

}
