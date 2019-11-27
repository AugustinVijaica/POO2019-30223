
public class CalendarControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarLucru cl = new CalendarLucru();
		Lucrator l1 = new Lucrator("Mazi",cl);
		Lucrator l2 = new Lucrator("Gusti",cl);
		try {
			l1.lucreaza("Marti");
		} catch (ExceptieZiNelucratoare e) {
			System.out.println(e.getMessage());
		}

		try {
			l1.lucreaza("Sambata");
		} catch (ExceptieZiNelucratoare e) {
			System.out.println(e.getMessage());
		}

		try {
			l1.lucreaza("Marti2");
		} catch (ExceptieZiNelucratoare e) {
			System.out.println(e.getMessage());
		}
		
		try {
			l2.lucreaza("Sambata");
		}catch (ExceptieZiNelucratoare e) {
			System.out.println(e.getMessage());
		}
		
		try {
			l2.lucreaza("Vineri");
		}catch(ExceptieZiNelucratoare e) {
			System.out.println(e.getMessage());
		}
	}

}
