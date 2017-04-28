/**
 * 
 */
package GA_BASIC_TWO;

/**
 * @author Saif_sust_2013331007
 *
 */
public class fitnessCalculation implements defaultArrayLength {

	/**
	 * @param args
	 */

	private static int[] solution = new int[size];

	public static void setSolution(String solutionString) {
		for (int i = 0; i < solutionString.length(); i++) {
			String ch = solutionString.substring(i, i + 1);
			if (ch.contains("0") || ch.contains("1")) {
				solution[i] = Integer.parseInt(ch);
			} else
				solution[i] = 0;
		}
	}

	public static int getFitness(Individual individual) {
		int fitness = 0;
		for (int i = 0; i < individual.getSize() && i < getMaxFitness(); i++) {
			if (individual.getGene(i) == solution[i]) {
				fitness++;
			}
		}
		return fitness;
	}

	public static int getMaxFitness() {
		return solution.length;
	}


}
