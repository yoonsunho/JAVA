package array;

public class ArrayDio1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0;row<2;row++ ){
            for(int col = 0;col<=2;col++){
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }
    }

}
