package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Funcao;
import entities.Funcionario;

public class FuncionarioRepository {

	// método para gravar os dados do funcionário em arquivo
	public void exportarFuncionario(Funcionario funcionario) throws Exception {
		
		// definindo o nome do arquivo
		String nomeArquivo = "funcionario_" + funcionario.getId() + ".txt";
		
		// abrindo um arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter(new File("c:\\temp\\" + nomeArquivo));
		
		// escrevendo os dados do funcionário
		printWriter.write("\nID DO FUNCIONÁRIO....: " + funcionario.getId());
		printWriter.write("\nNOME DO FUNCIONÁRIO..: " + funcionario.getNome());
		printWriter.write("\nCPF..................: " + funcionario.getCpf());
		printWriter.write("\nMATRICULA............: " + funcionario.getMatricula());
		printWriter.write("\nSALARIO..............: " + funcionario.getSalario());
		printWriter.write("\nID DO SETOR..........: " + funcionario.getSetor().getId());
		printWriter.write("\nNOME DO SETOR........: " + funcionario.getSetor().getNome());
		
		for (Funcao funcao : funcionario.getFuncoes()) {
			printWriter.write("\nID DA FUNÇÃO.........: " + funcao.getId());
			printWriter.write("\nDESCRIÇÃO DA FUNÇÃO..: " + funcao.getDescricao());
		}
		
		printWriter.flush(); // salvando o arquivo		
		printWriter.close(); // fechando o arquivo

	}

}
