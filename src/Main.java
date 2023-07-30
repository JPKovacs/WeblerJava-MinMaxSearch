import model.Sum;
import model.Min;
import model.Max;

public class Main {
    public static void main(String[] args) {
        // Sum sum = new Sum();

        int[] nums = {2345, 100000, -120, -110, 100, 196, 10, 1110};
        // int[] nums = {121, -100, 3, 6, 1, 156, 2, -196, -10, 4, -110, 199};

        // int result = new Min().minOfNums(nums);
        // System.out.println("The min value of the array is: " + result);

        int result = new Max().maxOfNums(nums);
        System.out.println("The max value of the array is: " + result);

        // int result = new Count().countElementForEachCanItBe(nums);
        // System.out.println(result);

        // int result = sum.sumOfNumsForEachExtra(nums);
        // System.out.println(result);
        // sum.sumOfNums(nums);
        // sum.sumOfNumsForEach(nums);
    }
}