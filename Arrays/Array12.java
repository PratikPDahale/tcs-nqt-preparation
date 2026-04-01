package Arrays;
/*
Program for addition of two matrices

Given two N x M matrices. Find a N x M matrix as the sum of given matrices each value at the sum of values of corresponding elements of the given two matrices. 

Approach: Below is the idea to solve the problem.

Iterate over every cell of matrix (i, j), add the corresponding values of the two matrices and store in a single matrix i.e. the resultant matrix.

Follow the below steps to Implement the idea:

Initialize a resultant matrix res[N][M].
Run a for loop for counter i as each row and in each iteration:
Run a for loop for counter j as each column and in each iteration:
Add values of the two matrices for index i, j and store in res[i][j].
Return res.
Below is the Implementation of above approach.
*/
public class Array12 {
    public static void add(int[][] A, int[][] B, int[][] C) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
        int[][] B = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
        int[][] C = new int[4][3];
        add(A, B, C);

        System.out.println("Result matrix is:");
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
