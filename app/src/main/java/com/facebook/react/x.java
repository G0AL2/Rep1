package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.t0;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ReactRootView.java */
/* loaded from: classes.dex */
public class x extends FrameLayout implements i0, b0 {

    /* renamed from: a  reason: collision with root package name */
    private p f16449a;

    /* renamed from: b  reason: collision with root package name */
    private String f16450b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f16451c;

    /* renamed from: d  reason: collision with root package name */
    private String f16452d;

    /* renamed from: e  reason: collision with root package name */
    private a f16453e;

    /* renamed from: f  reason: collision with root package name */
    private b f16454f;

    /* renamed from: g  reason: collision with root package name */
    private int f16455g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16456h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16457i;

    /* renamed from: j  reason: collision with root package name */
    private com.facebook.react.uimanager.i f16458j;

    /* renamed from: k  reason: collision with root package name */
    private final l f16459k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f16460l;

    /* renamed from: m  reason: collision with root package name */
    private int f16461m;

    /* renamed from: n  reason: collision with root package name */
    private int f16462n;

    /* renamed from: o  reason: collision with root package name */
    private int f16463o;

    /* renamed from: p  reason: collision with root package name */
    private int f16464p;

    /* renamed from: q  reason: collision with root package name */
    private int f16465q;

    /* renamed from: r  reason: collision with root package name */
    private int f16466r;

    /* renamed from: s  reason: collision with root package name */
    private int f16467s;

    /* renamed from: t  reason: collision with root package name */
    private final AtomicInteger f16468t;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactRootView.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f16469a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16470b;

        /* renamed from: c  reason: collision with root package name */
        private int f16471c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f16472d = 0;

        a() {
            com.facebook.react.uimanager.c.f(x.this.getContext().getApplicationContext());
            this.f16469a = new Rect();
            this.f16470b = (int) com.facebook.react.uimanager.r.c(60.0f);
        }

        private void a() {
            f();
        }

        private void b() {
            int rotation = ((WindowManager) x.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f16472d == rotation) {
                return;
            }
            this.f16472d = rotation;
            com.facebook.react.uimanager.c.e(x.this.getContext().getApplicationContext());
            e(rotation);
        }

        private void c() {
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            x.this.getRootView().getWindowVisibleDisplayFrame(this.f16469a);
            int safeInsetTop = (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = x.this.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
            int i10 = com.facebook.react.uimanager.c.d().heightPixels;
            int i11 = this.f16469a.bottom;
            int i12 = (i10 - i11) + safeInsetTop;
            int i13 = this.f16471c;
            boolean z10 = true;
            if (i13 != i12 && i12 > this.f16470b) {
                this.f16471c = i12;
                x.this.q("keyboardDidShow", d(com.facebook.react.uimanager.r.a(i11), com.facebook.react.uimanager.r.a(this.f16469a.left), com.facebook.react.uimanager.r.a(this.f16469a.width()), com.facebook.react.uimanager.r.a(this.f16471c)));
                return;
            }
            if ((i13 == 0 || i12 > this.f16470b) ? false : false) {
                this.f16471c = 0;
                x xVar = x.this;
                xVar.q("keyboardDidHide", d(com.facebook.react.uimanager.r.a(xVar.f16464p), 0.0d, com.facebook.react.uimanager.r.a(this.f16469a.width()), 0.0d));
            }
        }

        private WritableMap d(double d10, double d11, double d12, double d13) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("height", d13);
            createMap2.putDouble("screenX", d11);
            createMap2.putDouble("width", d12);
            createMap2.putDouble("screenY", d10);
            createMap.putMap("endCoordinates", createMap2);
            createMap.putString("easing", "keyboard");
            createMap.putDouble("duration", 0.0d);
            return createMap;
        }

