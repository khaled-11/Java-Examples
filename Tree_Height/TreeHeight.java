  package Tree_Height;
  
  public class TreeHeight {

 /*
    class Node 
     int data;
     Node left;
     Node right;
 */
    
    class Node { 
        int data; 
        Node left, right; 
  
        public Node(int value) { 
            data = value; 
            left = right = null; 
        }}  
    
        Node root;
    TreeHeight() 
    {  
      root = null;  
    } 
    // Inserting Records Sorted.
    void insert(int key) 
    { 
       root = insertRec(root, key); 
    } 
      
    Node insertRec(Node root, int key) 
    {
      if (root == null) { 
        root = new Node(key); 
        return root; 
      } 
      if (key < root.data) 
        root.left = insertRec(root.left, key); 
      else if (key > root.data) 
        root.right = insertRec(root.right, key);
      return root; 
    }
    static int count(Node root)
     {
        if (root == null)
        {
         return 0;
        }
       else
       {
         int l = count(root.left);
         int r = count(root.right);
         if (l > r)
         return l + 1;
         else
         return r + 1;
       }
    }
  
 public static void main(String[] args) {
       // Write your code here.
            // Scanner sc = new Scanner(System.in); 
            // String n = sc.nextLine(); 
           TreeHeight tree = new TreeHeight();
           tree.insert(3);
           tree.insert(5);
           tree.insert(2);
           tree.insert(1);
           tree.insert(4);
           tree.insert(6);
           tree.insert(7);
           int i = TreeHeight.count(tree.root);
           System.out.println(i-1);
    }
}