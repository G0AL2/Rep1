package p8;

/* compiled from: SeekPoint.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: c  reason: collision with root package name */
    public static final y f35706c = new y(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f35707a;

    /* renamed from: b  reason: collision with root package name */
    public final long f35708b;

    public y(long j10, long j11) {
        this.f35707a = j10;
        this.f35708b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f35707a == yVar.f35707a && this.f35708b == yVar.f35708b;
    }

    public int hashCode() {
        return (((int) this.f35707a) * 31) + ((int) this.f35708b);
    }

    public String toString() {
        long j10 = this.f35707a;
        long j11 = this.f35708b;
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(j10);
        sb2.append(", position=");
        sb2.append(j11);
        sb2.append("]");
        return sb2.toString();
    }
}
