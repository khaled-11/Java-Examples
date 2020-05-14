  package P3;
  
  public class Third {
  public static void main(String[] args) throws Exception{
    long A = function();
    System.out.println(A);
} 

  static long function() throws Exception{
  long b = 600851475143l;
  long c;
  while (true) {
   c = factorize(b);
   if (c < b){
    b /= c;
   } else {
   return(b);
   }}}
  
  // Method to find the First Factor for the number //
  static long factorize(long n) throws Exception {
  for (long k = 2 ; k <= sqrt(n); ++k) {
   if (n % k == 0)
    return k;
  }
  return n;
 }
  
  // Function to compute Square Root for Long Integers //
  static long sqrt(long z) throws Exception{
  long x = 0;
  for (long k = 1L << 31; k != 0; k >>>= 1) {
   x |= k;
  }
  return x;
  }}