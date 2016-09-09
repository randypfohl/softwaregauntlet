package com.author_it.gauntlet.data.user;

public class AuthorItUserDefinition implements AuthorItUserValidatable {
    private Boolean isExistent = true;
    private String username;

    private AuthorItUserDefinition() {
    }

    public static AuthorItUserDefinition getInstance() {
        return new AuthorItUserDefinition();
    }

    public AuthorItUserDefinition isExistent(boolean isExistent) {
        this.isExistent = isExistent;
        return this;
    }

    @Override
    public Boolean isExistent() {
        return isExistent;
    }

    public AuthorItUserDefinition setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return username;
    }
}
