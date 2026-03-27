package service;

import dataStr.MyLinkedList;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList<Character> symbols = new MyLinkedList<Character>();
		
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
			System.out.println("Iztuksos sarakstu un pec tam pievienot jaunu elemntu");
			symbols.makeEmpty();
			symbols.add('Q');
			symbols.print();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------------STUDENTI------------");
		MyLinkedList<Student> allStudents = new MyLinkedList<Student>();
			
		try
		{
			allStudents.add(new Student("Janis", "Berzins"));//Janis
			Student s1 = new Student("Baiba", "Jauka");
			allStudents.add(s1);//Janis Baiba
			allStudents.add(new Student("Peteris", "Nejaukais"), 0);//Peteris Janis Baiba
			allStudents.print();//Peteris Janis Baiba
			allStudents.remove(0);//Pēteris izdzest
			allStudents.print();//Janis Baiba
			allStudents.add(new Student("Kaspars", "Kalnins"));//Janis Baiba Kaspars
			allStudents.add(new Student("Liga", "Jautra"));//Janis Baiba Kaspars Liga
			System.out.println(allStudents.get(3));//Liga
			System.out.println(allStudents.search(s1));//Mekleju Baibu - 1
			allStudents.print();
			allStudents.makeEmpty();
			allStudents.add(new Student("Karina", "Skirmante"));
			allStudents.print();//Karina
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
