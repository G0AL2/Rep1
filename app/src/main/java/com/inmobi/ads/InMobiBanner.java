package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.ah;
import com.inmobi.media.b;
import com.inmobi.media.bm;
import com.inmobi.media.c;
import com.inmobi.media.ho;
import com.inmobi.media.hp;
import com.inmobi.media.hu;
import com.inmobi.media.ic;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class InMobiBanner extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final String f24366a = InMobiBanner.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public BannerAdEventListener f24367b;

    /* renamed from: c  reason: collision with root package name */
    public ah f24368c;

    /* renamed from: d  reason: collision with root package name */
    public AnimationType f24369d;

    /* renamed from: e  reason: collision with root package name */
    public a f24370e;

    /* renamed from: f  reason: collision with root package name */
    private int f24371f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f24372g;

    /* renamed from: h  reason: collision with root package name */
    private c f24373h;

    /* renamed from: i  reason: collision with root package name */
    private int f24374i;

    /* renamed from: j  reason: collision with root package name */
    private int f24375j;

    /* renamed from: k  reason: collision with root package name */
    private long f24376k;

    /* renamed from: l  reason: collision with root package name */
    private WeakReference<Activity> f24377l;

    /* renamed from: m  reason: collision with root package name */
    private bm f24378m;

    /* renamed from: n  reason: collision with root package name */
    private PreloadManager f24379n;

    /* loaded from: classes3.dex */
    public enum AnimationType {
        ANIMATION_OFF,
        ROTATE_HORIZONTAL_AXIS,
        ANIMATION_ALPHA,
        ROTATE_VERTICAL_AXIS
    }

    /* loaded from: classes3.dex */
    public static final class a extends b {
        a(InMobiBanner inMobiBanner) {
            super(inMobiBanner);
        }

        @Override // com.inmobi.media.b, com.inmobi.ads.controllers.PublisherCallbacks
        public final byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.b, com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiBanner inMobiBanner = this.f24660a.get();
            if (inMobiBanner == null) {
                return;
            }
            BannerAdEventListener bannerAdEventListener = inMobiBanner.f24367b;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
            }
            inMobiBanner.b();
        }

        @Override // com.inmobi.media.b, com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiBanner inMobiBanner = this.f24660a.get();
            if (inMobiBanner != null) {
                try {
                    inMobiBanner.f24368c.n();
                } catch (IllegalStateException e10) {
                    hu.a((byte) 1, InMobiBanner.f24366a, e10.getMessage());
                    BannerAdEventListener bannerAdEventListener = inMobiBanner.f24367b;
                    if (bannerAdEventListener != null) {
                        bannerAdEventListener.onAdLoadFailed(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    public InMobiBanner(Context context, AttributeSet attributeSet) throws SdkNotInitializedException {
        super(context, attributeSet);
        this.f24372g = true;
        this.f24374i = 0;
        this.f24375j = 0;
        this.f24369d = AnimationType.ROTATE_HORIZONTAL_AXIS;
        this.f24376k = 0L;
        this.f24378m = new bm();
        this.f24370e = new a(this);
        this.f24379n = new PreloadManager() { // from class: com.inmobi.ads.InMobiBanner.1

            /* renamed from: b  reason: collision with root package name */
            private b f24381b;

            {
                this.f24381b = new b(InMobiBanner.this);
            }

            @Override // com.inmobi.ads.PreloadManager
            public final void load() {
                try {
                    InMobiBanner.this.f24368c.n();
                } catch (IllegalStateException e10) {
                    hu.a((byte) 1, InMobiBanner.f24366a, e10.getMessage());
                    InMobiBanner inMobiBanner = InMobiBanner.this;
                    BannerAdEventListener bannerAdEventListener = inMobiBanner.f24367b;
                    if (bannerAdEventListener != null) {
                        bannerAdEventListener.onAdLoadFailed(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }

            @Override // com.inmobi.ads.PreloadManager
            public final void preload() {
                InMobiBanner.this.setEnableAutoRefresh(false);
                InMobiBanner.this.f24378m.f24800e = "NonAB";
                InMobiBanner.this.a((PublisherCallbacks) this.f24381b, false);
            }
        };
        if (ho.b()) {
            if (context instanceof Activity) {
                this.f24377l = new WeakReference<>((Activity) context);
            }
            this.f24368c = new ah();
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
            String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "refreshInterval");
            if (attributeValue != null) {
                long a10 = a(attributeValue);
                if (a10 != Long.MIN_VALUE) {
                    this.f24378m.f24796a = a10;
                } else {
                    throw new InvalidPlacementIdException();
                }
            }
            a(getContext());
            this.f24371f = this.f24368c.s();
            this.f24373h = new c(this);
            if (attributeValue2 != null) {
                try {
                    setRefreshInterval(Integer.parseInt(attributeValue2.trim()));
                    return;
                } catch (NumberFormatException unused) {
                    hu.a((byte) 1, f24366a, "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
                    return;
                }
            }
            return;
        }
        throw new SdkNotInitializedException(f24366a);
    }

    private void e() {
        if (getLayoutParams() != null) {
            this.f24374i = ic.b(getLayoutParams().width);
            this.f24375j = ic.b(getLayoutParams().height);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        c cVar = this.f24373h;
        if (cVar != null) {
            cVar.removeMessages(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getFrameSizeString() {
        return this.f24374i + "x" + this.f24375j;
    }

    public final void destroy() {
        f();
        removeAllViews();
        this.f24368c.w();
        this.f24367b = null;
    }

    public final void disableHardwareAcceleration() {
        this.f24378m.f24799d = true;
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f24368c.D();
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f24368c.C();
    }

    public final PreloadManager getPreloadManager() {
        return this.f24379n;
    }

    public final void getSignals() {
        if (a(true)) {
            if (b("getSignals()")) {
                a(getContext());
                setEnableAutoRefresh(false);
                this.f24368c.b(this.f24370e);
                return;
            }
            this.f24370e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
        }
    }

    public final void load(byte[] bArr) {
        if (a(false)) {
            if (b("load(byte[])")) {
                this.f24378m.f24800e = "AB";
                a(getContext());
                this.f24368c.a(bArr, this.f24370e);
                return;
            }
            this.f24368c.a((byte) 86);
            this.f24370e.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            this.f24368c.v();
            e();
            if (!a()) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.inmobi.ads.InMobiBanner.3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        try {
                            InMobiBanner inMobiBanner = InMobiBanner.this;
                            inMobiBanner.f24374i = ic.b(inMobiBanner.getMeasuredWidth());
                            InMobiBanner inMobiBanner2 = InMobiBanner.this;
                            inMobiBanner2.f24375j = ic.b(inMobiBanner2.getMeasuredHeight());
                            if (InMobiBanner.this.a()) {
                                if (Build.VERSION.SDK_INT >= 16) {
                                    InMobiBanner.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                } else {
                                    InMobiBanner.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                }
                            }
                        } catch (Exception unused) {
                            hu.a((byte) 1, InMobiBanner.f24366a, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error");
                            String unused2 = InMobiBanner.f24366a;
                        }
                    }
                });
            }
            b();
            if (Build.VERSION.SDK_INT >= 29) {
                ic.a(getContext(), getRootWindowInsets());
            }
        } catch (Exception unused) {
            hu.a((byte) 1, f24366a, "InMobiBanner#onAttachedToWindow() handler threw unexpected error");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            f();
            this.f24368c.u();
        } catch (Exception unused) {
            hu.a((byte) 1, f24366a, "InMobiBanner.onDetachedFromWindow() handler threw unexpected error");
        }
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i10) {
        try {
            super.onVisibilityChanged(view, i10);
            if (i10 == 0) {
                b();
            } else {
                f();
            }
        } catch (Exception unused) {
            hu.a((byte) 1, f24366a, "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error");
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        try {
            super.onWindowFocusChanged(z10);
            if (z10) {
                b();
            } else {
                f();
            }
        } catch (Exception unused) {
            hu.a((byte) 1, f24366a, "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error");
        }
    }

    public final void pause() {
        try {
            if (this.f24377l == null) {
                this.f24368c.r();
            }
        } catch (Exception unused) {
            hu.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void resume() {
        try {
            if (this.f24377l == null) {
                this.f24368c.q();
            }
        } catch (Exception unused) {
            hu.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        this.f24369d = animationType;
    }

    public final void setBannerSize(int i10, int i11) {
        this.f24374i = i10;
        this.f24375j = i11;
    }

    public final void setContentUrl(String str) {
        this.f24378m.f24801f = str;
    }

    public final void setEnableAutoRefresh(boolean z10) {
        try {
            if (this.f24372g == z10) {
                return;
            }
            this.f24372g = z10;
            if (z10) {
                b();
            } else {
                f();
            }
        } catch (Exception unused) {
            hu.a((byte) 1, f24366a, "Unable to setup auto-refresh on the ad; SDK encountered an unexpected error");
        }
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            hp.a(map.get("tp"));
            hp.b(map.get("tp-ver"));
        }
        this.f24378m.f24798c = map;
    }

    public final void setKeywords(String str) {
        this.f24378m.f24797b = str;
    }

    public final void setListener(BannerAdEventListener bannerAdEventListener) {
        this.f24367b = bannerAdEventListener;
    }

    public final void setRefreshInterval(int i10) {
        try {
            this.f24378m.f24800e = "NonAB";
            a(getContext());
            this.f24371f = this.f24368c.a(i10, this.f24371f);
        } catch (Exception unused) {
            hu.a((byte) 1, f24366a, "Unable to set refresh interval for the ad; SDK encountered an unexpected error");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        long j10 = this.f24376k;
        if (j10 == 0 || this.f24368c.a(j10)) {
            this.f24376k = SystemClock.elapsedRealtime();
            return true;
        }
        return false;
    }

    private static long a(String str) {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder(str.trim());
        } catch (NumberFormatException unused) {
            String str2 = f24366a;
            hu.a((byte) 1, str2, "Placement id value supplied in XML layout is not valid. Banner creation failed.");
            hu.a((byte) 1, str2, "Invalid Placement id: ".concat(String.valueOf(str)));
        } catch (StringIndexOutOfBoundsException unused2) {
            String str3 = f24366a;
            hu.a((byte) 1, str3, "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            hu.a((byte) 1, str3, "Invalid Placement id: ".concat(String.valueOf(str)));
        }
        if ("plid-".equalsIgnoreCase(sb2.substring(0, 5))) {
            return Long.parseLong(sb2.substring(5, sb2.length()).trim());
        }
        String str4 = f24366a;
        hu.a((byte) 1, str4, "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
        hu.a((byte) 1, str4, "Invalid Placement id: ".concat(str));
        return Long.MIN_VALUE;
    }

    private boolean b(String str) {
        if (!a()) {
            if (getLayoutParams() == null) {
                String str2 = f24366a;
                hu.a((byte) 1, str2, "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
                return false;
            } else if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
                e();
            } else {
                hu.a((byte) 1, f24366a, "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(String.valueOf(str)));
                return false;
            }
        }
        return true;
    }

    public final void load() {
        if (a(false)) {
            this.f24378m.f24800e = "NonAB";
            a((PublisherCallbacks) this.f24370e, false);
        }
    }

    public final void b() {
        c cVar;
        if (isShown() && hasWindowFocus()) {
            c cVar2 = this.f24373h;
            if (cVar2 != null) {
                cVar2.removeMessages(1);
            }
            if (this.f24368c.l() && this.f24372g && (cVar = this.f24373h) != null) {
                cVar.sendEmptyMessageDelayed(1, this.f24371f * 1000);
            }
        }
    }

    public final void load(Context context) {
        if (a(false)) {
            if (context instanceof Activity) {
                this.f24377l = new WeakReference<>((Activity) context);
            } else {
                this.f24377l = null;
            }
            this.f24378m.f24800e = "NonAB";
            a((PublisherCallbacks) this.f24370e, false);
        }
    }

    private boolean a(boolean z10) {
        if (z10 && this.f24367b == null) {
            hu.a((byte) 1, f24366a, "Listener supplied is null, Ignoring your call.");
            return false;
        }
        return true;
    }

    public final void a(final PublisherCallbacks publisherCallbacks, final boolean z10) {
        try {
            this.f24368c.x();
            if (z10) {
                this.f24378m.f24800e = "NonAB";
            }
            a(getContext());
            if (this.f24368c.t()) {
                this.f24368c.b((byte) 15);
                BannerAdEventListener bannerAdEventListener = this.f24367b;
                if (bannerAdEventListener != null) {
                    bannerAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                hu.a((byte) 1, f24366a, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
            } else if (!b("load")) {
                this.f24368c.a((byte) 86);
                ah ahVar = this.f24368c;
                ahVar.a(ahVar.m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
            } else if (!a()) {
                new Handler().postDelayed(new Runnable() { // from class: com.inmobi.ads.InMobiBanner.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (!InMobiBanner.this.a()) {
                                hu.a((byte) 1, InMobiBanner.f24366a, "The height or width of the banner can not be determined");
                                InMobiBanner.this.f24368c.a((byte) 86);
                                ah ahVar2 = InMobiBanner.this.f24368c;
                                ahVar2.a(ahVar2.m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                                return;
                            }
                            InMobiBanner.this.f();
                            if (InMobiBanner.this.d()) {
                                InMobiBanner inMobiBanner = InMobiBanner.this;
                                inMobiBanner.f24368c.a(publisherCallbacks, inMobiBanner.getFrameSizeString(), z10);
                            }
                        } catch (Exception unused) {
                            InMobiBanner.this.f24368c.a((byte) 87);
                            hu.a((byte) 1, InMobiBanner.f24366a, "SDK encountered unexpected error while loading an ad");
                            String unused2 = InMobiBanner.f24366a;
                        }
                    }
                }, 200L);
            } else {
                f();
                if (d()) {
                    this.f24368c.a(publisherCallbacks, getFrameSizeString(), z10);
                }
            }
        } catch (Exception unused) {
            this.f24368c.a((byte) 87);
            hu.a((byte) 1, f24366a, "Unable to load ad; SDK encountered an unexpected error");
        }
    }

    public InMobiBanner(Context context, long j10) throws SdkNotInitializedException {
        super(context);
        this.f24372g = true;
        this.f24374i = 0;
        this.f24375j = 0;
        this.f24369d = AnimationType.ROTATE_HORIZONTAL_AXIS;
        this.f24376k = 0L;
        this.f24378m = new bm();
        this.f24370e = new a(this);
        this.f24379n = new PreloadManager() { // from class: com.inmobi.ads.InMobiBanner.1

            /* renamed from: b  reason: collision with root package name */
            private b f24381b;

            {
                this.f24381b = new b(InMobiBanner.this);
            }

            @Override // com.inmobi.ads.PreloadManager
            public final void load() {
                try {
                    InMobiBanner.this.f24368c.n();
                } catch (IllegalStateException e10) {
                    hu.a((byte) 1, InMobiBanner.f24366a, e10.getMessage());
                    InMobiBanner inMobiBanner = InMobiBanner.this;
                    BannerAdEventListener bannerAdEventListener = inMobiBanner.f24367b;
                    if (bannerAdEventListener != null) {
                        bannerAdEventListener.onAdLoadFailed(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }

            @Override // com.inmobi.ads.PreloadManager
            public final void preload() {
                InMobiBanner.this.setEnableAutoRefresh(false);
                InMobiBanner.this.f24378m.f24800e = "NonAB";
                InMobiBanner.this.a((PublisherCallbacks) this.f24381b, false);
            }
        };
        if (ho.b()) {
            if (context instanceof Activity) {
                this.f24377l = new WeakReference<>((Activity) context);
            }
            this.f24368c = new ah();
            this.f24378m.f24796a = j10;
            a(context);
            this.f24371f = this.f24368c.s();
            this.f24373h = new c(this);
            return;
        }
        throw new SdkNotInitializedException(f24366a);
    }

    final boolean a() {
        return this.f24374i > 0 && this.f24375j > 0;
    }

    private void a(Context context) {
        this.f24368c.a(context, this.f24378m, getFrameSizeString());
        ah ahVar = this.f24368c;
        int i10 = this.f24371f;
        this.f24371f = ahVar.a(i10, i10);
    }
}
