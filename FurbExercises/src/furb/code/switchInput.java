package furb.code;

import javax.swing.JOptionPane;

public class switchInput {
	public static void main(String[] args) 
	 {/* Este programa serve para ensinar algums operações matemáticas básicas 
	     para crianças */
		
 	    int numero,opcao,aux,giro;
	    String entra;
	    for(giro = 1; giro <= 5; giro = giro +1)
	       {entra = JOptionPane.showInputDialog("SISTEMA OPERACOES MATEMATICAS"+
                   				    "\n\n\t1. DOBRO\n\t2. QUADRADO"+
 						    "\n\t3. TRIPLO\n\t4. CUBO\n\n\tQUAL A OPERACAO VOCE QUER APRENDER ");
	        opcao  = Integer.parseInt(entra);
	        numero = 0;
	        if (opcao <= 4)
	       	     {entra = JOptionPane.showInputDialog("AGORA INFORME UM NUMERO");
	              numero = Integer.parseInt(entra);
	       	     } 
	       	switch (opcao)
	       		{case 1: aux = numero * 2;
	       			 System.out.println("DOBRO DE "+numero+" = "+aux);
	       			 break;
	       		 case 2: aux = numero * numero;
	       		         System.out.println("QUADRADO DE "+numero+" = "+aux);
	       		         break;
	       		 case 3: aux = numero * 3;
	       			 System.out.println("TRIPLO DE "+numero+" = "+aux);
	       			 break;
	       		 case 4: aux = numero * numero * numero;
	       			 System.out.println("CUBO DE "+numero+" = "+aux);
	       			 break;
	       		 default: System.out.println("OPCAO INVALIDA"); 		 
	       		}
	       }
	    System.out.println("OBRIGADO POR USAR O SISMIM - SISTEMA FEITO POR MIM  :-) ");
	 }
    }



