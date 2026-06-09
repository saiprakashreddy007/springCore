package com.example.beans;

import com.example.interfaces.Ink;
import com.example.interfaces.Pen;

public class FountainPen implements Pen{
private Ink ink;
	@Override
	public void write() {
		// TODO Auto-generated method stub
System.out.println("writing with "+ink.getBrandColor()+"ink of "+ink.getColor());	
}

}
