package GroupExercise2.Task10;

public interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface RemoteWebDriver extends WebDriver {
    void navigate();
}

interface TakesScreenshot extends RemoteWebDriver {
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Chrome Browser");
    }
}

class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Firefox Browser");
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to URL in Safari Browser");
    }
}