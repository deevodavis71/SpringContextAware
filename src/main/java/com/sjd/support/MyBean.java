package com.sjd.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements IBean
{

	@Autowired
	private IOther other;

	@Value("${meaning.of.life:99}")
	private int meaningOfLife;

	public String doSomething ()
	{
		return "From the Bean! (" + other.doOther() + ") - meaning of life = " + meaningOfLife;
	}

}
