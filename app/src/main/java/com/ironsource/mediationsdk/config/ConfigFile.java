package com.ironsource.mediationsdk.config;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class ConfigFile {
    private static ConfigFile mInstance;
    private String mPluginFrameworkVersion;
    private String mPluginType;
    private String mPluginVersion;
    private String[] mSupportedPlugins = {"Unity", "AdobeAir", "Xamarin", "Corona", "AdMob", "ReactNative", "Unreal", "Flutter", "Cordova", "Cocos2dx", "Other"};

    public static synchronized ConfigFile getConfigFile() {
        ConfigFile configFile;
        synchronized (ConfigFile.class) {
            if (mInstance == null) {
                mInstance = new ConfigFile();
            }
            configFile = mInstance;
        }
        return configFile;
    }

    public String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getPluginVersion() {
        return this.mPluginVersion;
    }

    public void setPluginData(String str, String str2, String str3) {
        if (str != null) {
            if (!Arrays.asList(this.mSupportedPlugins).contains(str)) {
                str = null;
            }
            this.mPluginType = str;
        }
        if (str2 != null) {
            this.mPluginVersion = str2;
        }
        if (str3 != null) {
            this.mPluginFrameworkVersion = str3;
        }
    }
}
