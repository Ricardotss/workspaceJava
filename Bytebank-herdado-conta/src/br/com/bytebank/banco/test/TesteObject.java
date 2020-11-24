package br.com.bytebank.banco.test;

public class TesteObject {

	public static void main(String[] args) { 

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);
       
        Object cc = new ContaCorrente(22, 33);
        Object ContaPoupanca cp = new ContaPoupanca(33, 22);
        Object clientes2 = new Clientes2();
        
        
        System.out.println(cc);
        System.out.println(cp);
       
      //  println(cp);
	}

    static void println() {}
    static void println(int a) {}
    static void println(boolean valor) {}
    
    static void println( ) {}
    
       
}
