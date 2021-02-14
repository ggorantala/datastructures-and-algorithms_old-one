package algorithms.strings;

import java.util.ArrayList;

public class ValidIPAddress {
  public static void main(String[] args) {
    System.out.println(validIpAddress("1921680"));
  }

  private static ArrayList<String> validIpAddress(String string) {
    ArrayList<String> ipAddressFound = new ArrayList<String>();

    for (int i = 1; i < Math.min(string.length(), 4); i++) {
      String[] currentIPAddresses = {"", "", "", ""};

      currentIPAddresses[0] = string.substring(0, i);
      if (!isValid(currentIPAddresses[0])) {
        continue;
      }

      for (int j = i + 1; j < i + Math.min(string.length() - i, 4); j++) {
        currentIPAddresses[1] = string.substring(i, j);
        if (!isValid(currentIPAddresses[1])) {
          continue;
        }

        for (int k = j + 1; k < j + Math.min(string.length() - j, 4); k++) {
          currentIPAddresses[2] = string.substring(j, k);
          currentIPAddresses[3] = string.substring(k);

          if (isValid(currentIPAddresses[2]) && isValid(currentIPAddresses[3])) {
            ipAddressFound.add(answer(currentIPAddresses));
          }
        }
      }
    }

    return ipAddressFound;
  }

  private static String answer(String[] array) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);

      if (i < array.length - 1) {
        sb.append(".");
      }
    }
    return sb.toString();
  }

  private static boolean isValid(String s) {
    int val = Integer.parseInt(s); // this strips the leading 0.. so in final return validate this

    if (val > 255) {
      return false;
    }
    return s.length() == Integer.toString(val).length();
  }
}
