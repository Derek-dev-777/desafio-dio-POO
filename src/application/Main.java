package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso JS");
		curso1.setDescricao("Descrição curso js");
		curso1.setCargaHoraria(4);
		
		Curso curso2 = new Curso();
		curso1.setTitulo("Curso Python");
		curso1.setDescricao("Descrição curso python");
		curso1.setCargaHoraria(5);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setDate(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Descrição");
		bootcamp.getConteudos().add(curso1);	
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devDerek = new Dev();
		devDerek.setNome("Derek Meneghel");
		devDerek.increverBootcamp(bootcamp);
		devDerek.progredir();
		
		Dev devVitoria = new Dev();
		devVitoria.setNome("Vitoria Pazzini");
		devVitoria.increverBootcamp(bootcamp);
		devVitoria.progredir();
	}

}
