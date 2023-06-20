package x8;

import android.net.Uri;
import ea.a0;
import j8.j2;
import java.io.IOException;
import java.util.Map;
import p8.k;
import p8.m;
import p8.n;
import p8.w;

/* compiled from: OggExtractor.java */
/* loaded from: classes2.dex */
public class d implements p8.i {

    /* renamed from: a */
    private k f38721a;

    /* renamed from: b */
    private i f38722b;

    /* renamed from: c */
    private boolean f38723c;

    static {
        c cVar = new n() { // from class: x8.c
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return d.b();
            }
        };
    }

    public static /* synthetic */ p8.i[] b() {
        return d();
    }

    public static /* synthetic */ p8.i[] d() {
        return new p8.i[]{new d()};
    }

    private static a0 e(a0 a0Var) {
        a0Var.P(0);
        return a0Var;
    }

    private boolean f(p8.j jVar) throws IOException {
        f fVar = new f();
        if (fVar.a(jVar, true) && (fVar.f38730b & 2) == 2) {
            int min = Math.min(fVar.f38734f, 8);
            a0 a0Var = new a0(min);
            jVar.p(a0Var.d(), 0, min);
            if (b.p(e(a0Var))) {
                this.f38722b = new b();
            } else if (j.r(e(a0Var))) {
                this.f38722b = new j();
            } else if (h.p(e(a0Var))) {
                this.f38722b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        i iVar = this.f38722b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // p8.i
    public void c(k kVar) {
        this.f38721a = kVar;
    }

    @Override // p8.i
    public int g(p8.j jVar, w wVar) throws IOException {
        ea.a.h(this.f38721a);
        if (this.f38722b == null) {
            if (f(jVar)) {
                jVar.f();
            } else {
                throw j2.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f38723c) {
            p8.a0 f10 = this.f38721a.f(0, 1);
            this.f38721a.r();
            this.f38722b.d(this.f38721a, f10);
            this.f38723c = true;
        }
        return this.f38722b.g(jVar, wVar);
    }

    @Override // p8.i
    public boolean h(p8.j jVar) throws IOException {
        try {
            return f(jVar);
        } catch (j2 unused) {
            return false;
        }
    }

    @Override // p8.i
    public void release() {
    }
}
