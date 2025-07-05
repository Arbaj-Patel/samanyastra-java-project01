public class OverallAverageCalculator {

    public static void printOverallAverage(Students[] allStudents) {
        double totalPercentage = 0;
        int count = allStudents.length;

        for (int i = 0; i < count; i++) {
            totalPercentage += allStudents[i].percentage();
        }

        double average = totalPercentage / count;
        System.out.printf("\nOverall School Percentage Average: %.2f%%\n", average);
    }
}
