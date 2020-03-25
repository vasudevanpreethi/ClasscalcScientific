package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_3_test extends StartBrowser{
  @Test
  public void numkey3test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey3test();
	  Assert.assertEquals(Actualresult, "3");
	  
	  
  }
}
