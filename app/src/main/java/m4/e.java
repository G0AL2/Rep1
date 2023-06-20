package m4;

import android.content.Context;
import android.net.Uri;
import b6.b;
import java.util.Set;
import r4.b;
import w5.h;
import y3.o;

/* compiled from: PipelineDraweeControllerBuilder.java */
/* loaded from: classes.dex */
public class e extends r4.b<e, b6.b, c4.a<w5.c>, h> {

    /* renamed from: t  reason: collision with root package name */
    private final r5.h f34217t;

    /* renamed from: u  reason: collision with root package name */
    private final g f34218u;

    /* renamed from: v  reason: collision with root package name */
    private y3.f<v5.a> f34219v;

    /* renamed from: w  reason: collision with root package name */
    private o4.b f34220w;

    /* renamed from: x  reason: collision with root package name */
    private o4.f f34221x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PipelineDraweeControllerBuilder.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34222a;

        static {
            int[] iArr = new int[b.c.values().length];
            f34222a = iArr;
            try {
                iArr[b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34222a[b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34222a[b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context, g gVar, r5.h hVar, Set<r4.d> set, Set<h5.b> set2) {
        super(context, set, set2);
        this.f34217t = hVar;
        this.f34218u = gVar;
    }

    public static b.c G(b.c cVar) {
        int i10 = a.f34222a[cVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return b.c.BITMAP_MEMORY_CACHE;
                }
                throw new RuntimeException("Cache level" + cVar + "is not supported. ");
            }
            return b.c.DISK_CACHE;
        }
        return b.c.FULL_FETCH;
    }

    private t3.d H() {
        b6.b n10 = n();
        p5.f j10 = this.f34217t.j();
        if (j10 == null || n10 == null) {
            return null;
        }
        if (n10.g() != null) {
            return j10.b(n10, f());
        }
        return j10.c(n10, f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r4.b
    /* renamed from: I */
    public com.facebook.datasource.c<c4.a<w5.c>> i(x4.a aVar, String str, b6.b bVar, Object obj, b.c cVar) {
        return this.f34217t.g(bVar, obj, G(cVar), J(aVar), str);
    }

    protected y5.e J(x4.a aVar) {
        if (aVar instanceof d) {
            return ((d) aVar).n0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r4.b
    /* renamed from: K */
    public d w() {
        d c10;
        if (c6.b.d()) {
            c6.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            x4.a p10 = p();
            String e10 = r4.b.e();
            if (p10 instanceof d) {
                c10 = (d) p10;
            } else {
                c10 = this.f34218u.c();
            }
            c10.p0(x(c10, e10), e10, H(), f(), this.f34219v, this.f34220w);
            c10.q0(this.f34221x, this, o.f39267a);
            return c10;
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    public e L(o4.f fVar) {
        this.f34221x = fVar;
        return r();
    }

    @Override // x4.d
    /* renamed from: M */
    public e b(Uri uri) {
        if (uri == null) {
            return (e) super.C(null);
        }
        return (e) super.C(b6.c.s(uri).F(q5.f.b()).a());
    }
}
