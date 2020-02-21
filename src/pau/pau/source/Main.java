package pau.pau.source;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book book = new Book(123, 2000, 200, 110, "Angels", "Tom", "pubhouse1", "solid");
		Book book1 = new Book(124, 2001, 210, 120, "Demons", "Bob", "pubhouse2", "soft");
		Book book2 = new Book(125, 2002, 220, 130, "God", "Jim", "pubhouse3", "solid");
		Book book3 = new Book(126, 2003, 230, 140, "Satan", "Mark", "pubhouse4", "soft");
		Book book4 = new Book(127, 2004, 240, 150, "Paradise", "Joe", "pubhouse5", "solid");
		Book[] myBooks = new Book[5];
		myBooks[0] = book;
		myBooks[1] = book1;
		myBooks[2] = book2;
		myBooks[3] = book3;
		myBooks[4] = book4;
		
		System.out.print("¬ведите им€ автора: ");
		String authorName = scan.next();
		for (Book myBook : myBooks) {
			if (myBook.getAuthor().equals(authorName)) {
				System.out.println(myBook);
			}
		}
		
		System.out.print("¬ведите название издательства: ");
		String publishingHouse = scan.next();
		for (Book myBook : myBooks) {
			if (myBook.getPublishingHouse().equals(publishingHouse)) {
				System.out.println(myBook);
			}
		}
		
		System.out.print(" ниги, выпущенные после заданного года: ");
		int year = scan.nextInt();
		for (Book myBook : myBooks) {
			if (myBook.getYear() >= year) {
				System.out.println(myBook);
			}
		}
	}
}
