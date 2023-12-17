package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		int number = scan.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.println("Common, used or imported (c/u/i) ?");
			char option = scan.next().charAt(0);

			System.out.println("Name: ");
			String name = scan.next();

			System.out.println("Price: ");
			Double price = scan.nextDouble();

			if (option == 'c') {

				list.add(new Product(name, price));

			} else if (option == 'u') {
				System.out.println("Manufatrure date (DD/MM/YYYY): ");
				String ManufactureDate = scan.next();
				list.add(new UsedProduct(name, price, ManufactureDate));

			} else {
				System.out.println("Customs fee: ");
				Double CustomsFee = scan.nextDouble();
				list.add(new ImportedProduct(name, price, CustomsFee));
			}

		}

		System.out.println("PRICES TAGS: ");
		for (Product product : list) {
			System.out.println(product.priceTag());

		}

		scan.close();
	}

}
