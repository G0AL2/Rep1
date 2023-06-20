package com.ironsource.sdk.utils;

import com.inmobi.media.fq;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f28258d = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    private a f28259a = new a(this, (byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private a f28260b = new a(this, (byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private int[] f28261c = new int[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f28262a;

        /* renamed from: b  reason: collision with root package name */
        int[] f28263b;

        /* renamed from: c  reason: collision with root package name */
        long f28264c;

        /* renamed from: d  reason: collision with root package name */
        byte[] f28265d;

        private a(c cVar) {
            this.f28262a = true;
            this.f28263b = new int[4];
            this.f28265d = new byte[64];
            a();
        }

        /* synthetic */ a(c cVar, byte b10) {
            this(cVar);
        }

        void a() {
            int[] iArr = this.f28263b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f28264c = 0L;
        }
    }

    c() {
        this.f28259a.a();
        this.f28260b.f28262a = false;
    }

    private static int a(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 & i11) | (i13 & (~i11))) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    public static String a(String str) {
        c cVar = new c();
        byte[] bytes = str.getBytes();
        cVar.c(cVar.f28259a, bytes, 0, bytes.length);
        return cVar.b();
    }

    private String b() {
        a aVar = this.f28260b;
        if (!aVar.f28262a) {
            a aVar2 = this.f28259a;
            byte[] bArr = aVar2.f28265d;
            byte[] bArr2 = aVar.f28265d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = aVar2.f28263b;
            int[] iArr2 = aVar.f28263b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            aVar.f28262a = aVar2.f28262a;
            aVar.f28264c = aVar2.f28264c;
            a aVar3 = this.f28260b;
            long j10 = aVar3.f28264c;
            int i10 = (int) ((j10 >>> 3) & 63);
            c(aVar3, f28258d, 0, i10 < 56 ? 56 - i10 : 120 - i10);
            c(this.f28260b, new byte[]{(byte) (j10 & 255), (byte) ((j10 >>> 8) & 255), (byte) ((j10 >>> 16) & 255), (byte) ((j10 >>> 24) & 255), (byte) ((j10 >>> 32) & 255), (byte) ((j10 >>> 40) & 255), (byte) ((j10 >>> 48) & 255), (byte) ((j10 >>> 56) & 255)}, 0, 8);
            this.f28260b.f28262a = true;
        }
        int[] iArr3 = this.f28260b.f28263b;
        byte[] bArr3 = new byte[16];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 16; i11 < i13; i13 = 16) {
            bArr3[i11] = (byte) (iArr3[i12] & 255);
            bArr3[i11 + 1] = (byte) ((iArr3[i12] >>> 8) & 255);
            bArr3[i11 + 2] = (byte) ((iArr3[i12] >>> 16) & 255);
            bArr3[i11 + 3] = (byte) ((iArr3[i12] >>> 24) & 255);
            i12++;
            i11 += 4;
        }
        StringBuffer stringBuffer = new StringBuffer(32);
        for (int i14 = 0; i14 < 16; i14++) {
            int i15 = bArr3[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            if (i15 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i15));
        }
        return stringBuffer.toString();
    }

    private void c(a aVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        this.f28260b.f28262a = false;
        if (i11 + i10 > bArr.length) {
            i11 = bArr.length - i10;
        }
        long j10 = aVar.f28264c;
        int i13 = ((int) (j10 >>> 3)) & 63;
        aVar.f28264c = j10 + (i11 << 3);
        int i14 = 64 - i13;
        if (i11 >= i14) {
            System.arraycopy(bArr, i10, aVar.f28265d, i13, i14);
            d(aVar, e(aVar.f28265d, 64, 0));
            while (i14 + 63 < i11) {
                d(aVar, e(bArr, 64, i14));
                i14 += 64;
            }
            i12 = i14;
            i13 = 0;
        }
        if (i12 < i11) {
            for (int i15 = i12; i15 < i11; i15++) {
                aVar.f28265d[(i13 + i15) - i12] = bArr[i15 + i10];
            }
        }
    }

    private static void d(a aVar, int[] iArr) {
        int[] iArr2 = aVar.f28263b;
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        int i12 = iArr2[2];
        int i13 = iArr2[3];
        int a10 = a(i10, i11, i12, i13, iArr[0], 7, -680876936);
        int a11 = a(i13, a10, i11, i12, iArr[1], 12, -389564586);
        int a12 = a(i12, a11, a10, i11, iArr[2], 17, 606105819);
        int a13 = a(i11, a12, a11, a10, iArr[3], 22, -1044525330);
        int a14 = a(a10, a13, a12, a11, iArr[4], 7, -176418897);
        int a15 = a(a11, a14, a13, a12, iArr[5], 12, 1200080426);
        int a16 = a(a12, a15, a14, a13, iArr[6], 17, -1473231341);
        int a17 = a(a13, a16, a15, a14, iArr[7], 22, -45705983);
        int a18 = a(a14, a17, a16, a15, iArr[8], 7, 1770035416);
        int a19 = a(a15, a18, a17, a16, iArr[9], 12, -1958414417);
        int a20 = a(a16, a19, a18, a17, iArr[10], 17, -42063);
        int a21 = a(a17, a20, a19, a18, iArr[11], 22, -1990404162);
        int a22 = a(a18, a21, a20, a19, iArr[12], 7, 1804603682);
        int a23 = a(a19, a22, a21, a20, iArr[13], 12, -40341101);
        int a24 = a(a20, a23, a22, a21, iArr[14], 17, -1502002290);
        int a25 = a(a21, a24, a23, a22, iArr[15], 22, 1236535329);
        int f10 = f(a22, a25, a24, a23, iArr[1], 5, -165796510);
        int f11 = f(a23, f10, a25, a24, iArr[6], 9, -1069501632);
        int f12 = f(a24, f11, f10, a25, iArr[11], 14, 643717713);
        int f13 = f(a25, f12, f11, f10, iArr[0], 20, -373897302);
        int f14 = f(f10, f13, f12, f11, iArr[5], 5, -701558691);
        int f15 = f(f11, f14, f13, f12, iArr[10], 9, 38016083);
        int f16 = f(f12, f15, f14, f13, iArr[15], 14, -660478335);
        int f17 = f(f13, f16, f15, f14, iArr[4], 20, -405537848);
        int f18 = f(f14, f17, f16, f15, iArr[9], 5, 568446438);
        int f19 = f(f15, f18, f17, f16, iArr[14], 9, -1019803690);
        int f20 = f(f16, f19, f18, f17, iArr[3], 14, -187363961);
        int f21 = f(f17, f20, f19, f18, iArr[8], 20, 1163531501);
        int f22 = f(f18, f21, f20, f19, iArr[13], 5, -1444681467);
        int f23 = f(f19, f22, f21, f20, iArr[2], 9, -51403784);
        int f24 = f(f20, f23, f22, f21, iArr[7], 14, 1735328473);
        int f25 = f(f21, f24, f23, f22, iArr[12], 20, -1926607734);
        int g10 = g(f22, f25, f24, f23, iArr[5], 4, -378558);
        int g11 = g(f23, g10, f25, f24, iArr[8], 11, -2022574463);
        int g12 = g(f24, g11, g10, f25, iArr[11], 16, 1839030562);
        int g13 = g(f25, g12, g11, g10, iArr[14], 23, -35309556);
        int g14 = g(g10, g13, g12, g11, iArr[1], 4, -1530992060);
        int g15 = g(g11, g14, g13, g12, iArr[4], 11, 1272893353);
        int g16 = g(g12, g15, g14, g13, iArr[7], 16, -155497632);
        int g17 = g(g13, g16, g15, g14, iArr[10], 23, -1094730640);
        int g18 = g(g14, g17, g16, g15, iArr[13], 4, 681279174);
        int g19 = g(g15, g18, g17, g16, iArr[0], 11, -358537222);
        int g20 = g(g16, g19, g18, g17, iArr[3], 16, -722521979);
        int g21 = g(g17, g20, g19, g18, iArr[6], 23, 76029189);
        int g22 = g(g18, g21, g20, g19, iArr[9], 4, -640364487);
        int g23 = g(g19, g22, g21, g20, iArr[12], 11, -421815835);
        int g24 = g(g20, g23, g22, g21, iArr[15], 16, 530742520);
        int g25 = g(g21, g24, g23, g22, iArr[2], 23, -995338651);
        int h10 = h(g22, g25, g24, g23, iArr[0], 6, -198630844);
        int h11 = h(g23, h10, g25, g24, iArr[7], 10, 1126891415);
        int h12 = h(g24, h11, h10, g25, iArr[14], 15, -1416354905);
        int h13 = h(g25, h12, h11, h10, iArr[5], 21, -57434055);
        int h14 = h(h10, h13, h12, h11, iArr[12], 6, 1700485571);
        int h15 = h(h11, h14, h13, h12, iArr[3], 10, -1894986606);
        int h16 = h(h12, h15, h14, h13, iArr[10], 15, -1051523);
        int h17 = h(h13, h16, h15, h14, iArr[1], 21, -2054922799);
        int h18 = h(h14, h17, h16, h15, iArr[8], 6, 1873313359);
        int h19 = h(h15, h18, h17, h16, iArr[15], 10, -30611744);
        int h20 = h(h16, h19, h18, h17, iArr[6], 15, -1560198380);
        int h21 = h(h17, h20, h19, h18, iArr[13], 21, 1309151649);
        int h22 = h(h18, h21, h20, h19, iArr[4], 6, -145523070);
        int h23 = h(h19, h22, h21, h20, iArr[11], 10, -1120210379);
        int h24 = h(h20, h23, h22, h21, iArr[2], 15, 718787259);
        int h25 = h(h21, h24, h23, h22, iArr[9], 21, -343485551);
        int[] iArr3 = aVar.f28263b;
        iArr3[0] = iArr3[0] + h22;
        iArr3[1] = iArr3[1] + h25;
        iArr3[2] = iArr3[2] + h24;
        iArr3[3] = iArr3[3] + h23;
    }

    private int[] e(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 64; i13 += 4) {
            this.f28261c[i12] = (bArr[i13 + i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[(i13 + 1) + i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[(i13 + 2) + i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[(i13 + 3) + i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24);
            i12++;
        }
        return this.f28261c;
    }

    private static int f(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 & (~i13)) | (i11 & i13)) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    private static int g(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 ^ i11) ^ i13) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    private static int h(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + (i12 ^ ((~i13) | i11)) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    public final String toString() {
        return b();
    }
}
