package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�¹���", "������"));
		library.add(new Book("�¹���", "������"));
		
		for(int i =0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
		

	}

}
