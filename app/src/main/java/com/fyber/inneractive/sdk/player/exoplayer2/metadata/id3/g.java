package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.inmobi.media.fq;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final int f19204b = u.a("ID3");

    /* renamed from: a  reason: collision with root package name */
    public final a f19205a;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19206a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19207b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19208c;

        public b(int i10, boolean z10, int i11) {
            this.f19206a = i10;
            this.f19207b = z10;
            this.f19208c = i11;
        }
    }

    public g() {
        this(null);
    }

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static d b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int i13 = kVar.f19580b;
        int b10 = b(kVar.f19579a, i13);
        String str = new String(kVar.f19579a, i13, b10 - i13, "ISO-8859-1");
        kVar.e(b10 + 1);
        int l10 = kVar.l();
        boolean z11 = (l10 & 2) != 0;
        boolean z12 = (l10 & 1) != 0;
        int l11 = kVar.l();
        String[] strArr = new String[l11];
        for (int i14 = 0; i14 < l11; i14++) {
            int i15 = kVar.f19580b;
            int b11 = b(kVar.f19579a, i15);
            strArr[i14] = new String(kVar.f19579a, i15, b11 - i15, "ISO-8859-1");
            kVar.e(b11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (kVar.f19580b < i16) {
            h a10 = a(i11, kVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new d(str, z11, z12, strArr, hVarArr);
    }

    public static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static k c(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i10);
        kVar.f19580b += i10;
        return new k(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    public static j d(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int l10 = kVar.l();
        String b10 = b(l10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i11);
        kVar.f19580b += i11;
        int a10 = a(bArr, 0, l10);
        String str = new String(bArr, 0, a10, b10);
        int a11 = a10 + a(l10);
        return new j("TXXX", str, a11 < i11 ? new String(bArr, a11, a(bArr, a11, l10) - a11, b10) : "");
    }

    public static k e(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int l10 = kVar.l();
        String b10 = b(l10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i11);
        kVar.f19580b += i11;
        int a10 = a(bArr, 0, l10);
        String str = new String(bArr, 0, a10, b10);
        int a11 = a10 + a(l10);
        return new k("WXXX", str, a11 < i11 ? new String(bArr, a11, b(bArr, a11) - a11, "ISO-8859-1") : "");
    }

    public static int f(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) {
        byte[] bArr = kVar.f19579a;
        int i11 = kVar.f19580b;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                return i10;
            }
            if ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i10 - i11) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.a a(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(byte[], int):com.fyber.inneractive.sdk.player.exoplayer2.metadata.a");
    }

    public g(a aVar) {
        this.f19205a = aVar;
    }

    public static i c(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i10);
        kVar.f19580b += i10;
        int b10 = b(bArr, 0);
        String str = new String(bArr, 0, b10, "ISO-8859-1");
        int i11 = b10 + 1;
        return new i(str, i11 < i10 ? Arrays.copyOfRange(bArr, i11, i10) : new byte[0]);
    }

    public static j b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int l10 = kVar.l();
        String b10 = b(l10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i11);
        kVar.f19580b += i11;
        return new j(str, null, new String(bArr, 0, a(bArr, 0, l10), b10));
    }

    public static f b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) throws UnsupportedEncodingException {
        int l10 = kVar.l();
        String b10 = b(l10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i11);
        kVar.f19580b += i11;
        int b11 = b(bArr, 0);
        String str = new String(bArr, 0, b11, "ISO-8859-1");
        int i12 = b11 + 1;
        int a10 = a(bArr, i12, l10);
        String str2 = new String(bArr, i12, a10 - i12, b10);
        int a11 = a10 + a(l10);
        int a12 = a(bArr, a11, l10);
        return new f(str, str2, new String(bArr, a11, a12 - a11, b10), Arrays.copyOfRange(bArr, a12 + a(l10), i11));
    }

    public static c a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        int i13 = kVar.f19580b;
        int b10 = b(kVar.f19579a, i13);
        String str = new String(kVar.f19579a, i13, b10 - i13, "ISO-8859-1");
        kVar.e(b10 + 1);
        int c10 = kVar.c();
        int c11 = kVar.c();
        long m10 = kVar.m();
        long j10 = m10 == 4294967295L ? -1L : m10;
        long m11 = kVar.m();
        long j11 = m11 == 4294967295L ? -1L : m11;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (kVar.f19580b < i14) {
            h a10 = a(i11, kVar, z10, i12, aVar);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new c(str, c10, c11, j10, j11, hVarArr);
    }

    public static int b(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.k r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f19580b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Lab
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L20
            int r7 = r18.c()     // Catch: java.lang.Throwable -> Lab
            long r8 = r18.m()     // Catch: java.lang.Throwable -> Lab
            int r10 = r18.q()     // Catch: java.lang.Throwable -> Lab
            goto L2a
        L20:
            int r7 = r18.n()     // Catch: java.lang.Throwable -> Lab
            int r8 = r18.n()     // Catch: java.lang.Throwable -> Lab
            long r8 = (long) r8
            r10 = 0
        L2a:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            r1.e(r2)
            return r4
        L38:
            r7 = 4
            if (r0 != r7) goto L69
            if (r21 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L49
            r1.e(r2)
            return r6
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L69:
            if (r0 != r7) goto L77
            r3 = r10 & 64
            if (r3 == 0) goto L71
            r3 = 1
            goto L72
        L71:
            r3 = 0
        L72:
            r7 = r10 & 1
            if (r7 == 0) goto L86
            goto L87
        L77:
            if (r0 != r3) goto L85
            r3 = r10 & 32
            if (r3 == 0) goto L7f
            r3 = 1
            goto L80
        L7f:
            r3 = 0
        L80:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L87
        L85:
            r3 = 0
        L86:
            r4 = 0
        L87:
            if (r4 == 0) goto L8b
            int r3 = r3 + 4
        L8b:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L94
            r1.e(r2)
            return r6
        L94:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Lab
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La1
            r1.e(r2)
            return r6
        La1:
            int r3 = (int) r8
            r1.f(r3)     // Catch: java.lang.Throwable -> Lab
            goto L6
        La7:
            r1.e(r2)
            return r4
        Lab:
            r0 = move-exception
            r1.e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(com.fyber.inneractive.sdk.player.exoplayer2.util.k, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x018a, code lost:
        if (r11 == 67) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h a(int r21, com.fyber.inneractive.sdk.player.exoplayer2.util.k r22, boolean r23, int r24, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a r25) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g.a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.k, boolean, int, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a):com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10, int i11) throws UnsupportedEncodingException {
        int b10;
        String str;
        int l10 = kVar.l();
        String b11 = b(l10);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i12);
        kVar.f19580b += i12;
        if (i11 == 2) {
            str = "image/" + new String(bArr, 0, 3, "ISO-8859-1").toLowerCase(Locale.US);
            if (str.equals("image/jpg")) {
                str = "image/jpeg";
            }
            b10 = 2;
        } else {
            b10 = b(bArr, 0);
            String lowerCase = new String(bArr, 0, b10, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i13 = bArr[b10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i14 = b10 + 2;
        int a10 = a(bArr, i14, l10);
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a(str, new String(bArr, i14, a10 - i14, b11), i13, Arrays.copyOfRange(bArr, a10 + a(l10), i12));
    }

    public static e a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int l10 = kVar.l();
        String b10 = b(l10);
        byte[] bArr = new byte[3];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, 3);
        kVar.f19580b += 3;
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr2, 0, i11);
        kVar.f19580b += i11;
        int a10 = a(bArr2, 0, l10);
        String str2 = new String(bArr2, 0, a10, b10);
        int a11 = a10 + a(l10);
        return new e(str, str2, a11 < i11 ? new String(bArr2, a11, a(bArr2, a11, l10) - a11, b10) : "");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i10);
        kVar.f19580b += i10;
        return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b(str, bArr);
    }

    public static String a(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int a(byte[] bArr, int i10, int i11) {
        int b10 = b(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return b10;
        }
        while (b10 < bArr.length - 1) {
            if (b10 % 2 == 0 && bArr[b10 + 1] == 0) {
                return b10;
            }
            b10 = b(bArr, b10 + 1);
        }
        return bArr.length;
    }
}
