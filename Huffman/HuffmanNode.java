import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator; 
  
// The custom Huffman Node Class which has a char value & frequency.
class HuffmanNode { 
    int freq; 
    char charData;  
    HuffmanNode left; 
    HuffmanNode right; 
    public HuffmanNode (int val, char k){
      freq = val;
      charData = k;
      left = null; 
      right = null; 
    } 
    public HuffmanNode (){
//freq = value;
    }}
  
// Implementing a class to compare nodes accoring to frequencies. 
class MyComparator implements Comparator<HuffmanNode> { 
    public int compare(HuffmanNode x, HuffmanNode y) 
    { 
  
        return x.freq - y.freq; 
    } 
} 
  

  

 
  