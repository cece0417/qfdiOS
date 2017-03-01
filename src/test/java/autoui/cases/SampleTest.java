package autoui.cases;

import autoui.pages.LoginPage;
import autoui.pages.characterPage;
import autoui.pageuis.LoginPageUI;
import autoui.pageuis.characterPageUI;
import macaca.java.biz.ResultGenerator;
import org.junit.Test;

import static java.lang.Thread.sleep;

/**
 * Created by caixiaoxue on 2017/2/20.
 */
public class SampleTest extends BaseTest{

    @Test

    public void test() throws Exception{

    //测试登录
    LoginPage loginPage = new LoginPage("login page");
    loginPage.setDriver(driver);
        sleep(5000);
    if(loginPage.hasPageShown(LoginPageUI.LOGIN)){
        saveScreen(loginPage.pageDesc);


        ResultGenerator.loadPageSucc(loginPage);


        loginPage.login("13631153598","123123");
    }else{
        ResultGenerator.loadPageFail(loginPage);
    }

    //测试选择角色
    characterPage characterpage = new characterPage("choose character");
        characterpage.setDriver(driver);
        sleep(3000);
//        if (characterpage.hasPageShown(characterPageUI.target)){
//
//            saveScreen(characterpage.pageDesc);
//
//            ResultGenerator.loadPageSucc(characterpage);
//
//            characterpage.character();
//        }else {
//            ResultGenerator.loadPageFail(characterpage);
//        }
        if (characterpage.hasPageShown(characterPageUI.LIST_VIEW)) {
            saveScreen(characterpage.pageDesc);
            ResultGenerator.loadPageSucc(characterpage);
            characterpage.scroll();

            characterpage.character();
            //characterpage.onclickOneCell(4);
        }else{
            ResultGenerator.loadPageFail(characterpage);
        }


    }
}
