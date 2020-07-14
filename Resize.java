package resiz;


import javax.swing.JFrame;

public class Resiz {

	public static void main(String[] args) {
		Layout calc = new Layout();
		calc.setResizable(false);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//calc.pack();
		calc.setVisible(true);
		//calc.setLayout(null);

	}

}
