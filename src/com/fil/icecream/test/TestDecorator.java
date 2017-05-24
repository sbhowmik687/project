package com.fil.icecream.test;

import com.fil.icecream.component.Icecream;
import com.fil.icecream.component.SimpleIcecream;
import com.fil.icecream.decorator.HoneyDecorator;
import com.fil.icecream.decorator.NuttyDecorator;

public class TestDecorator {
	public static void main(String args[]) {
	    Icecream icecream = new HoneyDecorator(new  NuttyDecorator(new SimpleIcecream()));
	    System.out.println(icecream.makeIcecream());
   }
}
