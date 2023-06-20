package w8;

import ea.a0;
import java.io.IOException;

/* compiled from: Sniffer.java */
/* loaded from: classes2.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f38445a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f38445a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(p8.j jVar) throws IOException {
        return c(jVar, true, false);
    }

    private static boolean c(p8.j jVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        long b10 = jVar.b();
        long j10 = 4096;
        long j11 = -1;
        int i10 = (b10 > (-1L) ? 1 : (b10 == (-1L) ? 0 : -1));
        if (i10 != 0 && b10 <= 4096) {
            j10 = b10;
        }
        int i11 = (int) j10;
        a0 a0Var = new a0(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (i12 < i11) {
            a0Var.L(8);
            if (!jVar.d(a0Var.d(), z13 ? 1 : 0, 8, true)) {
                break;
            }
            long F = a0Var.F();
            int n10 = a0Var.n();
            int i13 = 16;
            if (F == 1) {
                jVar.p(a0Var.d(), 8, 8);
                a0Var.O(16);
                F = a0Var.w();
            } else {
                if (F == 0) {
                    long b11 = jVar.b();
                    if (b11 != j11) {
                        F = (b11 - jVar.i()) + 8;
                    }
                }
                i13 = 8;
            }
            long j12 = i13;
            if (F < j12) {
                return z13;
            }
            i12 += i13;
            if (n10 == 1836019574) {
                i11 += (int) F;
                if (i10 != 0 && i11 > b10) {
                    i11 = (int) b10;
                }
                j11 = -1;
            } else if (n10 == 1836019558 || n10 == 1836475768) {
                z12 = true;
                break;
            } else {
                long j13 = b10;
                if ((i12 + F) - j12 >= i11) {
                    break;
                }
                int i14 = (int) (F - j12);
                i12 += i14;
                if (n10 == 1718909296) {
                    if (i14 < 8) {
                        return false;
                    }
                    a0Var.L(i14);
                    jVar.p(a0Var.d(), 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            break;
                        }
                        if (i16 == 1) {
                            a0Var.Q(4);
                        } else if (a(a0Var.n(), z11)) {
                            z14 = true;
                            break;
                        }
                        i16++;
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i14 != 0) {
                    jVar.j(i14);
                }
                b10 = j13;
                j11 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    public static boolean d(p8.j jVar, boolean z10) throws IOException {
        return c(jVar, false, z10);
    }
}
