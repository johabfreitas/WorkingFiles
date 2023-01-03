package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Bloco try-with-resources
 * FileReader e BufferedReader
 */
public class Exemplo4 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
	
		String path = "/tmp/out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
