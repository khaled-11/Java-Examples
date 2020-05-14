// Possible Pages
// Memory Size
// Using Queue (Dolby Linked List)(Size = cache size) and Hash
// Recent in front, latest near end
// Hash Map contain Key and address in queue node

// When running and page is referenced and in memory, detach
// the node and bring it to the front of the queue.
// If not in memory, we remove node from the back ,add
// the page to the front of the queue and update address in Map.

// Libraries used.
package HashMap;
import java.util.Deque; 
import java.util.HashSet; 
import java.util.LinkedList; 
import java.util.Iterator; 
public class LRUCache { 
  
    // Queue
    static Deque<Integer> dq; 
  
    // HashSset
    static HashSet<Integer> map; 
  
    // Maximum size of queue (Memory).
    static int csize; 
  
    // Constructor with (n) of pages can be in cache
    LRUCache(int n) 
    { 
        dq = new LinkedList<>(); 
        map = new HashSet<>(); 
        csize = n; 
    } 
  
    // Function to check if the page is in memory
    // If not in memory, add it.
    // If Full, remove from end.
    public void refer(int x) 
    { 
        if (!map.contains(x)) { 
            if (dq.size() == csize) { 
                int last = dq.removeLast(); 
                map.remove(last); 
                map.remove(last);
            } 
        } 
        else { 
      // If in memory, bring it to the front
            int index = 0, i = 0; 
            Iterator<Integer> itr = dq.iterator(); 
            while (itr.hasNext()) { 
                if (itr.next() == x) { 
                    index = i; 
                    break; 
                } 
                i++; 
            } 
            dq.remove(index-1); 
            map.remove(x);
        } 
        dq.push(x); 
        map.add(x); 
    } 
  
    // display pages in chace
    public void display() 
    { 
        Iterator<Integer> itr = dq.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
            System.out.println(); 
    } 
  
    public static void main(String[] args) 
    { 
        LRUCache ca = new LRUCache(4); 
        ca.refer(1);
                ca.display(); 
        ca.refer(2); 
                ca.display(); 
        ca.refer(3); 
                ca.display(); 
        ca.refer(1); 
                ca.display(); 
        ca.refer(4); 
                ca.display(); 
        ca.refer(5); 
        ca.display(); 
    } 
} 