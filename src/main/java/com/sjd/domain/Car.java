package com.sjd.domain;

import com.github.jonpeterson.jackson.module.versioning.JsonSerializeToVersion;
import com.github.jonpeterson.jackson.module.versioning.JsonVersionedModel;
import com.sjd.converters.ToCurrentCarConverter;
import com.sjd.converters.ToPastCarConverter;

@JsonVersionedModel(currentVersion = "3", toCurrentConverterClass = ToCurrentCarConverter.class, toPastConverterClass = ToPastCarConverter.class)
public class Car
{

	private String make;
	private String model;
	private int year;
	private boolean used;

	@JsonSerializeToVersion
	private String serializeToVersion;

	public String getMake ()
	{
		return make;
	}

	public void setMake (String make)
	{
		this.make = make;
	}

	public String getModel ()
	{
		return model;
	}

	public void setModel (String model)
	{
		this.model = model;
	}

	public int getYear ()
	{
		return year;
	}

	public void setYear (int year)
	{
		this.year = year;
	}

	public boolean isUsed ()
	{
		return used;
	}

	public void setUsed (boolean used)
	{
		this.used = used;
	}

	public String getSerializeToVersion ()
	{
		return serializeToVersion;
	}

	public void setSerializeToVersion (String serializeToVersion)
	{
		this.serializeToVersion = serializeToVersion;
	}

}
