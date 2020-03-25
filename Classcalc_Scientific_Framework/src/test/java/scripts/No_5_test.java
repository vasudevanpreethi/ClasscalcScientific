package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_5_test extends StartBrowser{
  @Test
  public void numkey5test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey5test();
	  Assert.assertEquals(Actualresult, "5");
	  
	  
  }
}
