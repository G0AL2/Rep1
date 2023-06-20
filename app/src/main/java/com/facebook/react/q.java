package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.jscexecutor.JSCExecutor;
import com.facebook.react.uimanager.s0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ReactInstanceManagerBuilder.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    private String f15715b;

    /* renamed from: c  reason: collision with root package name */
    private JSBundleLoader f15716c;

    /* renamed from: d  reason: collision with root package name */
    private String f15717d;

    /* renamed from: e  reason: collision with root package name */
    private NotThreadSafeBridgeIdleDebugListener f15718e;

    /* renamed from: f  reason: collision with root package name */
    private Application f15719f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15720g;

    /* renamed from: h  reason: collision with root package name */
    private com.facebook.react.devsupport.b f15721h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15722i;

    /* renamed from: j  reason: collision with root package name */
    private LifecycleState f15723j;

    /* renamed from: k  reason: collision with root package name */
    private s0 f15724k;

    /* renamed from: l  reason: collision with root package name */
    private NativeModuleCallExceptionHandler f15725l;

    /* renamed from: m  reason: collision with root package name */
    private Activity f15726m;

    /* renamed from: n  reason: collision with root package name */
    private com.facebook.react.modules.core.b f15727n;

    /* renamed from: o  reason: collision with root package name */
    private com.facebook.react.devsupport.h f15728o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15729p;

    /* renamed from: q  reason: collision with root package name */
    private k6.a f15730q;

    /* renamed from: r  reason: collision with root package name */
    private JavaScriptExecutorFactory f15731r;

    /* renamed from: u  reason: collision with root package name */
    private JSIModulePackage f15734u;

    /* renamed from: v  reason: collision with root package name */
    private Map<String, Object> f15735v;

    /* renamed from: w  reason: collision with root package name */
    private w f15736w;

    /* renamed from: x  reason: collision with root package name */
    private h6.i f15737x;

    /* renamed from: a  reason: collision with root package name */
    private final List<t> f15714a = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private int f15732s = 1;

    /* renamed from: t  reason: collision with root package name */
    private int f15733t = -1;

    private JavaScriptExecutorFactory c(String str, String str2, Context context) {
        try {
            p.E(context);
            JSCExecutor.a();
            return new com.facebook.react.jscexecutor.a(str, str2);
        } catch (UnsatisfiedLinkError e10) {
            if (!e10.getMessage().contains("__cxa_bad_typeid")) {
                try {
                    HermesExecutor.a();
                    return new com.facebook.hermes.reactexecutor.a();
                } catch (UnsatisfiedLinkError e11) {
                    e11.printStackTrace();
                    throw e10;
                }
            }
            throw e10;
        }
    }

    public q a(t tVar) {
        this.f15714a.add(tVar);
        return this;
    }

    public p b() {
        String str;
        f6.a.d(this.f15719f, "Application property has not been set with this builder");
        if (this.f15723j == LifecycleState.RESUMED) {
            f6.a.d(this.f15726m, "Activity needs to be set if initial lifecycle state is resumed");
        }
        boolean z10 = true;
        f6.a.b((!this.f15720g && this.f15715b == null && this.f15716c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f15717d == null && this.f15715b == null && this.f15716c == null) {
            z10 = false;
        }
        f6.a.b(z10, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.f15724k == null) {
            this.f15724k = new s0();
        }
        String packageName = this.f15719f.getPackageName();
        String a10 = t6.a.a();
        Application application = this.f15719f;
        Activity activity = this.f15726m;
        com.facebook.react.modules.core.b bVar = this.f15727n;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f15731r;
        JavaScriptExecutorFactory c10 = javaScriptExecutorFactory == null ? c(packageName, a10, application.getApplicationContext()) : javaScriptExecutorFactory;
        JSBundleLoader jSBundleLoader = this.f15716c;
        if (jSBundleLoader == null && (str = this.f15715b) != null) {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.f15719f, str, false);
        }
        JSBundleLoader jSBundleLoader2 = jSBundleLoader;
        String str2 = this.f15717d;
        List<t> list = this.f15714a;
        boolean z11 = this.f15720g;
        com.facebook.react.devsupport.b bVar2 = this.f15721h;
        if (bVar2 == null) {
            bVar2 = new com.facebook.react.devsupport.a();
        }
        return new p(application, activity, bVar, c10, jSBundleLoader2, str2, list, z11, bVar2, this.f15722i, this.f15718e, (LifecycleState) f6.a.d(this.f15723j, "Initial lifecycle state was not set"), this.f15724k, this.f15725l, this.f15728o, this.f15729p, this.f15730q, this.f15732s, this.f15733t, this.f15734u, this.f15735v, this.f15736w, this.f15737x);
    }

    public q d(Application application) {
        this.f15719f = application;
        return this;
    }

    public q e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f15715b = str2;
        this.f15716c = null;
        return this;
    }

    public q f(com.facebook.react.devsupport.b bVar) {
        this.f15721h = bVar;
        return this;
    }

    public q g(LifecycleState lifecycleState) {
        this.f15723j = lifecycleState;
        return this;
    }

    public q h(String str) {
        if (str.startsWith("assets://")) {
            this.f15715b = str;
            this.f15716c = null;
            return this;
        }
        return i(JSBundleLoader.createFileLoader(str));
    }

    public q i(JSBundleLoader jSBundleLoader) {
        this.f15716c = jSBundleLoader;
        this.f15715b = null;
        return this;
    }

    public q j(JSIModulePackage jSIModulePackage) {
        this.f15734u = jSIModulePackage;
        return this;
    }

    public q k(String str) {
        this.f15717d = str;
        return this;
    }

    public q l(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f15731r = javaScriptExecutorFactory;
        return this;
    }

    public q m(w wVar) {
        return this;
    }

    public q n(com.facebook.react.devsupport.h hVar) {
        this.f15728o = hVar;
        return this;
    }

    public q o(boolean z10) {
        this.f15722i = z10;
        return this;
    }

    public q p(h6.i iVar) {
        this.f15737x = iVar;
        return this;
    }

    public q q(s0 s0Var) {
        this.f15724k = s0Var;
        return this;
    }

    public q r(boolean z10) {
        this.f15720g = z10;
        return this;
    }
}
