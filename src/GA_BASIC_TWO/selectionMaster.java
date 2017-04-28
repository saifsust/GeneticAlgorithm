/**
 * 
 */
package GA_BASIC_TWO;

import java.util.Random;

/**
 * @author Saif_sust_2013331007
 *
 */
public class selectionMaster {

	/**
	 * @param args
	 */

	private static Individual fittest;
	private static int selectionSize = 10;
	private static Random rand = new Random();

	public static Individual selection(Population pop) {
		Population selectedPopulation = new Population(selectionSize, false);
		for (int i = 0; i < selectionSize; i++) {
			int index = rand.nextInt(pop.getSize());
			selectedPopulation.setIndividual(pop.getIndividual(index), i);
		}
		fittest = selectedPopulation.getFittest();
		return fittest;
	}

	public static void main(String[] args) {

		fitnessCalculation.setSolution("1000000001");
		Population pop = new Population(5,true);
		System.out.println(pop);
		System.out.println(selection(pop));
		
		
	}

}
