package b6;

import android.net.Uri;
import b6.b;
import r5.i;
import y3.k;

/* compiled from: ImageRequestBuilder.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: n  reason: collision with root package name */
    private y5.e f4880n;

    /* renamed from: q  reason: collision with root package name */
    private int f4883q;

    /* renamed from: a  reason: collision with root package name */
    private Uri f4867a = null;

    /* renamed from: b  reason: collision with root package name */
    private b.c f4868b = b.c.FULL_FETCH;

    /* renamed from: c  reason: collision with root package name */
    private q5.e f4869c = null;

    /* renamed from: d  reason: collision with root package name */
    private q5.f f4870d = null;

    /* renamed from: e  reason: collision with root package name */
    private q5.b f4871e = q5.b.a();

    /* renamed from: f  reason: collision with root package name */
    private b.EnumC0091b f4872f = b.EnumC0091b.DEFAULT;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4873g = i.F().a();

    /* renamed from: h  reason: collision with root package name */
    private boolean f4874h = false;

    /* renamed from: i  reason: collision with root package name */
    private q5.d f4875i = q5.d.HIGH;

    /* renamed from: j  reason: collision with root package name */
    private d f4876j = null;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4877k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4878l = true;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f4879m = null;

    /* renamed from: o  reason: collision with root package name */
    private q5.a f4881o = null;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f4882p = null;

    /* compiled from: ImageRequestBuilder.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private c() {
    }

    public static c b(b bVar) {
        return s(bVar.q()).x(bVar.d()).u(bVar.a()).v(bVar.b()).y(bVar.e()).z(bVar.f()).A(bVar.g()).B(bVar.k()).D(bVar.j()).E(bVar.m()).C(bVar.l()).F(bVar.o()).G(bVar.v()).w(bVar.c());
    }

    public static c s(Uri uri) {
        return new c().H(uri);
    }

    public c A(d dVar) {
        this.f4876j = dVar;
        return this;
    }

    public c B(boolean z10) {
        this.f4873g = z10;
        return this;
    }

    public c C(y5.e eVar) {
        this.f4880n = eVar;
        return this;
    }

    public c D(q5.d dVar) {
        this.f4875i = dVar;
        return this;
    }

    public c E(q5.e eVar) {
        this.f4869c = eVar;
        return this;
    }

    public c F(q5.f fVar) {
        this.f4870d = fVar;
        return this;
    }

    public c G(Boolean bool) {
        this.f4879m = bool;
        return this;
    }

    public c H(Uri uri) {
        k.g(uri);
        this.f4867a = uri;
        return this;
    }

    public Boolean I() {
        return this.f4879m;
    }

    protected void J() {
        Uri uri = this.f4867a;
        if (uri != null) {
            if (g4.f.k(uri)) {
                if (this.f4867a.isAbsolute()) {
                    if (!this.f4867a.getPath().isEmpty()) {
                        try {
                            Integer.parseInt(this.f4867a.getPath().substring(1));
                        } catch (NumberFormatException unused) {
                            throw new a("Resource URI path must be a resource id.");
                        }
                    } else {
                        throw new a("Resource URI must not be empty");
                    }
                } else {
                    throw new a("Resource URI path must be absolute.");
                }
            }
            if (g4.f.f(this.f4867a) && !this.f4867a.isAbsolute()) {
                throw new a("Asset URI path must be absolute.");
            }
            return;
        }
        throw new a("Source must be set!");
    }

    public b a() {
        J();
        return new b(this);
    }

    public q5.a c() {
        return this.f4881o;
    }

    public b.EnumC0091b d() {
        return this.f4872f;
    }

    public int e() {
        return this.f4883q;
    }

    public q5.b f() {
        return this.f4871e;
    }

    public b.c g() {
        return this.f4868b;
    }

    public d h() {
        return this.f4876j;
    }

    public y5.e i() {
        return this.f4880n;
    }

    public q5.d j() {
        return this.f4875i;
    }

    public q5.e k() {
        return this.f4869c;
    }

    public Boolean l() {
        return this.f4882p;
    }

    public q5.f m() {
        return this.f4870d;
    }

    public Uri n() {
        return this.f4867a;
    }

    public boolean o() {
        return this.f4877k && g4.f.l(this.f4867a);
    }

    public boolean p() {
        return this.f4874h;
    }

    public boolean q() {
        return this.f4878l;
    }

    public boolean r() {
        return this.f4873g;
    }

    @Deprecated
    public c t(boolean z10) {
        if (z10) {
            return F(q5.f.a());
        }
        return F(q5.f.d());
    }

    public c u(q5.a aVar) {
        this.f4881o = aVar;
        return this;
    }

    public c v(b.EnumC0091b enumC0091b) {
        this.f4872f = enumC0091b;
        return this;
    }

    public c w(int i10) {
        this.f4883q = i10;
        return this;
    }

    public c x(q5.b bVar) {
        this.f4871e = bVar;
        return this;
    }

    public c y(boolean z10) {
        this.f4874h = z10;
        return this;
    }

    public c z(b.c cVar) {
        this.f4868b = cVar;
        return this;
    }
}
