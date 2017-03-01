package autoui.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by caixiaoxue on 2017/2/20.
 */
public class LoginPageUI extends BasePageUI{

    public static final CommonUIBean USERNAME = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextField[1]","username");
    public static final CommonUIBean PASSWORD = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeSecureTextField[1]","password");
    public static final CommonUIBean LOGIN = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeButton[1]","login");


}

