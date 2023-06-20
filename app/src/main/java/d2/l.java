package d2;

import com.airbnb.lottie.d0;

/* compiled from: Repeater.java */
/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f28997a;

    /* renamed from: b  reason: collision with root package name */
    private final c2.b f28998b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.b f28999c;

    /* renamed from: d  reason: collision with root package name */
    private final c2.l f29000d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f29001e;

    public l(String str, c2.b bVar, c2.b bVar2, c2.l lVar, boolean z10) {
        this.f28997a = str;
        this.f28998b = bVar;
        this.f28999c = bVar2;
        this.f29000d = lVar;
        this.f29001e = z10;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.p(d0Var, bVar, this);
    }

    public c2.b b() {
        return this.f28998b;
    }

    public String c() {
        return this.f28997a;
    }

    public c2.b d() {
        return this.f28999c;
    }

    public c2.l e() {
        return this.f29000d;
    }

    public boolean f() {
        return this.f29001e;
    }
}
