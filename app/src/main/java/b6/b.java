package b6;

import android.net.Uri;
import java.io.File;
import y3.j;

/* compiled from: ImageRequest.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: u  reason: collision with root package name */
    private static boolean f4835u;

    /* renamed from: v  reason: collision with root package name */
    private static boolean f4836v;

    /* renamed from: w  reason: collision with root package name */
    public static final y3.e<b, Uri> f4837w = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f4838a;

    /* renamed from: b  reason: collision with root package name */
    private final EnumC0091b f4839b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f4840c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4841d;

    /* renamed from: e  reason: collision with root package name */
    private File f4842e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f4843f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f4844g;

    /* renamed from: h  reason: collision with root package name */
    private final q5.b f4845h;

    /* renamed from: i  reason: collision with root package name */
    private final q5.e f4846i;

    /* renamed from: j  reason: collision with root package name */
    private final q5.f f4847j;

    /* renamed from: k  reason: collision with root package name */
    private final q5.a f4848k;

    /* renamed from: l  reason: collision with root package name */
    private final q5.d f4849l;

    /* renamed from: m  reason: collision with root package name */
    private final c f4850m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f4851n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f4852o;

    /* renamed from: p  reason: collision with root package name */
    private final Boolean f4853p;

    /* renamed from: q  reason: collision with root package name */
    private final d f4854q;

    /* renamed from: r  reason: collision with root package name */
    private final y5.e f4855r;

    /* renamed from: s  reason: collision with root package name */
    private final Boolean f4856s;

    /* renamed from: t  reason: collision with root package name */
    private final int f4857t;

    /* compiled from: ImageRequest.java */
    /* loaded from: classes.dex */
    static class a implements y3.e<b, Uri> {
        a() {
        }

        @Override // y3.e
        /* renamed from: a */
        public Uri apply(b bVar) {
            if (bVar != null) {
                return bVar.q();
            }
            return null;
        }
    }

    /* compiled from: ImageRequest.java */
    /* renamed from: b6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0091b {
        SMALL,
        DEFAULT
    }

    /* compiled from: ImageRequest.java */
    /* loaded from: classes.dex */
    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: a  reason: collision with root package name */
        private int f4866a;

        c(int i10) {
            this.f4866a = i10;
        }

        public static c a(c cVar, c cVar2) {
            return cVar.f() > cVar2.f() ? cVar : cVar2;
        }

        public int f() {
            return this.f4866a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(b6.c cVar) {
        q5.f m10;
        this.f4839b = cVar.d();
        Uri n10 = cVar.n();
        this.f4840c = n10;
        this.f4841d = s(n10);
        this.f4843f = cVar.r();
        this.f4844g = cVar.p();
        this.f4845h = cVar.f();
        this.f4846i = cVar.k();
        if (cVar.m() == null) {
            m10 = q5.f.a();
        } else {
            m10 = cVar.m();
        }
        this.f4847j = m10;
        this.f4848k = cVar.c();
        this.f4849l = cVar.j();
        this.f4850m = cVar.g();
        this.f4851n = cVar.o();
        this.f4852o = cVar.q();
        this.f4853p = cVar.I();
        this.f4854q = cVar.h();
        this.f4855r = cVar.i();
        this.f4856s = cVar.l();
        this.f4857t = cVar.e();
    }

    private static int s(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (g4.f.l(uri)) {
            return 0;
        }
        if (g4.f.j(uri)) {
            return a4.a.c(a4.a.b(uri.getPath())) ? 2 : 3;
        } else if (g4.f.i(uri)) {
            return 4;
        } else {
            if (g4.f.f(uri)) {
                return 5;
            }
            if (g4.f.k(uri)) {
                return 6;
            }
            if (g4.f.e(uri)) {
                return 7;
            }
            return g4.f.m(uri) ? 8 : -1;
        }
    }

    public q5.a a() {
        return this.f4848k;
    }

    public EnumC0091b b() {
        return this.f4839b;
    }

    public int c() {
        return this.f4857t;
    }

    public q5.b d() {
        return this.f4845h;
    }

    public boolean e() {
        return this.f4844g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (f4835u) {
                int i10 = this.f4838a;
                int i11 = bVar.f4838a;
                if (i10 != 0 && i11 != 0 && i10 != i11) {
                    return false;
                }
            }
            if (this.f4844g == bVar.f4844g && this.f4851n == bVar.f4851n && this.f4852o == bVar.f4852o && j.a(this.f4840c, bVar.f4840c) && j.a(this.f4839b, bVar.f4839b) && j.a(this.f4842e, bVar.f4842e) && j.a(this.f4848k, bVar.f4848k) && j.a(this.f4845h, bVar.f4845h) && j.a(this.f4846i, bVar.f4846i) && j.a(this.f4849l, bVar.f4849l) && j.a(this.f4850m, bVar.f4850m) && j.a(this.f4853p, bVar.f4853p) && j.a(this.f4856s, bVar.f4856s) && j.a(this.f4847j, bVar.f4847j)) {
                d dVar = this.f4854q;
                t3.d b10 = dVar != null ? dVar.b() : null;
                d dVar2 = bVar.f4854q;
                return j.a(b10, dVar2 != null ? dVar2.b() : null) && this.f4857t == bVar.f4857t;
            }
            return false;
        }
        return false;
    }

    public c f() {
        return this.f4850m;
    }

    public d g() {
        return this.f4854q;
    }

    public int h() {
        q5.e eVar = this.f4846i;
        if (eVar != null) {
            return eVar.f35946b;
        }
        return 2048;
    }

    public int hashCode() {
        boolean z10 = f4836v;
        int i10 = z10 ? this.f4838a : 0;
        if (i10 == 0) {
            d dVar = this.f4854q;
            i10 = j.b(this.f4839b, this.f4840c, Boolean.valueOf(this.f4844g), this.f4848k, this.f4849l, this.f4850m, Boolean.valueOf(this.f4851n), Boolean.valueOf(this.f4852o), this.f4845h, this.f4853p, this.f4846i, this.f4847j, dVar != null ? dVar.b() : null, this.f4856s, Integer.valueOf(this.f4857t));
            if (z10) {
                this.f4838a = i10;
            }
        }
        return i10;
    }

    public int i() {
        q5.e eVar = this.f4846i;
        if (eVar != null) {
            return eVar.f35945a;
        }
        return 2048;
    }

    public q5.d j() {
        return this.f4849l;
    }

    public boolean k() {
        return this.f4843f;
    }

    public y5.e l() {
        return this.f4855r;
    }

    public q5.e m() {
        return this.f4846i;
    }

    public Boolean n() {
        return this.f4856s;
    }

    public q5.f o() {
        return this.f4847j;
    }

    public synchronized File p() {
        if (this.f4842e == null) {
            this.f4842e = new File(this.f4840c.getPath());
        }
        return this.f4842e;
    }

    public Uri q() {
        return this.f4840c;
    }

    public int r() {
        return this.f4841d;
    }

    public boolean t() {
        return this.f4851n;
    }

    public String toString() {
        return j.c(this).b("uri", this.f4840c).b("cacheChoice", this.f4839b).b("decodeOptions", this.f4845h).b("postprocessor", this.f4854q).b("priority", this.f4849l).b("resizeOptions", this.f4846i).b("rotationOptions", this.f4847j).b("bytesRange", this.f4848k).b("resizingAllowedOverride", this.f4856s).c("progressiveRenderingEnabled", this.f4843f).c("localThumbnailPreviewsEnabled", this.f4844g).b("lowestPermittedRequestLevel", this.f4850m).c("isDiskCacheEnabled", this.f4851n).c("isMemoryCacheEnabled", this.f4852o).b("decodePrefetches", this.f4853p).a("delayMs", this.f4857t).toString();
    }

    public boolean u() {
        return this.f4852o;
    }

    public Boolean v() {
        return this.f4853p;
    }
}
