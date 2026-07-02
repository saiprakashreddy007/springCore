package com.example.beans;

import com.example.interfaces.Ink;
import com.example.interfaces.Pen;

public class FountainPen implements Pen{
private Ink ink;
	@Override
	public void write() {
		//this is a wirte method
System.out.println("writing with "+ink.getBrandColor()+"ink of "+ink.getColor());	
}

}
