package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_2_test extends StartBrowser{
  @Test
  public void numkey2test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey2test();
	  Assert.assertEquals(Actualresult, "2");
	  
	  
  }
}
