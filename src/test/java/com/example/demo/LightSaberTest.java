package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LightSaberTest {
	@Test
	public void classExists(){
		LightSaber ls = new LightSaber(3910l);
		
		assertEquals(ls.getJediSerialNumber(),3910l);
	}
	
	@Test
	public void chargeCanBeModified() {
		LightSaber ls = new LightSaber(3910l);
		ls.setCharge(120f);
		
		assertEquals(ls.getCharge(),120f);
	}
	
	@Test
	public void canBeRecharged() {
		LightSaber ls = new LightSaber(3910l);
		ls.recharge();
		
		assertEquals(ls.getCharge(),100f);
	}
	
	@Test
	public void canBeColored() {
		LightSaber ls = new LightSaber(3910l);
		ls.setColor("Purple");
		
		assertEquals(ls.getColor(),"Purple");
	}
	
	@Test
	public void canBeUsed() {
		LightSaber ls = new LightSaber(3910l);
		float minutes = ls.getRemainingMinutes();
		ls.use(3);
		ls.use(4); 
		assertEquals(ls.getRemainingMinutes(),minutes-7f);
	}
}
