package l1;

/* compiled from: NetworkState.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f33649a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f33650b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33651c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33652d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f33649a = z10;
        this.f33650b = z11;
        this.f33651c = z12;
        this.f33652d = z13;
    }

    public final boolean a() {
        return this.f33649a;
    }

    public final boolean b() {
        return this.f33651c;
    }

    public final boolean c() {
        return this.f33652d;
    }

    public final boolean d() {
        return this.f33650b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f33649a == bVar.f33649a && this.f33650b == bVar.f33650b && this.f33651c == bVar.f33651c && this.f33652d == bVar.f33652d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f33649a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f33650b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.f33651c;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.f33652d;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f33649a + ", isValidated=" + this.f33650b + ", isMetered=" + this.f33651c + ", isNotRoaming=" + this.f33652d + ')';
    }
}
