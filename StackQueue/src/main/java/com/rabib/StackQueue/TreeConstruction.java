package com.rabib.StackQueue;

public class TreeConstruction {
	
	static int depth =0;
	private static void checkDepth(int d) {
		if(depth ==0) {
			depth = d;
		}else if(depth !=d) {
			System.out.print(" depth are not equel");
		}
	}

	private static void inOrderTraversal(Node n,int count) {
		if(n == null) return;
		count++;
		
			   inOrderTraversal(n.left,count);
			   if(checkLeafNode(n))
				   {
				   		System.out.print(" "+n.data+" "+count+"\n");
				   		checkDepth(count);
				   }
			   inOrderTraversal(n.right, count);
			   if(checkLeafNode(n)) {
					count=0;
				}
	}
	
	private static boolean checkLeafNode(Node n) {
		if(n.left == null && n.right == null)
			{
				return true;
			}else {
				return false;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);                    //           5
		root.left = new Node(10);                   //         /   \
		root.right = new Node(20);                  //        10    20
		root.left.left = new Node(30);              //       /  \    / \
		root.left.right = new Node(40);             //      30  40  80  90
		root.right.left = new Node(80);             //                  /
		root.right.right = new Node(90);            //                 100
		root.right.right.left = new Node(100);
		
		
	    inOrderTraversal(root,0);
	    //postOrderTraversal(root);
	    //preOrderTraversal(root);
	    Node root2 = new Node(1);                      //              1
        root2.left = new Node(2);                      //             /  \
        root2.right = new Node(3);                     //           2     3
        root2.left.left = new Node(4);                 //          / \   /
        root2.left.right = new Node(5);                //        4    5 6 
        root2.right.left = new Node(6);

        inOrderTraversal(root2,0);

	}

}
