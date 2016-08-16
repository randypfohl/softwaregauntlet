package com.author_it.gauntlet.library.header.navigation;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class NavigationRegion extends UiRegion implements NavigationRegionValidatable {
    private final static String description = "'Navigation' region";
    private final static String locatorType = UiElement.LocatorType.ID;
    private final static String locatorValue = "navigation-links";

    private NavigationRegion(UiElement parent) {
        super(UiElement.getInstance(description, locatorType, locatorValue, parent));
    }

    public static NavigationRegion getInstance(UiElement parent) {
        return new NavigationRegion(parent);
    }

    @Override
    public String getLibraryLinkLabel() {
        return UiElement.getInstance("'Library' link", UiElement.LocatorType.ID, "library-navigation-link", this.getElement()).getText();
    }
}
