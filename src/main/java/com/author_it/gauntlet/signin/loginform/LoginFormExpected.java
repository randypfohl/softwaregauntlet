package com.author_it.gauntlet.signin.loginform;

import com.author_it.gauntlet.data.user.AuthorItUserDefinition;
import com.author_it.gauntlet.data.user.AuthorItUserValidatable;
import com.author_it.gauntlet.signin.loginform.password.PasswordInputExpected;
import com.author_it.gauntlet.signin.loginform.password.PasswordInputValidatable;
import com.author_it.gauntlet.signin.loginform.username.UsernameInputExpected;
import com.author_it.gauntlet.signin.loginform.username.UsernameInputValidatable;

public class LoginFormExpected implements LoginFormValidatable {
    private final AuthorItUserValidatable user;
    private LoginFormCopy copy;

    private LoginFormExpected(AuthorItUserValidatable user) {
        this.user = user;
    }

    public static LoginFormExpected getInstance() {
        return new LoginFormExpected(AuthorItUserDefinition.getInstance());
    }

    public static LoginFormExpected getInstance(AuthorItUserValidatable user) {
        return new LoginFormExpected(user);
    }

    @Override
    public String getErrorMessage() {
        return user.isExistent() ? "" : getCopy().getErrorMessage();
    }

    private LoginFormCopy getCopy() {
        if (copy == null) {
            copy = LoginFormCopy.getInstance();
        }
        return copy;
    }

    @Override
    public String getSignInButtonLabel() {
        return getCopy().getSignInButtonLabel();
    }

    @Override
    public UsernameInputValidatable inUsernameInput() {
        return UsernameInputExpected.getInstance(user.getUsername());
    }

    @Override
    public PasswordInputValidatable inPasswordInput() {
        return PasswordInputExpected.getInstance();
    }
}
