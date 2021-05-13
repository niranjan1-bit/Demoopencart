package utilites;

import java.util.concurrent.TimeUnit;

import constant.Baseclass;

public class Waittime extends Baseclass{
	
	public void waitperiod () {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	
}
