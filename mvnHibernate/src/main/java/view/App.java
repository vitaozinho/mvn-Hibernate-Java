
package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Alunos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Alunos alunos = new Alunos();
    	
    	alunos.setId_aluno(1);
    	alunos.setNome("Vitor");
    	alunos.setEndereco("R Jeticarana");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//session.save(alunos);
		//session.update(alunos);
		//session.remove(alunos);
		session.getTransaction().commit();

    }
}