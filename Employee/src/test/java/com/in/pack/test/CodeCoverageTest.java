package com.in.pack.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.in.pack.CodeCoverage;

class CodeCoverageTest {

	@Test
	void test() {
		Assert.assertEquals(CodeCoverage.Start(), "start");
	}
	@Test
	public void test2() {
		Assert.assertEquals(CodeCoverage.Stop(),"stop");
	}

}
