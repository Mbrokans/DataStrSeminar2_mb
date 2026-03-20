package dataStr;

public class MyNode {
	
	private char element;
	private MyNode nextNode = null;
	private MyNode previousNode = null;
	
	
	
	
	public char getElement() {
		return element;
	}
	public MyNode getNextNode() {
		return nextNode;
	}
	public MyNode getPreviousNode() {
		return previousNode;
	}
	public void setElement(char element) {
		this.element = element;
	}
	
	public void setNextNode(MyNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setPreviousNode(MyNode previousNode) {
		this.previousNode = previousNode;
	}
	
	
	
	
}
