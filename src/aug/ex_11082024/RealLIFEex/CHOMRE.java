package aug.ex_11082024.RealLIFEex;

public class CHOMRE extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome .....,         // This is code releted to chrome only\n");
        return "Browser is opened!";
    }

    @Override
    String closeBrowser(String browser) {
        return "";
    }


}
