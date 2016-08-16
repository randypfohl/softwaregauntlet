package com.author_it.gauntlet.signin.loginform.username;

import com.softwareonpurpose.validator4test.Validator;

public class UsernameInputValidator extends Validator {
    private final static String description = "'Username' input";
    private final UsernameInputValidatable expected;
    private final UsernameInputValidatable actual;

    private UsernameInputValidator(UsernameInputValidatable expected, UsernameInputValidatable actual, Validator parent) {
        super(description, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    public static UsernameInputValidator getInstance(UsernameInputValidatable expected, UsernameInputValidatable actual, Validator parent) {
        return new UsernameInputValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("Screen-readable label", expected.getScreenReadableLabel(), actual.getScreenReadableLabel());
        verify("Placeholder", expected.getPlaceholder(), actual.getPlaceholder());
        verify("Value", expected.getValue(), actual.getValue());
    }
}
