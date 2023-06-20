package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import u.c;
import u.d;
import u.e;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    boolean f1906a;

    /* renamed from: b  reason: collision with root package name */
    private k f1907b;

    /* renamed from: c  reason: collision with root package name */
    private k f1908c;

    /* renamed from: d  reason: collision with root package name */
    private f f1909d;

    /* renamed from: e  reason: collision with root package name */
    private f f1910e;

    /* renamed from: f  reason: collision with root package name */
    private q.a[] f1911f;

    /* renamed from: g  reason: collision with root package name */
    private q.a f1912g;

    /* renamed from: h  reason: collision with root package name */
    float f1913h;

    /* renamed from: i  reason: collision with root package name */
    float f1914i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f1915j;

    /* renamed from: k  reason: collision with root package name */
    private double[] f1916k;

    /* renamed from: l  reason: collision with root package name */
    private double[] f1917l;

    /* renamed from: m  reason: collision with root package name */
    private String[] f1918m;

    /* renamed from: n  reason: collision with root package name */
    private float[] f1919n;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<k> f1920o;

    /* renamed from: p  reason: collision with root package name */
    private HashMap<String, u.e> f1921p;

    /* renamed from: q  reason: collision with root package name */
    private HashMap<String, u.d> f1922q;

    /* renamed from: r  reason: collision with root package name */
    private HashMap<String, u.c> f1923r;

    /* renamed from: s  reason: collision with root package name */
    private e[] f1924s;

    /* renamed from: t  reason: collision with root package name */
    private int f1925t;

    /* renamed from: u  reason: collision with root package name */
    private View f1926u;

    /* renamed from: v  reason: collision with root package name */
    private int f1927v;

    /* renamed from: w  reason: collision with root package name */
    private float f1928w;

    /* renamed from: x  reason: collision with root package name */
    private Interpolator f1929x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1930y;

    private float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f1914i;
            if (f12 != 1.0d) {
                float f13 = this.f1913h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        q.b bVar = this.f1907b.f1972a;
        float f14 = Float.NaN;
        Iterator<k> it = this.f1920o.iterator();
        while (it.hasNext()) {
            k next = it.next();
            q.b bVar2 = next.f1972a;
            if (bVar2 != null) {
                float f15 = next.f1974c;
                if (f15 < f10) {
                    bVar = bVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = next.f1974c;
                }
            }
        }
        if (bVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) bVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f1911f[0].b(d10, dArr);
        this.f1911f[0].d(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f1907b.b(d10, this.f1915j, dArr, fArr, dArr2, fArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(View view, float f10, long j10, q.c cVar) {
        e.a aVar;
        boolean z10;
        char c10;
        double d10;
        View view2;
        float f11;
        float a10 = a(f10, null);
        int i10 = this.f1927v;
        if (i10 != d.f1903a) {
            float f12 = 1.0f / i10;
            float floor = ((float) Math.floor(a10 / f12)) * f12;
            float f13 = (a10 % f12) / f12;
            if (!Float.isNaN(this.f1928w)) {
                f13 = (f13 + this.f1928w) % 1.0f;
            }
            Interpolator interpolator = this.f1929x;
            if (interpolator != null) {
                f11 = interpolator.getInterpolation(f13);
            } else {
                f11 = ((double) f13) > 0.5d ? 1.0f : 0.0f;
            }
            a10 = (f11 * f12) + floor;
        }
        float f14 = a10;
        HashMap<String, u.d> hashMap = this.f1922q;
        if (hashMap != null) {
            for (u.d dVar : hashMap.values()) {
                dVar.b(view, f14);
            }
        }
        HashMap<String, u.e> hashMap2 = this.f1921p;
        if (hashMap2 != null) {
            e.a aVar2 = null;
            boolean z11 = false;
            for (u.e eVar : hashMap2.values()) {
                if (eVar instanceof e.a) {
                    aVar2 = (e.a) eVar;
                } else {
                    z11 |= eVar.b(view, f14, j10, cVar);
                }
            }
            z10 = z11;
            aVar = aVar2;
        } else {
            aVar = null;
            z10 = false;
        }
        q.a[] aVarArr = this.f1911f;
        if (aVarArr != null) {
            double d11 = f14;
            aVarArr[0].b(d11, this.f1916k);
            this.f1911f[0].d(d11, this.f1917l);
            q.a aVar3 = this.f1912g;
            if (aVar3 != null) {
                double[] dArr = this.f1916k;
                if (dArr.length > 0) {
                    aVar3.b(d11, dArr);
                    this.f1912g.d(d11, this.f1917l);
                }
            }
            if (this.f1930y) {
                d10 = d11;
            } else {
                d10 = d11;
                this.f1907b.c(f14, view, this.f1915j, this.f1916k, this.f1917l, null, this.f1906a);
                this.f1906a = false;
            }
            if (this.f1925t != d.f1903a) {
                if (this.f1926u == null) {
                    this.f1926u = ((View) view.getParent()).findViewById(this.f1925t);
                }
                if (this.f1926u != null) {
                    float top = (view2.getTop() + this.f1926u.getBottom()) / 2.0f;
                    float left = (this.f1926u.getLeft() + this.f1926u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, u.d> hashMap3 = this.f1922q;
            if (hashMap3 != null) {
                for (u.d dVar2 : hashMap3.values()) {
                    if (dVar2 instanceof d.a) {
                        double[] dArr2 = this.f1917l;
                        if (dArr2.length > 1) {
                            ((d.a) dVar2).c(view, f14, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.f1917l;
                c10 = 1;
                z10 |= aVar.c(view, cVar, f14, j10, dArr3[0], dArr3[1]);
            } else {
                c10 = 1;
            }
            int i11 = 1;
            while (true) {
                q.a[] aVarArr2 = this.f1911f;
                if (i11 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i11].c(d10, this.f1919n);
                u.a.b(this.f1907b.f1984m.get(this.f1918m[i11 - 1]), view, this.f1919n);
                i11++;
            }
            f fVar = this.f1909d;
            if (fVar.f1904a == 0) {
                if (f14 <= 0.0f) {
                    view.setVisibility(fVar.f1905b);
                } else if (f14 >= 1.0f) {
                    view.setVisibility(this.f1910e.f1905b);
                } else if (this.f1910e.f1905b != fVar.f1905b) {
                    view.setVisibility(0);
                }
            }
            if (this.f1924s != null) {
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.f1924s;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i12].a(f14, view);
                    i12++;
                }
            }
        } else {
            c10 = 1;
            k kVar = this.f1907b;
            float f15 = kVar.f1976e;
            k kVar2 = this.f1908c;
            float f16 = f15 + ((kVar2.f1976e - f15) * f14);
            float f17 = kVar.f1977f;
            float f18 = f17 + ((kVar2.f1977f - f17) * f14);
            float f19 = kVar.f1978g;
            float f20 = kVar2.f1978g;
            float f21 = kVar.f1979h;
            float f22 = kVar2.f1979h;
            float f23 = f16 + 0.5f;
            int i13 = (int) f23;
            float f24 = f18 + 0.5f;
            int i14 = (int) f24;
            int i15 = (int) (f23 + ((f20 - f19) * f14) + f19);
            int i16 = (int) (f24 + ((f22 - f21) * f14) + f21);
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (f20 != f19 || f22 != f21 || this.f1906a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                this.f1906a = false;
            }
            view.layout(i13, i14, i15, i16);
        }
        HashMap<String, u.c> hashMap4 = this.f1923r;
        if (hashMap4 != null) {
            for (u.c cVar2 : hashMap4.values()) {
                if (cVar2 instanceof c.a) {
                    double[] dArr4 = this.f1917l;
                    ((c.a) cVar2).c(view, f14, dArr4[0], dArr4[c10]);
                } else {
                    cVar2.b(view, f14);
                }
            }
        }
        return z10;
    }

    public String toString() {
        return " start: x: " + this.f1907b.f1976e + " y: " + this.f1907b.f1977f + " end: x: " + this.f1908c.f1976e + " y: " + this.f1908c.f1977f;
    }
}
