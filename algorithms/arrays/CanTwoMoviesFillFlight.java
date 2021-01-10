package algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

public class CanTwoMoviesFillFlight {
  public static void main(String[] args) {
    System.out.println(canTwoMoviesFillFlight(new int[]{1,2,3,4}, 4));
  }

  public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

    // movie lengths we've seen so far
    Set<Integer> movieLengthsSeen = new HashSet<>();

    for (int firstMovieLength : movieLengths) {

      int matchingSecondMovieLength = flightLength - firstMovieLength;
      if (movieLengthsSeen.contains(matchingSecondMovieLength)) {
        return true;
      }

      movieLengthsSeen.add(firstMovieLength);
    }

    // we never found a match, so return false
    return false;
  }
}