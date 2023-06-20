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
public class d extends f {
    private final com.applovin.impl.a.a C;
    private final Set<j> D;

    public d(com.applovin.impl.sdk.ad.e eVar, Activity activity, m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.D = hashSet;
        com.applovin.impl.a.a aVar = (com.applovin.impl.a.a) eVar;
        this.C = aVar;
        a.c cVar = a.c.VIDEO;
        hashSet.addAll(aVar.a(cVar, k.f6792a));
        a(a.c.IMPRESSION);
        a(cVar, "creativeView");
        aVar.o().d();
    }

    private void A() {
        if (!r() || this.D.isEmpty()) {
            return;
        }
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.d("AppLovinFullscreenActivity", "Firing " + this.D.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.D);
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
        a(this.C.a(cVar, str), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<j> set) {
        a(set, com.applovin.impl.a.f.UNSPECIFIED);
    }

    private void a(Set<j> set, com.applovin.impl.a.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(((f) this).f6944s.getCurrentPosition());
        n n10 = this.C.n();
        Uri a10 = n10 != null ? n10.a() : null;
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        l.a(set, seconds, a10, fVar, this.f6870b);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void a(PointF pointF) {
        a(a.c.VIDEO_CLICK);
        this.C.o().o();
        super.a(pointF);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        ((f) this).f6950y.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new j.a() { // from class: com.applovin.impl.adview.activity.b.d.1
            @Override // com.applovin.impl.adview.j.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(((f) d.this).A - (((f) d.this).f6944s.getDuration() - ((f) d.this).f6944s.getCurrentPosition()));
                int z10 = d.this.z();
                HashSet hashSet = new HashSet();
                for (com.applovin.impl.a.j jVar : new HashSet(d.this.D)) {
                    if (jVar.a(seconds, z10)) {
                        hashSet.add(jVar);
                        d.this.D.remove(jVar);
                    }
                }
                d.this.a(hashSet);
                if (z10 >= 25 && z10 < 50) {
                    d.this.C.o().f();
                } else if (z10 >= 50 && z10 < 75) {
                    d.this.C.o().g();
                } else if (z10 >= 75) {
                    d.this.C.o().h();
                }
            }

            @Override // com.applovin.impl.adview.j.a
            public boolean b() {
                return !((f) d.this).B;
            }
        });
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.a aVar = ((f) this).f6945t;
        if (aVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.m mVar = ((f) this).f6946u;
        if (mVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(mVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        ProgressBar progressBar = ((f) this).f6949x;
        if (progressBar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ImageView imageView = ((f) this).f6947v;
        if (imageView != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        t tVar = ((f) this).f6948w;
        if (tVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(tVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.C.o().a(((f) this).f6944s, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c() {
        a(a.c.VIDEO, "skip");
        this.C.o().n();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.f
    protected void c(long j10) {
        super.c(j10);
        this.C.o().a((float) TimeUnit.MILLISECONDS.toSeconds(j10), Utils.isVideoMutedInitially(this.f6870b));
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c(String str) {
        a(a.c.ERROR, com.applovin.impl.a.f.MEDIA_FILE_ERROR);
        this.C.o().a(str);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void e() {
        ((f) this).f6950y.c();
        super.e();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        super.f();
        a(((f) this).B ? a.c.COMPANION : a.c.VIDEO, "resume");
        this.C.o().k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        super.g();
        a(((f) this).B ? a.c.COMPANION : a.c.VIDEO, "pause");
        this.C.o().j();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void h() {
        if (this.C != null) {
            a(a.c.VIDEO, "close");
            a(a.c.COMPANION, "close");
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    protected void u() {
        long ae2;
        int s10;
        long j10 = 0;
        if (this.C.ad() >= 0 || this.C.ae() >= 0) {
            int i10 = (this.C.ad() > 0L ? 1 : (this.C.ad() == 0L ? 0 : -1));
            com.applovin.impl.a.a aVar = this.C;
            if (i10 >= 0) {
                ae2 = aVar.ad();
            } else {
                com.applovin.impl.a.m m10 = aVar.m();
                if (m10 == null || m10.b() <= 0) {
                    long j11 = ((f) this).A;
                    if (j11 > 0) {
                        j10 = 0 + j11;
                    }
                } else {
                    j10 = 0 + TimeUnit.SECONDS.toMillis(m10.b());
                }
                if (aVar.af() && (s10 = (int) aVar.s()) > 0) {
                    j10 += TimeUnit.SECONDS.toMillis(s10);
                }
                ae2 = (long) (j10 * (this.C.ae() / 100.0d));
            }
            b(ae2);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    protected void v() {
        super.v();
        com.applovin.impl.a.a aVar = this.C;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    protected void w() {
        super.w();
        com.applovin.impl.a.a aVar = this.C;
        if (aVar != null) {
            aVar.o().m();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void x() {
        super.x();
        a(a.c.VIDEO, ((f) this).f6951z ? "mute" : "unmute");
        this.C.o().a(((f) this).f6951z);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void y() {
        A();
        if (!l.c(this.C)) {
            if (v.a()) {
                this.f6871c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            h();
        } else if (((f) this).B) {
        } else {
            a(a.c.COMPANION, "creativeView");
            this.C.o().i();
            com.applovin.impl.sdk.a.g o10 = this.C.o();
            AppLovinAdView appLovinAdView = this.f6874f;
            o10.a(appLovinAdView, Collections.singletonList(new com.applovin.impl.sdk.a.d(appLovinAdView, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.y();
        }
    }
}
