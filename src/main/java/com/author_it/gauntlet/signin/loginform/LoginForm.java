package com.author_it.gauntlet.signin.loginform;

import com.author_it.gauntlet.data.user.AuthorItUser;
import com.author_it.gauntlet.signin.loginform.password.PasswordInput;
import com.author_it.gauntlet.signin.loginform.username.UsernameInput;
import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class LoginForm extends UiRegion implements LoginFormValidatable {
    private final static String description = "Login Form";
    private final static String locatorType = UiElement.LocatorType.TAG;
    private final static String locatorValue = "form";

    private LoginForm(UiElement parentElement) {
        super(UiElement.getInstance(description, locatorType, locatorValue, parentElement));
    }

    public static LoginForm getInstance(UiElement parentElement) {
        return new LoginForm(parentElement);
    }

    @Override
    public String getErrorMessage() {
<<<<<<< HEAD
        return UiElement.getInstance("Error Message", UiElement.LocatorType.ID, "loginError", this.getElement()).getText();
=======
        return getErrorMessageElement().getText();
    }

    private UiElement getErrorMessageElement() {
        return UiElement.getInstance("Error Message", UiElement.LocatorType.ID, "loginError", this.getElement());
    }

    public boolean expectFailureState() {
        return getErrorMessageElement().waitUntilVisible();
>>>>>>> 1f63679cc269d2d9c4ba6b4dc74074327f7db4cb
    }

    @Override
    public String getSignInButtonLabel() {
        return getSignInButton().getText();
    }

    private UiElement getSignInButton() {
        return UiElement.getInstance("'Sign In' button", UiElement.LocatorType.TAG, "button", this.getElement());
    }

    @Override
    public UsernameInput inUsernameInput() {
        return UsernameInput.getInstance(this.getElement());
    }

    @Override
    public PasswordInput inPasswordInput() {
        return PasswordInput.getInstance(this.getElement());
    }

    public void submit(AuthorItUser user) {
        setUsername(user.getUsername());
        getSignInButton().click();
    }

    public void setUsername(String value) {
        inUsernameInput().setValue(value);
    }
}
