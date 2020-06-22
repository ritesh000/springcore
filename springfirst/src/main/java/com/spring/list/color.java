package com.spring.list;

import java.util.List;

public class color {
   List<String> color;

public List<String> getColor() {
	return color;
}

public void setColor(List<String> color) {
	this.color = color;
}

@Override
public String toString() {
	return "color [color=" + color + "]";
}


   
}
