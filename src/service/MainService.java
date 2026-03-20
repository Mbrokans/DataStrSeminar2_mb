package service;

import dataStr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList symbols = new MyLinkedList();
		
		try {
			symbols.add('B');
			symbols.add('A');
			symbols.add('C');
			symbols.print();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
