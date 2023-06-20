package nf;

import mf.b0;
import mf.f;
import mf.i;
import qe.k;

/* compiled from: ByteString.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f34816a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final /* synthetic */ int a(byte[] bArr, int i10) {
        return c(bArr, i10);
    }

    public static final /* synthetic */ int b(char c10) {
        return g(c10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0068, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.b.c(byte[], int):int");
    }

    public static final i d(i iVar, String str) {
        k.f(iVar, "$this$commonDigest");
        k.f(str, "algorithm");
        c a10 = d.a(str);
        a10.b(iVar.l(), 0, iVar.A());
        return new i(a10.a());
    }

    public static final i e(b0 b0Var, String str) {
        k.f(b0Var, "$this$commonSegmentDigest");
        k.f(str, "algorithm");
        c a10 = d.a(str);
        int length = b0Var.H().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = b0Var.G()[length + i10];
            int i13 = b0Var.G()[i10];
            a10.b(b0Var.H()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        return new i(a10.a());
    }

    public static final void f(i iVar, f fVar, int i10, int i11) {
        k.f(iVar, "$this$commonWrite");
        k.f(fVar, "buffer");
        fVar.write(iVar.l(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static final char[] h() {
        return f34816a;
    }
}
