package k9;

import ea.n0;
import j8.p1;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: DataChunk.java */
/* loaded from: classes2.dex */
public abstract class l extends f {

    /* renamed from: j  reason: collision with root package name */
    private byte[] f33430j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f33431k;

    public l(da.l lVar, da.p pVar, int i10, p1 p1Var, int i11, Object obj, byte[] bArr) {
        super(lVar, pVar, i10, p1Var, i11, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = n0.f29714f;
            lVar2 = this;
        } else {
            lVar2 = this;
            bArr2 = bArr;
        }
        lVar2.f33430j = bArr2;
    }

    private void h(int i10) {
        byte[] bArr = this.f33430j;
        if (bArr.length < i10 + 16384) {
            this.f33430j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // da.e0.e
    public final void b() {
        this.f33431k = true;
    }

    protected abstract void f(byte[] bArr, int i10) throws IOException;

    public byte[] g() {
        return this.f33430j;
    }

    @Override // da.e0.e
    public final void load() throws IOException {
        try {
            this.f33393i.g(this.f33386b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f33431k) {
                h(i11);
                i10 = this.f33393i.c(this.f33430j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f33431k) {
                f(this.f33430j, i11);
            }
        } finally {
            da.o.a(this.f33393i);
        }
    }
}
