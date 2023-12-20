package com.Sanangel.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartUI {


    public static final Target BTN_Cart= Target.the( "btn Cart" )
            .located( By.xpath("(//a[@href='https://sanangel.com.co/finalizar-compra/'])[1]"));

    public static final Target TXT_Vali= Target.the( "txt tittle" )
            .located( By.xpath("(//div[@class='ts-product-name'])[2]"));

    public static final Target TXT_Vali2= Target.the( "txt tittle 2" )
            .located( By.xpath("(//div[@class='ts-product-name'])[1]"));


}
