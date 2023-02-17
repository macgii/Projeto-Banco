package conta;

import java.util.Scanner;

//import conta.util.Cores;

//import conta.model.Conta;

public class Menu {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		/*//criamos o objeto conta c1
		Conta c1 = new Conta(1, 123, 1, "Erica Araújo", 30000.0f);
		
		//visualizamos os dados da conta c1
		c1.visualizar();
		
		//alteramos o saldo da conta c1
		c1.setSaldo(35000.0f);
		
		//vizualizamos apenas o saldo da conta c1
		c1.getSaldo();
		System.out.println(c1.getSaldo());
		
		c1.sacar(1000.0f);
		
		System.out.println(c1.getSaldo());
		
		c1.depositar(10000.0f);
		c1.visualizar();*/
		
	
		int opcao;
		
		while(true) {
			
			System.out.println("**********************************************");
			System.out.println("                                              ");
			System.out.println("                  Gi's Bank                   ");
			System.out.println("                                              ");
			System.out.println("**********************************************");
			System.out.println("                                              ");
			System.out.println("     1 - Criar Conta                          ");
			System.out.println("     2 - Listar todas as Contas               ");
			System.out.println("     3 - Buscar conta por número              ");
			System.out.println("     4 - Atualizar dados da conta             ");
			System.out.println("     5 - Apagar Conta                         ");
			System.out.println("     6 - Sacar                                ");
			System.out.println("     7 - Depositar                            ");
			System.out.println("     8 - Transferir valores entre contas      ");
			System.out.println("     9 - Sair                                 ");
			System.out.println("                                              ");
			System.out.println("**********************************************");      
			System.out.println("Digite a opção desejada:                      ");
            System.out.println("                                              ");
            
            opcao = entrada.nextInt();
    		
    		if(opcao == 9) {
    			System.out.println("\nGi's Bank - O seu futuro começa aqui!");
    			System.exit(0);
    		}
    		
    		switch(opcao) {
    		case 1:
    			System.out.println("Criar conta\\n\\n");
    			break;
    		case 2:
    			System.out.println("Listar todas as contas\n\n");
    			break;
    		case 3:
    			System.out.println("Consultar dados da Conta - por número\n\n");    			
    			break;
    		case 4:
    			System.out.println("Atualizar dados da Conta\n\n");
    			break;
    		case 5:
    			System.out.println("Apagar a Conta\n\n");
    			break;
    		case 6:
    			System.out.println("Saque\n\n");
    			break;
    		case 7:
    			System.out.println("Depósito\n\n");
    			break;
    		case 8:
    			System.out.println("Transferência entre Contas\n\n");
    			break;
    		default:
    			System.out.println("\nOpção Inválida!\n");
    			break;
    		}
		}
		

	}

}
