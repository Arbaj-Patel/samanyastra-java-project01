public class Students {
    String name;
    int sClass;
    String batch;
    Score[] scoreData;

    double percentage() {
        int total = 0;
        for (int i = 0; i < scoreData.length; i++) {
            total += scoreData[i].marks;
        }
        return (double) total / scoreData.length;
    }

    @Override
    public String toString() {
        String result = "Name   : " + name + "\n";
        result += "Class  : " + sClass + "\n";
        result += "Batch  : " + batch + "\n";
        result += "Scores :\n";
        for (int i = 0; i < scoreData.length; i++) {
            result += "  " + scoreData[i] + "\n";
        }
        return result;
    }

}