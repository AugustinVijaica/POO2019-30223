
public class ExceptiiBasic {
	public static void main(String[] args) {
		try {
			Lucrator l = null;
			l.getNume();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			int a[] = new int[50];
			a[51]=2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		try {
			throw new Exception("Exceptie");
		}catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Am ajuns aici");
		}
		
		try {
			ExceptionString ex = new ExceptionString("ERROR 404 File Not Found");
			System.out.println(ex.getMsg());
			throw ex;
		} catch (ExceptionString e) {
			System.out.println(e.getMessage());
		}
	}

}
