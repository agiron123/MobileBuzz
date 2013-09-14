package com.example.localevents;

import java.sql.Date;

/*
<description_raw>String</description_raw>
<end_date>0001-01-01T00:00:00</end_date>
<end_date_string>String</end_date_string>
<end_time_string>String</end_time_string>
<event_image>String</event_image>
*/

public class LocalEvent {

	String description;
	Date startDate;
	Date endDate;
	String startTime;
	String endTime;
	String eventImage;
	
	public  LocalEvent(
			String description,
			Date startDate,
			Date endDate,
			String startTime,
			String endTime,
			String eventImage)
	{
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public Date getStartDate()
	{
		return this.startDate;
	}
	
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	
	public Date getEndDate()
	{
		return this.endDate;
	}
	
	public String getStartTime()
	{
		return this.startTime;
	}
	
	public void setStartTime(String startTime)
	{
		this.startTime = startTime;
	}
	
	public String getEndTime()
	{
		return this.endTime;
	}
	
	public void setEndTime(String endTime)
	{
		this.endTime = endTime;
	}
	
	public String getEventImage()
	{
		return this.eventImage;
	}
	
	public void setEventImage(String eventImage)
	{
		this.eventImage = eventImage;
	}
	
}
