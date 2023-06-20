package com.inmobi.media;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.chartboost.sdk.CBLocation;
import com.google.android.gms.common.internal.ImagesContract;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.cy;
import com.inmobi.media.db;
import com.inmobi.media.gr;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JavaScriptBridge.java */
/* loaded from: classes3.dex */
public class cq {

    /* renamed from: a */
    private static final String f24961a = "cq";

    /* renamed from: b */
    private final q f24962b;

    /* renamed from: c */
    private final int f24963c;

    /* renamed from: d */
    private dd f24964d;

    /* compiled from: JavaScriptBridge.java */
    @TargetApi(16)
    /* loaded from: classes3.dex */
    static class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private int f24995a;

        /* renamed from: b */
        private int f24996b;

        /* renamed from: c */
        private View f24997c;

        /* renamed from: d */
        private final Boolean f24998d = Boolean.FALSE;

        a(View view) {
            this.f24997c = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            try {
                this.f24995a = ic.b(this.f24997c.getWidth());
                this.f24996b = ic.b(this.f24997c.getHeight());
                if (Build.VERSION.SDK_INT >= 16) {
                    this.f24997c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    this.f24997c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                synchronized (this.f24998d) {
                    this.f24998d.notify();
                }
            } catch (Exception unused) {
                String unused2 = cq.f24961a;
            }
        }
    }

    public cq(q qVar, int i10) {
        this.f24962b = qVar;
        this.f24963c = i10;
    }

    public /* synthetic */ void b() {
        if (this.f24962b.getEmbeddedBrowserJSCallbacks() == null) {
            return;
        }
        this.f24962b.getEmbeddedBrowserJSCallbacks().a();
    }

    public static /* synthetic */ void b(cq cqVar) {
        cqVar.b();
    }

    public static /* synthetic */ void c(cq cqVar, String str) {
        cqVar.a(str);
    }

    public static /* synthetic */ void d(cq cqVar, String str, int i10, String str2, float f10, boolean z10) {
        cqVar.a(str, i10, str2, f10, z10);
    }

