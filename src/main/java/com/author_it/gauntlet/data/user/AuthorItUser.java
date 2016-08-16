package com.author_it.gauntlet.data.user;

public class AuthorItUser implements AuthorItUserValidatable{
    private final String password;
    private final String username;
    private final Boolean isExistent;

    private AuthorItUser(String username, String password, Boolean isExistent) {
        this.password = password;
        this.username = username;
        this.isExistent = isExistent;
    }

    public static AuthorItUser getInstance(String username, String password, Boolean isExistent) {
        return new AuthorItUser(username, password, isExistent);
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public Boolean isExistent() {
        return isExistent == null ? true : isExistent;
    }
}
