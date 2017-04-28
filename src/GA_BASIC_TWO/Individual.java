/**
 * 
 */
package GA_BASIC_TWO;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Saif_sust_2013331007
 *
 */
public class Individual implements defaultArrayLength {

	/**
	 * @param args
	 */

	private int[] Genes = new int[size];
	private Random rand = new Random();
	private int fitness = 0;

	public void generateGeneration() {
		for (int i = 0; i < getSize(); i++) {
			Genes[i] = rand.nextInt(2);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public void setGene(int index, int gene) {
		this.Genes[index] = gene;
	}

	public int getSize() {
		return Genes.length;
	}

	public int getGene(int index) {
		return Genes[index];
	}

	public int getFitness() {
		if (this.fitness == 0) {
			this.fitness = fitnessCalculation.getFitness(this);
		}
		return this.fitness;
	}

	@Override
	public String toString() {
		String offString = "";
		for (int i = 0; i < getSize(); i++) {
			offString += Genes[i];
		}
		return offString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individual ind = new Individual();
		fitnessCalculation.setSolution("1000000001");
		ind.generateGeneration();
		System.out.println(ind);
		System.out.println(ind.getFitness());
		System.out.println(ind.getGene(0));

	}

}
