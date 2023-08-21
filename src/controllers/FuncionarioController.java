package controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entities.Funcao;
import entities.Funcionario;
import entities.Setor;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	// método para capturar os dados do funcionário
	public void cadastrarFuncionario() throws Exception {

		System.out.println("\n *** CADASTRO DE FUNCIONÁRIO *** \n");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// variável de instância (objeto)
		Funcionario funcionario = new Funcionario();

		funcionario.setSetor(new Setor()); // inicializando o vinculo de setor do funcionario.
											// Criando uma nova instancia do objeto setor dentro do obj funcionario

		funcionario.setFuncoes(new ArrayList<Funcao>()); // inicializando o vinculo de funcoes do funcionario.

		System.out.print("Informe o id do funcionário.........: ");
		funcionario.setId(Integer.parseInt(scanner.nextLine()));

		System.out.print("Informe o nome do funcionário.......: ");
		funcionario.setNome(scanner.nextLine());

		System.out.print("Informe o CPF do funcionário........: ");
		funcionario.setCpf(scanner.nextLine());

		System.out.print("Informe a matrícula do funcionário..: ");
		funcionario.setMatricula(scanner.nextLine());

		System.out.print("Informe o salário do funcionário....: ");
		funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

		System.out.print("Informe o id do setor..............: ");
		funcionario.getSetor().setId(Integer.parseInt(scanner.nextLine()));

		System.out.print("Informe o nome do setor...........: ");
		funcionario.getSetor().setNome(scanner.nextLine());
		// navegando pelo obj setor 'getSetor()' e jogando valor
		// para o nome do setor 'setNome()'
		// primeiro nos alocamos memoria para o obj Setor dentro do
		// Funcionario que tem esse relacionamento
		// modelado na classe Funcionario. Lá vemos a relação
		// 1-FUNCIONARIO TEM 1-SETOR

		System.out.print("Informe o número de funções.......: ");
		Integer qtdFuncoes = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < qtdFuncoes; i++) {
			
			// variável de instância / objeto
			Funcao funcao = new Funcao();
			
			System.out.print("Informe o id da função..............: ");
			funcao.setId(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("Informe a descrição da função.......: ");
			funcao.setDescricao(scanner.nextLine());
			
			//adicionar a função para o funcionário
			funcionario.getFuncoes().add(funcao);
		}

		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();

		funcionarioRepository.exportarFuncionario(funcionario);

		System.out.println("\nDados Exportados com Sucesso!");

	}

}
