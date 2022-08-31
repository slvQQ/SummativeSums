public class Main {

    public static void main(String[] args) {
	// write your code here


        Main obj = new Main();

        int sumofArray = obj.findSumOfArrays(new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15});

        System.out.println(sumofArray);

    }

    public int findSumOfArrays(int[] arr){

        int sum = 0;

        for(int value: arr){

            sum+= value;
        }
        return sum;
    }


}
