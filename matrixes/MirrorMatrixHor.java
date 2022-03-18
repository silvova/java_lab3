package lab3.matrixes;
import lab3.excpt.*;

public class MirrorMatrixHor extends Matrix {
	private int middle;

	public MirrorMatrixHor(int row, int column) {
		super((row/2), column);
		if ((row % 2) == 0) {
			middle = row / 2;
			this.row = row;
		}
		else {
			MatrixException e = new MatrixException("Error! Wrong number of rows.");
			throw e;
		}
	}

	public final void setElement(int row, int column, int value) {
		if ((row < (this.row) && column < this.column) && (row >= 0 && column >= 0)) {
			if (row < middle) { this.arr[row][column] = value; } 
			else { this.arr[row - middle][column] = value; }
		}
		else { 
			MatrixException e = new MatrixException("Error! Exit to limits of matrix");
			throw e;
		}
	}

	public final int getElement(int row, int column) {
		if ((row < this.row && column < this.column) && (row >= 0 && column >= 0)) {
			if (row < middle) { return this.arr[row][column]; }  
			else { return this.arr[row - middle][column]; }
		}
		else { 
			MatrixException e = new MatrixException("Error! Exit to limits of matrix");
			throw e;
		}
	}

	public final String toString() {
		StringBuilder mtx = new StringBuilder();
		for (int i = 0; i < row; i++) {
			mtx.append("[");
			for (int j = 0; j < column; j++) {
				if (i < middle) { mtx.append(arr[i][j]); }
				else { mtx.append(arr[i - middle][j]); }
				if (j != column - 1) { mtx.append(" "); }
			}
			mtx.append("]");
			if (i != row - 1) { mtx.append("\n"); }
		}
		return mtx.toString();
	}
	
}