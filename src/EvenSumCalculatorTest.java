public class EvenSumCalculatorTest {
    public static void main(String[] args) {

        //kiem thu chuc nang
        System.out.println("Test 1: " + EvenSumCalculator.calculateEvenSum(0)); // Kết quả đúng: 0.0
        System.out.println("Test 2: " + EvenSumCalculator.calculateEvenSum(5)); // Kết quả đúng: 6
        System.out.println("Test 3: " + EvenSumCalculator.calculateEvenSum(10)); // Kết quả đúng: 30

        //kiem thu dong dieu khien
        System.out.println("Test 4: " + EvenSumCalculator.calculateEvenSum(6)); // Kết quả đúng: 12
        System.out.println("Test 5: " + EvenSumCalculator.calculateEvenSum(8)); // Kết quả đúng: 20

    }
}
