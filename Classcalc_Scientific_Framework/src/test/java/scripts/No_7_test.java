package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_7_test extends StartBrowser{
  @Test
  public void numkey7test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey7test();
	  Assert.assertEquals(Actualresult, "7");
	  
	  
  }
}
