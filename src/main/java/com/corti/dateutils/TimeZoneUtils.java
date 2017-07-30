package com.corti.dateutils;

import java.util.Calendar;

public class TimeZoneUtils {
  
  /**
   * Return the default timezone
   * 
   * @return
   */
  public static String getCurrentZoneId() {
    return java.util.TimeZone.getDefault().getID();    
  }
  
  public static String getDisplayName() {
    return java.util.TimeZone.getDefault().getDisplayName();
  }

  // Change the default timezone to the one passed in, NOTE: This is setting it for the jvm
  // so be careful!!
  public static void setDefaultTimeId(String timeZoneId) {
    java.util.TimeZone newZone = java.util.TimeZone.getTimeZone(timeZoneId);
    java.util.TimeZone.setDefault(newZone);
    
  }
  
  public static String[] getTimeZones() {
    return java.util.TimeZone.getAvailableIDs();
  }
}
