package example.weibocomponent;

import android.app.Application;

import example.componentlib.component.interfaces.IDemoComponent;

/**
 * Email yummyl.lau@gmail.com
 * Created by yummylau on 2017/12/11.
 */
public class DemoComponentImpl implements IDemoComponent {

    @Override
    public void release() {

    }

    @Override
    public String getMainPath() {
        return Constants.ROUTER_MAIN;
    }


    @Override
    public void createAsLibrary(Application application) {
        //暂不处理
    }

}
