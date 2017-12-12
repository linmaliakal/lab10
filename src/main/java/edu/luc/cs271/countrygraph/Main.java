package edu.luc.cs271.countrygraph;

import java.util.Scanner;
import java.awt.*;
import java.net.*;
import java.util.*;
import org.jgrapht.*;
import org.jgrapht.alg.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException{
    final Scanner input = new Scanner(System.in);
    
    Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    CountryCodes newMap = new CountryCodes(myMap);
    myMap = newMap.createMap();
    System.out.println(myMap);
    
    newMap.breadthFirst();
  }
}
