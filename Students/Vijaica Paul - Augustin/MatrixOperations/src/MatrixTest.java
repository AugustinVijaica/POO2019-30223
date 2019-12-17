import java.math.BigDecimal;

public class MatrixTest extends MatrixOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal a[][] = { { new BigDecimal(3), new BigDecimal(2), new BigDecimal(-1) },
				{ new BigDecimal(1), new BigDecimal(-3), new BigDecimal(2) },
				{ new BigDecimal(2), new BigDecimal(1), new BigDecimal(0) } };
		BigDecimal b[][] = { { new BigDecimal(1), new BigDecimal(0), new BigDecimal(0) },
				{ new BigDecimal(0), new BigDecimal(1), new BigDecimal(0) },
				{ new BigDecimal(0), new BigDecimal(0), new BigDecimal(1) } };
		System.out.println("A+B");
		printMatrix(add(a,b));
		System.out.println("A-B");
		printMatrix(subtract(a,b));
		System.out.println("A*B");
		printMatrix(multiply(a, b));
		System.out.println("B*3");
		printMatrix(multiplyScalar(b, BigDecimal.valueOf(3)));
		System.out.println("Det(A)");
		System.out.println(Determinant(a));
		System.out.println("Det(B)");
		System.out.println(Determinant(b));
		System.out.println("A=B?");
		System.out.println(areEqual(a, b));
		System.out.println("B=B?");
		System.out.println(areEqual(b, b));
		System.out.println("B=0?");
		System.out.println(isZeroMatrix(b));
		System.out.println("B=I?");
		System.out.println(isIdenitityMatrix(b));
	}
}
