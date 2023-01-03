package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Lendo arquivo text com classes File e Scanner
 */
public class Exemplo1 {

	public static void main(String[] args) {

		File file = new File("/tmp/in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
