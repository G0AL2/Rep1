package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.media.dw;
import com.inmobi.media.er;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: OmidTrackedNativeV2VideoAd.java */
/* loaded from: classes3.dex */
public class eq extends dv {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25280d = "eq";

    /* renamed from: e  reason: collision with root package name */
    private final VastProperties f25281e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<Context> f25282f;

    /* renamed from: g  reason: collision with root package name */
    private final dw f25283g;

    /* renamed from: h  reason: collision with root package name */
    private ek f25284h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<View> f25285i;

    public eq(Context context, dw dwVar, o oVar, ek ekVar, VastProperties vastProperties) {
        super(oVar);
        this.f25282f = new WeakReference<>(context);
        this.f25283g = dwVar;
        this.f25284h = ekVar;
        this.f25281e = vastProperties;
    }

    @Override // com.inmobi.media.dw
    public final View a(View view, ViewGroup viewGroup, boolean z10) {
        return this.f25283g.a(view, viewGroup, z10);
    }

    @Override // com.inmobi.media.dw
    public final View b() {
        return this.f25283g.b();
    }

    @Override // com.inmobi.media.dw
    public final View c() {
        return this.f25283g.c();
    }

    @Override // com.inmobi.media.dw
    public final void d() {
        try {
            try {
                if (!((o) this.f25180a).i()) {
                    this.f25284h.a();
                    this.f25284h.hashCode();
                }
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
        } finally {
            this.f25283g.d();
        }
    }

    @Override // com.inmobi.media.dw
    public final void e() {
        super.e();
        try {
            try {
                this.f25282f.clear();
                WeakReference<View> weakReference = this.f25285i;
                if (weakReference != null) {
                    weakReference.clear();
                }
                this.f25284h = null;
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
        } finally {
            this.f25283g.e();
        }
    }

    @Override // com.inmobi.media.dw
    public final dw.a a() {
        return this.f25283g.a();
    }

    @Override // com.inmobi.media.dw
    public final void a(Context context, byte b10) {
        this.f25283g.a(context, b10);
    }

    public static ek a(List<VerificationScriptResource> list, String str, String str2) {
        return new el("native_video_ad", ImpressionType.VIEWABLE, er.a.f25286a.a(list, str2, str));
    }

    @Override // com.inmobi.media.dw
    public final void a(Map<View, FriendlyObstructionPurpose> map) {
        fk fkVar;
        try {
            try {
                if (this.f25182c.viewability.omidConfig.omidEnabled && er.a.f25286a.a()) {
                    j jVar = this.f25180a;
                    if ((jVar instanceof o) && (fkVar = (fk) jVar.getVideoContainerView()) != null) {
                        fi mediaController = fkVar.getVideoView().getMediaController();
                        WeakReference<View> weakReference = new WeakReference<>(fkVar);
                        this.f25285i = weakReference;
                        this.f25284h.a(weakReference.get(), mediaController != null ? mediaController.getFriendlyViews() : null, this.f25283g.b());
                        this.f25284h.hashCode();
                    }
                }
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
        } finally {
            this.f25283g.a(map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (((com.inmobi.media.o) r1).i() != false) goto L11;
     */
    @Override // com.inmobi.media.dw
    @android.annotation.SuppressLint({"SwitchIntDef"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 5
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r1) goto L52
            r1 = 6
            if (r7 == r1) goto L11
            r1 = 13
            if (r7 == r1) goto L68
            r1 = 14
            goto L66
        L11:
            com.inmobi.media.j r1 = r6.f25180a     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            boolean r4 = r1 instanceof com.inmobi.media.o     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            if (r4 == 0) goto L66
            android.view.View r1 = r1.getVideoContainerView()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            com.inmobi.media.fk r1 = (com.inmobi.media.fk) r1     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            if (r1 == 0) goto L66
            com.inmobi.media.fj r0 = r1.getVideoView()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            int r0 = r0.getDuration()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            com.inmobi.media.fj r1 = r1.getVideoView()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.Object r1 = r1.getTag()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            com.inmobi.media.cg r1 = (com.inmobi.media.cg) r1     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f24830v     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.String r5 = "currentMediaVolume"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            if (r4 <= 0) goto L68
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f24830v     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.String r4 = "lastMediaVolume"
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            if (r1 != 0) goto L68
            goto L66
        L52:
            com.inmobi.media.j r1 = r6.f25180a     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            boolean r2 = r1 instanceof com.inmobi.media.o     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            if (r2 == 0) goto L66
            com.inmobi.media.o r1 = (com.inmobi.media.o) r1     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            boolean r1 = r1.i()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            if (r1 == 0) goto L66
        L60:
            com.inmobi.media.dw r0 = r6.f25283g
            r0.a(r7)
            return
        L66:
            r2 = 1065353216(0x3f800000, float:1.0)
        L68:
            com.inmobi.media.ek r1 = r6.f25284h     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            com.iab.omid.library.inmobi.adsession.media.VastProperties r3 = r6.f25281e     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            r1.a(r7, r0, r2, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            goto L60
        L70:
            r0 = move-exception
            goto L80
        L72:
            r0 = move-exception
            com.inmobi.media.gg r1 = com.inmobi.media.gg.a()     // Catch: java.lang.Throwable -> L70
            com.inmobi.media.hg r2 = new com.inmobi.media.hg     // Catch: java.lang.Throwable -> L70
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L70
            r1.a(r2)     // Catch: java.lang.Throwable -> L70
            goto L60
        L80:
            com.inmobi.media.dw r1 = r6.f25283g
            r1.a(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.eq.a(byte):void");
    }
}
