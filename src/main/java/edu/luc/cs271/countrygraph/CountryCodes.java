package edu.luc.cs271.countrygraph;

import java.util.Map;
import java.util.*;

public class CountryCodes {

  final static String AR = "Argentina";
  final static String CL = "Chile";
  final static String RB = "Bolivia";
  final static String PY = "Paraguay";
  final static String BR = "Brazil";
  final static String UY = "Uruguay";
  
  final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
  myMap.addVertex(String AR);
  myMap.addVertex(String CL);
  myMap.addVertex(String RB);
  myMap.addVertex(String PY);
  myMap.addVertex(String BR);
  myMap.addVertex(String UY);
  
  myMap.addEdge(AR, CL);
  myMap.addEdge(AR, RB);
  myMap.addEdge(AR, PY);
  myMap.addEdge(AR, BR);
  myMap.addEdge(AR, UY);
}
