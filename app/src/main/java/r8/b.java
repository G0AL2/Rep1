package r8;

import java.io.IOException;
import java.util.Objects;
import p8.a;
import p8.j;
import p8.o;
import p8.r;

/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes2.dex */
final class b extends p8.a {

    /* compiled from: FlacBinarySearchSeeker.java */
    /* renamed from: r8.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0489b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final r f36462a;

        /* renamed from: b  reason: collision with root package name */
        private final int f36463b;

        /* renamed from: c  reason: collision with root package name */
        private final o.a f36464c;

        private long c(j jVar) throws IOException {
            while (jVar.i() < jVar.b() - 6 && !o.h(jVar, this.f36462a, this.f36463b, this.f36464c)) {
                jVar.j(1);
            }
            if (jVar.i() >= jVar.b() - 6) {
                jVar.j((int) (jVar.b() - jVar.i()));
                return this.f36462a.f35687j;
            }
            return this.f36464c.f35674a;
        }

        @Override // p8.a.f
        public a.e a(j jVar, long j10) throws IOException {
            long position = jVar.getPosition();
            long c10 = c(jVar);
            long i10 = jVar.i();
            jVar.j(Math.max(6, this.f36462a.f35680c));
            long c11 = c(jVar);
            long i11 = jVar.i();
            if (c10 > j10 || c11 <= j10) {
                if (c11 <= j10) {
                    return a.e.f(c11, i11);
                }
                return a.e.d(c10, position);
            }
            return a.e.e(i10);
        }

        @Override // p8.a.f
        public /* synthetic */ void b() {
            p8.b.a(this);
        }

        private C0489b(r rVar, int i10) {
            this.f36462a = rVar;
            this.f36463b = i10;
            this.f36464c = new o.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final r rVar, int i10, long j10, long j11) {
        super(new a.d() { // from class: r8.a
            @Override // p8.a.d
            public final long a(long j12) {
                return r.this.i(j12);
            }
        }, new C0489b(rVar, i10), rVar.f(), 0L, rVar.f35687j, j10, j11, rVar.d(), Math.max(6, rVar.f35680c));
        Objects.requireNonNull(rVar);
    }
}
