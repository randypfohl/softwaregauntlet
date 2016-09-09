package com.author_it.gauntlet.signin;

class SignInCopy {
    private final static String SIGN_IN = "Sign in";

    String getFormTitle() {
        return SIGN_IN;
    }

    static SignInCopy getInstance() {
        return new SignInCopy();
    }
}
