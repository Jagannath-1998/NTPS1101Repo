package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class AppTest {
  @Test
	public void testWithPositives() {
		Arithmetic ar = new Arithmetic();
		int expected=30;
		int actual=ar.sum(10, 20);
		assertEquals(expected, actual);
	}

}
