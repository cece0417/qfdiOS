package autoui.pages;

import com.alibaba.fastjson.JSONObject;
import autoui.pageuis.characterPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by caixiaoxue on 2017/2/22.
 */
public class characterPage extends BasePage {

    public characterPage(String pageDesc){

        super(pageDesc);

    }

    public void character(){

        driver.onclickBean(characterPageUI.target);

    }

    public void scroll() throws Exception{

        JSONObject windowSize = driver.getWindowSize();
        //int windowWidth = ;
       // int windowHeight = 222;

        //int centerX = windowWidth/2;

        driver.drag(150,350,150,200,0.05,10);
        driver.sleep(1000);



    }

    public void onclickOneCell(int index) throws Exception{

        driver.onclickBeanAtIndex(characterPageUI.CELL,index);
    }


}
