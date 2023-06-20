package p8;

import com.inmobi.media.fq;

/* compiled from: VorbisBitArray.java */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f35622a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35623b;

    /* renamed from: c  reason: collision with root package name */
    private int f35624c;

    /* renamed from: d  reason: collision with root package name */
    private int f35625d;

    public c0(byte[] bArr) {
        this.f35622a = bArr;
        this.f35623b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f35624c;
        ea.a.f(i11 >= 0 && (i11 < (i10 = this.f35623b) || (i11 == i10 && this.f35625d == 0)));
    }

    public int b() {
        return (this.f35624c * 8) + this.f35625d;
    }

    public boolean c() {
        boolean z10 = (((this.f35622a[this.f35624c] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> this.f35625d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f35624c;
        int min = Math.min(i10, 8 - this.f35625d);
        int i12 = i11 + 1;
        int i13 = ((this.f35622a[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> this.f35625d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f35622a[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f35624c + i11;
        this.f35624c = i12;
        int i13 = this.f35625d + (i10 - (i11 * 8));
        this.f35625d = i13;
        if (i13 > 7) {
            this.f35624c = i12 + 1;
            this.f35625d = i13 - 8;
        }
        a();
    }
}
