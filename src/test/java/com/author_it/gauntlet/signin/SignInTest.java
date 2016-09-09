package com.author_it.gauntlet.signin;

import com.author_it.gauntlet.GauntletTest;
import com.author_it.gauntlet.data.user.AuthorItUser;
import com.author_it.gauntlet.data.user.AuthorItUserDefinition;
import com.author_it.gauntlet.data.user.AuthorItUserProvider;
import com.author_it.gauntlet.library.LibraryView;
import org.testng.annotations.Test;

@Test(groups = {GauntletTest.Application.AUTHOR_IT, GauntletTest.View.SIGN_IN})
public class SignInTest extends GauntletTest {

    @Test(groups = {TestType.EVT, TestType.PRODUCTION, TestType.RELEASE, TestType.SPRINT})
    public void smoke() {

        SignInViewExpected expected = SignInViewExpected.getInstance();
        SignInView actual = SignInView.directNav();
        confirm(expected.validate(actual));
    }

    @Test(groups = {TestType.PRODUCTION, TestType.RELEASE}, dependsOnMethods = "smoke")
    public void failure() {

        AuthorItUserDefinition userDefinition = AuthorItUserDefinition.getInstance().isExistent(false);
        AuthorItUser user = AuthorItUserProvider.getInstance().get(userDefinition);
        SignInViewExpected expected = SignInViewExpected.getInstance(user);
        SignInView actual = SignInView.directNav().signIn_error(user);
        confirm(expected.validate(actual));
    }

    @Test(groups = {TestType.PRODUCTION, TestType.RELEASE}, dependsOnMethods = "smoke")
    public void fromDirectNavToLibrary() {

        SignInViewExpected expected = SignInViewExpected.getInstance();
        SignInView actual = LibraryView.directNav_signIn();
        confirm(expected.validate(actual));
    }

    @Test(groups={TestType.PRODUCTION, TestType.RELEASE}, dependsOnMethods = "smoke")
    public void usernamePopulated(){

        String username = "any old username";
        AuthorItUserDefinition user = AuthorItUserDefinition.getInstance().setUsername(username);
        SignInViewExpected expected = SignInViewExpected.getInstance(user);
        SignInView actual = SignInView.directNav().setUsername(user.getUsername());
        confirm(expected.validate(actual));
    }
}
