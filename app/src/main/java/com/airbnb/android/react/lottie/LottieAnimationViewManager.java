package com.airbnb.android.react.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.z;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.p0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.n0;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class LottieAnimationViewManager extends SimpleViewManager<LottieAnimationView> {
    private static final int COMMAND_PAUSE = 3;
    private static final int COMMAND_PLAY = 1;
    private static final int COMMAND_RESET = 2;
    private static final int COMMAND_RESUME = 4;
    private static final String REACT_CLASS = "LottieAnimationView";
    private static final String TAG = "LottieAnimationViewManager";
    private static final int VERSION = 1;
    private Map<LottieAnimationView, com.airbnb.android.react.lottie.a> propManagersMap = new WeakHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f5667a;

        a(LottieAnimationView lottieAnimationView) {
            this.f5667a = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.f5667a, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.f5667a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f5669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f5670b;

        /* loaded from: classes.dex */
        class a implements View.OnAttachStateChangeListener {
            a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
                lottieAnimationView.setProgress(0.0f);
                lottieAnimationView.w();
                lottieAnimationView.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                b.this.f5670b.removeOnAttachStateChangeListener(this);
            }
        }

        b(LottieAnimationViewManager lottieAnimationViewManager, ReadableArray readableArray, LottieAnimationView lottieAnimationView) {
            this.f5669a = readableArray;
            this.f5670b = lottieAnimationView;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = this.f5669a.getInt(0);
            int i11 = this.f5669a.getInt(1);
            if (i10 != -1 && i11 != -1) {
                if (i10 > i11) {
                    this.f5670b.C(i11, i10);
                    if (this.f5670b.getSpeed() > 0.0f) {
                        this.f5670b.y();
                    }
                } else {
                    this.f5670b.C(i10, i11);
                    if (this.f5670b.getSpeed() < 0.0f) {
                        this.f5670b.y();
                    }
                }
            }
            if (z.T(this.f5670b)) {
                this.f5670b.setProgress(0.0f);
                this.f5670b.w();
                return;
            }
            this.f5670b.addOnAttachStateChangeListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f5672a;

        c(LottieAnimationViewManager lottieAnimationViewManager, LottieAnimationView lottieAnimationView) {
            this.f5672a = lottieAnimationView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z.T(this.f5672a)) {
                this.f5672a.k();
                this.f5672a.setProgress(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f5673a;

        d(LottieAnimationViewManager lottieAnimationViewManager, LottieAnimationView lottieAnimationView) {
            this.f5673a = lottieAnimationView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z.T(this.f5673a)) {
                this.f5673a.v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f5674a;

        e(LottieAnimationViewManager lottieAnimationViewManager, LottieAnimationView lottieAnimationView) {
            this.f5674a = lottieAnimationView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z.T(this.f5674a)) {
                this.f5674a.x();
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LottieAnimationView f5676b;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f5678a;

            a(String str) {
                this.f5678a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                LottieAnimationViewManager.this.getOrCreatePropertyManager(fVar.f5676b).b(this.f5678a);
                f fVar2 = f.this;
                LottieAnimationViewManager.this.getOrCreatePropertyManager(fVar2.f5676b).a();
            }
        }

        f(String str, LottieAnimationView lottieAnimationView) {
            this.f5675a = str;
            this.f5676b = lottieAnimationView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(this.f5675a).openStream()));
                String str = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        str = str + readLine;
                    } else {
                        bufferedReader.close();
                        new Handler(Looper.getMainLooper()).post(new a(str));
                        return;
                    }
                }
            } catch (Exception e10) {
                System.out.println("Error loading animation from URL: " + e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.airbnb.android.react.lottie.a getOrCreatePropertyManager(LottieAnimationView lottieAnimationView) {
        com.airbnb.android.react.lottie.a aVar = this.propManagersMap.get(lottieAnimationView);
        if (aVar == null) {
            com.airbnb.android.react.lottie.a aVar2 = new com.airbnb.android.react.lottie.a(lottieAnimationView);
            this.propManagersMap.put(lottieAnimationView, aVar2);
            return aVar2;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOnAnimationFinishEvent(LottieAnimationView lottieAnimationView, boolean z10) {
        ReactContext reactContext;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isCancelled", z10);
        Context context = lottieAnimationView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                reactContext = null;
                break;
            } else if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (reactContext != null) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(lottieAnimationView.getId(), "animationFinish", createMap);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return h6.e.g("play", 1, "reset", 2, "pause", 3, "resume", 4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return h6.e.a().b("animationFinish", h6.e.d("phasedRegistrationNames", h6.e.d("bubbled", "onAnimationFinish"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return h6.e.a().b("VERSION", 1).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.a(name = "cacheComposition")
    public void setCacheComposition(LottieAnimationView lottieAnimationView, boolean z10) {
        lottieAnimationView.setCacheComposition(z10);
    }

    @w6.a(name = "colorFilters")
    public void setColorFilters(LottieAnimationView lottieAnimationView, ReadableArray readableArray) {
        getOrCreatePropertyManager(lottieAnimationView).d(readableArray);
    }

    @w6.a(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(LottieAnimationView lottieAnimationView, boolean z10) {
        getOrCreatePropertyManager(lottieAnimationView).e(z10);
    }

    @w6.a(name = "imageAssetsFolder")
    public void setImageAssetsFolder(LottieAnimationView lottieAnimationView, String str) {
        getOrCreatePropertyManager(lottieAnimationView).f(str);
    }

    @w6.a(name = "loop")
    public void setLoop(LottieAnimationView lottieAnimationView, boolean z10) {
        getOrCreatePropertyManager(lottieAnimationView).g(z10);
    }

    @w6.a(name = DownloadWorker.KEY_OUT_PROGRESS)
    public void setProgress(LottieAnimationView lottieAnimationView, float f10) {
        getOrCreatePropertyManager(lottieAnimationView).h(Float.valueOf(f10));
    }

    @w6.a(name = "renderMode")
    public void setRenderMode(LottieAnimationView lottieAnimationView, String str) {
        p0 p0Var;
        if ("AUTOMATIC".equals(str)) {
            p0Var = p0.AUTOMATIC;
        } else if ("HARDWARE".equals(str)) {
            p0Var = p0.HARDWARE;
        } else {
            p0Var = "SOFTWARE".equals(str) ? p0.SOFTWARE : null;
        }
        getOrCreatePropertyManager(lottieAnimationView).i(p0Var);
    }

    @w6.a(name = "resizeMode")
    public void setResizeMode(LottieAnimationView lottieAnimationView, String str) {
        ImageView.ScaleType scaleType;
        if ("cover".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if ("contain".equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        } else {
            scaleType = "center".equals(str) ? ImageView.ScaleType.CENTER : null;
        }
        getOrCreatePropertyManager(lottieAnimationView).j(scaleType);
    }

    @w6.a(name = "sourceJson")
    public void setSourceJson(LottieAnimationView lottieAnimationView, String str) {
        getOrCreatePropertyManager(lottieAnimationView).b(str);
    }

    @w6.a(name = "sourceName")
    public void setSourceName(LottieAnimationView lottieAnimationView, String str) {
        if (!str.contains(".")) {
            str = str + ".json";
        }
        getOrCreatePropertyManager(lottieAnimationView).c(str);
    }

    @w6.a(name = "sourceURL")
    public void setSourceURL(LottieAnimationView lottieAnimationView, String str) {
        new Thread(new f(str, lottieAnimationView)).start();
    }

    @w6.a(name = DownloadWorker.KEY_OUT_SPEED)
    public void setSpeed(LottieAnimationView lottieAnimationView, double d10) {
        getOrCreatePropertyManager(lottieAnimationView).k((float) d10);
    }

    @w6.a(name = "textFiltersAndroid")
    public void setTextFilters(LottieAnimationView lottieAnimationView, ReadableArray readableArray) {
        getOrCreatePropertyManager(lottieAnimationView).l(readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LottieAnimationView createViewInstance(n0 n0Var) {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(n0Var);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        lottieAnimationView.i(new a(lottieAnimationView));
        return lottieAnimationView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(LottieAnimationView lottieAnimationView) {
        super.onAfterUpdateTransaction((LottieAnimationViewManager) lottieAnimationView);
        getOrCreatePropertyManager(lottieAnimationView).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(LottieAnimationView lottieAnimationView, int i10, ReadableArray readableArray) {
        if (i10 == 1) {
            new Handler(Looper.getMainLooper()).post(new b(this, readableArray, lottieAnimationView));
        } else if (i10 == 2) {
            new Handler(Looper.getMainLooper()).post(new c(this, lottieAnimationView));
        } else if (i10 == 3) {
            new Handler(Looper.getMainLooper()).post(new d(this, lottieAnimationView));
        } else if (i10 != 4) {
        } else {
            new Handler(Looper.getMainLooper()).post(new e(this, lottieAnimationView));
        }
    }
}
