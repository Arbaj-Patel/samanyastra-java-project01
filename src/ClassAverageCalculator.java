public class ClassAverageCalculator {

    public static void printClassAverages(Students[] allStudents) {
        double[] classTotals = new double[15];
        int[]    classCounts = new int[15];

        for (int i = 0; i < allStudents.length; i++) {
            int cls = allStudents[i].sClass;
            double percentage = allStudents[i].percentage();
            classTotals[cls] += percentage;
            classCounts[cls]++;
        }

        System.out.println("\n--- Class-wise Averages ---");
        for (int cls = 1; cls <= 12; cls++) {
            if (classCounts[cls] > 0) {
                double avg = classTotals[cls] / classCounts[cls];
                System.out.printf("Class %d: %.2f%%\n", cls, avg);
            }
        }
    }
}
