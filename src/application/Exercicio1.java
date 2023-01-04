package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String[] line = br.readLine().split(",");

			for (int i = 0; i < line.length; i++) {
				line = br.readLine().split(",");
				Product product = new Product();
				product.setName(line[0]);
				product.setPrice(Double.parseDouble(line[1]));
				product.setQuantity(Integer.parseInt(line[2]));

//				System.out.println(
//						product.getName() + ", " + product.finalPrice(product.getPrice(), product.getQuantity()));
				BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
				bw.write(product.getName() + ", " + product.finalPrice(product.getPrice(), product.getQuantity()));
				bw.newLine();
				bw.close();
//				try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
//					for (String lines : line) {
//						bw.write(lines);
//						bw.newLine();
//					}
//				} catch (IOException e) {
//					e.printStackTrace();
//				}

			}
			/*
			 * while (line != null) { line = br.readLine().split(","); Product product = new
			 * Product(); product.setName(line[0]);
			 * product.setPrice(Double.parseDouble(line[1]));
			 * product.setQuantity(Integer.parseInt(line[2]));
			 * 
			 * System.out.println( product.getName() + ", " +
			 * product.finalPrice(product.getPrice(), product.getQuantity()));
			 * 
			 * }
			 */
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
