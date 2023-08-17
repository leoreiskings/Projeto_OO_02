package controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	// m�todo para capturar os dados do funcion�rio
	public void cadastrarFuncionario() throws Exception {

		System.out.println("\n *** CADASTRO DE FUNCION�RIO *** \n");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// vari�vel de inst�ncia (objeto)
		Funcionario funcionario = new Funcionario();

		funcionario.setSetor(new Setor()); // inicializando o vinculo de setor do funcionario.
																		 // Criando uma nova instancia do objeto setor dentro do obj funcionario

		funcionario.setFuncoes(new ArrayList<Funcao>()); // inicializando o vinculo de funcoes do funcionario.		
		
		System.out.print("Informe o id do funcion�rio.........: ");
		funcionario.setId(Integer.parseInt(scanner.nextLine()));

		System.out.print("Informe o nome do funcion�rio.......: ");
		funcionario.setNome(scanner.nextLine());

		System.out.print("Informe o CPF do funcion�rio........: ");
		funcionario.setCpf(scanner.nextLine());

		System.out.print("Informe a matr�cula do funcion�rio..: ");
		funcionario.setMatricula(scanner.nextLine());

		System.out.print("Informe o sal�rio do funcion�rio....: ");
		funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

		System.out.println("Informe o Id do Setor do Funcionario: ");
		funcionario.getSetor().setId(Integer.parseInt(scanner.nextLine()));

		System.out.println("Informe o Nome do Setor do Funcionario: ");
		funcionario.getSetor().setNome(scanner.nextLine()); // navegando pelo obj setor 'getSetor()' e jogando valor
															// para o nome do setor 'setNome()'
															// primeiro nos alocamos memoria para o obj Setor dentro do
															// Funcionario que tem esse relacionamento
															// modelado na classe Funcionario. L� vemos a rela��o
															// 1-FUNCIONARIO TEM 1-SETOR

		System.out.print("Informe o n�mero de fun��es.......: ");
		Integer qtdFuncoes = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < qtdFuncoes; i++) {
			
			//cria um novo obj funcao a cada passada do "for"
			Funcao funcao = new Funcao(); 
			
			System.out.println("Informe o ID da Funcao: ");
			funcao.setId(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("Informe o Descricao da Funcao: ");
			funcao.setDescricao(scanner.nextLine());
			
			funcionario.getFuncoes().add(funcao);			
			
		}
		
		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
		
		funcionarioRepository.exportarFuncionario(funcionario);
		
		System.out.println("\nDados Exportados com Sucesso!");	

	}

}
