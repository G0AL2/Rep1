package q5;

import y3.k;

/* compiled from: ResizeOptions.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f35945a;

    /* renamed from: b  reason: collision with root package name */
    public final int f35946b;

    /* renamed from: c  reason: collision with root package name */
    public final float f35947c;

    /* renamed from: d  reason: collision with root package name */
    public final float f35948d;

    public e(int i10, int i11) {
        this(i10, i11, 2048.0f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f35945a == eVar.f35945a && this.f35946b == eVar.f35946b;
        }
        return false;
    }

    public int hashCode() {
        return g4.b.a(this.f35945a, this.f35946b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f35945a), Integer.valueOf(this.f35946b));
    }

    public e(int i10, int i11, float f10) {
        this(i10, i11, f10, 0.6666667f);
    }

    public e(int i10, int i11, float f10, float f11) {
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        this.f35945a = i10;
        this.f35946b = i11;
        this.f35947c = f10;
        this.f35948d = f11;
    }
}
