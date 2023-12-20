package com.Sanangel.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    public static final Target Txt_busqueda = Target.the( "input search" )
            .located( By.xpath("//input[@id='dgwt-wcas-search-input-1']"));

}
