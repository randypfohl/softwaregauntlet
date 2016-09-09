package com.author_it.gauntlet.library.header.navigation;

class NavigationRegionCopy {
    private static final String LIBRARY_LINK_LABEL = "Library";

    private NavigationRegionCopy() {
    }

    public static NavigationRegionCopy getInstance() {
        return new NavigationRegionCopy();
    }

    String getLibraryLinkLabel() {
        return LIBRARY_LINK_LABEL;
    }
}
