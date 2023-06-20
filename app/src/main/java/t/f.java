package t;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    p f37023d;

    /* renamed from: f  reason: collision with root package name */
    int f37025f;

    /* renamed from: g  reason: collision with root package name */
    public int f37026g;

    /* renamed from: a  reason: collision with root package name */
    public d f37020a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37021b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f37022c = false;

    /* renamed from: e  reason: collision with root package name */
    a f37024e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    int f37027h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f37028i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f37029j = false;

    /* renamed from: k  reason: collision with root package name */
    List<d> f37030k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<f> f37031l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* loaded from: classes.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f37023d = pVar;
    }

    @Override // t.d
    public void a(d dVar) {
        for (f fVar : this.f37031l) {
            if (!fVar.f37029j) {
                return;
            }
        }
        this.f37022c = true;
        d dVar2 = this.f37020a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f37021b) {
            this.f37023d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f fVar3 : this.f37031l) {
            if (!(fVar3 instanceof g)) {
                i10++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f37029j) {
            g gVar = this.f37028i;
            if (gVar != null) {
                if (!gVar.f37029j) {
                    return;
                }
                this.f37025f = this.f37027h * gVar.f37026g;
            }
            d(fVar2.f37026g + this.f37025f);
        }
        d dVar3 = this.f37020a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f37030k.add(dVar);
        if (this.f37029j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f37031l.clear();
        this.f37030k.clear();
        this.f37029j = false;
        this.f37026g = 0;
        this.f37022c = false;
        this.f37021b = false;
    }

    public void d(int i10) {
        if (this.f37029j) {
            return;
        }
        this.f37029j = true;
        this.f37026g = i10;
        for (d dVar : this.f37030k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f37023d.f37060b.r());
        sb2.append(":");
        sb2.append(this.f37024e);
        sb2.append("(");
        sb2.append(this.f37029j ? Integer.valueOf(this.f37026g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f37031l.size());
        sb2.append(":d=");
        sb2.append(this.f37030k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
