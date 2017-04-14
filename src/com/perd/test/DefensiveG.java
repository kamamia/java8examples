package com.perd.test;

import java.util.*;
import java.util.stream.Collectors;

public class DefensiveG {

  public static void main(String[] args) {
    Map<String, String> original = new HashMap<>();
    original.put("foo", "fooval");
    original.put("bar", "barval");

    Map<String, String> copy = original.entrySet()
        .stream()
        .collect(Collectors.toMap(Map.Entry::getKey,
                                  e -> new String(e.getValue())));

    System.out.println(original);
    System.out.println(copy);
  }

  
}