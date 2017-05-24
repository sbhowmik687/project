package com.fil.icecream.decorator;

import com.fil.icecream.component.Icecream;
import com.fil.icecream.component.SimpleIcecream;

abstract class IcecreamDecorator implements Icecream {

	  protected Icecream specialIcecream;

	  public IcecreamDecorator(Icecream specialIcecream) {
	    this.specialIcecream = specialIcecream;
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream();
	  }
	}