/**
 * 
 */
package GA_BASIC_TWO;

/**
 * @author Saif_sust_2013331007
 *
 */
public class geneticAlgorithm {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Population pop = new Population(2000, true);
		fitnessCalculation.setSolution("1111000000000010000000000001100000000000000000000000000000000001111");
		int generationCounter = 0;
		while (pop.getFittest().getFitness() < fitnessCalculation.getMaxFitness()) {

			System.out.println("Generation " + generationCounter);
			pop = evolutionMaster.evolution(pop);
			generationCounter++;
		}
		System.out.println("Final Generation " + generationCounter);
		System.out.println("Solution " + pop.getFittest());

	}

}
