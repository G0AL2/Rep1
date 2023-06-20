package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a.a;
import com.applovin.impl.a.j;
import com.applovin.impl.a.k;
import com.applovin.impl.a.l;
import com.applovin.impl.a.n;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.t;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c extends e {
    private final com.applovin.impl.a.a F;
    private final Set<j> G;

    public c(com.applovin.impl.sdk.ad.e eVar, Activity activity, m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.G = hashSet;
        com.applovin.impl.a.a aVar = (com.applovin.impl.a.a) eVar;
        this.F = aVar;
        a.c cVar = a.c.VIDEO;
        hashSet.addAll(aVar.a(cVar, k.f6792a));
        a(a.c.IMPRESSION);
        a(cVar, "creativeView");
        aVar.o().d();
    }

    private void E() {
        if (!r() || this.G.isEmpty()) {
            return;
        }
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.d("AppLovinFullscreenActivity", "Firing " + this.G.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.G);
    }

    private void a(a.c cVar) {
        a(cVar, com.applovin.impl.a.f.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.a.f fVar) {
        a(cVar, "", fVar);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.a.f.UNSPECIFIED);
    }

    private void a(a.c cVar, String str, com.applovin.impl.a.f fVar) {
        a(this.F.a(cVar, str), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<j> set) {
        a(set, com.applovin.impl.a.f.UNSPECIFIED);
    }

    private void a(Set<j> set, com.applovin.impl.a.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(((e) this).f6923t.getCurrentPosition());
        n n10 = this.F.n();
        Uri a10 = n10 != null ? n10.a() : null;
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        l.a(set, seconds, a10, fVar, this.f6870b);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void a(PointF pointF) {
        a(a.c.VIDEO_CLICK);
        this.F.o().o();
        super.a(pointF);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        ((e) this).f6929z.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new j.a() { // from class: com.applovin.impl.adview.activity.b.c.1
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(((e) c.this).B - (((e) c.this).f6923t.getDuration() - ((e) c.this).f6923t.getCurrentPosition()));
                int D = c.this.D();
                HashSet hashSet = new HashSet();
                for (com.applovin.impl.a.j jVar : new HashSet(c.this.G)) {
                    if (jVar.a(seconds, D)) {
                        hashSet.add(jVar);
                        c.this.G.remove(jVar);
                    }
                }
                c.this.a(hashSet);
                if (D >= 25 && D < 50) {
                    c.this.F.o().f();
                } else if (D >= 50 && D < 75) {
                    c.this.F.o().g();
                } else if (D >= 75) {
                    c.this.F.o().h();
                }
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !c.this.D;
            }
        });
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.a aVar = ((e) this).f6924u;
        if (aVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.m mVar = ((e) this).f6925v;
        if (mVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(mVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        ProgressBar progressBar = ((e) this).f6928y;
        if (progressBar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ImageView imageView = ((e) this).f6926w;
        if (imageView != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        t tVar = ((e) this).f6927x;
        if (tVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(tVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.F.o().a(((e) this).f6922s, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void c() {
        a(a.c.VIDEO, "skip");
        this.F.o().n();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.e
    protected void c(long j10) {
        super.c(j10);
        this.F.o().a((float) TimeUnit.MILLISECONDS.toSeconds(j10), Utils.isVideoMutedInitially(this.f6870b));
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void c(String str) {
        a(a.c.ERROR, com.applovin.impl.a.f.MEDIA_FILE_ERROR);
        this.F.o().a(str);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void e() {
        ((e) this).f6929z.c();
        super.e();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        super.f();
        a(this.D ? a.c.COMPANION : a.c.VIDEO, "resume");
        this.F.o().k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        super.g();
        a(this.D ? a.c.COMPANION : a.c.VIDEO, "pause");
        this.F.o().j();
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    public void h() {
        if (this.F != null) {
            a(a.c.VIDEO, "close");
            a(a.c.COMPANION, "close");
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.e, com.applovin.impl.adview.activity.b.a
    protected void u() {
        long ae2;
        int s10;
        long j10 = 0;
        if (this.F.ad() >= 0 || this.F.ae() >= 0) {
            int i10 = (this.F.ad() > 0L ? 1 : (this.F.ad() == 0L ? 0 : -1));
            com.applovin.impl.a.a aVar = this.F;
            if (i10 >= 0) {
                ae2 = aVar.ad();
            } else {
                com.applovin.impl.a.m m10 = aVar.m();
                if (m10 == null || m10.b() <= 0) {
                    long j11 = ((e) this).B;
                    if (j11 > 0) {
                        j10 = 0 + j11;
                    }
                } else {
                    j10 = 0 + TimeUnit.SECONDS.toMillis(m10.b());
                }
                if (aVar.af() && (s10 = (int) aVar.s()) > 0) {
                    j10 += TimeUnit.SECONDS.toMillis(s10);
                }
                ae2 = (long) (j10 * (this.F.ae() / 100.0d));
            }
            b(ae2);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    protected void v() {
        super.v();
        com.applovin.impl.a.a aVar = this.F;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    protected void w() {
        super.w();
        com.applovin.impl.a.a aVar = this.F;
        if (aVar != null) {
            aVar.o().m();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void x() {
        super.x();
        a(a.c.VIDEO, ((e) this).A ? "mute" : "unmute");
        this.F.o().a(((e) this).A);
    }

    @Override // com.applovin.impl.adview.activity.b.e
    public void y() {
        E();
        if (!l.c(this.F)) {
            if (v.a()) {
                this.f6871c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            h();
        } else if (this.D) {
        } else {
            a(a.c.COMPANION, "creativeView");
            this.F.o().i();
            com.applovin.impl.sdk.a.g o10 = this.F.o();
            AppLovinAdView appLovinAdView = this.f6874f;
            o10.a(appLovinAdView, Collections.singletonList(new com.applovin.impl.sdk.a.d(appLovinAdView, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.y();
        }
    }
}
