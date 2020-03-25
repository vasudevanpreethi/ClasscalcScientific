package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class Trig_cos_test extends StartBrowser{
  @Test
  public void Trig_cos() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.cosCalc();
	  Assert.assertEquals(Actualresult, "0.8660254038");
	 
	  
  }
}
