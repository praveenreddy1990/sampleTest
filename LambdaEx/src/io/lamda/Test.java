package io.lamda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException{
		isRTMSInUpdate();
	}
	public static  boolean isRTMSInUpdate() throws ParseException {
		boolean isRTMSUp = false;
		String startTime = "16:00";
	    String endTime = "18:00";
	    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	    Date rtmsStartTime = sdf.parse(startTime);
	    Date rtmsEndTime = sdf.parse(endTime);
	    Date currentTime = sdf.parse(sdf.format(new Date()));
	    
	   System.out.println("RTMS start time "+rtmsStartTime.toString()+" RTMS end time "+rtmsEndTime.toString()+" currentTime "+currentTime.toString());
	   if(currentTime.after(rtmsStartTime) && currentTime.before(rtmsEndTime)) {
		  isRTMSUp = true; 
		  System.out.println("RTMS is in update mode");
	   }
	   
		return isRTMSUp;
		}
	   
	}
