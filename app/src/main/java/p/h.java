package p;

import java.util.Arrays;
import java.util.Comparator;
import p.b;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class h extends p.b {

    /* renamed from: g  reason: collision with root package name */
    private int f35341g;

    /* renamed from: h  reason: collision with root package name */
    private i[] f35342h;

    /* renamed from: i  reason: collision with root package name */
    private i[] f35343i;

    /* renamed from: j  reason: collision with root package name */
    private int f35344j;

    /* renamed from: k  reason: collision with root package name */
    b f35345k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        a(h hVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f35351c - iVar2.f35351c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        i f35346a;

        public b(h hVar) {
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f35346a.f35349a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f35357i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f35346a.f35357i[i10] = f12;
                    } else {
                        this.f35346a.f35357i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f35346a.f35357i;
                fArr[i11] = fArr[i11] + (iVar.f35357i[i11] * f10);
                if (Math.abs(fArr[i11]) < 1.0E-4f) {
                    this.f35346a.f35357i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f35346a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f35346a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f35346a.f35357i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f35357i[i10];
                float f11 = this.f35346a.f35357i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f35346a.f35357i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f35346a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f35346a.f35357i[i10] + " ";
                }
            }
            return str + "] " + this.f35346a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f35341g = 128;
        this.f35342h = new i[128];
        this.f35343i = new i[128];
        this.f35344j = 0;
        this.f35345k = new b(this);
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f35344j + 1;
        i[] iVarArr = this.f35342h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f35342h = iVarArr2;
            this.f35343i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f35342h;
        int i12 = this.f35344j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f35344j = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f35351c > iVar.f35351c) {
            int i14 = 0;
            while (true) {
                i10 = this.f35344j;
                if (i14 >= i10) {
                    break;
                }
                this.f35343i[i14] = this.f35342h[i14];
                i14++;
            }
            Arrays.sort(this.f35343i, 0, i10, new a(this));
            for (int i15 = 0; i15 < this.f35344j; i15++) {
                this.f35342h[i15] = this.f35343i[i15];
            }
        }
        iVar.f35349a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f35344j) {
            if (this.f35342h[i10] == iVar) {
                while (true) {
                    int i11 = this.f35344j;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f35342h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f35344j = i11 - 1;
                        iVar.f35349a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p.b
    public void B(d dVar, p.b bVar, boolean z10) {
        i iVar = bVar.f35303a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f35307e;
        int g10 = aVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            i a10 = aVar.a(i10);
            float h10 = aVar.h(i10);
            this.f35345k.b(a10);
            if (this.f35345k.a(iVar, h10)) {
                F(a10);
            }
            this.f35304b += bVar.f35304b * h10;
        }
        G(iVar);
    }

    @Override // p.b, p.d.a
    public void a(i iVar) {
        this.f35345k.b(iVar);
        this.f35345k.e();
        iVar.f35357i[iVar.f35353e] = 1.0f;
        F(iVar);
    }

    @Override // p.b, p.d.a
    public i c(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f35344j; i11++) {
            i iVar = this.f35342h[i11];
            if (!zArr[iVar.f35351c]) {
                this.f35345k.b(iVar);
                if (i10 == -1) {
                    if (!this.f35345k.c()) {
                    }
                    i10 = i11;
                } else {
                    if (!this.f35345k.d(this.f35342h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f35342h[i10];
    }

    @Override // p.b, p.d.a
    public void clear() {
        this.f35344j = 0;
        this.f35304b = 0.0f;
    }

    @Override // p.b, p.d.a
    public boolean isEmpty() {
        return this.f35344j == 0;
    }

    @Override // p.b
    public String toString() {
        String str = " goal -> (" + this.f35304b + ") : ";
        for (int i10 = 0; i10 < this.f35344j; i10++) {
            this.f35345k.b(this.f35342h[i10]);
            str = str + this.f35345k + " ";
        }
        return str;
    }
}
