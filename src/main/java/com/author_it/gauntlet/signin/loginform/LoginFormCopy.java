package com.author_it.gauntlet.signin.loginform;

class LoginFormCopy {

    private static final String ERROR_MESSAGE = "Incorrect username or password";
    private static final String SIGN_IN = "Sign in";

    public static LoginFormCopy getInstance() {
        return new LoginFormCopy();
    }

    String getErrorMessage() {
        return ERROR_MESSAGE;
    }

    String getSignInButtonLabel() {
        return SIGN_IN;
    }
}
