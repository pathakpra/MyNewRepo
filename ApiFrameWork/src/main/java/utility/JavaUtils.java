package utility;

import java.util.Random;

public class JavaUtils {

	public int randomNum() {
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		return ranNum;
	}
	
	
}
