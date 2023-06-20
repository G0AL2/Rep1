package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.ba;
import org.json.JSONObject;

/* compiled from: NativeUnifiedAdManager.java */
/* loaded from: classes3.dex */
public class aq extends at {

    /* renamed from: k  reason: collision with root package name */
    private static final String f24578k = "aq";

    /* renamed from: l  reason: collision with root package name */
    private static final String f24579l = "InMobi";

    /* renamed from: m  reason: collision with root package name */
    private ao f24580m;

    public aq(PublisherCallbacks publisherCallbacks) {
        this.f24605h = publisherCallbacks;
    }

    public Boolean A() {
        j s10;
        ao aoVar = this.f24580m;
        if (aoVar == null || (s10 = aoVar.s()) == null) {
            return null;
        }
        return Boolean.valueOf(s10 instanceof o);
    }

    public void B() {
        j s10;
        n nVar;
        bx h10;
        ao aoVar = this.f24580m;
        if (aoVar == null || (s10 = aoVar.s()) == null || (h10 = (nVar = (n) s10).h()) == null) {
            return;
        }
        nVar.a((View) null, h10.f24857i.f24871c);
        nVar.a(h10.f24857i.f24871c, true);
    }

    @Override // com.inmobi.media.ad.a
    public void a() {
    }

