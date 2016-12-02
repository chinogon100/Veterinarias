package petapp.datos;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import petapp.modelo.TipoUsuario;
import petapp.modelo.Usuario;

@Stateless
public class TipoUsuarioDAO implements Serializable {
	
	@Inject
	private EntityManager em;
	
	public TipoUsuarioDAO() {

	}
	
	public TipoUsuario read(String codigo){
		return em.find(TipoUsuario.class, codigo);
	}
	
	public void insert(TipoUsuario tipoUsuario){
		em.persist(tipoUsuario);
	}
	
	public void update(TipoUsuario tipoUsuario){
		em.merge(tipoUsuario);//es un update	
		}
	
	public void remove(String codigo){
		
		TipoUsuario tipoUsuario = em.find(TipoUsuario.class, codigo);
		em.remove(tipoUsuario);
	}
	
	public void guardar(TipoUsuario tipoUsuario) {
		if (em.find(TipoUsuario.class, tipoUsuario.getCodigo()) == null) {
			insert(tipoUsuario);
		} else {
			update(tipoUsuario);
		}
	}
	
	public List<TipoUsuario> getTipoUsuarios() {
		String sql = "SELECT t FROM TipoUsuario t";
		Query query = em.createQuery(sql, TipoUsuario.class);
		return query.getResultList();
	}

	public List<Usuario> getUsuarios() {
		String sql = "SELECT u FROM Usuario u";
		Query query = em.createQuery(sql, Usuario.class);
		return query.getResultList();
	}

	public List<Usuario> getUsuariosTipoUsuario(int codigo) {
		String sql = "SELECT u FROM Usuario u where tipousuario='" + codigo + "'";
		Query query = em.createQuery(sql, Usuario.class);
		return query.getResultList();
	}

	public void eliminarUsuario(int codigo) {
		System.out.println("Eliminando Usuario...");
		Usuario usuario = em.find(Usuario.class, codigo);
		em.remove(usuario);
	}


	
}
