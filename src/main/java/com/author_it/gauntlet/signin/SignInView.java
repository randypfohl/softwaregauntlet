package com.author_it.gauntlet.signin;

import com.author_it.gauntlet.data.user.AuthorItUser;
import com.author_it.gauntlet.library.LibraryView;
import com.author_it.gauntlet.signin.loginform.LoginForm;
import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;

public class SignInView extends UiView implements SignInViewValidatable {
    private final static String viewUri = "http://huxleyclientqa.us-east-1.elasticbeanstalk.com/#sign-in";
    private final static String description = "Sign In View";
    private final static String locatorType = UiElement.LocatorType.ID;
    private final static String locatorValue = "app-content-pane";

    private SignInView() {
        super(viewUri, UiElement.getInstance(description, locatorType, locatorValue));
    }

    public static SignInView directNav() {
        SignInView view = new SignInView();
        view.load();
        view.confirmElementStates();
        return view;
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }

    @Override
    public String getTitle() {
        return UiElement.getInstance("'Form' title", UiElement.LocatorType.TAG, "h2", this.getElement()).getText();
    }

    @Override
    public LoginForm inLoginForm() {
        return LoginForm.getInstance(this.getElement());
    }

    SignInView signIn_error(AuthorItUser user) {
        inLoginForm().submit(user);
        return SignInView.expect();
    }

    public static SignInView expect() {
        SignInView view = new SignInView();
        view.confirmElementStates();
        return view;
    }

    public LibraryView signIn(AuthorItUser user) {
        inLoginForm().submit(user);
        return LibraryView.expect();
    }

    public SignInView setUsername(String value) {
        inLoginForm().setUsername(value);
        return SignInView.expect();
    }
}
