package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.uimanager.ComponentNameResolver;
import com.facebook.react.uimanager.ComponentNameResolverManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.s0;
import com.facebook.react.uimanager.t0;
import com.facebook.soloader.SoLoader;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ReactInstanceManager.java */
/* loaded from: classes.dex */
public class p {
    private static final String A = "p";

    /* renamed from: b  reason: collision with root package name */
    private volatile LifecycleState f15669b;

    /* renamed from: c  reason: collision with root package name */
    private k f15670c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Thread f15671d;

    /* renamed from: e  reason: collision with root package name */
    private final JavaScriptExecutorFactory f15672e;

    /* renamed from: g  reason: collision with root package name */
    private final JSBundleLoader f15674g;

    /* renamed from: h  reason: collision with root package name */
    private final String f15675h;

    /* renamed from: i  reason: collision with root package name */
    private final List<t> f15676i;

    /* renamed from: j  reason: collision with root package name */
    private final k6.d f15677j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f15678k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f15679l;

    /* renamed from: m  reason: collision with root package name */
    private final NotThreadSafeBridgeIdleDebugListener f15680m;

    /* renamed from: o  reason: collision with root package name */
    private volatile ReactContext f15682o;

    /* renamed from: p  reason: collision with root package name */
    private final Context f15683p;

    /* renamed from: q  reason: collision with root package name */
    private com.facebook.react.modules.core.b f15684q;

    /* renamed from: r  reason: collision with root package name */
    private Activity f15685r;

    /* renamed from: v  reason: collision with root package name */
    private final com.facebook.react.d f15689v;

    /* renamed from: w  reason: collision with root package name */
    private final NativeModuleCallExceptionHandler f15690w;

    /* renamed from: x  reason: collision with root package name */
    private final JSIModulePackage f15691x;

    /* renamed from: y  reason: collision with root package name */
    private List<ViewManager> f15692y;

    /* renamed from: a  reason: collision with root package name */
    private final Set<b0> f15668a = Collections.synchronizedSet(new HashSet());

    /* renamed from: f  reason: collision with root package name */
    private List<String> f15673f = null;

    /* renamed from: n  reason: collision with root package name */
    private final Object f15681n = new Object();

    /* renamed from: s  reason: collision with root package name */
    private final Collection<o> f15686s = Collections.synchronizedList(new ArrayList());

    /* renamed from: t  reason: collision with root package name */
    private volatile boolean f15687t = false;

    /* renamed from: u  reason: collision with root package name */
    private volatile Boolean f15688u = Boolean.FALSE;

