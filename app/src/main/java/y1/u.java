package y1;

import d2.s;
import java.util.ArrayList;
import java.util.List;
import z1.a;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public class u implements c, a.b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39122a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a.b> f39123b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final s.a f39124c;

    /* renamed from: d  reason: collision with root package name */
    private final z1.a<?, Float> f39125d;

    /* renamed from: e  reason: collision with root package name */
    private final z1.a<?, Float> f39126e;

    /* renamed from: f  reason: collision with root package name */
    private final z1.a<?, Float> f39127f;

    public u(e2.b bVar, d2.s sVar) {
        sVar.c();
        this.f39122a = sVar.g();
        this.f39124c = sVar.f();
        z1.a<Float, Float> a10 = sVar.e().a();
        this.f39125d = a10;
        z1.a<Float, Float> a11 = sVar.b().a();
        this.f39126e = a11;
        z1.a<Float, Float> a12 = sVar.d().a();
        this.f39127f = a12;
        bVar.i(a10);
        bVar.i(a11);
        bVar.i(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // z1.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f39123b.size(); i10++) {
            this.f39123b.get(i10).a();
        }
    }

    @Override // y1.c
    public void b(List<c> list, List<c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(a.b bVar) {
        this.f39123b.add(bVar);
    }

    public z1.a<?, Float> e() {
        return this.f39126e;
    }

    public z1.a<?, Float> g() {
        return this.f39127f;
    }

    public z1.a<?, Float> i() {
        return this.f39125d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.a j() {
        return this.f39124c;
    }

    public boolean k() {
        return this.f39122a;
    }
}
