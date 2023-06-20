package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.r;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import h6.e;
import java.util.Map;

@o6.a(name = StatusBarModule.NAME)
/* loaded from: classes.dex */
public class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    /* loaded from: classes.dex */
    class a extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f15613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f15614b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15615c;

        /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0215a implements ValueAnimator.AnimatorUpdateListener {
            C0215a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.f15613a.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z10, int i10) {
            super(reactContext);
            this.f15613a = activity;
            this.f15614b = z10;
            this.f15615c = i10;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            this.f15613a.getWindow().addFlags(RecyclerView.UNDEFINED_DURATION);
            if (this.f15614b) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f15613a.getWindow().getStatusBarColor()), Integer.valueOf(this.f15615c));
                ofObject.addUpdateListener(new C0215a());
                ofObject.setDuration(300L).setStartDelay(0L);
                ofObject.start();
                return;
            }
            this.f15613a.getWindow().setStatusBarColor(this.f15615c);
        }
    }

    /* loaded from: classes.dex */
    class b extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f15617a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f15618b;

        /* loaded from: classes.dex */
        class a implements View.OnApplyWindowInsetsListener {
            a(b bVar) {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z10) {
            super(reactContext);
            this.f15617a = activity;
            this.f15618b = z10;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.f15617a.getWindow().getDecorView();
            if (this.f15618b) {
                decorView.setOnApplyWindowInsetsListener(new a(this));
            } else {
                decorView.setOnApplyWindowInsetsListener(null);
            }
            z.n0(decorView);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f15619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f15620b;

        c(StatusBarModule statusBarModule, boolean z10, Activity activity) {
            this.f15619a = z10;
            this.f15620b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15619a) {
                this.f15620b.getWindow().addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
                this.f15620b.getWindow().clearFlags(2048);
                return;
            }
            this.f15620b.getWindow().addFlags(2048);
            this.f15620b.getWindow().clearFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f15621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f15622b;

        d(StatusBarModule statusBarModule, Activity activity, String str) {
            this.f15621a = activity;
            this.f15622b = str;
        }

        @Override // java.lang.Runnable
        @TargetApi(23)
        public void run() {
            View decorView = this.f15621a.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility("dark-content".equals(this.f15622b) ? systemUiVisibility | Constants.BUFFER_SIZE : systemUiVisibility & (-8193));
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        return e.e(HEIGHT_KEY, Float.valueOf(identifier > 0 ? r.a(reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f), DEFAULT_BACKGROUND_COLOR_KEY, currentActivity != null ? String.format("#%06X", Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)) : "black");
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double d10, boolean z10) {
        int i10 = (int) d10;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            z3.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new a(this, getReactApplicationContext(), currentActivity, z10, i10));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(boolean z10) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            z3.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new c(this, z10, currentActivity));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            z3.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new d(this, currentActivity, str));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean z10) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            z3.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(this, getReactApplicationContext(), currentActivity, z10));
        }
    }
}
