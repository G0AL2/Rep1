package p;

import java.util.Arrays;
import p.b;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f35291l = 0.001f;

    /* renamed from: b  reason: collision with root package name */
    private final b f35293b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f35294c;

    /* renamed from: a  reason: collision with root package name */
    int f35292a = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f35295d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f35296e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f35297f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f35298g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f35299h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f35300i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f35301j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f35302k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f35293b = bVar;
        this.f35294c = cVar;
    }

    @Override // p.b.a
    public i a(int i10) {
        int i11 = this.f35300i;
        for (int i12 = 0; i11 != -1 && i12 < this.f35292a; i12++) {
            if (i12 == i10) {
                return this.f35294c.f35312d[this.f35297f[i11]];
            }
            i11 = this.f35298g[i11];
        }
        return null;
    }

    @Override // p.b.a
    public void b() {
        int i10 = this.f35300i;
        for (int i11 = 0; i10 != -1 && i11 < this.f35292a; i11++) {
            float[] fArr = this.f35299h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f35298g[i10];
        }
    }

    @Override // p.b.a
    public float c(b bVar, boolean z10) {
        float j10 = j(bVar.f35303a);
        d(bVar.f35303a, z10);
        b.a aVar = bVar.f35307e;
        int g10 = aVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            i a10 = aVar.a(i10);
            f(a10, aVar.j(a10) * j10, z10);
        }
        return j10;
    }

    @Override // p.b.a
    public final void clear() {
        int i10 = this.f35300i;
        for (int i11 = 0; i10 != -1 && i11 < this.f35292a; i11++) {
            i iVar = this.f35294c.f35312d[this.f35297f[i10]];
            if (iVar != null) {
                iVar.g(this.f35293b);
            }
            i10 = this.f35298g[i10];
        }
        this.f35300i = -1;
        this.f35301j = -1;
        this.f35302k = false;
        this.f35292a = 0;
    }

    @Override // p.b.a
    public final float d(i iVar, boolean z10) {
        if (this.f35296e == iVar) {
            this.f35296e = null;
        }
        int i10 = this.f35300i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f35292a) {
            if (this.f35297f[i10] == iVar.f35351c) {
                if (i10 == this.f35300i) {
                    this.f35300i = this.f35298g[i10];
                } else {
                    int[] iArr = this.f35298g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.g(this.f35293b);
                }
                iVar.f35361m--;
                this.f35292a--;
                this.f35297f[i10] = -1;
                if (this.f35302k) {
                    this.f35301j = i10;
                }
                return this.f35299h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f35298g[i10];
        }
        return 0.0f;
    }

    @Override // p.b.a
    public final void e(i iVar, float f10) {
        if (f10 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i10 = this.f35300i;
        if (i10 == -1) {
            this.f35300i = 0;
            this.f35299h[0] = f10;
            this.f35297f[0] = iVar.f35351c;
            this.f35298g[0] = -1;
            iVar.f35361m++;
            iVar.a(this.f35293b);
            this.f35292a++;
            if (this.f35302k) {
                return;
            }
            int i11 = this.f35301j + 1;
            this.f35301j = i11;
            int[] iArr = this.f35297f;
            if (i11 >= iArr.length) {
                this.f35302k = true;
                this.f35301j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f35292a; i13++) {
            int[] iArr2 = this.f35297f;
            int i14 = iArr2[i10];
            int i15 = iVar.f35351c;
            if (i14 == i15) {
                this.f35299h[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f35298g[i10];
        }
        int i16 = this.f35301j;
        int i17 = i16 + 1;
        if (this.f35302k) {
            int[] iArr3 = this.f35297f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f35297f;
        if (i16 >= iArr4.length && this.f35292a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f35297f;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f35297f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f35295d * 2;
            this.f35295d = i19;
            this.f35302k = false;
            this.f35301j = i16 - 1;
            this.f35299h = Arrays.copyOf(this.f35299h, i19);
            this.f35297f = Arrays.copyOf(this.f35297f, this.f35295d);
            this.f35298g = Arrays.copyOf(this.f35298g, this.f35295d);
        }
        this.f35297f[i16] = iVar.f35351c;
        this.f35299h[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f35298g;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f35298g[i16] = this.f35300i;
            this.f35300i = i16;
        }
        iVar.f35361m++;
        iVar.a(this.f35293b);
        int i20 = this.f35292a + 1;
        this.f35292a = i20;
        if (!this.f35302k) {
            this.f35301j++;
        }
        int[] iArr8 = this.f35297f;
        if (i20 >= iArr8.length) {
            this.f35302k = true;
        }
        if (this.f35301j >= iArr8.length) {
            this.f35302k = true;
            this.f35301j = iArr8.length - 1;
        }
    }

    @Override // p.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f35291l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f35300i;
            if (i10 == -1) {
                this.f35300i = 0;
                this.f35299h[0] = f10;
                this.f35297f[0] = iVar.f35351c;
                this.f35298g[0] = -1;
                iVar.f35361m++;
                iVar.a(this.f35293b);
                this.f35292a++;
                if (this.f35302k) {
                    return;
                }
                int i11 = this.f35301j + 1;
                this.f35301j = i11;
                int[] iArr = this.f35297f;
                if (i11 >= iArr.length) {
                    this.f35302k = true;
                    this.f35301j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f35292a; i13++) {
                int[] iArr2 = this.f35297f;
                int i14 = iArr2[i10];
                int i15 = iVar.f35351c;
                if (i14 == i15) {
                    float[] fArr = this.f35299h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f35291l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f35300i) {
                            this.f35300i = this.f35298g[i10];
                        } else {
                            int[] iArr3 = this.f35298g;
                            iArr3[i12] = iArr3[i10];
                        }
                        if (z10) {
                            iVar.g(this.f35293b);
                        }
                        if (this.f35302k) {
                            this.f35301j = i10;
                        }
                        iVar.f35361m--;
                        this.f35292a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f35298g[i10];
            }
            int i16 = this.f35301j;
            int i17 = i16 + 1;
            if (this.f35302k) {
                int[] iArr4 = this.f35297f;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f35297f;
            if (i16 >= iArr5.length && this.f35292a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f35297f;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f35297f;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f35295d * 2;
                this.f35295d = i19;
                this.f35302k = false;
                this.f35301j = i16 - 1;
                this.f35299h = Arrays.copyOf(this.f35299h, i19);
                this.f35297f = Arrays.copyOf(this.f35297f, this.f35295d);
                this.f35298g = Arrays.copyOf(this.f35298g, this.f35295d);
            }
            this.f35297f[i16] = iVar.f35351c;
            this.f35299h[i16] = f10;
            if (i12 != -1) {
                int[] iArr8 = this.f35298g;
                iArr8[i16] = iArr8[i12];
                iArr8[i12] = i16;
            } else {
                this.f35298g[i16] = this.f35300i;
                this.f35300i = i16;
            }
            iVar.f35361m++;
            iVar.a(this.f35293b);
            this.f35292a++;
            if (!this.f35302k) {
                this.f35301j++;
            }
            int i20 = this.f35301j;
            int[] iArr9 = this.f35297f;
            if (i20 >= iArr9.length) {
                this.f35302k = true;
                this.f35301j = iArr9.length - 1;
            }
        }
    }

    @Override // p.b.a
    public int g() {
        return this.f35292a;
    }

    @Override // p.b.a
    public float h(int i10) {
        int i11 = this.f35300i;
        for (int i12 = 0; i11 != -1 && i12 < this.f35292a; i12++) {
            if (i12 == i10) {
                return this.f35299h[i11];
            }
            i11 = this.f35298g[i11];
        }
        return 0.0f;
    }

    @Override // p.b.a
    public boolean i(i iVar) {
        int i10 = this.f35300i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f35292a; i11++) {
            if (this.f35297f[i10] == iVar.f35351c) {
                return true;
            }
            i10 = this.f35298g[i10];
        }
        return false;
    }

    @Override // p.b.a
    public final float j(i iVar) {
        int i10 = this.f35300i;
        for (int i11 = 0; i10 != -1 && i11 < this.f35292a; i11++) {
            if (this.f35297f[i10] == iVar.f35351c) {
                return this.f35299h[i10];
            }
            i10 = this.f35298g[i10];
        }
        return 0.0f;
    }

    @Override // p.b.a
    public void k(float f10) {
        int i10 = this.f35300i;
        for (int i11 = 0; i10 != -1 && i11 < this.f35292a; i11++) {
            float[] fArr = this.f35299h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f35298g[i10];
        }
    }

    public String toString() {
        int i10 = this.f35300i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f35292a; i11++) {
            str = ((str + " -> ") + this.f35299h[i10] + " : ") + this.f35294c.f35312d[this.f35297f[i10]];
            i10 = this.f35298g[i10];
        }
        return str;
    }
}
