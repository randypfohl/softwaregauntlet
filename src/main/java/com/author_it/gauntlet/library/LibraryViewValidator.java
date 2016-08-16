package com.author_it.gauntlet.library;

import com.author_it.gauntlet.library.header.HeaderValidator;
import com.softwareonpurpose.validator4test.Validator;

class LibraryViewValidator extends Validator {
    private final static String description = "'Library' view";

    private LibraryViewValidator(LibraryViewExpected expected, LibraryView actual) {
        super(description, expected, actual);
        addChildValidator(HeaderValidator.getInstance(expected.inHeader(), actual.inHeader(), this));
    }

    public static LibraryViewValidator getInstance(LibraryViewExpected expected, LibraryView actual) {
        return new LibraryViewValidator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
    }
}
