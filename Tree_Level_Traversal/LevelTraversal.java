  package Tree_Level_Traversal;
  public class LevelTraversal {
  class Node { 
      int data; 
      Node left, right; 
  public Node(int value) { 
      data = value; 
      left = right = null; 
     }}     
    Node root;
    LevelTraversal() 
    {  
      root = null;  
    } 
    
    // Inserting Records.
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
        int dif;
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
      static void traverse_main(Node root, int h) {
        for (int i = 1 ; i <= h ; i++) {
            traverse (root, i);
    }}  

    static void traverse(Node root, int i) {
        if (root == null) 
            return; 
        if (i == 1) 
            System.out.print(root.data + " "); 
        else if (i > 1) 
        { 
            traverse(root.left, i-1); 
            traverse(root.right, i-1); 
        }}
    
     public static void main(String[] args) {
        LevelTraversal tree = new LevelTraversal();
           tree.insert(1);
           tree.insert(2);
           tree.insert(5);
           tree.insert(3);
           tree.insert(6);
           tree.insert(4);
           int h = count(tree.root);
           traverse_main(tree.root,h);        
           //System.out.println(h);
     }}