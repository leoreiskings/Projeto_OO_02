package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Funcao;
import entities.Funcionario;

public class FuncionarioRepository {

	// m�todo para gravar os dados do funcion�rio em arquivo
	public void exportarFuncionario(Funcionario funcionario) throws Exception {
		
		// definindo o nome do arquivo
		String nomeArquivo = "funcionario_" + funcionario.getId() + ".txt";
		
		// abrindo um arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter(new File("c:\\temp\\" + nomeArquivo));
		
		// escrevendo os dados do funcion�rio
		printWriter.write("\nID DO FUNCION�RIO....: " + funcionario.getId());
		printWriter.write("\nNOME DO FUNCION�RIO..: " + funcionario.getNome());
		printWriter.write("\nCPF..................: " + funcionario.getCpf());
		printWriter.write("\nMATRICULA............: " + funcionario.getMatricula());
		printWriter.write("\nSALARIO..............: " + funcionario.getSalario());
		printWriter.write("\nID DO SETOR..........: " + funcionario.getSetor().getId());
		printWriter.write("\nNOME DO SETOR........: " + funcionario.getSetor().getNome());
		
		for (Funcao funcao : funcionario.getFuncoes()) {
			printWriter.write("\nID DA FUN��O.........: " + funcao.getId());
			printWriter.write("\nDESCRI��O DA FUN��O..: " + funcao.getDescricao());
		}
		
		printWriter.flush(); // salvando o arquivo		
		printWriter.close(); // fechando o arquivo

	}

}
