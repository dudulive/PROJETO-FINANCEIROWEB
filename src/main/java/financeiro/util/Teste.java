package financeiro.util;

import org.hibernate.Session;

public class Teste {

	public static void main(String[] args) {
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
