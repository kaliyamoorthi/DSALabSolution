package com.greatlearning.Question2;

public class BinarySearchTree {

	    Node root;
	    BinarySearchTree(){
	        root = null;
	    }

	    public static class Node{
	        int data;
	        Node leftChild, rightChild;
	        Node(int data){
	            this.data =data;
	            this.leftChild = null;
	            this.rightChild = null;
	        }
	    }
	    public Node insert(int data, Node root){

	        if(root==null){
	            root = new Node(data);
	            //System.out.println("Value inserted is: "+data);
	            return root;
	        }
	        if(data < root.data){
	            if(root.leftChild == null){
	                root.leftChild = new Node(data);
	               //System.out.println("Value inserted is: "+data);
	                return root;
	            }
	            insert(data,root.leftChild);
	        }
	        if(data> root.data){
	            if(root.rightChild == null){
	                root.rightChild = new Node(data);
	                //System.out.println("Value inserted is: "+data);
	                return root;
	            }
	            insert(data,root.rightChild);
	        }
	        return root;
	    }
	    public  void printInorder(Node root){
	        if(root==null){
	            return;
	        }
	        printInorder(root.leftChild);
	        System.out.print(root.data + " ");
	        printInorder(root.rightChild);

	    }
	    public static boolean searchTree(int data, Node root){

	        Node prev, curr;
	        curr = root;
	        prev = root;
	        while(curr!=null) {
	            if (data < curr.data) {
	                prev = curr;
	                curr = curr.leftChild;
	            } else if (curr.data < data) {
	                prev = curr;
	                curr = curr.rightChild;
	            } else {
	                //System.out.println(data + " is found and parent is "+ prev.data);
	                return true;
	            }
	        }
	        //System.out.println("Data not found");
	        return false;
	    }

	    public static void main(String[] args) {
	        BinarySearchTree bst = new BinarySearchTree();
	        int [] arr = new int[]{6,4,2,5,7,8};
	        for (int i =0; i< arr.length;i++) {
	          bst.root = bst.insert(arr[i], bst.root);
	        }
	        bst.printInorder(bst.root);

	    }
	    
	}


	    
	
