package ba;

import android.os.SystemClock;
import ea.n0;
import i9.w0;
import j8.p1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: BaseTrackSelection.java */
/* loaded from: classes2.dex */
public abstract class c implements q {

    /* renamed from: a */
    protected final w0 f5048a;

    /* renamed from: b */
    protected final int f5049b;

    /* renamed from: c */
    protected final int[] f5050c;

    /* renamed from: d */
    private final p1[] f5051d;

    /* renamed from: e */
    private final long[] f5052e;

    /* renamed from: f */
    private int f5053f;

    public c(w0 w0Var, int... iArr) {
        this(w0Var, iArr, 0);
    }

    public static /* synthetic */ int t(p1 p1Var, p1 p1Var2) {
        return u(p1Var, p1Var2);
    }

    public static /* synthetic */ int u(p1 p1Var, p1 p1Var2) {
        return p1Var2.f32705h - p1Var.f32705h;
    }

    @Override // ba.q
    public boolean b(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean c10 = c(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f5049b && !c10) {
            c10 = (i11 == i10 || c(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (c10) {
            long[] jArr = this.f5052e;
            jArr[i10] = Math.max(jArr[i10], n0.b(elapsedRealtime, j10, Long.MAX_VALUE));
            return true;
        }
        return false;
    }

    @Override // ba.q
    public boolean c(int i10, long j10) {
        return this.f5052e[i10] > j10;
    }

    @Override // ba.t
    public final p1 d(int i10) {
        return this.f5051d[i10];
    }

    @Override // ba.q
    public void disable() {
    }

    @Override // ba.t
    public final int e(int i10) {
        return this.f5050c[i10];
    }

    @Override // ba.q
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5048a == cVar.f5048a && Arrays.equals(this.f5050c, cVar.f5050c);
    }

    @Override // ba.q
    public void f(float f10) {
    }

    @Override // ba.q
    public /* synthetic */ void h() {
        p.a(this);
    }

    public int hashCode() {
        if (this.f5053f == 0) {
            this.f5053f = (System.identityHashCode(this.f5048a) * 31) + Arrays.hashCode(this.f5050c);
        }
        return this.f5053f;
    }

    @Override // ba.t
    public final int i(int i10) {
        for (int i11 = 0; i11 < this.f5049b; i11++) {
            if (this.f5050c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // ba.t
    public final w0 k() {
        return this.f5048a;
    }

    @Override // ba.q
    public /* synthetic */ void l(boolean z10) {
        p.b(this, z10);
    }

    @Override // ba.t
    public final int length() {
        return this.f5050c.length;
    }

    @Override // ba.q
    public int m(long j10, List<? extends k9.n> list) {
        return list.size();
    }

    @Override // ba.q
    public final int n() {
        return this.f5050c[a()];
    }

    @Override // ba.t
    public final int o(p1 p1Var) {
        for (int i10 = 0; i10 < this.f5049b; i10++) {
            if (this.f5051d[i10] == p1Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // ba.q
    public final p1 p() {
        return this.f5051d[a()];
    }

    @Override // ba.q
    public /* synthetic */ boolean r(long j10, k9.f fVar, List list) {
        return p.d(this, j10, fVar, list);
    }

    @Override // ba.q
    public /* synthetic */ void s() {
        p.c(this);
    }

    public c(w0 w0Var, int[] iArr, int i10) {
        int i11 = 0;
        ea.a.f(iArr.length > 0);
        this.f5048a = (w0) ea.a.e(w0Var);
        int length = iArr.length;
        this.f5049b = length;
        this.f5051d = new p1[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f5051d[i12] = w0Var.c(iArr[i12]);
        }
        Arrays.sort(this.f5051d, new Comparator() { // from class: ba.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.t((p1) obj, (p1) obj2);
            }
        });
        this.f5050c = new int[this.f5049b];
        while (true) {
            int i13 = this.f5049b;
            if (i11 < i13) {
                this.f5050c[i11] = w0Var.d(this.f5051d[i11]);
                i11++;
            } else {
                this.f5052e = new long[i13];
                return;
            }
        }
    }
}
