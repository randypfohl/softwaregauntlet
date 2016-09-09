package com.author_it.gauntlet.library;

import com.author_it.gauntlet.environment.Environment;
import com.author_it.gauntlet.library.header.HeaderRegion;
import com.author_it.gauntlet.library.header.HeaderRegionValidatable;
import com.author_it.gauntlet.signin.SignInView;
import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;

public class LibraryView extends UiView implements LibraryViewValidatable {
    private final static String domainUri = Environment.getInstance().getSiteDomain();
    private final static String viewPath = "#library";
    private final static String viewUri = String.format("%s/%s", domainUri, viewPath);
    private final static String description = "'Library' view";
    private final static String locatorType = UiElement.LocatorType.TAG;
    private final static String locatorValue = "body";

    private LibraryView() {
        super(viewUri, UiElement.getInstance(description, locatorType, locatorValue));
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }

    public static LibraryView expect() {
        LibraryView view = new LibraryView();
        view.confirmElementStates();
        return view;
    }

    public static SignInView directNav_signIn() {
        LibraryView view = new LibraryView();
        view.load();
        return SignInView.expect();
    }

    @Override
    public HeaderRegionValidatable inHeader() {
        return HeaderRegion.getInstance(this.getElement());
    }
}
