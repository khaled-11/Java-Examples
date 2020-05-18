package Count_Words_in_Sentences;
import java.util.*;
  
public class CountWords {
  
  // Global Variables to store the Highest Two.
  static class global
{
    static String FirstMax = null; 
    static String SecondMax = null; 
}
  
  
public static void main(String[] args) throws Exception{
  HashMap<String, Integer> map = new HashMap<>();
  Scanner s = new Scanner(System.in); 
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter the total number of words");
  int n = input.nextInt();
  String[] words = new String [n];
  for (int k =0 ; k < n ;++k){
    System.out.println("Please enter the words");
    words[k] = lower(input.next());
  }

  String[] sentences = new String [6];

    sentences[0] = " This is my FIrST capital Test";
    sentences[1] = "try second fiRst here";
    sentences[2] = "First talk third to first";
    sentences[3] = "only third with first";
    sentences[4] = "First talk third to first";
    sentences[5] = "only second with third";
  
  for (int j = 0 ; j < words.length ; ++j)
  {
    int c = 0;
    for (int i = 0 ; i < sentences.length ; ++i) {
      String lower = lower(sentences[i]);
      //  System.out.println(sentences(i));
      if ( sentences[i].contains(words[j]) || lower.contains(words[j])) {
        //System.out.println(words[j]  + "Found");
        ++c;
        map.put(words[j],c);
      } 
    }}
    for (int o = 0 ; o < words.length ; ++o){
         if (map.containsKey(words[o])) {
         System.out.println("The String " + words[o] + " was found " + map.get(words[o]) + " times");
         }
    }
        String max1 = words[3];
        String max2 = words[3];
    for (int o = 0 ; o < words.length ; ++o){
         if (map.get(words[o]) > map.get(max1)) {
           max1 = words[o];
         }
         if (map.get(words[o]) != map.get(max1) && map.get(words[o]) >= map.get(max2)) {
           max2 = words[o];
         }
    }
    System.out.println("The Max String " + max1 + " was found " + map.get(max1) + " times");
    System.out.println("The Max2 String " + max2 + " was found " + map.get(max2) + " times");
}
public static String lower(String str){
  char current;
  String lower ="";
  int tmp;
  boolean a;
  for ( int k = 0 ; k < str.length() ; ++k){
    current = str.charAt(k);
    if (current >= 'A' && current <= 'Z')  {
    tmp = (int) current;
    tmp += 32;
    current = (char) tmp;
    lower += current;
    }
    else{
      lower += current;
    }
  }
  return lower;
}}   