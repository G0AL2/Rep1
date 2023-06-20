package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ba;

/* compiled from: InterstitialUnifiedAdManager.java */
/* loaded from: classes3.dex */
public class am extends at {

    /* renamed from: k  reason: collision with root package name */
    private static final String f24557k = "am";

    /* renamed from: l  reason: collision with root package name */
    private static final String f24558l = "InMobi";

    /* renamed from: m  reason: collision with root package name */
    private al f24559m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f24560n;

    private void d(final AdMetaInfo adMetaInfo) {
        super.b(adMetaInfo);
        this.f24603f = (byte) 2;
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.am.1
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = am.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    @SuppressLint({"SwitchIntDef"})
    private boolean p() {
        byte b10 = this.f24603f;
        if (b10 != 1) {
            if (b10 == 5) {
                if (this.f24559m != null) {
                    hu.a((byte) 1, f24558l, at.f24597a + this.f24559m.i().toString());
                    a(false, (byte) 15);
                }
                return false;
            } else if (b10 != 7) {
                if (this.f24560n) {
                    al alVar = this.f24559m;
                    if (alVar != null) {
                        alVar.c(89);
                    }
                    hu.a((byte) 1, f24558l, at.f24598b);
                    return false;
                }
                return true;
            }
        }
        hu.a((byte) 1, f24558l, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        al alVar = this.f24559m;
        if (alVar != null) {
            alVar.f((byte) 4);
        }
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public final void b(AdMetaInfo adMetaInfo) {
        al alVar = this.f24559m;
        if (alVar == null) {
            d(null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        try {
            if (a(alVar, true) && !this.f24560n) {
                d(adMetaInfo);
                return;
            }
            this.f24559m.K();
            this.f24559m.h(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public final void c() {
        al alVar = this.f24559m;
        if (alVar == null || alVar.V()) {
            return;
        }
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.am.4
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = am.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdDismissed();
                }
            }
        });
        this.f24559m.D();
        this.f24603f = (byte) 0;
        this.f24604g = null;
        this.f24559m.W();
    }

    @Override // com.inmobi.media.ad.a
    public void i() {
        ad m10 = m();
        if (m10 != null) {
            if (m10.j() != 6 && m10.j() != 7) {
                a(true, (byte) 45);
                return;
            }
            al alVar = this.f24559m;
            if (alVar != null) {
                alVar.W();
            }
            m10.g(this);
        }
    }

    @Override // com.inmobi.media.ad.a
    public void j() {
        al alVar = this.f24559m;
        if (alVar != null) {
            alVar.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public void l() throws IllegalStateException {
        al alVar = this.f24559m;
        if (alVar != null) {
            if (!alVar.Y() || this.f24607j == null) {
                if (this.f24560n) {
                    this.f24559m.a((byte) 89);
                    hu.a((byte) 1, f24558l, at.f24598b);
                    return;
                }
                au u10 = this.f24559m.u();
                boolean a10 = a(f24558l, this.f24559m.i().toString());
                if (u10 == null || this.f24607j == null || !a10) {
                    return;
                }
                if (u10.k()) {
                    this.f24603f = (byte) 8;
                    if (this.f24559m.e((byte) 1)) {
                        this.f24559m.S();
                        return;
                    }
                    return;
                }
            }
            d(this.f24607j);
            return;
        }
        throw new IllegalStateException(at.f24600d);
    }

    @Override // com.inmobi.media.at
    public ad m() {
        return this.f24559m;
    }

    public boolean n() {
        al alVar = this.f24559m;
        if (alVar != null && 2 == this.f24603f) {
            try {
                if (a(alVar, false)) {
                    return this.f24559m.Y();
                }
                return true;
            } catch (IllegalStateException unused) {
                return false;
            }
        }
        return false;
    }

    public void o() {
        this.f24559m.K();
        if (p()) {
            if (!ie.h()) {
                al alVar = this.f24559m;
                if (alVar != null) {
                    alVar.c(21);
                    d(this.f24559m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED));
                    this.f24559m.D();
                    return;
                }
                return;
            }
            al alVar2 = this.f24559m;
            if (alVar2 == null || !alVar2.e((byte) 4)) {
                return;
            }
            this.f24560n = true;
            try {
                if (a(this.f24559m, true)) {
                    this.f24559m.h(this);
                } else {
                    this.f24559m.S();
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    private void a(boolean z10, byte b10) {
        al alVar = this.f24559m;
        if (alVar != null && b10 != 0) {
            alVar.c((int) b10);
        }
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.am.2
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = am.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdDisplayFailed();
                }
                am.this.q();
            }
        });
        if (z10) {
            this.f24603f = (byte) 6;
            al alVar2 = this.f24559m;
            if (alVar2 != null) {
                alVar2.D();
            }
        }
    }

    @SuppressLint({"SwitchIntDef"})
    private void d(ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        byte b10 = this.f24603f;
        if (b10 != 1) {
            if (b10 == 2) {
                hu.a((byte) 1, f24558l, "Unable to Show Ad, canShowAd Failed");
                a(true, (byte) 0);
                return;
            } else if (b10 == 5) {
                hu.a((byte) 1, f24558l, "Ad will be dismissed, Internal error");
                al alVar = this.f24559m;
                if (alVar != null) {
                    alVar.W();
                }
                q();
                c();
                return;
            } else if (b10 != 8) {
                return;
            }
        }
        c(adVar, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.at
    @SuppressLint({"SwitchIntDef"})
    void b(ad adVar, boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (z10) {
            return;
        }
        d(adVar, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public void c(AdMetaInfo adMetaInfo) {
        super.c(adMetaInfo);
        ad m10 = m();
        if (m10 != null) {
            m10.L();
        }
        this.f24560n = false;
    }

    public void a(bm bmVar, Context context) {
        if (this.f24559m == null) {
            this.f24559m = new al(context, new ba.a("int", f24558l).a(bmVar.f24796a).c(bmVar.f24797b).a(bmVar.f24798c).d(bmVar.f24800e).e(bmVar.f24801f).a(), this);
        }
        if (!TextUtils.isEmpty(bmVar.f24800e)) {
            this.f24559m.J();
        }
        this.f24559m.a(context);
        this.f24559m.a(bmVar.f24798c);
        this.f24559m.b("activity");
        if (bmVar.f24799d) {
            this.f24559m.Z();
        }
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public void a(final AdMetaInfo adMetaInfo) {
        this.f24607j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        if (this.f24559m == null) {
            a((ad) null, inMobiAdRequestStatus);
            return;
        }
        super.a(adMetaInfo);
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.am.3
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = am.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
                }
            }
        });
    }

    @Override // com.inmobi.media.ad.a
    public final void a() {
        al alVar = this.f24559m;
        if (alVar != null) {
            alVar.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public void a(PublisherCallbacks publisherCallbacks) {
        Boolean bool = this.f24604g;
        if (bool != null && !bool.booleanValue()) {
            this.f24559m.b((byte) 52);
            hu.a((byte) 1, f24558l, "Cannot call load() API after calling load(byte[])");
        } else if (this.f24560n) {
            this.f24559m.b((byte) 89);
            hu.a((byte) 1, f24558l, at.f24598b);
        } else {
            this.f24604g = Boolean.TRUE;
            al alVar = this.f24559m;
            if (alVar == null || !a(f24558l, alVar.i().toString(), publisherCallbacks)) {
                return;
            }
            this.f24603f = (byte) 1;
            this.f24605h = publisherCallbacks;
            String str = f24557k;
            hu.a((byte) 2, str, "Fetching an Interstitial ad for placement id: " + this.f24559m.i().toString());
            this.f24559m.a(this);
            this.f24559m.y();
        }
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public final void a(ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (inMobiAdRequestStatus != null && InMobiAdRequestStatus.StatusCode.AD_ACTIVE.equals(inMobiAdRequestStatus.getStatusCode())) {
            c(adVar, inMobiAdRequestStatus);
        } else {
            super.a(adVar, inMobiAdRequestStatus);
        }
    }

    private boolean a(al alVar, boolean z10) throws IllegalStateException {
        bb bbVar = alVar.f24466p;
        if ((bbVar == null ? null : bbVar.l()) == null) {
            if (z10) {
                d(alVar, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            throw new IllegalStateException("AdUnit doesn't have a current ad");
        }
        return bbVar.j();
    }
}
