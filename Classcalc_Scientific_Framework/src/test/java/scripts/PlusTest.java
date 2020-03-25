package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.Commonfunctions;

public class PlusTest extends StartBrowser{
  @Test
  public void plusTest() throws Exception {
	  Commonfunctions cfs = new Commonfunctions();
	  String Actualresult= cfs.plusTest();
	  Assert.assertEquals(Actualresult, "+");
	  
	  
  }
}
