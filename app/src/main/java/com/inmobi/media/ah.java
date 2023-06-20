package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ba;
import fm.castbox.mediation.widget.AdView;
import java.util.Map;

/* compiled from: BannerUnifiedAdManager.java */
/* loaded from: classes3.dex */
public class ah extends at {

    /* renamed from: k  reason: collision with root package name */
    private static final String f24527k = "ah";

    /* renamed from: l  reason: collision with root package name */
    private static final String f24528l = "InMobi";

    /* renamed from: m  reason: collision with root package name */
    private ag f24529m;

    /* renamed from: n  reason: collision with root package name */
    private ag f24530n;

    /* renamed from: o  reason: collision with root package name */
    private ag f24531o;

    /* renamed from: p  reason: collision with root package name */
    private ag f24532p;

    private boolean y() {
        ag agVar = this.f24531o;
        if (agVar != null) {
            return agVar.j() == 4 || this.f24531o.j() == 7 || this.f24531o.j() == 6;
        }
        return false;
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public void b(final AdMetaInfo adMetaInfo) {
        super.b(adMetaInfo);
        this.f24603f = (byte) 0;
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.ah.2
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = ah.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public void c() {
        this.f24603f = (byte) 0;
        super.c();
    }

    @Override // com.inmobi.media.ad.a
    public void j() {
        ad m10 = m();
        if (m10 != null) {
            m10.b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    public boolean l() {
        ag agVar;
        ag agVar2 = this.f24532p;
        return (agVar2 == null || agVar2.j() == 4 || this.f24532p.j() == 1 || this.f24532p.j() == 2 || ((agVar = this.f24531o) != null && agVar.j() == 7)) ? false : true;
    }

    @Override // com.inmobi.media.at
    public ad m() {
        if (y()) {
            return this.f24531o;
        }
        return this.f24532p;
    }

    public void n() throws IllegalStateException {
        ag agVar = this.f24532p;
        if (agVar != null) {
            if (a(f24528l, agVar.i().toString())) {
                this.f24603f = (byte) 8;
                if (this.f24532p.e((byte) 1)) {
                    this.f24532p.S();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(at.f24600d);
    }

    public void o() {
        ag agVar = this.f24532p;
        if (agVar != null) {
            agVar.z();
        }
    }

    public void p() {
        ag agVar = this.f24531o;
        if (agVar == null) {
            this.f24531o = this.f24529m;
            this.f24532p = this.f24530n;
        } else if (agVar.equals(this.f24529m)) {
            this.f24531o = this.f24530n;
            this.f24532p = this.f24529m;
        } else if (this.f24531o.equals(this.f24530n)) {
            this.f24531o = this.f24529m;
            this.f24532p = this.f24530n;
        }
    }

    public void q() {
        ag agVar = this.f24531o;
        if (agVar != null) {
            agVar.aa();
        }
    }

    public void r() {
        ag agVar = this.f24531o;
        if (agVar != null) {
            agVar.Z();
        }
    }

    public int s() {
        ad m10 = m();
        if (m10 != null) {
            return m10.o().defaultRefreshInterval;
        }
        return -1;
    }

    public boolean t() {
        ag agVar = this.f24531o;
        return agVar != null && agVar.Y();
    }

    public void u() {
        ag agVar = this.f24529m;
        if (agVar != null) {
            agVar.ab();
        }
        ag agVar2 = this.f24530n;
        if (agVar2 != null) {
            agVar2.ab();
        }
    }

    public void v() {
        ag agVar = this.f24529m;
        if (agVar != null) {
            agVar.ac();
        }
        ag agVar2 = this.f24530n;
        if (agVar2 != null) {
            agVar2.ac();
        }
    }

    public void w() {
        u();
        ag agVar = this.f24529m;
        if (agVar != null) {
            agVar.D();
            this.f24529m = null;
        }
        ag agVar2 = this.f24530n;
        if (agVar2 != null) {
            agVar2.D();
            this.f24530n = null;
        }
        this.f24531o = null;
        this.f24532p = null;
        this.f24604g = null;
    }

    public void x() {
        ad m10 = m();
        if (m10 != null) {
            m10.J();
        }
    }

    public void a(Context context, bm bmVar, String str) {
        ba a10 = new ba.a(AdView.AdType.BANNER, f24528l).b(d.a(context)).a(bmVar.f24796a).c(bmVar.f24797b).a(bmVar.f24798c).a(str).a(bmVar.f24799d).d(bmVar.f24800e).e(bmVar.f24801f).a();
        ag agVar = this.f24529m;
        if (agVar != null && this.f24530n != null) {
            agVar.a(context, a10, this);
            this.f24530n.a(context, a10, this);
            return;
        }
        this.f24529m = new ag(context, a10, this);
        this.f24530n = new ag(context, a10, this);
        this.f24532p = this.f24529m;
    }

    protected void c(RelativeLayout relativeLayout) {
        q qVar;
        ag agVar = this.f24531o;
        if (agVar == null || (qVar = (q) agVar.s()) == null) {
            return;
        }
        dw viewableAd = qVar.getViewableAd();
        if (this.f24531o.i().f()) {
            qVar.a();
        }
        View c10 = viewableAd.c();
        viewableAd.a((Map<View, FriendlyObstructionPurpose>) null);
        ViewGroup viewGroup = (ViewGroup) qVar.getParent();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            relativeLayout.addView(c10, layoutParams);
            return;
        }
        viewGroup.removeAllViews();
        viewGroup.addView(c10, layoutParams);
    }

    public boolean b(RelativeLayout relativeLayout) {
        if (this.f24531o == null) {
            return true;
        }
        ag agVar = this.f24532p;
        if ((agVar == null || agVar.j() != 4) && this.f24531o.V()) {
            c(relativeLayout);
            this.f24531o.W();
            return false;
        }
        return true;
    }

    @Override // com.inmobi.media.at
    public void b(ad adVar, boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (2 == this.f24603f || z10) {
            return;
        }
        adVar.W();
        c(adVar, inMobiAdRequestStatus);
    }

    public void b(byte b10) {
        ad m10 = m();
        if (m10 != null) {
            m10.a(b10);
        }
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public final void a(final AdMetaInfo adMetaInfo) {
        this.f24607j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        ag agVar = this.f24532p;
        if (agVar == null) {
            a((ad) null, inMobiAdRequestStatus);
        } else if (agVar.u() == null) {
            a((ad) null, inMobiAdRequestStatus);
        } else {
            super.a(adMetaInfo);
            this.f24606i.post(new Runnable() { // from class: com.inmobi.media.ah.1
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherCallbacks publisherCallbacks = ah.this.f24605h;
                    if (publisherCallbacks != null) {
                        publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
                    }
                }
            });
        }
    }

    @Override // com.inmobi.media.ad.a
    public void a(int i10, final int i11, q qVar) {
        super.a(i10, i11, qVar);
        try {
            if (this.f24531o == null) {
                return;
            }
            InMobiBanner inMobiBanner = (InMobiBanner) qVar.getParent();
            if (inMobiBanner != null) {
                this.f24531o.a(i11, true);
                c(inMobiBanner);
                this.f24606i.post(new Runnable() { // from class: com.inmobi.media.ah.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ah.this.f24531o != null) {
                            ah.this.f24531o.d(i11);
                        }
                    }
                });
                return;
            }
            this.f24531o.e(i11);
            this.f24531o.a(i11, false);
        } catch (Exception unused) {
            this.f24531o.e(i11);
            this.f24531o.a(i11, false);
        }
    }

    public void a(PublisherCallbacks publisherCallbacks, String str, boolean z10) {
        Boolean bool = this.f24604g;
        if (bool != null && !bool.booleanValue()) {
            ag agVar = this.f24532p;
            if (agVar != null) {
                agVar.b((byte) 52);
            }
            hu.a((byte) 1, f24528l, "Cannot call load() API after calling load(byte[])");
            return;
        }
        this.f24604g = Boolean.TRUE;
        ag agVar2 = this.f24532p;
        if (agVar2 == null || !a(f24528l, agVar2.i().toString(), publisherCallbacks)) {
            return;
        }
        this.f24603f = (byte) 1;
        this.f24607j = null;
        this.f24605h = publisherCallbacks;
        this.f24532p.c(str);
        this.f24532p.b(z10);
    }

    @Override // com.inmobi.media.at
    public void a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        Boolean bool = this.f24604g;
        if (bool != null && bool.booleanValue()) {
            hu.a((byte) 1, f24528l, "Cannot call load(byte[]) API after load() API is called");
            return;
        }
        this.f24604g = Boolean.FALSE;
        this.f24603f = (byte) 1;
        if (this.f24532p != null) {
            ag agVar = this.f24531o;
            if (agVar == null || !agVar.A()) {
                this.f24605h = publisherCallbacks;
                ag agVar2 = this.f24532p;
                agVar2.f24462l = false;
                agVar2.a(bArr);
            }
        }
    }

    public void a(RelativeLayout relativeLayout) {
        q qVar;
        ag agVar = this.f24531o;
        if (agVar == null || (qVar = (q) agVar.s()) == null) {
            return;
        }
        dw viewableAd = qVar.getViewableAd();
        if (this.f24531o.i().f()) {
            qVar.a();
        }
        ViewGroup viewGroup = (ViewGroup) qVar.getParent();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View c10 = viewableAd.c();
        viewableAd.a((Map<View, FriendlyObstructionPurpose>) null);
        ag agVar2 = this.f24532p;
        if (agVar2 != null) {
            agVar2.Z();
        }
        if (viewGroup == null) {
            relativeLayout.addView(c10, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(c10, layoutParams);
        }
        this.f24532p.D();
    }

    public int a(int i10, int i11) {
        ag agVar = this.f24532p;
        return agVar != null ? i10 < agVar.o().minimumRefreshInterval ? this.f24532p.o().minimumRefreshInterval : i10 : i11;
    }

    public boolean a(long j10) {
        ag agVar = this.f24532p;
        if (agVar == null) {
            return false;
        }
        int i10 = agVar.o().minimumRefreshInterval;
        if (SystemClock.elapsedRealtime() - j10 < i10 * 1000) {
            a((byte) 16);
            ag agVar2 = this.f24532p;
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST);
            c(agVar2, inMobiAdRequestStatus.setCustomMessage("Ad cannot be refreshed before " + i10 + " seconds"));
            String str = f24527k;
            hu.a((byte) 1, str, "Ad cannot be refreshed before " + i10 + " seconds (AdPlacement Id = " + this.f24532p.i().toString() + ")");
            return false;
        }
        return true;
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public final void a(ad adVar, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (c(inMobiAdRequestStatus) && a(adVar)) {
            ag agVar = this.f24531o;
            if (agVar != null && agVar.equals(adVar)) {
                this.f24531o.f24467q = true;
            }
            adVar.b(inMobiAdRequestStatus);
            return;
        }
        c(adVar, inMobiAdRequestStatus);
    }

    public void a(byte b10) {
        ad m10 = m();
        if (m10 != null) {
            m10.b(b10);
        }
    }
}
