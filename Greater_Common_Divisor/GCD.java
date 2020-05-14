  package Greater_Common_Divisor;
  
  public class GCD {
  public static void main(String[] args) throws Exception{
    int [] A = {3,5,7};
    int c;
    int max = A[0];
    int min = A[0];
    for (int l = 0 ; l < A.length ; ++l) {
      if (A[l] > max)
        max = A[l];
    }  
    
    for (int k = 1 ; k < max ; ++k) {  
      c = 0;
    for (int i = 0 ; i < A.length ; ++i) {
      if (A[i] % k == 0)
      {
        ++c;
      }
      if (c == A.length)
      {
        System.out.println(k);
      }
    }}}} 