package financeiro.teste;

import org.hibernate.Session;
import org.junit.Test;

import financeiro.util.ConnectionFactory;

public class ConexaoTeste {

	@Test
	public void test() {
		// TODO Auto-generated method stub
		Session session = null;
					try {
						session = ConnectionFactory.getSessionFactory().openSession();
						session.getSessionFactory().getCurrentSession().beginTransaction();
						session.getSessionFactory().getCurrentSession().getTransaction().commit();
						session.getSessionFactory().getCurrentSession().close();
						System.out.println("Sucesso");
					} catch (Exception e){
						System.out.println("Erro: " + e.getMessage() );
					} finally{
						session.close();
					}
	}

}
