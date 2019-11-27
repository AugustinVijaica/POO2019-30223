
public class Lucrator {
	private String nume;
	private CalendarLucru calendarLucru;

	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public CalendarLucru getCalendarLucru() {
		return calendarLucru;
	}
	public void setCalendarLucru(CalendarLucru calendarLucru) {
		this.calendarLucru = calendarLucru;
	}
	
	public Lucrator (String nume,CalendarLucru calendarLucru) {
		setNume(nume);
		setCalendarLucru(calendarLucru);
	}
	
	public void lucreaza(String zi) throws ExceptieZiNelucratoare {
		if(zi.equals("Luni")) {
			if(calendarLucru.getZile()[0].getLucratoare())
			{
				System.out.println("Lucratorul "+nume+" lucreaza Luni");
			}
			else {
				throw new ExceptieZiNelucratoare("Exceptie:"+nume+":lucru in zi nelucratoare");
			}
		} else if(zi.equals("Marti")) {
			if(calendarLucru.getZile()[1].getLucratoare())
			{
				System.out.println("Lucratorul "+nume+" lucreaza Marti");
			}
			else {
				throw new ExceptieZiNelucratoare("Exceptie:"+nume+":lucru in zi nelucratoare");
			}
		} else if(zi.equals("Miercuri")) {
			if(calendarLucru.getZile()[2].getLucratoare())
			{
				System.out.println("Lucratorul "+nume+" lucreaza Miercuri");
			}
			else {
				throw new ExceptieZiNelucratoare("Exceptie:"+nume+":lucru in zi nelucratoare");
			}
		} else if(zi.equals("Joi")) {
			if(calendarLucru.getZile()[3].getLucratoare())
			{
				System.out.println("Lucratorul "+nume+" lucreaza Joi");
			}
			else {
				throw new ExceptieZiNelucratoare("Exceptie:"+nume+":lucru in zi nelucratoare");
			}
		} else if(zi.equals("Vineri")) {
			if(calendarLucru.getZile()[4].getLucratoare())
			{
				System.out.println("Lucratorul "+nume+" lucreaza Vineri");
			}
			else {
				throw new ExceptieZiNelucratoare("Exceptie:"+nume+":lucru in zi nelucratoare");
			}
		} else if(zi.equals("Sambata")) {
			if(calendarLucru.getZile()[5].getLucratoare())
			{
				System.out.println("Lucratorul "+nume+" lucreaza Sambata");
			}
			else {
				throw new ExceptieZiNelucratoare("Exceptie:"+nume+":lucru in zi nelucratoare");
			}
		} else if(zi.equals("Duminica")) {
			if(calendarLucru.getZile()[6].getLucratoare())
			{
				System.out.println("Lucratorul "+nume+" lucreaza Duminica");
			}
			else {
				throw new ExceptieZiNelucratoare("Exceptie:"+nume+":lucru in zi nelucratoare");
			}
		} else {
			throw new ExceptieZiNelucratoare("Exceptie:"+zi+" nu este o zi a saptamanii");
		}
	}

}


