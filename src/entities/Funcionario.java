package entities;

import java.util.List;

public class Funcionario extends Pessoa {

	private String cpf;
	private String matricula;
	private Double salario;
	private Setor setor; // (ASSOCIACAO TER-1 -> TODOS OS FUNCIONARIOS TEM 1 SETOR)
	private List<Funcao> funcoes; // (ASSOCIACAO TER-N -> TODOS OS FUNCIONARIOS PODEM TER 1-N FUNCOES)

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	// todo funcionario tem setor (1-1)
	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Funcao> getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(List<Funcao> funcoes) {
		this.funcoes = funcoes;
	}
}
