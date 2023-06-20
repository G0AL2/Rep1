package u7;

import java.util.Objects;

/* compiled from: Encoding.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f37584a;

    private b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f37584a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f37584a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f37584a.equals(((b) obj).f37584a);
        }
        return false;
    }

    public int hashCode() {
        return this.f37584a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f37584a + "\"}";
    }
}
