package p8;

import j8.j2;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: ExtractorUtil.java */
/* loaded from: classes2.dex */
public final class l {
    public static void a(boolean z10, String str) throws j2 {
        if (!z10) {
            throw j2.a(str, null);
        }
    }

    public static boolean b(j jVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return jVar.d(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(j jVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int k10 = jVar.k(bArr, i10 + i12, i11 - i12);
            if (k10 == -1) {
                break;
            }
            i12 += k10;
        }
        return i12;
    }

    public static boolean d(j jVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            jVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(j jVar, int i10) throws IOException {
        try {
            jVar.m(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
