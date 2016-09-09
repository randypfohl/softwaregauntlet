package com.author_it.gauntlet.signin.loginform;

import com.author_it.gauntlet.signin.loginform.password.PasswordInputValidatable;
import com.author_it.gauntlet.signin.loginform.username.UsernameInputValidatable;

public interface LoginFormValidatable {
    String getErrorMessage();

    String getSignInButtonLabel();

    UsernameInputValidatable inUsernameInput();

    PasswordInputValidatable inPasswordInput();
}
