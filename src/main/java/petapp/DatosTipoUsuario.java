package petapp;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import petapp.datos.TipoUsuarioDAO;
import petapp.modelo.TipoUsuario;
import petapp.modelo.Usuario;

@ManagedBean(name="tipo_usuario_bean")
@SessionScoped
public class DatosTipoUsuario {

	private TipoUsuario newTipoUsuario;
	private int codigo;
	private String tipo;
	private List<TipoUsuario> listaTipoUsuarios = null;
	private List<Usuario> listaUsuarios;
	
	@PostConstruct
	public void init() {
		tipoLOG.log(Level.INFO, "INICIANDO...");
		newTipoUsuario = new TipoUsuario();
	}

	@Inject
	private TipoUsuarioDAO tipusdao;
	@Inject
	private Logger tipoLOG;

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public TipoUsuario getNewTipoUsuario() {
		return newTipoUsuario;
	}
	public void setNewTipoUsuario(TipoUsuario newTipoUsuario) {
		this.newTipoUsuario = newTipoUsuario;
	}
	public List<TipoUsuario> getListaTipoUsuarios() {
		return listaTipoUsuarios;
	}
	public void setListaTipoUsuarios(List<TipoUsuario> listaTipoUsuarios) {
		this.listaTipoUsuarios = listaTipoUsuarios;
	}
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public TipoUsuarioDAO getTipusdao() {
		return tipusdao;
	}
	public void setTipusdao(TipoUsuarioDAO tipusdao) {
		this.tipusdao = tipusdao;
	}
	public Logger getTipoLOG() {
		return tipoLOG;
	}
	public void setTipoLOG(Logger tipoLOG) {
		this.tipoLOG = tipoLOG;
	}
	public String guardar() {
		tipusdao.guardar(newTipoUsuario);
		List<TipoUsuario> aux_lista_tipo = tipusdao.getTipoUsuarios();
		for (TipoUsuario tipo : aux_lista_tipo) {
			tipoLOG.log(Level.INFO, tipo.toString());
		}
		init();
		return null;
	}
	
	public String agregarUsuario() {
		newTipoUsuario.getListaUsuarios().add(new Usuario());
		return null;
	}

	public String eliminaUsuario(int codigo) {
		tipusdao.eliminarUsuario(codigo);
		return null;
	}
    
	public String borraVistaUsuario(Usuario usr) {
		newTipoUsuario.getListaUsuarios().remove(usr);
		return null;
	}

	
	
	
}
