package w5;

/* compiled from: EncodedImageOrigin.java */
/* loaded from: classes.dex */
public enum f {
    NOT_SET("not_set"),
    NETWORK("network"),
    DISK("disk"),
    ENCODED_MEM_CACHE("encoded_mem_cache");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f38226a;

    f(String str) {
        this.f38226a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f38226a;
    }
}
