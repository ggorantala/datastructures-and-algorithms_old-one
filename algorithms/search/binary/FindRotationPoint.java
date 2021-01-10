package algorithms.search.binary;

public class FindRotationPoint {
  public static void main(String[] args) {
    String[] strs = {"k", "a", "b", "c", "d", "e", "g", "i"};
    System.out.println(findRotationPoint(strs));
  }

  private static int findRotationPoint(String[] words) {
    final String firstWord = words[0];

    int floorIndex = 0, ceilingIndex = words.length - 1;

    while (floorIndex < ceilingIndex) {
      int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);
      if (words[floorIndex].compareTo(firstWord) >= 0) {
        //go right
        floorIndex++;
      } else {
        //go left
        ceilingIndex--;
      }

      if (floorIndex + 1 == ceilingIndex) {
        break;
      }
    }
    return ceilingIndex;
  }
}
