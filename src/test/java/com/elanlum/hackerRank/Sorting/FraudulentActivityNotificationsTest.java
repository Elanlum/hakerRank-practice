package com.elanlum.hackerRank.Sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FraudulentActivityNotificationsTest {

  @Test
  void activityNotifications() {
    int d = 3;
    int[] expediture = {10, 20, 30, 40, 50};

    assertEquals(1, FraudulentActivityNotifications.activityNotifications(expediture, d));
  }
}