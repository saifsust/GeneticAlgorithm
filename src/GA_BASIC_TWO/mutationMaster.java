/**
 * 
 */
package GA_BASIC_TWO;

import java.util.Random;

/**
 * @author Saif_sust_2013331007
 *
 */
public class mutationMaster {

	/**
	 * @param args
	 */

	private static final double mutationRate = 0.015;
	private static Random rand = new Random();

	public static Individual mutation(Individual ind) {

		for (int i = 0; i < ind.getSize(); i++) {
			if (Math.random() <= mutationRate) {
				int gene = rand.nextInt(2);
				ind.setGene(i, gene);
			}
		}
		return ind;
	}

	public static void main(String[] args) {
		Population pop = new Population(100, true);
		fitnessCalculation.setSolution("1000000001");
		System.out.println(pop);
		System.out.println(mutation(pop.getIndividual(0)));
	}

}
