import model.Sum;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Sum sum = new Sum();

        int[] nums = {-100, 3, 6, 1, 2, -10, 4}; // index 0,1,2

        // int result = new Count().countElementForEachCanItBe(nums);
        // System.out.println(result);

        int result = sum.sumOfNumsForEachExtra(nums);
        System.out.println(result);
        sum.sumOfNums(nums);
        sum.sumOfNumsForEach(nums);
    }
}