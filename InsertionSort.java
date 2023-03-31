package com.lovelace;

import org.json.simple.*;
import org.json.simple.JSONObject;

public class InsertionSort {

  private static int count = 0;

  public static void main(String[] args) {
    String fileName ="/Users/beverlyndi/Documents/lovelace-cupcake-example-code/cupcake_3906.json";
   
    JSONArray cupcakeArray = JSONFile.readArray(fileName);
    String[] cupcakeNameArray = nameArray(cupcakeArray);
    System.out.println(cupcakeNameArray);

    System.out.println("----- Unsorted array -----");
    print(cupcakeNameArray);

    InsertSort(cupcakeNameArray);

    System.out.println("----- Sorted array----- ");
    print(cupcakeNameArray);

    System.out.println("----- Statistics -----");
    System.out.printf("Size of array = %d\n", cupcakeNameArray.length);
    System.out.printf("Count = %d\n", count);
  }

  public static void print(String[] cupcakeNameArray) {
    System.out.printf("Number\tName\n");
    System.out.printf("------\t---------------\n");
    for (int i = 0; i < cupcakeNameArray.length; i++) {
      System.out.printf("%04d\t%s\n", i, cupcakeNameArray[i]);
    }
  }

  public static String[] nameArray(JSONArray cupcakeArray) {
    String[] arr = new String[cupcakeArray.size()];

    for (int i = 0; i < cupcakeArray.size(); i++) {
      JSONObject o = (JSONObject) cupcakeArray.get(i);
      String name = (String) o.get("name");
      arr[i] = name;
    }
    return arr;
  }

  public static void InsertSort(String[] arr) {
  }

  void sort(String arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      String key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j].compareTo(key) > 0) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }
}
