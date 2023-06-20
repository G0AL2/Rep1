package z;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f39850e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f39851a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39852b;

    /* renamed from: c  reason: collision with root package name */
    public final int f39853c;

    /* renamed from: d  reason: collision with root package name */
    public final int f39854d;

    private b(int i10, int i11, int i12, int i13) {
        this.f39851a = i10;
        this.f39852b = i11;
        this.f39853c = i12;
        this.f39854d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f39851a, bVar2.f39851a), Math.max(bVar.f39852b, bVar2.f39852b), Math.max(bVar.f39853c, bVar2.f39853c), Math.max(bVar.f39854d, bVar2.f39854d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f39850e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.f39851a, this.f39852b, this.f39853c, this.f39854d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f39854d == bVar.f39854d && this.f39851a == bVar.f39851a && this.f39853c == bVar.f39853c && this.f39852b == bVar.f39852b;
    }

    public int hashCode() {
        return (((((this.f39851a * 31) + this.f39852b) * 31) + this.f39853c) * 31) + this.f39854d;
    }

    public String toString() {
        return "Insets{left=" + this.f39851a + ", top=" + this.f39852b + ", right=" + this.f39853c + ", bottom=" + this.f39854d + '}';
    }
}
