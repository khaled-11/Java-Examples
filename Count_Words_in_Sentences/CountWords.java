package Count_Words_in_Sentences;
import java.util.*;
  
public class CountWords {
public static void main(String[] args) throws Exception{
  HashMap<String, Integer> map = new HashMap<>();
  String[] words = {"first" , "second" , "third" , "fourth"}; 
  String[] sentences = {"here is my first sentense First to test." , "here is the third to count" , "here is nothing" , " consider edge case  with double space then select first.", "second was not included" , "  why don't wecount all words as  well"};
  for (int j = 0 ; j < words.length ; ++j)
  {
    int c = 0;
    for (int i = 0 ; i < sentences.length ; ++i) {
      if (sentences[i].contains(words[j])) {
        //System.out.println(words[j]  + "Found");
        ++c;
        map.put(words[j],c);
      } 
    }}
    for (int o = 0 ; o < words.length ; ++o){
         if (map.containsKey(words[o])) {
         System.out.println("The String " + words[o] + " was found " + map.get(words[o]) + " times");
         //System.out.println(map.get(words[o]));
         //System.out.println(map.get(words[o]));
       }
    }}}