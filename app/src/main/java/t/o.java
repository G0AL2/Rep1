package t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: f  reason: collision with root package name */
    static int f37053f;

    /* renamed from: b  reason: collision with root package name */
    int f37055b;

    /* renamed from: c  reason: collision with root package name */
    int f37056c;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<s.e> f37054a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f37057d = null;

    /* renamed from: e  reason: collision with root package name */
    private int f37058e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetGroup.java */
    /* loaded from: classes.dex */
    public class a {
        public a(o oVar, s.e eVar, p.d dVar, int i10) {
            new WeakReference(eVar);
            dVar.x(eVar.L);
            dVar.x(eVar.M);
            dVar.x(eVar.N);
            dVar.x(eVar.O);
            dVar.x(eVar.P);
        }
    }

    public o(int i10) {
        this.f37055b = -1;
        this.f37056c = 0;
        int i11 = f37053f;
        f37053f = i11 + 1;
        this.f37055b = i11;
        this.f37056c = i10;
    }

    private String e() {
        int i10 = this.f37056c;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(p.d dVar, ArrayList<s.e> arrayList, int i10) {
        int x10;
        int x11;
        s.f fVar = (s.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.F0 > 0) {
            s.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.G0 > 0) {
            s.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f37057d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f37057d.add(new a(this, arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            x10 = dVar.x(fVar.L);
            x11 = dVar.x(fVar.N);
            dVar.D();
        } else {
            x10 = dVar.x(fVar.M);
            x11 = dVar.x(fVar.O);
            dVar.D();
        }
        return x11 - x10;
    }

    public boolean a(s.e eVar) {
        if (this.f37054a.contains(eVar)) {
            return false;
        }
        this.f37054a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f37054a.size();
        if (this.f37058e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f37058e == oVar.f37055b) {
                    g(this.f37056c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f37055b;
    }

    public int d() {
        return this.f37056c;
    }

    public int f(p.d dVar, int i10) {
        if (this.f37054a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f37054a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<s.e> it = this.f37054a.iterator();
        while (it.hasNext()) {
            s.e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f36650t0 = oVar.c();
            } else {
                next.f36652u0 = oVar.c();
            }
        }
        this.f37058e = oVar.f37055b;
    }

    public void h(boolean z10) {
    }

    public void i(int i10) {
        this.f37056c = i10;
    }

    public String toString() {
        Iterator<s.e> it;
        String str = e() + " [" + this.f37055b + "] <";
        while (this.f37054a.iterator().hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
