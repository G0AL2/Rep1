package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import fm.castbox.mediation.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@o6.a(name = UIManagerModule.NAME)
/* loaded from: classes.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = j4.c.a().a(k4.a.f33147d);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final com.facebook.react.uimanager.events.d mEventDispatcher;
    private final List<w0> mListeners;
    private final e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private int mNumRootViews;
    private final r0 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final c1 mViewManagerRegistry;

    /* loaded from: classes.dex */
    class a implements d {
        a(UIManagerModule uIManagerModule) {
        }
    }

    /* loaded from: classes.dex */
    class b extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f15742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, int i10, Object obj) {
            super(reactContext);
            this.f15741a = i10;
            this.f15742b = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.Y(this.f15741a, this.f15742b);
        }
    }

    /* loaded from: classes.dex */
    class c extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15745b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15746c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, int i10, int i11, int i12) {
            super(reactContext);
            this.f15744a = i10;
            this.f15745b = i11;
            this.f15746c = i12;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.c0(this.f15744a, this.f15745b, this.f15746c);
            UIManagerModule.this.mUIImplementation.n(-1);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    private class e implements ComponentCallbacks2 {
        private e(UIManagerModule uIManagerModule) {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 >= 60) {
                g1.a().c();
            }
        }

        /* synthetic */ e(UIManagerModule uIManagerModule, a aVar) {
            this(uIManagerModule);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, d1 d1Var, int i10) {
        this(reactApplicationContext, d1Var, new s0(), i10);
    }

    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager S = str != null ? this.mUIImplementation.S(str) : null;
        if (S == null) {
            return null;
        }
        com.facebook.systrace.b.a(0L, "UIManagerModule.getConstantsForViewManager").b("ViewManager", S.getName()).b("Lazy", Boolean.TRUE).c();
        try {
            Map<String, Object> c10 = v0.c(S, null, null, null, this.mCustomDirectEvents);
            if (c10 != null) {
                return Arguments.makeNativeMap(c10);
            }
            return null;
        } finally {
            com.facebook.systrace.b.b(0L).c();
        }
    }

    private static Map<String, Object> createConstants(d1 d1Var) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        com.facebook.systrace.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.TRUE).c();
        try {
            return v0.a(d1Var);
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t10) {
        return addRootView(t10, null, null);
    }

    public void addUIBlock(q0 q0Var) {
        this.mUIImplementation.a(q0Var);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(w0 w0Var) {
        this.mListeners.add(w0Var);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i10, String str, int i11, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i10 + ", class: " + str + ", props: " + readableMap;
            z3.a.b("ReactNative", str2);
            j4.c.a().c(k4.a.f33147d, str2);
        }
        this.mUIImplementation.j(i10, str, i11, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.k();
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        this.mUIImplementation.l(i10, i11, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i10, Dynamic dynamic, ReadableArray readableArray) {
        UIManager g10 = t0.g(getReactApplicationContext(), x6.a.a(i10));
        if (g10 == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            g10.dispatchCommand(i10, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            g10.dispatchCommand(i10, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i10, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.p(i10, Math.round(r.b(readableArray.getDouble(0))), Math.round(r.b(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map != null && map.containsKey(str)) {
            WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
            int i10 = this.mViewManagerConstantsCacheSize - 1;
            this.mViewManagerConstantsCacheSize = i10;
            if (i10 <= 0) {
                this.mViewManagerConstantsCache = null;
            }
            return writableMap;
        }
        return computeConstantsForViewManager(str);
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(v0.d());
    }

    @Deprecated
    public d getDirectEventNamesResolver() {
        return new a(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.q();
    }

    @Deprecated
    public r0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public c1 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i10) {
        d0 R = this.mUIImplementation.R(i10);
        if (R == null) {
            z3.a.G("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i10);
            return;
        }
        R.K();
        this.mUIImplementation.n(-1);
    }

    @ReactMethod
    public void manageChildren(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i10 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            z3.a.b("ReactNative", str);
            j4.c.a().c(k4.a.f33147d, str);
        }
        this.mUIImplementation.u(i10, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i10, Callback callback) {
        this.mUIImplementation.v(i10, callback);
    }

    @ReactMethod
    public void measureInWindow(int i10, Callback callback) {
        this.mUIImplementation.w(i10, callback);
    }

    @ReactMethod
    public void measureLayout(int i10, int i11, Callback callback, Callback callback2) {
        this.mUIImplementation.x(i10, i11, callback, callback2);
    }

    @ReactMethod
    @Deprecated
    public void measureLayoutRelativeToParent(int i10, Callback callback, Callback callback2) {
        this.mUIImplementation.z(i10, callback, callback2);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i10 = this.mBatchId;
        this.mBatchId = i10 + 1;
        com.facebook.systrace.b.a(0L, "onBatchCompleteUI").a("BatchId", i10).c();
        for (w0 w0Var : this.mListeners) {
            w0Var.a(this);
        }
        Iterator<UIManagerListener> it = this.mUIManagerListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mNumRootViews > 0) {
                this.mUIImplementation.n(i10);
            }
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.d();
        this.mUIImplementation.D();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        g1.a().c();
        b1.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.E();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.F();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.G();
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void preInitializeViewManagers(List<String> list) {
        if (ReactFeatureFlags.enableExperimentalStaticViewConfigs) {
            for (String str : list) {
                this.mUIImplementation.S(str);
            }
            return;
        }
        androidx.collection.a aVar = new androidx.collection.a();
        for (String str2 : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(str2);
            if (computeConstantsForViewManager != null) {
                aVar.put(str2, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(aVar);
    }

    public void prependUIBlock(q0 q0Var) {
        this.mUIImplementation.H(q0Var);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.I();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i10) {
        this.mUIImplementation.L(i10);
        this.mNumRootViews--;
    }

    @ReactMethod
    @Deprecated
    public void removeSubviewsFromContainerWithID(int i10) {
        this.mUIImplementation.O(i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(w0 w0Var) {
        this.mListeners.remove(w0Var);
    }

    @ReactMethod
    @Deprecated
    public void replaceExistingNonRootView(int i10, int i11) {
        this.mUIImplementation.P(i10, i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i10) {
        return x6.a.b(i10) ? i10 : this.mUIImplementation.Q(i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i10) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.r().U().w(i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i10, int i11) {
        int a10 = x6.a.a(i10);
        if (a10 == 2) {
            UIManager g10 = t0.g(getReactApplicationContext(), a10);
            if (g10 != null) {
                g10.sendAccessibilityEvent(i10, i11);
                return;
            }
            return;
        }
        this.mUIImplementation.T(i10, i11);
    }

    @ReactMethod
    public void setChildren(int i10, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i10 + ", children: " + readableArray;
            z3.a.b("ReactNative", str);
            j4.c.a().c(k4.a.f33147d, str);
        }
        this.mUIImplementation.U(i10, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i10, boolean z10) {
        this.mUIImplementation.V(i10, z10);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z10) {
        this.mUIImplementation.W(z10);
    }

    public void setViewHierarchyUpdateDebugListener(y6.a aVar) {
        this.mUIImplementation.X(aVar);
    }

    public void setViewLocalData(int i10, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i10, obj));
    }

    @ReactMethod
    public void showPopupMenu(int i10, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.Z(i10, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t10, String str, WritableMap writableMap, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i10, ReadableMap readableMap) {
        this.mUIImplementation.a0(i10, new f0(readableMap));
    }

    public void updateNodeSize(int i10, int i11, int i12) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.b0(i10, i11, i12);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i10, int i11, int i12, int i13, int i14) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i10, i11, i12));
    }

    @ReactMethod
    public void updateView(int i10, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i10 + ", class: " + str + ", props: " + readableMap;
            z3.a.b("ReactNative", str2);
            j4.c.a().c(k4.a.f33147d, str2);
        }
        this.mUIImplementation.e0(i10, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i10, int i11, Callback callback) {
        this.mUIImplementation.g0(i10, i11, callback);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i10) {
        this(reactApplicationContext, list, new s0(), i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t10, WritableMap writableMap, String str) {
        com.facebook.systrace.a.c(0L, "UIManagerModule.addRootView");
        int a10 = c0.a();
        this.mUIImplementation.J(t10, a10, new n0(getReactApplicationContext(), t10.getContext(), ((b0) t10).getSurfaceID(), -1));
        this.mNumRootViews++;
        com.facebook.systrace.a.g(0L);
        return a10;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        this.mUIImplementation.m(i10, str, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public com.facebook.react.uimanager.events.d getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i11, str, writableMap);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, d1 d1Var, s0 s0Var, int i10) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e(this, null);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        this.mNumRootViews = 0;
        com.facebook.react.uimanager.c.f(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        this.mModuleConstants = createConstants(d1Var);
        this.mCustomDirectEvents = u0.c();
        c1 c1Var = new c1(d1Var);
        this.mViewManagerRegistry = c1Var;
        this.mUIImplementation = s0Var.a(reactApplicationContext, c1Var, eVar, i10);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        com.facebook.systrace.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
        try {
            return v0.b(list, map, map2);
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, s0 s0Var, int i10) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e(this, null);
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        this.mNumRootViews = 0;
        com.facebook.react.uimanager.c.f(reactApplicationContext);
        com.facebook.react.uimanager.events.e eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        this.mEventDispatcher = eVar;
        HashMap b10 = h6.e.b();
        this.mCustomDirectEvents = b10;
        this.mModuleConstants = createConstants(list, null, b10);
        c1 c1Var = new c1(list);
        this.mViewManagerRegistry = c1Var;
        this.mUIImplementation = s0Var.a(reactApplicationContext, c1Var, eVar, i10);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
