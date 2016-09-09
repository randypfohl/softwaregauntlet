package com.author_it.gauntlet.data.user;

public class AuthorItUserProvider {
    private final static String existentUsername = "admin";
    public static AuthorItUserProvider getInstance() {
        return new AuthorItUserProvider();
    }

    public AuthorItUser get(AuthorItUserDefinition userDefinition) {
        return userDefinition.isExistent() ? AuthorItUser.getInstance("admin", null, true) : AuthorItUser.getInstance("bogus", null, false);
    }

    public AuthorItUser get() {
        return AuthorItUser.getInstance(existentUsername, null, true);
    }
}
