package Epamtask5.task5;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction {
	public static void ConstructionCost() {
		Scanner sc = new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(Construction.class);
		LOGGER.info("CALCULATION OF CONSTRUCTION COST");
		LOGGER.info("Please select the Material for construction : ");
		LOGGER.info("1. Standard Materials");
		LOGGER.info("2. Above Standard Materials");
		LOGGER.info("3. High Standard Materials");
		LOGGER.info("4. High Standard Materials and Fully Automated home");
		try {
			int ch = sc.nextInt();
			double area, cost;
			switch(ch) {
			case 1:
				LOGGER.info("Enter the area of the house : ");
				area = sc.nextDouble();
				cost = (1200 * area);
				LOGGER.info("Cost to build the house in rupees is : " + cost);
				break;
			case 2:
				LOGGER.info("Enter the area of the house : ");
				area = sc.nextDouble();
				cost = (1500 * area);
				LOGGER.info("Cost to build the house in rupees is : " + cost);
				break;				
			case 3:
				LOGGER.info("Enter the area of the house : ");
				area = sc.nextDouble();
				cost = (1800 * area);
				LOGGER.info("Cost to build the house in rupees is : " + cost);
				break;
			case 4:
				LOGGER.info("Enter the area of the house : ");
				area = sc.nextDouble();
				cost = (2500 * area);
				LOGGER.info("Cost to build the house in rupees is : " + cost);
				break;
			default:
				LOGGER.info("Please choose from 1-4");
			}
		} catch (Exception e) {
			LOGGER.error("Please enter a valid input");
		}
	}
}
