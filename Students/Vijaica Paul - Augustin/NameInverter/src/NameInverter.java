
public class NameInverter {
	private String nume;

	public NameInverter(String nume) {
		this.nume = nume;
	}

	public String getNume() {
		return this.nume;
	}

	public String invertName() {
		String nume = this.nume;
		String[] s;
		if (nume != null) {
			s = nume.split(" ");
			if (nume == "") {
				return "";
			} else if (s.length == 1) {
				if (nume.contains(" "))
					return nume.trim();
				else
					return nume;
			} else if (s.length == 2) {
				if(s[0].isEmpty())
					return s[1];
				else
					return s[1] + ", " + s[0];
			} else if (s.length == 3)
				if(s[0].isEmpty())
					return s[2]+", "+s[1];
				else
				return s[2] + ", " + s[1] + " " + s[0];
			else if (s.length == 4)
				return s[3] + ", " + s[2] + " " + s[0] + " " + s[1];
			else
				return "Unknown format!";
		} else
			return "Null string, cannot invert";

	}
}
