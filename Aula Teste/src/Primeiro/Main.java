package Primeiro;
import java.util.Scanner; // Importando a classe Scanner
import java.lang.Math;



class Mensagem_main{    //Cria��o de um m�todo do tipo void para printar a mensagem do Department 
	
	
	public static void mensagem()
	{
		System.out.println("Segundo o Department of Health and Human Services/National Institutes of Health a situa��o do seu IMC �: ");
	}
}


public class Main {
	
	
	public static void main(String [] args) {
		
		//Criando um objeto do tipo Scanner que passa como argumento o objeto System.in dentro construtor.
		Scanner in = new Scanner (System.in);
		
		
		//Pedindo informa��es ao usuario e coletando.
		System.out.println("Digite seu peso em quilogramas: ");
		double  peso = in.nextFloat();
		System.out.println("Digite sua altura em metros: ");
		double  metros = in.nextFloat();
		
		//Calculando o IMC.
		double result = peso/Math.pow(metros, 2);
		
		
		//Uma Estrutura de condi��es para indicar o IMC do usu�rio conforme o department e chamando o metodo para exibir a mensagem padr�o do Department.
		if(result < 18) {
			
			Mensagem_main.mensagem();
			System.out.println("Underweight");
			}
		else if (result > 18.5 && result < 24.9 ) {
			Mensagem_main.mensagem();
			System.out.println("Normal");
			
		}
		
		else if (result > 25 && result < 29.9 ) {
			Mensagem_main.mensagem();
			System.out.println("Overweight");
			
		}
		
		else {
			Mensagem_main.mensagem();
			System.out.println("Obese");
		}
		
		  // usando o format para exibir somente dois numeros depois da virgula.
	      System.out.format("%.2f",result);
		
		
	}
	
}
