package ІП_94._03_Бокій_Артем_Едуардович.first_pack.lab2;

public class MatrixTransformation {
    private short[][] A;
    private short[][] B;
    private short[][] C;
    private boolean isCalcXORCalled;
    public MatrixTransformation(short[][] A, short[][] B) {

        C = new short[A.length][A[0].length];
        this.A = A;
        this.B = B;
        isCalcXORCalled = false;
    }

    public short[][] calcXOR() {
        isCalcXORCalled = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = (short)(A[i][j] ^ B[i][j]);
            }
        }
        return C;
    }

    public double[] findAverageColumnsValues() {
        if (isCalcXORCalled) {
            double[] averageValues = new double[C[0].length];
            for (int i = 0; i < C.length; i++) {
                short columnSum = 0;
                for (int j = 0; j < C[i].length; j++) {
                    columnSum += C[j][i];
                }
                averageValues[i] = (double)columnSum / C[i].length;
            }
            return averageValues;
        }
        return new double[]{};

    }
}
