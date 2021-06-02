package ІП_94._03_Бокій_Артем_Едуардович.first_pack.lab2;

public class Main {
    public static void main(String[] args) {
        // student book number = 9403
        //
        // C5 = 9403 % 5 = 3;
        // C7 = 9403 % 7 = 2;
        // C11 = 9403 % 11 = 9;
        // A +0 B
        // int
        // Знайти середнє значення елементів кожного стовпчика матриці

        short[][] A = {{14, 88, 27}, {22, 8, 54}, {133, 7, 0}};
        short[][] B = {{2, 19, 2}, {43, 127, 0}, {0, 0, 1}};

        try {
            if (A.length != B.length) throw new Error("Invalid rows count");
            for (int i = 0; i < A.length; i++) {
                if (A[i].length != B[i].length) {
                    throw new Error("Invalid columns count");
                }
            }
        } catch (Error e) {
            System.out.println(e);
            return;
        }

        MatrixTransformation matrixTransformation = new MatrixTransformation(A, B);

        System.out.println("A");
        printMatrix(A);
        System.out.println("B");
        printMatrix(B);

        short[][] C = matrixTransformation.calcXOR();
        System.out.println("C after XOR");
        printMatrix(C);

        double[] averageValues = matrixTransformation.findAverageColumnsValues();
        System.out.println("Average of values in columns: ");
        for (double value: averageValues) {
            System.out.print(value + " ");
        }

    }

    static void printMatrix(short[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
