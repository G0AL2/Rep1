package ea;

import java.util.Arrays;

/* compiled from: LongArray.java */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private int f29740a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f29741b;

    public s() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f29740a;
        long[] jArr = this.f29741b;
        if (i10 == jArr.length) {
            this.f29741b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f29741b;
        int i11 = this.f29740a;
        this.f29740a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f29740a) {
            return this.f29741b[i10];
        }
        int i11 = this.f29740a;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Invalid index ");
        sb2.append(i10);
        sb2.append(", size is ");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public int c() {
        return this.f29740a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f29741b, this.f29740a);
    }

    public s(int i10) {
        this.f29741b = new long[i10];
    }
}
