package com.fil.icecream.decorator;

import com.fil.icecream.component.Icecream;
import com.fil.icecream.component.SimpleIcecream;

public class HoneyDecorator extends IcecreamDecorator {

	  public HoneyDecorator(Icecream specialIcecream) {
	    super(specialIcecream);
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addHoney();
	  }

	  private String addHoney() {
	    return " + sweet honey";
	  }
	}
