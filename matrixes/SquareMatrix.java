package lab3.matrixes;
import lab3.excpt.*;
public class SquareMatrix extends Matrix {
	private int size;

	public SquareMatrix(int n) {
		super(n, n);
		size = n;
		for(int i =0; i < size; i++){
			arr[i][i] = 1;
		}
	}

	public final SquareMatrix sum(SquareMatrix A) {
		if (this.size == A.size){
			SquareMatrix result = new SquareMatrix(this.size);
			for(int i = 0; i < this.size; i++){
				for(int j = 0; j < this.size; j++){
					result.arr[i][j] = this.arr[i][j] + A.arr[i][j];
				}
			}
			return result;
		} else { 
			MatrixException e = new MatrixException("Error! Wrong matrixes size");
			throw e;
		}
	}

	public final SquareMatrix product(SquareMatrix A) {
		if (this.size == A.size){
			SquareMatrix result = new SquareMatrix(this.size);
			for(int i = 0; i < this.size; i++){
				for(int j = 0; j < this.size; j++){
					for (int k = 0; k < this.size; k++) {
						result.arr[i][j] += this.arr[i][k] * A.arr[k][j];
					}
				}
			}
			return result;
		} else { 
			MatrixException e = new MatrixException("Error! Wrong matrixes size");
			throw e;
		}
	}
	
	public boolean equals(Object A) {
	    if(A instanceof SquareMatrix) { return ((this.toString()).equals(A.toString())); }
    	else { return false; }
	}
}