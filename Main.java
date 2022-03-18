package lab3;
import lab3.matrixes.*;
import lab3.excpt.*;
public class Main {
	public static void main(String[] args) {
		try {
			MirrorMatrixHor A = new MirrorMatrixHor(4, 4);
			A.setElement(0, 1, 1);
			A.setElement(0, 2, 2);
			A.setElement(0, 3, 3);
			A.setElement(1, 0, 4);
			A.setElement(1, 1, 5);
			A.setElement(1, 2, 6);
			A.setElement(1, 3, 7);
			System.out.println("Matrix A:");
			System.out.println(A);

			MirrorMatrixHor B = new MirrorMatrixHor(4, 4);
			B.setElement(0, 0, 8);
			B.setElement(0, 1, 7);
			B.setElement(0, 2, 6);
			B.setElement(0, 3, 5);
			B.setElement(1, 0, 4);
			B.setElement(1, 1, 3);
			B.setElement(1, 2, 2);
			B.setElement(1, 3, 1);
			System.out.println("Matrix B:");
			System.out.println(B);

			System.out.println("A + B =");
			System.out.println(A.sum(B));

			System.out.println("A * B =");
			System.out.println(A.product(B));

			MirrorMatrixHor C = new MirrorMatrixHor(3, 4);




			/*System.out.println("Default Matrix check:");
			Matrix A = new Matrix(2, 3);
			A.setElement(0, 0, 1);
			A.setElement(0, 1, 2);
			A.setElement(0, 2, 3);
			A.setElement(1, 0, 4);
			A.setElement(1, 1, 5);
			A.setElement(1, 2, 6);

			Matrix B = new Matrix(3, 4);
			B.setElement(0, 2, 7);
			B.setElement(1, 1, 8);
			B.setElement(1, 3, 9);
			B.setElement(2, 3, 2);;
			B.setElement(2, 2, 3);
			B.setElement(2, 0, 4);
			
			System.out.println("Matrix A:");
			System.out.println(A);
			System.out.println("Matrix B:");
			System.out.println(B);
			System.out.println("A * B =");
			System.out.println(A.product(B));

			Matrix C = new Matrix(2, 3);
			C.setElement(0, 0, 6);
			C.setElement(0, 1, 7);
			C.setElement(0, 2, 8);
			C.setElement(1, 0, 9);
			C.setElement(1, 1, 0);
			C.setElement(1, 2, 10);
			System.out.println("Matrix C:");
			System.out.println(C);
			System.out.println("A + C = ");
			System.out.println(A.sum(C));
			System.out.println("\n");
			
			System.out.println("Square Matrix check:");
			SquareMatrix D = new SquareMatrix(3);
			D.setElement(0,0,0);
			D.setElement(0,1,1);
			D.setElement(0,2,2);
			D.setElement(1,0,3);
			D.setElement(1,1,4);
			D.setElement(1,2,5);
			D.setElement(2,0,6);
			D.setElement(2,1,7);
			D.setElement(2,2,8);
			System.out.println("Matrix D:");
			System.out.println(D);
			System.out.println("D * D =");
			System.out.println(D.product(D));
			System.out.println("D + D = ");
			System.out.println(D.sum(D));
			System.out.println("\n");

			System.out.println("Matrix Equals check:");
			System.out.println("A = B ?:");
			System.out.println(A.equals(B));
			System.out.println("A = A ?:");
			System.out.println(A.equals(A));
			System.out.println("\n");

			System.out.println("Exception check:");
			System.out.println("B * C =");
			System.out.println(B.product(C));*/

			
		}
		catch(MatrixException err){
			err.getMassage();
			err.printStackTrace();
		}
	}
}