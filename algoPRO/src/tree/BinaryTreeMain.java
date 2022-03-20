package tree;

public class BinaryTreeMain {

	public static void main(String[] args) {
		Binarytree tree = new Binarytree();
		
		tree.insertNode(5);
		tree.insertNode(2);
		tree.insertNode(8);
		tree.insertNode(1);
		tree.insertNode(4);
		tree.insertNode(6);
		tree.insertNode(9);
		tree.insertNode(3);
		tree.insertNode(7);
		
		
		//Ʈ�� ����(��ȸ)
		tree.preorderTree(tree.rootNode, 0);
		System.out.println();
		
		tree.inorderTree(tree.rootNode, 0);
		System.out.println();
		
		tree.postorderTree(tree.rootNode, 0);
		System.out.println();
		
		//���� Ʈ�� �˻�
		tree.searchBTree(tree.rootNode, 7);
		
	}

}