    @JavascriptInterface
    public void asyncPing(String str, String str2) {
        if (!URLUtil.isValidUrl(str2)) {
            this.f24962b.b(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            final gx gxVar = new gx("GET", str2);
            gxVar.f25625t = false;
            gxVar.f25620o = false;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final gr grVar = new gr(gxVar, new gr.a() { // from class: com.inmobi.media.cq.3
                {
                    cq.this = this;
                }

                @Override // com.inmobi.media.gr.a
                public final void a(gy gyVar) {
                    String unused = cq.f24961a;
                    try {
                        iv.a().a(gxVar.g());
                        iv.a().b(gyVar.d());
                        iv.a().c(SystemClock.elapsedRealtime() - elapsedRealtime);
                    } catch (Exception unused2) {
                        String unused3 = cq.f24961a;
                    }
                }

                @Override // com.inmobi.media.gr.a
                public final void a() {
                    String unused = cq.f24961a;
                }
            });
            new Thread(new Runnable() { // from class: com.inmobi.media.gr.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        gy a10 = new gv(grVar.f25589b).a();
                        if (a10.a()) {
                            grVar.f25590c.a();
                        } else {
                            grVar.f25590c.a(a10);
                        }
                    } catch (Exception unused) {
                        String unused2 = gr.f25588a;
                        new gy().f25627a = new gw(-1, "Network request failed with unknown error");
                        grVar.f25590c.a();
                    }
                }
            }).start();
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "asyncPing");
        }
    }

    @JavascriptInterface
    public void cancelSaveContent(String str, String str2) {
    }

    @JavascriptInterface
    public void close(final String str) {
        new Handler(this.f24962b.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.2
            {
                cq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    cq.this.f24962b.getReferenceContainer().b();
                } catch (Exception unused) {
                    cq.this.f24962b.b(str, "Unexpected error", "close");
                    hu.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
                    String unused2 = cq.f24961a;
                }
            }
        });
    }

    @JavascriptInterface
    public void closeAll(String str) {
        q qVar = this.f24962b;
        k kVar = qVar.f25972v;
        if (kVar != null) {
            kVar.b();
        }
        if (qVar.f25952b.get() != null) {
            qVar.f25952b.get().finish();
        }
    }

    @JavascriptInterface
    public void closeCustomExpand(String str) {
        if (this.f24963c == 1 && this.f24962b != null) {
            ji.a().a(new Runnable() { // from class: com.inmobi.media.a0
                @Override // java.lang.Runnable
                public final void run() {
                    cq.b(cq.this);
                }
            });
        }
    }

    @JavascriptInterface
    public void customExpand(final String str, final String str2, final int i10, final float f10, boolean z10, final boolean z11) {
        q qVar;
        if (this.f24963c == 1 && (qVar = this.f24962b) != null) {
            if (str2 == null) {
                qVar.b(str, "Invalid expandInput", "customExpand");
            } else if (i10 < 0 || i10 >= v.values().length) {
                this.f24962b.b(str, "Invalid inputType", "customExpand");
            } else if (f10 >= 0.0f && f10 <= 1.0f) {
                ji.a().a(new Runnable() { // from class: com.inmobi.media.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        cq.d(cq.this, str2, i10, str, f10, z11);
                    }
                });
            } else {
                this.f24962b.b(str, "Invalid screenPercentage", "customExpand");
            }
        }
    }

    @JavascriptInterface
    public void disableBackButton(String str, boolean z10) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        qVar.setDisableBackButton(z10);
    }

    @JavascriptInterface
    public void disableCloseRegion(final String str, final boolean z10) {
        if (this.f24962b == null) {
            return;
        }
        new Handler(this.f24962b.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.4
            {
                cq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    cq.this.f24962b.b(z10);
                } catch (Exception unused) {
                    cq.this.f24962b.b(str, "Unexpected error", "disableCloseRegion");
                    String unused2 = cq.f24961a;
                }
            }
        });
    }

    @JavascriptInterface
    public void expand(final String str, final String str2) {
        q qVar;
        if (this.f24963c == 1 || (qVar = this.f24962b) == null) {
            return;
        }
        if (!qVar.i()) {
            this.f24962b.c("expand");
            return;
        }
        q qVar2 = this.f24962b;
        if (qVar2.f25963m) {
            if (str2 != null && str2.length() != 0 && !str2.startsWith("http")) {
                this.f24962b.b(str, "Invalid URL", "expand");
                return;
            }
            if (URLUtil.isValidUrl(str2)) {
                this.f24962b.l();
            }
            new Handler(this.f24962b.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.9
                {
                    cq.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int a10;
                    try {
                        q qVar3 = cq.this.f24962b;
                        String str3 = str2;
                        if (CBLocation.LOCATION_DEFAULT.equals(qVar3.f25954d) || "Resized".equals(qVar3.f25954d)) {
                            qVar3.f25968r = true;
                            cz czVar = qVar3.f25956f;
                            if (czVar.f25060c == null) {
                                ViewGroup viewGroup = (ViewGroup) czVar.f25058a.getParent();
                                czVar.f25060c = viewGroup;
                                czVar.f25061d = viewGroup.indexOfChild(czVar.f25058a);
                            }
                            cx expandProperties = czVar.f25058a.getExpandProperties();
                            boolean isValidUrl = URLUtil.isValidUrl(str3);
                            czVar.f25059b = isValidUrl;
                            q qVar4 = czVar.f25058a;
                            if (isValidUrl) {
                                try {
                                    q qVar5 = new q(czVar.f25058a.getContainerContext(), (byte) 0, null, czVar.f25058a.getImpressionId(), Boolean.FALSE, "DEFAULT");
                                    qVar5.a(czVar.f25058a.getListener(), czVar.f25058a.getAdConfig(), false, false);
                                    qVar5.setOriginalRenderView(czVar.f25058a);
                                    qVar5.loadUrl(str3);
                                    qVar5.setPlacementId(czVar.f25058a.getPlacementId());
                                    qVar5.setAllowAutoRedirection(czVar.f25058a.getAllowAutoRedirection());
                                    qVar5.setCreativeId(czVar.f25058a.getCreativeId());
                                    a10 = InMobiAdActivity.a((j) qVar5);
                                    if (expandProperties != null) {
                                        qVar5.setUseCustomClose(czVar.f25058a.f25962l);
                                    }
                                } catch (Exception e10) {
                                    gg.a().a(new hg(e10));
                                    czVar.f25058a.getListener().g(czVar.f25058a);
                                }
                            } else {
                                qVar4.setShouldFireRenderBeacon(false);
                                ViewGroup viewGroup2 = czVar.f25060c;
                                FrameLayout frameLayout = new FrameLayout(czVar.f25058a.getContainerContext());
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(czVar.f25058a.getWidth(), czVar.f25058a.getHeight());
                                frameLayout.setId(i.f25718a);
                                viewGroup2.addView(frameLayout, czVar.f25061d, layoutParams);
                                viewGroup2.removeView(czVar.f25058a);
                                a10 = InMobiAdActivity.a((j) czVar.f25058a);
                            }
                            czVar.f25058a.getListener().d_();
                            Intent intent = new Intent(czVar.f25058a.getContainerContext(), InMobiAdActivity.class);
                            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a10);
                            if (czVar.f25062e.equals("htmlUrl")) {
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 202);
                            } else {
                                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 200);
                            }
                            ho.a(czVar.f25058a.getContainerContext(), intent);
                            qVar3.requestLayout();
                            qVar3.invalidate();
                            qVar3.setFocusable(true);
                            qVar3.setFocusableInTouchMode(true);
                            qVar3.requestFocus();
                        }
                    } catch (Exception unused) {
                        cq.this.f24962b.b(str, "Unexpected error", "expand");
                        hu.a((byte) 1, "InMobi", "Failed to expand ad; SDK encountered an unexpected error");
                        String unused2 = cq.f24961a;
                    }
                }
            });
            return;
        }
        qVar2.b(str, "Creative is not visible. Ignoring request.", "expand");
    }

    @JavascriptInterface
    public void fireAdFailed(String str) {
        try {
            this.f24962b.getListener().d(this.f24962b);
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "fireAdFailed");
        }
    }

    @JavascriptInterface
    public void fireAdReady(String str) {
        try {
            q qVar = this.f24962b;
            qVar.f25973w = true;
            if (qVar.getImpressionType() == 0) {
                qVar.h();
            }
            qVar.getListener().c(qVar);
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "fireAdReady");
        }
    }

    @JavascriptInterface
    public void fireComplete(String str) {
    }

    @JavascriptInterface
    public void fireSkip(String str) {
    }

    @JavascriptInterface
    public String getAdContext(String str) {
        k adPodHandler = this.f24962b.getAdPodHandler();
        if (adPodHandler != null) {
            return adPodHandler.e();
        }
        return null;
    }

    @JavascriptInterface
    public void getBlob(String str, String str2) {
        ai aiVar;
        q qVar = this.f24962b;
        if (qVar == null || (aiVar = qVar.f25970t) == null) {
            return;
        }
        aiVar.a(str, str2, qVar, qVar.f25969s);
    }

    @JavascriptInterface
    public String getCurrentPosition(String str) {
        q qVar;
        q qVar2 = this.f24962b;
        if (qVar2 == null) {
            return "";
        }
        synchronized (qVar2.getCurrentPositionMonitor()) {
            this.f24962b.f25961k = true;
            new Handler(this.f24962b.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.8
                {
                    cq.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        cq.this.f24962b.e();
                    } catch (Exception unused) {
                        String unused2 = cq.f24961a;
                    }
                }
            });
            while (true) {
                qVar = this.f24962b;
                if (qVar.f25961k) {
                    try {
                        qVar.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return qVar.getCurrentPosition();
    }

    @JavascriptInterface
    public int getCurrentRenderingIndex(String str) {
        return this.f24962b.getCurrentRenderingPodAdIndex();
    }

    @JavascriptInterface
    public String getDefaultPosition(String str) {
        q qVar;
        q qVar2 = this.f24962b;
        if (qVar2 == null) {
            return new JSONObject().toString();
        }
        synchronized (qVar2.getDefaultPositionMonitor()) {
            this.f24962b.f25960j = true;
            new Handler(this.f24962b.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.7
                {
                    cq.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        cq.this.f24962b.d();
                    } catch (Exception unused) {
                        String unused2 = cq.f24961a;
                    }
                }
            });
            while (true) {
                qVar = this.f24962b;
                if (qVar.f25960j) {
                    try {
                        qVar.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        return qVar.getDefaultPosition();
    }

    @JavascriptInterface
    public int getDeviceVolume(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return -1;
        }
        try {
            db mediaProcessor = qVar.getMediaProcessor();
            Context c10 = ho.c();
            if (c10 == null) {
                return -1;
            }
            if (mediaProcessor.f25072a.getRenderingConfig().enablePubMuteControl && ho.e()) {
                return 0;
            }
            AudioManager audioManager = (AudioManager) c10.getSystemService("audio");
            if (audioManager == null) {
                return -1;
            }
            return audioManager.getStreamVolume(3);
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "getDeviceVolume");
            return -1;
        }
    }

    @JavascriptInterface
    public String getExpandProperties(String str) {
        q qVar = this.f24962b;
        return qVar == null ? "" : qVar.getExpandProperties().f25040c;
    }

    @JavascriptInterface
    public String getMaxSize(String str) {
        int i10;
        int i11;
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f24962b.getFullScreenActivity();
            if (fullScreenActivity == null) {
                if (!(this.f24962b.getContainerContext() instanceof Activity)) {
                    return getScreenSize(str);
                }
                fullScreenActivity = (Activity) this.f24962b.getContainerContext();
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(16908290);
            int b10 = ic.b(frameLayout.getWidth());
            int b11 = ic.b(frameLayout.getHeight());
            if (this.f24962b.getFullScreenActivity() != null && (b10 == 0 || b11 == 0)) {
                a aVar = new a(frameLayout);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                synchronized (aVar.f24998d) {
                    try {
                        aVar.f24998d.wait();
                    } catch (InterruptedException unused) {
                    }
                    i10 = aVar.f24995a;
                    i11 = aVar.f24996b;
                }
                b11 = i11;
                b10 = i10;
            }
            try {
                jSONObject.put("width", b10);
                jSONObject.put("height", b11);
            } catch (JSONException unused2) {
                return jSONObject.toString();
            }
        } catch (Exception unused3) {
            this.f24962b.b(str, "Unexpected error", "getMaxSize");
        }
    }

    @JavascriptInterface
    public String getOrientation(String str) {
        byte b10 = ic.b();
        return b10 == 1 ? "0" : b10 == 3 ? "90" : b10 == 2 ? "180" : b10 == 4 ? "270" : "-1";
    }

    @JavascriptInterface
    public String getOrientationProperties(String str) {
        return this.f24964d.f25096d;
    }

    @JavascriptInterface
    public String getPlacementType(String str) {
        return 1 == this.f24963c ? "interstitial" : "inline";
    }

    @JavascriptInterface
    public String getPlatform(String str) {
        hp.d();
        return hp.d();
    }

    @JavascriptInterface
    public String getPlatformVersion(String str) {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    @JavascriptInterface
    public String getRenderableAdIndexes(String str) {
        return this.f24962b.getRenderableAdIndexes().toString();
    }

    @JavascriptInterface
    public String getResizeProperties(String str) {
        de resizeProperties;
        JSONObject a10;
        q qVar = this.f24962b;
        return (qVar == null || (resizeProperties = qVar.getResizeProperties()) == null || (a10 = new ij().a((ij) resizeProperties)) == null) ? "" : a10.toString();
    }

    @JavascriptInterface
    public String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", ic.a().f25745a);
            jSONObject.put("height", ic.a().f25746b);
        } catch (JSONException unused) {
        } catch (Exception unused2) {
            this.f24962b.b(str, "Unexpected error", "getScreenSize");
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String getSdkVersion(String str) {
        hp.b();
        return hp.b();
    }

    @JavascriptInterface
    public long getShowTimeStamp(String str) {
        return this.f24962b.getShowTimeStamp();
    }

    @JavascriptInterface
    public String getState(String str) {
        return this.f24962b.getState().toLowerCase(Locale.ENGLISH);
    }

    @JavascriptInterface
    public String getVersion(String str) {
        hp.c();
        return hp.c();
    }

    @JavascriptInterface
    public void incentCompleted(String str, String str2) {
        if (str2 == null) {
            try {
                this.f24962b.getListener().b(new HashMap<>());
                return;
            } catch (Exception unused) {
                this.f24962b.b(str, "Unexpected error", "incentCompleted");
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap<Object, Object> hashMap = new HashMap<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            try {
                try {
                    this.f24962b.getListener().b(hashMap);
                } catch (Exception unused2) {
                    this.f24962b.b(str, "Unexpected error", "incentCompleted");
                }
            } catch (Exception unused3) {
                this.f24962b.b(str, "Unexpected error", "incentCompleted");
            }
        } catch (JSONException unused4) {
            this.f24962b.getListener().b(new HashMap<>());
        }
    }

    @JavascriptInterface
    public boolean isBackButtonDisabled(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return false;
        }
        return qVar.f25965o;
    }

    @JavascriptInterface
    public String isDeviceMuted(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return "false";
        }
        boolean z10 = false;
        try {
            qVar.getMediaProcessor();
            z10 = db.a();
        } catch (Exception unused) {
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    public String isHeadphonePlugged(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return "false";
        }
        boolean z10 = false;
        try {
            qVar.getMediaProcessor();
            z10 = db.d();
        } catch (Exception unused) {
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    public boolean isViewable(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return false;
        }
        return qVar.f25963m;
    }

    @JavascriptInterface
    public void loadAd(String str, int i10) {
        k kVar;
        q qVar = this.f24962b;
        if (qVar.f25963m && (kVar = qVar.f25972v) != null) {
            kVar.a(i10, qVar);
        } else {
            qVar.a(false);
        }
    }

    @JavascriptInterface
    public void log(String str, String str2) {
    }

    @JavascriptInterface
    public void onOrientationChange(String str) {
    }

    @JavascriptInterface
    public void onUserInteraction(String str, String str2) {
        q qVar = this.f24962b;
        if (qVar != null && !qVar.i()) {
            this.f24962b.c("onUserInteraction");
        } else if (str2 == null) {
            try {
                this.f24962b.getListener().a(new HashMap<>());
            } catch (Exception unused) {
                this.f24962b.b(str, "Unexpected error", "onUserInteraction");
            }
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap<Object, Object> hashMap = new HashMap<>();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.get(next));
                }
                try {
                    try {
                        this.f24962b.getListener().a(hashMap);
                    } catch (Exception unused2) {
                        this.f24962b.b(str, "Unexpected error", "onUserInteraction");
                    }
                } catch (Exception unused3) {
                    this.f24962b.b(str, "Unexpected error", "onUserInteraction");
                }
            } catch (JSONException unused4) {
                this.f24962b.getListener().a(new HashMap<>());
            }
        }
    }

    @JavascriptInterface
    public void open(final String str, final String str2) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        if (!qVar.i()) {
            this.f24962b.c("open");
            return;
        }
        this.f24962b.l();
        ji.a().a(new Runnable() { // from class: com.inmobi.media.cq.1
            {
                cq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cq.this.f24962b.getLandingPageHandler().a("open", str, str2);
            }
        });
    }

    @JavascriptInterface
    public void openEmbedded(final String str, final String str2) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        if (!qVar.i()) {
            this.f24962b.c("openEmbedded");
            return;
        }
        this.f24962b.l();
        new Handler(this.f24962b.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.6
            {
                cq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    cq.this.f24962b.getLandingPageHandler().d("openEmbedded", str, str2);
                } catch (Exception unused) {
                    cq.this.f24962b.b(str, "Unexpected error", "openEmbedded");
                    hu.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
                    String unused2 = cq.f24961a;
                }
            }
        });
    }

    @JavascriptInterface
    public void openExternal(String str, String str2, String str3) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        if (!qVar.i()) {
            this.f24962b.c("openExternal");
            return;
        }
        this.f24962b.l();
        m landingPageHandler = this.f24962b.getLandingPageHandler();
        if (str2 != null) {
            landingPageHandler.a("openExternal", str, str2, str3);
        } else if (str3 != null) {
            landingPageHandler.a("openExternal", str, str3, null);
        } else {
            landingPageHandler.f25883a.a(str, "Empty url and fallback url", "openExternal");
        }
    }

    @JavascriptInterface
    public void openWithoutTracker(final String str, final String str2) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        if (!qVar.i()) {
            this.f24962b.c("openWithoutTracker");
        } else {
            ji.a().a(new Runnable() { // from class: com.inmobi.media.cq.5
                {
                    cq.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cq.this.f24962b.getLandingPageHandler().a("openWithoutTracker", str, str2);
                }
            });
        }
    }

    @JavascriptInterface
    public void ping(String str, String str2, boolean z10) {
        if (this.f24962b == null) {
            return;
        }
        if (str2 != null && str2.trim().length() != 0 && URLUtil.isValidUrl(str2)) {
            try {
                bk.a().a(str2, z10);
                return;
            } catch (Exception unused) {
                this.f24962b.b(str, "Unexpected error", "ping");
                hu.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                return;
            }
        }
        this.f24962b.b(str, "Invalid URL:".concat(String.valueOf(str2)), "ping");
    }

    @JavascriptInterface
    public void pingInWebView(String str, String str2, boolean z10) {
        if (this.f24962b == null) {
            return;
        }
        if (str2 != null && str2.trim().length() != 0 && URLUtil.isValidUrl(str2)) {
            try {
                bk.a().b(str2, z10);
                return;
            } catch (Exception unused) {
                this.f24962b.b(str, "Unexpected error", "pingInWebView");
                hu.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                return;
            }
        }
        this.f24962b.b(str, "Invalid URL:".concat(String.valueOf(str2)), "pingInWebView");
    }

    @JavascriptInterface
    public void playVideo(final String str, final String str2) {
        if (this.f24962b == null) {
            return;
        }
        if (str2 != null && str2.trim().length() != 0 && str2.startsWith("http") && (str2.endsWith("mp4") || str2.endsWith("avi") || str2.endsWith("m4v"))) {
            new Handler(this.f24962b.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.12
                {
                    cq.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        q qVar = cq.this.f24962b;
                        String str3 = str;
                        String trim = str2.trim();
                        if (1 == qVar.f25955e || "Expanded".equals(qVar.getViewState())) {
                            WeakReference<Activity> weakReference = qVar.f25952b;
                            if (weakReference != null && weakReference.get() != null) {
                                final db dbVar = qVar.f25958h;
                                Activity activity = qVar.f25952b.get();
                                cy cyVar = new cy(activity);
                                dbVar.f25073b = cyVar;
                                cyVar.f25050h = cy.a(trim);
                                cyVar.f25049g = "anonymous";
                                if (cyVar.f25044b == null) {
                                    cyVar.f25044b = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
                                    cyVar.f25044b = cy.b(cyVar.f25050h);
                                }
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                layoutParams.addRule(13);
                                dbVar.f25073b.setLayoutParams(layoutParams);
                                RelativeLayout relativeLayout = new RelativeLayout(activity);
                                relativeLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.db.1
                                    @Override // android.view.View.OnTouchListener
                                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                                        return true;
                                    }
                                });
                                relativeLayout.setBackgroundColor(-16777216);
                                relativeLayout.addView(dbVar.f25073b);
                                ((ViewGroup) activity.findViewById(16908290)).addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                                cy cyVar2 = dbVar.f25073b;
                                cyVar2.f25045c = relativeLayout;
                                cyVar2.requestFocus();
                                dbVar.f25073b.setOnKeyListener(new View.OnKeyListener() { // from class: com.inmobi.media.db.2
                                    @Override // android.view.View.OnKeyListener
                                    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                                        if (4 == i10 && keyEvent.getAction() == 0) {
                                            dbVar.f25073b.a();
                                            return true;
                                        }
                                        return false;
                                    }
                                });
                                dbVar.f25073b.f25046d = new cy.b() { // from class: com.inmobi.media.db.3
                                    @Override // com.inmobi.media.cy.b
                                    public final void a(cy cyVar3) {
                                        String unused = db.f25071f;
                                        ViewGroup viewGroup = cyVar3.f25045c;
                                        if (viewGroup != null) {
                                            ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
                                        }
                                        cyVar3.f25045c = null;
                                    }

                                    @Override // com.inmobi.media.cy.b
                                    public final void a() {
                                        String unused = db.f25071f;
                                    }
                                };
                                cy cyVar3 = dbVar.f25073b;
                                cyVar3.setVideoPath(cyVar3.f25050h);
                                cyVar3.setOnCompletionListener(cyVar3);
                                cyVar3.setOnPreparedListener(cyVar3);
                                cyVar3.setOnErrorListener(cyVar3);
                                if (cyVar3.f25043a != null || Build.VERSION.SDK_INT < 19) {
                                    return;
                                }
                                cy.a aVar = new cy.a(cyVar3.getContext());
                                cyVar3.f25043a = aVar;
                                aVar.setAnchorView(cyVar3);
                                cyVar3.setMediaController(cyVar3.f25043a);
                                return;
                            }
                            qVar.b(str3, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
                        }
                    } catch (Exception unused) {
                        cq.this.f24962b.b(str, "Unexpected error", "playVideo");
                        hu.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
                        String unused2 = cq.f24961a;
                    }
                }
            });
        } else {
            this.f24962b.b(str, "Null or empty or invalid media playback URL supplied", "playVideo");
        }
    }

    @JavascriptInterface
    public void registerBackButtonPressedEventListener(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            qVar.f25966p = str;
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "registerBackButtonPressedEventListener");
        }
    }

    @JavascriptInterface
    public void registerDeviceMuteEventListener(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            db mediaProcessor = qVar.getMediaProcessor();
            Context c10 = ho.c();
            if (c10 == null || mediaProcessor.f25074c != null) {
                return;
            }
            db.b bVar = new db.b(str);
            mediaProcessor.f25074c = bVar;
            c10.registerReceiver(bVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "registerDeviceMuteEventListener");
        }
    }

    @JavascriptInterface
    public void registerDeviceVolumeChangeEventListener(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            db mediaProcessor = qVar.getMediaProcessor();
            Context c10 = ho.c();
            if (c10 == null || mediaProcessor.f25075d != null) {
                return;
            }
            mediaProcessor.f25075d = new db.c(str, c10, new Handler());
            c10.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, mediaProcessor.f25075d);
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
        }
    }

    @JavascriptInterface
    public void registerHeadphonePluggedEventListener(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            db mediaProcessor = qVar.getMediaProcessor();
            Context c10 = ho.c();
            if (c10 == null || mediaProcessor.f25076e != null) {
                return;
            }
            db.a aVar = new db.a(str);
            mediaProcessor.f25076e = aVar;
            c10.registerReceiver(aVar, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "registerHeadphonePluggedEventListener");
        }
    }

    @JavascriptInterface
    public void resize(final String str) {
        if (this.f24963c == 1 || this.f24962b == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.10
            {
                cq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    q qVar = cq.this.f24962b;
                    if ((CBLocation.LOCATION_DEFAULT.equals(qVar.f25954d) || "Resized".equals(qVar.f25954d)) && qVar.getResizeProperties() != null) {
                        qVar.f25968r = true;
                        qVar.f25957g.a();
                        qVar.requestLayout();
                        qVar.invalidate();
                        qVar.setFocusable(true);
                        qVar.setFocusableInTouchMode(true);
                        qVar.requestFocus();
                        qVar.setAndUpdateViewState("Resized");
                        qVar.getListener().a_(qVar);
                        qVar.f25968r = false;
                    }
                } catch (Exception unused) {
                    cq.this.f24962b.b(str, "Unexpected error", "resize");
                    hu.a((byte) 1, cq.f24961a, "Could not resize ad; SDK encountered an unexpected error");
                    String unused2 = cq.f24961a;
                }
            }
        });
    }

    @JavascriptInterface
    public void saveBlob(String str, String str2) {
        ai aiVar;
        q qVar = this.f24962b;
        if (qVar == null || (aiVar = qVar.f25970t) == null) {
            return;
        }
        aiVar.a(str2, qVar.f25969s);
    }

    @JavascriptInterface
    public void saveContent(String str, String str2, String str3) {
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            try {
                q qVar = this.f24962b;
                if (!qVar.e("saveContent")) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ImagesContract.URL, str3);
                        jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, 7);
                    } catch (JSONException unused) {
                    }
                    String replace = jSONObject.toString().replace("\"", "\\\"");
                    qVar.a(str, "sendSaveContentResult(\"saveContent_" + str2 + "\", 'failed', \"" + replace + "\");");
                    return;
                }
                HashSet hashSet = new HashSet();
                hashSet.add(new bn((byte) -1, str3));
                final aw awVar = new aw(UUID.randomUUID().toString(), hashSet, qVar.f25975y, str2);
                awVar.f24652f = str;
                final bg a10 = bg.a();
                a10.f24707a.execute(new Runnable() { // from class: com.inmobi.media.bg.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a10.a(awVar);
                        String unused2 = bg.f24705b;
                        awVar.f24648b.size();
                        for (bn bnVar : awVar.f24648b) {
                            bg.b(a10, bnVar.f24803b);
                        }
                    }
                });
                return;
            } catch (Exception unused2) {
                this.f24962b.b(str, "Unexpected error", "saveContent");
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (str3 == null) {
            str3 = "";
        }
        try {
            jSONObject2.put(ImagesContract.URL, str3);
            jSONObject2.put(IronSourceConstants.EVENTS_ERROR_REASON, 8);
        } catch (JSONException unused3) {
        }
        String replace2 = jSONObject2.toString().replace("\"", "\\\"");
        StringBuilder sb2 = new StringBuilder("sendSaveContentResult(\"saveContent_");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append("\", 'failed', \"");
        sb2.append(replace2);
        sb2.append("\");");
        this.f24962b.a(str, sb2.toString());
    }

    @JavascriptInterface
    public void setAdContext(String str, String str2) {
        k adPodHandler = this.f24962b.getAdPodHandler();
        if (adPodHandler != null) {
            adPodHandler.a(str2);
        }
    }

    @JavascriptInterface
    public void setCloseEndCardTracker(String str, String str2) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            qVar.setCloseEndCardTracker(str2);
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "getDownloadStatus");
        }
    }

    @JavascriptInterface
    public void setExpandProperties(String str, String str2) {
        q qVar = this.f24962b;
        if (qVar == null || "Expanded".equals(qVar.getState())) {
            return;
        }
        try {
            this.f24962b.setExpandProperties(cx.a(str2));
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "setExpandProperties");
        }
    }

    @JavascriptInterface
    public void setOrientationProperties(String str, final String str2) {
        ji.a().a(new Runnable() { // from class: com.inmobi.media.b0
            @Override // java.lang.Runnable
            public final void run() {
                cq.c(cq.this, str2);
            }
        });
    }

    @JavascriptInterface
    public void setResizeProperties(String str, String str2) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        de a10 = de.a(str2, qVar.getResizeProperties());
        if (a10 == null) {
            this.f24962b.b(str, "setResizeProperties", "All mandatory fields are not present");
        }
        this.f24962b.setResizeProperties(a10);
    }

    @JavascriptInterface
    public void showAd(String str, int i10) {
        k kVar;
        q qVar = this.f24962b;
        if (qVar.f25963m && (kVar = qVar.f25972v) != null) {
            kVar.a(i10, qVar, qVar.f25952b.get());
        } else {
            qVar.d(false);
        }
    }

    @JavascriptInterface
    public void showAlert(String str, String str2) {
    }

    @JavascriptInterface
    public void showEndCard(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        j referenceContainer = qVar.getReferenceContainer();
        if (referenceContainer instanceof n) {
            final n nVar = (n) referenceContainer;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.n.10
                @Override // java.lang.Runnable
                public final void run() {
                    n nVar2 = nVar;
                    nVar2.f25911p = true;
                    nVar2.c((bt) null);
                }
            });
        }
    }

    @JavascriptInterface
    public void storePicture(String str, String str2) {
    }

    @JavascriptInterface
    public String supports(String str, String str2) {
        return String.valueOf(this.f24962b.e(str2));
    }

    @JavascriptInterface
    public long timeSinceShow(String str) {
        k kVar = this.f24962b.f25972v;
        if (kVar != null) {
            return kVar.b_();
        }
        return 0L;
    }

    @JavascriptInterface
    public void unregisterBackButtonPressedEventListener(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            qVar.f25966p = null;
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
        }
    }

    @JavascriptInterface
    public void unregisterDeviceMuteEventListener(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            qVar.getMediaProcessor().b();
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
        }
    }

    @JavascriptInterface
    public void unregisterDeviceVolumeChangeEventListener(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            qVar.getMediaProcessor().c();
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
        }
    }

    @JavascriptInterface
    public void unregisterHeadphonePluggedEventListener(String str) {
        q qVar = this.f24962b;
        if (qVar == null) {
            return;
        }
        try {
            qVar.getMediaProcessor().e();
        } catch (Exception unused) {
            this.f24962b.b(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
        }
    }

    @JavascriptInterface
    public void useCustomClose(final String str, final boolean z10) {
        new Handler(this.f24962b.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.cq.11
            {
                cq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    cq.this.f24962b.c(z10);
                } catch (Exception unused) {
                    cq.this.f24962b.b(str, "Unexpected error", "useCustomClose");
                    String unused2 = cq.f24961a;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0085 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:52:0x0003, B:55:0x000c, B:57:0x0016, B:59:0x0021, B:62:0x0028, B:64:0x0032, B:67:0x0039, B:69:0x0041, B:89:0x0085, B:91:0x008f, B:71:0x0046, B:73:0x004e, B:76:0x0055, B:78:0x0060, B:79:0x0064, B:82:0x006c, B:84:0x0077, B:85:0x007b, B:86:0x007f, B:93:0x0099), top: B:97:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:52:0x0003, B:55:0x000c, B:57:0x0016, B:59:0x0021, B:62:0x0028, B:64:0x0032, B:67:0x0039, B:69:0x0041, B:89:0x0085, B:91:0x008f, B:71:0x0046, B:73:0x004e, B:76:0x0055, B:78:0x0060, B:79:0x0064, B:82:0x006c, B:84:0x0077, B:85:0x007b, B:86:0x007f, B:93:0x0099), top: B:97:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(java.lang.String r10, int r11, java.lang.String r12, float r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = "customExpand"
            r1 = 1
            com.inmobi.media.q r2 = r9.f24962b     // Catch: java.lang.Exception -> La3
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch: java.lang.Exception -> La3
            if (r2 != 0) goto Lc
            return
        Lc:
            com.inmobi.media.v[] r2 = com.inmobi.media.v.values()     // Catch: java.lang.Exception -> La3
            r11 = r2[r11]     // Catch: java.lang.Exception -> La3
            com.inmobi.media.v r2 = com.inmobi.media.v.URL     // Catch: java.lang.Exception -> La3
            if (r11 != r2) goto L99
            com.inmobi.media.q r2 = r9.f24962b     // Catch: java.lang.Exception -> La3
            com.inmobi.media.m r2 = r2.getLandingPageHandler()     // Catch: java.lang.Exception -> La3
            r3 = 4
            r4 = 3
            r5 = 2
            if (r10 == 0) goto L7f
            boolean r6 = r10.isEmpty()     // Catch: java.lang.Exception -> La3
            if (r6 == 0) goto L28
            goto L7f
        L28:
            android.net.Uri r6 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> La3
            java.lang.String r7 = r6.getScheme()     // Catch: java.lang.Exception -> La3
            if (r7 == 0) goto L7b
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Exception -> La3
            if (r8 == 0) goto L39
            goto L7b
        L39:
            java.lang.String r8 = "inmobinativebrowser"
            boolean r8 = r7.equals(r8)     // Catch: java.lang.Exception -> La3
            if (r8 == 0) goto L46
            r2.b(r0, r12, r10)     // Catch: java.lang.Exception -> La3
        L44:
            r3 = 2
            goto L83
        L46:
            java.lang.String r8 = "inmobideeplink"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> La3
            if (r7 == 0) goto L55
            boolean r2 = r2.c(r0, r12, r10)     // Catch: java.lang.Exception -> La3
            if (r2 == 0) goto L83
            goto L44
        L55:
            com.inmobi.media.hk.a()     // Catch: java.lang.Exception -> La3
            android.content.Context r7 = r2.f25884b     // Catch: java.lang.Exception -> La3
            boolean r7 = com.inmobi.media.hk.a(r7, r10)     // Catch: java.lang.Exception -> La3
            if (r7 == 0) goto L64
            r2.e(r0, r12, r10)     // Catch: java.lang.Exception -> La3
            goto L44
        L64:
            boolean r6 = com.inmobi.media.hs.a(r6)     // Catch: java.lang.Exception -> La3
            if (r6 == 0) goto L6c
            r3 = 3
            goto L83
        L6c:
            com.inmobi.media.hl.a()     // Catch: java.lang.Exception -> La3
            android.content.Context r6 = r2.f25884b     // Catch: java.lang.Exception -> La3
            boolean r6 = com.inmobi.media.hl.a(r6, r10)     // Catch: java.lang.Exception -> La3
            if (r6 == 0) goto L83
            r2.e(r0, r12, r10)     // Catch: java.lang.Exception -> La3
            goto L44
        L7b:
            r2.a(r0, r12)     // Catch: java.lang.Exception -> La3
            goto L82
        L7f:
            r2.a(r0, r12)     // Catch: java.lang.Exception -> La3
        L82:
            r3 = 1
        L83:
            if (r3 != r4) goto L8f
            com.inmobi.media.q r2 = r9.f24962b     // Catch: java.lang.Exception -> La3
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch: java.lang.Exception -> La3
            r2.a(r10, r11, r13, r14)     // Catch: java.lang.Exception -> La3
            return
        L8f:
            com.inmobi.media.q r10 = r9.f24962b     // Catch: java.lang.Exception -> La3
            com.inmobi.media.w r10 = r10.getEmbeddedBrowserJSCallbacks()     // Catch: java.lang.Exception -> La3
            r10.a()     // Catch: java.lang.Exception -> La3
            return
        L99:
            com.inmobi.media.q r2 = r9.f24962b     // Catch: java.lang.Exception -> La3
            com.inmobi.media.w r2 = r2.getEmbeddedBrowserJSCallbacks()     // Catch: java.lang.Exception -> La3
            r2.a(r10, r11, r13, r14)     // Catch: java.lang.Exception -> La3
            return
        La3:
            com.inmobi.media.q r10 = r9.f24962b
            java.lang.String r11 = "Unexpected error"
            r10.b(r12, r11, r0)
            java.lang.String r10 = "InMobi"
            java.lang.String r11 = "Failed to custom expand ad; SDK encountered an unexpected error"
            com.inmobi.media.hu.a(r1, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.cq.a(java.lang.String, int, java.lang.String, float, boolean):void");
    }

    public /* synthetic */ void a(String str) {
        dd orientationProperties = this.f24962b.getOrientationProperties();
        if (orientationProperties != null) {
            dd a10 = dd.a(str, orientationProperties);
            this.f24964d = a10;
            this.f24962b.setOrientationProperties(a10);
        }
    }
}
