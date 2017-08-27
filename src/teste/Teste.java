package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Doador;

public class Teste {
	
	public static void main(String[] args) {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("doasangue");
		EntityManager manager = fac.createEntityManager();
		
		Doador doador = new Doador();
		doador.setLogin("doador_test");
		doador.setSenha("1234");
		doador.setTipoSanguineo("O");
		
		manager.getTransaction().begin();
		manager.persist(doador);
		manager.getTransaction().commit();
		manager.close();
		
	}
}
