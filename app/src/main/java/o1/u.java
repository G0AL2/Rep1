package o1;

import androidx.work.u;
import com.chartboost.sdk.impl.o3;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkSpec.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: u */
    public static final m.a<List<c>, List<androidx.work.u>> f34904u;

    /* renamed from: a */
    public final String f34905a;

    /* renamed from: b */
    public u.a f34906b;

    /* renamed from: c */
    public String f34907c;

    /* renamed from: d */
    public String f34908d;

    /* renamed from: e */
    public androidx.work.e f34909e;

    /* renamed from: f */
    public androidx.work.e f34910f;

    /* renamed from: g */
    public long f34911g;

    /* renamed from: h */
    public long f34912h;

    /* renamed from: i */
    public long f34913i;

    /* renamed from: j */
    public androidx.work.c f34914j;

    /* renamed from: k */
    public int f34915k;

    /* renamed from: l */
    public androidx.work.a f34916l;

    /* renamed from: m */
    public long f34917m;

    /* renamed from: n */
    public long f34918n;

    /* renamed from: o */
    public long f34919o;

    /* renamed from: p */
    public long f34920p;

    /* renamed from: q */
    public boolean f34921q;

    /* renamed from: r */
    public androidx.work.p f34922r;

    /* renamed from: s */
    private int f34923s;

    /* renamed from: t */
    private final int f34924t;

    /* compiled from: WorkSpec.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: WorkSpec.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public String f34925a;

        /* renamed from: b */
        public u.a f34926b;

        public b(String str, u.a aVar) {
            qe.k.f(str, "id");
            qe.k.f(aVar, "state");
            this.f34925a = str;
            this.f34926b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return qe.k.a(this.f34925a, bVar.f34925a) && this.f34926b == bVar.f34926b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f34925a.hashCode() * 31) + this.f34926b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f34925a + ", state=" + this.f34926b + ')';
        }
    }

    /* compiled from: WorkSpec.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private String f34927a;

        /* renamed from: b */
        private u.a f34928b;

        /* renamed from: c */
        private androidx.work.e f34929c;

        /* renamed from: d */
        private int f34930d;

        /* renamed from: e */
        private final int f34931e;

        /* renamed from: f */
        private List<String> f34932f;

        /* renamed from: g */
        private List<androidx.work.e> f34933g;

        public c(String str, u.a aVar, androidx.work.e eVar, int i10, int i11, List<String> list, List<androidx.work.e> list2) {
            qe.k.f(str, "id");
            qe.k.f(aVar, "state");
            qe.k.f(eVar, "output");
            qe.k.f(list, "tags");
            qe.k.f(list2, DownloadWorker.KEY_OUT_PROGRESS);
            this.f34927a = str;
            this.f34928b = aVar;
            this.f34929c = eVar;
            this.f34930d = i10;
            this.f34931e = i11;
            this.f34932f = list;
            this.f34933g = list2;
        }

        public final androidx.work.u a() {
            return new androidx.work.u(UUID.fromString(this.f34927a), this.f34928b, this.f34929c, this.f34932f, this.f34933g.isEmpty() ^ true ? this.f34933g.get(0) : androidx.work.e.f4450c, this.f34930d, this.f34931e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return qe.k.a(this.f34927a, cVar.f34927a) && this.f34928b == cVar.f34928b && qe.k.a(this.f34929c, cVar.f34929c) && this.f34930d == cVar.f34930d && this.f34931e == cVar.f34931e && qe.k.a(this.f34932f, cVar.f34932f) && qe.k.a(this.f34933g, cVar.f34933g);
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((this.f34927a.hashCode() * 31) + this.f34928b.hashCode()) * 31) + this.f34929c.hashCode()) * 31) + this.f34930d) * 31) + this.f34931e) * 31) + this.f34932f.hashCode()) * 31) + this.f34933g.hashCode();
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f34927a + ", state=" + this.f34928b + ", output=" + this.f34929c + ", runAttemptCount=" + this.f34930d + ", generation=" + this.f34931e + ", tags=" + this.f34932f + ", progress=" + this.f34933g + ')';
        }
    }

    static {
        new a(null);
        qe.k.e(androidx.work.l.i("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        f34904u = new m.a() { // from class: o1.t
            @Override // m.a
            public final Object apply(Object obj) {
                return u.a((List) obj);
            }
        };
    }

    public u(String str, u.a aVar, String str2, String str3, androidx.work.e eVar, androidx.work.e eVar2, long j10, long j11, long j12, androidx.work.c cVar, int i10, androidx.work.a aVar2, long j13, long j14, long j15, long j16, boolean z10, androidx.work.p pVar, int i11, int i12) {
        qe.k.f(str, "id");
        qe.k.f(aVar, "state");
        qe.k.f(str2, "workerClassName");
        qe.k.f(eVar, "input");
        qe.k.f(eVar2, "output");
        qe.k.f(cVar, "constraints");
        qe.k.f(aVar2, "backoffPolicy");
        qe.k.f(pVar, "outOfQuotaPolicy");
        this.f34905a = str;
        this.f34906b = aVar;
        this.f34907c = str2;
        this.f34908d = str3;
        this.f34909e = eVar;
        this.f34910f = eVar2;
        this.f34911g = j10;
        this.f34912h = j11;
        this.f34913i = j12;
        this.f34914j = cVar;
        this.f34915k = i10;
        this.f34916l = aVar2;
        this.f34917m = j13;
        this.f34918n = j14;
        this.f34919o = j15;
        this.f34920p = j16;
        this.f34921q = z10;
        this.f34922r = pVar;
        this.f34923s = i11;
        this.f34924t = i12;
    }

    public static /* synthetic */ List a(List list) {
        return b(list);
    }

    public static final List b(List list) {
        int p10;
        if (list != null) {
            p10 = fe.q.p(list, 10);
            ArrayList arrayList = new ArrayList(p10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((c) it.next()).a());
            }
            return arrayList;
        }
        return null;
    }

    public final long c() {
        long scalb;
        long e10;
        if (i()) {
            if (this.f34916l == androidx.work.a.LINEAR) {
                scalb = this.f34917m * this.f34915k;
            } else {
                scalb = Math.scalb((float) this.f34917m, this.f34915k - 1);
            }
            long j10 = this.f34918n;
            e10 = se.f.e(scalb, 18000000L);
            return j10 + e10;
        }
        if (j()) {
            int i10 = this.f34923s;
            long j11 = this.f34918n;
            if (i10 == 0) {
                j11 += this.f34911g;
            }
            long j12 = this.f34913i;
            long j13 = this.f34912h;
            if (j12 != j13) {
                r3 = i10 == 0 ? (-1) * j12 : 0L;
                j11 += j13;
            } else if (i10 != 0) {
                r3 = j13;
            }
            return j11 + r3;
        }
        long j14 = this.f34918n;
        if (j14 == 0) {
            j14 = System.currentTimeMillis();
        }
        return this.f34911g + j14;
    }

    public final u d(String str, u.a aVar, String str2, String str3, androidx.work.e eVar, androidx.work.e eVar2, long j10, long j11, long j12, androidx.work.c cVar, int i10, androidx.work.a aVar2, long j13, long j14, long j15, long j16, boolean z10, androidx.work.p pVar, int i11, int i12) {
        qe.k.f(str, "id");
        qe.k.f(aVar, "state");
        qe.k.f(str2, "workerClassName");
        qe.k.f(eVar, "input");
        qe.k.f(eVar2, "output");
        qe.k.f(cVar, "constraints");
        qe.k.f(aVar2, "backoffPolicy");
        qe.k.f(pVar, "outOfQuotaPolicy");
        return new u(str, aVar, str2, str3, eVar, eVar2, j10, j11, j12, cVar, i10, aVar2, j13, j14, j15, j16, z10, pVar, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return qe.k.a(this.f34905a, uVar.f34905a) && this.f34906b == uVar.f34906b && qe.k.a(this.f34907c, uVar.f34907c) && qe.k.a(this.f34908d, uVar.f34908d) && qe.k.a(this.f34909e, uVar.f34909e) && qe.k.a(this.f34910f, uVar.f34910f) && this.f34911g == uVar.f34911g && this.f34912h == uVar.f34912h && this.f34913i == uVar.f34913i && qe.k.a(this.f34914j, uVar.f34914j) && this.f34915k == uVar.f34915k && this.f34916l == uVar.f34916l && this.f34917m == uVar.f34917m && this.f34918n == uVar.f34918n && this.f34919o == uVar.f34919o && this.f34920p == uVar.f34920p && this.f34921q == uVar.f34921q && this.f34922r == uVar.f34922r && this.f34923s == uVar.f34923s && this.f34924t == uVar.f34924t;
        }
        return false;
    }

    public final int f() {
        return this.f34924t;
    }

    public final int g() {
        return this.f34923s;
    }

    public final boolean h() {
        return !qe.k.a(androidx.work.c.f4430i, this.f34914j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f34905a.hashCode() * 31) + this.f34906b.hashCode()) * 31) + this.f34907c.hashCode()) * 31;
        String str = this.f34908d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f34909e.hashCode()) * 31) + this.f34910f.hashCode()) * 31) + o3.a(this.f34911g)) * 31) + o3.a(this.f34912h)) * 31) + o3.a(this.f34913i)) * 31) + this.f34914j.hashCode()) * 31) + this.f34915k) * 31) + this.f34916l.hashCode()) * 31) + o3.a(this.f34917m)) * 31) + o3.a(this.f34918n)) * 31) + o3.a(this.f34919o)) * 31) + o3.a(this.f34920p)) * 31;
        boolean z10 = this.f34921q;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((hashCode2 + i10) * 31) + this.f34922r.hashCode()) * 31) + this.f34923s) * 31) + this.f34924t;
    }

    public final boolean i() {
        return this.f34906b == u.a.ENQUEUED && this.f34915k > 0;
    }

    public final boolean j() {
        return this.f34912h != 0;
    }

    public String toString() {
        return "{WorkSpec: " + this.f34905a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ u(java.lang.String r31, androidx.work.u.a r32, java.lang.String r33, java.lang.String r34, androidx.work.e r35, androidx.work.e r36, long r37, long r39, long r41, androidx.work.c r43, int r44, androidx.work.a r45, long r46, long r48, long r50, long r52, boolean r54, androidx.work.p r55, int r56, int r57, int r58, qe.g r59) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.u.<init>(java.lang.String, androidx.work.u$a, java.lang.String, java.lang.String, androidx.work.e, androidx.work.e, long, long, long, androidx.work.c, int, androidx.work.a, long, long, long, long, boolean, androidx.work.p, int, int, int, qe.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String str, String str2) {
        this(str, null, str2, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 1048570, null);
        qe.k.f(str, "id");
        qe.k.f(str2, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(String str, u uVar) {
        this(str, uVar.f34906b, uVar.f34907c, uVar.f34908d, new androidx.work.e(uVar.f34909e), new androidx.work.e(uVar.f34910f), uVar.f34911g, uVar.f34912h, uVar.f34913i, new androidx.work.c(uVar.f34914j), uVar.f34915k, uVar.f34916l, uVar.f34917m, uVar.f34918n, uVar.f34919o, uVar.f34920p, uVar.f34921q, uVar.f34922r, uVar.f34923s, 0, 524288, null);
        qe.k.f(str, "newId");
        qe.k.f(uVar, InneractiveMediationNameConsts.OTHER);
    }
}
