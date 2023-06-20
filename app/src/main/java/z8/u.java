package z8;

import java.util.Arrays;

/* compiled from: NalUnitTargetBuffer.java */
/* loaded from: classes2.dex */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final int f40443a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f40444b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40445c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f40446d;

    /* renamed from: e  reason: collision with root package name */
    public int f40447e;

    public u(int i10, int i11) {
        this.f40443a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f40446d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f40444b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f40446d;
            int length = bArr2.length;
            int i13 = this.f40447e;
            if (length < i13 + i12) {
                this.f40446d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f40446d, this.f40447e, i12);
            this.f40447e += i12;
        }
    }

    public boolean b(int i10) {
        if (this.f40444b) {
            this.f40447e -= i10;
            this.f40444b = false;
            this.f40445c = true;
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f40445c;
    }

    public void d() {
        this.f40444b = false;
        this.f40445c = false;
    }

    public void e(int i10) {
        ea.a.f(!this.f40444b);
        boolean z10 = i10 == this.f40443a;
        this.f40444b = z10;
        if (z10) {
            this.f40447e = 3;
            this.f40445c = false;
        }
    }
}
