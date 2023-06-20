package da;

import da.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: SlidingPercentile.java */
/* loaded from: classes2.dex */
public class k0 {

    /* renamed from: h */
    private static final Comparator<b> f29195h = new Comparator() { // from class: da.j0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return k0.b((k0.b) obj, (k0.b) obj2);
        }
    };

    /* renamed from: i */
    private static final Comparator<b> f29196i = new Comparator() { // from class: da.i0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return k0.a((k0.b) obj, (k0.b) obj2);
        }
    };

    /* renamed from: a */
    private final int f29197a;

    /* renamed from: e */
    private int f29201e;

    /* renamed from: f */
    private int f29202f;

    /* renamed from: g */
    private int f29203g;

    /* renamed from: c */
    private final b[] f29199c = new b[5];

    /* renamed from: b */
    private final ArrayList<b> f29198b = new ArrayList<>();

    /* renamed from: d */
    private int f29200d = -1;

    /* compiled from: SlidingPercentile.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        public int f29204a;

        /* renamed from: b */
        public int f29205b;

        /* renamed from: c */
        public float f29206c;

        private b() {
        }
    }

    public k0(int i10) {
        this.f29197a = i10;
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return h(bVar, bVar2);
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return g(bVar, bVar2);
    }

    private void d() {
        if (this.f29200d != 1) {
            Collections.sort(this.f29198b, f29195h);
            this.f29200d = 1;
        }
    }

    private void e() {
        if (this.f29200d != 0) {
            Collections.sort(this.f29198b, f29196i);
            this.f29200d = 0;
        }
    }

    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f29204a - bVar2.f29204a;
    }

    public static /* synthetic */ int h(b bVar, b bVar2) {
        return Float.compare(bVar.f29206c, bVar2.f29206c);
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f29203g;
        if (i11 > 0) {
            b[] bVarArr = this.f29199c;
            int i12 = i11 - 1;
            this.f29203g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f29201e;
        this.f29201e = i13 + 1;
        bVar.f29204a = i13;
        bVar.f29205b = i10;
        bVar.f29206c = f10;
        this.f29198b.add(bVar);
        this.f29202f += i10;
        while (true) {
            int i14 = this.f29202f;
            int i15 = this.f29197a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f29198b.get(0);
            int i17 = bVar2.f29205b;
            if (i17 <= i16) {
                this.f29202f -= i17;
                this.f29198b.remove(0);
                int i18 = this.f29203g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f29199c;
                    this.f29203g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f29205b = i17 - i16;
                this.f29202f -= i16;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f29202f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f29198b.size(); i11++) {
            b bVar = this.f29198b.get(i11);
            i10 += bVar.f29205b;
            if (i10 >= f11) {
                return bVar.f29206c;
            }
        }
        if (this.f29198b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f29198b;
        return arrayList.get(arrayList.size() - 1).f29206c;
    }

    public void i() {
        this.f29198b.clear();
        this.f29200d = -1;
        this.f29201e = 0;
        this.f29202f = 0;
    }
}
