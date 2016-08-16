package com.author_it.gauntlet.signin.loginform.password;

public class PasswordInputExpected implements PasswordInputValidatable {
    private PasswordInputCopy copy;

    private PasswordInputExpected() {
    }

    public static PasswordInputExpected getInstance() {
        return new PasswordInputExpected();
    }

    @Override
    public String getScreenReadableLabel() {
        return getCopy().getScreenReadableLabel();
    }

    private PasswordInputCopy getCopy() {
        if (copy == null) {
            copy = PasswordInputCopy.getInstance();
        }
        return copy;
    }

    @Override
    public String getPlaceholder() {
        return getCopy().getPlaceholder();
    }
}
