package com.elanlum.hackerRank.WarmUpChallenges;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

  static int sockMerchant(int n, int[] ar) {
    Set<Integer> colors = new HashSet<>();
    int pairs = 0;
    for(int i = 0; i < n; i++){
      if(!colors.contains(ar[i])){
        colors.add(ar[i]);
      }
    }
    for(int j : colors){
      int count = 0;
      for (int k = 0; k < n; k++){
        if (j == ar[k]){
          count++;
        }
      }
      pairs = pairs + count/2;
    }
    return pairs;
  }
}
