package com.inmobi.media;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ad;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: UnifiedAdManager.java */
/* loaded from: classes3.dex */
public abstract class at extends ad.a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f24597a = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ";

    /* renamed from: b  reason: collision with root package name */
    public static final String f24598b = "Ad show is already called. Please wait for the the ad to be shown.";

    /* renamed from: c  reason: collision with root package name */
    public static final String f24599c = "preload() and load() cannot be called on the same instance, please use a different instance.";

    /* renamed from: d  reason: collision with root package name */
    public static final String f24600d = "Please make an ad request first in order to start loading the ad.";

    /* renamed from: e  reason: collision with root package name */
    public static final String f24601e = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ";

    /* renamed from: k  reason: collision with root package name */
    private static final String f24602k = "at";

    /* renamed from: h  reason: collision with root package name */
    PublisherCallbacks f24605h;

    /* renamed from: j  reason: collision with root package name */
    AdMetaInfo f24607j;

    /* renamed from: f  reason: collision with root package name */
    byte f24603f = 0;

    /* renamed from: g  reason: collision with root package name */
    Boolean f24604g = null;

    /* renamed from: i  reason: collision with root package name */
    final Handler f24606i = new Handler(Looper.getMainLooper());

    public String C() {
        AdMetaInfo adMetaInfo = this.f24607j;
        return adMetaInfo == null ? "" : adMetaInfo.getCreativeID();
    }

    public JSONObject D() {
        AdMetaInfo adMetaInfo = this.f24607j;
        return adMetaInfo == null ? new JSONObject() : adMetaInfo.getBidInfo();
    }

    @Override // com.inmobi.media.ad.a
    public void a(AdMetaInfo adMetaInfo) {
        this.f24603f = (byte) 7;
    }

    @Override // com.inmobi.media.ad.a
    public final void b() {
        byte b10 = this.f24603f;
        if (b10 == 4 || b10 == 5) {
            return;
        }
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.4
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdWillDisplay();
                }
            }
        });
        this.f24603f = (byte) 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final ad adVar, final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f24603f = (byte) 3;
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.1
            @Override // java.lang.Runnable
            public final void run() {
                ad adVar2 = adVar;
                if (adVar2 != null) {
                    adVar2.f((byte) 1);
                }
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    @Override // com.inmobi.media.ad.a
    public void d() {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.7
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onUserLeftApplication();
                }
            }
        });
    }

    public abstract ad m();

    @Override // com.inmobi.media.ad.a
    public void a(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f24603f = (byte) 3;
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.3
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    @Override // com.inmobi.media.ad.a
    public void c(final AdMetaInfo adMetaInfo) {
        if (this.f24603f != 5) {
            this.f24607j = adMetaInfo;
            this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.5
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherCallbacks publisherCallbacks = at.this.f24605h;
                    if (publisherCallbacks != null) {
                        publisherCallbacks.onAdDisplayed(adMetaInfo);
                    }
                }
            });
            this.f24603f = (byte) 5;
        }
    }

    @Override // com.inmobi.media.ad.a
    public void a(ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (c(inMobiAdRequestStatus) && a(adVar)) {
            adVar.b(inMobiAdRequestStatus);
        } else {
            c(adVar, inMobiAdRequestStatus);
        }
    }

    public void b(PublisherCallbacks publisherCallbacks) {
        ad m10 = m();
        if (m10 != null) {
            this.f24605h = publisherCallbacks;
            m10.z();
        }
    }

    @Override // com.inmobi.media.ad.a
    public void a(final Map<Object, Object> map) {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.6
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdClicked(map);
                }
            }
        });
    }

    void b(ad adVar, boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z10) {
            return;
        }
        c(adVar, inMobiAdRequestStatus);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(InMobiAdRequestStatus inMobiAdRequestStatus) {
        return inMobiAdRequestStatus == null || InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR == inMobiAdRequestStatus.getStatusCode() || InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE == inMobiAdRequestStatus.getStatusCode();
    }

    @Override // com.inmobi.media.ad.a
    public final void a(ad adVar, boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z10) {
            adVar.S();
        } else {
            adVar.D();
        }
        b(adVar, z10, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.ad.a
    public void b(AdMetaInfo adMetaInfo) {
        this.f24607j = adMetaInfo;
        ad m10 = m();
        if (m10 != null) {
            m10.f((byte) 1);
        }
    }

    @Override // com.inmobi.media.ad.a
    public void c() {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.2
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdDismissed();
                }
            }
        });
    }

    public void a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        Boolean bool = this.f24604g;
        if (bool != null && bool.booleanValue()) {
            hu.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            return;
        }
        this.f24604g = Boolean.FALSE;
        this.f24603f = (byte) 1;
        ad m10 = m();
        if (m10 != null) {
            this.f24605h = publisherCallbacks;
            m10.a(bArr);
        }
    }

    @Override // com.inmobi.media.ad.a
    public void b(ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        c(adVar, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.ad.a
    public void b(final Map<Object, Object> map) {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.8
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onRewardsUnlocked(map);
                }
            }
        });
    }

    @Override // com.inmobi.media.ad.a
    public void b(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.10
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
                }
            }
        });
    }

    @Override // com.inmobi.media.ad.a
    public void a(final byte[] bArr) {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.at.9
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = at.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onRequestPayloadCreated(bArr);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SwitchIntDef"})
    public boolean a(String str, String str2, PublisherCallbacks publisherCallbacks) {
        ad m10 = m();
        PublisherCallbacks publisherCallbacks2 = this.f24605h;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            hu.a((byte) 1, f24602k, f24599c);
            if (m10 != null) {
                m10.b((byte) 54);
            }
            return false;
        }
        byte b10 = this.f24603f;
        if (b10 != 1) {
            if (b10 == 5) {
                hu.a((byte) 1, str, f24597a.concat(String.valueOf(str2)));
                c(m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                if (m10 != null) {
                    m10.a((byte) 15);
                }
                return false;
            } else if (b10 != 8) {
                return true;
            }
        }
        hu.a((byte) 1, str, f24601e.concat(String.valueOf(str2)));
        if (m10 != null) {
            m10.b((byte) 53);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str, String str2) throws IllegalStateException {
        ad m10 = m();
        byte b10 = this.f24603f;
        if (b10 != 1) {
            if (b10 == 5) {
                hu.a((byte) 1, str, f24597a.concat(String.valueOf(str2)));
                if (m10 != null) {
                    m10.a((byte) 15);
                }
                c(m10, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                return false;
            } else if (b10 == 7) {
                return true;
            } else {
                if (b10 != 8) {
                    throw new IllegalStateException(f24600d);
                }
            }
        }
        hu.a((byte) 1, str, f24601e.concat(String.valueOf(str2)));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ad adVar) {
        return (adVar == null || adVar.f24472v) ? false : true;
    }
}
