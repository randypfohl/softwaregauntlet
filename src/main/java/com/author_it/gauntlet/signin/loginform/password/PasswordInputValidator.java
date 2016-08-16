package com.author_it.gauntlet.signin.loginform.password;

import com.softwareonpurpose.validator4test.Validator;

public class PasswordInputValidator extends Validator {
    private final static String description = "'Password' input";
    private final PasswordInputValidatable expected;
    private final PasswordInputValidatable actual;

    private PasswordInputValidator(PasswordInputValidatable expected, PasswordInputValidatable actual, Validator parent) {
        super(description, expected, actual, parent);
        this.actual = actual;
        this.expected = expected;
    }

    public static PasswordInputValidator getInstance(PasswordInputValidatable expected, PasswordInputValidatable actual, Validator parent) {
        return new PasswordInputValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("Screen-readable label", expected.getScreenReadableLabel(), actual.getScreenReadableLabel());
        verify("Placeholder", expected.getPlaceholder(), actual.getPlaceholder());
    }
}
