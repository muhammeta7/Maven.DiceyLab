public class Simulation {

    private Integer numberOfTosses;
    private Integer minBin;
    private Integer maxBin;
    private Bins bins;
    private Dice dice;

    public Simulation(Integer numberOfDice, Integer numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
        this.minBin = numberOfDice;
        this.maxBin = numberOfDice * 6;
        this.bins = new Bins(minBin, maxBin);
        this.dice = new Dice(numberOfDice);
    }

    public void runSimulation() {

        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }

    }

    public void printResults() {

        System.out.println("Simulation of " + dice.getNumberOfDice() + " dice rolled " + numberOfTosses + " times");

        for (int i = minBin; i <= maxBin; i++) {
            Integer binNumber = i;
            Integer numberOfTimesRolled = bins.getBinsValue(binNumber);
            Double percentageRolled = (double) numberOfTimesRolled / (double)numberOfTosses;

            if (i < 10) {
                System.out.print("  Sum Of " + i + "'s rolled  | ");
            } else if (i < 100) {
                System.out.print(" Sum Of " + i + "'s rolled  | ");
            } else {
                System.out.print("Sum Of " + i + "'s rolled  | ");
            }
            System.out.printf("%7d  |  ", numberOfTimesRolled);
            System.out.printf("Percentage: %.2f ", percentageRolled);

            for (int stars = 1; stars < (percentageRolled * 100); stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public Integer getNumberOfTosses() {
        return numberOfTosses;
    }

    public Integer getMinBin() {
        return minBin;
    }

    public Integer getMaxBin() {
        return maxBin;
    }

    public Bins getBins() {
        return bins;
    }
}