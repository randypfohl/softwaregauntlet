package com.author_it.gauntlet.signin.loginform;

import com.author_it.gauntlet.signin.loginform.password.PasswordInputValidator;
import com.author_it.gauntlet.signin.loginform.username.UsernameInputValidator;
import com.softwareonpurpose.validator4test.Validator;

public class LoginFormValidator extends Validator {
    private final static String description = "'Login' form";
    private final LoginFormValidatable expected;
    private final LoginFormValidatable actual;

    private LoginFormValidator(LoginFormValidatable expected, LoginFormValidatable actual, Validator parent) {
        super(description, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
        addChildValidator(UsernameInputValidator.getInstance(expected.inUsernameInput(), actual.inUsernameInput(), this));
        addChildValidator(PasswordInputValidator.getInstance(expected.inPasswordInput(), actual.inPasswordInput(), this));
    }

    public static LoginFormValidator getInstance(LoginFormValidatable expected, LoginFormValidatable actual, Validator parent) {
        return new LoginFormValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("Error Message", expected.getErrorMessage(), actual.getErrorMessage());
        verify("'Sign In' button label", expected.getSignInButtonLabel(), actual.getSignInButtonLabel());
    }
}
