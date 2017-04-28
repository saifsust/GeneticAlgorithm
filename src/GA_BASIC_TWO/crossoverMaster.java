/**
 * 
 */
package GA_BASIC_TWO;

import java.util.Random;

/**
 * @author Saif_sust_2013331007
 *
 */
public class crossoverMaster {

	private static Individual newInd;
	private static final double crossOverUniformRate = 50;
	private static Random rand = new Random();

	public static Individual crossOver(Individual ind1, Individual ind2) {
		newInd = new Individual();
		for (int i = 0; i < ind2.getSize(); i++) {
			if (rand.nextInt(ind2.getSize()) <= crossOverUniformRate) {
				newInd.setGene(i, ind1.getGene(i));
			} else {
				newInd.setGene(i, ind2.getGene(i));
			}
		}

		return newInd;
	}

	public static void main(String[] args) {
		Population pop = new Population(100, true);
		fitnessCalculation.setSolution("1000000001");
		System.out.println(pop);
		System.out.println(crossOver(pop.getIndividual(0), pop.getIndividual(1)));
	}

}
