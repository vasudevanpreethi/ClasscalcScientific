package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class No_1_test extends StartBrowser{
  @Test
  public void numkey1test() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.numkey1test();
	  Assert.assertEquals(Actualresult, "1");
	  
	  
  }
}
