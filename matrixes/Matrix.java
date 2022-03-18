package lab3.matrixes;
import lab3.excpt.*;
public class Matrix {
	protected int row;
	protected int column;
	protected int[][] arr;

	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;
		arr = new int[row][column];
	}

	public void setElement(int row, int column, int value) {
		if ((row < this.row && column < this.column) && (row >= 0 && column >= 0)) {
			arr[row][column] = value;
		}
		else { 
			MatrixException e = new MatrixException("Error! Exit to limits of matrix");
			throw e;
		}
	}

	public int getElement(int row, int column) {
		if ((row < this.row && column < this.column) && (row >= 0 && column >= 0)) {
			return arr[row][column];
		}
		else { 
			MatrixException e = new MatrixException("Error! Exit to limits of matrix");
			throw e;
		}
	}

	public Matrix sum(Matrix A) {
		if((this.row == A.row) && (this.column == A.column)) {
			Matrix result = new Matrix(this.row, this.column);
			for (int i = 0; i < this.row; i++) {
				for (int j = 0; j < this.column; j++) {
					result.setElement(i, j, (this.getElement(i, j) + A.getElement(i, j)));
				}
			}
			return result;
		} else { 
			MatrixException e = new MatrixException("Error! Wrong matrixes size");
			throw e;
		}
	}

	public Matrix product(Matrix A) {
		if (this.column == A.row) {
			Matrix result = new Matrix(this.row, A.column);
			for(int i = 0; i < result.row; i++){
				for(int j = 0; j < result.column; j++){
					for (int k = 0; k < this.column; k++) {
						//result.arr[i][j] += (this.arr[i][k] * A.arr[k][j]);
						result.setElement(i, j, result.getElement(i,j) + this.getElement(i, k) * A.getElement(k, j));
					}
				}
			}
			return result;
		} else {
			MatrixException e = new MatrixException("Error! Wrong matrixes size");
			throw e;
		}
	}

	public String toString() {
		StringBuilder mtx = new StringBuilder();
		for (int i = 0; i < row; i++) {
			mtx.append("[");
			for (int j = 0; j < column; j++) {
				mtx.append(arr[i][j]);
				if (j != column - 1) { mtx.append(" "); }
			}
			mtx.append("]");
			if (i != row - 1) { mtx.append("\n"); }
		}
		return mtx.toString();
	}

	public boolean equals(Object A) {
	    if (A instanceof Matrix) { return ((this.toString()).equals(A.toString())); }
    	else { return false; }
	}
}