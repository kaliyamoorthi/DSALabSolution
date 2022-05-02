package com.greatlearning.Question2;

import java.util.ArrayList;
//Alternate solution using extra space
public class PairSum_Alternate extends BinarySearchTree {
 static ArrayList<Integer> pairs = new ArrayList<>();
 static boolean pairExists = false;
 public static void main(String[] args) {
     BinarySearchTree bst = new BinarySearchTree();
     int [] arr = new int[]{40,20,60,10,30,50,70};

     for (int i =0; i< arr.length;i++) {
         bst.root = bst.insert(arr[i], bst.root);
     }
     int sum = 60;

     //End of Input

     searchPair(sum,bst.root);
     if(!pairExists){
         System.out.println("No suitable pair found for given sum");
     }

 }
 public static void searchPair(int sum,Node currRoot){
     traverseInorder(sum, currRoot);
 }
 public static void traverseInorder(int sum,Node currRoot){

     if(currRoot == null){
         return;
     }
     traverseInorder(sum,currRoot.leftChild);

     if(!pairs.contains(sum-currRoot.data)){
         pairs.add(currRoot.data);
     }
     else{
         pairExists=true;
         System.out.println("Pair is ("+(sum-currRoot.data)+","+ (currRoot.data)+")");
     }

     traverseInorder(sum,currRoot.rightChild);
 }

}
