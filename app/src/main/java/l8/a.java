package l8;

import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import j8.j2;

/* compiled from: AacUtil.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f33742a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f33743b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f33744a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33745b;

        /* renamed from: c  reason: collision with root package name */
        public final String f33746c;

        private b(int i10, int i11, String str) {
            this.f33744a = i10;
            this.f33745b = i11;
            this.f33746c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            int[] iArr = f33742a;
            if (i13 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i13]) {
                i14 = i13;
            }
            i13++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f33743b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i14, i15);
        }
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("Invalid sample rate or number of channels: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    private static int c(ea.z zVar) {
        int h10 = zVar.h(5);
        return h10 == 31 ? zVar.h(6) + 32 : h10;
    }

    private static int d(ea.z zVar) throws j2 {
        int h10 = zVar.h(4);
        if (h10 == 15) {
            return zVar.h(24);
        }
        if (h10 < 13) {
            return f33742a[h10];
        }
        throw j2.a(null, null);
    }

    public static b e(ea.z zVar, boolean z10) throws j2 {
        int c10 = c(zVar);
        int d10 = d(zVar);
        int h10 = zVar.h(4);
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append("mp4a.40.");
        sb2.append(c10);
        String sb3 = sb2.toString();
        if (c10 == 5 || c10 == 29) {
            d10 = d(zVar);
            c10 = c(zVar);
            if (c10 == 22) {
                h10 = zVar.h(4);
            }
        }
        if (z10) {
            if (c10 != 1 && c10 != 2 && c10 != 3 && c10 != 4 && c10 != 6 && c10 != 7 && c10 != 17) {
                switch (c10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb4 = new StringBuilder(42);
                        sb4.append("Unsupported audio object type: ");
                        sb4.append(c10);
                        throw j2.d(sb4.toString());
                }
            }
            g(zVar, c10, h10);
            switch (c10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h11 = zVar.h(2);
                    if (h11 == 2 || h11 == 3) {
                        StringBuilder sb5 = new StringBuilder(33);
                        sb5.append("Unsupported epConfig: ");
                        sb5.append(h11);
                        throw j2.d(sb5.toString());
                    }
            }
        }
        int i10 = f33743b[h10];
        if (i10 != -1) {
            return new b(d10, i10, sb3);
        }
        throw j2.a(null, null);
    }

    public static b f(byte[] bArr) throws j2 {
        return e(new ea.z(bArr), false);
    }

    private static void g(ea.z zVar, int i10, int i11) {
        if (zVar.g()) {
            ea.r.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (zVar.g()) {
            zVar.r(14);
        }
        boolean g10 = zVar.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            zVar.r(3);
        }
        if (g10) {
            if (i10 == 22) {
                zVar.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                zVar.r(3);
            }
            zVar.r(1);
        }
    }
}
