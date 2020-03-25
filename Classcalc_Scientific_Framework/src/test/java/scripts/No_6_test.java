package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_6_test extends StartBrowser{
  @Test
  public void numkey6test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey6test();
	  Assert.assertEquals(Actualresult, "6");
	  
	  
  }
}
