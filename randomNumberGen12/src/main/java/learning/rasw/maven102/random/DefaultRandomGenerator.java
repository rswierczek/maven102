package learning.rasw.maven102.random;

import org.apache.commons.math3.random.RandomDataGenerator;

public class DefaultRandomGenerator implements RandomGenerator
{

    public String name()
    {
	return "Main Randon Number Generator";
    }

    public int generate()
    {
	final RandomDataGenerator aRandomDataGenerator = new RandomDataGenerator();
	return aRandomDataGenerator.nextInt(5, 10);
    }

}
