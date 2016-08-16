package com.author_it.gauntlet.signin.loginform.username;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class UsernameInput extends UiRegion implements UsernameInputValidatable {
    private final static String description = "'Username' input";
    private final static String locatorType = UiElement.LocatorType.CLASS;
    private final static String locatorValue = "form-group";
    private final static int ordinal = 1;

    private UsernameInput(UiElement parent) {
        super(UiElement.getInstance(description, locatorType, locatorValue, ordinal, parent));
    }

    public static UsernameInput getInstance(UiElement parent) {
        return new UsernameInput(parent);
    }

    @Override
    public String getScreenReadableLabel() {
        return UiElement.getInstance("Screen-readable label", UiElement.LocatorType.CLASS, "sr-only", this.getElement()).getText();
    }

    @Override
    public String getPlaceholder() {
        return getUsername().getTip();
    }

    @Override
    public String getValue() {
        return getUsername().getText();
    }

    private UiElement getUsername() {
        return UiElement.getInstance("Username", UiElement.LocatorType.ID, "inputUsername", this.getElement()).setTipAttribute("placeholder");
    }

    public void setValue(String value) {
        getUsername().set(value);
    }
}
