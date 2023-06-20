package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.r;
import com.facebook.react.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nd.k;
import nd.o;

@o6.a(name = RNGestureHandlerModule.MODULE_NAME)
/* loaded from: classes3.dex */
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private List<Integer> mEnqueuedRootViewInit;
    private nd.i mEventListener;
    private d[] mHandlerFactories;
    private com.swmansion.gesturehandler.react.d mInteractionManager;
    private final com.swmansion.gesturehandler.react.f mRegistry;
    private List<com.swmansion.gesturehandler.react.g> mRoots;

    /* loaded from: classes3.dex */
    class a implements nd.i {
        a() {
        }

        @Override // nd.i
        public void a(nd.b bVar, int i10, int i11) {
            RNGestureHandlerModule.this.onStateChange(bVar, i10, i11);
        }

        @Override // nd.i
        public void b(nd.b bVar, MotionEvent motionEvent) {
            RNGestureHandlerModule.this.onTouchEvent(bVar, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements q0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f28420a;

        b(int i10) {
            this.f28420a = i10;
        }

        @Override // com.facebook.react.uimanager.q0
        public void a(n nVar) {
            View w10 = nVar.w(this.f28420a);
            if (w10 instanceof com.swmansion.gesturehandler.react.a) {
                ((com.swmansion.gesturehandler.react.a) w10).w();
            }
            synchronized (RNGestureHandlerModule.this.mEnqueuedRootViewInit) {
                RNGestureHandlerModule.this.mEnqueuedRootViewInit.remove(new Integer(this.f28420a));
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class c extends d<nd.a> {
        private c() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "FlingGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<nd.a> e() {
            return nd.a.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: f */
        public void b(nd.a aVar, ReadableMap readableMap) {
            super.b(aVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                aVar.W(readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                aVar.V(readableMap.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: g */
        public nd.a c(Context context) {
            return new nd.a();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        /* renamed from: h */
        public void a(nd.a aVar, WritableMap writableMap) {
            super.a(aVar, writableMap);
            writableMap.putDouble("x", r.a(aVar.m()));
            writableMap.putDouble("y", r.a(aVar.n()));
            writableMap.putDouble("absoluteX", r.a(aVar.k()));
            writableMap.putDouble("absoluteY", r.a(aVar.l()));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class d<T extends nd.b> implements com.swmansion.gesturehandler.react.c<T> {
        private d() {
        }

        @Override // com.swmansion.gesturehandler.react.c
        public void a(T t10, WritableMap writableMap) {
            writableMap.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, t10.o());
        }

        public void b(T t10, ReadableMap readableMap) {
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                t10.L(readableMap.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_ENABLED)) {
                t10.H(readableMap.getBoolean(RNGestureHandlerModule.KEY_ENABLED));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.handleHitSlopProperty(t10, readableMap);
            }
        }

        public abstract T c(Context context);

        public abstract String d();

        public abstract Class<T> e();

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static class e extends d<nd.g> {
        private e() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "LongPressGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<nd.g> e() {
            return nd.g.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: f */
        public void b(nd.g gVar, ReadableMap readableMap) {
            super.b(gVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                gVar.V(readableMap.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (readableMap.hasKey("maxDist")) {
                gVar.U(r.b(readableMap.getDouble("maxDist")));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: g */
        public nd.g c(Context context) {
            return new nd.g(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        /* renamed from: h */
        public void a(nd.g gVar, WritableMap writableMap) {
            super.a(gVar, writableMap);
            writableMap.putDouble("x", r.a(gVar.m()));
            writableMap.putDouble("y", r.a(gVar.n()));
            writableMap.putDouble("absoluteX", r.a(gVar.k()));
            writableMap.putDouble("absoluteY", r.a(gVar.l()));
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static class f extends d<nd.h> {
        private f() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "NativeViewGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<nd.h> e() {
            return nd.h.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: f */
        public void b(nd.h hVar, ReadableMap readableMap) {
            super.b(hVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                hVar.V(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                hVar.U(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: g */
        public nd.h c(Context context) {
            return new nd.h();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        /* renamed from: h */
        public void a(nd.h hVar, WritableMap writableMap) {
            super.a(hVar, writableMap);
            writableMap.putBoolean("pointerInside", hVar.x());
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static class g extends d<nd.j> {
        private g() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "PanGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<nd.j> e() {
            return nd.j.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: f */
        public void b(nd.j jVar, ReadableMap readableMap) {
            boolean z10;
            super.b(jVar, readableMap);
            boolean z11 = true;
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                jVar.a0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z10 = true;
            } else {
                z10 = false;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                jVar.Z(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                jVar.f0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                jVar.e0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                jVar.c0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                jVar.b0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                jVar.h0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                jVar.g0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                jVar.l0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                jVar.m0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z10 = true;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                jVar.n0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z11 = z10;
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                jVar.j0(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z11) {
                jVar.j0(Float.MAX_VALUE);
            }
            if (readableMap.hasKey("minPointers")) {
                jVar.k0(readableMap.getInt("minPointers"));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                jVar.i0(readableMap.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                jVar.d0(readableMap.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: g */
        public nd.j c(Context context) {
            return new nd.j(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        /* renamed from: h */
        public void a(nd.j jVar, WritableMap writableMap) {
            super.a(jVar, writableMap);
            writableMap.putDouble("x", r.a(jVar.m()));
            writableMap.putDouble("y", r.a(jVar.n()));
            writableMap.putDouble("absoluteX", r.a(jVar.k()));
            writableMap.putDouble("absoluteY", r.a(jVar.l()));
            writableMap.putDouble("translationX", r.a(jVar.V()));
            writableMap.putDouble("translationY", r.a(jVar.W()));
            writableMap.putDouble("velocityX", r.a(jVar.X()));
            writableMap.putDouble("velocityY", r.a(jVar.Y()));
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static class h extends d<k> {
        private h() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "PinchGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<k> e() {
            return k.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: f */
        public k c(Context context) {
            return new k();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        /* renamed from: g */
        public void a(k kVar, WritableMap writableMap) {
            super.a(kVar, writableMap);
            writableMap.putDouble("scale", kVar.c0());
            writableMap.putDouble("focalX", r.a(kVar.a0()));
            writableMap.putDouble("focalY", r.a(kVar.b0()));
            writableMap.putDouble("velocity", kVar.d0());
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static class i extends d<nd.n> {
        private i() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "RotationGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<nd.n> e() {
            return nd.n.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: f */
        public nd.n c(Context context) {
            return new nd.n();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        /* renamed from: g */
        public void a(nd.n nVar, WritableMap writableMap) {
            super.a(nVar, writableMap);
            writableMap.putDouble("rotation", nVar.Z());
            writableMap.putDouble("anchorX", r.a(nVar.X()));
            writableMap.putDouble("anchorY", r.a(nVar.Y()));
            writableMap.putDouble("velocity", nVar.a0());
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private static class j extends d<o> {
        private j() {
            super(null);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String d() {
            return "TapGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<o> e() {
            return o.class;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: f */
        public void b(o oVar, ReadableMap readableMap) {
            super.b(oVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                oVar.b0(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                oVar.X(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                oVar.V(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                oVar.Y(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                oVar.Z(r.b(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (readableMap.hasKey("maxDist")) {
                oVar.W(r.b(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey("minPointers")) {
                oVar.a0(readableMap.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: g */
        public o c(Context context) {
            return new o();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        /* renamed from: h */
        public void a(o oVar, WritableMap writableMap) {
            super.a(oVar, writableMap);
            writableMap.putDouble("x", r.a(oVar.m()));
            writableMap.putDouble("y", r.a(oVar.n()));
            writableMap.putDouble("absoluteX", r.a(oVar.k()));
            writableMap.putDouble("absoluteY", r.a(oVar.l()));
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEventListener = new a();
        this.mHandlerFactories = new d[]{new f(null), new j(null), new e(null), new g(null), new h(null), new i(null), new c(null)};
        this.mRegistry = new com.swmansion.gesturehandler.react.f();
        this.mInteractionManager = new com.swmansion.gesturehandler.react.d();
        this.mRoots = new ArrayList();
        this.mEnqueuedRootViewInit = new ArrayList();
    }

    private d findFactoryForHandler(nd.b bVar) {
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.mHandlerFactories;
            if (i10 >= dVarArr.length) {
                return null;
            }
            d dVar = dVarArr[i10];
            if (dVar.e().equals(bVar.getClass())) {
                return dVar;
            }
            i10++;
        }
    }

    private com.swmansion.gesturehandler.react.g findRootHelperForViewAncestor(int i10) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i10);
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i11 = 0; i11 < this.mRoots.size(); i11++) {
                com.swmansion.gesturehandler.react.g gVar = this.mRoots.get(i11);
                ViewGroup f10 = gVar.f();
                if ((f10 instanceof x) && ((x) f10).getRootViewTag() == resolveRootTagFromReactTag) {
                    return gVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleHitSlopProperty(nd.b bVar, ReadableMap readableMap) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (readableMap.getType(KEY_HIT_SLOP) == ReadableType.Number) {
            float b10 = r.b(readableMap.getDouble(KEY_HIT_SLOP));
            bVar.I(b10, b10, b10, b10, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap(KEY_HIT_SLOP);
        if (map.hasKey(KEY_HIT_SLOP_HORIZONTAL)) {
            f10 = r.b(map.getDouble(KEY_HIT_SLOP_HORIZONTAL));
            f11 = f10;
        } else {
            f10 = Float.NaN;
            f11 = Float.NaN;
        }
        if (map.hasKey(KEY_HIT_SLOP_VERTICAL)) {
            f12 = r.b(map.getDouble(KEY_HIT_SLOP_VERTICAL));
            f13 = f12;
        } else {
            f12 = Float.NaN;
            f13 = Float.NaN;
        }
        if (map.hasKey(KEY_HIT_SLOP_LEFT)) {
            f10 = r.b(map.getDouble(KEY_HIT_SLOP_LEFT));
        }
        float f14 = f10;
        if (map.hasKey(KEY_HIT_SLOP_TOP)) {
            f12 = r.b(map.getDouble(KEY_HIT_SLOP_TOP));
        }
        float f15 = f12;
        if (map.hasKey(KEY_HIT_SLOP_RIGHT)) {
            f11 = r.b(map.getDouble(KEY_HIT_SLOP_RIGHT));
        }
        float f16 = f11;
        if (map.hasKey(KEY_HIT_SLOP_BOTTOM)) {
            f13 = r.b(map.getDouble(KEY_HIT_SLOP_BOTTOM));
        }
        bVar.I(f14, f15, f16, f13, map.hasKey(KEY_HIT_SLOP_WIDTH) ? r.b(map.getDouble(KEY_HIT_SLOP_WIDTH)) : Float.NaN, map.hasKey(KEY_HIT_SLOP_HEIGHT) ? r.b(map.getDouble(KEY_HIT_SLOP_HEIGHT)) : Float.NaN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStateChange(nd.b bVar, int i10, int i11) {
        if (bVar.q() < 0) {
            return;
        }
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().g(com.swmansion.gesturehandler.react.i.b(bVar, i10, i11, findFactoryForHandler(bVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchEvent(nd.b bVar, MotionEvent motionEvent) {
        if (bVar.q() >= 0 && bVar.p() == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().g(com.swmansion.gesturehandler.react.b.b(bVar, findFactoryForHandler(bVar)));
        }
    }

    private void tryInitializeHandlerForReactRootView(int i10) {
        UIManagerModule uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class);
        int resolveRootTagFromReactTag = uIManagerModule.resolveRootTagFromReactTag(i10);
        if (resolveRootTagFromReactTag >= 1) {
            synchronized (this.mRoots) {
                for (int i11 = 0; i11 < this.mRoots.size(); i11++) {
                    ViewGroup f10 = this.mRoots.get(i11).f();
                    if ((f10 instanceof x) && ((x) f10).getRootViewTag() == resolveRootTagFromReactTag) {
                        return;
                    }
                }
                synchronized (this.mEnqueuedRootViewInit) {
                    if (this.mEnqueuedRootViewInit.contains(Integer.valueOf(resolveRootTagFromReactTag))) {
                        return;
                    }
                    this.mEnqueuedRootViewInit.add(Integer.valueOf(resolveRootTagFromReactTag));
                    uIManagerModule.addUIBlock(new b(resolveRootTagFromReactTag));
                    return;
                }
            }
        }
        throw new JSApplicationIllegalArgumentException("Could find root view for a given ancestor with tag " + i10);
    }

    @ReactMethod
    public void attachGestureHandler(int i10, int i11) {
        tryInitializeHandlerForReactRootView(i11);
        if (this.mRegistry.b(i10, i11)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i10 + " does not exists");
    }

    @ReactMethod
    public void createGestureHandler(String str, int i10, ReadableMap readableMap) {
        int i11 = 0;
        while (true) {
            d[] dVarArr = this.mHandlerFactories;
            if (i11 < dVarArr.length) {
                d dVar = dVarArr[i11];
                if (dVar.d().equals(str)) {
                    nd.b c10 = dVar.c(getReactApplicationContext());
                    c10.M(i10);
                    c10.K(this.mEventListener);
                    this.mRegistry.h(c10);
                    this.mInteractionManager.e(c10, readableMap);
                    dVar.b(c10, readableMap);
                    return;
                }
                i11++;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
            }
        }
    }

    @ReactMethod
    public void dropGestureHandler(int i10) {
        this.mInteractionManager.g(i10);
        this.mRegistry.e(i10);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map getConstants() {
        return h6.e.e("State", h6.e.i("UNDETERMINED", 0, "BEGAN", 2, "ACTIVE", 4, "CANCELLED", 3, "FAILED", 1, "END", 5), "Direction", h6.e.g("RIGHT", 1, "LEFT", 2, "UP", 4, "DOWN", 8));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public com.swmansion.gesturehandler.react.f getRegistry() {
        return this.mRegistry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    @ReactMethod
    public void handleSetJSResponder(int i10, boolean z10) {
        com.swmansion.gesturehandler.react.g findRootHelperForViewAncestor;
        if (this.mRegistry == null || (findRootHelperForViewAncestor = findRootHelperForViewAncestor(i10)) == null) {
            return;
        }
        findRootHelperForViewAncestor.g(i10, z10);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mRegistry.d();
        this.mInteractionManager.h();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                com.swmansion.gesturehandler.react.g gVar = this.mRoots.get(0);
                ViewGroup f10 = gVar.f();
                if (f10 instanceof com.swmansion.gesturehandler.react.a) {
                    ((com.swmansion.gesturehandler.react.a) f10).x();
                } else {
                    gVar.i();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    public void registerRootHelper(com.swmansion.gesturehandler.react.g gVar) {
        synchronized (this.mRoots) {
            if (!this.mRoots.contains(gVar)) {
                this.mRoots.add(gVar);
            } else {
                throw new IllegalStateException("Root helper" + gVar + " already registered");
            }
        }
    }

    public void unregisterRootHelper(com.swmansion.gesturehandler.react.g gVar) {
        synchronized (this.mRoots) {
            this.mRoots.remove(gVar);
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i10, ReadableMap readableMap) {
        d findFactoryForHandler;
        nd.b f10 = this.mRegistry.f(i10);
        if (f10 == null || (findFactoryForHandler = findFactoryForHandler(f10)) == null) {
            return;
        }
        this.mInteractionManager.g(i10);
        this.mInteractionManager.e(f10, readableMap);
        findFactoryForHandler.b(f10, readableMap);
    }
}
