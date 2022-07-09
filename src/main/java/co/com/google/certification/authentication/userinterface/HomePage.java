package co.com.google.certification.authentication.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target TITLE_PRODUCTS_LABEL=Target.the("Title products label home page").located(By.xpath("//span[text()='Products']"));
}
