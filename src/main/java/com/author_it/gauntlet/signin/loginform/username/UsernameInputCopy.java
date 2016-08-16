package com.author_it.gauntlet.signin.loginform.username;

class UsernameInputCopy {
    private final static String USERNAME = "Username";

    public static UsernameInputCopy getInstance() {
        return new UsernameInputCopy();
    }

    String getScreenReadableLabel() {
        return USERNAME;
    }

    public String getPlaceholder() {
        return USERNAME;
    }
}
