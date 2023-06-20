package t3;

import android.net.Uri;
import java.util.List;
import y3.k;

/* compiled from: MultiCacheKey.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    final List<d> f37114a;

    public f(List<d> list) {
        this.f37114a = (List) k.g(list);
    }

    @Override // t3.d
    public String a() {
        return this.f37114a.get(0).a();
    }

    @Override // t3.d
    public boolean b(Uri uri) {
        for (int i10 = 0; i10 < this.f37114a.size(); i10++) {
            if (this.f37114a.get(i10).b(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // t3.d
    public boolean c() {
        return false;
    }

    public List<d> d() {
        return this.f37114a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f37114a.equals(((f) obj).f37114a);
        }
        return false;
    }

    public int hashCode() {
        return this.f37114a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f37114a.toString();
    }
}
