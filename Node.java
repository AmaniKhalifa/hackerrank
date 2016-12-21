package hcrrank;
// https://www.hackerrank.com/challenges/ctci-is-binary-search-tree?h_r=next-challenge&h_v=zen
public class Node {
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
	}
	public void insert(int data){
		if(data < this.data){
			if(this.left != null){
				left.insert(data);
			}else{
				this.left = new Node(data);
			}
		}else{
			if(this.right != null){
				this.right.insert(data);
			}else{
				this.right = new Node(data);
			}			
		}
	}
	
	public void insertNotBST(int data){
		if(data > this.data){
			if(this.left != null){
				left.insert(data);
			}else{
				this.left = new Node(data);
			}
		}else{
			if(this.right != null){
				this.right.insert(data);
			}else{
				this.right = new Node(data);
			}			
		}		
	}
	
	public void insertLeafLeft(int data){
		if(this.left != null){
			left.insert(data);
		}else{
			this.left = new Node(data);
		}		
	}
	
	public void insertLeafRight(int data){
		if(this.right != null){
			right.insert(data);
		}else{
			this.right = new Node(data);
		}		
	}
	
	// you have to get this too
	static boolean isBST(Node root, int min, int max){
	    if( root.left != null && (root.left.data >= root.data || root.left.data <= min) ){
	    	return false;
	    }else if(root.right != null && (root.right.data <= root.data || root.right.data >= max)){
	    	return false;
	    }else{
	    	boolean l = true,r = true;
	    	if(root.left != null) l = isBST(root.left, min, root.data);
	    	if(root.right != null) r = isBST(root.right, root.data, max);
	    	return l & r;

	    }
	}
	// the function required
	static boolean checkBST(Node root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}
	
	public void printTree(Node root){
		if(root.left != null){
			this.printTree(root.left);
		}
		System.out.println(root.data);
		if(root.right != null){
			this.printTree(root.right);
		}	
	}
	
	public static void main(String[] args) {
		Node n = new Node(5);
		n.insert(10);
		n.insert(8);
		n.insert(3);
		System.out.println("This should be True : " + Node.checkBST(n));
		Node x = new Node(3);
		Node y = new Node(2);
		y.insertLeafRight(4);
		x.left = y;
		x.insert(1);
		x.insert(5);
		System.out.println("This should be False : " + Node.checkBST(x));
		Node m = new Node(5);
		Node z = new Node(10);
		z.insertLeafLeft(8);
		z.insertLeafLeft(3);
		m.right = z;
		System.out.println("This should be False : " + Node.checkBST(m));
		Node l = new Node(7);
		l.insert(5);
		l.insert(3);
		l.insert(2);
		l.insertNotBST(10);
		System.out.println("This should be False : " + Node.checkBST(l));



		
	}


}
