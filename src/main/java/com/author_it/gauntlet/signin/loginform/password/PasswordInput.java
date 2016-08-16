package com.author_it.gauntlet.signin.loginform.password;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class PasswordInput extends UiRegion implements PasswordInputValidatable {
    private final static String description = "'Password' input";
    private final static String locatorType = UiElement.LocatorType.CLASS;
    private final static String locatorValue = "form-group";
    private final static int ordinal = 2;

    private PasswordInput(UiElement parent) {
        super(UiElement.getInstance(description, locatorType, locatorValue, ordinal, parent));
    }

    public static PasswordInput getInstance(UiElement parent) {
        return new PasswordInput(parent);
    }

    @Override
    public String getScreenReadableLabel() {
        return UiElement.getInstance("Screen-readable label", UiElement.LocatorType.CLASS, "sr-only", this.getElement()).getText();
    }

    @Override
    public String getPlaceholder() {
        return getPassword().getTip();
    }

    private UiElement getPassword() {
        return UiElement.getInstance("Password", UiElement.LocatorType.ID, "inputPassword", this.getElement()).setTipAttribute("placeholder");
    }
}
