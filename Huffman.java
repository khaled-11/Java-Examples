import java.util.PriorityQueue; 
import java.util.Scanner; 

public class Huffman {  
     static void decode(String s, HuffmanNode root) {
        int i = 0;
        while(i< s.length()){
            HuffmanNode temp = root;
            while (temp != null)
            {
                if(temp.left == null && temp.right == null)
                {
            System.out.print(temp.charData); 
            break;
                }
                else {
                char c = s.charAt(i);
                if (c == '0') {
                    temp = temp.left;
                } else {
                    temp = temp.right;
                }
                i++;
        }}}
    }
     
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in); 
        Scanner input = new Scanner(System.in);
        // number of characters and getting input.
        System.out.println("Please enter the total number of characters");
        int n = input.nextInt();
        char[] charArray = new char[n];
        int[] charfreq = new int[n];
        for (int i = 0 ; i < n ; i++) {
        System.out.println("Please enter the first character number #" + (i+1));
        charArray[i] = input.next().charAt(0); 
        // m, p, s, i
        System.out.println("Please enter the integer number #" + (i+1));
        charfreq[i] = input.nextInt();
        //{1, 2, 4, 4}; 
        // 1*3 + 2*3 + 4*2 + 4*1 = 21
        }
        
        // creating priority queue q. 
        PriorityQueue<HuffmanNode> q 
            = new PriorityQueue<HuffmanNode>(n, new MyComparator());   
        for (int i = 0; i < n; i++) { 
          // Create Node
            HuffmanNode hn = new HuffmanNode(charfreq[i] , charArray[i]); 
            q.add(hn); 
        } 
  
        // create a root node 
        HuffmanNode root = null; 
        // Get the Two Minumum in the queue heap
        // Repeat until we finish all nodes.
        while (q.size() > 1) { 
            // First min in the heap. 
            HuffmanNode x = q.peek(); 
            q.poll(); 
            // Second min in the heap. 
            HuffmanNode y = q.peek(); 
            q.poll(); 
            // Create new node "newNode"
            HuffmanNode newNode = new HuffmanNode(); 
            // Assignh the sum of the two minumum to the newNode
            newNode.freq = x.freq + y.freq; 
            newNode.charData = '-'; 
            // The first running node will go left 
            newNode.left = x; 
            // The second running node will go right
            newNode.right = y; 
            // Pointing root to the newNode
            root = newNode;   
            // Adding the newNode to the priority queue. 
            q.add(newNode); 
        } 
  
        // Decoding a specific String.
        System.out.println("Please enter a code to decode!");
        String a = input.next();
        decode (a,root);
        System.out.println();
    } 
} 