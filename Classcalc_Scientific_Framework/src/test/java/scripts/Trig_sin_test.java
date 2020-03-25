package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class Trig_sin_test extends StartBrowser{
  @Test
  public void Trig_sin() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	 String Actualresult= cfs.sinCalc();
//	 Assert.assertEquals(Actualresult, "0.5");
	 Assert.assertEquals(Actualresult, "0.5");
	
	  
  }
}
