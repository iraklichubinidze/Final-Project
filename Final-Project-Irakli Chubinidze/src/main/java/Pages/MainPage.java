package Pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selectors.*;
import com.codeborne.selenide.SelenideElement;



public class MainPage {
    private SelenideElement loginButton = $(".swoop-login").$(withText("შესვლა")),
    email = $(byName("Email")),
    mandatoryCity = $("#lCity"),
    password = $(byName("password")),
    mandatoryPersonPersonalID = $("#lContactPersonPersonalID"),
    mandatoryPersonPhone = $("#lContactPersonPhone"),
    legalTerms = $("#IsLegalAgreedTerms"),
    authButton = $("#AuthBtn"),
    mandatoryPostalCode = $("#lPostalCode"),
    authInfo = $("#authInfo"),
    registerModal = $(".register"),
    juridial = $("#ui-id-2"),
    mandatoryPersonEmail = $("#lContactPersonEmail"),
    mandatoryPersonPassword = $("#lContactPersonPassword"),
    mandatoryPersonConfirmPassword = $("#lContactPersonConfirmPassword"),
    mandatoryPersonName = $("#lContactPersonName"),
    warningText = $("#register-content-2 h4"),
    subscriptionCheckbox = $("#IsLegalSubscribedNewsletter"),
    legalFormDropdown = $("#lLegalForm"),
    mandatoryCompanyName = $("#lName"),
    mandatoryTaxCode = $("#lTaxCode"),
    registerButton = $("a[onclick='SubmitLegalForm()']"),
    registrationMessage = $("#legalInfoMassage");

    public void OpenLoginModal() {
        loginButton.click();
    }

    public void Open() {
        Selenide.open("");
    }

    public void Login(String emailValue, String passwordValue){
        email.setValue(emailValue);
        password.setValue(passwordValue);
        authButton.click();
    }

    public SelenideElement GetAuthInfo() {
        return authInfo;
    }

    public SelenideElement GetPasswordField() {
        return password;
    }

    public void SelectJuridialRegister() {
        registerModal.click();
        juridial.click();
    }

    public SelenideElement GetWarningText() {
        return warningText;
    }

    public SelenideElement GetSubscriptionCheckbox() {
        return subscriptionCheckbox;
    }

    public SelenideElement GetLegalFormDropdown() {
        return legalFormDropdown;
    }

    public void Register(
            String companyName,
            String taxCode,
            String city,
            String postalCode,
            String email,
            String password,
            String confirmPassword,
            String personName,
            String personalID,
            String phone) {
        mandatoryPersonConfirmPassword.setValue(confirmPassword);
        mandatoryPersonName.setValue(personName);
        mandatoryPersonPersonalID.setValue(personalID);
        mandatoryPersonPhone.setValue(phone);
        mandatoryCompanyName.setValue(companyName);
        mandatoryTaxCode.setValue(taxCode);
        mandatoryCity.setValue(city);
        registerButton.click();
        mandatoryPostalCode.setValue(postalCode);
        mandatoryPersonEmail.setValue(email);
        mandatoryPersonPassword.setValue(password);
        legalTerms.click();
    }

    public SelenideElement GetRegistrationMessage() {
        return registrationMessage;
    }
}
