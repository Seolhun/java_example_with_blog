package com.pattern.part2.domain.store;

public class AbstractStore {
	private long index;
	private String name;
	private String address;

	public long getIndex(){
		return this.index;
	}

	public void setIndex(long index){
		this.index = index;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getAddress(){
		return this.name;
	}

	public void setAddress(String name){
		this.name = name;
	}	
}
