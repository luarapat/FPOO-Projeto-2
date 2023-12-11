package br.org.sesisp.view;

import java.sql.Connection;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import br.org.sesisp.controller.Conexao;
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

	public static void main(String[] args) {
		//instanciar um objeto da classe crudDAO
		CrudDAO inserir_aluno = new CrudDAO();
		//instanciar um objeto aluno
		Aluno aluno1 = new Aluno();
		int escolhas;
		/*aluno1.setNome("Jose");
		aluno1.setIdade(17);
		inserir_aluno.create(aluno1);
		System.out.println("Nome: "+ aluno1.getNome()+ "\nIdade: "+aluno1.getIdade());
		//************************************************
		//atualizar valores 
		aluno1.setNome("Marcelo Vieira");
		aluno1.setIdade(18);
		aluno1.setRa(1);
		inserir_aluno.update(aluno1);
		System.out.println("Nome: "+ aluno1.getNome()+ "\nIdade: "+aluno1.getIdade());
		//*************************************************
		//ler tabela alunos do BD
		System.out.println("lendo a lista...");
		for(Aluno olho : inserir_aluno.read()) {
			System.out.println("Dados do aluno: "+ olho.getRa() 
			+ olho.getNome() + olho.getIdade());
	
		}
	//*********************************************8
	//excluir dados
	CrudDAO remover_aluno = new CrudDAO();
	remover_aluno.delete(2);
*/
	//escolher opções do crud
		do {
	Scanner entrada = new Scanner (System.in);
	System.out.println("O que deseja realizar?" + 
	"\n 1-CREATE \n 2-UPDATE \n 3-READ \n 4-DELETE");
	 escolhas = entrada.nextInt();
    switch (escolhas) {

    case 1:
    	System.out.println("Digite o nome e a idade do aluno para criar:");
    	aluno1.setNome(entrada.next());
		aluno1.setIdade(entrada.nextInt());
		inserir_aluno.create(aluno1);
		System.out.println("Nome: "+ aluno1.getNome()+ "\nIdade: "+aluno1.getIdade());
    break;
    case 2:
    	System.out.println("Digite o numero do RA que você deseja atualizar:");
    	aluno1.setRa(entrada.nextInt());
    	aluno1.getRa();
    	System.out.println("Digite nome e idade novos:");
    	aluno1.setNome(entrada.next());
		aluno1.setIdade(entrada.nextInt());
		System.out.println("Dados atualizados com sucesso!");
		inserir_aluno.update(aluno1);
		
		break;
    case 3:
    	System.out.println("lendo a lista...");
		for(Aluno olho : inserir_aluno.read()) {
			System.out.println("Dados do aluno: "+ olho.getRa() 
			+ olho.getNome() + olho.getIdade());}
		break;
    case 4:
    	CrudDAO remover_aluno = new CrudDAO();
		System.out.println("Digite o RA do aluno para deletar: ");
		int ra = entrada.nextInt();
		aluno1.setRa(ra);
		remover_aluno.delete(ra);
		break;
	}
 }  while (escolhas != 4);   
		
}
}




