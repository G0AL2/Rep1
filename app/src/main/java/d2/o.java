package d2;

import android.graphics.Path;
import com.airbnb.lottie.d0;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public class o implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29007a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f29008b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29009c;

    /* renamed from: d  reason: collision with root package name */
    private final c2.a f29010d;

    /* renamed from: e  reason: collision with root package name */
    private final c2.d f29011e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f29012f;

    public o(String str, boolean z10, Path.FillType fillType, c2.a aVar, c2.d dVar, boolean z11) {
        this.f29009c = str;
        this.f29007a = z10;
        this.f29008b = fillType;
        this.f29010d = aVar;
        this.f29011e = dVar;
        this.f29012f = z11;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.g(d0Var, bVar, this);
    }

    public c2.a b() {
        return this.f29010d;
    }

    public Path.FillType c() {
        return this.f29008b;
    }

    public String d() {
        return this.f29009c;
    }

    public c2.d e() {
        return this.f29011e;
    }

    public boolean f() {
        return this.f29012f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f29007a + '}';
    }
}
