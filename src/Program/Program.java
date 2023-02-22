package Program;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import objects.Alumni;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Set<Alumni> cursoA = new HashSet<>();
		Set<Alumni> cursoB = new HashSet<>();
		Set<Alumni> cursoC = new HashSet<>();
		Set<Alumni> alunoTot = new HashSet<>();

		boolean resp = true;

		System.out.println("Portal Cursos Online!");
		while (resp == true) {
			System.out.println();
			System.out.println("Informe o seu nome e seu ID para se registrar!");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("ID: ");
			Integer id = sc.nextInt();

			Alumni aluno = new Alumni(name, id);
			alunoTot.add(aluno);

			System.out.println("Temos 3 cursos disponiveis! Os cursos A, B ou C!");
			System.out.print(
					"Escolha o curso que deseja fazer, lembrando que pode \nescolher todos o cursos de uma vez! ");

			String cursos = sc.next().toUpperCase();
			String[] curso = cursos.split(" ");

			for (int i = 0; i < curso.length; i++) {

				switch (curso[i]) {
				case "A":
					cursoA.add(aluno);
					break;
				case "B":
					cursoB.add(aluno);
					break;
				case "C":
					cursoC.add(aluno);
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}

			}
			System.out.println("Gostaria de registrar outro aluno?[S/N] ");
			String continuar = sc.next().toUpperCase();
			if (continuar.contains("N")) {
				resp = !resp;
			}

		}
		System.out.println("Alunos matriculados no curso A:");
		for (Alumni a : cursoA) {
			System.out.println(a.getId());
		}
		System.out.println("Alunos matriculados no curso B:");
		for (Alumni a : cursoB) {
			System.out.println(a.getId());
		}
		System.out.println("Alunos matriculados no curso A:");
		for (Alumni a : cursoC) {
			System.out.println(a.getId());
		}
		System.out.println("Total students: " + alunoTot.size());

		sc.close();

	}

}
