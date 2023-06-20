package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.r1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f19988a;

    /* loaded from: classes2.dex */
    public static abstract class b {
        public abstract int a(int i10, byte[] bArr, int i11, int i12);

        public abstract int a(CharSequence charSequence, byte[] bArr, int i10, int i11);

        public final String a(ByteBuffer byteBuffer, int i10, int i11) throws a0 {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte b10 = byteBuffer.get(i10);
                    if (!a.a(b10)) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) b10;
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte b11 = byteBuffer.get(i10);
                    if (a.a(b11)) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) b11;
                        i10 = i15;
                        while (true) {
                            i14 = i16;
                            if (i10 < i12) {
                                byte b12 = byteBuffer.get(i10);
                                if (!a.a(b12)) {
                                    break;
                                }
                                i10++;
                                i16 = i14 + 1;
                                cArr[i14] = (char) b12;
                            }
                        }
                    } else if (a.b(b11)) {
                        if (i15 < i12) {
                            a.a(b11, byteBuffer.get(i15), cArr, i14);
                            i10 = i15 + 1;
                            i14++;
                        } else {
                            throw a0.c();
                        }
                    } else if (a.c(b11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.a(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            throw a0.c();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = byteBuffer.get(i15);
                        int i19 = i18 + 1;
                        a.a(b11, b13, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                        i14 = i14 + 1 + 1;
                        i10 = i19 + 1;
                    } else {
                        throw a0.c();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        public abstract String a(byte[] bArr, int i10, int i11) throws a0;

        public abstract String b(ByteBuffer byteBuffer, int i10, int i11) throws a0;
    }

    /* loaded from: classes2.dex */
    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    static {
        b cVar;
        if ((r1.f19983g && r1.f19982f) && !com.fyber.inneractive.sdk.protobuf.d.a()) {
            cVar = new e();
        } else {
            cVar = new c();
        }
        f19988a = cVar;
    }

    public static int a(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    public static int a(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int a(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static boolean a(byte[] bArr) {
        return f19988a.a(0, bArr, 0, bArr.length) == 0;
    }

    public static boolean b(byte[] bArr, int i10, int i11) {
        return f19988a.a(0, bArr, i10, i11) == 0;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static void a(byte b10, byte b11, char[] cArr, int i10) throws a0 {
            if (b10 >= -62 && !d(b11)) {
                cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
                return;
            }
            throw a0.c();
        }

        public static boolean a(byte b10) {
            return b10 >= 0;
        }

        public static boolean b(byte b10) {
            return b10 < -32;
        }

        public static boolean c(byte b10) {
            return b10 < -16;
        }

        public static boolean d(byte b10) {
            return b10 > -65;
        }

        public static void a(byte b10, byte b11, byte b12, char[] cArr, int i10) throws a0 {
            if (!d(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !d(b12)))) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
            throw a0.c();
        }

        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws a0 {
            if (!d(b11) && (((b10 << 28) + (b11 + 112)) >> 30) == 0 && !d(b12) && !d(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                return;
            }
            throw a0.c();
        }
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return a(b10, bArr[i10], bArr[i10 + 1]);
                }
                throw new AssertionError();
            }
            return a(b10, bArr[i10]);
        }
        return a(b10);
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new d(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            if (r13[r14] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
            if (r13[r14] > (-65)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
            if (r13[r14] > (-65)) goto L48;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.s1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.s1.c.a(int, byte[], int, int):int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.s1.b
        public String b(ByteBuffer byteBuffer, int i10, int i11) throws a0 {
            return a(byteBuffer, i10, i11);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.s1.b
        public String a(byte[] bArr, int i10, int i11) throws a0 {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte b10 = bArr[i10];
                    if (!a.a(b10)) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) b10;
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (a.a(b11)) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) b11;
                        i10 = i15;
                        while (true) {
                            i14 = i16;
                            if (i10 < i12) {
                                byte b12 = bArr[i10];
                                if (!a.a(b12)) {
                                    break;
                                }
                                i10++;
                                i16 = i14 + 1;
                                cArr[i14] = (char) b12;
                            }
                        }
                    } else if (a.b(b11)) {
                        if (i15 < i12) {
                            a.a(b11, bArr[i15], cArr, i14);
                            i10 = i15 + 1;
                            i14++;
                        } else {
                            throw a0.c();
                        }
                    } else if (a.c(b11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.a(b11, bArr[i15], bArr[i17], cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            throw a0.c();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        byte b13 = bArr[i15];
                        int i19 = i18 + 1;
                        a.a(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                        i14 = i14 + 1 + 1;
                        i10 = i19 + 1;
                    } else {
                        throw a0.c();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.s1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.s1.c.a(java.lang.CharSequence, byte[], int, int):int");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (com.fyber.inneractive.sdk.protobuf.r1.a(r23, r8) > (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
            if (com.fyber.inneractive.sdk.protobuf.r1.a(r23, r8) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
            if (com.fyber.inneractive.sdk.protobuf.r1.a(r23, r8) > (-65)) goto L51;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.s1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(int r22, byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.s1.e.a(int, byte[], int, int):int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.s1.b
        public String b(ByteBuffer byteBuffer, int i10, int i11) throws a0 {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
                long a10 = r1.a(byteBuffer) + i10;
                long j10 = i11 + a10;
                char[] cArr = new char[i11];
                int i12 = 0;
                while (a10 < j10) {
                    byte a11 = r1.f19981e.a(a10);
                    if (!a.a(a11)) {
                        break;
                    }
                    a10++;
                    cArr[i12] = (char) a11;
                    i12++;
                }
                int i13 = i12;
                while (a10 < j10) {
                    long j11 = a10 + 1;
                    r1.d dVar = r1.f19981e;
                    byte a12 = dVar.a(a10);
                    if (a.a(a12)) {
                        cArr[i13] = (char) a12;
                        i13++;
                        a10 = j11;
                        while (a10 < j10) {
                            byte a13 = r1.f19981e.a(a10);
                            if (!a.a(a13)) {
                                break;
                            }
                            a10++;
                            cArr[i13] = (char) a13;
                            i13++;
                        }
                    } else if (a.b(a12)) {
                        if (j11 < j10) {
                            a.a(a12, dVar.a(j11), cArr, i13);
                            i13++;
                            a10 = j11 + 1;
                        } else {
                            throw a0.c();
                        }
                    } else if (a.c(a12)) {
                        if (j11 < j10 - 1) {
                            long j12 = j11 + 1;
                            a.a(a12, dVar.a(j11), dVar.a(j12), cArr, i13);
                            i13++;
                            a10 = j12 + 1;
                        } else {
                            throw a0.c();
                        }
                    } else if (j11 < j10 - 2) {
                        long j13 = j11 + 1;
                        long j14 = j13 + 1;
                        a.a(a12, dVar.a(j11), dVar.a(j13), dVar.a(j14), cArr, i13);
                        i13 = i13 + 1 + 1;
                        a10 = j14 + 1;
                    } else {
                        throw a0.c();
                    }
                }
                return new String(cArr, 0, i13);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.s1.b
        public String a(byte[] bArr, int i10, int i11) throws a0 {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (i10 < i12) {
                    byte a10 = r1.a(bArr, i10);
                    if (!a.a(a10)) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) a10;
                    i13++;
                }
                int i14 = i13;
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte a11 = r1.a(bArr, i10);
                    if (a.a(a11)) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) a11;
                        i10 = i15;
                        while (true) {
                            i14 = i16;
                            if (i10 < i12) {
                                byte a12 = r1.a(bArr, i10);
                                if (!a.a(a12)) {
                                    break;
                                }
                                i10++;
                                i16 = i14 + 1;
                                cArr[i14] = (char) a12;
                            }
                        }
                    } else if (a.b(a11)) {
                        if (i15 < i12) {
                            a.a(a11, r1.a(bArr, i15), cArr, i14);
                            i10 = i15 + 1;
                            i14++;
                        } else {
                            throw a0.c();
                        }
                    } else if (a.c(a11)) {
                        if (i15 < i12 - 1) {
                            int i17 = i15 + 1;
                            a.a(a11, r1.a(bArr, i15), r1.a(bArr, i17), cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            throw a0.c();
                        }
                    } else if (i15 < i12 - 2) {
                        int i18 = i15 + 1;
                        int i19 = i18 + 1;
                        a.a(a11, r1.a(bArr, i15), r1.a(bArr, i18), r1.a(bArr, i19), cArr, i14);
                        i14 = i14 + 1 + 1;
                        i10 = i19 + 1;
                    } else {
                        throw a0.c();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.s1.b
        public int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            char c10;
            long j10;
            long j11;
            long j12;
            int i12;
            char charAt;
            long j13 = i10;
            long j14 = i11 + j13;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                c10 = 128;
                j10 = 1;
                if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                r1.a(bArr, j13, (byte) charAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char charAt2 = charSequence.charAt(i13);
                if (charAt2 >= c10 || j13 >= j14) {
                    if (charAt2 < 2048 && j13 <= j14 - 2) {
                        long j15 = j13 + j10;
                        r1.a(bArr, j13, (byte) ((charAt2 >>> 6) | 960));
                        r1.a(bArr, j15, (byte) ((charAt2 & '?') | 128));
                        j11 = j15 + j10;
                        j12 = j10;
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j13 > j14 - 3) {
                        if (j13 <= j14 - 4) {
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char charAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j16 = j13 + 1;
                                    r1.a(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                    long j17 = j16 + 1;
                                    r1.a(bArr, j16, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j18 = j17 + 1;
                                    r1.a(bArr, j17, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j12 = 1;
                                    j11 = j18 + 1;
                                    r1.a(bArr, j18, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new d(i13 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                            throw new d(i13, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j13);
                        }
                    } else {
                        long j19 = j13 + j10;
                        r1.a(bArr, j13, (byte) ((charAt2 >>> '\f') | 480));
                        long j20 = j19 + j10;
                        r1.a(bArr, j19, (byte) (((charAt2 >>> 6) & 63) | 128));
                        r1.a(bArr, j20, (byte) ((charAt2 & '?') | 128));
                        j11 = j20 + 1;
                        j12 = 1;
                    }
                    i13++;
                    c10 = 128;
                    long j21 = j12;
                    j13 = j11;
                    j10 = j21;
                } else {
                    long j22 = j13 + j10;
                    r1.a(bArr, j13, (byte) charAt2);
                    j12 = j10;
                    j11 = j22;
                }
                i13++;
                c10 = 128;
                long j212 = j12;
                j13 = j11;
                j10 = j212;
            }
            return (int) j13;
        }

        public static int a(byte[] bArr, int i10, long j10, int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return s1.a(i10, r1.a(bArr, j10), r1.a(bArr, j10 + 1));
                    }
                    throw new AssertionError();
                }
                return s1.a(i10, r1.a(bArr, j10));
            }
            return s1.a(i10);
        }
    }
}
