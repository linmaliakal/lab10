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
  static final String RB = "Bolivia";
  static final String PY = "Paraguay";
  static final String BR = "Brazil";
  static final String UY = "Uruguay";

  final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);

  public Graph<String, DefaultEdge> createMap() {

    myMap.addVertex(AR);
    myMap.addVertex(CL);
    myMap.addVertex(RB);
    myMap.addVertex(PY);
    myMap.addVertex(BR);
    myMap.addVertex(UY);

    myMap.addEdge(AR, CL);
    myMap.addEdge(AR, RB);
    myMap.addEdge(AR, PY);
    myMap.addEdge(AR, BR);
    myMap.addEdge(AR, UY);

    return myMap;
  }
}
