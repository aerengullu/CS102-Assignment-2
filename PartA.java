import java.util.Random;

public class PartA {
    public static int[] create(int length){
        Random random = new Random();
        int[] numbers = new int[length];
        for(int i = 0; i < length; i++ ){
            numbers[i] = random.nextInt(101);
        }
        return numbers;
    }
}
