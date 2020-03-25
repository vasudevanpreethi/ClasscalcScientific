package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_9_test extends StartBrowser{
  @Test
  public void numkey9test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey9test();
	  Assert.assertEquals(Actualresult, "9");
	  
	  
  }
}
