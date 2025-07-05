public class Score {
    String subject;
    int marks;

   public Score(String subject,int marks){
        this.subject=subject;
        this.marks=marks;
    }


    char grade() {
        if (marks >= 90) return 'A';
        if (marks >= 80) return 'B';
        if (marks >= 70) return 'C';
        if (marks >= 60) return 'D';
        if (marks >= 50) return 'E';
        return 'F';
    }

    @Override
    public String toString() {
        return subject + ": " + marks + " (" + grade() + ")";
    }
}
