package algorismProject2.copy;

import java.util.Comparator;

public class Bintree<k, v> {
	static class Node<k,v>{
		private k key;
		private v data;
		private Node<k,v> left;
		private Node<k,v> right;
		
		Node(k key, v data, Node<k, v> left, Node<k, v> right) {
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}

		k getKey() {
			return key;
		}

		v getValue() {
			return data;
		}
		
		void print() {
			System.out.println(data);
		}		
	}
	
	private Node<k, v> root;
	private Comparator<? super k> comparator = null;
	
	public Bintree() {
		root = null;
	}
	
	public Bintree(Comparator<? super k> c) {
		this();
		comparator = c;
	}	
	private int comp (k key1, k key2) {
		return (comparator == null) ? ((Comparator<k>)key1).compare(key1, key2)
				:comparator.compare(key1, key2);
	}
	
	public v search(k key) {
		Node<k,v> p = root;
		
		while(true) {
			if(p==null)
				return null;
			
			int cond = comp(key,p.getKey());
			if(cond==0)
				return p.getValue();
			
			else if(cond<0)
				p=p.left;
			else
				p=p.right;
		}
	}
	
	private void addNode(Node<k, v>node,k key,v data) {
		int cond = comp(key, node.getKey());
		if(cond ==0)
			return;
		else if(cond<0) {
			if(node.left==null)
				node.left = new Node<k,v>(key, data, null, null);
			else
				addNode(node.left,key,data);
				
		}else {
			if(node.right==null)
				node.right = new Node<k,v>(key, data, null, null);
			else
				addNode(node.right, key, data);					
		}
	}
	
	public void add(k key,v data) {
		if(root==null)
			root = new Node<k,v>(key, data, null, null);
		else
			addNode(root, key, data);				
	}
	
	public boolean remove(k key) {
		Node<k, v> p =root;
		Node<k, v> parent = null;
		boolean isLeftChild = true;
		
		while(true) {
			if(p==null)
				return false;
			int cond = comp(key, p.getKey());
			if(cond == 0)
				break;
			else {
				parent = p;
				if(cond <0) {
					isLeftChild=true;
					p = p.left;
				}else {
				isLeftChild=false;
				p = p.right;
			}
			}
		}
		
		if(p.left==null) {
			if(p==root)
				root=p.right;
			else if(isLeftChild)
				parent.left=p.right;
			else
				parent.right=p.right;			
		}else if(p.right==null) {
			if(p==root)
				root=p.left;
			else if(isLeftChild)
				parent.left=p.left;
			else
				parent.right=p.left;
		}else {
			parent=p;
			Node<k, v> left = p.left;
			isLeftChild=true;
			while(left.right!=null) {
				parent=left;
				left=left.right;
				isLeftChild=false;
			}
			p.key=left.key;
			p.data=left.data;
			if(isLeftChild)
				parent.left=left.left;
			else parent.right=left.left;
		}
		return true;
	}
	private void printSubTree(Node node) {
		if(node != null) {
			printSubTree(node.left);
			System.out.println(node.key+" "+node.data);
			printSubTree(node.right);
		}
	}
	
	public void print() {
		printSubTree(root);
	}	
}
