package PGO_ggc_s22563.PGO_04;

public class Matrix {
  private static int EmptyRowsNow = 0;
  private static int[][] MatrixStats;
  private int[][] Matrix;

  private Matrix(int[][] MatrixStats) {
    MatrixStats = null;
    Matrix = MatrixStats;
    EmptyRowsNow = 0;
  }

  public static void SetUpMatrix(int rowCount, int columnCount) {
    MatrixStats = new int[rowCount][columnCount];
  }

  public static void insertRow(int[] rows) {
    if (rows != null) {
      if (rows.length == 3 && EmptyRowsNow <= MatrixStats[0].length) {
        for (int i = 0; i < MatrixStats.length; i++) {
          MatrixStats[EmptyRowsNow][i] = rows[i];
        }
        EmptyRowsNow++;
      } else {
        System.out.println("too much numbers in args");
      }
    } else {
      System.out.println("Provide number int type arg");
    }
  }

  public static Matrix create() {
    return new Matrix(MatrixStats);
  }

  // ========================================
  // setter

  // ========================================

  // ========================================

  // ========================================

  public Matrix add(Matrix MatrixB) {
    if (MatrixB == null) {
      System.out.println("Null ");
      return null;
    }
    for (int rows = 0; rows < Matrix.length; rows++) {
      for (int col = 0; col < Matrix[rows].length; col++) {
        Matrix[rows][col] = Matrix[rows][col] + MatrixB.Matrix[rows][col];
      }
    }
    return this;
  }

  // ========================================
  public static Matrix add(Matrix MatrixA, Matrix MatrixB) {
    if (MatrixA == null || MatrixB == null) {
      System.out.println("Null");
      return null;
    }
    int[][] newMatrix = new int[MatrixStats.length][MatrixStats[0].length];
    for (int row = 0; row < newMatrix.length; row++) {
      for (int xCol = 0; xCol < newMatrix[row].length; xCol++) {
        newMatrix[row][xCol] = MatrixA.Matrix[row][xCol] + MatrixB.Matrix[row][xCol];
      }
    }
    return new Matrix(newMatrix);
  }

  // ========================================
  public void print() {
    for (int[] ints : MatrixStats) {
      System.out.print("| ");
      for (int anInt : ints) {
        System.out.print(anInt + " ");
      }
      System.out.print("|");
      System.out.println();
    }
  }

  // ========================================
  public Matrix multiple(Matrix MatrixB) {
    if (MatrixB == null || this.Matrix == null) {
      System.out.println("Matrix is null");
      return null;
    }
    if (MatrixB.Matrix.length == Matrix[0].length && MatrixB.Matrix[0].length == Matrix.length) {
      int Space = Math.min(MatrixB.Matrix.length, MatrixB.Matrix[0].length);
      int[][] newMatrix = new int[Space][Space];
      for (int x = 0; x < this.Matrix.length; x++)
        for (int xCol = 0; x < this.Matrix[x].length; x++)
          newMatrix[x][xCol] = this.Matrix[x][xCol] * MatrixB.Matrix[x][xCol];
      return new Matrix(newMatrix);
    } else {
      System.out.println("Wrong Data");
      return null;
    }
  }

  // ========================================
  public Matrix subtract(Matrix Matrix2) {
    if (Matrix2 == null) {
      System.out.println("Null");
      return null;
    } else {

      for (int x = 0; x < Matrix.length; x++) {
        for (int xCol = 0; xCol < Matrix[x].length; xCol++) {
          Matrix[x][xCol] = Matrix[x][xCol] - Matrix2.Matrix[x][xCol];
        }
      }
    }
    return this;
  }

}
