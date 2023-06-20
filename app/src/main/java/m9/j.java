package m9;

import android.net.Uri;
import j8.p1;
import java.util.Collections;
import java.util.List;
import jb.s;
import m9.k;

/* compiled from: Representation.java */
/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f34379a;

    /* renamed from: b  reason: collision with root package name */
    public final s<m9.b> f34380b;

    /* renamed from: c  reason: collision with root package name */
    public final long f34381c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f34382d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f34383e;

    /* renamed from: f  reason: collision with root package name */
    public final List<e> f34384f;

    /* renamed from: g  reason: collision with root package name */
    private final i f34385g;

    /* compiled from: Representation.java */
    /* loaded from: classes2.dex */
    public static class b extends j implements l9.f {

        /* renamed from: h  reason: collision with root package name */
        final k.a f34386h;

        public b(long j10, p1 p1Var, List<m9.b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j10, p1Var, list, aVar, list2, list3, list4);
            this.f34386h = aVar;
        }

        @Override // m9.j
        public String a() {
            return null;
        }

        @Override // l9.f
        public long b(long j10) {
            return this.f34386h.j(j10);
        }

        @Override // l9.f
        public long c(long j10, long j11) {
            return this.f34386h.h(j10, j11);
        }

        @Override // l9.f
        public long d(long j10, long j11) {
            return this.f34386h.d(j10, j11);
        }

        @Override // l9.f
        public long e(long j10, long j11) {
            return this.f34386h.f(j10, j11);
        }

        @Override // l9.f
        public i f(long j10) {
            return this.f34386h.k(this, j10);
        }

        @Override // l9.f
        public long g(long j10, long j11) {
            return this.f34386h.i(j10, j11);
        }

        @Override // l9.f
        public long h(long j10) {
            return this.f34386h.g(j10);
        }

        @Override // l9.f
        public boolean i() {
            return this.f34386h.l();
        }

        @Override // l9.f
        public long j() {
            return this.f34386h.e();
        }

        @Override // l9.f
        public long k(long j10, long j11) {
            return this.f34386h.c(j10, j11);
        }

        @Override // m9.j
        public l9.f l() {
            return this;
        }

        @Override // m9.j
        public i m() {
            return null;
        }
    }

    /* compiled from: Representation.java */
    /* loaded from: classes2.dex */
    public static class c extends j {

        /* renamed from: h  reason: collision with root package name */
        private final String f34387h;

        /* renamed from: i  reason: collision with root package name */
        private final i f34388i;

        /* renamed from: j  reason: collision with root package name */
        private final m f34389j;

        public c(long j10, p1 p1Var, List<m9.b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
            super(j10, p1Var, list, eVar, list2, list3, list4);
            Uri.parse(list.get(0).f34328a);
            i c10 = eVar.c();
            this.f34388i = c10;
            this.f34387h = str;
            this.f34389j = c10 != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // m9.j
        public String a() {
            return this.f34387h;
        }

        @Override // m9.j
        public l9.f l() {
            return this.f34389j;
        }

        @Override // m9.j
        public i m() {
            return this.f34388i;
        }
    }

    public static j o(long j10, p1 p1Var, List<m9.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, p1Var, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, p1Var, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract l9.f l();

    public abstract i m();

    public i n() {
        return this.f34385g;
    }

    private j(long j10, p1 p1Var, List<m9.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        List<e> unmodifiableList;
        ea.a.a(!list.isEmpty());
        this.f34379a = p1Var;
        this.f34380b = s.p(list);
        if (list2 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.f34382d = unmodifiableList;
        this.f34383e = list3;
        this.f34384f = list4;
        this.f34385g = kVar.a(this);
        this.f34381c = kVar.b();
    }
}
