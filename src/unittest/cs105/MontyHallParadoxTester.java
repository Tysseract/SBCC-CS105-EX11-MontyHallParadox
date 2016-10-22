package unittest.cs105;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.MontyHallParadox;

public class MontyHallParadoxTester {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 12;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void test12345() {
		assertEquals(635, MontyHallParadox.simulateMontyHallParadox(1000, 12345));
		
		totalScore += 2;
	}
	
	@Test
	public void test23456() {
		assertEquals(6664, MontyHallParadox.simulateMontyHallParadox(10000, 23456));
		
		totalScore += 3;
	}

	@Test
	public void test34567() {
		assertEquals(66500, MontyHallParadox.simulateMontyHallParadox(100000, 34567));
		
		totalScore += 3;
	}
}
