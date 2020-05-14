  package LinkedList;
  import java.util.*;
  
  public class L_List {
     public static void main(String[] args) {
       LinkedList<Integer> List = new LinkedList<Integer>();
       List.add(4);
       List.add(6);
       List.add(7);
       List.add(3);
       List.add(2);
       List.add(99);
       List.add(77);
       List.add(91);     
       System.out.println(List);
       List.removeFirst();
       System.out.println(List);
       List.removeLast();
       System.out.println(List);
       for (int i = 0 ; i < 3 ; i=i+2) {
       List.remove(i);
       System.out.println(List);
       }   
       System.out.println(List.get(2));
       System.out.println(List.size());
       for (int i = 0 ; i < List.size() ; ++i) {
       if (List.contains(99) && List.get(i) == 99) {
         List.remove(i);
       }}
       System.out.println(List);
     }}