
public class deleteLastLinkedList {

	public static void main(String[] args) {
		Node node1=new Node(12);
		Node node2=new Node(3,node1);
		Node node3=new Node(7,node2);
		Node node4=new Node(6,node3);
		deleteLastValueLinkedList(node4);
		printLinkedList(node4);
	}
	public static void deleteLastValueLinkedList(Node node) {
		if(node.getNext().getNext()==null) {
			node.setNext(null);
			return;
		}
			deleteLastValueLinkedList(node.getNext());
	}
	
	
	public static void printLinkedList(Node node) {
		while(node!=null) {
			System.out.println(node.getValue());
			node=node.getNext();
		}
			
	}

}
