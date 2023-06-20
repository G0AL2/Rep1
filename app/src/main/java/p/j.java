package p;

import java.util.Arrays;
import p.b;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: m  reason: collision with root package name */
    private static float f35371m = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private int f35372a = 16;

    /* renamed from: b  reason: collision with root package name */
    private int f35373b = 16;

    /* renamed from: c  reason: collision with root package name */
    int[] f35374c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    int[] f35375d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f35376e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    float[] f35377f = new float[16];

    /* renamed from: g  reason: collision with root package name */
    int[] f35378g = new int[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f35379h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int f35380i = 0;

    /* renamed from: j  reason: collision with root package name */
    int f35381j = -1;

    /* renamed from: k  reason: collision with root package name */
    private final b f35382k;

    /* renamed from: l  reason: collision with root package name */
    protected final c f35383l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, c cVar) {
        this.f35382k = bVar;
        this.f35383l = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f35351c % this.f35373b;
        int[] iArr2 = this.f35374c;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f35375d;
                if (iArr[i12] == -1) {
                    break;
                }
                i12 = iArr[i12];
            }
            iArr[i12] = i10;
        }
        this.f35375d[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f35376e[i10] = iVar.f35351c;
        this.f35377f[i10] = f10;
        this.f35378g[i10] = -1;
        this.f35379h[i10] = -1;
        iVar.a(this.f35382k);
        iVar.f35361m++;
        this.f35380i++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f35372a; i10++) {
            if (this.f35376e[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f35372a * 2;
        this.f35376e = Arrays.copyOf(this.f35376e, i10);
        this.f35377f = Arrays.copyOf(this.f35377f, i10);
        this.f35378g = Arrays.copyOf(this.f35378g, i10);
        this.f35379h = Arrays.copyOf(this.f35379h, i10);
        this.f35375d = Arrays.copyOf(this.f35375d, i10);
        for (int i11 = this.f35372a; i11 < i10; i11++) {
            this.f35376e[i11] = -1;
            this.f35375d[i11] = -1;
        }
        this.f35372a = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f35378g[n10] = i10;
            int[] iArr = this.f35379h;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f35378g[n10] = -1;
            if (this.f35380i > 0) {
                this.f35379h[n10] = this.f35381j;
                this.f35381j = n10;
            } else {
                this.f35379h[n10] = -1;
            }
        }
        int[] iArr2 = this.f35379h;
        if (iArr2[n10] != -1) {
            this.f35378g[iArr2[n10]] = n10;
        }
        l(iVar, n10);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10 = iVar.f35351c;
        int i11 = i10 % this.f35373b;
        int[] iArr2 = this.f35374c;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.f35376e[i12] == i10) {
            int[] iArr3 = this.f35375d;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.f35375d;
            if (iArr[i12] == -1 || this.f35376e[iArr[i12]] == i10) {
                break;
            }
            i12 = iArr[i12];
        }
        int i13 = iArr[i12];
        if (i13 == -1 || this.f35376e[i13] != i10) {
            return;
        }
        iArr[i12] = iArr[i13];
        iArr[i13] = -1;
    }

    @Override // p.b.a
    public i a(int i10) {
        int i11 = this.f35380i;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f35381j;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f35383l.f35312d[this.f35376e[i12]];
            }
            i12 = this.f35379h[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p.b.a
    public void b() {
        int i10 = this.f35380i;
        int i11 = this.f35381j;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f35377f;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f35379h[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // p.b.a
    public float c(b bVar, boolean z10) {
        float j10 = j(bVar.f35303a);
        d(bVar.f35303a, z10);
        j jVar = (j) bVar.f35307e;
        int g10 = jVar.g();
        int i10 = 0;
        int i11 = 0;
        while (i10 < g10) {
            int[] iArr = jVar.f35376e;
            if (iArr[i11] != -1) {
                f(this.f35383l.f35312d[iArr[i11]], jVar.f35377f[i11] * j10, z10);
                i10++;
            }
            i11++;
        }
        return j10;
    }

    @Override // p.b.a
    public void clear() {
        int i10 = this.f35380i;
        for (int i11 = 0; i11 < i10; i11++) {
            i a10 = a(i11);
            if (a10 != null) {
                a10.g(this.f35382k);
            }
        }
        for (int i12 = 0; i12 < this.f35372a; i12++) {
            this.f35376e[i12] = -1;
            this.f35375d[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f35373b; i13++) {
            this.f35374c[i13] = -1;
        }
        this.f35380i = 0;
        this.f35381j = -1;
    }

    @Override // p.b.a
    public float d(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f35377f[p10];
        if (this.f35381j == p10) {
            this.f35381j = this.f35379h[p10];
        }
        this.f35376e[p10] = -1;
        int[] iArr = this.f35378g;
        if (iArr[p10] != -1) {
            int[] iArr2 = this.f35379h;
            iArr2[iArr[p10]] = iArr2[p10];
        }
        int[] iArr3 = this.f35379h;
        if (iArr3[p10] != -1) {
            iArr[iArr3[p10]] = iArr[p10];
        }
        this.f35380i--;
        iVar.f35361m--;
        if (z10) {
            iVar.g(this.f35382k);
        }
        return f10;
    }

    @Override // p.b.a
    public void e(i iVar, float f10) {
        float f11 = f35371m;
        if (f10 > (-f11) && f10 < f11) {
            d(iVar, true);
            return;
        }
        if (this.f35380i == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f35381j = 0;
            return;
        }
        int p10 = p(iVar);
        if (p10 != -1) {
            this.f35377f[p10] = f10;
            return;
        }
        if (this.f35380i + 1 >= this.f35372a) {
            o();
        }
        int i10 = this.f35380i;
        int i11 = this.f35381j;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int[] iArr = this.f35376e;
            int i14 = iArr[i11];
            int i15 = iVar.f35351c;
            if (i14 == i15) {
                this.f35377f[i11] = f10;
                return;
            }
            if (iArr[i11] < i15) {
                i12 = i11;
            }
            i11 = this.f35379h[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // p.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f35371m;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                e(iVar, f10);
                return;
            }
            float[] fArr = this.f35377f;
            fArr[p10] = fArr[p10] + f10;
            float f12 = fArr[p10];
            float f13 = f35371m;
            if (f12 <= (-f13) || fArr[p10] >= f13) {
                return;
            }
            fArr[p10] = 0.0f;
            d(iVar, z10);
        }
    }

    @Override // p.b.a
    public int g() {
        return this.f35380i;
    }

    @Override // p.b.a
    public float h(int i10) {
        int i11 = this.f35380i;
        int i12 = this.f35381j;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f35377f[i12];
            }
            i12 = this.f35379h[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p.b.a
    public boolean i(i iVar) {
        return p(iVar) != -1;
    }

    @Override // p.b.a
    public float j(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f35377f[p10];
        }
        return 0.0f;
    }

    @Override // p.b.a
    public void k(float f10) {
        int i10 = this.f35380i;
        int i11 = this.f35381j;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f35377f;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f35379h[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.f35380i != 0 && iVar != null) {
            int i10 = iVar.f35351c;
            int i11 = this.f35374c[i10 % this.f35373b];
            if (i11 == -1) {
                return -1;
            }
            if (this.f35376e[i11] == i10) {
                return i11;
            }
            while (true) {
                iArr = this.f35375d;
                if (iArr[i11] == -1 || this.f35376e[iArr[i11]] == i10) {
                    break;
                }
                i11 = iArr[i11];
            }
            if (iArr[i11] != -1 && this.f35376e[iArr[i11]] == i10) {
                return iArr[i11];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f35380i;
        for (int i11 = 0; i11 < i10; i11++) {
            i a10 = a(i11);
            if (a10 != null) {
                String str2 = str + a10 + " = " + h(i11) + " ";
                int p10 = p(a10);
                String str3 = str2 + "[p: ";
                String str4 = (this.f35378g[p10] != -1 ? str3 + this.f35383l.f35312d[this.f35376e[this.f35378g[p10]]] : str3 + "none") + ", n: ";
                str = (this.f35379h[p10] != -1 ? str4 + this.f35383l.f35312d[this.f35376e[this.f35379h[p10]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
