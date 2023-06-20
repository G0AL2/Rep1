package q2;

import android.text.TextUtils;

/* compiled from: Header.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f35802a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35803b;

    public g(String str, String str2) {
        this.f35802a = str;
        this.f35803b = str2;
    }

    public final String a() {
        return this.f35802a;
    }

    public final String b() {
        return this.f35803b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f35802a, gVar.f35802a) && TextUtils.equals(this.f35803b, gVar.f35803b);
    }

    public int hashCode() {
        return (this.f35802a.hashCode() * 31) + this.f35803b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f35802a + ",value=" + this.f35803b + "]";
    }
}
