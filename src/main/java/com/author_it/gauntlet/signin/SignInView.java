package com.author_it.gauntlet.signin;

import com.author_it.gauntlet.data.user.AuthorItUser;
import com.author_it.gauntlet.library.LibraryView;
import com.author_it.gauntlet.signin.loginform.LoginForm;
import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;
<<<<<<< HEAD

public class SignInView extends UiView implements SignInViewValidatable {
    private final static String viewUri = "http://huxleyclientqa.us-east-1.elasticbeanstalk.com/#sign-in";
    private final static String description = "Sign In View";
=======
import org.apache.logging.log4j.LogManager;

public class SignInView extends UiView implements SignInViewValidatable {
    private final static String viewUri = "http://huxleyclientqa.us-east-1.elasticbeanstalk.com/#sign-in";
    private final static String description = "'Sign In' view";
>>>>>>> 1f63679cc269d2d9c4ba6b4dc74074327f7db4cb
    private final static String locatorType = UiElement.LocatorType.ID;
    private final static String locatorValue = "app-content-pane";

    private SignInView() {
        super(viewUri, UiElement.getInstance(description, locatorType, locatorValue));
    }

    public static SignInView directNav() {
<<<<<<< HEAD
        SignInView view = new SignInView();
        view.load();
=======
        new SignInView().load();
        return expect();
    }

    private static SignInView expectFailureState() {
        SignInView view = expect();
        view.inLoginForm().expectFailureState();
        return view;
    }

    public static SignInView expect() {
        SignInView view = new SignInView();
>>>>>>> 1f63679cc269d2d9c4ba6b4dc74074327f7db4cb
        view.confirmElementStates();
        return view;
    }

    @Override
    protected boolean confirmElementStates() {
<<<<<<< HEAD
        return this.getElement().waitUntilVisible();
=======
        boolean isVisible = this.getElement().waitUntilVisible();
        if (!isVisible) {
            String messageFormat = "PAGE LOAD WARNING: %s failed to load in a reasonable amount of time";
            String message = String.format(messageFormat, getViewDescription());
            LogManager.getLogger(this.getClass()).warn(message);
        }
        return isVisible;
>>>>>>> 1f63679cc269d2d9c4ba6b4dc74074327f7db4cb
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
<<<<<<< HEAD
        return SignInView.expect();
    }

    public static SignInView expect() {
        SignInView view = new SignInView();
        view.confirmElementStates();
        return view;
=======
        return SignInView.expectFailureState();
>>>>>>> 1f63679cc269d2d9c4ba6b4dc74074327f7db4cb
    }

    public LibraryView signIn(AuthorItUser user) {
        inLoginForm().submit(user);
        return LibraryView.expect();
    }

    public SignInView setUsername(String value) {
        inLoginForm().setUsername(value);
        return SignInView.expect();
    }
<<<<<<< HEAD
=======

    private String getViewDescription() {
        return description;
    }
>>>>>>> 1f63679cc269d2d9c4ba6b4dc74074327f7db4cb
}
