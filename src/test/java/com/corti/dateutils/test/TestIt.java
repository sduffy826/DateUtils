package com.corti.dateutils.test;

import com.corti.dateutils.Convert;
import com.corti.dateutils.TimeZoneUtils;

public class TestIt {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    java.util.Date aDate = Convert.getDateFromISO8601String("2017-07-23T01:52:00Z");
    System.out.print("aDate is: " + aDate + " Milliseconds: ");
    System.out.println(aDate.getTime());
    
    java.sql.Timestamp javaSqlTimestamp = new java.sql.Timestamp(aDate.getTime());
        
    System.out.println(aDate);
    System.out.println(aDate.toGMTString());
    
    java.sql.Timestamp javaSqlTS = Convert.getTimestampFromDate(aDate);
    System.out.print("SqlTimestamp: " + javaSqlTS + " MilliSeconds: ");
    System.out.println(javaSqlTS.getTime());
    
    java.sql.Date javaSqlDate = Convert.getDateFromDate(aDate);
    System.out.print("SqlDate: " + javaSqlDate + " MilliSeconds: ");
    System.out.println(javaSqlDate.getTime());
    
    java.sql.Time javaSqlTime = Convert.getTimeFromDate(aDate);
    System.out.println("SqlTime: " + javaSqlTime);    
        
    System.out.println(TimeZoneUtils.getCurrentZoneId());
    
    // Show all the timezones available
    String[] availableZones = TimeZoneUtils.getTimeZones();
    for (String azone : availableZones) {
      System.out.println(azone);
    }   
    
    System.out.println("Changing default zone");
    TimeZoneUtils.setDefaultTimeId("US/Pacific");
    System.out.println(TimeZoneUtils.getCurrentZoneId());
    
    System.out.println("aDate is: " + aDate);  
        
    System.out.println("Changing timezone back to NY");
    TimeZoneUtils.setDefaultTimeId("America/New_York");
    System.out.println(TimeZoneUtils.getCurrentZoneId());
    
    System.out.println("aDate is: " + aDate);     
  }
}
