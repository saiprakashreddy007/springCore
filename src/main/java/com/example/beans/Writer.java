package com.example.beans;

import com.example.interfaces.Pen;

public class Writer {
private Pen pen;

public Writer(Pen pen) {
	super();
	this.pen = pen;
}
public void write() {
	pen.write();
}
}
