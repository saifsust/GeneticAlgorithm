/**
 * 
 */
package GA_BASIC_TWO;

/**
 * @author Saif_sust_2013331007
 *
 */
public class evolutionMaster {

	/**
	 * @param args
	 */
	private static Individual ind1, ind2, ind3;

	public static Population evolution(Population pop) {
		Population newPop = new Population(pop.getSize(), false);
		ind1 = null;
		ind2 = null;
		ind3 = null;
		for (int i = 0; i < pop.getSize(); i++) {
			ind1 = selectionMaster.selection(pop);
			ind2 = selectionMaster.selection(pop);
			ind3 = crossoverMaster.crossOver(ind1, ind2);
			newPop.setIndividual(ind3, i);
		}
		ind3 = null;
		for (int i = 0; i < newPop.getSize(); i++) {
			ind3 = mutationMaster.mutation(newPop.getIndividual(i));
			newPop.setIndividual(ind3, i);
		}

		return newPop;
	}

	public static void main(String[] args) {
		Population pop = new Population(5, true);
		fitnessCalculation.setSolution("1000000001");
		System.out.println(pop);
		pop = evolutionMaster.evolution(pop);
		System.out.println(pop);
	}

}
