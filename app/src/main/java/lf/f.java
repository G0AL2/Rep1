package lf;

import mf.f;
import qe.k;

/* compiled from: WebSocketProtocol.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f34104a = new f();

    private f() {
    }

    public final String a(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return "Code must be in range [1000,5000): " + i10;
        } else if ((1004 > i10 || 1006 < i10) && (1015 > i10 || 2999 < i10)) {
            return null;
        } else {
            return "Code " + i10 + " is reserved and may not be used.";
        }
    }

    public final void b(f.a aVar, byte[] bArr) {
        k.f(aVar, "cursor");
        k.f(bArr, "key");
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = aVar.f34452e;
            int i11 = aVar.f34453f;
            int i12 = aVar.f34454g;
            if (bArr2 != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (aVar.a() != -1);
    }

    public final void c(int i10) {
        String a10 = a(i10);
        if (a10 == null) {
            return;
        }
        k.c(a10);
        throw new IllegalArgumentException(a10.toString());
    }
}