        private void e(int i10) {
            double d10;
            String str;
            double d11;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 == 1) {
                    d11 = -90.0d;
                    str = "landscape-primary";
                } else if (i10 == 2) {
                    d10 = 180.0d;
                    str = "portrait-secondary";
                } else if (i10 != 3) {
                    return;
                } else {
                    d11 = 90.0d;
                    str = "landscape-secondary";
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("name", str);
                createMap.putDouble("rotationDegrees", d11);
                createMap.putBoolean("isLandscape", z10);
                x.this.q("namedOrientationDidChange", createMap);
            }
            d10 = 0.0d;
            str = "portrait-primary";
            d11 = d10;
            z10 = false;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("name", str);
            createMap2.putDouble("rotationDegrees", d11);
            createMap2.putBoolean("isLandscape", z10);
            x.this.q("namedOrientationDidChange", createMap2);
        }

        private void f() {
            DeviceInfoModule deviceInfoModule = (DeviceInfoModule) x.this.f16449a.z().getNativeModule(DeviceInfoModule.class);
            if (deviceInfoModule != null) {
                deviceInfoModule.emitUpdateDimensionsEvent();
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (x.this.f16449a == null || !x.this.f16456h || x.this.f16449a.z() == null) {
                return;
            }
            c();
            b();
            a();
        }
    }

    /* compiled from: ReactRootView.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(x xVar);
    }

    public x(Context context) {
        super(context);
        this.f16455g = 0;
        this.f16459k = new l(this);
        this.f16460l = false;
        this.f16461m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f16462n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f16463o = 0;
        this.f16464p = 0;
        this.f16465q = RecyclerView.UNDEFINED_DURATION;
        this.f16466r = RecyclerView.UNDEFINED_DURATION;
        this.f16467s = 1;
        this.f16468t = new AtomicInteger(0);
        j();
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f16453e == null) {
            this.f16453e = new a();
        }
        return this.f16453e;
    }

    private void h() {
        com.facebook.systrace.a.c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() == -1) {
            try {
                if (this.f16456h) {
                    return;
                }
                this.f16456h = true;
                ((p) f6.a.c(this.f16449a)).o(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                return;
            } finally {
                ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
                com.facebook.systrace.a.g(0L);
            }
        }
        throw new com.facebook.react.uimanager.h("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID.");
    }

    private void i(MotionEvent motionEvent) {
        p pVar = this.f16449a;
        if (pVar != null && this.f16456h && pVar.z() != null) {
            if (this.f16458j == null) {
                z3.a.G("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
                return;
            }
            UIManager g10 = t0.g(this.f16449a.z(), getUIManagerType());
            if (g10 != null) {
                this.f16458j.c(motionEvent, (com.facebook.react.uimanager.events.d) g10.getEventDispatcher());
                return;
            }
            return;
        }
        z3.a.G("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
    }

    private void j() {
        setClipChildren(false);
    }

    private boolean k() {
        p pVar = this.f16449a;
        if (pVar != null && this.f16456h && pVar.z() != null) {
            if (this.f16458j == null) {
                z3.a.G("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
                return false;
            }
            return true;
        }
        z3.a.G("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        return false;
    }

    private boolean l() {
        return getUIManagerType() == 2;
    }

    private boolean m() {
        int i10 = this.f16455g;
        return (i10 == 0 || i10 == -1) ? false : true;
    }

    private void p() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void r() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f16461m = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, RecyclerView.UNDEFINED_DURATION);
        this.f16462n = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, RecyclerView.UNDEFINED_DURATION);
    }

    private void v(boolean z10, int i10, int i11) {
        UIManager g10;
        int i12;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (this.f16449a == null) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            z3.a.G("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean l10 = l();
        if (l10 && !m()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            z3.a.j("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext z11 = this.f16449a.z();
        if (z11 != null && (g10 = t0.g(z11, getUIManagerType())) != null) {
            int i13 = 0;
            if (l10) {
                Point b10 = j0.b(this);
                i13 = b10.x;
                i12 = b10.y;
            } else {
                i12 = 0;
            }
            if (z10 || i13 != this.f16465q || i12 != this.f16466r) {
                g10.updateRootLayoutSpecs(getRootViewTag(), i10, i11, i13, i12);
            }
            this.f16465q = i13;
            this.f16466r = i12;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // com.facebook.react.uimanager.b0
    public void a(int i10) {
        if (i10 != 101) {
            return;
        }
        n();
    }

    @Override // com.facebook.react.uimanager.i0
    public void b(View view, MotionEvent motionEvent) {
        o(motionEvent);
    }

    @Override // com.facebook.react.uimanager.b0
    public void c() {
        com.facebook.systrace.a.c(0L, "ReactRootView.runApplication");
        try {
            p pVar = this.f16449a;
            if (pVar != null && this.f16456h) {
                ReactContext z10 = pVar.z();
                if (z10 == null) {
                    return;
                }
                CatalystInstance catalystInstance = z10.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.f16460l) {
                    v(true, this.f16461m, this.f16462n);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.f16457i = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
            }
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }

    @Override // com.facebook.react.uimanager.i0
    public void d(Throwable th) {
        p pVar = this.f16449a;
        if (pVar != null && pVar.z() != null) {
            this.f16449a.z().handleException(new com.facebook.react.uimanager.h(th.getMessage(), this, th));
            return;
        }
        throw new RuntimeException(th);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e10) {
            d(e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        p pVar = this.f16449a;
        if (pVar != null && this.f16456h && pVar.z() != null) {
            this.f16459k.d(keyEvent);
            return super.dispatchKeyEvent(keyEvent);
        }
        z3.a.G("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        return super.dispatchKeyEvent(keyEvent);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        f6.a.b(!this.f16456h, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    @Override // com.facebook.react.uimanager.b0
    public Bundle getAppProperties() {
        return this.f16451c;
    }

    @Override // com.facebook.react.uimanager.b0
    public int getHeightMeasureSpec() {
        return this.f16462n;
    }

    @Override // com.facebook.react.uimanager.b0
    public String getInitialUITemplate() {
        return this.f16452d;
    }

    @Override // com.facebook.react.uimanager.b0
    public String getJSModuleName() {
        return (String) f6.a.c(this.f16450b);
    }

    public p getReactInstanceManager() {
        return this.f16449a;
    }

    @Override // com.facebook.react.uimanager.b0
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.b0
    public int getRootViewTag() {
        return this.f16455g;
    }

    @Override // com.facebook.react.uimanager.b0
    public AtomicInteger getState() {
        return this.f16468t;
    }

    @Override // com.facebook.react.uimanager.b0
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.b0
    public int getUIManagerType() {
        return this.f16467s;
    }

    @Override // com.facebook.react.uimanager.b0
    public int getWidthMeasureSpec() {
        return this.f16461m;
    }

    public void n() {
        this.f16458j = new com.facebook.react.uimanager.i(this);
        b bVar = this.f16454f;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void o(MotionEvent motionEvent) {
        UIManager g10;
        if (k() && (g10 = t0.g(this.f16449a.z(), getUIManagerType())) != null) {
            this.f16458j.d(motionEvent, (com.facebook.react.uimanager.events.d) g10.getEventDispatcher());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16456h) {
            p();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f16456h) {
            p();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        p pVar = this.f16449a;
        if (pVar != null && this.f16456h && pVar.z() != null) {
            this.f16459k.a();
            super.onFocusChanged(z10, i10, rect);
            return;
        }
        z3.a.G("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f16460l && l()) {
            v(false, this.f16461m, this.f16462n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x00b6, LOOP:1: B:16:0x0030->B:18:0x0036, LOOP_END, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0090, B:32:0x0094, B:39:0x00a9, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x00b6, LOOP:0: B:25:0x0063->B:27:0x0069, LOOP_END, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0090, B:32:0x0094, B:39:0x00a9, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0090, B:32:0x0094, B:39:0x00a9, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0090, B:32:0x0094, B:39:0x00a9, B:34:0x009a, B:36:0x009e, B:38:0x00a2, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r2 = "ReactRootView.onMeasure"
            com.facebook.systrace.a.c(r0, r2)
            com.facebook.react.bridge.ReactMarkerConstants r2 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START
            com.facebook.react.bridge.ReactMarker.logMarker(r2)
            int r2 = r10.f16461m     // Catch: java.lang.Throwable -> Lb6
            r3 = 0
            r4 = 1
            if (r11 != r2) goto L19
            int r2 = r10.f16462n     // Catch: java.lang.Throwable -> Lb6
            if (r12 == r2) goto L17
            goto L19
        L17:
            r2 = 0
            goto L1a
        L19:
            r2 = 1
        L1a:
            r10.f16461m = r11     // Catch: java.lang.Throwable -> Lb6
            r10.f16462n = r12     // Catch: java.lang.Throwable -> Lb6
            int r5 = android.view.View.MeasureSpec.getMode(r11)     // Catch: java.lang.Throwable -> Lb6
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L2e
            if (r5 != 0) goto L29
            goto L2e
        L29:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch: java.lang.Throwable -> Lb6
            goto L54
        L2e:
            r11 = 0
            r5 = 0
        L30:
            int r7 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lb6
            if (r5 >= r7) goto L54
            android.view.View r7 = r10.getChildAt(r5)     // Catch: java.lang.Throwable -> Lb6
            int r8 = r7.getLeft()     // Catch: java.lang.Throwable -> Lb6
            int r9 = r7.getMeasuredWidth()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 + r9
            int r9 = r7.getPaddingLeft()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 + r9
            int r7 = r7.getPaddingRight()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 + r7
            int r11 = java.lang.Math.max(r11, r8)     // Catch: java.lang.Throwable -> Lb6
            int r5 = r5 + 1
            goto L30
        L54:
            int r5 = android.view.View.MeasureSpec.getMode(r12)     // Catch: java.lang.Throwable -> Lb6
            if (r5 == r6) goto L62
            if (r5 != 0) goto L5d
            goto L62
        L5d:
            int r12 = android.view.View.MeasureSpec.getSize(r12)     // Catch: java.lang.Throwable -> Lb6
            goto L87
        L62:
            r12 = 0
        L63:
            int r5 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lb6
            if (r3 >= r5) goto L87
            android.view.View r5 = r10.getChildAt(r3)     // Catch: java.lang.Throwable -> Lb6
            int r6 = r5.getTop()     // Catch: java.lang.Throwable -> Lb6
            int r7 = r5.getMeasuredHeight()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r6 + r7
            int r7 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r6 + r7
            int r5 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> Lb6
            int r6 = r6 + r5
            int r12 = java.lang.Math.max(r12, r6)     // Catch: java.lang.Throwable -> Lb6
            int r3 = r3 + 1
            goto L63
        L87:
            r10.setMeasuredDimension(r11, r12)     // Catch: java.lang.Throwable -> Lb6
            r10.f16460l = r4     // Catch: java.lang.Throwable -> Lb6
            com.facebook.react.p r3 = r10.f16449a     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L98
            boolean r3 = r10.f16456h     // Catch: java.lang.Throwable -> Lb6
            if (r3 != 0) goto L98
            r10.h()     // Catch: java.lang.Throwable -> Lb6
            goto La9
        L98:
            if (r2 != 0) goto La2
            int r2 = r10.f16463o     // Catch: java.lang.Throwable -> Lb6
            if (r2 != r11) goto La2
            int r2 = r10.f16464p     // Catch: java.lang.Throwable -> Lb6
            if (r2 == r12) goto La9
        La2:
            int r2 = r10.f16461m     // Catch: java.lang.Throwable -> Lb6
            int r3 = r10.f16462n     // Catch: java.lang.Throwable -> Lb6
            r10.v(r4, r2, r3)     // Catch: java.lang.Throwable -> Lb6
        La9:
            r10.f16463o = r11     // Catch: java.lang.Throwable -> Lb6
            r10.f16464p = r12     // Catch: java.lang.Throwable -> Lb6
            com.facebook.react.bridge.ReactMarkerConstants r11 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker(r11)
            com.facebook.systrace.a.g(r0)
            return
        Lb6:
            r11 = move-exception
            com.facebook.react.bridge.ReactMarkerConstants r12 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker(r12)
            com.facebook.systrace.a.g(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.x.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        i(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f16457i) {
            this.f16457i = false;
            String str = this.f16450b;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.f16455g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(String str, WritableMap writableMap) {
        p pVar = this.f16449a;
        if (pVar != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) pVar.z().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        p pVar = this.f16449a;
        if (pVar != null && this.f16456h && pVar.z() != null) {
            this.f16459k.e(view2);
            super.requestChildFocus(view, view2);
            return;
        }
        z3.a.G("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void s(p pVar, String str, Bundle bundle) {
        t(pVar, str, bundle, null);
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f16451c = bundle;
        if (m()) {
            c();
        }
    }

    public void setEventListener(b bVar) {
        this.f16454f = bVar;
    }

    public void setIsFabric(boolean z10) {
        this.f16467s = z10 ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.b0
    public void setRootViewTag(int i10) {
        this.f16455g = i10;
    }

    @Override // com.facebook.react.uimanager.b0
    public void setShouldLogContentAppeared(boolean z10) {
        this.f16457i = z10;
    }

    public void t(p pVar, String str, Bundle bundle, String str2) {
        com.facebook.systrace.a.c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            f6.a.b(this.f16449a == null, "This root view has already been attached to a catalyst instance manager");
            this.f16449a = pVar;
            this.f16450b = str;
            this.f16451c = bundle;
            this.f16452d = str2;
            pVar.u();
            if (ReactFeatureFlags.enableEagerRootViewAttachment) {
                if (!this.f16460l) {
                    r();
                }
                h();
            }
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }

    public void u() {
        ReactContext z10;
        UIManager g10;
        UiThreadUtil.assertOnUiThread();
        p pVar = this.f16449a;
        if (pVar != null && (z10 = pVar.z()) != null && l() && (g10 = t0.g(z10, getUIManagerType())) != null) {
            int id2 = getId();
            setId(-1);
            removeAllViews();
            if (id2 == -1) {
                ReactSoftExceptionLogger.logSoftException("ReactRootView", new RuntimeException("unmountReactApplication called on ReactRootView with invalid id"));
            } else {
                g10.stopSurface(id2);
            }
        }
        p pVar2 = this.f16449a;
        if (pVar2 != null && this.f16456h) {
            pVar2.x(this);
            this.f16456h = false;
        }
        this.f16449a = null;
        this.f16457i = false;
    }
}
