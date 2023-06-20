package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.aq;
import com.inmobi.media.bm;
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
public final class InMobiNative {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24397a = "InMobiNative";

    /* renamed from: b  reason: collision with root package name */
    private aq f24398b;

    /* renamed from: c  reason: collision with root package name */
    private NativeCallbacks f24399c;

    /* renamed from: d  reason: collision with root package name */
    private NativeAdEventListener f24400d;

    /* renamed from: e  reason: collision with root package name */
    private VideoEventListener f24401e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<View> f24402f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f24403g;

    /* renamed from: h  reason: collision with root package name */
    private bm f24404h = new bm();

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<Context> f24405i;

    /* renamed from: j  reason: collision with root package name */
    private LockScreenListener f24406j;

    /* loaded from: classes3.dex */
    public interface LockScreenListener {
        void onActionRequired(InMobiNative inMobiNative);
    }

    /* loaded from: classes3.dex */
    public static final class NativeCallbacks extends PublisherCallbacks {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<InMobiNative> f24407a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f24408b = true;

        NativeCallbacks(InMobiNative inMobiNative) {
            this.f24407a = new WeakReference<>(inMobiNative);
        }

        final void a() {
            this.f24408b = false;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdClicked(Map<Object, Object> map) {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdClicked(inMobiNative);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdDismissed() {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdFullScreenDismissed(inMobiNative);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdDisplayed(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdFullScreenDisplayed(inMobiNative);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            onAdLoadFailed(inMobiAdRequestStatus);
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdReceived(inMobiNative);
                }
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdFetchSuccessful(inMobiNative, adMetaInfo);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdImpressed() {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdImpressed(inMobiNative);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative == null) {
                hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (this.f24408b) {
            } else {
                this.f24408b = true;
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdLoadSucceeded(AdMetaInfo adMetaInfo) {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative == null) {
                hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
            } else if (this.f24408b) {
            } else {
                this.f24408b = true;
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdLoadSucceeded(inMobiNative);
                }
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdLoadSucceeded(inMobiNative, adMetaInfo);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAdWillDisplay() {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24406j != null) {
                    inMobiNative.f24406j.onActionRequired(inMobiNative);
                }
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onAdFullScreenWillDisplay(inMobiNative);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onAudioStateChanged(boolean z10) {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24401e != null) {
                    inMobiNative.f24401e.onAudioStateChanged(inMobiNative, z10);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onRequestPayloadCreated(byte[] bArr) {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onRequestPayloadCreated(bArr);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onUserLeftApplication() {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24406j != null) {
                    inMobiNative.f24406j.onActionRequired(inMobiNative);
                }
                if (inMobiNative.f24400d != null) {
                    inMobiNative.f24400d.onUserWillLeaveApplication(inMobiNative);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onVideoCompleted() {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24401e != null) {
                    inMobiNative.f24401e.onVideoCompleted(inMobiNative);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public final void onVideoSkipped() {
            InMobiNative inMobiNative = this.f24407a.get();
            if (inMobiNative != null) {
                if (inMobiNative.f24401e != null) {
                    inMobiNative.f24401e.onVideoSkipped(inMobiNative);
                    return;
                }
                return;
            }
            hu.a((byte) 1, InMobiNative.f24397a, "Lost reference to InMobiNative! callback cannot be given");
        }
    }

    public InMobiNative(Context context, long j10, NativeAdEventListener nativeAdEventListener) throws SdkNotInitializedException {
        if (ho.b()) {
            this.f24404h.f24796a = j10;
            this.f24405i = new WeakReference<>(context);
            this.f24400d = nativeAdEventListener;
            this.f24399c = new NativeCallbacks(this);
            this.f24398b = new aq(this.f24399c);
            return;
        }
        throw new SdkNotInitializedException(f24397a);
    }

    public final void destroy() {
        try {
            WeakReference<View> weakReference = this.f24402f;
            View view = weakReference == null ? null : weakReference.get();
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
            }
            this.f24398b.o();
            this.f24400d = null;
            this.f24401e = null;
            this.f24403g = false;
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Failed to destroy ad; SDK encountered an unexpected error");
            gg.a().a(new hg(e10));
        }
    }

    public final String getAdCtaText() {
        try {
            return this.f24398b.x();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Could not get the ctaText; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
            return null;
        }
    }

    public final String getAdDescription() {
        try {
            return this.f24398b.u();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Could not get the description; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
            return null;
        }
    }

    public final String getAdIconUrl() {
        try {
            return this.f24398b.v();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Could not get the iconUrl; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
            return null;
        }
    }

    public final String getAdLandingPageUrl() {
        try {
            return this.f24398b.w();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Could not get the adLandingPageUrl; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
            return null;
        }
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f24398b.D();
    }

    public final float getAdRating() {
        try {
            return this.f24398b.y();
        } catch (Exception e10) {
            gg.a().a(new hg(e10));
            hu.a((byte) 1, "InMobi", "Could not get rating; SDK encountered an unexpected error");
            return 0.0f;
        }
    }

    public final String getAdTitle() {
        try {
            return this.f24398b.t();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Could not get the ad title; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
            return null;
        }
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f24398b.C();
    }

    public final JSONObject getCustomAdContent() {
        try {
            return this.f24398b.s();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Could not get the ad customJson ; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[Catch: Exception -> 0x00d9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d9, blocks: (B:4:0x0006, B:6:0x000e, B:11:0x0022, B:13:0x002a, B:15:0x0044, B:17:0x004a, B:35:0x00c8, B:38:0x00d6, B:19:0x0050, B:21:0x0056, B:22:0x005f, B:24:0x0065, B:26:0x006c, B:28:0x0077, B:30:0x007f, B:31:0x0090, B:33:0x0094, B:34:0x00b5, B:9:0x0018), top: B:43:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getPrimaryViewOfWidth(android.content.Context r7, android.view.View r8, android.view.ViewGroup r9, int r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.InMobiNative.getPrimaryViewOfWidth(android.content.Context, android.view.View, android.view.ViewGroup, int):android.view.View");
    }

    public final void getSignals() {
        if (a(false)) {
            this.f24399c.a();
            b();
            this.f24398b.b(this.f24399c);
        }
    }

    public final boolean isAppDownload() {
        try {
            return this.f24398b.z();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Could not get isAppDownload; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
            return false;
        }
    }

    public final boolean isReady() {
        return this.f24398b.l();
    }

    public final Boolean isVideo() {
        try {
            return this.f24398b.A();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "Could not get isVideo; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
            return null;
        }
    }

    public final void load(byte[] bArr) {
        if (a(false)) {
            if (Build.VERSION.SDK_INT >= 29) {
                WeakReference<Context> weakReference = this.f24405i;
                ic.a(weakReference == null ? null : weakReference.get());
            }
            this.f24404h.f24800e = "AB";
            b();
            this.f24399c.a();
            this.f24398b.a(bArr, this.f24399c);
        }
    }

    public final void pause() {
        try {
            this.f24398b.q();
        } catch (Exception unused) {
            hu.a((byte) 1, f24397a, "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void reportAdClickAndOpenLandingPage() {
        try {
            this.f24398b.B();
        } catch (Exception e10) {
            hu.a((byte) 1, f24397a, "reportAdClickAndOpenLandingPage failed; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
        }
    }

    public final void resume() {
        try {
            this.f24398b.r();
        } catch (Exception unused) {
            hu.a((byte) 1, f24397a, "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void setContentUrl(String str) {
        this.f24404h.f24801f = str;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            hp.a(map.get("tp"));
            hp.b(map.get("tp-ver"));
        }
        this.f24404h.f24798c = map;
    }

    public final void setKeywords(String str) {
        this.f24404h.f24797b = str;
    }

    public final void setListener(NativeAdEventListener nativeAdEventListener) {
        this.f24400d = nativeAdEventListener;
    }

    public final void setVideoEventListener(VideoEventListener videoEventListener) {
        this.f24401e = videoEventListener;
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        WeakReference<Context> weakReference = this.f24405i;
        if (weakReference != null && weakReference.get() != null) {
            try {
                this.f24398b.b(this.f24404h, this.f24405i.get());
                this.f24406j = lockScreenListener;
                return;
            } catch (Exception unused) {
                hu.a((byte) 1, f24397a, "SDK encountered unexpected error in showOnLockScreen");
                return;
            }
        }
        hu.a((byte) 1, f24397a, "InMobiNative is not initialized. Provided context is null. Ignoring showOnLockScreen");
    }

    public final void takeAction() {
        try {
            this.f24398b.p();
        } catch (Exception unused) {
            hu.a((byte) 1, f24397a, "SDK encountered unexpected error in takeAction");
        }
    }

    private void b() {
        WeakReference<Context> weakReference = this.f24405i;
        Context context = weakReference == null ? null : weakReference.get();
        if (context == null) {
            return;
        }
        this.f24398b.a(this.f24404h, context);
    }

    private boolean a(boolean z10) {
        if (!z10 ? this.f24400d == null : !(this.f24398b != null || this.f24400d != null)) {
            hu.a((byte) 1, f24397a, "Listener supplied is null, your call is ignored.");
            return false;
        }
        WeakReference<Context> weakReference = this.f24405i;
        if (weakReference == null || weakReference.get() == null) {
            hu.a((byte) 1, f24397a, "Context supplied is null, your call is ignored.");
            return false;
        }
        return true;
    }

    public final void load() {
        try {
            if (a(true)) {
                this.f24399c.a();
                if (this.f24403g) {
                    aq aqVar = this.f24398b;
                    aqVar.a(aqVar.m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
                    hu.a((byte) 1, f24397a, "You can call load() on an instance of InMobiNative only once if the ad request has been successful. Ignoring InMobiNative.load()");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    WeakReference<Context> weakReference = this.f24405i;
                    ic.a(weakReference == null ? null : weakReference.get());
                }
                this.f24404h.f24800e = "NonAB";
                b();
                this.f24398b.n();
            }
        } catch (Exception e10) {
            gg.a().a(new hg(e10));
            hu.a((byte) 1, "InMobi", "Could not load ad; SDK encountered an unexpected error");
        }
    }

    public final void load(Context context) {
        if (a(true)) {
            this.f24405i = new WeakReference<>(context);
            load();
        }
    }

    @Deprecated
    public final View getPrimaryViewOfWidth(View view, ViewGroup viewGroup, int i10) {
        String str = f24397a;
        hu.a((byte) 1, str, String.format("The %s API has been deprecated and API will be removed in the subsequent versions", "getPrimaryViewOfWidth(View, ViewGroup, int)"));
        WeakReference<Context> weakReference = this.f24405i;
        if (weakReference != null && weakReference.get() != null) {
            return getPrimaryViewOfWidth(this.f24405i.get(), view, viewGroup, i10);
        }
        hu.a((byte) 1, str, "InMobiNative is not initialized or provided context is null.");
        return null;
    }
}
