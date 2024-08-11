package aug.ex_11082024.RealLIFEex;

abstract class BaseClass extends GrandBaseClass {
    // Web Automation
    // Single
    // Hide the Functionality of the open and close Browser.

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);
    BaseClass(){}

    @Override
    void takeScreenShot() {
        System.out.println("Ok Taking ScreenShot");
    }
}
