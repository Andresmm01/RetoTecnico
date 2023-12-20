package com.Sanangel.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectproductUI {

    public static final Target LNK_Rosas = Target.the( "List product " )
            .located( By.xpath("//h2[@class='woocommerce-loop-product__title']"));

    public static final Target BTN_Quantity= Target.the( "btn quantity" )
            .located( By.xpath("//input[@class='input-text qty text']"));




}
