
public class minValueLinkedList {

	public static void main(String[] args) {
		Node node1=new Node(12);
		Node node2=new Node(3,node1);
		Node node3=new Node(7,node2);
		Node node4=new Node(6,node3);
		System.out.println(minLinkedList(node4));

		
		
	}
	public static int minLinkedList(Node node) {
		
		if(node==null) {
			return 0;
		}
		if(node.getNext()==null){
			return node.getValue();
		}
		
	    return Math.min(minLinkedList(node.getNext()),node.getValue());

	}
	
}
