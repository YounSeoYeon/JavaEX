package algorismProject2;

public class Node<T1, T2> {
	private T1 key;
	private T2 data;
	private Node<T1,T2> left;
	private Node<T1,T2> right;
	
	public Node(T1 key, T2 data, Node<T1, T2> left, Node<T1, T2> right) {
		this.key = key;
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public T1 getKey() {
		return key;
	}

	public void setKey(T1 key) {
		this.key = key;
	}

	public T2 getData() {
		return data;
	}

	public void setData(T2 data) {
		this.data = data;
	}
	
	void print() {
		System.out.println(data);
	}
	
}
