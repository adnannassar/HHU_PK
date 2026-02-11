package Klausuren.Jahr_2024.NebenKlausur.Aufageb_005;

public class Matrix {

    private final int[][] elements;

    public Matrix(int[][] elements) {
        if (elements == null || !isMatrix(elements)) {
            throw new IllegalArgumentException("no matrix given");
        }
        this.elements = elements;
    }

    private static boolean isMatrix(int[][] array) {
        for (int[] row : array) {
            if (row == null || array[0].length != row.length) {
                return false;
            }
        }
        return true;
    }

    public Matrix multiply(Matrix that) {
        if (that == null || this.elements[0].length != that.elements.length) {
            throw new IllegalArgumentException();
        }

        int[][] product = new int[this.elements.length][that.elements[0].length];

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < this.elements[0].length; k++) {
                    product[i][j] += this.elements[i][k] * that.elements[k][j];
                }
            }
        }

        return new Matrix(product);
    }

    @Override
    public String toString() {
        String erg = "";
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                erg += elements[i][j] + " ";
            }
            erg += "\n";
        }
        return erg;
    }
}
