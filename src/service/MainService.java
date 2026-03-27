package service;

import dataStr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList symbols = new MyLinkedList();
		
		try {
			symbols.add('B');
			symbols.add('A');
			symbols.add('C');
			symbols.print(); // B A C
			System.out.println("Pievienot elemntu sakuma");
			symbols.add('Z',0); // Z B A C
			symbols.print();
			System.out.println("Pievienot elementu beigas");
			symbols.add('W', 4); // Z B A C W
			symbols.print();
			System.out.println("Pievienot elementu pa vidu");
			symbols.add('K',2); // Z B K A C W
			symbols.print();
			System.out.println();
			System.out.println("Izdzesam elementu no sakuma");
			symbols.remove(0); // B K A C W
			symbols.print();
			System.out.println("Izdzesam elemntu no beigam");
			symbols.remove(4); // B K A C
			symbols.print();
			System.out.println("izdzesam kadu elementu pa vidu");
			symbols.remove(1);
			symbols.print();
			System.out.println("Izgūt elementu no 2 pozīcijas");
			System.out.println("2.pozīcijas element ir " + symbols.get(2));
			System.out.println("Atarst K elementa poziciju");
			System.out.println(symbols.search('K'));
			
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
