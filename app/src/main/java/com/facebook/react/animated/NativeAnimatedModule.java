package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.t0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

@o6.a(name = NativeAnimatedModule.NAME)
/* loaded from: classes.dex */
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    public static final String NAME = "NativeAnimatedModule";
    private final com.facebook.react.uimanager.f mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<com.facebook.react.animated.l> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;
    private final ConcurrentLinkedQueue<w> mOperations;
    private final ConcurrentLinkedQueue<w> mPreOperations;
    private final com.facebook.react.modules.core.g mReactChoreographer;
    private int mUIManagerType;

    /* loaded from: classes.dex */
    class a extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15191b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f15192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(NativeAnimatedModule nativeAnimatedModule, int i10, double d10) {
            super(nativeAnimatedModule, null);
            this.f15191b = i10;
            this.f15192c = d10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.w(this.f15191b, this.f15192c);
        }
    }

    /* loaded from: classes.dex */
    class b extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15193b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super(nativeAnimatedModule, null);
            this.f15193b = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.n(this.f15193b);
        }
    }

    /* loaded from: classes.dex */
    class c extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15194b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super(nativeAnimatedModule, null);
            this.f15194b = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.m(this.f15194b);
        }
    }

    /* loaded from: classes.dex */
    class d extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15195b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15196c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableMap f15197d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Callback f15198e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(NativeAnimatedModule nativeAnimatedModule, int i10, int i11, ReadableMap readableMap, Callback callback) {
            super(nativeAnimatedModule, null);
            this.f15195b = i10;
            this.f15196c = i11;
            this.f15197d = readableMap;
            this.f15198e = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.y(this.f15195b, this.f15196c, this.f15197d, this.f15198e);
        }
    }

    /* loaded from: classes.dex */
    class e extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15199b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super(nativeAnimatedModule, null);
            this.f15199b = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.A(this.f15199b);
        }
    }

    /* loaded from: classes.dex */
    class f extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super(nativeAnimatedModule, null);
            this.f15200b = i10;
            this.f15201c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.h(this.f15200b, this.f15201c);
        }
    }

    /* loaded from: classes.dex */
    class g extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15202b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super(nativeAnimatedModule, null);
            this.f15202b = i10;
            this.f15203c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.k(this.f15202b, this.f15203c);
        }
    }

    /* loaded from: classes.dex */
    class h extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15204b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15205c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super(nativeAnimatedModule, null);
            this.f15204b = i10;
            this.f15205c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.g(this.f15204b, this.f15205c);
        }
    }

    /* loaded from: classes.dex */
    class i extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15206b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super(nativeAnimatedModule, null);
            this.f15206b = i10;
            this.f15207c = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.j(this.f15206b, this.f15207c);
        }
    }

    /* loaded from: classes.dex */
    class j extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15208b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super(nativeAnimatedModule, null);
            this.f15208b = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.u(this.f15208b);
        }
    }

    /* loaded from: classes.dex */
    class k extends com.facebook.react.uimanager.f {
        k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.f
        protected void c(long j10) {
            try {
                com.facebook.react.animated.l nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager != null && nodesManager.r()) {
                    nodesManager.v(j10);
                }
                if (nodesManager == null && NativeAnimatedModule.this.mReactChoreographer == null) {
                    return;
                }
                ((com.facebook.react.modules.core.g) f6.a.c(NativeAnimatedModule.this.mReactChoreographer)).m(g.c.NATIVE_ANIMATED_MODULE, NativeAnimatedModule.this.mAnimatedFrameCallback);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    class l extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15210b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f15211c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableMap f15212d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(NativeAnimatedModule nativeAnimatedModule, int i10, String str, ReadableMap readableMap) {
            super(nativeAnimatedModule, null);
            this.f15210b = i10;
            this.f15211c = str;
            this.f15212d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.f(this.f15210b, this.f15211c, this.f15212d);
        }
    }

    /* loaded from: classes.dex */
    class m extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15213b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f15214c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f15215d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(NativeAnimatedModule nativeAnimatedModule, int i10, String str, int i11) {
            super(nativeAnimatedModule, null);
            this.f15213b = i10;
            this.f15214c = str;
            this.f15215d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.t(this.f15213b, this.f15214c, this.f15215d);
        }
    }

    /* loaded from: classes.dex */
    class n extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15216b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f15217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(NativeAnimatedModule nativeAnimatedModule, int i10, Callback callback) {
            super(nativeAnimatedModule, null);
            this.f15216b = i10;
            this.f15217c = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.p(this.f15216b, this.f15217c);
        }
    }

    /* loaded from: classes.dex */
    class o implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f15218a;

        o(long j10) {
            this.f15218a = j10;
        }

        @Override // com.facebook.react.uimanager.q0
        public void a(com.facebook.react.uimanager.n nVar) {
            NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
            nativeAnimatedModule.executeAllOperations(nativeAnimatedModule.mPreOperations, this.f15218a);
        }
    }

    /* loaded from: classes.dex */
    class p implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f15220a;

        p(long j10) {
            this.f15220a = j10;
        }

        @Override // com.facebook.react.uimanager.q0
        public void a(com.facebook.react.uimanager.n nVar) {
            NativeAnimatedModule nativeAnimatedModule = NativeAnimatedModule.this;
            nativeAnimatedModule.executeAllOperations(nativeAnimatedModule.mOperations, this.f15220a);
        }
    }

    /* loaded from: classes.dex */
    class q extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15222b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f15223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(NativeAnimatedModule nativeAnimatedModule, int i10, ReadableMap readableMap) {
            super(nativeAnimatedModule, null);
            this.f15222b = i10;
            this.f15223c = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.i(this.f15222b, this.f15223c);
        }
    }

    /* loaded from: classes.dex */
    class r implements com.facebook.react.animated.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15224a;

        r(int i10) {
            this.f15224a = i10;
        }

        @Override // com.facebook.react.animated.c
        public void a(double d10) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("tag", this.f15224a);
            createMap.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, d10);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", createMap);
            }
        }
    }

    /* loaded from: classes.dex */
    class s extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15226b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.animated.c f15227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(NativeAnimatedModule nativeAnimatedModule, int i10, com.facebook.react.animated.c cVar) {
            super(nativeAnimatedModule, null);
            this.f15226b = i10;
            this.f15227c = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.z(this.f15226b, this.f15227c);
        }
    }

    /* loaded from: classes.dex */
    class t extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super(nativeAnimatedModule, null);
            this.f15228b = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.C(this.f15228b);
        }
    }

    /* loaded from: classes.dex */
    class u extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super(nativeAnimatedModule, null);
            this.f15229b = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.l(this.f15229b);
        }
    }

    /* loaded from: classes.dex */
    class v extends w {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ double f15231c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(NativeAnimatedModule nativeAnimatedModule, int i10, double d10) {
            super(nativeAnimatedModule, null);
            this.f15230b = i10;
            this.f15231c = d10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.w
        public void a(com.facebook.react.animated.l lVar) {
            lVar.x(this.f15230b, this.f15231c);
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ConcurrentLinkedQueue<>();
        this.mPreOperations = new ConcurrentLinkedQueue<>();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = com.facebook.react.modules.core.g.i();
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void addOperation(w wVar) {
        wVar.c(this.mCurrentBatchNumber);
        this.mOperations.add(wVar);
    }

    private void addPreOperation(w wVar) {
        wVar.c(this.mCurrentBatchNumber);
        this.mPreOperations.add(wVar);
    }

    private void addUnbatchedOperation(w wVar) {
        wVar.c(-1L);
        this.mOperations.add(wVar);
    }

    private void clearFrameCallback() {
        ((com.facebook.react.modules.core.g) f6.a.c(this.mReactChoreographer)).o(g.c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void decrementInFlightAnimationsForViewTag(int i10) {
        if (x6.a.a(i10) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i11 = this.mNumNonFabricAnimations;
        if (i11 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else if (this.mNumFabricAnimations != 0 || i11 <= 0 || this.mUIManagerType == 1) {
        } else {
            this.mUIManagerType = 1;
        }
    }

    private void enqueueFrameCallback() {
        ((com.facebook.react.modules.core.g) f6.a.c(this.mReactChoreographer)).m(g.c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeAllOperations(Queue<w> queue, long j10) {
        w poll;
        com.facebook.react.animated.l nodesManager = getNodesManager();
        while (true) {
            w peek = queue.peek();
            if (peek == null || peek.b() > j10 || (poll = queue.poll()) == null) {
                return;
            }
            poll.a(nodesManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.react.animated.l getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            this.mNodesManager.compareAndSet(null, new com.facebook.react.animated.l(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    private void initializeLifecycleEventListenersForViewTag(int i10) {
        ReactApplicationContext reactApplicationContext;
        UIManager g10;
        int a10 = x6.a.a(i10);
        this.mUIManagerType = a10;
        if (a10 == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        com.facebook.react.animated.l nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.s(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mInitializedForFabric && this.mUIManagerType == 2) {
            return;
        }
        if ((this.mInitializedForNonFabric && this.mUIManagerType == 1) || (reactApplicationContext = getReactApplicationContext()) == null || (g10 = t0.g(reactApplicationContext, this.mUIManagerType)) == null) {
            return;
        }
        g10.addUIManagerEventListener(this);
        if (this.mUIManagerType == 2) {
            this.mInitializedForFabric = true;
        } else {
            this.mInitializedForNonFabric = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d10, String str, ReadableMap readableMap) {
        int i10 = (int) d10;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new l(this, i10, str, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d10, double d11) {
        int i10 = (int) d11;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new h(this, (int) d10, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d10, double d11) {
        addOperation(new f(this, (int) d10, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d10, ReadableMap readableMap) {
        addOperation(new q(this, (int) d10, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j10 = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j10 = this.mCurrentBatchNumber;
            }
        }
        executeAllOperations(this.mPreOperations, j10);
        executeAllOperations(this.mOperations, j10);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d10, double d11) {
        int i10 = (int) d11;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new i(this, (int) d10, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d10, double d11) {
        addOperation(new g(this, (int) d10, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d10) {
        addOperation(new u(this, (int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d10) {
        addOperation(new c(this, (int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d10) {
        addOperation(new b(this, (int) d10));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d10, Callback callback) {
        addOperation(new n(this, (int) d10, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.addLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d10, String str, double d11) {
        int i10 = (int) d10;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new m(this, i10, str, (int) d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d10) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d10) {
        addPreOperation(new j(this, (int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d10, double d11) {
        addOperation(new a(this, (int) d10, d11));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d10, double d11) {
        addOperation(new v(this, (int) d10, d11));
    }

    public void setNodesManager(com.facebook.react.animated.l lVar) {
        this.mNodesManager.set(lVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d10, double d11, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new d(this, (int) d10, (int) d11, readableMap, callback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d10) {
        int i10 = (int) d10;
        addOperation(new s(this, i10, new r(i10)));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d10) {
        addOperation(new e(this, (int) d10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d10) {
        addOperation(new t(this, (int) d10));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.isEmpty() && this.mPreOperations.isEmpty()) || this.mUIManagerType == 2) {
            return;
        }
        long j10 = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j10;
        o oVar = new o(j10);
        p pVar = new p(j10);
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(oVar);
        uIManagerModule.addUIBlock(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class w {

        /* renamed from: a  reason: collision with root package name */
        long f15232a;

        private w(NativeAnimatedModule nativeAnimatedModule) {
            this.f15232a = -1L;
        }

        abstract void a(com.facebook.react.animated.l lVar);

        public long b() {
            return this.f15232a;
        }

        public void c(long j10) {
            this.f15232a = j10;
        }

        /* synthetic */ w(NativeAnimatedModule nativeAnimatedModule, k kVar) {
            this(nativeAnimatedModule);
        }
    }
}
