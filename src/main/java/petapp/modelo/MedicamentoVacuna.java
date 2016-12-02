package petapp.modelo;

import java.io.Serializable;
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
public class MedicamentoVacuna implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	@NotNull
	private String descripcion;
	
	@NotNull
	private String dosis;
	
	@ManyToOne
	@JoinColumn(name="tipoMedVac")
	private TipoMedicamentoVacuna tipoMedicamentoVacuna;
	
	@OneToMany
	@JoinColumn(name="MedicamentoVacuna")
	private List<Diagnostico> diagnosticos;

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public TipoMedicamentoVacuna getTipoMedicamentoVacuna() {
		return tipoMedicamentoVacuna;
	}

	public void setTipoMedicamentoVacuna(TipoMedicamentoVacuna tipoMedicamentoVacuna) {
		this.tipoMedicamentoVacuna = tipoMedicamentoVacuna;
	}

	public List<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	} 
	
		
	

}
