package Calculadorasim;

import java.util.Scanner;

public class Calc {
		
		public int som(int valor1, int valor2) {
	        return valor1 + valor2;
	    }  
	    public int sub(int valor1, int valor2){
	        return valor1 - valor2;
	    }  
	    public int div(int valor1,int valor2){
			return valor1 / valor2;
	    }  
	    public int mult(int valor1, int valor2){
	        return valor1 * valor2;
	    }  
		
	    public static void main (String args[]){ 
	      
	        Calc c = new Calc();  
		
	        int opcao = 4;  
	        int valor1;  
	        int valor2; 
	        
	        Scanner input = new Scanner(System.in);
	        System.out.println("-Escolha uma opção-");  
	        System.out.println("1. Soma");    
	        System.out.println("2. Subtracao");    
	        System.out.println("3. Multiplicacao");    
	        System.out.println("4. Divisao");    
	        System.out.println("Operação: "); 
		
	        opcao = input.nextInt();
	                
	        while (opcao != 0) {
				Scanner input1 = new Scanner(System.in);    
				
				System.out.println("Qual o primeiro numero: ");  
				valor1 = input1.nextInt();  
				System.out.println("Qual o segundo numero: ");  
				valor2 = input1.nextInt();
	        
	        if ( opcao == 1 ) {
				int operacao = c.som(valor1, valor2);
	            System.out.printf("\nO resultado da soma é: %d\n", operacao);  
	            break;  
	        }  
	        else if (opcao == 2) { 
				int operacao = c.sub(valor1, valor2);
				System.out.printf("\nO resultado da subtração é: %d\n", operacao);  
				break;  
			}  
			else if (opcao == 3) {
				int operacao = c.mult(valor1, valor2); 
				System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);    
				break;  
			}  
			else if (opcao == 4) {  
				int operacao = c.div(valor1, valor2);  
				System.out.printf("\nO resultado da divisão é: %d\n", operacao);   
				break;  
			}  
			else{  
				System.out.println("????");  
				break;  
			}
	        }
	    }
}
	    
	    
		
    