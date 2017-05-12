package financeiro.util;

import financeiro.categoria.CategoriaDAOHibernate;
import financeiro.conta.ContaDAO;
import financeiro.conta.ContaDAOHibernate;
import financeiro.usuario.UsuarioDAO;
import financeiro.usuario.UsuarioDAOHibernate;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO(){
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(ConnectionFactory.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
	
	public static ContaDAO criarContaDAO() {
		ContaDAOHibernate contaDAO = new ContaDAOHibernate();
		contaDAO.setSession(ConnectionFactory.getSessionFactory().getCurrentSession());
		return contaDAO;
	}
	
	public static CategoriaDAOHibernate criarCategoriaDAO() {
		CategoriaDAOHibernate categoriaDAOHibernate = new CategoriaDAOHibernate();
		categoriaDAOHibernate.setSession(ConnectionFactory.getSessionFactory().getCurrentSession());
		return categoriaDAOHibernate;
	}

}
