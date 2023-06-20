package nf;

import com.inmobi.media.fq;
import mf.f;
import mf.u;
import mf.z;
import qe.k;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private static final byte[] f34815a = mf.b.a("0123456789abcdef");

    public static final byte[] a() {
        return f34815a;
    }

    public static final boolean b(z zVar, int i10, byte[] bArr, int i11, int i12) {
        k.f(zVar, "segment");
        k.f(bArr, "bytes");
        int i13 = zVar.f34510c;
        byte[] bArr2 = zVar.f34508a;
        while (i11 < i12) {
            if (i10 == i13) {
                zVar = zVar.f34513f;
                k.c(zVar);
                byte[] bArr3 = zVar.f34508a;
                bArr2 = bArr3;
                i10 = zVar.f34509b;
                i13 = zVar.f34510c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String c(f fVar, long j10) {
        k.f(fVar, "$this$readUtf8Line");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (fVar.A(j11) == ((byte) 13)) {
                String s02 = fVar.s0(j11);
                fVar.O0(2L);
                return s02;
            }
        }
        String s03 = fVar.s0(j10);
        fVar.O0(1L);
        return s03;
    }

    public static final int d(f fVar, u uVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        z zVar;
        k.f(fVar, "$this$selectPrefix");
        k.f(uVar, "options");
        z zVar2 = fVar.f34446a;
        if (zVar2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = zVar2.f34508a;
        int i14 = zVar2.f34509b;
        int i15 = zVar2.f34510c;
        int[] i16 = uVar.i();
        z zVar3 = zVar2;
        int i17 = 0;
        int i18 = -1;
        loop0: while (true) {
            int i19 = i17 + 1;
            int i20 = i16[i17];
            int i21 = i19 + 1;
            int i22 = i16[i19];
            if (i22 != -1) {
                i18 = i22;
            }
            if (zVar3 == null) {
                break;
            }
            if (i20 >= 0) {
                i10 = i14 + 1;
                int i23 = bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                int i24 = i21 + i20;
                while (i21 != i24) {
                    if (i23 == i16[i21]) {
                        i11 = i16[i21 + i20];
                        if (i10 == i15) {
                            zVar3 = zVar3.f34513f;
                            k.c(zVar3);
                            i10 = zVar3.f34509b;
                            bArr = zVar3.f34508a;
                            i15 = zVar3.f34510c;
                            if (zVar3 == zVar2) {
                                zVar3 = null;
                            }
                        }
                    } else {
                        i21++;
                    }
                }
                return i18;
            }
            int i25 = i21 + (i20 * (-1));
            while (true) {
                int i26 = i14 + 1;
                int i27 = i21 + 1;
                if ((bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) != i16[i21]) {
                    return i18;
                }
                boolean z11 = i27 == i25;
                if (i26 == i15) {
                    k.c(zVar3);
                    z zVar4 = zVar3.f34513f;
                    k.c(zVar4);
                    i13 = zVar4.f34509b;
                    byte[] bArr2 = zVar4.f34508a;
                    i12 = zVar4.f34510c;
                    if (zVar4 != zVar2) {
                        zVar = zVar4;
                        bArr = bArr2;
                    } else if (!z11) {
                        break loop0;
                    } else {
                        bArr = bArr2;
                        zVar = null;
                    }
                } else {
                    z zVar5 = zVar3;
                    i12 = i15;
                    i13 = i26;
                    zVar = zVar5;
                }
                if (z11) {
                    i11 = i16[i27];
                    i10 = i13;
                    i15 = i12;
                    zVar3 = zVar;
                    break;
                }
                i14 = i13;
                i15 = i12;
                i21 = i27;
                zVar3 = zVar;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i18;
    }

    public static /* synthetic */ int e(f fVar, u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d(fVar, uVar, z10);
    }
}
