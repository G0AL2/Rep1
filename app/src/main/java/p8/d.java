package p8;

import ea.n0;
import java.util.Arrays;
import p8.x;

/* compiled from: ChunkIndex.java */
/* loaded from: classes2.dex */
public final class d implements x {

    /* renamed from: a  reason: collision with root package name */
    public final int f35626a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f35627b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f35628c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f35629d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f35630e;

    /* renamed from: f  reason: collision with root package name */
    private final long f35631f;

    public d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f35627b = iArr;
        this.f35628c = jArr;
        this.f35629d = jArr2;
        this.f35630e = jArr3;
        int length = iArr.length;
        this.f35626a = length;
        if (length > 0) {
            this.f35631f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f35631f = 0L;
        }
    }

    public int a(long j10) {
        return n0.i(this.f35630e, j10, true, true);
    }

    @Override // p8.x
    public x.a d(long j10) {
        int a10 = a(j10);
        y yVar = new y(this.f35630e[a10], this.f35628c[a10]);
        if (yVar.f35707a < j10 && a10 != this.f35626a - 1) {
            int i10 = a10 + 1;
            return new x.a(yVar, new y(this.f35630e[i10], this.f35628c[i10]));
        }
        return new x.a(yVar);
    }

    @Override // p8.x
    public boolean f() {
        return true;
    }

    @Override // p8.x
    public long i() {
        return this.f35631f;
    }

    public String toString() {
        int i10 = this.f35626a;
        String arrays = Arrays.toString(this.f35627b);
        String arrays2 = Arrays.toString(this.f35628c);
        String arrays3 = Arrays.toString(this.f35630e);
        String arrays4 = Arrays.toString(this.f35629d);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 71 + String.valueOf(arrays2).length() + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(arrays);
        sb2.append(", offsets=");
        sb2.append(arrays2);
        sb2.append(", timeUs=");
        sb2.append(arrays3);
        sb2.append(", durationsUs=");
        sb2.append(arrays4);
        sb2.append(")");
        return sb2.toString();
    }
}
