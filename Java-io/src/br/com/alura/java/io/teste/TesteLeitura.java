package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.channels.FileLockInterruptionException;

public class TesteLeitura {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis= new FileInputStream("Air.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		
	}

}
