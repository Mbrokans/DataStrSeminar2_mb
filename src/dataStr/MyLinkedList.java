package dataStr;

public class MyLinkedList<Ttype> {
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
	public void add(Ttype element) throws Exception{
		if(isFull()){
			throw new Exception("Saraksts ir pilns");
		}
		// tiks pievienots pirmais elements
		if(element==null) {
			throw new Exception("Ievades elements nevar but null");
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
	public void add(Ttype element, int position) throws Exception{
		if(element==null) {
			throw new Exception("Ievades elements nevar but null");
		}
		if(isFull()){
			throw new Exception("Saraksts ir pilns");
		}
		if(position<0) {
			throw new Exception("Pozicija ir mazaka par 0");
		}
		if(position>howManyElements) {
			throw new Exception("Pozicija ir lielaka par atlauto skaitu");
		}
		if(position==0) {
			MyNode newNode = new MyNode(element);
			firstNode.setPreviousNode(newNode);
			newNode.setNextNode(firstNode);
			firstNode=newNode;
			howManyElements++;
		}
		else if(position==howManyElements) {
			add(element);
		}
		else {
			MyNode currentNode = firstNode;
			for(int i=1; i<= position;i++) {
				currentNode= currentNode.getNextNode();
			}
			MyNode previousNode =currentNode;
			MyNode nextNode= currentNode.getNextNode();
			MyNode newNode = new MyNode(element);
			
			newNode.setPreviousNode(previousNode);
			previousNode.setNextNode(newNode);
			
			newNode.setNextNode(nextNode);
			nextNode.setPreviousNode(newNode);
			howManyElements++;
		}
	}
	public void remove(int position) throws Exception{
		if(isEmpty()) {
			throw new Exception("Saraksts ir tukss");
		}
		if(position<0) {
			throw (new Exception("Nevar izdzest elemntu"));
		}
		if(position>howManyElements) {
			throw (new Exception("Nevar izdzest elemntu"));
		}
		if(position==0) {
			MyNode newFirstNode = firstNode.getNextNode();
			newFirstNode.setPreviousNode(null);
			firstNode= newFirstNode;
			howManyElements--;
		}
		else if (position==howManyElements-1) {
			MyNode newLastNode= lastNode.getPreviousNode();
			newLastNode.setNextNode(null);
			lastNode= newLastNode;
			howManyElements--;
		}
		else {
			MyNode currentNode = firstNode;
			for(int i= 1;i<position;i++) {
				currentNode= currentNode.getNextNode();
				
			}
			MyNode newLeftNode= currentNode;
			MyNode newRightNode= currentNode.getNextNode().getNextNode();
			
			newLeftNode.setNextNode(newRightNode);
			newRightNode.setPreviousNode(newLeftNode);
			howManyElements--;
		}
		
	}
	public Ttype get(int position) throws Exception{
		if (isEmpty()) {
			throw (new Exception("Saraksts ir tukšs, tāpēc nevar izgūt elementus"));
		}

		if (position < 0) {
			throw (new Exception("Nevar izgūt elementu, jo pozīcija ir negatīva"));
		}

		if (position >= howManyElements) {
			throw (new Exception("Nevar izgūt elementu, jo pozīcija ir lielāka kā elementu skaits"));
		}
		
		MyNode currentNode = firstNode;
		for(int i = 1; i <= position; i++) {
			currentNode = currentNode.getNextNode();
		}
		
		return (Ttype) currentNode.getElement();
		
	}
	public int search(Ttype element) throws Exception{
		if(element==null) {
			throw new Exception("Ievades elements nevar but null");
		}
		if (isEmpty()) {
			throw (new Exception("Saraksts ir tukšs, tāpēc nevar izgūt elementus"));
		}
		int foundPosition = 0;
		MyNode currneNode=firstNode;
		while(currneNode!=null) {
			if(currneNode.getElement().equals(element)) {
				return foundPosition;
			}
			foundPosition++;
			currneNode=currneNode.getNextNode();
		}
		throw new Exception("Mekletais elements neeksiste saraksta");
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
	public void makeEmpty() {
		firstNode=null;
		lastNode=null;
		howManyElements=0;
		System.gc();
	}
	
	
}
