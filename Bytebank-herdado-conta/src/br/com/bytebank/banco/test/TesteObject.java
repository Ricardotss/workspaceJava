package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Clientes2;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) { 

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);
       
        Object cc = new ContaCorrente(22, 33);
        Object clientes2 = new Clientes2();
        
        
        System.out.println(cc);
        char[] cp = null;
		System.out.println(cp);
       
      //  println(cp);
	}

    static void println() {}
    static void println(int a) {}
    static void println(boolean valor) {}
    
    static void println( ) ; {}
    
       
}
