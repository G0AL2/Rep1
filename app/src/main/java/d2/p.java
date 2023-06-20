package d2;

import com.airbnb.lottie.d0;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public class p implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29013a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f29014b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29015c;

    public p(String str, List<c> list, boolean z10) {
        this.f29013a = str;
        this.f29014b = list;
        this.f29015c = z10;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.d(d0Var, bVar, this);
    }

    public List<c> b() {
        return this.f29014b;
    }

    public String c() {
        return this.f29013a;
    }

    public boolean d() {
        return this.f29015c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f29013a + "' Shapes: " + Arrays.toString(this.f29014b.toArray()) + '}';
    }
}
