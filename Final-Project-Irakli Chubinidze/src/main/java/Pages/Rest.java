package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Rest {
    private SelenideElement restBtn = $(".cat-2");

    private ElementsCollection minPriceField = $$("#minprice"),
    maxPriceField = $$("#maxprice"),
    searchButton = $$(".submit-button");

    public void clickRest() {
        Selenide.open("");
        restBtn.click();
    }
    public void searchClick(){
        searchButton.last().click();
    }
    public SelenideElement GetMinPriceField(){
        return minPriceField.last();
    }
    public void fillFilter(String minPrice, String maxPrice){
        minPriceField.last().setValue(minPrice);
        maxPriceField.last().setValue(maxPrice);
    }

    
}
