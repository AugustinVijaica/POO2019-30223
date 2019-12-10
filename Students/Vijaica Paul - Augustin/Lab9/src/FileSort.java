import java.util.Arrays;
import java.util.Comparator;
import java.io.*;

public class FileSort {

	public static void main(String[] args) {

		Comparator<File> byDirThenAlpha = new DirAlphaComparator();
		Comparator<File> byNameLength = new NameLengthComparator();

		File dir = new File(System.getProperty("user.home"));
		File[] children = dir.listFiles();
		System.out.println("Fisierele dupa director, apoi alfabetic ");
		Arrays.sort(children, byDirThenAlpha);
		printFileNames(children);
		System.out.println("Fisierele dupa lungimea numelui lor (cel mai lung primul)");
		Arrays.sort(children, byNameLength);
		printFileNames(children);
	}


	private static void printFileNames(File[] fa) {
		for (File oneEntry : fa) {
			System.out.println(" " + oneEntry.getName());
		}
	}
}


class DirAlphaComparator implements Comparator<File> {

	public int compare(File filea, File fileb) {

		if (filea.isDirectory() && !fileb.isDirectory()) {
			return -1;
		} else if (!filea.isDirectory() && fileb.isDirectory()) {
			return 1;
		} else {
			return filea.getName().compareToIgnoreCase(fileb.getName());
		}
	}
}

class NameLengthComparator implements Comparator<File> {

	public int compare(File filea, File fileb) {
		int comp = fileb.getName().length() - filea.getName().length();
		if (comp != 0) {

			return comp;
		} else {

			return filea.getName().compareToIgnoreCase(fileb.getName());
		}
	}
}