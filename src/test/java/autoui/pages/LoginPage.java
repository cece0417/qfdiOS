package autoui.pages;


import autoui.pageuis.LoginPageUI;
import macaca.java.biz.BasePage;


/**
 * Created by caixiaoxue on 2017/2/20.
 */
public class LoginPage extends BasePage {

    public LoginPage(String pageDesc){

        super(pageDesc);

    }

    public void login(String username,String password) throws Exception {
        if (driver.isElementExist(LoginPageUI.USERNAME)) {
            driver.inputBean(LoginPageUI.USERNAME,username);
            driver.inputBean(LoginPageUI.PASSWORD,password);
            driver.onclickBean(LoginPageUI.LOGIN);
        }
    }
}
