package com.corti.dateutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Convert {

  /**
   * Format string in 'YYYY-MM-DDTHH:MM:SSZ' format
   * 
   * @param iso8601DateString
   * @return
   */
  public static java.util.Date getDateFromISO8601String(
      String iso8601DateString) {
    SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz");

    // Change the Z to GMT-00:00
    iso8601DateString = iso8601DateString.substring(0,
        iso8601DateString.length() - 1) + "GMT-00:00";

    try {
      return sDF.parse(iso8601DateString);
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    }
  }
  
  /**
   * Return a sql Timestamp from a java.util.Date object
   * @param theDate a java.util.Date object
   * @return sql Timestamp representation of theDate 
   */
  public static java.sql.Timestamp getTimestampFromDate(java.util.Date theDate) {
    return new java.sql.Timestamp(theDate.getTime());
  } 
  
  /**
   * Return a sql Timestamp from a java.util.Date object
   * @param theDate a java.util.Date object
   * @return sql Timestamp representation of theDate 
   */
  public static java.sql.Timestamp getTimestampFromISO8601String(String iso8601DateString) {    
    return getTimestampFromDate(getDateFromISO8601String(iso8601DateString));
  }
  
  
  /**
   * Return a sql Time from a java.util.Date object
   * @param theDate a java.util.Date object
   * @return sql Time representation of theDate 
   */
  public static java.sql.Time getTimeFromDate(java.util.Date theDate) {
    return new java.sql.Time(theDate.getTime());
  } 
  
  /**
   * Return a sql Date from a java.util.Date object
   * @param theDate a java.util.Date object
   * @return sql Date representation of theDate 
   */
  public static java.sql.Date getDateFromDate(java.util.Date theDate) {
    return new java.sql.Date(theDate.getTime());
  }
}
