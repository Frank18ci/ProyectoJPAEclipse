package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListaCursos {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoEscuela");
		EntityManager em = emf.createEntityManager();
		
		List<Curso> cursos = em.createQuery("select c from Curso c", Curso.class).getResultList();
		for (Curso curso : cursos) {
			System.out.println(curso.getNombre());
		}
		//Comentario
		
		System.out.println("HOla Personas");
		System.out.println("T quiero");
	}

}
