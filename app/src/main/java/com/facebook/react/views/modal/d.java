package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.r;
import com.facebook.react.views.view.g;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;

/* compiled from: ReactModalHostView.java */
/* loaded from: classes.dex */
public class d extends ViewGroup implements LifecycleEventListener, d.a {

    /* renamed from: a  reason: collision with root package name */
    private b f16131a;

    /* renamed from: b  reason: collision with root package name */
    private Dialog f16132b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16133c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16134d;

    /* renamed from: e  reason: collision with root package name */
    private String f16135e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16136f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16137g;

    /* renamed from: h  reason: collision with root package name */
    private DialogInterface.OnShowListener f16138h;

    /* renamed from: i  reason: collision with root package name */
    private c f16139i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactModalHostView.java */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnKeyListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1) {
                if (i10 != 4 && i10 != 111) {
                    Activity currentActivity = ((ReactContext) d.this.getContext()).getCurrentActivity();
                    if (currentActivity != null) {
                        return currentActivity.onKeyUp(i10, keyEvent);
                    }
                    return false;
                }
                f6.a.d(d.this.f16139i, "setOnRequestCloseListener must be called by the manager");
                d.this.f16139i.a(dialogInterface);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactModalHostView.java */
    /* loaded from: classes.dex */
    public static class b extends g implements i0, d.a {

        /* renamed from: t  reason: collision with root package name */
        private boolean f16141t;

        /* renamed from: u  reason: collision with root package name */
        private int f16142u;

        /* renamed from: v  reason: collision with root package name */
        private int f16143v;

        /* renamed from: w  reason: collision with root package name */
        private com.facebook.react.uimanager.events.d f16144w;

        /* renamed from: x  reason: collision with root package name */
        private final com.facebook.react.uimanager.d f16145x;

        /* renamed from: y  reason: collision with root package name */
        private final i f16146y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReactModalHostView.java */
        /* loaded from: classes.dex */
        public class a extends GuardedRunnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f16147a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ReactContext reactContext, int i10) {
                super(reactContext);
                this.f16147a = i10;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) b.this.E().getNativeModule(UIManagerModule.class);
                if (uIManagerModule == null) {
                    return;
                }
                uIManagerModule.updateNodeSize(this.f16147a, b.this.f16142u, b.this.f16143v);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ReactModalHostView.java */
        /* renamed from: com.facebook.react.views.modal.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0217b implements d.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ float f16149a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ float f16150b;

            C0217b(b bVar, float f10, float f11) {
                this.f16149a = f10;
                this.f16150b = f11;
            }

            @Override // com.facebook.react.uimanager.d.b
            public WritableMap a() {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", this.f16149a);
                writableNativeMap.putDouble("screenHeight", this.f16150b);
                return writableNativeMap;
            }
        }

        public b(Context context) {
            super(context);
            this.f16141t = false;
            this.f16145x = new com.facebook.react.uimanager.d();
            this.f16146y = new i(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ReactContext E() {
            return (ReactContext) getContext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(com.facebook.react.uimanager.events.d dVar) {
            this.f16144w = dVar;
        }

        private void H() {
            if (getChildCount() > 0) {
                this.f16141t = false;
                int id2 = getChildAt(0).getId();
                if (this.f16145x.b()) {
                    I(this.f16142u, this.f16143v);
                    return;
                }
                ReactContext E = E();
                E.runOnNativeModulesQueueThread(new a(E, id2));
                return;
            }
            this.f16141t = true;
        }

        public void F(MotionEvent motionEvent) {
            this.f16146y.d(motionEvent, this.f16144w);
        }

        public void I(int i10, int i11) {
            float a10 = r.a(i10);
            float a11 = r.a(i11);
            ReadableMap a12 = getFabricViewStateManager().a();
            if (a12 != null) {
                float f10 = a12.hasKey("screenHeight") ? (float) a12.getDouble("screenHeight") : 0.0f;
                if (Math.abs((a12.hasKey("screenWidth") ? (float) a12.getDouble("screenWidth") : 0.0f) - a10) < 0.9f && Math.abs(f10 - a11) < 0.9f) {
                    return;
                }
            }
            this.f16145x.c(new C0217b(this, a10, a11));
        }

        @Override // com.facebook.react.views.view.g, android.view.ViewGroup
        public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i10, layoutParams);
            if (this.f16141t) {
                H();
            }
        }

        @Override // com.facebook.react.uimanager.i0
        public void b(View view, MotionEvent motionEvent) {
            this.f16146y.d(motionEvent, this.f16144w);
        }

        @Override // com.facebook.react.uimanager.i0
        public void d(Throwable th) {
            E().handleException(new RuntimeException(th));
        }

        @Override // com.facebook.react.uimanager.d.a
        public com.facebook.react.uimanager.d getFabricViewStateManager() {
            return this.f16145x;
        }

        @Override // com.facebook.react.views.view.g, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f16146y.c(motionEvent, this.f16144w);
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.views.view.g, android.view.View
        public void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            this.f16142u = i10;
            this.f16143v = i11;
            H();
        }

        @Override // com.facebook.react.views.view.g, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.f16146y.c(motionEvent, this.f16144w);
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z10) {
        }
    }

    /* compiled from: ReactModalHostView.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(DialogInterface dialogInterface);
    }

    public d(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.f16131a = new b(context);
    }

    private void b() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f16132b;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) d7.a.a(this.f16132b.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.f16132b.dismiss();
            }
            this.f16132b = null;
            ((ViewGroup) this.f16131a.getParent()).removeViewAt(0);
        }
    }

    private void e() {
        f6.a.d(this.f16132b, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        Window window = this.f16132b.getWindow();
        if (currentActivity == null || currentActivity.isFinishing() || !window.isActive()) {
            return;
        }
        if ((currentActivity.getWindow().getAttributes().flags & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0) {
            window.addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        } else {
            window.clearFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        }
        if (this.f16133c) {
            window.clearFlags(2);
            return;
        }
        window.setDimAmount(0.5f);
        window.setFlags(2, 2);
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f16131a);
        if (this.f16134d) {
            frameLayout.setSystemUiVisibility(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f16131a.addView(view, i10);
    }

    public void c() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f16132b;
        if (dialog != null) {
            Context context = (Context) d7.a.a(dialog.getContext(), Activity.class);
            z3.a.j("ReactModalHost", "Updating existing dialog with context: " + context + "@" + context.hashCode());
            if (this.f16137g) {
                b();
            } else {
                e();
                return;
            }
        }
        this.f16137g = false;
        int i10 = com.facebook.react.i.f15433b;
        if (this.f16135e.equals("fade")) {
            i10 = com.facebook.react.i.f15434c;
        } else if (this.f16135e.equals("slide")) {
            i10 = com.facebook.react.i.f15435d;
        }
        Activity currentActivity = getCurrentActivity();
        Context context2 = currentActivity == null ? getContext() : currentActivity;
        Dialog dialog2 = new Dialog(context2, i10);
        this.f16132b = dialog2;
        dialog2.getWindow().setFlags(8, 8);
        z3.a.j("ReactModalHost", "Creating new dialog from context: " + context2 + "@" + context2.hashCode());
        this.f16132b.setContentView(getContentView());
        e();
        this.f16132b.setOnShowListener(this.f16138h);
        this.f16132b.setOnKeyListener(new a());
        this.f16132b.getWindow().setSoftInputMode(16);
        if (this.f16136f) {
            this.f16132b.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        this.f16132b.show();
        if (context2 instanceof Activity) {
            this.f16132b.getWindow().getDecorView().setSystemUiVisibility(((Activity) context2).getWindow().getDecorView().getSystemUiVisibility());
        }
        this.f16132b.getWindow().clearFlags(8);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.f16131a.dispatchProvideStructure(viewStructure);
    }

    public void f(int i10, int i11) {
        this.f16131a.I(i10, i11);
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i10) {
        return this.f16131a.getChildAt(i10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f16131a.getChildCount();
    }

    public Dialog getDialog() {
        return this.f16132b;
    }

    @Override // com.facebook.react.uimanager.d.a
    public com.facebook.react.uimanager.d getFabricViewStateManager() {
        return this.f16131a.getFabricViewStateManager();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.f16131a.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f16131a.removeView(getChildAt(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.f16135e = str;
        this.f16137g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEventDispatcher(com.facebook.react.uimanager.events.d dVar) {
        this.f16131a.G(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z10) {
        this.f16136f = z10;
        this.f16137g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnRequestCloseListener(c cVar) {
        this.f16139i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f16138h = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setStatusBarTranslucent(boolean z10) {
        this.f16134d = z10;
        this.f16137g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransparent(boolean z10) {
        this.f16133c = z10;
    }
}
