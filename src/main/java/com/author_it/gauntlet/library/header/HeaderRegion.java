package com.author_it.gauntlet.library.header;

import com.author_it.gauntlet.library.header.navigation.NavigationRegion;
import com.author_it.gauntlet.library.header.navigation.NavigationRegionValidatable;
import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class HeaderRegion extends UiRegion implements HeaderRegionValidatable {
    private final static String description = "'Header' region";
    private final static String locatorType = UiElement.LocatorType.ID;
    private final static String locatorValue = "header-pane";

    private HeaderRegion(UiElement parent) {
        super(UiElement.getInstance(description, locatorType, locatorValue, parent));
    }

    public static HeaderRegion getInstance(UiElement parent) {
        return new HeaderRegion(parent);
    }

    @Override
    public NavigationRegionValidatable inNavigation() {
        return NavigationRegion.getInstance(this.getElement());
    }
}
