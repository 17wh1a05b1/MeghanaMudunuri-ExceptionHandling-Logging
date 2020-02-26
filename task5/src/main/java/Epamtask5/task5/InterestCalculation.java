package Epamtask5.task5;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestCalculation {
	public static void Interest() {
		Scanner sc = new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(InterestCalculation.class);
		LOGGER.info("CALCULATION OF INTEREST");
		try {
			LOGGER.info("Enter the Principal amount of Interest : ");
			double principal = sc.nextDouble();
			LOGGER.info("Enter the Time period of Interest : ");
			double time = sc.nextDouble();
			LOGGER.info("Enter the Rate of Interest : ");
			double rate = sc.nextDouble();
			LOGGER.info("Simple Interest is : " + ((principal * time * rate) / 100));
			LOGGER.info("Compound Interest is : " + ((principal * Math.pow(1 + (rate / 100), time)) - principal));
			LOGGER.info("----------------------------------------");
		} catch (Exception e) {
			LOGGER.warn("Please enter a valid input");
		}
	}
}