    public void a(bm bmVar, Context context) {
        ao aoVar = this.f24580m;
        if (aoVar == null) {
            this.f24580m = new ao(context, new ba.a("native", f24579l).a(bmVar.f24796a).b(d.a(context)).c(bmVar.f24797b).a(bmVar.f24798c).a(bmVar.f24799d).d(bmVar.f24800e).e(bmVar.f24801f).a(), this);
        } else {
            aoVar.a(context);
            this.f24580m.b(d.a(context));
        }
        if (TextUtils.isEmpty(bmVar.f24800e)) {
            this.f24580m.J();
        }
        this.f24580m.a(bmVar.f24798c);
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public void b(final AdMetaInfo adMetaInfo) {
        super.b(adMetaInfo);
        this.f24603f = (byte) 2;
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.aq.2
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = aq.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    @Override // com.inmobi.media.ad.a
    public void e() {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.aq.3
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = aq.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAdImpressed();
                }
            }
        });
    }

    @Override // com.inmobi.media.ad.a
    public void f() {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.aq.5
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = aq.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onVideoCompleted();
                }
            }
        });
    }

    @Override // com.inmobi.media.ad.a
    public void h() {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.aq.4
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = aq.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onVideoSkipped();
                }
            }
        });
    }

    public boolean l() {
        ao aoVar = this.f24580m;
        return aoVar != null && aoVar.Z();
    }

    @Override // com.inmobi.media.at
    public ad m() {
        return this.f24580m;
    }

    public void n() {
        Boolean bool = this.f24604g;
        if (bool != null && !bool.booleanValue()) {
            hu.a((byte) 1, f24579l, "Cannot call load() API after calling load(byte[])");
            return;
        }
        this.f24604g = Boolean.TRUE;
        ao aoVar = this.f24580m;
        if (aoVar == null || !a(f24579l, aoVar.i().toString(), this.f24605h)) {
            return;
        }
        this.f24603f = (byte) 1;
        this.f24580m.y();
    }

    public void o() {
        ao aoVar = this.f24580m;
        if (aoVar != null) {
            aoVar.Y();
        }
        this.f24580m = null;
    }

    public void p() {
        ao aoVar = this.f24580m;
        if (aoVar != null) {
            n nVar = aoVar.f24457g;
            if (nVar != null) {
                nVar.r();
                return;
            }
            return;
        }
        hu.a((byte) 1, f24578k, "InMobiNative is not initialized. Ignoring takeAction");
    }

    public void q() {
        j s10;
        ao aoVar = this.f24580m;
        if (aoVar == null || aoVar.j() != 4 || (aoVar.h() instanceof Activity) || (s10 = aoVar.s()) == null) {
            return;
        }
        ((n) s10).q();
    }

    public void r() {
        j s10;
        ao aoVar = this.f24580m;
        if (aoVar == null || aoVar.j() != 4 || (aoVar.h() instanceof Activity) || (s10 = aoVar.s()) == null) {
            return;
        }
        ((n) s10).p();
    }

    public JSONObject s() {
        bx bxVar;
        ao aoVar = this.f24580m;
        if (aoVar == null) {
            return new JSONObject();
        }
        j s10 = aoVar.s();
        if (s10 == null || (bxVar = (bx) s10.getDataModel()) == null) {
            return null;
        }
        return bxVar.f24857i.f24869a;
    }

    public String t() {
        j s10;
        bx bxVar;
        ao aoVar = this.f24580m;
        if (aoVar == null || (s10 = aoVar.s()) == null || (bxVar = (bx) s10.getDataModel()) == null) {
            return null;
        }
        return bxVar.f24857i.f24870b.f24873a;
    }

    public String u() {
        j s10;
        bx bxVar;
        ao aoVar = this.f24580m;
        if (aoVar == null || (s10 = aoVar.s()) == null || (bxVar = (bx) s10.getDataModel()) == null) {
            return null;
        }
        return bxVar.f24857i.f24870b.f24874b;
    }

    public String v() {
        j s10;
        bx bxVar;
        ao aoVar = this.f24580m;
        if (aoVar == null || (s10 = aoVar.s()) == null || (bxVar = (bx) s10.getDataModel()) == null) {
            return null;
        }
        return bxVar.f24857i.f24870b.f24875c;
    }

    public String w() {
        j s10;
        bx bxVar;
        ao aoVar = this.f24580m;
        if (aoVar == null || (s10 = aoVar.s()) == null || (bxVar = (bx) s10.getDataModel()) == null) {
            return null;
        }
        return bxVar.f24857i.f24870b.f24878f;
    }

    public String x() {
        j s10;
        bx bxVar;
        ao aoVar = this.f24580m;
        if (aoVar == null || (s10 = aoVar.s()) == null || (bxVar = (bx) s10.getDataModel()) == null) {
            return null;
        }
        return bxVar.f24857i.f24870b.f24876d;
    }

    public float y() {
        j s10;
        bx bxVar;
        ao aoVar = this.f24580m;
        if (aoVar == null || (s10 = aoVar.s()) == null || (bxVar = (bx) s10.getDataModel()) == null) {
            return 0.0f;
        }
        return bxVar.f24857i.f24870b.f24877e;
    }

    public boolean z() {
        bx bxVar;
        ao aoVar = this.f24580m;
        if (aoVar != null) {
            j s10 = aoVar.s();
            if ((s10 == null || (bxVar = (bx) s10.getDataModel()) == null) ? false : bxVar.f24857i.f24870b.f24879g) {
                return true;
            }
        }
        return false;
    }

    public void b(bm bmVar, Context context) {
        if (this.f24580m == null) {
            a(bmVar, context);
        }
        ao aoVar = this.f24580m;
        if (aoVar != null) {
            aoVar.f24574z = true;
        }
    }

    @Override // com.inmobi.media.at, com.inmobi.media.ad.a
    public void a(final AdMetaInfo adMetaInfo) {
        this.f24607j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        ao aoVar = this.f24580m;
        if (aoVar == null) {
            a((ad) null, inMobiAdRequestStatus);
        } else if (aoVar.u() == null) {
            a((ad) null, inMobiAdRequestStatus);
        } else {
            super.a(adMetaInfo);
            this.f24606i.post(new Runnable() { // from class: com.inmobi.media.aq.1
                @Override // java.lang.Runnable
                public final void run() {
                    PublisherCallbacks publisherCallbacks = aq.this.f24605h;
                    if (publisherCallbacks != null) {
                        publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
                    }
                }
            });
            if (l() || !this.f24580m.e((byte) 1)) {
                return;
            }
            this.f24580m.S();
        }
    }

    @Override // com.inmobi.media.ad.a
    public void a(final boolean z10) {
        this.f24606i.post(new Runnable() { // from class: com.inmobi.media.aq.6
            @Override // java.lang.Runnable
            public final void run() {
                PublisherCallbacks publisherCallbacks = aq.this.f24605h;
                if (publisherCallbacks != null) {
                    publisherCallbacks.onAudioStateChanged(z10);
                }
            }
        });
    }
}
