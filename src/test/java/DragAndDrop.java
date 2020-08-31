import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DebitCreditPage;
import utils.WebDriverFactory;

public class DragAndDrop {
  
  @BeforeMethod
  public void setUp() {
    WebDriverFactory.createInstance("chrome");
  }

  @Test
  public void moveBankToDebitTest() {
    new DebitCreditPage().navigateToPage();
    new DebitCreditPage().moveBankToDebit();
    Assert.assertTrue((new DebitCreditPage().findMovedElement()).contains("BANK"));
  }

  @AfterMethod
  public void tearDown() {
    WebDriverFactory.getDriver().quit();
  }
}

