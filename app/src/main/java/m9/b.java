package m9;

/* compiled from: BaseUrl.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f34328a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34329b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34330c;

    /* renamed from: d  reason: collision with root package name */
    public final int f34331d;

    public b(String str, String str2, int i10, int i11) {
        this.f34328a = str;
        this.f34329b = str2;
        this.f34330c = i10;
        this.f34331d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f34330c == bVar.f34330c && this.f34331d == bVar.f34331d && ib.i.a(this.f34328a, bVar.f34328a) && ib.i.a(this.f34329b, bVar.f34329b);
        }
        return false;
    }

    public int hashCode() {
        return ib.i.b(this.f34328a, this.f34329b, Integer.valueOf(this.f34330c), Integer.valueOf(this.f34331d));
    }
}
