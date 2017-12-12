package edu.luc.cs271.countrygraph;

import java.awt.*;
import java.net.*;
import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;

public class CountryCodes {

  static final String AR = "Argentina";
  static final String CL = "Chile";
  static final String BO = "Bolivia";
  static final String PY = "Paraguay";
  static final String BR = "Brazil";
  static final String UY = "Uruguay";

  Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);

  public CountryCodes(Graph<String, DefaultEdge> myMap) {
    this.myMap = myMap;
  }

  public Graph<String, DefaultEdge> createMap() {

    myMap.addVertex(AR);
    myMap.addVertex(CL);
    myMap.addVertex(BO);
    myMap.addVertex(PY);
    myMap.addVertex(BR);
    myMap.addVertex(UY);

    myMap.addEdge(AR, CL);
    myMap.addEdge(AR, BO);
    myMap.addEdge(AR, PY);
    myMap.addEdge(AR, BR);
    myMap.addEdge(AR, UY);
    myMap.addEdge(CL, BO);
    myMap.addEdge(BO, PY);
    myMap.addEdge(BO, BR);
    myMap.addEdge(PY, BR);
    myMap.addEdge(BR, UY);

    return myMap;
  }

  public void breadthFirst() {
    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, AR);
    while (bf.hasNext()) {
      final String country = bf.next();
      System.out.println("Breadth first: " + country);
    }
  }

  public void closestFirst() {
    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, AR);
    while (cf.hasNext()) {
      final String country = cf.next();
      System.out.println("Closest first: " + country);
    }
  }

  public void depthFirst() {
    final Iterator<String> df = new BreadthFirstIterator<>(myMap, AR);
    while (df.hasNext()) {
      final String country = df.next();
      System.out.println("Depth first: " + country);
    }
  }

  public void randomWalk() {
    final Iterator<String> rw = new RandomWalkIterator<>(myMap, AR);
    int amt = 0;
    while (rw.hasNext() && amt <= 5) {
      final String country = rw.next();
      System.out.println("Random walk: " + country);
      amt++;
    }
  }
}
