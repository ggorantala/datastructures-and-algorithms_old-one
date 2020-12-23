package algorithms;

public class Future {
  public static void main(String[] args) {
    long crore = 10000000;
    long number = 40;
    int count = 0;
    long finalNumber = number * crore;
    while (finalNumber > 0) {
      count++;
      finalNumber /= 10;
    }

    System.out.println(count);
  }
}
