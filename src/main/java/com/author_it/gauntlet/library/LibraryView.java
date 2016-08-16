package com.author_it.gauntlet.library;

import com.author_it.gauntlet.environment.Environment;
import com.author_it.gauntlet.library.header.HeaderRegion;
import com.author_it.gauntlet.library.header.HeaderRegionValidatable;
import com.author_it.gauntlet.signin.SignInView;
import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;
import org.apache.logging.log4j.LogManager;

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

    public static LibraryView expect() {
        LibraryView view = new LibraryView();
        view.confirmElementStates();
        return view;
    }

    public static SignInView directNav_signIn() {
        new LibraryView().load();
        return SignInView.expect();
    }

    @Override
    protected boolean confirmElementStates() {
        boolean isVisible = this.getElement().waitUntilVisible();
        if (!isVisible) {
            String messageFormat = "PAGE LOAD WARNING: %s failed to load in a reasonable amount of time";
            String message = String.format(messageFormat, getViewDescription());
            LogManager.getLogger(this.getClass()).warn(message);
        }
        return isVisible;
    }

    @Override
    public HeaderRegionValidatable inHeader() {
        return HeaderRegion.getInstance(this.getElement());
    }

    private String getViewDescription() {
        return description;
    }
}
