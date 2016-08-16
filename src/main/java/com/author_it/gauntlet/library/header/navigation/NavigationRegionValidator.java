package com.author_it.gauntlet.library.header.navigation;

import com.softwareonpurpose.validator4test.Validator;

public class NavigationRegionValidator extends Validator{
    private static final String description = "'Navigation' region";
    private final NavigationRegionValidatable expected;
    private final NavigationRegionValidatable actual;

    private NavigationRegionValidator(NavigationRegionValidatable expected, NavigationRegionValidatable actual, Validator parent) {
        super(description, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    protected void executeVerifications() {
        verify("'Library' link label", expected.getLibraryLinkLabel(), actual.getLibraryLinkLabel());
    }

    public static NavigationRegionValidator getInstance(NavigationRegionValidatable expected, NavigationRegionValidatable actual, Validator parent) {
        return new NavigationRegionValidator(expected, actual, parent);
    }
}
