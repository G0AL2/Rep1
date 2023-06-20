package ac;

import ac.c0;
import java.util.Objects;

/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes3.dex */
final class y extends c0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f543a;

    /* renamed from: b  reason: collision with root package name */
    private final String f544b;

    /* renamed from: c  reason: collision with root package name */
    private final int f545c;

    /* renamed from: d  reason: collision with root package name */
    private final long f546d;

    /* renamed from: e  reason: collision with root package name */
    private final long f547e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f548f;

    /* renamed from: g  reason: collision with root package name */
    private final int f549g;

    /* renamed from: h  reason: collision with root package name */
    private final String f550h;

    /* renamed from: i  reason: collision with root package name */
    private final String f551i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f543a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f544b = str;
        this.f545c = i11;
        this.f546d = j10;
        this.f547e = j11;
        this.f548f = z10;
        this.f549g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f550h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f551i = str3;
    }

    @Override // ac.c0.b
    public int a() {
        return this.f543a;
    }

    @Override // ac.c0.b
    public int b() {
        return this.f545c;
    }

    @Override // ac.c0.b
    public long d() {
        return this.f547e;
    }

    @Override // ac.c0.b
    public boolean e() {
        return this.f548f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.b) {
            c0.b bVar = (c0.b) obj;
            return this.f543a == bVar.a() && this.f544b.equals(bVar.g()) && this.f545c == bVar.b() && this.f546d == bVar.j() && this.f547e == bVar.d() && this.f548f == bVar.e() && this.f549g == bVar.i() && this.f550h.equals(bVar.f()) && this.f551i.equals(bVar.h());
        }
        return false;
    }

    @Override // ac.c0.b
    public String f() {
        return this.f550h;
    }

    @Override // ac.c0.b
    public String g() {
        return this.f544b;
    }

    @Override // ac.c0.b
    public String h() {
        return this.f551i;
    }

    public int hashCode() {
        long j10 = this.f546d;
        long j11 = this.f547e;
        return ((((((((((((((((this.f543a ^ 1000003) * 1000003) ^ this.f544b.hashCode()) * 1000003) ^ this.f545c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f548f ? 1231 : 1237)) * 1000003) ^ this.f549g) * 1000003) ^ this.f550h.hashCode()) * 1000003) ^ this.f551i.hashCode();
    }

    @Override // ac.c0.b
    public int i() {
        return this.f549g;
    }

    @Override // ac.c0.b
    public long j() {
        return this.f546d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f543a + ", model=" + this.f544b + ", availableProcessors=" + this.f545c + ", totalRam=" + this.f546d + ", diskSpace=" + this.f547e + ", isEmulator=" + this.f548f + ", state=" + this.f549g + ", manufacturer=" + this.f550h + ", modelClass=" + this.f551i + "}";
    }
}
