package com.author_it.gauntlet.library.header;

import com.author_it.gauntlet.library.header.navigation.NavigationRegionValidator;
import com.softwareonpurpose.validator4test.Validator;

public class HeaderValidator extends Validator {
    private final static String description = "'Header' region";
    private HeaderValidator(HeaderRegionValidatable expected, HeaderRegionValidatable actual, Validator parent) {
        super(description, expected, actual, parent);
        addChildValidator(NavigationRegionValidator.getInstance(expected.inNavigation(), actual.inNavigation(), this));
    }

    public static HeaderValidator getInstance(HeaderRegionValidatable expected, HeaderRegionValidatable actual, Validator parent) {
        return new HeaderValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {

    }
}
