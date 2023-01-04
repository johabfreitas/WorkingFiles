package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		//Product product = new Product();
		
		System.out.println("Enter file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String[] line = br.readLine().split(",");

			while (line != null) {
				//System.out.println(Arrays.toString(line));				
				line = br.readLine().split(",");
				String name = line[0];
				double price = Double.parseDouble(line[1]);
				int quantity = Integer.parseInt(line[2]);
				
				Product product = new Product(name, price, quantity);
				list.add(product);
				System.out.println(product);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
