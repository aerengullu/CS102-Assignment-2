public class partC{
    public static void findMinMax(int[] arr) {

        int min = 101;
        int max = -1;
        

        for( int i = 0; i < arr.length; i++ ){
            if( arr[i] < min ){
                min = arr[i];
            }
            else if( arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}