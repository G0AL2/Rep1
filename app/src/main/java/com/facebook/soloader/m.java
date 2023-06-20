package com.facebook.soloader;

import android.util.Log;
import com.inmobi.media.fq;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* compiled from: MinElf.java */
/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MinElf.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        a(String str) {
            super(str);
        }
    }

    /* compiled from: MinElf.java */
    /* loaded from: classes.dex */
    public enum b {
        NOT_SO("not_so"),
        X86("x86"),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f16546a;

        b(String str) {
            this.f16546a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f16546a;
        }
    }

    public static String[] a(f fVar) throws IOException {
        if (fVar instanceof g) {
            return c((g) fVar);
        }
        return b(fVar);
    }

    private static String[] b(f fVar) throws IOException {
        long g10;
        long j10;
        long j11;
        long j12;
        long g11;
        long j13;
        long d10;
        long d11;
        long d12;
        long g12;
        long g13;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (g(fVar, allocate, 0L) == 1179403647) {
            boolean z10 = h(fVar, allocate, 4L) == 1;
            if (h(fVar, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long g14 = z10 ? g(fVar, allocate, 28L) : d(fVar, allocate, 32L);
            long f10 = z10 ? f(fVar, allocate, 44L) : f(fVar, allocate, 56L);
            int f11 = f(fVar, allocate, z10 ? 42L : 54L);
            if (f10 == 65535) {
                long g15 = z10 ? g(fVar, allocate, 32L) : d(fVar, allocate, 40L);
                if (z10) {
                    g13 = g(fVar, allocate, g15 + 28);
                } else {
                    g13 = g(fVar, allocate, g15 + 44);
                }
                f10 = g13;
            }
            long j14 = g14;
            long j15 = 0;
            while (true) {
                if (j15 >= f10) {
                    j10 = 0;
                    break;
                }
                if (z10) {
                    g12 = g(fVar, allocate, j14 + 0);
                } else {
                    g12 = g(fVar, allocate, j14 + 0);
                }
                if (g12 != 2) {
                    j14 += f11;
                    j15++;
                } else if (z10) {
                    j10 = g(fVar, allocate, j14 + 4);
                } else {
                    j10 = d(fVar, allocate, j14 + 8);
                }
            }
            long j16 = 0;
            if (j10 == 0) {
                throw new a("ELF file does not contain dynamic linking information");
            }
            long j17 = j10;
            long j18 = 0;
            int i10 = 0;
            while (true) {
                boolean z11 = z10;
                long g16 = z10 ? g(fVar, allocate, j17 + j16) : d(fVar, allocate, j17 + j16);
                if (g16 == 1) {
                    j11 = j10;
                    if (i10 == Integer.MAX_VALUE) {
                        throw new a("malformed DT_NEEDED section");
                    }
                    i10++;
                } else {
                    j11 = j10;
                    if (g16 == 5) {
                        j18 = z11 ? g(fVar, allocate, j17 + 4) : d(fVar, allocate, j17 + 8);
                    }
                }
                long j19 = 16;
                j17 += z11 ? 8L : 16L;
                j16 = 0;
                if (g16 != 0) {
                    z10 = z11;
                    j10 = j11;
                } else if (j18 == 0) {
                    throw new a("Dynamic section string-table not found");
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= f10) {
                            j12 = 0;
                            break;
                        }
                        if (z11) {
                            g11 = g(fVar, allocate, g14 + j16);
                        } else {
                            g11 = g(fVar, allocate, g14 + j16);
                        }
                        if (g11 == 1) {
                            if (z11) {
                                d10 = g(fVar, allocate, g14 + 8);
                            } else {
                                d10 = d(fVar, allocate, g14 + j19);
                            }
                            if (z11) {
                                j13 = f10;
                                d11 = g(fVar, allocate, g14 + 20);
                            } else {
                                j13 = f10;
                                d11 = d(fVar, allocate, g14 + 40);
                            }
                            if (d10 <= j18 && j18 < d11 + d10) {
                                if (z11) {
                                    d12 = g(fVar, allocate, g14 + 4);
                                } else {
                                    d12 = d(fVar, allocate, g14 + 8);
                                }
                                j12 = d12 + (j18 - d10);
                            }
                        } else {
                            j13 = f10;
                        }
                        g14 += f11;
                        i11++;
                        f10 = j13;
                        j19 = 16;
                        j16 = 0;
                    }
                    long j20 = 0;
                    if (j12 != 0) {
                        String[] strArr = new String[i10];
                        int i12 = 0;
                        while (true) {
                            long j21 = j11 + j20;
                            long g17 = z11 ? g(fVar, allocate, j21) : d(fVar, allocate, j21);
                            if (g17 == 1) {
                                strArr[i12] = e(fVar, allocate, (z11 ? g(fVar, allocate, j11 + 4) : d(fVar, allocate, j11 + 8)) + j12);
                                if (i12 == Integer.MAX_VALUE) {
                                    throw new a("malformed DT_NEEDED section");
                                }
                                i12++;
                            }
                            j11 += z11 ? 8L : 16L;
                            if (g17 == 0) {
                                if (i12 == i10) {
                                    return strArr;
                                }
                                throw new a("malformed DT_NEEDED section");
                            }
                            j20 = 0;
                        }
                    } else {
                        throw new a("did not find file offset of DT_STRTAB table");
                    }
                }
            }
        } else {
            throw new a("file is not ELF: 0x" + Long.toHexString(g10));
        }
    }

    private static String[] c(g gVar) throws IOException {
        int i10 = 0;
        while (true) {
            try {
                return b(gVar);
            } catch (ClosedByInterruptException e10) {
                i10++;
                if (i10 <= 4) {
                    Thread.interrupted();
                    Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e10);
                    gVar.a();
                } else {
                    throw e10;
                }
            }
        }
    }

    private static long d(f fVar, ByteBuffer byteBuffer, long j10) throws IOException {
        i(fVar, byteBuffer, 8, j10);
        return byteBuffer.getLong();
    }

    private static String e(f fVar, ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short h10 = h(fVar, byteBuffer, j10);
            if (h10 != 0) {
                sb2.append((char) h10);
                j10 = j11;
            } else {
                return sb2.toString();
            }
        }
    }

    private static int f(f fVar, ByteBuffer byteBuffer, long j10) throws IOException {
        i(fVar, byteBuffer, 2, j10);
        return byteBuffer.getShort() & 65535;
    }

    private static long g(f fVar, ByteBuffer byteBuffer, long j10) throws IOException {
        i(fVar, byteBuffer, 4, j10);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static short h(f fVar, ByteBuffer byteBuffer, long j10) throws IOException {
        i(fVar, byteBuffer, 1, j10);
        return (short) (byteBuffer.get() & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private static void i(f fVar, ByteBuffer byteBuffer, int i10, long j10) throws IOException {
        int G;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        while (byteBuffer.remaining() > 0 && (G = fVar.G(byteBuffer, j10)) != -1) {
            j10 += G;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new a("ELF file truncated");
    }
}
