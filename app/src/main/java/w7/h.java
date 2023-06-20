package w7;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: EncodedPayload.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final u7.b f38295a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f38296b;

    public h(u7.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f38295a = bVar;
        this.f38296b = bArr;
    }

    public byte[] a() {
        return this.f38296b;
    }

    public u7.b b() {
        return this.f38295a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f38295a.equals(hVar.f38295a)) {
                return Arrays.equals(this.f38296b, hVar.f38296b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f38295a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38296b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f38295a + ", bytes=[...]}";
    }
}
