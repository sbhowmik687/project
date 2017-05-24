package com.fil.icecream.decorator;

import com.fil.icecream.component.Icecream;
import com.fil.icecream.component.SimpleIcecream;

public class NuttyDecorator extends IcecreamDecorator {

	  public NuttyDecorator(Icecream specialIcecream) {
	    super(specialIcecream);
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addNuts();
	  }

	  private String addNuts() {
	    return " + cruncy nuts";
	  }
	}
