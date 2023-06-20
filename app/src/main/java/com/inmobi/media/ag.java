package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ad;
import fm.castbox.mediation.widget.AdView;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: BannerAdUnit.java */
/* loaded from: classes3.dex */
public class ag extends ad implements Application.ActivityLifecycleCallbacks {

    /* renamed from: x  reason: collision with root package name */
    private static final String f24514x = ag.class.getSimpleName();

    /* renamed from: y  reason: collision with root package name */
    private boolean f24515y;

    /* renamed from: z  reason: collision with root package name */
    private int f24516z;

    public ag(Context context, ba baVar, ad.a aVar) {
        super(context, baVar, aVar);
        this.f24515y = false;
        this.f24516z = 0;
        baVar.e();
        a(context, baVar, aVar);
    }

    static /* synthetic */ int a(ag agVar) {
        int i10 = agVar.f24516z;
        agVar.f24516z = i10 + 1;
        return i10;
    }

    static /* synthetic */ int b(ag agVar) {
        int i10 = agVar.f24516z - 1;
        agVar.f24516z = i10;
        return i10;
    }

    @Override // com.inmobi.media.ad
    public void S() {
        F();
        try {
            if (R()) {
                return;
            }
            T();
            this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ag.1
                @Override // java.lang.Runnable
                public final void run() {
                    ag agVar = ag.this;
                    if (agVar.f24472v) {
                        agVar.f24470t = System.currentTimeMillis();
                        for (int i10 = 0; i10 < ag.this.f24466p.b().size(); i10++) {
                            ag.this.f24471u.add(Integer.valueOf(i10));
                        }
                    }
                    ag.this.a(true);
                }
            });
        } catch (IllegalStateException unused) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    public boolean Y() {
        return j() == 7;
    }

    public void Z() {
        j s10;
        dw viewableAd;
        byte j10 = j();
        if ((j10 != 4 && j10 != 6 && j10 != 7) || (s10 = s()) == null || (viewableAd = s10.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(h(), (byte) 1);
    }

    @Override // com.inmobi.media.s
    public synchronized void a_(q qVar) {
        super.a_(qVar);
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ag.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (ag.this.j() == 6) {
                        ag.a(ag.this);
                        ag.this.f24452b = (byte) 7;
                        hu.a((byte) 2, "InMobi", "Successfully displayed banner ad for placement Id : " + ag.this.i().toString());
                        ad.a p10 = ag.this.p();
                        if (p10 != null) {
                            ag.this.d(p10);
                        }
                    } else if (ag.this.j() == 7) {
                        ag.a(ag.this);
                    }
                } catch (Exception unused) {
                    hu.a((byte) 1, "InMobi", "Unable to display ad; SDK encountered an internal error");
                    String unused2 = ag.f24514x;
                }
            }
        });
    }

    public void aa() {
        j s10;
        dw viewableAd;
        byte j10 = j();
        if ((j10 != 4 && j10 != 6 && j10 != 7) || (s10 = s()) == null || (viewableAd = s10.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(h(), (byte) 0);
    }

    public void ab() {
        if (h() instanceof Activity) {
            ((Activity) h()).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public void ac() {
        Context h10 = h();
        if (h10 != null) {
            ho.a(h10, this);
        }
    }

    @Override // com.inmobi.media.k
    public void b() {
    }

    @Override // com.inmobi.media.s
    public synchronized void b_(q qVar) {
        super.b_(qVar);
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ag.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (ag.this.j() == 7 && ag.b(ag.this) == 0) {
                        ag agVar = ag.this;
                        agVar.f24452b = (byte) 6;
                        if (agVar.p() != null) {
                            ag.this.p().c();
                        }
                    }
                } catch (Exception unused) {
                    hu.a((byte) 1, "InMobi", "Unable to dismiss ad; SDK encountered an internal error");
                    String unused2 = ag.f24514x;
                }
            }
        });
    }

    public void c(String str) {
        i().a(str);
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.s
    public void f(q qVar) {
        super.f(qVar);
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ag.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (ag.this.j() == 4) {
                        ag.this.f24452b = (byte) 6;
                    }
                } catch (Exception unused) {
                    hu.a((byte) 1, "InMobi", "Unable to load ad; SDK encountered an internal error");
                    String unused2 = ag.f24514x;
                }
            }
        });
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.s
    public void g() {
        super.g();
        this.f24467q = true;
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ag.5
            @Override // java.lang.Runnable
            public final void run() {
                j s10 = ag.this.s();
                if (s10 != null) {
                    s10.destroy();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.inmobi.media.ad
    public void j(q qVar) {
        super.j(qVar);
        if (this.f24472v && this.f24454d.indexOf(qVar) > 0 && j() == 6) {
            f((byte) 2);
            this.f24454d.get(this.f24469s).a(true);
        } else if (j() == 2) {
            f((byte) 2);
            this.f24452b = (byte) 4;
            I();
            hu.a((byte) 2, "InMobi", "Successfully loaded Banner ad markup in the WebView for placement id: " + i().toString());
            ad.a p10 = p();
            if (p10 != null) {
                c(p10);
            }
            B();
            if (U()) {
                return;
            }
            f();
        }
    }

    @Override // com.inmobi.media.ad
    public String k() {
        return AdView.AdType.BANNER;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.inmobi.media.ad
    public void k(q qVar) {
        super.k(qVar);
        if (this.f24472v) {
            int indexOf = this.f24454d.indexOf(qVar);
            d(indexOf);
            if (indexOf > 0 && j() == 6) {
                f((byte) 2);
                this.f24454d.get(this.f24469s).a(false);
            }
        }
        if (j() == 2) {
            f((byte) 2);
            this.f24452b = (byte) 3;
            hu.a((byte) 2, "InMobi", "Failed to load the Banner markup in the WebView for placement id: " + i().toString());
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
        }
    }

    @Override // com.inmobi.media.ad
    protected final byte l() {
        return (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.inmobi.media.ad
    public final Map<String, String> m() {
        Map<String, String> m10 = super.m();
        m10.put("u-rt", this.f24515y ? "1" : "0");
        m10.put("mk-ad-slot", i().m());
        return m10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Context h10 = h();
        if (h10 == null || !h10.equals(activity)) {
            return;
        }
        ((Activity) h10).getApplication().unregisterActivityLifecycleCallbacks(this);
        D();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Context h10 = h();
        if (h10 == null || !h10.equals(activity)) {
            return;
        }
        aa();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Context h10 = h();
        if (h10 == null || !h10.equals(activity)) {
            return;
        }
        Z();
    }

    @Override // com.inmobi.media.ad
    public q t() {
        q t10 = super.t();
        if (i().f() && t10 != null) {
            t10.a();
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final boolean x() {
        return false;
    }

    @Override // com.inmobi.media.ad
    public void y() {
        boolean z10 = false;
        if (x()) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (byte) 39);
        } else if (1 != j() && 2 != j()) {
            if (7 == j()) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (byte) 15);
                hu.a((byte) 1, "InMobi", at.f24597a + i().e());
            } else {
                hu.a((byte) 2, "InMobi", "Fetching a Banner ad for placement id: " + i().toString());
                this.f24462l = false;
                z10 = true;
            }
        } else {
            hu.a((byte) 1, f24514x, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            b((byte) 53);
        }
        if (z10) {
            super.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final void a(boolean z10, InMobiAdRequestStatus inMobiAdRequestStatus) {
        ad.a p10;
        super.a(z10, inMobiAdRequestStatus);
        hu.a((byte) 2, "InMobi", "Banner ad fetch successful for placement id: " + i().toString());
        if (j() != 2 || (p10 = p()) == null) {
            return;
        }
        b(p10);
    }

    public void b(boolean z10) {
        if (z10) {
            hu.a((byte) 2, "InMobi", "Initiating Banner refresh for placement id: " + i().toString());
        }
        this.f24515y = z10;
        y();
    }

    @Override // com.inmobi.media.k
    public void a(int i10, q qVar) {
        if (this.f24471u.contains(Integer.valueOf(i10)) && i10 > this.f24454d.indexOf(qVar)) {
            this.f24468r = i10;
            this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ag.6
                @Override // java.lang.Runnable
                public final void run() {
                    ag.this.a(true);
                }
            });
            return;
        }
        ArrayList<q> arrayList = this.f24454d;
        arrayList.get(arrayList.indexOf(qVar)).a(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.ad
    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.a(inMobiAdRequestStatus);
        if (!this.f24472v || this.f24468r <= 0) {
            return;
        }
        this.f24454d.get(this.f24469s).a(false);
        this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ag.8
            @Override // java.lang.Runnable
            public final void run() {
                ag agVar = ag.this;
                agVar.d(agVar.f24468r);
            }
        });
    }

    @Override // com.inmobi.media.ad, com.inmobi.media.k
    public void a(final int i10, final q qVar, Context context) {
        if (!this.f24472v) {
            ArrayList<q> arrayList = this.f24454d;
            arrayList.get(arrayList.indexOf(qVar)).d(false);
        } else if (this.f24471u.contains(Integer.valueOf(i10)) && i10 > this.f24454d.indexOf(qVar) && this.f24454d.get(i10) != null && this.f24454d.get(i10).f25973w) {
            super.a(i10, qVar, context);
            this.f24459i.post(new Runnable() { // from class: com.inmobi.media.ag.7
                @Override // java.lang.Runnable
                public final void run() {
                    int indexOf = ag.this.f24454d.indexOf(qVar);
                    try {
                        ad.a p10 = ag.this.p();
                        if (p10 != null) {
                            p10.a(i10, indexOf, qVar);
                        }
                    } catch (Exception unused) {
                        ag.this.a(indexOf, false);
                        ag.this.e(indexOf);
                    }
                }
            });
        } else {
            ArrayList<q> arrayList2 = this.f24454d;
            arrayList2.get(arrayList2.indexOf(qVar)).d(false);
        }
    }
}
