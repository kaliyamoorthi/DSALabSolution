package com.greatlearning.Question2;

	// Solution without using extra space
	public class PairSum extends BinarySearchTree {
	    static int sum;
	    static boolean pairExists = false;
	    static Node root, lastvisited = null;
	    public static void main(String[] args) {
	        BinarySearchTree bst = new BinarySearchTree();
	        int [] arr = new int[]{40,20,60,10,30,50,70};
	        for (int i =0; i< arr.length;i++) {
	            bst.root = bst.insert(arr[i], bst.root);
	        }
	        sum = 70;
	        //End of Input
	        root = bst.root;
	        searchPair(bst.root);
	        if(!pairExists){
	            System.out.println("No suitable pair found for given sum");
	        }

	    }
	    public static void searchPair(Node currRoot){
	        traverseInorder(currRoot);
	    }
	    public static void traverseInorder(Node currRoot){

	        if(currRoot == null){
	            return;
	        }
	        traverseInorder(currRoot.leftChild);
	        if (lastvisited==null){
	            lastvisited = currRoot;
	        }
	        if((sum-currRoot.data)>lastvisited.data && searchTree(sum-currRoot.data,root)){
	            pairExists=true;
	            System.out.println("Pair is ("+currRoot.data+","+ (sum-currRoot.data)+")");
	        }
	        lastvisited =   currRoot;
	        traverseInorder(currRoot.rightChild);
	    }
	    
	}
