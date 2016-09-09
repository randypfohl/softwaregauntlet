package com.author_it.gauntlet.signin.loginform.password;

class PasswordInputCopy {
    private final static String PASSWORD = "Password";

    private PasswordInputCopy(){}
    public static PasswordInputCopy getInstance() {
        return new PasswordInputCopy();
    }

    public String getPlaceholder() {
        return PASSWORD;
    }

    public String getScreenReadableLabel() {
        return PASSWORD;
    }
}
