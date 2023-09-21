public class StudentGrade {
    public static double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }
}
