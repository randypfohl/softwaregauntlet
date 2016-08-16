package com.author_it.gauntlet.signin;

import com.author_it.gauntlet.signin.loginform.LoginFormValidator;
import com.softwareonpurpose.validator4test.Validator;

class SignInViewValidator extends Validator {
    private final static String description = "'Sign In' view";
    private final SignInViewExpected expected;
    private final SignInView actual;

    private SignInViewValidator(SignInViewExpected expected, SignInView actual) {
        super(description, expected, actual);
        this.expected = expected;
        this.actual = actual;
        addChildValidator(LoginFormValidator.getInstance(expected.inLoginForm(), actual.inLoginForm(), this));
    }

    static SignInViewValidator getInstance(SignInViewExpected expected, SignInView actual) {
        return new SignInViewValidator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("'Form' title", expected.getTitle(), actual.getTitle());
    }
}
