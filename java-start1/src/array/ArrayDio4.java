package array;

public class ArrayDio4 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        int i = 1;

        for(int row = 0; row < arr.length;row ++){
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col] = i++;
            }
        }


        for(int row = 0;row<arr.length;row++ ){
            for(int col = 0;col<arr[row].length;col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }

}
