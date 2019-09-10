package com.pack.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class Demo {
	
	private List theList;
	private Set theSet;
	private Map theMap;
	private Properties theProps;
	public void setTheList(List theList) {
		this.theList = theList;
	}
	public void setTheSet(Set theSet) {
		this.theSet = theSet;
	}
	public void setTheMap(Map theMap) {
		this.theMap = theMap;
	}
	public void setTheProps(Properties theProps) {
		this.theProps = theProps;
	}
	
	public void show1() {
		System.out.println(theList.getClass().getName());
		System.out.println(theList);
	}
	public void show2()
	{
		System.out.println(theSet.getClass().getName());
		System.out.println(theSet);
	}
	public void show3()
	{
		System.out.println(theMap.getClass().getName());
		System.out.println(theMap);
	}
	public void show4()
	{
		System.out.println(theProps);
	}

}
