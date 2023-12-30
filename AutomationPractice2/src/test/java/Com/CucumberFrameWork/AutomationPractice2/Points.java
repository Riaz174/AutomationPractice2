package Com.CucumberFrameWork.AutomationPractice2;

import org.testng.annotations.Test;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.userName(n);
	  home.paswd(s);
	  home.login();
   }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Ali", "akjsdhfk" },
      new Object[] { "Saleem", "bindfobi" },
      new Object[] {"Rabia", "cjksdgfs" },
    };
  }
}
