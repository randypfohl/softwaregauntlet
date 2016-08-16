package com.author_it.gauntlet.signin.loginform.username;

public class UsernameInputExpected implements UsernameInputValidatable{
    private UsernameInputCopy copy;
    private final String username;

    private UsernameInputExpected(String username){
        this.username = username;
    }
    public static UsernameInputExpected getInstance(String username) {
        return new UsernameInputExpected(username);
    }

    @Override
    public String getScreenReadableLabel() {
        return getCopy().getScreenReadableLabel();
    }

    private UsernameInputCopy getCopy() {
        if(copy==null){
            copy = UsernameInputCopy.getInstance();
        }
        return copy;
    }

    @Override
    public String getPlaceholder() {
        return getCopy().getPlaceholder();
    }

    @Override
    public String getValue() {
        return username == null ? "" : username;
    }
}
