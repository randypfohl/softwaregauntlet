package com.author_it.gauntlet.library.header.navigation;

public class NavigationRegionExpected implements NavigationRegionValidatable{
    private NavigationRegionCopy copy;
    public static NavigationRegionExpected getInstance() {
        return new NavigationRegionExpected();
    }

    @Override
    public String getLibraryLinkLabel() {
        return getCopy().getLibraryLinkLabel();
    }

    private NavigationRegionCopy getCopy() {
        if (copy == null){
            copy = NavigationRegionCopy.getInstance();
        }
        return copy;
    }
}
