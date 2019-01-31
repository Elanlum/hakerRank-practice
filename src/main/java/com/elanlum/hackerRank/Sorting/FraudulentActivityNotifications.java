package com.elanlum.hackerRank.Sorting;

import java.util.Arrays;

@SuppressWarnings("Duplicates")
public class FraudulentActivityNotifications {

  static int activityNotifications(int[] expenditure, int d) {

    int i = 0; 
    int j = i + d;
    int notificationCounter = 0;

    while(j < expenditure.length){

      int[] collectData = Arrays.copyOfRange(expenditure, i, j);

      float median = findMedian(collectData);
      if((float)expenditure[j] >= 2*median){
        notificationCounter++;
      }
      i++;
      j++;
    }
    return notificationCounter;
  }

  private static float findMedian(int[] inputArray){
    Arrays.sort(inputArray);
    int length = inputArray.length;
    if(inputArray.length % 2 != 0){
      return (float)inputArray[inputArray.length / 2];
    } else {
      return (float)(inputArray[length / 2 - 1] + inputArray[length / 2]) / 2;
    }
  }
}
