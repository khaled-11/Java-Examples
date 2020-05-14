package P2;

public class Second {
  public static void main(String[] args) {
    int First = 1;
    int Second = 2;
    int Next, Sum = 0;
  while (First <= 4000000) {
   if (First % 2 == 0)
    Sum += First;
   Next = First + Second;
   First = Second;
   Second = Next;
  }
    System.out.println(Integer.toString(Sum));
  }}