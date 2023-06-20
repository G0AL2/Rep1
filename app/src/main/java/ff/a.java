package ff;

import mf.h;
import qe.g;
import qe.k;
import ye.t;

/* compiled from: HeadersReader.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private long f30332a;

    /* renamed from: b  reason: collision with root package name */
    private final h f30333b;

    /* compiled from: HeadersReader.kt */
    /* renamed from: ff.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0385a {
        private C0385a() {
        }

        public /* synthetic */ C0385a(g gVar) {
            this();
        }
    }

    static {
        new C0385a(null);
    }

    public a(h hVar) {
        k.f(hVar, "source");
        this.f30333b = hVar;
        this.f30332a = 262144;
    }

    public final t a() {
        t.a aVar = new t.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.d();
            }
            aVar.b(b10);
        }
    }

    public final String b() {
        String F = this.f30333b.F(this.f30332a);
        this.f30332a -= F.length();
        return F;
    }
}
