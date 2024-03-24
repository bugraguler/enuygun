package steps;

import pages.Mainpage;

public class PageInitializers {

    public static Mainpage mainPage;

    public static void initializePageObjects() {

        mainPage = new Mainpage();
    }
}
