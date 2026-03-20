package dataStr;

public class MyLinkedList {
	private MyNode firstNode = null; // get in set funkcijas netaisa jo lietotajam nav jazina first and last
	private MyNode lastNode = null;
	private int howManyElements =0; // ka ari seit netaisam jo nelaujam lietotajam mainit elementu skaitu
	
	public int getHowManyElements() {
		return howManyElements;
	}
	// nedefinesu bezargumenta konstruktoru, jo izmantosu object manto

	
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	public boolean isFull() {
		try {
			new MyNode('a');
			return false;
		
		}
		catch(OutOfMemoryError error) {
			return true;
		}	
	}
	public void add(char element) throws Exception{
		if(isFull()){
			throw new Exception("Saraksts ir pilns");
		}
		// tiks pievienots pirmais elements
		if(howManyElements==0) {
			MyNode newNode = new MyNode(element);
			firstNode = newNode;
			lastNode = newNode;
			howManyElements++;
		}
		// ja tiek pievienos 1 2 3 elements
		//TODO ja velas var optimizet kodu
		else {
			MyNode newNode = new MyNode(element);
			newNode.setPreviousNode(lastNode);
			lastNode.setNextNode(newNode);
			lastNode= newNode;
			howManyElements++;
		}
	}
	public void print()throws Exception{
		if(isEmpty()) {
			throw new Exception("saraksts ir tukss");
		}
		MyNode currentNode=firstNode;
		while(currentNode!=null) {
			System.out.println(currentNode.getElement()+ " ");
			currentNode =currentNode.getNextNode();
		}
		System.out.println();
	}
	
	
}
