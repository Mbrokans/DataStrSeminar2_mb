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
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
