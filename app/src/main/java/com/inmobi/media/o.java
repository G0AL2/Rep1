package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.media.eg;
import com.inmobi.media.j;
import com.inmobi.media.n;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: NativeVideoAdContainer.java */
/* loaded from: classes3.dex */
public class o extends n {

    /* renamed from: y  reason: collision with root package name */
    private static final String f25934y = o.class.getSimpleName();
    private final j.a A;

    /* renamed from: x  reason: collision with root package name */
    public final eg.a f25935x;

    /* renamed from: z  reason: collision with root package name */
    private WeakReference<View> f25936z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Context context, byte b10, bx bxVar, String str, Set<du> set, fq fqVar, long j10, boolean z10, String str2) {
        super(context, b10, bxVar, str, set, fqVar, j10, z10, str2);
        this.A = new j.a() { // from class: com.inmobi.media.o.1
            @Override // com.inmobi.media.j.a
            public final void a() {
                String unused = o.f25934y;
                n.c e10 = o.this.e();
                if (e10 != null) {
                    e10.a();
                }
            }

            @Override // com.inmobi.media.j.a
            public final void b(Object obj) {
                String unused = o.f25934y;
                cg cgVar = (cg) obj;
                Map<String, Object> map = cgVar.f24830v;
                Boolean bool = Boolean.FALSE;
                map.put("didRequestFullScreen", bool);
                cgVar.f24830v.put("isFullScreen", bool);
                bt btVar = cgVar.f24833y;
                if (btVar != null) {
                    btVar.f24830v.put("didRequestFullScreen", bool);
                    cgVar.f24833y.f24830v.put("isFullScreen", bool);
                    cgVar.f24833y.f24833y = null;
                }
                cgVar.f24833y = null;
                if (o.this.getPlacementType() == 0) {
                    o.this.getViewableAd().a((byte) 2);
                    n nVar = o.this.f25907l;
                    if (nVar != null) {
                        nVar.getViewableAd().a((byte) 16);
                    }
                    cgVar.a("exitFullscreen", o.this.h(cgVar));
                } else {
                    o.this.getViewableAd().a((byte) 3);
                }
                n.c e10 = o.this.e();
                if (e10 != null) {
                    e10.f();
                }
            }

            @Override // com.inmobi.media.j.a
            public final void a(Object obj) {
                if (o.this.l() == null) {
                    return;
                }
                cg cgVar = (cg) obj;
                String unused = o.f25934y;
                Map<String, Object> map = cgVar.f24830v;
                Boolean bool = Boolean.TRUE;
                map.put("didRequestFullScreen", bool);
                cgVar.f24830v.put("isFullScreen", bool);
                cgVar.f24830v.put("shouldAutoPlay", bool);
                bt btVar = cgVar.f24833y;
                if (btVar != null) {
                    btVar.f24830v.put("didRequestFullScreen", bool);
                    cgVar.f24833y.f24830v.put("isFullScreen", bool);
                    cgVar.f24833y.f24830v.put("shouldAutoPlay", bool);
                }
                if (o.this.getPlacementType() == 0) {
                    o.this.getViewableAd().a((byte) 1);
                    cgVar.a("fullscreen", o.this.h(cgVar));
                }
                n.c e10 = o.this.e();
                if (e10 != null) {
                    e10.b();
                }
            }
        };
        this.f25935x = new eg.a() { // from class: com.inmobi.media.o.2
            @Override // com.inmobi.media.eg.a
            public final void a(View view, boolean z11) {
                o.this.a(z11);
                o.a(o.this, view, z11);
            }
        };
        this.f25896a = bxVar;
    }

    private void b(fj fjVar) {
        int videoVolume = fjVar.getVideoVolume();
        int lastVolume = fjVar.getLastVolume();
        if (videoVolume == lastVolume || lastVolume <= 0) {
            return;
        }
        b(true);
        fjVar.setLastVolume(videoVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> h(cg cgVar) {
        bv bvVar = (bv) cgVar.f24828t;
        HashMap hashMap = new HashMap(4);
        fk fkVar = (fk) this.f25936z.get();
        if (fkVar != null) {
            hashMap.put("$MD", String.valueOf((int) Math.round((fkVar.getVideoView().getDuration() * 1.0d) / 1000.0d)));
        }
        hashMap.put("[ERRORCODE]", "405");
        hashMap.put("[CONTENTPLAYHEAD]", a(((Integer) cgVar.f24830v.get("seekPosition")).intValue()));
        hashMap.put("[CACHEBUSTING]", y());
        hashMap.put("[ASSETURI]", cgVar.b().b());
        hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
        hashMap.put("$LTS", String.valueOf(this.f25896a.f24852d.f24845z));
        if (bvVar != null) {
            hashMap.put("$STS", String.valueOf(bvVar.f24845z));
        }
        bx bxVar = this.f25896a;
        if (bxVar != null) {
            hashMap.putAll(bxVar.a());
        }
        return hashMap;
    }

    private void x() {
        this.f25903h.a((byte) 15);
    }

    private static String y() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 == 0) {
            i10 = (secureRandom.nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER) % 10;
        }
        sb2.append(i10);
        for (int i11 = 1; i11 < 8; i11++) {
            sb2.append((secureRandom.nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER) % 10);
        }
        return sb2.toString();
    }

    public final void c(cg cgVar) {
        if (this.f25905j) {
            return;
        }
        n.c(f());
        cgVar.a("pause", h(cgVar));
        this.f25903h.a((byte) 7);
    }

    public final void d(cg cgVar) {
        if (this.f25905j) {
            return;
        }
        n.d(f());
        cgVar.a("resume", h(cgVar));
        this.f25903h.a((byte) 8);
    }

    @Override // com.inmobi.media.n, com.inmobi.media.j
    public void destroy() {
        fk fkVar;
        if (this.f25905j) {
            return;
        }
        if (getVideoContainerView() != null && (fkVar = (fk) getVideoContainerView()) != null) {
            fkVar.getVideoView().g();
        }
        super.destroy();
    }

    public final void e(cg cgVar) {
        if (this.f25905j) {
            return;
        }
        cgVar.f24830v.put("lastMediaVolume", 0);
        cgVar.a("mute", h(cgVar));
        this.f25903h.a((byte) 13);
    }

    public final void f(cg cgVar) {
        if (this.f25905j) {
            return;
        }
        cgVar.f24830v.put("lastMediaVolume", 15);
        cgVar.a("unmute", h(cgVar));
        this.f25903h.a((byte) 14);
    }

    public final void g(cg cgVar) {
        cgVar.f24830v.put("didQ4Fire", Boolean.TRUE);
        cgVar.a("complete", h(cgVar));
        this.f25903h.a((byte) 12);
    }

    @Override // com.inmobi.media.n, com.inmobi.media.j
    public j.a getFullScreenEventsListener() {
        return this.A;
    }

    @Override // com.inmobi.media.n, com.inmobi.media.j
    public View getVideoContainerView() {
        WeakReference<View> weakReference = this.f25936z;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.inmobi.media.n, com.inmobi.media.j
    @SuppressLint({"SwitchIntDef"})
    public dw getViewableAd() {
        VastProperties createVastPropertiesForNonSkippableMedia;
        Context j10 = j();
        if (this.f25903h == null && j10 != null) {
            g();
            this.f25903h = new ef(this, new dz(this));
            Set<du> set = this.f25902g;
            if (set != null) {
                for (du duVar : set) {
                    try {
                        if (duVar.f25178a == 3) {
                            ek ekVar = (ek) duVar.f25179b.get("omidAdSession");
                            boolean booleanValue = ((Boolean) duVar.f25179b.get("videoAutoPlay")).booleanValue();
                            boolean booleanValue2 = ((Boolean) duVar.f25179b.get("videoSkippable")).booleanValue();
                            int intValue = ((Integer) duVar.f25179b.get("videoSkipOffset")).intValue();
                            if (booleanValue2) {
                                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForSkippableMedia(intValue, booleanValue, Position.STANDALONE);
                            } else {
                                createVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(booleanValue, Position.STANDALONE);
                            }
                            VastProperties vastProperties = createVastPropertiesForNonSkippableMedia;
                            if (ekVar != null) {
                                this.f25903h = new eq(j10, this.f25903h, this, ekVar, vastProperties);
                            }
                        }
                    } catch (Exception e10) {
                        gg.a().a(new hg(e10));
                    }
                }
            }
        }
        return this.f25903h;
    }

    @Override // com.inmobi.media.n
    public final boolean i() {
        return getPlacementType() == 0 && l() != null;
    }

    @Override // com.inmobi.media.n
    final boolean n() {
        return !this.f25911p;
    }

    @Override // com.inmobi.media.n
    public final void q() {
        super.q();
        fk fkVar = (fk) getVideoContainerView();
        if (fkVar != null) {
            fj videoView = fkVar.getVideoView();
            if (getPlacementType() == 0 && !i() && videoView.getVideoVolume() > 0) {
                videoView.setLastVolume(-2);
                b(true);
            }
            videoView.pause();
        }
    }

    public final void v() {
        this.f25903h.a((byte) 5);
    }

    @Override // com.inmobi.media.n
    public final void a(View view) {
        if (k() || this.f25905j || !(view instanceof fj)) {
            return;
        }
        this.f25904i = true;
        cg cgVar = (cg) ((fj) view).getTag();
        if (((Boolean) cgVar.f24830v.get("didImpressionFire")).booleanValue()) {
            return;
        }
        List<cf> list = cgVar.f24829u;
        Map<String, String> h10 = h(cgVar);
        List<String> arrayList = new ArrayList();
        for (cf cfVar : list) {
            if ("VideoImpression".equals(cfVar.f24922d)) {
                if (cfVar.f24920b.startsWith("http")) {
                    bt.a(cfVar, h10);
                }
                arrayList = (List) cfVar.f24924f.get("referencedEvents");
                if (arrayList != null) {
                    for (String str : arrayList) {
                        cgVar.a(str, h10);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            cgVar.a("start", h10);
            cgVar.a("Impression", h10);
        }
        this.f25896a.f24852d.a("Impression", h(cgVar));
        cgVar.f24830v.put("didImpressionFire", Boolean.TRUE);
        this.f25903h.a((byte) 0);
        if (e() != null) {
            e().d();
        }
    }

    private void b(boolean z10) {
        n.c e10;
        if (getPlacementType() != 0 || i() || (e10 = e()) == null) {
            return;
        }
        e10.a(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.inmobi.media.n
    public final void b(bt btVar) {
        fk fkVar;
        byte b10 = btVar.f24820l;
        if (b10 != 0) {
            if (b10 == 1) {
                super.b(btVar);
            } else if (b10 == 3) {
                try {
                    if ("VIDEO".equals(btVar.f24810b)) {
                        q qVar = this.f25915t;
                        if (qVar != null) {
                            qVar.d("window.imraid.broadcastEvent('replay');");
                        }
                        if (f() != null) {
                            View f10 = f();
                            ce b11 = n.b(f10);
                            if (b11 != null) {
                                b11.a();
                            }
                            ViewGroup viewGroup = (ViewGroup) f10.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(f10);
                            }
                        }
                        fk fkVar2 = (fk) getVideoContainerView();
                        if (fkVar2 != null) {
                            fkVar2.getVideoView().i();
                            fkVar2.getVideoView().start();
                        }
                    }
                } catch (Exception e10) {
                    hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                    gg.a().a(new hg(e10));
                }
            } else if (b10 == 4) {
                try {
                    if (getPlacementType() != 0 || (fkVar = (fk) getVideoContainerView()) == null) {
                        return;
                    }
                    fj videoView = fkVar.getVideoView();
                    cg cgVar = (cg) videoView.getTag();
                    if (videoView.getState() != 1) {
                        try {
                            if (this.f25905j || this.f25909n.get() == null || ((Boolean) cgVar.f24830v.get("didRequestFullScreen")).booleanValue()) {
                                return;
                            }
                            Map<String, Object> map = cgVar.f24830v;
                            Boolean bool = Boolean.TRUE;
                            map.put("didRequestFullScreen", bool);
                            cgVar.f24830v.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                            cgVar.f24830v.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                            if (videoView.getMediaPlayer().isPlaying()) {
                                videoView.getMediaPlayer().pause();
                                videoView.getAudioFocusManager().a();
                            }
                            videoView.getMediaPlayer().f25381a = 4;
                            cgVar.f24830v.put("isFullScreen", bool);
                            cgVar.f24830v.put("seekPosition", Integer.valueOf(videoView.getMediaPlayer().getCurrentPosition()));
                            m();
                        } catch (Exception e11) {
                            gg.a().a(new hg(e11));
                        }
                    }
                } catch (Exception e12) {
                    hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in expanding video to fullscreen");
                    gg.a().a(new hg(e12));
                }
            } else if (b10 != 5) {
                try {
                    if (1 == getPlacementType()) {
                        super.b(btVar);
                        if ("VIDEO".equals(btVar.f24810b)) {
                            fk fkVar3 = (fk) getVideoContainerView();
                            if (fkVar3 != null) {
                                fkVar3.getVideoView().h();
                                fj videoView2 = fkVar3.getVideoView();
                                if (videoView2.f() && videoView2.f25401a.isPlaying()) {
                                    videoView2.f25401a.pause();
                                    videoView2.f25401a.seekTo(0);
                                    videoView2.f25402b.a();
                                    if (videoView2.getTag() != null) {
                                        cg cgVar2 = (cg) videoView2.getTag();
                                        Map<String, Object> map2 = cgVar2.f24830v;
                                        Boolean bool2 = Boolean.TRUE;
                                        map2.put("didPause", bool2);
                                        cgVar2.f24830v.put("seekPosition", 0);
                                        cgVar2.f24830v.put("didCompleteQ4", bool2);
                                    }
                                    videoView2.f25401a.f25381a = 4;
                                    videoView2.getPlaybackEventListener().a((byte) 4);
                                }
                                fd fdVar = videoView2.f25401a;
                                if (fdVar != null) {
                                    fdVar.f25382b = 4;
                                }
                            }
                            x();
                            return;
                        }
                        return;
                    }
                    n.c e13 = e();
                    if (e13 != null) {
                        e13.i();
                    }
                    x();
                } catch (Exception e14) {
                    gg.a().a(new hg(e14));
                }
            } else {
                try {
                    fk fkVar4 = (fk) getVideoContainerView();
                    if (fkVar4 != null) {
                        cg cgVar3 = (cg) fkVar4.getVideoView().getTag();
                        Map<String, Object> map3 = cgVar3.f24830v;
                        Boolean bool3 = Boolean.TRUE;
                        map3.put("shouldAutoPlay", bool3);
                        bt btVar2 = cgVar3.f24833y;
                        if (btVar2 != null) {
                            btVar2.f24830v.put("shouldAutoPlay", bool3);
                        }
                        fkVar4.getVideoView().start();
                    }
                } catch (Exception e15) {
                    hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in playing video");
                    gg.a().a(new hg(e15));
                }
            }
        }
    }

    private static String a(int i10) {
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = i10;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j10))), Long.valueOf(timeUnit.toSeconds(j10) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j10))), Long.valueOf(j10 - (timeUnit.toSeconds(j10) * 1000)));
    }

    public final void a(fj fjVar) {
        fjVar.setIsLockScreen(this.f25913r);
        fk fkVar = (fk) fjVar.getParent();
        this.f25936z = new WeakReference<>(fkVar);
        fi mediaController = fkVar.getVideoView().getMediaController();
        if (mediaController != null) {
            mediaController.setVideoAd(this);
        }
    }

    public final void a(cg cgVar) {
        if (this.f25905j) {
            return;
        }
        cgVar.a("error", h(cgVar));
        this.f25903h.a((byte) 17);
    }

    public final void a(cg cgVar, byte b10) {
        if (this.f25905j) {
            return;
        }
        if (b10 == 0) {
            cgVar.a("firstQuartile", h(cgVar));
            this.f25903h.a((byte) 9);
        } else if (b10 == 1) {
            cgVar.a("midpoint", h(cgVar));
            this.f25903h.a((byte) 10);
        } else if (b10 != 2) {
            if (b10 == 3 && !((Boolean) cgVar.f24830v.get("didQ4Fire")).booleanValue()) {
                g(cgVar);
            }
        } else {
            cgVar.a("thirdQuartile", h(cgVar));
            this.f25903h.a((byte) 11);
        }
    }

    static /* synthetic */ void a(o oVar, View view, final boolean z10) {
        final cg cgVar;
        final fj fjVar = (fj) view.findViewById(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (fjVar == null || (cgVar = (cg) fjVar.getTag()) == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.o.3
            @Override // java.lang.Runnable
            public final void run() {
                cgVar.f24830v.put("visible", Boolean.valueOf(z10));
                if (z10 && !o.this.f25906k) {
                    cgVar.f24830v.put("lastVisibleTimestamp", Long.valueOf(SystemClock.uptimeMillis()));
                    fj fjVar2 = fjVar;
                    if (fjVar2.f25404d && fjVar2.getMediaPlayer() != null) {
                        if (cgVar.a()) {
                            fjVar.i();
                        } else {
                            fjVar.h();
                        }
                    }
                    fj fjVar3 = fjVar;
                    Handler handler = fjVar3.f25403c;
                    if (handler != null) {
                        handler.removeMessages(0);
                    }
                    fjVar3.f25404d = false;
                    o.a(o.this, fjVar);
                    o.a(o.this, fjVar, cgVar);
                    if (1 == fjVar.getState()) {
                        fjVar.getMediaPlayer().f25382b = 3;
                        return;
                    } else if (2 == fjVar.getState() || 4 == fjVar.getState() || (5 == fjVar.getState() && cgVar.C)) {
                        fjVar.start();
                        return;
                    } else {
                        return;
                    }
                }
                o.b(o.this, fjVar);
                final fj fjVar4 = fjVar;
                int i10 = cgVar.F;
                if (fjVar4.f25404d || 4 == fjVar4.getState()) {
                    return;
                }
                if (fjVar4.f25403c == null) {
                    fjVar4.f25403c = new Handler(Looper.getMainLooper());
                }
                if (i10 > 0) {
                    fjVar4.f25404d = true;
                    fjVar4.h();
                    fjVar4.f25403c.postDelayed(new Runnable() { // from class: com.inmobi.media.fj.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            fjVar4.pause();
                        }
                    }, i10 * 1000);
                    return;
                }
                fjVar4.pause();
            }
        });
    }

    static /* synthetic */ void a(o oVar, fj fjVar) {
        int videoVolume;
        if (oVar.getPlacementType() != 0 || oVar.i() || (videoVolume = fjVar.getVideoVolume()) == fjVar.getLastVolume() || !fjVar.isPlaying()) {
            return;
        }
        oVar.b(videoVolume <= 0);
        fjVar.setLastVolume(videoVolume);
    }

    static /* synthetic */ void a(o oVar, fj fjVar, cg cgVar) {
        if (oVar.getPlacementType() != 0 || oVar.i() || cgVar.C || fjVar.isPlaying() || fjVar.getState() != 5) {
            return;
        }
        oVar.b(fjVar);
    }

    public final void b(cg cgVar) {
        if (this.f25905j) {
            return;
        }
        if (getPlacementType() == 0) {
            if (((Integer) cgVar.f24830v.get("currentMediaVolume")).intValue() > 0 && ((Integer) cgVar.f24830v.get("lastMediaVolume")).intValue() == 0) {
                f(cgVar);
            }
            if (((Integer) cgVar.f24830v.get("currentMediaVolume")).intValue() == 0 && ((Integer) cgVar.f24830v.get("lastMediaVolume")).intValue() > 0) {
                e(cgVar);
            }
        }
        if (((Boolean) cgVar.f24830v.get("didStartPlaying")).booleanValue()) {
            return;
        }
        cgVar.f24830v.put("didStartPlaying", Boolean.TRUE);
        getViewableAd().a((byte) 6);
    }

    static /* synthetic */ void b(o oVar, fj fjVar) {
        if (oVar.getPlacementType() != 0 || oVar.i() || oVar.f25906k) {
            return;
        }
        oVar.b(fjVar);
    }
}
