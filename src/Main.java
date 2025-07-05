public class Main {
    public static void main(String[] args) {

        // ----- Student 1 -----
        Students student1 = new Students();
        student1.name   = "John Doe";
        student1.sClass = 12;
        student1.batch  = "2018";
        student1.scoreData = new Score[] {
                new Score("Physics", 45),
                new Score("Biology", 90),
                new Score("Math", 70),
                new Score("Chemistry", 60),
                new Score("Computer Science", 80)
        };

        // ----- Student 2 -----
        Students student2 = new Students();
        student2.name   = "John Blake";
        student2.sClass = 11;
        student2.batch  = "2018";
        student2.scoreData = new Score[] {
                new Score("Physics", 85),
                new Score("Biology", 92),
                new Score("Math", 78),
                new Score("Chemistry", 88),
                new Score("Computer Science", 95)
        };

        // ----- Student 3 -----
        Students student3 = new Students();
        student3.name   = "Joseph Marino";
        student3.sClass = 10;
        student3.batch  = "2018";
        student3.scoreData = new Score[] {
                new Score("Physics", 60),
                new Score("Biology", 55),
                new Score("Math", 50),
                new Score("Chemistry", 65),
                new Score("Computer Science", 75)
        };

        // ----- Student 4 -----
        Students student4 = new Students();
        student4.name   = "Jason Bourne";
        student4.sClass = 11;
        student4.batch  = "2019";
        student4.scoreData = new Score[] {
                new Score("Physics", 90),
                new Score("Biology", 70),
                new Score("Math", 60),
                new Score("Chemistry", 49),
                new Score("Computer Science", 91)
        };
        Students student5 = new Students();
        student5.name   = "Naruto Uzumaki";
        student5.sClass = 12;
        student5.batch  = "2018";
        student5.scoreData = new Score[] {
                new Score("Physics", 80),
                new Score("Biology", 90),
                new Score("Math", 50),
                new Score("Chemistry", 57),
                new Score("Computer Science", 65)
        };


        Students[] allStudents = { student1, student2, student3,student4,student5 };

        System.out.println("-------All Students Percentage-------");
        for (int i = 0; i < allStudents.length; i++ ){
            System.out.println(allStudents[i].name+":"+allStudents[i].percentage()+"%");
        }
        System.out.println("-----------------------------");

        ClassAverageCalculator.printClassAverages(allStudents);

        System.out.println("-----------------------------");

        OverallAverageCalculator.printOverallAverage(allStudents);

        System.out.println("-----------------------------");



        for (int i = 0; i < allStudents.length; i++) {
            System.out.println(allStudents[i]);
            System.out.println("-----------------------------");
        }
    }
}
