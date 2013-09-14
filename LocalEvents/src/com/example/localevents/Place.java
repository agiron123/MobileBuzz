package com.example.localevents;

import com.google.gson.annotations.SerializedName;

public class Place {
	
	@SerializedName("latitude")
	public double latitude;
	
	@SerializedName("longitude")
	public double longitude;
	
	@SerializedName("address")
	public String address;
	
	@SerializedName("city")
	public String city;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("state")
	public String state;
	
	@SerializedName("url")
	public String url;
	
	@SerializedName("zip")
	public String zip;
	
	@SerializedName("foursquare_id")
	public String foursquare_id;
	
	/*
	double latitude;
	double longitude;

	String address1;
	String address2;
	String city;
	String name;
	String state;
	String url;
	String zip;
	String foursquare_id;
	
	public Place(String name, String foursquare_id)
	{
		this.name = name;
		this.foursquare_id = foursquare_id;
	}
	
	*/
	/*
	Place[] myPlaces = new Place[25];
	myPlaces[0] = new Place("Laughing Skull Lounge", "asdfhasdkjfhasdkfjas");
	*/

	
	
	
	/*
	public Place(double lat, double lon, String address1, String city, String name, String state, String url, String zip, String foursquare_id)
	{
		this.latitude = lat;
		this.longitude = lon;
		this.address1 = address1;
		this.city = city;
		this.name = name;
		this.state = state;
		this.url = url;
		this.zip = zip;
		this.foursquare_id = foursquare_id;
	}
	
	//Getters and Setters
	public double getLatitude()
	{
		return this.latitude;
	}
	
	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}
	
	public double getLongitude()
	{
		return this.longitude;
	}
	
	public double setLongitude()
	{
		return this.longitude;
	}
	
	public String getAddress()
	{
		return this.address1;
	}
	
	public void setAddress(String address)
	{
		this.address1 = address;
	}

	public String getCity()
	{
		return this.city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getUrl()
	{
		return this.url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getZip()
	{
		return this.zip;
	}
	
	public void setZip(String zip)
	{
		this.zip = zip;
	}
	*/
}