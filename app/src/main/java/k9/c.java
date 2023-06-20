package k9;

import ea.r;
import i9.n0;
import k9.g;
import p8.a0;

/* compiled from: BaseMediaChunkOutput.java */
/* loaded from: classes2.dex */
public final class c implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f33364a;

    /* renamed from: b  reason: collision with root package name */
    private final n0[] f33365b;

    public c(int[] iArr, n0[] n0VarArr) {
        this.f33364a = iArr;
        this.f33365b = n0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f33365b.length];
        int i10 = 0;
        while (true) {
            n0[] n0VarArr = this.f33365b;
            if (i10 >= n0VarArr.length) {
                return iArr;
            }
            iArr[i10] = n0VarArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (n0 n0Var : this.f33365b) {
            n0Var.a0(j10);
        }
    }

    @Override // k9.g.b
    public a0 f(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f33364a;
            if (i12 < iArr.length) {
                if (i11 == iArr[i12]) {
                    return this.f33365b[i12];
                }
                i12++;
            } else {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("Unmatched track of type: ");
                sb2.append(i11);
                r.c("BaseMediaChunkOutput", sb2.toString());
                return new p8.h();
            }
        }
    }
}
