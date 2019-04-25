package com.sk.springcore_app2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.sk.springcore_app2.DailyFortuneService;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class VolleyBallCoachTest {

	
	BaseballCoach classInstanceForTestingMethodInIt;
	
	@BeforeAll
	void beforeAllInit() {
		System.out.println("This needs to be run before all");
	}
	@BeforeEach
	void init() {
		System.out.println("initialize Test class for every Test case");
		classInstanceForTestingMethodInIt = new BaseballCoach(new DailyFortuneService());
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("cleanup....");
	}
	
	
	@Test
	@DisplayName("Testing test1 method")
	void test1() {
		//fail("Not yet implemented");
		System.out.println("this test executes");
		String expected = "practice blocking of smash in volleyball";
		String actual = classInstanceForTestingMethodInIt.getDailyWorkout();
		assertEquals(expected, actual,"Gives daily fortune");
		
	}
	
	@Test
	void test2() {
		//fail("Not yet implemented");
		System.out.println("this test executes");
		String expected = "you are very hard working guy!!!!!!!";
		String actual = classInstanceForTestingMethodInIt.getDailyFortune();
		assertEquals(expected, actual,"Gives daily fortune");
		
	}
	
	@Test
	@Disabled
	@DisplayName("test testDisabled method")
	void testDisabled() {
		System.out.println("inside testDisabled");
		fail("Not yet implemented");
		
		
	}

}
