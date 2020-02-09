
public class isLinkedListCycle {

	public static void main(String[] args) {
		Node node1 = new Node(12);
		Node node2 = new Node(3, node1);
		Node node3 = new Node(7, node2);
		Node node4 = new Node(6, node3);
		node1.setNext(node3);
		System.out.println(isLinkedListCycle(node4));
	}

	public static boolean isLinkedListCycle(Node node) {
		Node pointer1=node;
		Node pointer2=node;
		
		while(pointer2!=null) {
			pointer2=pointer2.getNext();
			if(pointer1==pointer2) {
				return true;
			}
			pointer1=pointer1.getNext();
			if(pointer1==pointer2) {
				return true;
			}
			if(pointer2==null||pointer1==null) {
				return false;
			}
			pointer2=pointer2.getNext();
			if(pointer2==null) {
				return false;
			}
		}
		return false;
	}
}
