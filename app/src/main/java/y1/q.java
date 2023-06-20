package y1;

import android.graphics.PointF;
import com.airbnb.lottie.d0;
import java.util.ArrayList;
import java.util.List;
import z1.a;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes.dex */
public class q implements s, a.b {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f39108a;

    /* renamed from: b  reason: collision with root package name */
    private final z1.a<Float, Float> f39109b;

    /* renamed from: c  reason: collision with root package name */
    private d2.n f39110c;

    public q(d0 d0Var, e2.b bVar, d2.m mVar) {
        this.f39108a = d0Var;
        mVar.c();
        z1.a<Float, Float> a10 = mVar.b().a();
        this.f39109b = a10;
        bVar.i(a10);
        a10.a(this);
    }

    private static int d(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int e(int i10, int i11) {
        return i10 - (d(i10, i11) * i11);
    }

    private d2.n i(d2.n nVar) {
        List<b2.a> a10 = nVar.a();
        boolean d10 = nVar.d();
        int size = a10.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            b2.a aVar = a10.get(size);
            b2.a aVar2 = a10.get(e(size - 1, a10.size()));
            PointF c10 = (size != 0 || d10) ? aVar2.c() : nVar.b();
            i10 = (((size != 0 || d10) ? aVar2.b() : c10).equals(c10) && aVar.a().equals(c10) && !(!nVar.d() && size == 0 && size == a10.size() - 1)) ? i10 + 2 : i10 + 1;
            size--;
        }
        d2.n nVar2 = this.f39110c;
        if (nVar2 == null || nVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new b2.a());
            }
            this.f39110c = new d2.n(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f39110c.e(d10);
        return this.f39110c;
    }

    @Override // z1.a.b
    public void a() {
        this.f39108a.invalidateSelf();
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
    }

    @Override // y1.s
    public d2.n c(d2.n nVar) {
        List<b2.a> list;
        List<b2.a> a10 = nVar.a();
        if (a10.size() <= 2) {
            return nVar;
        }
        float floatValue = this.f39109b.h().floatValue();
        if (floatValue == 0.0f) {
            return nVar;
        }
        d2.n i10 = i(nVar);
        i10.f(nVar.b().x, nVar.b().y);
        List<b2.a> a11 = i10.a();
        boolean d10 = nVar.d();
        int i11 = 0;
        int i12 = 0;
        while (i11 < a10.size()) {
            b2.a aVar = a10.get(i11);
            b2.a aVar2 = a10.get(e(i11 - 1, a10.size()));
            b2.a aVar3 = a10.get(e(i11 - 2, a10.size()));
            PointF c10 = (i11 != 0 || d10) ? aVar2.c() : nVar.b();
            PointF b10 = (i11 != 0 || d10) ? aVar2.b() : c10;
            PointF a12 = aVar.a();
            PointF c11 = aVar3.c();
            PointF c12 = aVar.c();
            boolean z10 = !nVar.d() && i11 == 0 && i11 == a10.size() + (-1);
            if (b10.equals(c10) && a12.equals(c10) && !z10) {
                float f10 = c10.x;
                float f11 = f10 - c11.x;
                float f12 = c10.y;
                float f13 = c12.x - f10;
                list = a10;
                float min = Math.min(floatValue / ((float) Math.hypot(f11, f12 - c11.y)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f13, c12.y - f12)), 0.5f);
                float f14 = c10.x;
                float f15 = ((c11.x - f14) * min) + f14;
                float f16 = c10.y;
                float f17 = ((c11.y - f16) * min) + f16;
                float f18 = ((c12.x - f14) * min2) + f14;
                float f19 = ((c12.y - f16) * min2) + f16;
                float f20 = f15 - ((f15 - f14) * 0.5519f);
                float f21 = f17 - ((f17 - f16) * 0.5519f);
                float f22 = f18 - ((f18 - f14) * 0.5519f);
                float f23 = f19 - ((f19 - f16) * 0.5519f);
                b2.a aVar4 = a11.get(e(i12 - 1, a11.size()));
                b2.a aVar5 = a11.get(i12);
                aVar4.e(f15, f17);
                aVar4.f(f15, f17);
                if (i11 == 0) {
                    i10.f(f15, f17);
                }
                aVar5.d(f20, f21);
                i12++;
                aVar5.e(f22, f23);
                aVar5.f(f18, f19);
                a11.get(i12).d(f18, f19);
            } else {
                list = a10;
                b2.a aVar6 = a11.get(e(i12 - 1, a11.size()));
                aVar6.e(aVar2.c().x, aVar2.c().y);
                aVar6.f(aVar2.c().x, aVar2.c().y);
                a11.get(i12).d(aVar.c().x, aVar.c().y);
            }
            i12++;
            i11++;
            a10 = list;
        }
        return i10;
    }

    public z1.a<Float, Float> g() {
        return this.f39109b;
    }
}
