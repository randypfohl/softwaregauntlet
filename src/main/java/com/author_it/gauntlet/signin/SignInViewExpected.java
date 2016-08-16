package com.author_it.gauntlet.signin;

import com.author_it.gauntlet.ExpectedResult;
import com.author_it.gauntlet.data.user.AuthorItUserDefinition;
import com.author_it.gauntlet.data.user.AuthorItUserValidatable;
import com.author_it.gauntlet.signin.loginform.LoginFormExpected;
import com.author_it.gauntlet.signin.loginform.LoginFormValidatable;
import com.softwareonpurpose.validator4test.Validator;

class SignInViewExpected extends ExpectedResult implements SignInViewValidatable {
    private final AuthorItUserValidatable user;
    private SignInCopy copy;

    private SignInViewExpected(AuthorItUserValidatable user) {
        this.user = user;
    }

    static SignInViewExpected getInstance() {
        return new SignInViewExpected(AuthorItUserDefinition.getInstance());
    }

    static SignInViewExpected getInstance(AuthorItUserValidatable user) {
        return new SignInViewExpected(user);
    }

    @Override
    protected <T extends Validator> T instantiateValidator(Object actual) {
        return (T) SignInViewValidator.getInstance(this, (SignInView) actual);
    }

    private SignInCopy getCopy() {
        if (copy == null) {
            copy = SignInCopy.getInstance();
        }
        return copy;
    }

    @Override
    public String getTitle() {
        return getCopy().getFormTitle();
    }

    @Override
    public LoginFormValidatable inLoginForm() {
        return LoginFormExpected.getInstance(user);
    }
}
