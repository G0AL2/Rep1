package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.dw;
import com.inmobi.media.fq;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: InMobiTrackedNativeV2VideoAd.java */
/* loaded from: classes3.dex */
public class ef extends dv {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25223d = "ef";

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<Context> f25224e;

    /* renamed from: f  reason: collision with root package name */
    private final dw f25225f;

    /* renamed from: g  reason: collision with root package name */
    private final eg f25226g;

    /* renamed from: h  reason: collision with root package name */
    private final n f25227h;

    public ef(o oVar, dw dwVar) {
        super(oVar);
        this.f25224e = new WeakReference<>(oVar.j());
        this.f25225f = dwVar;
        this.f25227h = oVar;
        this.f25226g = new eg((byte) 0);
    }

    @Override // com.inmobi.media.dw
    public final dw.a a() {
        return this.f25225f.a();
    }

    @Override // com.inmobi.media.dw
    public final View b() {
        return this.f25225f.b();
    }

    @Override // com.inmobi.media.dw
    public final void d() {
        try {
            try {
                Context context = this.f25224e.get();
                o oVar = (o) this.f25180a;
                if (!oVar.f25905j && context != null) {
                    this.f25226g.a(context, oVar);
                }
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
        } finally {
            this.f25225f.d();
        }
    }

    @Override // com.inmobi.media.dw
    public final void e() {
        this.f25226g.a(this.f25224e.get(), this.f25225f.b(), this.f25227h);
        super.e();
        this.f25224e.clear();
        this.f25225f.e();
    }

    @Override // com.inmobi.media.dw
    public final void a(byte b10) {
        this.f25225f.a(b10);
    }

    @Override // com.inmobi.media.dw
    public final void a(Context context, byte b10) {
        try {
            try {
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
            if (b10 == 0) {
                eg.b(context);
            } else if (b10 != 1) {
                if (b10 == 2) {
                    this.f25226g.a(context);
                }
            } else {
                eg.c(context);
            }
        } finally {
            this.f25225f.a(context, b10);
        }
    }

    @Override // com.inmobi.media.dw
    public final View a(View view, ViewGroup viewGroup, boolean z10) {
        View b10 = this.f25225f.b();
        if (b10 != null) {
            this.f25226g.a(this.f25224e.get(), b10, this.f25227h);
        }
        return this.f25225f.a(view, viewGroup, z10);
    }

    @Override // com.inmobi.media.dw
    public final void a(Map<View, FriendlyObstructionPurpose> map) {
        try {
            try {
                o oVar = (o) this.f25180a;
                fk fkVar = (fk) oVar.getVideoContainerView();
                Context context = this.f25224e.get();
                fq.m mVar = this.f25182c.viewability;
                if (context != null && fkVar != null && !oVar.f25905j) {
                    fj videoView = fkVar.getVideoView();
                    this.f25226g.a(context, videoView, oVar, mVar);
                    View b10 = this.f25225f.b();
                    if (videoView.getTag() != null && b10 != null) {
                        cg cgVar = (cg) videoView.getTag();
                        if (oVar.getPlacementType() == 0 && !((Boolean) cgVar.f24830v.get("isFullScreen")).booleanValue()) {
                            eg egVar = this.f25226g;
                            n nVar = this.f25227h;
                            egVar.a(context, b10, nVar, ((o) nVar).f25935x, mVar);
                        }
                    }
                }
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
        } finally {
            this.f25225f.a(map);
        }
    }
}
