package com.pattern.part2.domain.store;

import com.pattern.part2.domain.item.Item;

import java.util.Date;

public class ShoesStore extends StoreDomain implements Store {
	private String category;
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public void openStore(String name){
		this.setName(name);
		System.out.println("ShoesStore : " +this.getName()+" Opend, Date : "+ new Date());
	}
	
	@Override
	public void receiveItem(Item item) {
		System.out.println("ShoesStore : receiveItem() : "+item.toString());
	}
	
	@Override
	public void detailStore() {
		System.out.println("ConvenienceStore : detailStore() : "+this.toString());
	}
} 