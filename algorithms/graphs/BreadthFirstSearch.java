package algorithms.graphs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.assertTrue;

public class BreadthFirstSearch {
  // Do not edit the class below except
  // for the breadthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> breadthFirstSearch(List<String> array) {
      // Write your code here.
      Queue<Node> queue = new LinkedList<Node>();
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}

//------------------
// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!


class ProgramTest {
  public static boolean compare(List<String> arr1, String[] arr2) {
    if (arr1.size() != arr2.length) {
      return false;
    }
    for (int i = 0; i < arr1.size(); i++) {
      if (!arr1.get(i).equals(arr2[i])) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void TestCase1() {
    BreadthFirstSearch.Node graph = new BreadthFirstSearch.Node("A");
    graph.addChild("B").addChild("C").addChild("D");
    graph.children.get(0).addChild("E").addChild("F");
    graph.children.get(2).addChild("G").addChild("H");
    graph.children.get(0).children.get(1).addChild("I").addChild("J");
    graph.children.get(2).children.get(0).addChild("K");
    String[] expected = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    List<String> inputArray = new ArrayList<String>();
    assertTrue(compare(graph.breadthFirstSearch(inputArray), expected));
  }
}
