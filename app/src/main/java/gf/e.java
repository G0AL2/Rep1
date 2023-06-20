package gf;

import ve.p;

/* compiled from: Http2.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f30908d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f30909e = new e();

    /* renamed from: a  reason: collision with root package name */
    public static final mf.i f30905a = mf.i.f34462e.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f30906b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f30907c = new String[64];

    static {
        String t10;
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            qe.k.e(binaryString, "Integer.toBinaryString(it)");
            t10 = p.t(ze.c.q("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i10] = t10;
        }
        f30908d = strArr;
        String[] strArr2 = f30907c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = f30907c;
            strArr3[i12 | 8] = qe.k.l(strArr3[i12], "|PADDED");
        }
        String[] strArr4 = f30907c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = f30907c;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + "|" + strArr5[i14];
                strArr5[i17 | 8] = strArr5[i16] + "|" + strArr5[i14] + "|PADDED";
            }
        }
        int length = f30907c.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = f30907c;
            if (strArr6[i18] == null) {
                strArr6[i18] = f30908d[i18];
            }
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        String u10;
        String u11;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f30908d[i11];
            } else if (i10 != 7 && i10 != 8) {
                String[] strArr = f30907c;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    qe.k.c(str);
                } else {
                    str = f30908d[i11];
                }
                String str2 = str;
                if (i10 == 5 && (i11 & 4) != 0) {
                    u11 = p.u(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
                    return u11;
                } else if (i10 != 0 || (i11 & 32) == 0) {
                    return str2;
                } else {
                    u10 = p.u(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                    return u10;
                }
            }
        }
        return f30908d[i11];
    }

    public final String b(int i10) {
        String[] strArr = f30906b;
        return i10 < strArr.length ? strArr[i10] : ze.c.q("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return ze.c.q("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
