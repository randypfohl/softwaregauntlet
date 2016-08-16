package com.author_it.gauntlet.library.header;

import com.author_it.gauntlet.library.header.navigation.NavigationRegionExpected;
import com.author_it.gauntlet.library.header.navigation.NavigationRegionValidatable;

public class HeaderRegionExpected implements HeaderRegionValidatable {
    private HeaderRegionExpected() {
    }

    public static HeaderRegionExpected getInstance() {
        return new HeaderRegionExpected();
    }

    @Override
    public NavigationRegionValidatable inNavigation() {
        return NavigationRegionExpected.getInstance();
    }
}
