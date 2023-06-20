package ef;

import fe.p;
import java.io.IOException;
import java.util.List;
import mf.o;
import mf.r;
import ye.b0;
import ye.c0;
import ye.d0;
import ye.e0;
import ye.m;
import ye.n;
import ye.v;
import ye.x;

/* compiled from: BridgeInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements v {

    /* renamed from: a  reason: collision with root package name */
    private final n f29814a;

    public a(n nVar) {
        qe.k.f(nVar, "cookieJar");
        this.f29814a = nVar;
    }

    private final String a(List<m> list) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p.o();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(mVar.e());
            sb2.append('=');
            sb2.append(mVar.g());
            i10 = i11;
        }
        String sb3 = sb2.toString();
        qe.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    @Override // ye.v
    public d0 intercept(v.a aVar) throws IOException {
        boolean l10;
        e0 a10;
        qe.k.f(aVar, "chain");
        b0 l11 = aVar.l();
        b0.a i10 = l11.i();
        c0 a11 = l11.a();
        if (a11 != null) {
            x contentType = a11.contentType();
            if (contentType != null) {
                i10.e("Content-Type", contentType.toString());
            }
            long contentLength = a11.contentLength();
            if (contentLength != -1) {
                i10.e("Content-Length", String.valueOf(contentLength));
                i10.i("Transfer-Encoding");
            } else {
                i10.e("Transfer-Encoding", "chunked");
                i10.i("Content-Length");
            }
        }
        boolean z10 = false;
        if (l11.d("Host") == null) {
            i10.e("Host", ze.c.Q(l11.l(), false, 1, null));
        }
        if (l11.d("Connection") == null) {
            i10.e("Connection", "Keep-Alive");
        }
        if (l11.d("Accept-Encoding") == null && l11.d("Range") == null) {
            i10.e("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<m> a12 = this.f29814a.a(l11.l());
        if (!a12.isEmpty()) {
            i10.e("Cookie", a(a12));
        }
        if (l11.d("User-Agent") == null) {
            i10.e("User-Agent", "okhttp/4.9.2");
        }
        d0 a13 = aVar.a(i10.b());
        e.f(this.f29814a, l11.l(), a13.A());
        d0.a r10 = a13.O().r(l11);
        if (z10) {
            l10 = ve.p.l("gzip", d0.z(a13, "Content-Encoding", null, 2, null), true);
            if (l10 && e.b(a13) && (a10 = a13.a()) != null) {
                o oVar = new o(a10.q());
                r10.k(a13.A().e().g("Content-Encoding").g("Content-Length").d());
                r10.b(new h(d0.z(a13, "Content-Type", null, 2, null), -1L, r.d(oVar)));
            }
        }
        return r10.c();
    }
}
