package com.example.beans;

import com.example.interfaces.Ink;

public class BlackPen implements Ink{

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public String getBrandColor() {
		// TODO Auto-generated method stub
		return "aprasa";
	}

}
