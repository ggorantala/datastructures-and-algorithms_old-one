package algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
  public static void main(String[] args) {
    int[][] array = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
    System.out.println(spiralTraverse(array));
  }

  private static List<Integer> spiralTraverse(int[][] array) {
    List<Integer> result = new ArrayList<>();
    int startRow = 0;
    int endRow = array.length - 1;
    int startCol = 0;
    int endCol = array[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      for (int col = startCol; col <= endCol; col++) {
        result.add(array[startRow][col]);
      }
//      startRow++;

      for (int row = startRow + 1; row <= endRow; row++) {
        result.add(array[row][endCol]);
      }

//      endCol--;

      for (int col = endCol - 1; col >= startCol; col--) {
        if (startRow == endRow) break;
        result.add(array[endRow][col]);
      }
//      endRow--;
      for (int row = endRow - 1; row > startRow; row--) {
        if (startCol == endCol) break;
        result.add(array[row][startCol]);
      }

      startRow++;
      endRow--;
      startCol++;
      endCol--;
    }
    return result;
  }
}
