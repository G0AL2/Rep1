package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.t1;
import com.fyber.inneractive.sdk.protobuf.z;
import com.inmobi.media.fq;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f19857a;

        /* renamed from: b  reason: collision with root package name */
        public long f19858b;

        /* renamed from: c  reason: collision with root package name */
        public Object f19859c;

        /* renamed from: d  reason: collision with root package name */
        public final q f19860d;

        public a(q qVar) {
            qVar.getClass();
            this.f19860d = qVar;
        }
    }

    public static int a(int i10, byte[] bArr, int i11, a aVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f19857a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f19857a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f19857a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            aVar.f19857a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                aVar.f19857a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static long b(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int c(byte[] bArr, int i10, a aVar) throws a0 {
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a;
        if (i11 >= 0) {
            if (i11 == 0) {
                aVar.f19859c = "";
                return d10;
            }
            aVar.f19859c = s1.f19988a.a(bArr, d10, i11);
            return d10 + i11;
        }
        throw a0.f();
    }

    public static int d(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            aVar.f19857a = b10;
            return i11;
        }
        return a(b10, bArr, i11, aVar);
    }

    public static int e(byte[] bArr, int i10, a aVar) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            aVar.f19858b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        aVar.f19858b = j11;
        return i12;
    }

    public static int f(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        y yVar = (y) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            d10 = d(bArr, d10, aVar);
            yVar.c(j.b(aVar.f19857a));
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int g(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        h0 h0Var = (h0) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            d10 = e(bArr, d10, aVar);
            h0Var.a(j.a(aVar.f19858b));
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int h(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        y yVar = (y) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            d10 = d(bArr, d10, aVar);
            yVar.c(aVar.f19857a);
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int i(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        h0 h0Var = (h0) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            d10 = e(bArr, d10, aVar);
            h0Var.a(aVar.f19858b);
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int b(byte[] bArr, int i10, a aVar) throws a0 {
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a;
        if (i11 >= 0) {
            if (i11 == 0) {
                aVar.f19859c = "";
                return d10;
            }
            aVar.f19859c = new String(bArr, d10, i11, z.f20078a);
            return d10 + i11;
        }
        throw a0.f();
    }

    public static int d(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        h0 h0Var = (h0) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            h0Var.a(b(bArr, d10));
            d10 += 8;
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int e(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        w wVar = (w) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            wVar.a(Float.intBitsToFloat(a(bArr, d10)));
            d10 += 4;
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int b(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        n nVar = (n) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            nVar.a(Double.longBitsToDouble(b(bArr, d10)));
            d10 += 8;
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int c(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        y yVar = (y) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            yVar.c(a(bArr, d10));
            d10 += 4;
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static int a(byte[] bArr, int i10, a aVar) throws a0 {
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - d10) {
                if (i11 == 0) {
                    aVar.f19859c = i.f19881b;
                    return d10;
                }
                aVar.f19859c = i.a(bArr, d10, i11);
                return d10 + i11;
            }
            throw a0.i();
        }
        throw a0.f();
    }

    public static int a(f1 f1Var, byte[] bArr, int i10, int i11, a aVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = a(i13, bArr, i12, aVar);
            i13 = aVar.f19857a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object a10 = f1Var.a();
            int i15 = i13 + i14;
            f1Var.a(a10, bArr, i14, i15, aVar);
            f1Var.c(a10);
            aVar.f19859c = a10;
            return i15;
        }
        throw a0.i();
    }

    public static int a(f1 f1Var, byte[] bArr, int i10, int i11, int i12, a aVar) throws IOException {
        t0 t0Var = (t0) f1Var;
        Object a10 = t0Var.a();
        int a11 = t0Var.a((t0) a10, bArr, i10, i11, i12, aVar);
        t0Var.c((t0) a10);
        aVar.f19859c = a10;
        return a11;
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, z.j<?> jVar, a aVar) {
        y yVar = (y) jVar;
        int d10 = d(bArr, i11, aVar);
        yVar.c(aVar.f19857a);
        while (d10 < i12) {
            int d11 = d(bArr, d10, aVar);
            if (i10 != aVar.f19857a) {
                break;
            }
            d10 = d(bArr, d11, aVar);
            yVar.c(aVar.f19857a);
        }
        return d10;
    }

    public static int a(byte[] bArr, int i10, z.j<?> jVar, a aVar) throws IOException {
        g gVar = (g) jVar;
        int d10 = d(bArr, i10, aVar);
        int i11 = aVar.f19857a + d10;
        while (d10 < i11) {
            d10 = e(bArr, d10, aVar);
            gVar.a(aVar.f19858b != 0);
        }
        if (d10 == i11) {
            return d10;
        }
        throw a0.i();
    }

    public static int a(f1<?> f1Var, int i10, byte[] bArr, int i11, int i12, z.j<?> jVar, a aVar) throws IOException {
        int a10 = a(f1Var, bArr, i11, i12, aVar);
        jVar.add(aVar.f19859c);
        while (a10 < i12) {
            int d10 = d(bArr, a10, aVar);
            if (i10 != aVar.f19857a) {
                break;
            }
            a10 = a(f1Var, bArr, d10, i12, aVar);
            jVar.add(aVar.f19859c);
        }
        return a10;
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.d<?, ?> dVar, m1<n1, n1> m1Var, a aVar) throws IOException {
        int e10;
        Object a10;
        u<GeneratedMessageLite.c> uVar = extendableMessage.extensions;
        int i13 = i10 >>> 3;
        GeneratedMessageLite.c cVar = dVar.f19814d;
        if (cVar.f19809d && cVar.f19810e) {
            switch (cVar.f19808c.ordinal()) {
                case 0:
                    n nVar = new n(new double[10], 0);
                    int b10 = b(bArr, i11, nVar, aVar);
                    uVar.c(dVar.f19814d, nVar);
                    return b10;
                case 1:
                    w wVar = new w(new float[10], 0);
                    int e11 = e(bArr, i11, wVar, aVar);
                    uVar.c(dVar.f19814d, wVar);
                    return e11;
                case 2:
                case 3:
                    h0 h0Var = new h0();
                    int i14 = i(bArr, i11, h0Var, aVar);
                    uVar.c(dVar.f19814d, h0Var);
                    return i14;
                case 4:
                case 12:
                    y yVar = new y();
                    int h10 = h(bArr, i11, yVar, aVar);
                    uVar.c(dVar.f19814d, yVar);
                    return h10;
                case 5:
                case 15:
                    h0 h0Var2 = new h0();
                    int d10 = d(bArr, i11, h0Var2, aVar);
                    uVar.c(dVar.f19814d, h0Var2);
                    return d10;
                case 6:
                case 14:
                    y yVar2 = new y();
                    int c10 = c(bArr, i11, yVar2, aVar);
                    uVar.c(dVar.f19814d, yVar2);
                    return c10;
                case 7:
                    g gVar = new g(new boolean[10], 0);
                    int a11 = a(bArr, i11, gVar, aVar);
                    uVar.c(dVar.f19814d, gVar);
                    return a11;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Type cannot be packed: ");
                    sb2.append(dVar.f19814d.f19808c);
                    throw new IllegalStateException(sb2.toString());
                case 13:
                    y yVar3 = new y();
                    int h11 = h(bArr, i11, yVar3, aVar);
                    n1 n1Var = extendableMessage.unknownFields;
                    n1 n1Var2 = (n1) h1.a(i13, (List<Integer>) yVar3, dVar.f19814d.f19806a, n1Var != n1.f19962f ? n1Var : null, (m1<UT, Object>) m1Var);
                    if (n1Var2 != null) {
                        extendableMessage.unknownFields = n1Var2;
                    }
                    uVar.c(dVar.f19814d, yVar3);
                    return h11;
                case 16:
                    y yVar4 = new y();
                    int f10 = f(bArr, i11, yVar4, aVar);
                    uVar.c(dVar.f19814d, yVar4);
                    return f10;
                case 17:
                    h0 h0Var3 = new h0();
                    int g10 = g(bArr, i11, h0Var3, aVar);
                    uVar.c(dVar.f19814d, h0Var3);
                    return g10;
            }
        }
        t1.b bVar = cVar.f19808c;
        if (bVar == t1.b.f20027p) {
            int d11 = d(bArr, i11, aVar);
            if (dVar.f19814d.f19806a.a(aVar.f19857a) == null) {
                n1 n1Var3 = extendableMessage.unknownFields;
                if (n1Var3 == n1.f19962f) {
                    n1Var3 = n1.c();
                    extendableMessage.unknownFields = n1Var3;
                }
                int i15 = aVar.f19857a;
                Class<?> cls = h1.f19877a;
                if (n1Var3 == null) {
                    n1Var3 = m1Var.a();
                }
                m1Var.b(n1Var3, i13, i15);
                return d11;
            }
            r10 = Integer.valueOf(aVar.f19857a);
            e10 = d11;
        } else {
            switch (bVar.ordinal()) {
                case 0:
                    r10 = Double.valueOf(Double.longBitsToDouble(b(bArr, i11)));
                    e10 = i11 + 8;
                    break;
                case 1:
                    r10 = Float.valueOf(Float.intBitsToFloat(a(bArr, i11)));
                    e10 = i11 + 4;
                    break;
                case 2:
                case 3:
                    e10 = e(bArr, i11, aVar);
                    r10 = Long.valueOf(aVar.f19858b);
                    break;
                case 4:
                case 12:
                    e10 = d(bArr, i11, aVar);
                    r10 = Integer.valueOf(aVar.f19857a);
                    break;
                case 5:
                case 15:
                    r10 = Long.valueOf(b(bArr, i11));
                    e10 = i11 + 8;
                    break;
                case 6:
                case 14:
                    r10 = Integer.valueOf(a(bArr, i11));
                    e10 = i11 + 4;
                    break;
                case 7:
                    e10 = e(bArr, i11, aVar);
                    r10 = Boolean.valueOf(aVar.f19858b != 0);
                    break;
                case 8:
                    e10 = b(bArr, i11, aVar);
                    r10 = aVar.f19859c;
                    break;
                case 9:
                    e10 = a(b1.f19840c.a(dVar.f19813c.getClass()), bArr, i11, i12, (i13 << 3) | 4, aVar);
                    r10 = aVar.f19859c;
                    break;
                case 10:
                    e10 = a(b1.f19840c.a(dVar.f19813c.getClass()), bArr, i11, i12, aVar);
                    r10 = aVar.f19859c;
                    break;
                case 11:
                    e10 = a(bArr, i11, aVar);
                    r10 = aVar.f19859c;
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 16:
                    e10 = d(bArr, i11, aVar);
                    r10 = Integer.valueOf(j.b(aVar.f19857a));
                    break;
                case 17:
                    e10 = e(bArr, i11, aVar);
                    r10 = Long.valueOf(j.a(aVar.f19858b));
                    break;
                default:
                    e10 = i11;
                    break;
            }
        }
        GeneratedMessageLite.c cVar2 = dVar.f19814d;
        if (cVar2.f19809d) {
            uVar.a((u<GeneratedMessageLite.c>) cVar2, r10);
        } else {
            int ordinal = cVar2.f19808c.ordinal();
            if ((ordinal == 9 || ordinal == 10) && (a10 = uVar.a((u<GeneratedMessageLite.c>) dVar.f19814d)) != null) {
                r10 = z.a(a10, r10);
            }
            uVar.c(dVar.f19814d, r10);
        }
        return e10;
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, n1 n1Var, a aVar) throws a0 {
        int i13 = t1.f20010a;
        if ((i10 >>> 3) != 0) {
            int i14 = i10 & 7;
            if (i14 == 0) {
                int e10 = e(bArr, i11, aVar);
                n1Var.a(i10, Long.valueOf(aVar.f19858b));
                return e10;
            } else if (i14 == 1) {
                n1Var.a(i10, Long.valueOf(b(bArr, i11)));
                return i11 + 8;
            } else if (i14 == 2) {
                int d10 = d(bArr, i11, aVar);
                int i15 = aVar.f19857a;
                if (i15 >= 0) {
                    if (i15 <= bArr.length - d10) {
                        if (i15 == 0) {
                            n1Var.a(i10, i.f19881b);
                        } else {
                            n1Var.a(i10, i.a(bArr, d10, i15));
                        }
                        return d10 + i15;
                    }
                    throw a0.i();
                }
                throw a0.f();
            } else if (i14 != 3) {
                if (i14 == 5) {
                    n1Var.a(i10, Integer.valueOf(a(bArr, i11)));
                    return i11 + 4;
                }
                throw a0.b();
            } else {
                n1 c10 = n1.c();
                int i16 = (i10 & (-8)) | 4;
                int i17 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int d11 = d(bArr, i11, aVar);
                    int i18 = aVar.f19857a;
                    if (i18 == i16) {
                        i17 = i18;
                        i11 = d11;
                        break;
                    }
                    i17 = i18;
                    i11 = a(i18, bArr, d11, i12, c10, aVar);
                }
                if (i11 <= i12 && i17 == i16) {
                    n1Var.a(i10, c10);
                    return i11;
                }
                throw a0.g();
            }
        }
        throw a0.b();
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, a aVar) throws a0 {
        int i13 = t1.f20010a;
        if ((i10 >>> 3) != 0) {
            int i14 = i10 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                return i11 + 4;
                            }
                            throw a0.b();
                        }
                        int i15 = (i10 & (-8)) | 4;
                        int i16 = 0;
                        while (i11 < i12) {
                            i11 = d(bArr, i11, aVar);
                            i16 = aVar.f19857a;
                            if (i16 == i15) {
                                break;
                            }
                            i11 = a(i16, bArr, i11, i12, aVar);
                        }
                        if (i11 > i12 || i16 != i15) {
                            throw a0.g();
                        }
                        return i11;
                    }
                    return d(bArr, i11, aVar) + aVar.f19857a;
                }
                return i11 + 8;
            }
            return e(bArr, i11, aVar);
        }
        throw a0.b();
    }
}