    /* renamed from: z  reason: collision with root package name */
    private boolean f15693z = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class a implements ComponentNameResolver {
        a() {
        }

        @Override // com.facebook.react.uimanager.ComponentNameResolver
        public String[] getComponentNames() {
            List<String> C = p.this.C();
            if (C == null) {
                z3.a.j(p.A, "No ViewManager names found");
                return new String[0];
            }
            return (String[]) C.toArray(new String[0]);
        }
    }

    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    class b implements com.facebook.react.modules.core.b {
        b() {
        }

        @Override // com.facebook.react.modules.core.b
        public void invokeDefaultOnBackPressed() {
            p.this.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class c implements com.facebook.react.devsupport.g {
        c(p pVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class d implements k6.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q6.a f15696a;

        /* compiled from: ReactInstanceManager.java */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f15698a;

            a(boolean z10) {
                this.f15698a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f15698a) {
                    p.this.f15677j.s();
                } else if (p.this.f15677j.v() && !d.this.f15696a.c() && !p.this.f15693z) {
                    p.this.U();
                } else {
                    d.this.f15696a.a(false);
                    p.this.b0();
                }
            }
        }

        d(q6.a aVar) {
            this.f15696a = aVar;
        }

        @Override // k6.e
        public void a(boolean z10) {
            UiThreadUtil.runOnUiThread(new a(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class e implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f15700a;

        e(View view) {
            this.f15700a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f15700a.removeOnAttachStateChangeListener(this);
            p.this.f15677j.i(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f15702a;

        /* compiled from: ReactInstanceManager.java */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (p.this.f15670c != null) {
                    p pVar = p.this;
                    pVar.e0(pVar.f15670c);
                    p.this.f15670c = null;
                }
            }
        }

        /* compiled from: ReactInstanceManager.java */
        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ReactApplicationContext f15705a;

            b(ReactApplicationContext reactApplicationContext) {
                this.f15705a = reactApplicationContext;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    p.this.f0(this.f15705a);
                } catch (Exception e10) {
                    z3.a.k("ReactNative", "ReactInstanceManager caught exception in setupReactContext", e10);
                    p.this.f15677j.handleException(e10);
                }
            }
        }

        f(k kVar) {
            this.f15702a = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
            synchronized (p.this.f15688u) {
                while (p.this.f15688u.booleanValue()) {
                    try {
                        p.this.f15688u.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            p.this.f15687t = true;
            try {
                Process.setThreadPriority(-4);
                ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                ReactApplicationContext t10 = p.this.t(this.f15702a.b().create(), this.f15702a.a());
                try {
                    p.this.f15671d = null;
                    ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                    a aVar = new a();
                    t10.runOnNativeModulesQueueThread(new b(t10));
                    UiThreadUtil.runOnUiThread(aVar);
                } catch (Exception e10) {
                    p.this.f15677j.handleException(e10);
                }
            } catch (Exception e11) {
                p.this.f15687t = false;
                p.this.f15671d = null;
                p.this.f15677j.handleException(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o[] f15707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f15708b;

        g(p pVar, o[] oVarArr, ReactApplicationContext reactApplicationContext) {
            this.f15707a = oVarArr;
            this.f15708b = reactApplicationContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            o[] oVarArr;
            for (o oVar : this.f15707a) {
                if (oVar != null) {
                    oVar.a(this.f15708b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        h(p pVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(0);
            ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i(p pVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b0 f15710b;

        j(p pVar, int i10, b0 b0Var) {
            this.f15709a = i10;
            this.f15710b = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.systrace.a.e(0L, "pre_rootView.onAttachedToReactInstance", this.f15709a);
            this.f15710b.a(101);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactInstanceManager.java */
    /* loaded from: classes.dex */
    public class k {

        /* renamed from: a  reason: collision with root package name */
        private final JavaScriptExecutorFactory f15711a;

        /* renamed from: b  reason: collision with root package name */
        private final JSBundleLoader f15712b;

        public k(p pVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f15711a = (JavaScriptExecutorFactory) f6.a.c(javaScriptExecutorFactory);
            this.f15712b = (JSBundleLoader) f6.a.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f15712b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f15711a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Context context, Activity activity, com.facebook.react.modules.core.b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<t> list, boolean z10, com.facebook.react.devsupport.b bVar2, boolean z11, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, s0 s0Var, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, com.facebook.react.devsupport.h hVar, boolean z12, k6.a aVar, int i10, int i11, JSIModulePackage jSIModulePackage, Map<String, Object> map, w wVar, h6.i iVar) {
        z3.a.b(A, "ReactInstanceManager.ctor()");
        E(context);
        com.facebook.react.uimanager.c.f(context);
        this.f15683p = context;
        this.f15685r = activity;
        this.f15684q = bVar;
        this.f15672e = javaScriptExecutorFactory;
        this.f15674g = jSBundleLoader;
        this.f15675h = str;
        ArrayList arrayList = new ArrayList();
        this.f15676i = arrayList;
        this.f15678k = z10;
        this.f15679l = z11;
        com.facebook.systrace.a.c(0L, "ReactInstanceManager.initDevSupportManager");
        k6.d a10 = bVar2.a(context, s(), str, z10, hVar, aVar, i10, map, iVar);
        this.f15677j = a10;
        com.facebook.systrace.a.g(0L);
        this.f15680m = notThreadSafeBridgeIdleDebugListener;
        this.f15669b = lifecycleState;
        this.f15689v = new com.facebook.react.d(context);
        this.f15690w = nativeModuleCallExceptionHandler;
        synchronized (arrayList) {
            j4.c.a().c(k4.a.f33144a, "RNCore: Use Split Packages");
            arrayList.add(new com.facebook.react.a(this, new b(), s0Var, z12, i11));
            if (z10) {
                arrayList.add(new com.facebook.react.b());
            }
            arrayList.addAll(list);
        }
        this.f15691x = jSIModulePackage;
        com.facebook.react.modules.core.g.j();
        if (z10) {
            a10.n();
        }
        d0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(Context context) {
        SoLoader.l(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        UiThreadUtil.assertOnUiThread();
        com.facebook.react.modules.core.b bVar = this.f15684q;
        if (bVar != null) {
            bVar.invokeDefaultOnBackPressed();
        }
    }

    private void G() {
        z3.a.e(A, "ReactInstanceManager.destroy called", new RuntimeException("ReactInstanceManager.destroy called"));
    }

    private synchronized void H() {
        if (this.f15669b == LifecycleState.RESUMED) {
            K(true);
        }
    }

    private synchronized void I() {
        ReactContext z10 = z();
        if (z10 != null) {
            if (this.f15669b == LifecycleState.RESUMED) {
                z10.onHostPause();
                this.f15669b = LifecycleState.BEFORE_RESUME;
            }
            if (this.f15669b == LifecycleState.BEFORE_RESUME) {
                z10.onHostDestroy();
            }
        }
        this.f15669b = LifecycleState.BEFORE_CREATE;
    }

    private synchronized void J() {
        ReactContext z10 = z();
        if (z10 != null) {
            if (this.f15669b == LifecycleState.BEFORE_CREATE) {
                z10.onHostResume(this.f15685r);
                z10.onHostPause();
            } else if (this.f15669b == LifecycleState.RESUMED) {
                z10.onHostPause();
            }
        }
        this.f15669b = LifecycleState.BEFORE_RESUME;
    }

    private synchronized void K(boolean z10) {
        ReactContext z11 = z();
        if (z11 != null && (z10 || this.f15669b == LifecycleState.BEFORE_RESUME || this.f15669b == LifecycleState.BEFORE_CREATE)) {
            z11.onHostResume(this.f15685r);
        }
        this.f15669b = LifecycleState.RESUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        z3.a.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        a0(this.f15672e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f15677j.j(), this.f15677j.b()));
    }

    private void X(t tVar, com.facebook.react.e eVar) {
        com.facebook.systrace.b.a(0L, "processPackage").b("className", tVar.getClass().getSimpleName()).c();
        boolean z10 = tVar instanceof v;
        if (z10) {
            ((v) tVar).b();
        }
        eVar.b(tVar);
        if (z10) {
            ((v) tVar).a();
        }
        com.facebook.systrace.b.b(0L).c();
    }

    private NativeModuleRegistry Y(ReactApplicationContext reactApplicationContext, List<t> list, boolean z10) {
        com.facebook.react.e eVar = new com.facebook.react.e(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f15676i) {
            Iterator<t> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    t next = it.next();
                    if (!z10 || !this.f15676i.contains(next)) {
                        com.facebook.systrace.a.c(0L, "createAndProcessCustomReactPackage");
                        if (z10) {
                            this.f15676i.add(next);
                        }
                        X(next, eVar);
                        com.facebook.systrace.a.g(0L);
                    }
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        com.facebook.systrace.a.c(0L, "buildNativeModuleRegistry");
        try {
            return eVar.a();
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void a0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        z3.a.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        k kVar = new k(this, javaScriptExecutorFactory, jSBundleLoader);
        if (this.f15671d == null) {
            e0(kVar);
        } else {
            this.f15670c = kVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        z3.a.b(A, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        j4.c.a().c(k4.a.f33144a, "RNCore: load from BundleLoader");
        a0(this.f15672e, this.f15674g);
    }

    private void c0() {
        z3.a.b(A, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        j4.c.a().c(k4.a.f33144a, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f15678k && this.f15675h != null) {
            q6.a u10 = this.f15677j.u();
            if (!com.facebook.systrace.a.h(0L)) {
                if (this.f15674g == null) {
                    this.f15677j.s();
                    return;
                } else {
                    this.f15677j.q(new d(u10));
                    return;
                }
            }
        }
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(k kVar) {
        z3.a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f15668a) {
            synchronized (this.f15681n) {
                if (this.f15682o != null) {
                    h0(this.f15682o);
                    this.f15682o = null;
                }
            }
        }
        this.f15671d = new Thread(null, new f(kVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f15671d.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(ReactApplicationContext reactApplicationContext) {
        z3.a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        com.facebook.systrace.a.c(0L, "setupReactContext");
        synchronized (this.f15668a) {
            synchronized (this.f15681n) {
                this.f15682o = (ReactContext) f6.a.c(reactApplicationContext);
            }
            CatalystInstance catalystInstance = (CatalystInstance) f6.a.c(reactApplicationContext.getCatalystInstance());
            catalystInstance.initialize();
            this.f15677j.r(reactApplicationContext);
            this.f15689v.a(catalystInstance);
            H();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (b0 b0Var : this.f15668a) {
                if (b0Var.getState().compareAndSet(0, 1)) {
                    p(b0Var);
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        UiThreadUtil.runOnUiThread(new g(this, (o[]) this.f15686s.toArray(new o[this.f15686s.size()]), reactApplicationContext));
        com.facebook.systrace.a.g(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
        reactApplicationContext.runOnJSQueueThread(new h(this));
        reactApplicationContext.runOnNativeModulesQueueThread(new i(this));
    }

    private void h0(ReactContext reactContext) {
        z3.a.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f15669b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f15668a) {
            for (b0 b0Var : this.f15668a) {
                r(b0Var);
            }
        }
        this.f15689v.d(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f15677j.y(reactContext);
    }

    private void p(b0 b0Var) {
        WritableMap fromBundle;
        int addRootView;
        WritableMap fromBundle2;
        z3.a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        com.facebook.systrace.a.c(0L, "attachRootViewToInstance");
        UIManager g10 = t0.g(this.f15682o, b0Var.getUIManagerType());
        if (g10 != null) {
            Bundle appProperties = b0Var.getAppProperties();
            if (b0Var.getUIManagerType() == 2) {
                ViewGroup rootViewGroup = b0Var.getRootViewGroup();
                String jSModuleName = b0Var.getJSModuleName();
                if (appProperties == null) {
                    fromBundle2 = new WritableNativeMap();
                } else {
                    fromBundle2 = Arguments.fromBundle(appProperties);
                }
                addRootView = g10.startSurface(rootViewGroup, jSModuleName, fromBundle2, b0Var.getWidthMeasureSpec(), b0Var.getHeightMeasureSpec());
                b0Var.setRootViewTag(addRootView);
                b0Var.setShouldLogContentAppeared(true);
            } else {
                ViewGroup rootViewGroup2 = b0Var.getRootViewGroup();
                if (appProperties == null) {
                    fromBundle = new WritableNativeMap();
                } else {
                    fromBundle = Arguments.fromBundle(appProperties);
                }
                addRootView = g10.addRootView(rootViewGroup2, fromBundle, b0Var.getInitialUITemplate());
                b0Var.setRootViewTag(addRootView);
                b0Var.c();
            }
            com.facebook.systrace.a.a(0L, "pre_rootView.onAttachedToReactInstance", addRootView);
            UiThreadUtil.runOnUiThread(new j(this, addRootView, b0Var));
            com.facebook.systrace.a.g(0L);
            return;
        }
        throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
    }

    public static q q() {
        return new q();
    }

    private void r(b0 b0Var) {
        UiThreadUtil.assertOnUiThread();
        b0Var.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = b0Var.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    private com.facebook.react.devsupport.g s() {
        return new c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactApplicationContext t(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        z3.a.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.f15683p);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.f15690w;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.f15677j;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(Y(reactApplicationContext, this.f15676i, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        com.facebook.systrace.a.c(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            reactApplicationContext.initializeWithInstance(build);
            boolean z10 = ReactFeatureFlags.useTurboModules;
            JSIModulePackage jSIModulePackage = this.f15691x;
            if (jSIModulePackage != null) {
                build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
            }
            if (ReactFeatureFlags.enableFabricRenderer) {
                build.getJSIModule(JSIModuleType.UIManager);
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f15680m;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (com.facebook.systrace.a.h(0L)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            }
            if (ReactFeatureFlags.enableExperimentalStaticViewConfigs) {
                new ComponentNameResolverManager(build.getRuntimeExecutor(), new a());
                build.setGlobalVariable("__fbStaticViewConfig", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            com.facebook.systrace.a.c(0L, "runJSBundle");
            build.runJSBundle();
            com.facebook.systrace.a.g(0L);
            return reactApplicationContext;
        } catch (Throwable th) {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    private void y(b0 b0Var, CatalystInstance catalystInstance) {
        z3.a.b("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (b0Var.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(b0Var.getRootViewTag());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(b0Var.getRootViewTag());
        }
    }

    public k6.d A() {
        return this.f15677j;
    }

    public List<ViewManager> B(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        com.facebook.systrace.a.c(0L, "createAllViewManagers");
        try {
            if (this.f15692y == null) {
                synchronized (this.f15676i) {
                    if (this.f15692y == null) {
                        this.f15692y = new ArrayList();
                        for (t tVar : this.f15676i) {
                            this.f15692y.addAll(tVar.createViewManagers(reactApplicationContext));
                        }
                        list = this.f15692y;
                    }
                }
                return list;
            }
            list = this.f15692y;
            return list;
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    public List<String> C() {
        List<String> list;
        List<String> a10;
        com.facebook.systrace.a.c(0L, "ReactInstanceManager.getViewManagerNames");
        List<String> list2 = this.f15673f;
        if (list2 != null) {
            return list2;
        }
        synchronized (this.f15681n) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) z();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.f15676i) {
                    if (this.f15673f == null) {
                        HashSet hashSet = new HashSet();
                        for (t tVar : this.f15676i) {
                            com.facebook.systrace.b.a(0L, "ReactInstanceManager.getViewManagerName").b("Package", tVar.getClass().getSimpleName()).c();
                            if ((tVar instanceof z) && (a10 = ((z) tVar).a(reactApplicationContext)) != null) {
                                hashSet.addAll(a10);
                            }
                            com.facebook.systrace.b.b(0L).c();
                        }
                        com.facebook.systrace.a.g(0L);
                        this.f15673f = new ArrayList(hashSet);
                    }
                    list = this.f15673f;
                }
                return list;
            }
            return null;
        }
    }

    public void D(Exception exc) {
        this.f15677j.handleException(exc);
    }

    public void L(Activity activity, int i10, int i11, Intent intent) {
        ReactContext z10 = z();
        if (z10 != null) {
            z10.onActivityResult(activity, i10, i11, intent);
        }
    }

    public void M() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f15682o;
        if (reactContext == null) {
            z3.a.G(A, "Instance detached from instance manager");
            F();
            return;
        }
        DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
        if (deviceEventManagerModule != null) {
            deviceEventManagerModule.emitHardwareBackPressed();
        }
    }

    public void N(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext z10 = z();
        if (z10 == null || (appearanceModule = (AppearanceModule) z10.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    public void O() {
        UiThreadUtil.assertOnUiThread();
        if (this.f15678k) {
            this.f15677j.i(false);
        }
        I();
        this.f15685r = null;
    }

    public void P(Activity activity) {
        if (activity == this.f15685r) {
            O();
        }
    }

    public void Q() {
        UiThreadUtil.assertOnUiThread();
        this.f15684q = null;
        if (this.f15678k) {
            this.f15677j.i(false);
        }
        J();
    }

    public void R(Activity activity) {
        if (this.f15679l) {
            f6.a.a(this.f15685r != null);
        }
        Activity activity2 = this.f15685r;
        if (activity2 != null) {
            boolean z10 = activity == activity2;
            f6.a.b(z10, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f15685r.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        Q();
    }

    public void S(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f15685r = activity;
        if (this.f15678k) {
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                if (!androidx.core.view.z.T(decorView)) {
                    decorView.addOnAttachStateChangeListener(new e(decorView));
                } else {
                    this.f15677j.i(true);
                }
            } else if (!this.f15679l) {
                this.f15677j.i(true);
            }
        }
        K(false);
    }

    public void T(Activity activity, com.facebook.react.modules.core.b bVar) {
        UiThreadUtil.assertOnUiThread();
        this.f15684q = bVar;
        S(activity);
    }

    public void V(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext z10 = z();
        if (z10 == null) {
            z3.a.G(A, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) z10.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        z10.onNewIntent(this.f15685r, intent);
    }

    public void W(boolean z10) {
        UiThreadUtil.assertOnUiThread();
        ReactContext z11 = z();
        if (z11 != null) {
            z11.onWindowFocusChange(z10);
        }
    }

    public void Z() {
        f6.a.b(this.f15687t, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        c0();
    }

    public void d0() {
        Method method;
        try {
            method = p.class.getMethod("D", Exception.class);
        } catch (NoSuchMethodException e10) {
            z3.a.k("ReactInstanceHolder", "Failed to set cxx error hanlder function", e10);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    public void g0() {
        UiThreadUtil.assertOnUiThread();
        this.f15677j.w();
    }

    public void o(b0 b0Var) {
        UiThreadUtil.assertOnUiThread();
        if (this.f15668a.add(b0Var)) {
            r(b0Var);
        }
        ReactContext z10 = z();
        if (this.f15671d == null && z10 != null && b0Var.getState().compareAndSet(0, 1)) {
            p(b0Var);
        }
    }

    public void u() {
        z3.a.b(A, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.f15687t) {
            return;
        }
        this.f15687t = true;
        c0();
    }

    public ViewManager v(String str) {
        ViewManager b10;
        synchronized (this.f15681n) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) z();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.f15676i) {
                    for (t tVar : this.f15676i) {
                        if ((tVar instanceof z) && (b10 = ((z) tVar).b(reactApplicationContext, str)) != null) {
                            return b10;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }

    public void w() {
        UiThreadUtil.assertOnUiThread();
        j4.c.a().c(k4.a.f33144a, "RNCore: Destroy");
        G();
        if (this.f15688u.booleanValue()) {
            z3.a.j("ReactNative", "ReactInstanceManager.destroy called: bail out, already destroying");
            return;
        }
        this.f15688u = Boolean.TRUE;
        if (this.f15678k) {
            this.f15677j.i(false);
            this.f15677j.d();
        }
        I();
        if (this.f15671d != null) {
            this.f15671d = null;
        }
        this.f15689v.b(this.f15683p);
        synchronized (this.f15681n) {
            if (this.f15682o != null) {
                this.f15682o.destroy();
                this.f15682o = null;
            }
        }
        this.f15687t = false;
        this.f15685r = null;
        f7.c.b().a();
        this.f15688u = Boolean.FALSE;
        synchronized (this.f15688u) {
            this.f15688u.notifyAll();
        }
        synchronized (this.f15676i) {
            this.f15673f = null;
        }
        z3.a.b("ReactNative", "ReactInstanceManager has been destroyed");
    }

    public void x(b0 b0Var) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f15668a) {
            if (this.f15668a.contains(b0Var)) {
                ReactContext z10 = z();
                this.f15668a.remove(b0Var);
                if (z10 != null && z10.hasActiveReactInstance()) {
                    y(b0Var, z10.getCatalystInstance());
                }
            }
        }
    }

    public ReactContext z() {
        ReactContext reactContext;
        synchronized (this.f15681n) {
            reactContext = this.f15682o;
        }
        return reactContext;
    }
}
