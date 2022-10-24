import static org.junit.jupiter.api.*;



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProductTesting {
  

	

	@Test
	  public void insert() {
        WebElement cart = driver.findElement(By.id("cartur"));
        cart.click();
    }
	
	 public boolean numberOfProducts(){
		    list<WebElement> numOfProducts = driver.findElements(By.className("success"));
		    if(numOfProducts.size()==1)
		     return true;
		    else
		     return false;
		}

		    public void checkproduct(){
		     list<WebElement> product = driver.findElements(By.tagName("td"));
		     if(product.text(2) == 650 && product.text(1) == "Nexus 6" && numberOfProducts() == true)
		      Ststem.out.println("The test is correct !!");
		     else
		      Ststem.out.println("One of the data is wrong :( ");
		      
		      
		}

}


 