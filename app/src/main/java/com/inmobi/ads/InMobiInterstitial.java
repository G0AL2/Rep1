package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.am;
import com.inmobi.media.bm;
import com.inmobi.media.e;
import com.inmobi.media.gg;
import com.inmobi.media.hg;
import com.inmobi.media.ho;
import com.inmobi.media.hp;
import com.inmobi.media.hu;
import com.inmobi.media.ic;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class InMobiInterstitial {

    /* renamed from: b  reason: collision with root package name */
    private static final String f24386b = "InMobiInterstitial";

    /* renamed from: a  reason: collision with root package name */
    public InterstitialAdEventListener f24387a;

    /* renamed from: c  reason: collision with root package name */
    private am f24388c;

    /* renamed from: d  reason: collision with root package name */
    private Context f24389d;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Context> f24391f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f24390e = false;

    /* renamed from: g  reason: collision with root package name */
    private bm f24392g = new bm();

    /* renamed from: h  reason: collision with root package name */
    private a f24393h = new a(this);

    /* renamed from: i  reason: collision with root package name */
    private PreloadManager f24394i = new PreloadManager() { // from class: com.inmobi.ads.InMobiInterstitial.1

        /* renamed from: b  reason: collision with root package name */
        private e f24396b;

        {
            this.f24396b = new e(InMobiInterstitial.this);
        }

        @Override // com.inmobi.ads.PreloadManager
        public final void load() {
            try {
                InMobiInterstitial.this.f24388c.l();
            } catch (IllegalStateException e10) {
                hu.a((byte) 1, InMobiInterstitial.f24386b, e10.getMessage());
                InMobiInterstitial inMobiInterstitial = InMobiInterstitial.this;
                inMobiInterstitial.f24387a.onAdLoadFailed(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }

        @Override // com.inmobi.ads.PreloadManager
        public final void preload() {
            InMobiInterstitial.a(InMobiInterstitial.this);
            InMobiInterstitial.this.f24392g.f24800e = "NonAB";
            InMobiInterstitial.this.f24388c.a(InMobiInterstitial.this.f24392g, InMobiInterstitial.this.f24389d);
            InMobiInterstitial.this.f24388c.a(this.f24396b);
        }
    };

    /* loaded from: classes3.dex */
    public static final class a extends e {
        a(InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
        }

        @Override // com.inmobi.media.e, com.inmobi.ads.controllers.PublisherCallbacks
        public final byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.e, com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InterstitialAdEventListener interstitialAdEventListener;
            InMobiInterstitial inMobiInterstitial = this.f25191a.get();
            if (inMobiInterstitial == null || (interstitialAdEventListener = inMobiInterstitial.f24387a) == null) {
                return;
            }
            interstitialAdEventListener.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
        }

        @Override // com.inmobi.media.e, com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiInterstitial inMobiInterstitial = this.f25191a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.f24388c.l();
                } catch (IllegalStateException e10) {
                    hu.a((byte) 1, InMobiInterstitial.f24386b, e10.getMessage());
                    inMobiInterstitial.f24387a.onAdLoadFailed(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(Context context, long j10, InterstitialAdEventListener interstitialAdEventListener) throws SdkNotInitializedException {
        if (ho.b()) {
            this.f24389d = context.getApplicationContext();
            this.f24392g.f24796a = j10;
            this.f24391f = new WeakReference<>(context);
            this.f24387a = interstitialAdEventListener;
            this.f24388c = new am();
            return;
        }
        throw new SdkNotInitializedException(f24386b);
    }

    public final void disableHardwareAcceleration() {
        this.f24392g.f24799d = true;
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f24388c.D();
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f24388c.C();
    }

    public final PreloadManager getPreloadManager() {
        return this.f24394i;
    }

    public final void getSignals() {
        this.f24388c.a(this.f24392g, this.f24389d);
        this.f24388c.b(this.f24393h);
    }

    public final boolean isReady() {
        return this.f24388c.n();
    }

    public final void load(byte[] bArr) {
        this.f24390e = true;
        bm bmVar = this.f24392g;
        bmVar.f24800e = "AB";
        this.f24388c.a(bmVar, this.f24389d);
        if (Build.VERSION.SDK_INT >= 29) {
            WeakReference<Context> weakReference = this.f24391f;
            ic.a(weakReference == null ? null : weakReference.get());
        }
        this.f24388c.a(bArr, this.f24393h);
    }

    public final void setContentUrl(String str) {
        this.f24392g.f24801f = str;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            hp.a(map.get("tp"));
            hp.b(map.get("tp-ver"));
        }
        this.f24392g.f24798c = map;
    }

    public final void setKeywords(String str) {
        this.f24392g.f24797b = str;
    }

    public final void setListener(InterstitialAdEventListener interstitialAdEventListener) {
        this.f24387a = interstitialAdEventListener;
    }

    public final void show() {
        try {
            if (!this.f24390e) {
                hu.a((byte) 1, f24386b, "load() must be called before trying to show the ad");
            } else {
                this.f24388c.o();
            }
        } catch (Exception e10) {
            hu.a((byte) 1, f24386b, "Unable to show ad; SDK encountered an unexpected error");
            gg.a().a(new hg(e10));
        }
    }

    static /* synthetic */ boolean a(InMobiInterstitial inMobiInterstitial) {
        inMobiInterstitial.f24390e = true;
        return true;
    }

    @Deprecated
    public final void show(int i10, int i11) {
        hu.a((byte) 1, f24386b, String.format("The %s API has been deprecated and API will be removed in the subsequent versions", "show(int, int)"));
        show();
    }

    public final void load() {
        try {
            this.f24390e = true;
            bm bmVar = this.f24392g;
            bmVar.f24800e = "NonAB";
            this.f24388c.a(bmVar, this.f24389d);
            if (Build.VERSION.SDK_INT >= 29) {
                WeakReference<Context> weakReference = this.f24391f;
                ic.a(weakReference == null ? null : weakReference.get());
            }
            this.f24388c.a(this.f24393h);
        } catch (Exception e10) {
            hu.a((byte) 1, f24386b, "Unable to load ad; SDK encountered an unexpected error");
            gg.a().a(new hg(e10));
        }
    }
}
