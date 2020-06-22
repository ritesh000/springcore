package com.spring.set;

import java.util.List;
import java.util.Set;

public class color {
	Set<String> color;

	public Set<String> getColor() {
		return color;
	}

	public void setColor(Set<String> color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "color [color=" + color + "]";
	}

}
