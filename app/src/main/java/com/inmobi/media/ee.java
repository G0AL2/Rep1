package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.dw;
import com.inmobi.media.fq;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: InMobiTrackedNativeV2DisplayAd.java */
/* loaded from: classes3.dex */
public class ee extends dv {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25218d = "ee";

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<Context> f25219e;

    /* renamed from: f  reason: collision with root package name */
    private final dw f25220f;

    /* renamed from: g  reason: collision with root package name */
    private final eg f25221g;

    /* renamed from: h  reason: collision with root package name */
    private final n f25222h;

    public ee(Context context, n nVar, dw dwVar) {
        super(nVar);
        this.f25219e = new WeakReference<>(context);
        this.f25220f = dwVar;
        this.f25222h = nVar;
        this.f25221g = new eg((byte) 1);
    }

    @Override // com.inmobi.media.dw
    public final dw.a a() {
        return this.f25220f.a();
    }

    @Override // com.inmobi.media.dw
    public final View b() {
        return this.f25220f.b();
    }

    @Override // com.inmobi.media.dw
    public final void d() {
        try {
            try {
                n nVar = (n) this.f25180a;
                if (!nVar.f25905j) {
                    this.f25221g.a(this.f25219e.get(), nVar);
                }
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
        } finally {
            this.f25220f.d();
        }
    }

    @Override // com.inmobi.media.dw
    public final void e() {
        this.f25221g.a(this.f25222h.d(), this.f25220f.b(), this.f25222h);
        super.e();
        this.f25219e.clear();
        this.f25220f.e();
    }

    @Override // com.inmobi.media.dw
    public final void a(Map<View, FriendlyObstructionPurpose> map) {
        try {
            try {
                Context context = this.f25219e.get();
                View b10 = this.f25220f.b();
                fq.m mVar = this.f25182c.viewability;
                n nVar = (n) this.f25180a;
                if (context != null && b10 != null && !nVar.f25905j) {
                    this.f25221g.a(context, b10, nVar, mVar);
                    eg egVar = this.f25221g;
                    n nVar2 = this.f25222h;
                    egVar.a(context, b10, nVar2, nVar2.f25918w, mVar);
                }
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
            }
        } finally {
            this.f25220f.a(map);
        }
    }

    @Override // com.inmobi.media.dw
    public final void a(byte b10) {
        this.f25220f.a(b10);
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
                    this.f25221g.a(context);
                }
            } else {
                eg.c(context);
            }
        } finally {
            this.f25220f.a(context, b10);
        }
    }

    @Override // com.inmobi.media.dw
    public final View a(View view, ViewGroup viewGroup, boolean z10) {
        View b10 = this.f25220f.b();
        if (b10 != null) {
            this.f25221g.a(this.f25222h.d(), b10, this.f25222h);
        }
        return this.f25220f.a(view, viewGroup, z10);
    }
}
