package da;

import android.net.Uri;
import da.e0;
import da.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* compiled from: ParsingLoadable.java */
/* loaded from: classes2.dex */
public final class g0<T> implements e0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f29170a;

    /* renamed from: b  reason: collision with root package name */
    public final p f29171b;

    /* renamed from: c  reason: collision with root package name */
    public final int f29172c;

    /* renamed from: d  reason: collision with root package name */
    private final l0 f29173d;

    /* renamed from: e  reason: collision with root package name */
    private final a<? extends T> f29174e;

    /* renamed from: f  reason: collision with root package name */
    private volatile T f29175f;

    /* compiled from: ParsingLoadable.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public g0(l lVar, Uri uri, int i10, a<? extends T> aVar) {
        this(lVar, new p.b().i(uri).b(1).a(), i10, aVar);
    }

    public static <T> T f(l lVar, a<? extends T> aVar, Uri uri, int i10) throws IOException {
        g0 g0Var = new g0(lVar, uri, i10, aVar);
        g0Var.load();
        return (T) ea.a.e(g0Var.d());
    }

    public long a() {
        return this.f29173d.q();
    }

    @Override // da.e0.e
    public final void b() {
    }

    public Map<String, List<String>> c() {
        return this.f29173d.s();
    }

    public final T d() {
        return this.f29175f;
    }

    public Uri e() {
        return this.f29173d.r();
    }

    @Override // da.e0.e
    public final void load() throws IOException {
        this.f29173d.t();
        n nVar = new n(this.f29173d, this.f29171b);
        try {
            nVar.b();
            this.f29175f = this.f29174e.a((Uri) ea.a.e(this.f29173d.o()), nVar);
        } finally {
            ea.n0.n(nVar);
        }
    }

    public g0(l lVar, p pVar, int i10, a<? extends T> aVar) {
        this.f29173d = new l0(lVar);
        this.f29171b = pVar;
        this.f29172c = i10;
        this.f29174e = aVar;
        this.f29170a = i9.n.a();
    }
}
