package fm.castbox.mediation.http;

import java.io.IOException;
import mf.f;
import mf.g;
import mf.n;
import mf.r;
import ye.b0;
import ye.c0;
import ye.d0;
import ye.v;
import ye.x;

/* loaded from: classes3.dex */
class GzipRequestInterceptor implements v {
    private c0 forceContentLength(final c0 c0Var) throws IOException {
        final f fVar = new f();
        c0Var.writeTo(fVar);
        return new c0() { // from class: fm.castbox.mediation.http.GzipRequestInterceptor.1
            @Override // ye.c0
            public long contentLength() {
                return fVar.C0();
            }

            @Override // ye.c0
            public x contentType() {
                return c0Var.contentType();
            }

            @Override // ye.c0
            public void writeTo(g gVar) throws IOException {
                gVar.Y(fVar.E0());
            }
        };
    }

    private c0 gzip(final c0 c0Var) {
        return new c0() { // from class: fm.castbox.mediation.http.GzipRequestInterceptor.2
            @Override // ye.c0
            public long contentLength() {
                return -1L;
            }

            @Override // ye.c0
            public x contentType() {
                return c0Var.contentType();
            }

            @Override // ye.c0
            public void writeTo(g gVar) throws IOException {
                g c10 = r.c(new n(gVar));
                c0Var.writeTo(c10);
                c10.close();
            }
        };
    }

    @Override // ye.v
    public d0 intercept(v.a aVar) throws IOException {
        b0 l10 = aVar.l();
        if (l10.a() != null && l10.d("Content-Encoding") == null) {
            return aVar.a(l10.i().e("Content-Encoding", "gzip").g(l10.h(), forceContentLength(gzip(l10.a()))).b());
        }
        return aVar.a(l10);
    }
}
