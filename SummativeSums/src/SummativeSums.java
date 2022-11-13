public class SummativeSums {
    public static void main(String[] args) {

        int [] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int [] arr2 = { 999, -60, -77, 14, 160, 301 };
        int [] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        // Variables holding returned sum result from method
        int sum1 = arraySum(arr1);
        int sum2 = arraySum(arr2);
        int sum3 = arraySum(arr3);

        // Printing results
        System.out.println("#1 Array Sum: " + sum1);
        System.out.println("#2 Array Sum: " + sum2);
        System.out.println("#3 Array Sum: " + sum3);

    } // End of main

    // for loop going through the index values and adding them up in sum variable
    public static int arraySum( int []x){
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            int indexValue = x[i];
            sum += indexValue;
        }return sum;
    } // End of arraySum method

} // End of class