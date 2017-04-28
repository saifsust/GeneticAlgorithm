/**
 * 
 */
package GA_BASIC_TWO;

import java.util.Arrays;

/**
 * @author Saif_sust_2013331007
 *
 */
public class Population {

	/**
	 * @param args
	 */
	private Individual[] individual;

	public Population(int populationSize, boolean initial) {

		individual = new Individual[populationSize];

		if (initial) {
			for (int i = 0; i < populationSize; i++) {
				Individual newInd = new Individual();
				newInd.generateGeneration();
				setIndividual(newInd, i);
			}

		}
	}

	public Individual getFittest() {
		Individual fittest = individual[0];
		for (int i = 1; i < getSize(); i++) {
			if (fittest.getFitness() < individual[i].getFitness()) {
				fittest = individual[i];
			}
		}
		return fittest;
	}

	public Individual getIndividual(int index) {
		return individual[index];
	}

	public int getSize() {
		return individual.length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Population " + Arrays.toString(individual);
	}

	public void setIndividual(Individual ind, int index) {
		individual[index] = ind;
	}

	public static void main(String[] args) {
		Population pop = new Population(4, true);
		fitnessCalculation.setSolution("1000000001");
		System.out.println(pop);
		System.out.println(pop.getFittest());

	}

}
