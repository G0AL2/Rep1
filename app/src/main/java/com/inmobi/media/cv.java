package com.inmobi.media;

import android.app.Activity;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.fq;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: JsonMarkupAdHandler.java */
/* loaded from: classes3.dex */
public class cv extends cr {

    /* renamed from: a  reason: collision with root package name */
    private final String f25027a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25028b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f25029c;

    /* renamed from: d  reason: collision with root package name */
    private j f25030d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f25031e;

    /* renamed from: f  reason: collision with root package name */
    private fj f25032f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25033g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25034h;

    public cv(WeakReference<Activity> weakReference, j jVar, RelativeLayout relativeLayout) {
        super(relativeLayout);
        this.f25027a = cv.class.getSimpleName();
        this.f25028b = "InMobi";
        this.f25033g = false;
        this.f25034h = false;
        this.f25029c = weakReference;
        this.f25030d = jVar;
        this.f25031e = relativeLayout;
    }

    private void h() {
        Activity activity = this.f25029c.get();
        if (activity instanceof InMobiAdActivity) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void c() {
        fj fjVar;
        j jVar = this.f25030d;
        if ((jVar instanceof o) && (fjVar = this.f25032f) != null) {
            final cg cgVar = (cg) fjVar.getTag();
            if (cgVar != null && this.f25033g) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.inmobi.media.cv.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (cv.this.f25030d != null) {
                            if (cv.this.f25030d.getPlacementType() == 1 && ((Boolean) cgVar.f24830v.get("didCompleteQ4")).booleanValue()) {
                                return;
                            }
                            cv.this.f25032f.start();
                        }
                    }
                }, 50L);
            }
            if (this.f25030d.getFullScreenEventsListener() != null) {
                try {
                    if (!this.f25034h) {
                        this.f25034h = true;
                        this.f25030d.getFullScreenEventsListener().a(cgVar);
                    }
                } catch (Exception e10) {
                    gg.a().a(new hg(e10));
                }
            }
        } else if (jVar instanceof n) {
            try {
                if (!this.f25034h) {
                    this.f25034h = true;
                    jVar.getFullScreenEventsListener().a(null);
                }
            } catch (Exception e11) {
                gg.a().a(new hg(e11));
            }
        }
        this.f25033g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void d() {
        this.f25033g = true;
        fj fjVar = this.f25032f;
        if (fjVar != null) {
            fjVar.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void e() {
        cg cgVar;
        Activity activity = this.f25029c.get();
        if (activity instanceof InMobiAdActivity ? ((InMobiAdActivity) activity).f24414b : false) {
            j jVar = this.f25030d;
            if (jVar instanceof o) {
                fk fkVar = (fk) ((o) jVar).getVideoContainerView();
                if (fkVar != null) {
                    a((cg) fkVar.getVideoView().getTag());
                }
            } else if (jVar instanceof n) {
                a((bt) null);
            }
        } else {
            j jVar2 = this.f25030d;
            if (jVar2 instanceof o) {
                o oVar = (o) jVar2;
                fj fjVar = this.f25032f;
                if (fjVar != null && (cgVar = (cg) fjVar.getTag()) != null) {
                    if (1 == oVar.getPlacementType()) {
                        this.f25032f.e();
                    }
                    a(cgVar);
                }
            } else if (jVar2 instanceof n) {
                a((bt) null);
            }
            InMobiAdActivity.a((Object) this.f25030d);
        }
        this.f25030d.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void f() {
        if (this.f25030d.c()) {
            return;
        }
        j jVar = this.f25030d;
        if (jVar instanceof o) {
            o oVar = (o) jVar;
            if (oVar == null || oVar.h().f24850b) {
                return;
            }
            Activity activity = this.f25029c.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f24414b = true;
            }
            fj fjVar = this.f25032f;
            if (fjVar != null) {
                cg cgVar = (cg) fjVar.getTag();
                if (cgVar != null) {
                    if (1 == oVar.getPlacementType()) {
                        this.f25032f.e();
                    }
                    try {
                        if (((Boolean) cgVar.f24830v.get("isFullScreen")).booleanValue()) {
                            cgVar.f24830v.put("seekPosition", Integer.valueOf(this.f25032f.getCurrentPosition()));
                            if (oVar.f25905j || !((Boolean) cgVar.f24830v.get("didRequestFullScreen")).booleanValue()) {
                                return;
                            }
                            Map<String, Object> map = cgVar.f24830v;
                            Boolean bool = Boolean.FALSE;
                            map.put("didRequestFullScreen", bool);
                            bt btVar = cgVar.f24833y;
                            if (btVar != null) {
                                btVar.f24830v.put("didRequestFullScreen", bool);
                            }
                            oVar.b();
                            cgVar.f24830v.put("isFullScreen", bool);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        hu.a((byte) 2, "InMobi", "SDK encountered unexpected error in closing video");
                        gg.a().a(new hg(e10));
                        return;
                    }
                }
                return;
            }
            h();
        } else if (jVar instanceof n) {
            n nVar = (n) jVar;
            if (nVar != null) {
                if (nVar.h().f24850b) {
                    return;
                }
                nVar.b();
                return;
            }
            h();
        }
    }

    @Override // com.inmobi.media.cr
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.inmobi.media.cr
    public final /* bridge */ /* synthetic */ void a(float f10) {
        super.a(f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void b() {
        try {
            fq adConfig = this.f25030d.getAdConfig();
            dw viewableAd = this.f25030d.getViewableAd();
            if (viewableAd.b() != null) {
                j jVar = this.f25030d;
                if (jVar instanceof o) {
                    cg cgVar = (cg) this.f25032f.getTag();
                    if (cgVar != null) {
                        fq.m mVar = adConfig.viewability;
                        int i10 = mVar.video.impressionMinTimeViewed;
                        if (cgVar.G.containsKey("time")) {
                            i10 = ((Integer) cgVar.G.get("time")).intValue();
                        }
                        mVar.video.impressionMinTimeViewed = i10;
                        viewableAd.a((Map<View, FriendlyObstructionPurpose>) null);
                    }
                } else if (jVar instanceof n) {
                    try {
                        viewableAd.a((Map<View, FriendlyObstructionPurpose>) null);
                    } catch (Exception unused) {
                        if (this.f25030d.getFullScreenEventsListener() != null) {
                            this.f25030d.getFullScreenEventsListener().a();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            if (this.f25030d.getFullScreenEventsListener() != null) {
                this.f25030d.getFullScreenEventsListener().a();
            }
            gg.a().a(new hg(e10));
        }
    }

    @Override // com.inmobi.media.cr
    public final /* bridge */ /* synthetic */ void a(df dfVar) {
        super.a(dfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.inmobi.media.cr
    public final void a() {
        fk fkVar;
        byte placementType = this.f25030d.getPlacementType();
        this.f25031e.setBackgroundColor(-16777216);
        bx bxVar = (bx) this.f25030d.getDataModel();
        Point point = bxVar.f24852d.f24811c.f24834a;
        dw viewableAd = this.f25030d.getViewableAd();
        View b10 = bxVar.f24851c ? viewableAd.b() : null;
        int i10 = 0;
        if (b10 == null) {
            b10 = viewableAd.a(null, this.f25031e, false);
        }
        j jVar = this.f25030d;
        if ((jVar instanceof o) && (fkVar = (fk) jVar.getVideoContainerView()) != null) {
            fj videoView = fkVar.getVideoView();
            this.f25032f = videoView;
            videoView.requestFocus();
            cg cgVar = (cg) this.f25032f.getTag();
            bt btVar = cgVar.f24833y;
            if (btVar != null) {
                cgVar.a((cg) btVar);
            }
            if (placementType == 0) {
                cgVar.f24830v.put("placementType", (byte) 0);
            } else {
                cgVar.f24830v.put("placementType", (byte) 1);
            }
        }
        if (b10 != null) {
            this.f25031e.addView(b10, new RelativeLayout.LayoutParams(point.x, point.y));
        }
        Activity activity = this.f25029c.get();
        if (activity != null) {
            byte b11 = bxVar.f24849a;
            if (b11 == 1) {
                i10 = 1;
            } else if (b11 != 2) {
                i10 = activity.getRequestedOrientation();
            }
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f24413a.f25024b.setRequestedOrientation(i10);
            }
        }
    }

    private void a(bt btVar) {
        try {
            this.f25030d.getFullScreenEventsListener().b(btVar);
        } catch (Exception e10) {
            hu.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            gg.a().a(new hg(e10));
        }
    }
}
