package com.author_it.gauntlet.library;

import com.author_it.gauntlet.ExpectedResult;
import com.author_it.gauntlet.library.header.HeaderRegionExpected;
import com.author_it.gauntlet.library.header.HeaderRegionValidatable;
import com.softwareonpurpose.validator4test.Validator;

class LibraryViewExpected extends ExpectedResult implements LibraryViewValidatable{
    @Override
    protected <T extends Validator> T instantiateValidator(Object actual) {
        return (T) LibraryViewValidator.getInstance(this, (LibraryView) actual);
    }

    public static LibraryViewExpected getInstance() {
        return new LibraryViewExpected();
    }

    @Override
    public HeaderRegionValidatable inHeader() {
        return HeaderRegionExpected.getInstance();
    }
}
