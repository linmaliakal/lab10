package edu.luc.cs271.countrygraph;

import java.util.*;
import java.awt.*;
import java.net.*;
import org.jgrapht.*;
import org.jgrapht.alg.*;
import org.jgrapht.traverse.*;

public class CountryCodes {

  final static String AR = "Argentina";
  final static String CL = "Chile";
  final static String RB = "Bolivia";
  final static String PY = "Paraguay";
  final static String BR = "Brazil";
  final static String UY = "Uruguay";
  
  
  
  public Graph<String, DefaultEdge> returnMap() {
    final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    this.myMap = myMap;
    
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
