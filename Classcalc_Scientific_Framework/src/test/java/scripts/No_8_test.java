package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_8_test extends StartBrowser{
  @Test
  public void numkey8test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey8test();
	  Assert.assertEquals(Actualresult, "8");
	  
	  
  }
}
