package com.author_it.gauntlet.library;

import com.author_it.gauntlet.GauntletTest;
import com.author_it.gauntlet.data.user.AuthorItUser;
import com.author_it.gauntlet.data.user.AuthorItUserProvider;
import com.author_it.gauntlet.signin.SignInView;
import org.testng.annotations.Test;

@Test(groups={GauntletTest.Application.AUTHOR_IT, GauntletTest.View.LIBRARY})
public class LibraryTest extends GauntletTest{

    @Test (groups = {TestType.EVT, TestType.PRODUCTION, TestType.RELEASE})
    public void fromSignIn(){

        AuthorItUser user = AuthorItUserProvider.getInstance().get();
        LibraryViewExpected expected = LibraryViewExpected.getInstance();
        LibraryView actual = SignInView.directNav().signIn(user);
        confirm(expected.validate(actual));
    }
}
