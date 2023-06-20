package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.drm.e;
import da.a0;
import da.v;
import ea.n0;
import j8.x1;
import java.util.Map;
import jb.u0;

/* compiled from: DefaultDrmSessionManagerProvider.java */
/* loaded from: classes2.dex */
public final class i implements n8.o {

    /* renamed from: a  reason: collision with root package name */
    private final Object f21106a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private x1.f f21107b;

    /* renamed from: c  reason: collision with root package name */
    private l f21108c;

    /* renamed from: d  reason: collision with root package name */
    private a0.b f21109d;

    /* renamed from: e  reason: collision with root package name */
    private String f21110e;

    private l b(x1.f fVar) {
        a0.b bVar = this.f21109d;
        if (bVar == null) {
            bVar = new v.b().c(this.f21110e);
        }
        Uri uri = fVar.f32849b;
        r rVar = new r(uri == null ? null : uri.toString(), fVar.f32853f, bVar);
        u0<Map.Entry<String, String>> it = fVar.f32850c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            rVar.e(next.getKey(), next.getValue());
        }
        e a10 = new e.b().e(fVar.f32848a, q.f21125d).b(fVar.f32851d).c(fVar.f32852e).d(mb.d.l(fVar.f32854g)).a(rVar);
        a10.F(0, fVar.c());
        return a10;
    }

    @Override // n8.o
    public l a(x1 x1Var) {
        l lVar;
        ea.a.e(x1Var.f32820b);
        x1.f fVar = x1Var.f32820b.f32878c;
        if (fVar != null && n0.f29709a >= 18) {
            synchronized (this.f21106a) {
                if (!n0.c(fVar, this.f21107b)) {
                    this.f21107b = fVar;
                    this.f21108c = b(fVar);
                }
                lVar = (l) ea.a.e(this.f21108c);
            }
            return lVar;
        }
        return l.f21117a;
    }
}
