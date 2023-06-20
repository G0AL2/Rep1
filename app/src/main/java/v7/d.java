package v7;

import java.util.List;
import java.util.Objects;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes2.dex */
final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List<m> f37876a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f37876a = list;
    }

    @Override // v7.j
    public List<m> c() {
        return this.f37876a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f37876a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f37876a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f37876a + "}";
    }
}
