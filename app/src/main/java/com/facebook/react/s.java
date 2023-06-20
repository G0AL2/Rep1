package com.facebook.react;

import android.app.Application;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.s0;
import java.util.List;

/* compiled from: ReactNativeHost.java */
/* loaded from: classes.dex */
public abstract class s {
    private final Application mApplication;
    private p mReactInstanceManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactNativeHost.java */
    /* loaded from: classes.dex */
    public class a implements h6.i {
        a(s sVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s(Application application) {
        this.mApplication = application;
    }

    public void clear() {
        p pVar = this.mReactInstanceManager;
        if (pVar != null) {
            pVar.w();
            this.mReactInstanceManager = null;
        }
    }

    protected p createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        q m10 = p.q().d(this.mApplication).k(getJSMainModuleName()).r(getUseDeveloperSupport()).f(getDevSupportManagerFactory()).o(getShouldRequireActivity()).p(getSurfaceDelegateFactory()).n(getRedBoxHandler()).l(getJavaScriptExecutorFactory()).q(getUIImplementationProvider()).j(getJSIModulePackage()).g(LifecycleState.BEFORE_CREATE).m(getReactPackageTurboModuleManagerDelegateBuilder());
        for (t tVar : getPackages()) {
            m10.a(tVar);
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            m10.h(jSBundleFile);
        } else {
            m10.e((String) f6.a.c(getBundleAssetName()));
        }
        p b10 = m10.b();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return b10;
    }

    protected final Application getApplication() {
        return this.mApplication;
    }

    protected String getBundleAssetName() {
        return "index.android.bundle";
    }

    protected com.facebook.react.devsupport.b getDevSupportManagerFactory() {
        return null;
    }

    protected String getJSBundleFile() {
        return null;
    }

    protected JSIModulePackage getJSIModulePackage() {
        return null;
    }

    protected abstract String getJSMainModuleName();

    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    protected abstract List<t> getPackages();

    public p getReactInstanceManager() {
        if (this.mReactInstanceManager == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.mReactInstanceManager = createReactInstanceManager();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.mReactInstanceManager;
    }

    protected w getReactPackageTurboModuleManagerDelegateBuilder() {
        return null;
    }

    protected com.facebook.react.devsupport.h getRedBoxHandler() {
        return null;
    }

    public boolean getShouldRequireActivity() {
        return true;
    }

    public h6.i getSurfaceDelegateFactory() {
        return new a(this);
    }

    protected s0 getUIImplementationProvider() {
        return new s0();
    }

    public abstract boolean getUseDeveloperSupport();

    public boolean hasInstance() {
        return this.mReactInstanceManager != null;
    }
}
