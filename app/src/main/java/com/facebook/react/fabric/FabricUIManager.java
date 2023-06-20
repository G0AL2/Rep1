package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t0;
import com.facebook.react.views.text.x;
import com.facebook.react.views.text.y;
import com.inmobi.media.au;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import l6.b;
import l6.c;

@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class FabricUIManager implements UIManager, LifecycleEventListener {
    public static final boolean ENABLE_FABRIC_LOGS;
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private Binding mBinding;
    private final e mDispatchUIFrameCallback;
    private final EventBeatManager mEventBeatManager;
    private final com.facebook.react.uimanager.events.d mEventDispatcher;
    private final l6.b mMountItemDispatcher;
    private final l6.c mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private volatile boolean mShouldDeallocateEventDispatcher;
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = 10000;
    private c.b mMountItemExecutor = new a();

    /* loaded from: classes.dex */
    class a implements c.b {
        a() {
        }

        @Override // l6.c.b
        public void a(Queue<m6.d> queue) {
            FabricUIManager.this.mMountItemDispatcher.e(queue);
        }
    }

    /* loaded from: classes.dex */
    class b implements m6.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f15378b;

        b(FabricUIManager fabricUIManager, int i10, ReadableMap readableMap) {
            this.f15377a = i10;
            this.f15378b = readableMap;
        }

        @Override // m6.d
        public int a() {
            return -1;
        }

        @Override // m6.d
        public void b(l6.c cVar) {
            try {
                cVar.s(this.f15377a, this.f15378b);
            } catch (Exception unused) {
            }
        }

        public String toString() {
            return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(this.f15377a), "<hidden>");
        }
    }

    /* loaded from: classes.dex */
    class c implements m6.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15379a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15380b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f15382d;

        c(FabricUIManager fabricUIManager, int i10, int i11, int i12, boolean z10) {
            this.f15379a = i10;
            this.f15380b = i11;
            this.f15381c = i12;
            this.f15382d = z10;
        }

        @Override // m6.d
        public int a() {
            return this.f15379a;
        }

        @Override // m6.d
        public void b(l6.c cVar) {
            l6.d d10 = cVar.d(this.f15379a);
            if (d10 != null) {
                d10.L(this.f15380b, this.f15381c, this.f15382d);
                return;
            }
            String str = FabricUIManager.TAG;
            z3.a.j(str, "setJSResponder skipped, surface no longer available [" + this.f15379a + "]");
        }

        public String toString() {
            return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(this.f15380b), Integer.valueOf(this.f15379a));
        }
    }

    /* loaded from: classes.dex */
    class d implements m6.d {
        d(FabricUIManager fabricUIManager) {
        }

        @Override // m6.d
        public int a() {
            return -1;
        }

        @Override // m6.d
        public void b(l6.c cVar) {
            cVar.b();
        }

        public String toString() {
            return "CLEAR_JS_RESPONDER";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends com.facebook.react.fabric.c {

        /* renamed from: c  reason: collision with root package name */
        private volatile boolean f15383c;

        /* synthetic */ e(FabricUIManager fabricUIManager, ReactContext reactContext, a aVar) {
            this(reactContext);
        }

        @Override // com.facebook.react.fabric.c
        public void c(long j10) {
            if (this.f15383c && !FabricUIManager.this.mDestroyed) {
                if (FabricUIManager.this.mDriveCxxAnimations && FabricUIManager.this.mBinding != null) {
                    FabricUIManager.this.mBinding.driveCxxAnimations();
                }
                try {
                    try {
                        FabricUIManager.this.mMountItemDispatcher.g(j10);
                        FabricUIManager.this.mMountItemDispatcher.q();
                        return;
                    } catch (Exception e10) {
                        z3.a.k(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e10);
                        d();
                        throw e10;
                    }
                } finally {
                    g.i().m(g.c.DISPATCH_UI, FabricUIManager.this.mDispatchUIFrameCallback);
                }
            }
            z3.a.G(FabricUIManager.TAG, "Not flushing pending UI operations because of previously thrown Exception");
        }

        void d() {
            this.f15383c = false;
        }

        private e(ReactContext reactContext) {
            super(reactContext);
            this.f15383c = true;
        }
    }

    /* loaded from: classes.dex */
    private class f implements b.a {
        private f() {
        }

        @Override // l6.b.a
        public void a() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        /* synthetic */ f(FabricUIManager fabricUIManager, a aVar) {
            this();
        }
    }

    static {
        ENABLE_FABRIC_LOGS = ReactFeatureFlags.enableFabricLogs || j4.c.a().a(k4.a.f33148e);
        com.facebook.react.fabric.b.a();
    }

    @Deprecated
    public FabricUIManager(ReactApplicationContext reactApplicationContext, c1 c1Var, com.facebook.react.uimanager.events.d dVar, EventBeatManager eventBeatManager) {
        this.mShouldDeallocateEventDispatcher = false;
        this.mDispatchUIFrameCallback = new e(this, reactApplicationContext, null);
        this.mReactApplicationContext = reactApplicationContext;
        l6.c cVar = new l6.c(c1Var, this.mMountItemExecutor);
        this.mMountingManager = cVar;
        this.mMountItemDispatcher = new l6.b(cVar, new f(this, null));
        this.mEventDispatcher = dVar;
        this.mShouldDeallocateEventDispatcher = false;
        this.mEventBeatManager = eventBeatManager;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private m6.d createIntBufferBatchMountItem(int i10, int[] iArr, Object[] objArr, int i11) {
        return new IntBufferBatchMountItem(i10, iArr, objArr, i11);
    }

    private long measure(int i10, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, float f11, float f12, float f13) {
        return measure(i10, str, readableMap, readableMap2, readableMap3, f10, f11, f12, f13, null);
    }

    private NativeArray measureLines(ReadableMap readableMap, ReadableMap readableMap2, float f10, float f11) {
        return (NativeArray) x.g(this.mReactApplicationContext, readableMap, readableMap2, r.c(f10));
    }

    private NativeArray measureLinesMapBuffer(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11) {
        return (NativeArray) y.f(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, r.c(f10));
    }

    private long measureMapBuffer(int i10, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, float f11, float f12, float f13, float[] fArr) {
        ReactContext reactContext;
        if (i10 > 0) {
            l6.d e10 = this.mMountingManager.e(i10, "measure");
            if (e10.C()) {
                return 0L;
            }
            reactContext = e10.t();
        } else {
            reactContext = this.mReactApplicationContext;
        }
        return this.mMountingManager.l(reactContext, str, readableMapBuffer, readableMapBuffer2, l6.a.d(f10, f11), l6.a.c(f10, f11), l6.a.d(f12, f13), l6.a.c(f12, f13), fArr);
    }

    private void preallocateView(int i10, int i11, String str, ReadableMap readableMap, Object obj, Object obj2, boolean z10) {
        this.mMountItemDispatcher.b(new m6.e(i10, i11, com.facebook.react.fabric.a.a(str), readableMap, (m0) obj, (EventEmitterWrapper) obj2, z10));
    }

    private void scheduleMountItem(m6.d dVar, int i10, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z10 = dVar instanceof IntBufferBatchMountItem;
        boolean z11 = (z10 && ((IntBufferBatchMountItem) dVar).h()) || !(z10 || dVar == null);
        for (Iterator<UIManagerListener> it = this.mListeners.iterator(); it.hasNext(); it = it) {
            it.next().didScheduleMountItems(this);
        }
        if (z10) {
            this.mCommitStartTime = j10;
            this.mLayoutTime = j14 - j13;
            this.mFinishTransactionCPPTime = j16 - j15;
            this.mFinishTransactionTime = uptimeMillis - j15;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z11) {
            this.mMountItemDispatcher.a(dVar);
            if (UiThreadUtil.isOnUiThread()) {
                this.mMountItemDispatcher.q();
            }
        }
        if (z10) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i10, j10);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i10, j15);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i10, j16);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i10, j11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i10, j12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i10, j13);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i10, j14);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i10);
            if (ENABLE_FABRIC_LOGS) {
                String str = TAG;
                z3.a.o(str, "Statistic of Fabric commit #: " + i10 + "\n - Total commit time: " + (j16 - j10) + " ms.\n - Layout: " + this.mLayoutTime + " ms.\n - Diffing: " + (j12 - j11) + " ms.\n - FinishTransaction (Diffing + Processing + Serialization of MountingInstructions): " + this.mFinishTransactionCPPTime + " ms.");
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t10, WritableMap writableMap, String str) {
        String str2 = TAG;
        ReactSoftExceptionLogger.logSoftException(str2, new h("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        int a10 = c0.a();
        b0 b0Var = (b0) t10;
        this.mMountingManager.p(a10, new n0(this.mReactApplicationContext, t10.getContext(), b0Var.getSurfaceID(), a10), t10);
        String jSModuleName = b0Var.getJSModuleName();
        if (ENABLE_FABRIC_LOGS) {
            z3.a.d(str2, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(a10));
        }
        this.mBinding.startSurface(a10, jSModuleName, (NativeMap) writableMap);
        if (str != null) {
            this.mBinding.renderTemplateToSurface(a10, str);
        }
        return a10;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(com.facebook.react.fabric.d dVar, View view) {
        this.mMountingManager.a(dVar.a(), view, new n0(this.mReactApplicationContext, view.getContext(), dVar.d(), dVar.a()));
        dVar.c(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.a(new d(this));
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public int getColor(int i10, ReadableMap readableMap) {
        Integer color = ColorPropConverter.getColor(readableMap, this.mMountingManager.e(i10, "getColor").t());
        if (color != null) {
            return color.intValue();
        }
        return 0;
    }

    public ReadableMap getInspectorDataForInstance(int i10, View view) {
        UiThreadUtil.assertOnUiThread();
        return this.mBinding.getInspectorDataForInstance(this.mMountingManager.c(i10, view.getId()));
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        hashMap.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        hashMap.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.n()));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.m()));
        hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        hashMap.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return hashMap;
    }

    public boolean getThemeData(int i10, float[] fArr) {
        n0 t10 = this.mMountingManager.e(i10, "getThemeData").t();
        if (t10 == null) {
            z3.a.G(TAG, "\"themedReactContext\" is null when call \"getThemeData\"");
            return false;
        }
        float[] a10 = t0.a(t10);
        fArr[0] = a10[0];
        fArr[1] = a10[1];
        fArr[2] = a10[2];
        fArr[3] = a10[3];
        return true;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
        this.mEventDispatcher.i(2, new FabricEventEmitter(this));
        this.mEventDispatcher.c(this.mEventBeatManager);
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        String str = TAG;
        z3.a.o(str, "FabricUIManager.onCatalystInstanceDestroy");
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mDispatchUIFrameCallback.d();
        this.mEventDispatcher.h(this.mEventBeatManager);
        this.mEventDispatcher.e(2);
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        this.mDispatchUIFrameCallback.d();
        this.mBinding.a();
        this.mBinding = null;
        b1.a();
        if (this.mShouldDeallocateEventDispatcher) {
            this.mEventDispatcher.d();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        g.i().o(g.c.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        g.i().m(g.c.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.b();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void preInitializeViewManagers(List<String> list) {
        for (String str : list) {
            this.mMountingManager.i(str);
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, writableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("top")) {
            return "on" + str.substring(3);
        }
        return str;
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i10) {
        UiThreadUtil.assertOnUiThread();
        l6.d f10 = this.mMountingManager.f(i10);
        if (f10 == null) {
            return null;
        }
        return f10.x(i10);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i10, int i11) {
        this.mMountItemDispatcher.a(new m6.f(-1, i10, i11));
    }

    public void sendAccessibilityEventFromJS(int i10, int i11, String str) {
        int i12;
        if ("focus".equals(str)) {
            i12 = 8;
        } else if ("windowStateChange".equals(str)) {
            i12 = 32;
        } else if (!au.CLICK_BEACON.equals(str)) {
            throw new IllegalArgumentException("sendAccessibilityEventFromJS: invalid eventType " + str);
        } else {
            i12 = 1;
        }
        this.mMountItemDispatcher.a(new m6.f(i10, i11, i12));
    }

    public void setBinding(Binding binding) {
        this.mBinding = binding;
    }

    public void setJSResponder(int i10, int i11, int i12, boolean z10) {
        this.mMountItemDispatcher.a(new c(this, i10, i11, i12, z10));
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t10, String str, WritableMap writableMap, int i10, int i11) {
        int a10 = c0.a();
        Context context = t10.getContext();
        n0 n0Var = new n0(this.mReactApplicationContext, context, str, a10);
        if (ENABLE_FABRIC_LOGS) {
            z3.a.d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(a10));
        }
        this.mMountingManager.p(a10, n0Var, t10);
        Point b10 = UiThreadUtil.isOnUiThread() ? j0.b(t10) : new Point(0, 0);
        this.mBinding.startSurfaceWithConstraints(a10, str, (NativeMap) writableMap, l6.a.b(i10), l6.a.a(i10), l6.a.b(i11), l6.a.a(i11), b10.x, b10.y, s6.a.d().g(context), s6.a.d().b(context));
        return a10;
    }

    public void stopSurface(com.facebook.react.fabric.d dVar) {
        if (!dVar.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.q(dVar.a());
        dVar.stop();
        if (dVar instanceof SurfaceHandlerBinding) {
            this.mBinding.unregisterSurface((SurfaceHandlerBinding) dVar);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i10, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i11 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i11 + 1;
        b bVar = new b(this, i10, readableMap);
        if (!this.mMountingManager.h(i10)) {
            this.mMountItemDispatcher.a(bVar);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i11);
        if (ENABLE_FABRIC_LOGS) {
            z3.a.d(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i10), "<hidden>");
        }
        bVar.b(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if (ENABLE_FABRIC_LOGS) {
            z3.a.c(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i10));
        }
        l6.d d10 = this.mMountingManager.d(i10);
        if (d10 == null) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new h("Cannot updateRootLayoutSpecs on surfaceId that does not exist: " + i10));
            return;
        }
        n0 t10 = d10.t();
        if (t10 != null) {
            boolean g10 = s6.a.d().g(t10);
            z11 = s6.a.d().b(t10);
            z10 = g10;
        } else {
            z10 = false;
            z11 = false;
        }
        this.mBinding.setConstraints(i10, l6.a.b(i11), l6.a.a(i11), l6.a.b(i12), l6.a.a(i12), i13, i14, z10, z11);
    }

    private long measure(int i10, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, float f11, float f12, float f13, float[] fArr) {
        ReactContext reactContext;
        if (i10 > 0) {
            l6.d e10 = this.mMountingManager.e(i10, "measure");
            if (e10.C()) {
                return 0L;
            }
            reactContext = e10.t();
        } else {
            reactContext = this.mReactApplicationContext;
        }
        return this.mMountingManager.k(reactContext, str, readableMap, readableMap2, readableMap3, l6.a.d(f10, f11), l6.a.c(f10, f11), l6.a.d(f12, f13), l6.a.c(f12, f13), fArr);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    public com.facebook.react.uimanager.events.d getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        receiveEvent(i10, i11, str, false, 0, writableMap);
    }

    @Deprecated
    public void dispatchCommand(int i10, int i11, int i12, ReadableArray readableArray) {
        this.mMountItemDispatcher.d(new m6.b(i10, i11, i12, readableArray));
    }

    public void receiveEvent(int i10, int i11, String str, boolean z10, int i12, WritableMap writableMap) {
        receiveEvent(i10, i11, str, z10, i12, writableMap, 2);
    }

    public void dispatchCommand(int i10, int i11, String str, ReadableArray readableArray) {
        this.mMountItemDispatcher.d(new m6.c(i10, i11, str, readableArray));
    }

    public void receiveEvent(int i10, int i11, String str, boolean z10, int i12, WritableMap writableMap, int i13) {
        if (this.mDestroyed) {
            z3.a.j(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper c10 = this.mMountingManager.c(i10, i11);
        if (c10 != null) {
            if (z10) {
                c10.c(str, writableMap, i12);
                return;
            } else {
                c10.b(str, writableMap, i13);
                return;
            }
        }
        String str2 = TAG;
        z3.a.b(str2, "Unable to invoke event: " + str + " for reactTag: " + i11);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i10) {
        this.mMountingManager.q(i10);
        this.mBinding.stopSurface(i10);
    }

    public void startSurface(com.facebook.react.fabric.d dVar, Context context, View view) {
        int a10 = c0.a();
        this.mMountingManager.p(a10, new n0(this.mReactApplicationContext, context, dVar.d(), a10), view);
        dVar.b(a10);
        if (dVar instanceof SurfaceHandlerBinding) {
            this.mBinding.registerSurface((SurfaceHandlerBinding) dVar);
        }
        dVar.c(view != null);
        dVar.start();
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, c1 c1Var, EventBeatManager eventBeatManager) {
        com.facebook.react.uimanager.events.d eVar;
        this.mShouldDeallocateEventDispatcher = false;
        this.mDispatchUIFrameCallback = new e(this, reactApplicationContext, null);
        this.mReactApplicationContext = reactApplicationContext;
        l6.c cVar = new l6.c(c1Var, this.mMountItemExecutor);
        this.mMountingManager = cVar;
        this.mMountItemDispatcher = new l6.b(cVar, new f(this, null));
        if (ReactFeatureFlags.enableLockFreeEventDispatcher) {
            eVar = new com.facebook.react.uimanager.events.h(reactApplicationContext);
        } else {
            eVar = new com.facebook.react.uimanager.events.e(reactApplicationContext);
        }
        this.mEventDispatcher = eVar;
        this.mShouldDeallocateEventDispatcher = true;
        this.mEventBeatManager = eventBeatManager;
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
