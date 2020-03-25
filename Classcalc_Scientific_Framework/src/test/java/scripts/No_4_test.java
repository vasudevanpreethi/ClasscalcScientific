package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_4_test extends StartBrowser{
  @Test
  public void numkey4test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey4test();
	  Assert.assertEquals(Actualresult, "4");
	  
	  
  }
}
