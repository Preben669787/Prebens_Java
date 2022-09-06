package Obligatoriske_Oppgaver;
import static javax.swing.JOptionPane.*;
public class O2 {
	public static void main(String[] args) {
		String karTxt = showInputDialog("Tallkarakter: ");
		int tallKarakter = Integer.parseInt(karTxt);

		if(tallKarakter>=0 && tallKarakter<=39) {
			System.out.print("Din bokstavkarakter er F");
		}
		else if(tallKarakter>=40 && tallKarakter<=49) {
			System.out.print("Din bokstavkarakter er E");
		}
		else if(tallKarakter>=50 && tallKarakter<=59) {
			System.out.print("Din bokstavkarakter er D");
		}
		else if(tallKarakter>=60 && tallKarakter<=79) {
			System.out.print("Din bokstavkarakter er C");
		}
		else if(tallKarakter>=80 && tallKarakter<=89) {
			System.out.print("Din bokstavkarakter er B");
		}
		else if(tallKarakter>=90 && tallKarakter<=100) {
			System.out.print("Din bokstavkarakter er A");
		}else {
			System.out.print("Ugyldig poengsum!");
		}
		
	}
}
