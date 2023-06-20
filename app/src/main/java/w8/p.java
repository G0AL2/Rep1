package w8;

import p8.a0;

/* compiled from: TrackEncryptionBox.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38457a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38458b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.a f38459c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38460d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f38461e;

    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        ea.a.a((bArr2 == null) ^ (i10 == 0));
        this.f38457a = z10;
        this.f38458b = str;
        this.f38460d = i10;
        this.f38461e = bArr2;
        this.f38459c = new a0.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                StringBuilder sb2 = new StringBuilder(str.length() + 68);
                sb2.append("Unsupported protection scheme type '");
                sb2.append(str);
                sb2.append("'. Assuming AES-CTR crypto mode.");
                ea.r.h("TrackEncryptionBox", sb2.toString());
                break;
        }
        return 1;
    }
}
