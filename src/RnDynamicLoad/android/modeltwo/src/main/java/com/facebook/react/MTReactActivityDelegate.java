package com.facebook.react;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;

import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by luoxudong on 2018/7/2.
 */

public class MTReactActivityDelegate extends ReactActivityDelegate {
    private Activity mActivity = null;

    public MTReactActivityDelegate(Activity activity, @Nullable String mainComponentName) {
        super(activity, mainComponentName);
        mActivity = activity;
    }

    public MTReactActivityDelegate(FragmentActivity fragmentActivity, @Nullable String mainComponentName) {
        super(fragmentActivity, mainComponentName);
        mActivity = fragmentActivity;
    }

    @Override
    protected ReactNativeHost getReactNativeHost() {
        return new ReactNativeHost(mActivity.getApplication()) {
            @Override
            public boolean getUseDeveloperSupport() {
                return BuildConfig.DEBUG;
            }

            @Override
            protected List<ReactPackage> getPackages() {
                return Arrays.<ReactPackage>asList(
                        new MainReactPackage()
                );
            }

            @Override
            protected String getJSMainModuleName() {
                return "index";
            }

            @Nullable
            @Override
            protected String getJSBundleFile() {
                /**
                 * 为了简单，这个路径先写死
                 * 实际开发中这个地址一般是不写死的，路径可能会变化，比如不同版本的bundle资源放在不同的目录中。
                 * 由于是写死在SD卡路径，记得6.0+系统要授权访问。
                 */
                String jsBundeFile = "/sdcard/rn/modeltwo/index.android.bundle";
                return jsBundeFile;
            }
        };
    }
}
