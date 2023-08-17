package principal;

import controllers.FuncionarioController;

public class Program {

	public static void main(String[] args) {
		
		try {

			FuncionarioController funcionarioController = new FuncionarioController();
			
			funcionarioController.cadastrarFuncionario();
			
			
			
			
			
			
		} catch (Exception e) {
			
			System.out.println("\nOcorreu um erro! " + e.getMessage());
			
			//imprimindo o log do erro
			e.printStackTrace();
			
			
		}
		
		
	}
	
	
}

