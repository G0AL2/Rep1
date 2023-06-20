package androidx.work;

import android.net.Uri;
import android.os.Build;
import fe.m0;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Constraints.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f4430i;

    /* renamed from: a  reason: collision with root package name */
    private final m f4431a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4432b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4433c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4434d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4435e;

    /* renamed from: f  reason: collision with root package name */
    private final long f4436f;

    /* renamed from: g  reason: collision with root package name */
    private final long f4437g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<C0082c> f4438h;

    /* compiled from: Constraints.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f4439a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f4440b;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4442d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4443e;

        /* renamed from: c  reason: collision with root package name */
        private m f4441c = m.NOT_REQUIRED;

        /* renamed from: f  reason: collision with root package name */
        private long f4444f = -1;

        /* renamed from: g  reason: collision with root package name */
        private long f4445g = -1;

        /* renamed from: h  reason: collision with root package name */
        private Set<C0082c> f4446h = new LinkedHashSet();

        public final c a() {
            Set d10;
            long j10;
            long j11;
            Set set;
            Set Q;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                Q = fe.x.Q(this.f4446h);
                set = Q;
                j10 = this.f4444f;
                j11 = this.f4445g;
            } else {
                d10 = m0.d();
                j10 = -1;
                j11 = -1;
                set = d10;
            }
            return new c(this.f4441c, this.f4439a, i10 >= 23 && this.f4440b, this.f4442d, this.f4443e, j10, j11, set);
        }

        public final a b(m mVar) {
            qe.k.f(mVar, "networkType");
            this.f4441c = mVar;
            return this;
        }

        public final a c(boolean z10) {
            this.f4443e = z10;
            return this;
        }
    }

    /* compiled from: Constraints.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    /* compiled from: Constraints.kt */
    /* renamed from: androidx.work.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0082c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f4447a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f4448b;

        public C0082c(Uri uri, boolean z10) {
            qe.k.f(uri, "uri");
            this.f4447a = uri;
            this.f4448b = z10;
        }

        public final Uri a() {
            return this.f4447a;
        }

        public final boolean b() {
            return this.f4448b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (qe.k.a(C0082c.class, obj != null ? obj.getClass() : null)) {
                qe.k.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                C0082c c0082c = (C0082c) obj;
                return qe.k.a(this.f4447a, c0082c.f4447a) && this.f4448b == c0082c.f4448b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f4447a.hashCode() * 31) + d.a(this.f4448b);
        }
    }

    static {
        new b(null);
        f4430i = new c(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    public c() {
        this(null, false, false, false, false, 0L, 0L, null, 255, null);
    }

    public c(m mVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<C0082c> set) {
        qe.k.f(mVar, "requiredNetworkType");
        qe.k.f(set, "contentUriTriggers");
        this.f4431a = mVar;
        this.f4432b = z10;
        this.f4433c = z11;
        this.f4434d = z12;
        this.f4435e = z13;
        this.f4436f = j10;
        this.f4437g = j11;
        this.f4438h = set;
    }

    public final long a() {
        return this.f4437g;
    }

    public final long b() {
        return this.f4436f;
    }

    public final Set<C0082c> c() {
        return this.f4438h;
    }

    public final m d() {
        return this.f4431a;
    }

    public final boolean e() {
        return !this.f4438h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !qe.k.a(c.class, obj.getClass())) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4432b == cVar.f4432b && this.f4433c == cVar.f4433c && this.f4434d == cVar.f4434d && this.f4435e == cVar.f4435e && this.f4436f == cVar.f4436f && this.f4437g == cVar.f4437g && this.f4431a == cVar.f4431a) {
            return qe.k.a(this.f4438h, cVar.f4438h);
        }
        return false;
    }

    public final boolean f() {
        return this.f4434d;
    }

    public final boolean g() {
        return this.f4432b;
    }

    public final boolean h() {
        return this.f4433c;
    }

    public int hashCode() {
        long j10 = this.f4436f;
        long j11 = this.f4437g;
        return (((((((((((((this.f4431a.hashCode() * 31) + (this.f4432b ? 1 : 0)) * 31) + (this.f4433c ? 1 : 0)) * 31) + (this.f4434d ? 1 : 0)) * 31) + (this.f4435e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f4438h.hashCode();
    }

    public final boolean i() {
        return this.f4435e;
    }

    public /* synthetic */ c(m mVar, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, qe.g gVar) {
        this((i10 & 1) != 0 ? m.NOT_REQUIRED : mVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) == 0 ? z13 : false, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) == 0 ? j11 : -1L, (i10 & 128) != 0 ? m0.d() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(androidx.work.c r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            qe.k.f(r13, r0)
            boolean r3 = r13.f4432b
            boolean r4 = r13.f4433c
            androidx.work.m r2 = r13.f4431a
            boolean r5 = r13.f4434d
            boolean r6 = r13.f4435e
            java.util.Set<androidx.work.c$c> r11 = r13.f4438h
            long r7 = r13.f4436f
            long r9 = r13.f4437g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.c.<init>(androidx.work.c):void");
    }
}
