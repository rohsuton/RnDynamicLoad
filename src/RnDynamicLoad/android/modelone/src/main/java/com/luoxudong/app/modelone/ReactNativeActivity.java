package com.luoxudong.app.modelone;

import com.facebook.react.MOReactActivityDelegate;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;

/**
 * Created by luoxudong on 2018/7/4.
 */

public class ReactNativeActivity extends ReactActivity {
    @Override
    protected String getMainComponentName() {
        /**
         * 这个组件名称需要跟js入口中的组件名称保持一致
         */
        String componentName = "modelone";
        return componentName;
    }

    @Override
    protected ReactActivityDelegate createReactActivityDelegate() {
        /**
         * 进入这个界面时会初始化加载bundle的路径。
         * 这里的demo是实现把bundle文件放在了sd卡中，没有写动态更新升级相关业务代码，
         * 实际项目开发过程中需要考虑更新机制，可能事前需要做一些更新资源文件等前置工作
         */
        ReactActivityDelegate delegate = new MOReactActivityDelegate(this, getMainComponentName());
        return delegate;
    }
}
