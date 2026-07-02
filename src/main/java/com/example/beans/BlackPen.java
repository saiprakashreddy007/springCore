package com.example.beans;

import com.example.interfaces.Ink;

public class BlackPen implements Ink{

	@Override
	public String getColor() {
	//this is a colour method
		return "blue";
	}

	@Override
	public String getBrandColor() {
		//this is a brankcolor
		return "aprasa";
	}

}
