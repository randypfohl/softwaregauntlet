package com.author_it.gauntlet.signin;

import com.author_it.gauntlet.signin.loginform.LoginFormValidatable;

interface SignInViewValidatable {
    String getTitle();

    LoginFormValidatable inLoginForm();
}
