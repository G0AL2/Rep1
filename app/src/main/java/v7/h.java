package v7;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes2.dex */
final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f37909a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j10) {
        this.f37909a = j10;
    }

    @Override // v7.n
    public long c() {
        return this.f37909a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f37909a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f37909a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f37909a + "}";
    }
}
