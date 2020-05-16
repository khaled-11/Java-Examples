package Count_Words_in_Sentences;
import java.util.*;
  
public class CountWords {
public static void main(String[] args) throws Exception{
  String[] words = {"first" , "second" , "third" , "fourth"}; 
  String[] sentences = {"here is my first sentense to test." , "here is the third to count" , "here is nothing" , " consider edge case  with double space then select first.", "second was not included" , "  why don't wecount all words as  well"};
 // int j = 0;
  for (int j = 0 ; j < words.length ; ++j)
  {
    for (int i = 0 ; i < sentences.length ; ++i) {
      if (sentences[i].contains(words[j])) {
       // ++j;
        System.out.println(words[j]  + "Found");
      } 
    }}}
}