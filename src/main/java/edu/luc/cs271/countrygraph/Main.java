package edu.luc.cs271.countrygraph;

import java.awt.*;
import java.net.*;
import java.util.*;
import java.util.Scanner;
import org.jgrapht.*;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;

public class Main {

  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);

    Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    CountryCodes newMap = new CountryCodes(myMap);
    myMap = newMap.createMap();
    System.out.println(myMap);

    newMap.breadthFirst();
    newMap.closestFirst();
    newMap.depthFirst();
    newMap.randomWalk();

    GreedyColoring<String, DefaultEdge> colorMap = new GreedyColoring<>(myMap);
    System.out.println(colorMap.getColoring());
  }
}
