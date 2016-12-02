package petapp.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Mascota implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	@NotNull
	private String nombre;
	
	private int edad;
	
	@NotNull
	private String genero;
	
	private Date fechaNacimiento;
	
	@ManyToOne
	@JoinColumn(name="raza")
	private Raza raza;
	
	@ManyToOne
	@JoinColumn(name="tipoMascota")
	private TipoMascota tipoMascota;
	
	@OneToMany
	@JoinColumn(name="mascota")
	private List<Diagnostico> diagnosticos;
	
	@OneToMany
	@JoinColumn(name="mascota")
	private List<VeterinariaMascota> veterinariaMascotas;
	

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public TipoMascota getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(TipoMascota tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public List<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

	public List<VeterinariaMascota> getVeterinariaMascotas() {
		return veterinariaMascotas;
	}

	public void setVeterinariaMascotas(List<VeterinariaMascota> veterinariaMascotas) {
		this.veterinariaMascotas = veterinariaMascotas;
	}
	

		

}
