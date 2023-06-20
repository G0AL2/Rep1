package df;

import com.google.android.gms.common.internal.ImagesContract;
import df.k;
import gf.n;
import java.io.IOException;
import ye.f0;
import ye.r;
import ye.u;
import ye.z;

/* compiled from: ExchangeFinder.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private k.b f29393a;

    /* renamed from: b  reason: collision with root package name */
    private k f29394b;

    /* renamed from: c  reason: collision with root package name */
    private int f29395c;

    /* renamed from: d  reason: collision with root package name */
    private int f29396d;

    /* renamed from: e  reason: collision with root package name */
    private int f29397e;

    /* renamed from: f  reason: collision with root package name */
    private f0 f29398f;

    /* renamed from: g  reason: collision with root package name */
    private final h f29399g;

    /* renamed from: h  reason: collision with root package name */
    private final ye.a f29400h;

    /* renamed from: i  reason: collision with root package name */
    private final e f29401i;

    /* renamed from: j  reason: collision with root package name */
    private final r f29402j;

    public d(h hVar, ye.a aVar, e eVar, r rVar) {
        qe.k.f(hVar, "connectionPool");
        qe.k.f(aVar, "address");
        qe.k.f(eVar, "call");
        qe.k.f(rVar, "eventListener");
        this.f29399g = hVar;
        this.f29400h = aVar;
        this.f29401i = eVar;
        this.f29402j = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final df.f b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.d.b(int, int, int, int, boolean):df.f");
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            f b10 = b(i10, i11, i12, i13, z10);
            if (b10.u(z11)) {
                return b10;
            }
            b10.z();
            if (this.f29398f == null) {
                k.b bVar = this.f29393a;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    k kVar = this.f29394b;
                    if (!(kVar != null ? kVar.b() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final f0 f() {
        f m10;
        if (this.f29395c > 1 || this.f29396d > 1 || this.f29397e > 0 || (m10 = this.f29401i.m()) == null) {
            return null;
        }
        synchronized (m10) {
            if (m10.q() != 0) {
                return null;
            }
            if (ze.c.g(m10.A().a().l(), this.f29400h.l())) {
                return m10.A();
            }
            return null;
        }
    }

    public final ef.d a(z zVar, ef.g gVar) {
        qe.k.f(zVar, "client");
        qe.k.f(gVar, "chain");
        try {
            return c(gVar.e(), gVar.g(), gVar.i(), zVar.B(), zVar.H(), !qe.k.a(gVar.h().h(), "GET")).w(zVar, gVar);
        } catch (j e10) {
            h(e10.c());
            throw e10;
        } catch (IOException e11) {
            h(e11);
            throw new j(e11);
        }
    }

    public final ye.a d() {
        return this.f29400h;
    }

    public final boolean e() {
        k kVar;
        if (this.f29395c == 0 && this.f29396d == 0 && this.f29397e == 0) {
            return false;
        }
        if (this.f29398f != null) {
            return true;
        }
        f0 f10 = f();
        if (f10 != null) {
            this.f29398f = f10;
            return true;
        }
        k.b bVar = this.f29393a;
        if ((bVar == null || !bVar.b()) && (kVar = this.f29394b) != null) {
            return kVar.b();
        }
        return true;
    }

    public final boolean g(u uVar) {
        qe.k.f(uVar, ImagesContract.URL);
        u l10 = this.f29400h.l();
        return uVar.m() == l10.m() && qe.k.a(uVar.h(), l10.h());
    }

    public final void h(IOException iOException) {
        qe.k.f(iOException, "e");
        this.f29398f = null;
        if ((iOException instanceof n) && ((n) iOException).f31047a == gf.b.REFUSED_STREAM) {
            this.f29395c++;
        } else if (iOException instanceof gf.a) {
            this.f29396d++;
        } else {
            this.f29397e++;
        }
    }
}
