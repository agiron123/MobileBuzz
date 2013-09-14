package com.example.localevents;

import java.sql.Date;

import com.google.gson.annotations.SerializedName;

public class LocalEvent {

	//Creating the parameters needed for gson
	@SerializedName("event_description")
	public String event_description;
	
	@SerializedName("start_date")
	public Date start_date;
	
	@SerializedName("end_date")
	public Date end_date;
	
	@SerializedName("start_time")
	public String start_time;
	
	@SerializedName("end_time")
	public String end_time;
	
	@SerializedName("event_image")
	public String event_image;
	
	
	//Leaving this in for now, probably going to remove later.
	//this code is no longer needed because of the gson implementation
	
	/*
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
	*/
}
