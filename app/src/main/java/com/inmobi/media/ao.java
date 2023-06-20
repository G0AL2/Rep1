package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ad;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: NativeAdUnit.java */
/* loaded from: classes3.dex */
public final class ao extends ad {

    /* renamed from: x  reason: collision with root package name */
    public static final String f24572x = "ao";
    private int A;

    /* renamed from: y  reason: collision with root package name */
    public WeakReference<View> f24573y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f24574z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ao(Context context, ba baVar, ad.a aVar) {
        super(context, baVar, aVar);
        this.f24574z = false;
        this.A = 0;
        baVar.e();
        a(context, baVar, aVar);
    }

    private boolean aa() {
        ad.a p10 = p();
        if (x()) {
            if (p10 != null) {
                p10.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
            }
            return false;
        } else if (1 != j() && 2 != j()) {
            String str = f24572x;
            hu.a((byte) 2, str, "Fetching a Native ad for placement id: " + i().toString());
            if (4 == j()) {
                if (!q()) {
                    if (p10 != null) {
                        b(h());
                        b(p10);
                        c(p10);
                    }
                    return false;
                }
                Y();
            }
            this.f24462l = false;
            return true;
        } else {
            hu.a((byte) 1, f24572x, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return false;
        }
    }

    private void b(Context context) {
        j s10 = s();
        if (s10 instanceof n) {
            ((n) s10).a(context);
        }
    }

    @Override // com.inmobi.media.ad
    final void P() {
        this.f24473w.a(hashCode(), new ap(this));
    }

    @Override // com.inmobi.media.ad
    public final void S() {
        F();
        try {
            if (R()) {
                return;
            }
            T();
        } catch (IllegalStateException unused) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    public final void Y() {
        try {
            super.D();
        } catch (Exception e10) {
            hu.a((byte) 1, "InMobi", "Could not destroy native ad; SDK encountered unexpected error");
            gg.a().a(new hg(e10));
        }
    }

    public final boolean Z() {
        return j() == 4;
    }

    @Override // com.inmobi.media.k
    public final void a(int i10, q qVar) {
    }

    @Override // com.inmobi.media.ad
    public final void a(Context context) {
        super.a(context);
        b(context);
    }

    @Override // com.inmobi.media.k
    public final void b() {
    }

    @Override // com.inmobi.media.ad
    final void f(ad.a aVar) {
        if (j() == 4) {
            this.f24452b = (byte) 6;
        } else if (j() == 6) {
            this.A++;
        }
        hu.a((byte) 2, "InMobi", "Successfully displayed fullscreen for placement id: " + i().toString());
        if (this.A == 0) {
            if (aVar != null) {
                d(aVar);
            } else {
                hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final void g(ad.a aVar) {
        if (j() == 6) {
            int i10 = this.A;
            if (i10 > 0) {
                this.A = i10 - 1;
            } else {
                this.f24452b = (byte) 4;
            }
        }
        hu.a((byte) 2, "InMobi", "Successfully dismissed fullscreen for placement id: " + i().toString());
        if (this.A == 0 && j() == 4) {
            if (aVar != null) {
                aVar.c();
            } else {
                hu.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.ad
    public final String k() {
        return "native";
    }

    @Override // com.inmobi.media.ad
    protected final byte l() {
        return (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.inmobi.media.ad
    public final Map<String, String> m() {
        Map<String, String> m10 = super.m();
        m10.put("a-parentViewWidth", String.valueOf(ic.a().f25745a));
        m10.put("a-productVersion", "NS-1.0.0-20160411");
        m10.put("trackerType", "url_ping");
        return m10;
    }

    @Override // com.inmobi.media.ad
    public final void y() {
        if (!this.f24462l && aa()) {
            super.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.inmobi.media.ad
    public final void a(ba baVar, boolean z10) {
        super.a(baVar, z10);
        if (!z10) {
            if (i().equals(baVar)) {
                if (2 == j() || 4 == j()) {
                    this.f24452b = (byte) 0;
                    if (p() != null) {
                        p().a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                    }
                }
            }
        } else if (!i().equals(baVar) || 2 != j() || p() == null || h() == null) {
        } else {
            if (this.f24460j) {
                this.f24461k = true;
                O();
                return;
            }
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.inmobi.media.ad
    public final void b(bb bbVar) {
        if (!"html".equals(n()) && !"htmlUrl".equals(n())) {
            super.b(bbVar);
        } else {
            a(i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 57);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final void a(boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        ad.a p10;
        super.a(z10, inMobiAdRequestStatus);
        if (j() != 2 || (p10 = p()) == null) {
            return;
        }
        b(p10);
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.dr
    public final void a(au auVar, boolean z10, byte b10) {
        if (!z10) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, b10);
            return;
        }
        try {
            try {
                super.a(auVar, z10, b10);
            } catch (Exception unused) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 13);
                return;
            }
        } catch (IllegalStateException unused2) {
        }
        au u10 = u();
        if (u10 == null) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 55);
            return;
        }
        if (this.f24458h == 0) {
            if (!u10.d()) {
                l(null);
            }
        } else {
            a(u10);
        }
        if (u10.d()) {
            this.f24460j = true;
            N();
        }
    }
}
