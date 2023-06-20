package t3;

import android.net.Uri;
import y3.k;

/* compiled from: SimpleCacheKey.java */
/* loaded from: classes.dex */
public class i implements d {

    /* renamed from: a  reason: collision with root package name */
    final String f37117a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f37118b;

    public i(String str) {
        this(str, false);
    }

    @Override // t3.d
    public String a() {
        return this.f37117a;
    }

    @Override // t3.d
    public boolean b(Uri uri) {
        return this.f37117a.contains(uri.toString());
    }

    @Override // t3.d
    public boolean c() {
        return this.f37118b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f37117a.equals(((i) obj).f37117a);
        }
        return false;
    }

    public int hashCode() {
        return this.f37117a.hashCode();
    }

    public String toString() {
        return this.f37117a;
    }

    public i(String str, boolean z10) {
        this.f37117a = (String) k.g(str);
        this.f37118b = z10;
    }
}
