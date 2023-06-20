package p;

import java.util.Arrays;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class i implements Comparable<i> {

    /* renamed from: q  reason: collision with root package name */
    private static int f35348q = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f35349a;

    /* renamed from: b  reason: collision with root package name */
    private String f35350b;

    /* renamed from: f  reason: collision with root package name */
    public float f35354f;

    /* renamed from: j  reason: collision with root package name */
    a f35358j;

    /* renamed from: c  reason: collision with root package name */
    public int f35351c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f35352d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f35353e = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f35355g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f35356h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f35357i = new float[9];

    /* renamed from: k  reason: collision with root package name */
    b[] f35359k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    int f35360l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f35361m = 0;

    /* renamed from: n  reason: collision with root package name */
    boolean f35362n = false;

    /* renamed from: o  reason: collision with root package name */
    int f35363o = -1;

    /* renamed from: p  reason: collision with root package name */
    float f35364p = 0.0f;

    /* compiled from: SolverVariable.java */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f35358j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f() {
        f35348q++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f35360l;
            if (i10 < i11) {
                if (this.f35359k[i10] == bVar) {
                    return;
                }
                i10++;
            } else {
                b[] bVarArr = this.f35359k;
                if (i11 >= bVarArr.length) {
                    this.f35359k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f35359k;
                int i12 = this.f35360l;
                bVarArr2[i12] = bVar;
                this.f35360l = i12 + 1;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(i iVar) {
        return this.f35351c - iVar.f35351c;
    }

    public final void g(b bVar) {
        int i10 = this.f35360l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f35359k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f35359k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f35360l--;
                return;
            }
            i11++;
        }
    }

    public void h() {
        this.f35350b = null;
        this.f35358j = a.UNKNOWN;
        this.f35353e = 0;
        this.f35351c = -1;
        this.f35352d = -1;
        this.f35354f = 0.0f;
        this.f35355g = false;
        this.f35362n = false;
        this.f35363o = -1;
        this.f35364p = 0.0f;
        int i10 = this.f35360l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35359k[i11] = null;
        }
        this.f35360l = 0;
        this.f35361m = 0;
        this.f35349a = false;
        Arrays.fill(this.f35357i, 0.0f);
    }

    public void i(d dVar, float f10) {
        this.f35354f = f10;
        this.f35355g = true;
        this.f35362n = false;
        this.f35363o = -1;
        this.f35364p = 0.0f;
        int i10 = this.f35360l;
        this.f35352d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35359k[i11].A(dVar, this, false);
        }
        this.f35360l = 0;
    }

    public void j(a aVar, String str) {
        this.f35358j = aVar;
    }

    public final void k(d dVar, b bVar) {
        int i10 = this.f35360l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35359k[i11].B(dVar, bVar, false);
        }
        this.f35360l = 0;
    }

    public String toString() {
        if (this.f35350b != null) {
            return "" + this.f35350b;
        }
        return "" + this.f35351c;
    }
}
