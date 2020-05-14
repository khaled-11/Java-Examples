package Nodes_Swap;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SwapAlgo {

// Global Variables which used to fill the answer array.  
static class global
{
    static int i2 = 0;
    static int j2 = 0;
}

// The tree Class
static class Node  
{  
    int data;  
    Node left, right; 
    
    public Node(int data)
    {
        this.data = data;  
    }
  public Node(int data, Node left, Node right) {
   this.data = data;
   this.left = left;
   this.right = right;
  }

  public void setLeft(Node left) {
   this.left = left;
  }

  public void setRight(Node right) {
   this.right = right;
  }

};  
   
// The swap Function for every "K" level. 
static void swapK( Node root, int level, int k)  
{  
    // base edge case  
    if (root== null ||  
            (root.left==null && root.right==null) )  
        return ;  
  
    if ( (level + 1) % k == 0)  
        { 
            Node temp=root.left; 
            root.left=root.right; 
            root.right=temp; 
        }  
    // Recur for left and right subtrees  
    swapK(root.left, level+1, k);  
    swapK(root.right, level+1, k);  
}

// This the main Swap Function. 
static void swapMain(Node root, int k)  
{   
    // Start from 0 to swap the children.  
    swapK(root, 0, k);  
}  
  

// Recursive function for inorder trversal print. 
static void inorder(Node root, int[][] ans , int i , int j)  
{  
    if (root == null)  
        return;  
    inorder(root.left,ans,i,j);  
    System.out.print(root.data + " "); 
    value(root.data,ans,i,j); 
    inorder(root.right,ans,i,j);  
}  

// Function that fill the answer array from the inorder traveral.
static void value(int result, int [][] ans, int i , int j){
    if (global.j2 < j)
    {
        ans[global.i2][global.j2] = result;
        global.j2++;
    }
    else
    {
        global.i2++;
        global.j2 = 0;
        ans[global.i2][global.j2] = result;
        global.j2++;  
    }
}


    /*
     * Complete the swapNodes function below.
     */
    static int[][] swapNodes(int[][] indexes, int[] queries) {
        /*
         * Write your code here.
         */
       // int[] ans1 = new int[((queries.length)*(indexes.length))+1];
       /*
               for (int k = 0 ; k < indexes.length-1 ; k = k) {
            if (k == 0) {
                    ans1[p] = indexes[k][0];
                    ++p;
                }
            if (k == 0) {
                    ans1[p] = indexes[k][1];
                    ++p;
                }
            for (int t = 0 ; t < 2 ; ++t) {
                k++;
                ans1[p] = indexes[k][0];
                ++p;
                ans1[p] = indexes[k][1];
                ++p;
            }
        }
        */
  // Getting how many swaps and creating answer array.
  // Getting how many enteries in the [][] array and creating ArrayLists
  int m = queries[0];
  int e = queries.length;
  int t = indexes.length;
  int[][] ans = new int[e][t];      
  List<List<Node>> tree = new ArrayList<>();
  List<Node> rootLevel = new ArrayList<>();
  // Intializing the tree and the ArrayLists.
  Node root = new Node(1);
  rootLevel.add(root);
  tree.add(rootLevel);
  // Declaring and intilizing variables to loop over input and add nodes to the tree. 
  int i, j, l, r;
  l = 0 ;
  r = 0;
  for(i = 0; i < t;) {
   List<Node> lastLevel = tree.get(tree.size()-1);
   List<Node> currLevel = new ArrayList<>();
   for(j = 0; j < lastLevel.size(); j ++) {
    Node node = lastLevel.get(j);  
    l = indexes[i][0];
    r = indexes[i][1];
    if(l != -1) {
     Node left = new Node(l);
     node.setLeft(left);
     currLevel.add(left);
    }
    
    if(r != -1) {
     Node right = new Node(r);
     node.setRight(right);
     currLevel.add(right);
    }
    i++;
   }
   if(currLevel.size() > 0) {
    tree.add(currLevel);
   }
  }
  // Swaping Nodes in the
  int n = queries.length;
  int[] k = new int[n];
  for(i = 0; i < n; i ++) {
   k[i] = queries[i];
  }
    for(i = 0; i < n; i ++) {
   swapMain(root,k[i]);
   inorder(root,ans,e,t); 
  }
    return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] indexes = new int[n][2];

        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            String[] indexesRowItems = scanner.nextLine().split(" ");

            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
            }
        }

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
            queries[queriesItr] = queriesItem;
        }

        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
