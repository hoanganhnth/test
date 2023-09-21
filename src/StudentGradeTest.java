public class StudentGradeTest {
    public static void main(String[] args) {
        int[] emptyGrades = {}; // Phân vùng 1: Mảng điểm trống
        int[] singleGrade = {80}; // Phân vùng 2: Mảng điểm có một phần tử
        int[] multipleGrades = {75, 85, 90}; // Phân vùng 3: Mảng điểm có nhiều phần tử

        System.out.println("Test 1 (Empty Grades): " + StudentGrade.calculateAverage(emptyGrades)); // Kết quả đúng: 0.0
        System.out.println("Test 2 (Single Grade): " + StudentGrade.calculateAverage(singleGrade)); // Kết quả đúng: 80.0
        System.out.println("Test 3 (Multiple Grades): " + StudentGrade.calculateAverage(multipleGrades)); // Kết quả đúng: 83.33333333333333
    }

}
