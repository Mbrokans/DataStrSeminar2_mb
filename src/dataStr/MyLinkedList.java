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
	
	
}
