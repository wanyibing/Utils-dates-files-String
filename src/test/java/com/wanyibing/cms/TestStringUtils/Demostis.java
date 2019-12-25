package com.wanyibing.cms.TestStringUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.wanyibing.cms.utils.CarUtils;



public class Demostis {


	@Test
	public void dest1() {
		
	int s;
		s=CarUtils.setcar(66, 142);
		System.out.println(s);
	}
	
	@Test
	public void dest2() {
		
	String  s="A";
		CarUtils.typeid(s);
		
		
		System.out.println(CarUtils.typeid(s));
	}
	
	@Test
	public void dest3() {
		
	String  s="京H17453";
		CarUtils.carid(s);
		
		
		System.out.println(CarUtils.typeid(s));
	}
	
	@Test
	public void dest4() {
		
		int s= CarUtils.looplevel(0, "沪F05200", "C");
		
		System.out.println(s);
	}
	
	@Test
	public void dest5() {
		
		String s= CarUtils.passyn(50, "沪F05200", "C");
		
		System.out.println(s);
	}
	
}
