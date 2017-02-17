
public class Driver {
  public static int subsetCount;
  
  static void run(Subsets s, int n) {
    int[] A = new int[n];
    for (int i = 0; i < n; i++)
      A[i] = i + 1;
    long start = System.currentTimeMillis();
    subsetCount = s.subsets(A).size();
    long end = System.currentTimeMillis();
    
    long mills = end - start;
    System.out.printf("%s mills: %d\n", s.getClass().getSimpleName(), mills);
  }
  
  public static void main(String[] args) {
    for (int n = 16; n <= 22; n++) {
      System.out.printf("n: %d\n", n);
      run(new Iter(), n);
      run(new Recur(), n);
    }
  }
}
