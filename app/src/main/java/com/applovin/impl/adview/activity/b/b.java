package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: s  reason: collision with root package name */
    private final com.applovin.impl.adview.activity.a.b f6913s;

    /* renamed from: t  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.e f6914t;

    /* renamed from: u  reason: collision with root package name */
    private long f6915u;

    /* renamed from: v  reason: collision with root package name */
    private AtomicBoolean f6916v;

    public b(com.applovin.impl.sdk.ad.e eVar, Activity activity, m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f6913s = new com.applovin.impl.adview.activity.a.b(this.f6869a, this.f6873e, this.f6870b);
        this.f6916v = new AtomicBoolean();
    }

    private long c() {
        com.applovin.impl.sdk.ad.e eVar = this.f6869a;
        if (eVar instanceof com.applovin.impl.sdk.ad.a) {
            float l10 = ((com.applovin.impl.sdk.ad.a) eVar).l();
            if (l10 <= 0.0f) {
                l10 = (float) this.f6869a.s();
            }
            return (long) (Utils.secondsToMillisLong(l10) * (this.f6869a.R() / 100.0d));
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.f6913s.a(this.f6875g, this.f6874f, viewGroup);
        a(false);
        this.f6874f.renderAd(this.f6869a);
        a("javascript:al_onPoststitialShow();", this.f6869a.S());
        if (t()) {
            long c10 = c();
            this.f6915u = c10;
            if (c10 > 0) {
                if (v.a()) {
                    v vVar = this.f6871c;
                    vVar.b("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.f6915u + "ms...");
                }
                this.f6914t = com.applovin.impl.sdk.utils.e.a(this.f6915u, this.f6870b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (v.a()) {
                            b.this.f6871c.b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        b.this.f6916v.set(true);
                    }
                });
            }
        }
        if (this.f6875g != null) {
            if (this.f6869a.s() >= 0) {
                a(this.f6875g, this.f6869a.s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f6877i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f6875g.setVisibility(0);
            }
        }
        u();
        this.f6870b.S().a(new z(this.f6870b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                com.applovin.impl.adview.m mVar = bVar.f6875g;
                com.applovin.impl.sdk.a.b o10 = bVar.f6869a.o();
                if (mVar == null) {
                    o10.a(b.this.f6874f);
                    return;
                }
                b bVar2 = b.this;
                o10.a(bVar2.f6874f, Collections.singletonList(new com.applovin.impl.sdk.a.d(bVar2.f6875g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            }
        }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        super.b(Utils.isVideoMutedInitially(this.f6870b));
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        m();
        com.applovin.impl.sdk.utils.e eVar = this.f6914t;
        if (eVar != null) {
            eVar.a();
            this.f6914t = null;
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void m() {
        com.applovin.impl.sdk.utils.e eVar;
        boolean r10 = r();
        int i10 = 100;
        if (t()) {
            if (!r10 && (eVar = this.f6914t) != null) {
                i10 = (int) Math.min(100.0d, ((this.f6915u - eVar.b()) / this.f6915u) * 100.0d);
            }
            if (v.a()) {
                v vVar = this.f6871c;
                vVar.b("AppLovinFullscreenActivity", "Ad engaged at " + i10 + "%");
            }
        }
        super.a(i10, false, r10, -2L);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean r() {
        if (t()) {
            return this.f6916v.get();
        }
        return true;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean s() {
        return false;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void u() {
        long ae2;
        long millis;
        long j10 = 0;
        if (this.f6869a.ad() >= 0 || this.f6869a.ae() >= 0) {
            int i10 = (this.f6869a.ad() > 0L ? 1 : (this.f6869a.ad() == 0L ? 0 : -1));
            com.applovin.impl.sdk.ad.e eVar = this.f6869a;
            if (i10 >= 0) {
                ae2 = eVar.ad();
            } else {
                if (eVar.af()) {
                    int l10 = (int) ((com.applovin.impl.sdk.ad.a) this.f6869a).l();
                    if (l10 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(l10);
                    } else {
                        int s10 = (int) this.f6869a.s();
                        if (s10 > 0) {
                            millis = TimeUnit.SECONDS.toMillis(s10);
                        }
                    }
                    j10 = 0 + millis;
                }
                ae2 = (long) (j10 * (this.f6869a.ae() / 100.0d));
            }
            b(ae2);
        }
    }
}
