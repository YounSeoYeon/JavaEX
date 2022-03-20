package tree;

public class Node {

	int value;
	Node leftChild;
	Node rightChild;
	
	public Node(int value) {
		this.value=value;
		leftChild = null; // 객체이므로 null값으로 초기화
		rightChild=null;	
		
	}
}
