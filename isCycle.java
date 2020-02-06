
public class isCycle {

	public static void main(String[] args) {
		Node node1=new Node(12);
		Node node2=new Node(3,node1);
		Node node3=new Node(7,node2);
		Node node4=new Node(6,node3);
		node1.setNext(node4);
		System.out.println(isCyclic(node4));

	}

	public static boolean isCyclic(Node node) {
		return isCycle(node.getNext(),node);
	}
	public static boolean isCycle(Node node,Node firstNode) {
		if(node==null) {
			return false;
		}
		if(node==firstNode) {
			return true;
		}
		return isCycle(node.getNext(), firstNode);
		
	}
}
