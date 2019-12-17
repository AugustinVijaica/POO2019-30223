import java.math.BigDecimal;
import java.math.BigInteger;

public class MatrixOperations {
	static BigDecimal[][] m;

	static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {
		int n1, m1, n2, m2;
		n1 = a.length;
		n2 = b.length;

		m1 = a[0].length;
		m2 = b[0].length;

		if (n1 != n2 || m1 != m2) {
			System.out.println("Dimensiunile matricilor difera...");
			return null;
		} else {
			BigDecimal[][] rez = new BigDecimal[n1][m1];
			for (int i = 0; i < n1; i++)
				for (int j = 0; j < m1; j++)

					rez[i][j] = a[i][j].add(b[i][j]);

			return rez;
		}
	}

	static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {
		int n1, m1, n2, m2;
		n1 = a.length;
		n2 = b.length;

		m1 = a[0].length;
		m2 = b[0].length;

		if (n1 != n2 || m1 != m2) {
			System.out.println("Dimensiunile matricilor difera...");
			return null;
		} else {
			BigDecimal[][] rez = new BigDecimal[n1][m1];
			for (int i = 0; i < n1; i++)
				for (int j = 0; j < m1; j++)
					rez[i][j] = a[i][j].subtract(b[i][j]);

			return rez;
		}
	}

	static BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b) {
		int n1, m1, n2, m2;
		n1 = a.length;
		n2 = b.length;

		m1 = a[0].length;
		m2 = b[0].length;

		if (m1 != n2) {
			System.out.println("Nu se poate realiza inmultirea");
			return null;
		}

		else {
			BigDecimal[][] rez = new BigDecimal[n1][m2];
			for (int i = 0; i < n1; i++)
				for (int j = 0; j < m2; j++) {
					rez[i][j] = BigDecimal.valueOf(0);
					for (int k = 0; k < m1; k++) {
						rez[i][j] = rez[i][j].add(a[i][k].multiply(b[k][j]));
					}
				}

			return rez;
		}
	}

	static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal x) {

		int n1, m1;
		n1 = a.length;
		m1 = a[0].length;

		BigDecimal[][] rez = new BigDecimal[n1][m1];

		for (int i = 0; i < n1; i++)
			for (int j = 0; j < m1; j++) {
				rez[i][j] = a[i][j].multiply(x);
			}

		return rez;
	}


	static BigDecimal Determinant(BigDecimal[][] a) {
			BigDecimal temporary[][];
			BigDecimal result =BigDecimal.valueOf(0);
			int n=a.length;
			if (n == 1) {
				result = a[0][0];
				return (result);
			}
			for (int i = 0; i <n; i++) {
				temporary = new BigDecimal[n - 1][n - 1];

				for (int j = 1; j < n; j++) {
					for (int k = 0; k < n; k++) {
						if (k < i) {
							temporary[j - 1][k] = a[j][k];
						} else if (k > i) {
							temporary[j - 1][k - 1] = a[j][k];
						}
					}
				}
				
				result =result.add((a[0][i].multiply(new BigDecimal(Math.pow (-1, i)))).multiply(Determinant (temporary))) ;
			}
			return (result);
		}
	
	static boolean areEqual(BigDecimal[][] a, BigDecimal[][] b)
	{
		int n1 = a.length;
		int m1 = a[0].length;

		int n2 = b.length;
		int m2 = b[0].length;
		if(n1 != n2 || m1 != m2)
			return false;
		for(int i=0; i<n1; i++)
			for(int j=0;  j<m1; j++)
				if(a[i][j] != b[i][j])
					return false;
		return true;
	}
	
	static boolean isZeroMatrix(BigDecimal[][] a)
	{
		int n = a.length;
		int m = a[0].length;
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				if(a[i][j].intValue() != 0)
					return false;
		return true;
	}
	
	static boolean isIdenitityMatrix(BigDecimal[][] a)
	{
		int n = a.length;
		for(int i=0; i<n; i++)
				if(a[i][i].intValue() != 1)
					return false;
		return true;
	}
	
	static BigDecimal fillDegree(BigDecimal[][] a)
	{
		BigDecimal rez = new BigDecimal(0);
		BigDecimal nrelemente = new BigDecimal(0);
		int n = a.length;
		int m = a[0].length;
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
			{
				if(a[i][j].intValue() != 0)
					rez.add(BigDecimal.valueOf(1));
				nrelemente.add(BigDecimal.valueOf(1));
			}

		return rez.divide(nrelemente);				
	}
	
	static void printMatrix(BigDecimal[][]a) {
		int n=a.length;
		int m=a[0].length;
		System.out.println("______");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				System.out.print(a[i][j]+" " );
			System.out.println();
		}
		System.out.println("______");
	}
	
}