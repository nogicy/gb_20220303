package toy;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Screen {
	public static int show1(ImageIcon img, String[] arr) { // λ©μΈ νλ©΄
		int result = JOptionPane.showOptionDialog(null, "", "π΅ toy player π΅", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, img, arr, null);
		return result;
	}

	public static int show2(ImageIcon img, String[] arr) { // μ¨λ² μ ν νλ©΄
		int result = JOptionPane.showOptionDialog(null, "", "π§ μ¨λ² μ ν π§π", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, img, arr, null);
		return result;
	}

	public static String show3(String album, String[] arr) { // νΈλ μ ν νλ©΄
		String result = (String) JOptionPane.showInputDialog(null, "", "π " + album + " π", JOptionPane.PLAIN_MESSAGE,
				new ImageIcon("src/img/album_" + album + ".jpg"), arr, null);
		return result;
	}

	public static int show4(String track, ImageIcon img, String[] arr) { // μ¬μ νλ©΄
		int result = JOptionPane.showOptionDialog(null, "", "πΆ " + track + " πΆ", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, img, arr, null);
		return result;
	}
}



