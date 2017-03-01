package autoui.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by caixiaoxue on 2017/2/22.
 */
public class characterPageUI extends BasePageUI{

    public static final CommonUIBean target = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]","target");
    public static final CommonUIBean  LIST_VIEW = new CommonUIBean(GetElementWay.CLASS_NAME,"table","listview");
    public static final CommonUIBean CELL = new CommonUIBean(GetElementWay.CLASS_NAME,"Cell","CELL");

}
