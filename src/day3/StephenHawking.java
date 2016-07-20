package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
	String S =	JOptionPane.showInputDialog("say a sentinsce");
			speak(S);
	String r =	JOptionPane.showInputDialog("say a sentinsce");
			speak(r);
	String g =	JOptionPane.showInputDialog("say a sentinsce");
			speak(g);
	String h =	JOptionPane.showInputDialog("say a sentinsce");
			speak(h);
	String b =	JOptionPane.showInputDialog("say a sentinsce");
			speak(b);
	
	}
	// 2. ask the user for a sentence
	// 3. call the speak method below and send it the sentence
	// 4. repeat steps 2 and 3 a lot of times

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
