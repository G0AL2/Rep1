package mf;

import com.google.android.gms.common.api.Api;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public z f34446a;

    /* renamed from: b  reason: collision with root package name */
    private long f34447b;

    /* compiled from: Buffer.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public f f34448a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f34449b;

        /* renamed from: c  reason: collision with root package name */
        private z f34450c;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f34452e;

        /* renamed from: d  reason: collision with root package name */
        public long f34451d = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f34453f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f34454g = -1;

        public final int a() {
            long j10 = this.f34451d;
            f fVar = this.f34448a;
            qe.k.c(fVar);
            if (j10 != fVar.C0()) {
                long j11 = this.f34451d;
                return d(j11 == -1 ? 0L : j11 + (this.f34454g - this.f34453f));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long b(long j10) {
            f fVar = this.f34448a;
            if (fVar != null) {
                if (this.f34449b) {
                    long C0 = fVar.C0();
                    int i10 = 1;
                    int i11 = (j10 > C0 ? 1 : (j10 == C0 ? 0 : -1));
                    if (i11 <= 0) {
                        if (j10 >= 0) {
                            long j11 = C0 - j10;
                            while (true) {
                                if (j11 <= 0) {
                                    break;
                                }
                                z zVar = fVar.f34446a;
                                qe.k.c(zVar);
                                z zVar2 = zVar.f34514g;
                                qe.k.c(zVar2);
                                int i12 = zVar2.f34510c;
                                long j12 = i12 - zVar2.f34509b;
                                if (j12 <= j11) {
                                    fVar.f34446a = zVar2.b();
                                    a0.b(zVar2);
                                    j11 -= j12;
                                } else {
                                    zVar2.f34510c = i12 - ((int) j11);
                                    break;
                                }
                            }
                            this.f34450c = null;
                            this.f34451d = j10;
                            this.f34452e = null;
                            this.f34453f = -1;
                            this.f34454g = -1;
                        } else {
                            throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                        }
                    } else if (i11 > 0) {
                        long j13 = j10 - C0;
                        boolean z10 = true;
                        while (j13 > 0) {
                            z K0 = fVar.K0(i10);
                            int min = (int) Math.min(j13, 8192 - K0.f34510c);
                            int i13 = K0.f34510c + min;
                            K0.f34510c = i13;
                            j13 -= min;
                            if (z10) {
                                this.f34450c = K0;
                                this.f34451d = C0;
                                this.f34452e = K0.f34508a;
                                this.f34453f = i13 - min;
                                this.f34454g = i13;
                                z10 = false;
                            }
                            i10 = 1;
                        }
                    }
                    fVar.z0(j10);
                    return C0;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f34448a != null) {
                this.f34448a = null;
                this.f34450c = null;
                this.f34451d = -1L;
                this.f34452e = null;
                this.f34453f = -1;
                this.f34454g = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int d(long j10) {
            z zVar;
            f fVar = this.f34448a;
            if (fVar != null) {
                if (j10 >= -1 && j10 <= fVar.C0()) {
                    if (j10 != -1 && j10 != fVar.C0()) {
                        long j11 = 0;
                        long C0 = fVar.C0();
                        z zVar2 = fVar.f34446a;
                        z zVar3 = this.f34450c;
                        if (zVar3 != null) {
                            long j12 = this.f34451d;
                            int i10 = this.f34453f;
                            qe.k.c(zVar3);
                            long j13 = j12 - (i10 - zVar3.f34509b);
                            if (j13 > j10) {
                                zVar = zVar2;
                                zVar2 = this.f34450c;
                                C0 = j13;
                            } else {
                                zVar = this.f34450c;
                                j11 = j13;
                            }
                        } else {
                            zVar = zVar2;
                        }
                        if (C0 - j10 > j10 - j11) {
                            while (true) {
                                qe.k.c(zVar);
                                int i11 = zVar.f34510c;
                                int i12 = zVar.f34509b;
                                if (j10 < (i11 - i12) + j11) {
                                    break;
                                }
                                j11 += i11 - i12;
                                zVar = zVar.f34513f;
                            }
                        } else {
                            while (C0 > j10) {
                                qe.k.c(zVar2);
                                zVar2 = zVar2.f34514g;
                                qe.k.c(zVar2);
                                C0 -= zVar2.f34510c - zVar2.f34509b;
                            }
                            j11 = C0;
                            zVar = zVar2;
                        }
                        if (this.f34449b) {
                            qe.k.c(zVar);
                            if (zVar.f34511d) {
                                z f10 = zVar.f();
                                if (fVar.f34446a == zVar) {
                                    fVar.f34446a = f10;
                                }
                                zVar = zVar.c(f10);
                                z zVar4 = zVar.f34514g;
                                qe.k.c(zVar4);
                                zVar4.b();
                            }
                        }
                        this.f34450c = zVar;
                        this.f34451d = j10;
                        qe.k.c(zVar);
                        this.f34452e = zVar.f34508a;
                        int i13 = zVar.f34509b + ((int) (j10 - j11));
                        this.f34453f = i13;
                        int i14 = zVar.f34510c;
                        this.f34454g = i14;
                        return i14 - i13;
                    }
                    this.f34450c = null;
                    this.f34451d = j10;
                    this.f34452e = null;
                    this.f34453f = -1;
                    this.f34454g = -1;
                    return -1;
                }
                qe.v vVar = qe.v.f36113a;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j10), Long.valueOf(fVar.C0())}, 2));
                qe.k.e(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    /* compiled from: Buffer.kt */
    /* loaded from: classes3.dex */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return f.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            f.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            qe.k.f(bArr, "data");
            f.this.write(bArr, i10, i11);
        }
    }

    public static /* synthetic */ a d0(f fVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new a();
        }
        return fVar.Z(aVar);
    }

    public final byte A(long j10) {
        mf.c.b(C0(), j10, 1L);
        z zVar = this.f34446a;
        if (zVar != null) {
            if (C0() - j10 < j10) {
                long C0 = C0();
                while (C0 > j10) {
                    zVar = zVar.f34514g;
                    qe.k.c(zVar);
                    C0 -= zVar.f34510c - zVar.f34509b;
                }
                qe.k.c(zVar);
                return zVar.f34508a[(int) ((zVar.f34509b + j10) - C0)];
            }
            long j11 = 0;
            while (true) {
                long j12 = (zVar.f34510c - zVar.f34509b) + j11;
                if (j12 > j10) {
                    qe.k.c(zVar);
                    return zVar.f34508a[(int) ((zVar.f34509b + j10) - j11)];
                }
                zVar = zVar.f34513f;
                qe.k.c(zVar);
                j11 = j12;
            }
        } else {
            qe.k.c(null);
            throw null;
        }
    }

    public long C(byte b10, long j10, long j11) {
        z zVar;
        int i10;
        long j12 = 0;
        if (0 <= j10 && j11 >= j10) {
            if (j11 > C0()) {
                j11 = C0();
            }
            if (j10 == j11 || (zVar = this.f34446a) == null) {
                return -1L;
            }
            if (C0() - j10 < j10) {
                j12 = C0();
                while (j12 > j10) {
                    zVar = zVar.f34514g;
                    qe.k.c(zVar);
                    j12 -= zVar.f34510c - zVar.f34509b;
                }
                while (j12 < j11) {
                    byte[] bArr = zVar.f34508a;
                    int min = (int) Math.min(zVar.f34510c, (zVar.f34509b + j11) - j12);
                    i10 = (int) ((zVar.f34509b + j10) - j12);
                    while (i10 < min) {
                        if (bArr[i10] != b10) {
                            i10++;
                        }
                    }
                    j12 += zVar.f34510c - zVar.f34509b;
                    zVar = zVar.f34513f;
                    qe.k.c(zVar);
                    j10 = j12;
                }
                return -1L;
            }
            while (true) {
                long j13 = (zVar.f34510c - zVar.f34509b) + j12;
                if (j13 > j10) {
                    break;
                }
                zVar = zVar.f34513f;
                qe.k.c(zVar);
                j12 = j13;
            }
            while (j12 < j11) {
                byte[] bArr2 = zVar.f34508a;
                int min2 = (int) Math.min(zVar.f34510c, (zVar.f34509b + j11) - j12);
                i10 = (int) ((zVar.f34509b + j10) - j12);
                while (i10 < min2) {
                    if (bArr2[i10] != b10) {
                        i10++;
                    }
                }
                j12 += zVar.f34510c - zVar.f34509b;
                zVar = zVar.f34513f;
                qe.k.c(zVar);
                j10 = j12;
            }
            return -1L;
            return (i10 - zVar.f34509b) + j12;
        }
        throw new IllegalArgumentException(("size=" + C0() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    public final long C0() {
        return this.f34447b;
    }

    public final i E0() {
        if (C0() <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            return H0((int) C0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + C0()).toString());
    }

    @Override // mf.h
    public String F(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
            byte b10 = (byte) 10;
            long C = C(b10, 0L, j11);
            if (C != -1) {
                return nf.a.c(this, C);
            }
            if (j11 < C0() && A(j11 - 1) == ((byte) 13) && A(j11) == b10) {
                return nf.a.c(this, j11);
            }
            f fVar = new f();
            w(fVar, 0L, Math.min(32, C0()));
            throw new EOFException("\\n not found: limit=" + Math.min(C0(), j10) + " content=" + fVar.g0().p() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j10).toString());
    }

    public final i H0(int i10) {
        if (i10 == 0) {
            return i.f34461d;
        }
        mf.c.b(C0(), 0L, i10);
        z zVar = this.f34446a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            qe.k.c(zVar);
            int i14 = zVar.f34510c;
            int i15 = zVar.f34509b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                zVar = zVar.f34513f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        z zVar2 = this.f34446a;
        int i16 = 0;
        while (i11 < i10) {
            qe.k.c(zVar2);
            bArr[i16] = zVar2.f34508a;
            i11 += zVar2.f34510c - zVar2.f34509b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = zVar2.f34509b;
            zVar2.f34511d = true;
            i16++;
            zVar2 = zVar2.f34513f;
        }
        return new b0(bArr, iArr);
    }

    @Override // mf.h
    public String J0(Charset charset) {
        qe.k.f(charset, "charset");
        return q0(this.f34447b, charset);
    }

    public final z K0(int i10) {
        boolean z10 = true;
        if ((i10 < 1 || i10 > 8192) ? false : false) {
            z zVar = this.f34446a;
            if (zVar == null) {
                z c10 = a0.c();
                this.f34446a = c10;
                c10.f34514g = c10;
                c10.f34513f = c10;
                return c10;
            }
            qe.k.c(zVar);
            z zVar2 = zVar.f34514g;
            qe.k.c(zVar2);
            return (zVar2.f34510c + i10 > 8192 || !zVar2.f34512e) ? zVar2.c(a0.c()) : zVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public long L(i iVar, long j10) throws IOException {
        long j11 = j10;
        qe.k.f(iVar, "bytes");
        if (iVar.A() > 0) {
            long j12 = 0;
            if (j11 >= 0) {
                z zVar = this.f34446a;
                if (zVar != null) {
                    if (C0() - j11 < j11) {
                        long C0 = C0();
                        while (C0 > j11) {
                            zVar = zVar.f34514g;
                            qe.k.c(zVar);
                            C0 -= zVar.f34510c - zVar.f34509b;
                        }
                        byte[] q10 = iVar.q();
                        byte b10 = q10[0];
                        int A = iVar.A();
                        long C02 = (C0() - A) + 1;
                        while (C0 < C02) {
                            byte[] bArr = zVar.f34508a;
                            long j13 = C0;
                            int min = (int) Math.min(zVar.f34510c, (zVar.f34509b + C02) - C0);
                            for (int i10 = (int) ((zVar.f34509b + j11) - j13); i10 < min; i10++) {
                                if (bArr[i10] == b10 && nf.a.b(zVar, i10 + 1, q10, 1, A)) {
                                    return (i10 - zVar.f34509b) + j13;
                                }
                            }
                            C0 = j13 + (zVar.f34510c - zVar.f34509b);
                            zVar = zVar.f34513f;
                            qe.k.c(zVar);
                            j11 = C0;
                        }
                    } else {
                        while (true) {
                            long j14 = (zVar.f34510c - zVar.f34509b) + j12;
                            if (j14 > j11) {
                                break;
                            }
                            zVar = zVar.f34513f;
                            qe.k.c(zVar);
                            j12 = j14;
                        }
                        byte[] q11 = iVar.q();
                        byte b11 = q11[0];
                        int A2 = iVar.A();
                        long C03 = (C0() - A2) + 1;
                        while (j12 < C03) {
                            byte[] bArr2 = zVar.f34508a;
                            long j15 = C03;
                            int min2 = (int) Math.min(zVar.f34510c, (zVar.f34509b + C03) - j12);
                            for (int i11 = (int) ((zVar.f34509b + j11) - j12); i11 < min2; i11++) {
                                if (bArr2[i11] == b11 && nf.a.b(zVar, i11 + 1, q11, 1, A2)) {
                                    return (i11 - zVar.f34509b) + j12;
                                }
                            }
                            j12 += zVar.f34510c - zVar.f34509b;
                            zVar = zVar.f34513f;
                            qe.k.c(zVar);
                            j11 = j12;
                            C03 = j15;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // mf.h
    public boolean N(long j10, i iVar) {
        qe.k.f(iVar, "bytes");
        return T(j10, iVar, 0, iVar.A());
    }

    @Override // mf.g
    /* renamed from: N0 */
    public f Y(i iVar) {
        qe.k.f(iVar, "byteString");
        iVar.F(this, 0, iVar.A());
        return this;
    }

    public long O(i iVar, long j10) {
        int i10;
        int i11;
        qe.k.f(iVar, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            z zVar = this.f34446a;
            if (zVar != null) {
                if (C0() - j10 < j10) {
                    j11 = C0();
                    while (j11 > j10) {
                        zVar = zVar.f34514g;
                        qe.k.c(zVar);
                        j11 -= zVar.f34510c - zVar.f34509b;
                    }
                    if (iVar.A() == 2) {
                        byte k10 = iVar.k(0);
                        byte k11 = iVar.k(1);
                        while (j11 < C0()) {
                            byte[] bArr = zVar.f34508a;
                            i10 = (int) ((zVar.f34509b + j10) - j11);
                            int i12 = zVar.f34510c;
                            while (i10 < i12) {
                                byte b10 = bArr[i10];
                                if (b10 != k10 && b10 != k11) {
                                    i10++;
                                }
                                i11 = zVar.f34509b;
                            }
                            j11 += zVar.f34510c - zVar.f34509b;
                            zVar = zVar.f34513f;
                            qe.k.c(zVar);
                            j10 = j11;
                        }
                        return -1L;
                    }
                    byte[] q10 = iVar.q();
                    while (j11 < C0()) {
                        byte[] bArr2 = zVar.f34508a;
                        i10 = (int) ((zVar.f34509b + j10) - j11);
                        int i13 = zVar.f34510c;
                        while (i10 < i13) {
                            byte b11 = bArr2[i10];
                            for (byte b12 : q10) {
                                if (b11 == b12) {
                                    i11 = zVar.f34509b;
                                }
                            }
                            i10++;
                        }
                        j11 += zVar.f34510c - zVar.f34509b;
                        zVar = zVar.f34513f;
                        qe.k.c(zVar);
                        j10 = j11;
                    }
                    return -1L;
                }
                while (true) {
                    long j12 = (zVar.f34510c - zVar.f34509b) + j11;
                    if (j12 > j10) {
                        break;
                    }
                    zVar = zVar.f34513f;
                    qe.k.c(zVar);
                    j11 = j12;
                }
                if (iVar.A() == 2) {
                    byte k12 = iVar.k(0);
                    byte k13 = iVar.k(1);
                    while (j11 < C0()) {
                        byte[] bArr3 = zVar.f34508a;
                        i10 = (int) ((zVar.f34509b + j10) - j11);
                        int i14 = zVar.f34510c;
                        while (i10 < i14) {
                            byte b13 = bArr3[i10];
                            if (b13 != k12 && b13 != k13) {
                                i10++;
                            }
                            i11 = zVar.f34509b;
                        }
                        j11 += zVar.f34510c - zVar.f34509b;
                        zVar = zVar.f34513f;
                        qe.k.c(zVar);
                        j10 = j11;
                    }
                    return -1L;
                }
                byte[] q11 = iVar.q();
                while (j11 < C0()) {
                    byte[] bArr4 = zVar.f34508a;
                    i10 = (int) ((zVar.f34509b + j10) - j11);
                    int i15 = zVar.f34510c;
                    while (i10 < i15) {
                        byte b14 = bArr4[i10];
                        for (byte b15 : q11) {
                            if (b14 == b15) {
                                i11 = zVar.f34509b;
                            }
                        }
                        i10++;
                    }
                    j11 += zVar.f34510c - zVar.f34509b;
                    zVar = zVar.f34513f;
                    qe.k.c(zVar);
                    j10 = j11;
                }
                return -1L;
                return (i10 - i11) + j11;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
    }

    @Override // mf.h
    public void O0(long j10) throws EOFException {
        while (j10 > 0) {
            z zVar = this.f34446a;
            if (zVar != null) {
                int min = (int) Math.min(j10, zVar.f34510c - zVar.f34509b);
                long j11 = min;
                z0(C0() - j11);
                j10 -= j11;
                int i10 = zVar.f34509b + min;
                zVar.f34509b = i10;
                if (i10 == zVar.f34510c) {
                    this.f34446a = zVar.b();
                    a0.b(zVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // mf.h
    public long P(i iVar) {
        qe.k.f(iVar, "targetBytes");
        return O(iVar, 0L);
    }

    @Override // mf.g
    /* renamed from: Q0 */
    public f write(byte[] bArr) {
        qe.k.f(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    public boolean T(long j10, i iVar, int i10, int i11) {
        qe.k.f(iVar, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || C0() - j10 < i11 || iVar.A() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (A(i12 + j10) != iVar.k(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // mf.g
    /* renamed from: T0 */
    public f write(byte[] bArr, int i10, int i11) {
        qe.k.f(bArr, "source");
        long j10 = i11;
        mf.c.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            z K0 = K0(1);
            int min = Math.min(i12 - i10, 8192 - K0.f34510c);
            int i13 = i10 + min;
            fe.h.c(bArr, K0.f34508a, K0.f34510c, i10, i13);
            K0.f34510c += min;
            i10 = i13;
        }
        z0(C0() + j10);
        return this;
    }

    public int U(byte[] bArr, int i10, int i11) {
        qe.k.f(bArr, "sink");
        mf.c.b(bArr.length, i10, i11);
        z zVar = this.f34446a;
        if (zVar != null) {
            int min = Math.min(i11, zVar.f34510c - zVar.f34509b);
            byte[] bArr2 = zVar.f34508a;
            int i12 = zVar.f34509b;
            fe.h.c(bArr2, bArr, i10, i12, i12 + min);
            zVar.f34509b += min;
            z0(C0() - min);
            if (zVar.f34509b == zVar.f34510c) {
                this.f34446a = zVar.b();
                a0.b(zVar);
                return min;
            }
            return min;
        }
        return -1;
    }

    @Override // mf.g
    /* renamed from: U0 */
    public f writeByte(int i10) {
        z K0 = K0(1);
        byte[] bArr = K0.f34508a;
        int i11 = K0.f34510c;
        K0.f34510c = i11 + 1;
        bArr[i11] = (byte) i10;
        z0(C0() + 1);
        return this;
    }

    @Override // mf.h
    public boolean W(long j10) {
        return this.f34447b >= j10;
    }

    @Override // mf.h
    public int X(u uVar) {
        qe.k.f(uVar, "options");
        int e10 = nf.a.e(this, uVar, false, 2, null);
        if (e10 == -1) {
            return -1;
        }
        O0(uVar.h()[e10].A());
        return e10;
    }

    @Override // mf.g
    /* renamed from: X0 */
    public f k0(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return writeByte(48);
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return M("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 >= 100000000) {
            i11 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i11 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i11 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i11 = 2;
        }
        if (z10) {
            i11++;
        }
        z K0 = K0(i11);
        byte[] bArr = K0.f34508a;
        int i12 = K0.f34510c + i11;
        while (j10 != 0) {
            long j11 = 10;
            i12--;
            bArr[i12] = nf.a.a()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i12 - 1] = (byte) 45;
        }
        K0.f34510c += i11;
        z0(C0() + i11);
        return this;
    }

    @Override // mf.g
    /* renamed from: Y0 */
    public f M0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        z K0 = K0(i10);
        byte[] bArr = K0.f34508a;
        int i11 = K0.f34510c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = nf.a.a()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        K0.f34510c += i10;
        z0(C0() + i10);
        return this;
    }

    public final a Z(a aVar) {
        qe.k.f(aVar, "unsafeCursor");
        if (aVar.f34448a == null) {
            aVar.f34448a = this;
            aVar.f34449b = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // mf.g
    /* renamed from: Z0 */
    public f writeInt(int i10) {
        z K0 = K0(4);
        byte[] bArr = K0.f34508a;
        int i11 = K0.f34510c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        K0.f34510c = i14 + 1;
        z0(C0() + 4);
        return this;
    }

    @Override // mf.h
    public String a0() throws EOFException {
        return F(Long.MAX_VALUE);
    }

    public final void b() {
        O0(C0());
    }

    @Override // mf.h
    public byte[] b0(long j10) throws EOFException {
        if (j10 >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (C0() >= j10) {
                byte[] bArr = new byte[(int) j10];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    public f b1(int i10) {
        return writeInt(mf.c.c(i10));
    }

    public f c1(long j10) {
        z K0 = K0(8);
        byte[] bArr = K0.f34508a;
        int i10 = K0.f34510c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        K0.f34510c = i17 + 1;
        z0(C0() + 8);
        return this;
    }

    @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* renamed from: d */
    public f clone() {
        return q();
    }

    @Override // mf.g
    /* renamed from: d1 */
    public f writeShort(int i10) {
        z K0 = K0(2);
        byte[] bArr = K0.f34508a;
        int i11 = K0.f34510c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        K0.f34510c = i12 + 1;
        z0(C0() + 2);
        return this;
    }

    public final long e() {
        long C0 = C0();
        if (C0 == 0) {
            return 0L;
        }
        z zVar = this.f34446a;
        qe.k.c(zVar);
        z zVar2 = zVar.f34514g;
        qe.k.c(zVar2);
        int i10 = zVar2.f34510c;
        if (i10 < 8192 && zVar2.f34512e) {
            C0 -= i10 - zVar2.f34509b;
        }
        return C0;
    }

    @Override // mf.e0
    public long e0(f fVar, long j10) {
        qe.k.f(fVar, "sink");
        if (j10 >= 0) {
            if (C0() == 0) {
                return -1L;
            }
            if (j10 > C0()) {
                j10 = C0();
            }
            fVar.n0(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // mf.g
    public OutputStream e1() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (C0() != fVar.C0()) {
                return false;
            }
            if (C0() != 0) {
                z zVar = this.f34446a;
                qe.k.c(zVar);
                z zVar2 = fVar.f34446a;
                qe.k.c(zVar2);
                int i10 = zVar.f34509b;
                int i11 = zVar2.f34509b;
                long j10 = 0;
                while (j10 < C0()) {
                    long min = Math.min(zVar.f34510c - i10, zVar2.f34510c - i11);
                    long j11 = 0;
                    while (j11 < min) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (zVar.f34508a[i10] != zVar2.f34508a[i11]) {
                            return false;
                        }
                        j11++;
                        i10 = i12;
                        i11 = i13;
                    }
                    if (i10 == zVar.f34510c) {
                        zVar = zVar.f34513f;
                        qe.k.c(zVar);
                        i10 = zVar.f34509b;
                    }
                    if (i11 == zVar2.f34510c) {
                        zVar2 = zVar2.f34513f;
                        qe.k.c(zVar2);
                        i11 = zVar2.f34509b;
                    }
                    j10 += min;
                }
            }
        }
        return true;
    }

    @Override // mf.h
    public long f0(i iVar) throws IOException {
        qe.k.f(iVar, "bytes");
        return L(iVar, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[EDGE_INSN: B:42:0x00ae->B:37:0x00ae ?: BREAK  , SYNTHETIC] */
    @Override // mf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long f1() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.C0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb8
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            mf.z r6 = r15.f34446a
            qe.k.c(r6)
            byte[] r7 = r6.f34508a
            int r8 = r6.f34509b
            int r9 = r6.f34510c
        L18:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7b
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            mf.f r0 = new mf.f
            r0.<init>()
            mf.f r0 = r0.M0(r4)
            mf.f r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.r0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7b:
            if (r0 == 0) goto L7f
            r1 = 1
            goto L9a
        L7f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = mf.c.e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            mf.z r7 = r6.b()
            r15.f34446a = r7
            mf.a0.b(r6)
            goto La8
        La6:
            r6.f34509b = r8
        La8:
            if (r1 != 0) goto Lae
            mf.z r6 = r15.f34446a
            if (r6 != 0) goto Ld
        Lae:
            long r1 = r15.C0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.z0(r1)
            return r4
        Lb8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.f.f1():long");
    }

    @Override // mf.g, mf.c0, java.io.Flushable
    public void flush() {
    }

    public i g0() {
        return o0(C0());
    }

    public int h0() throws EOFException {
        return mf.c.c(readInt());
    }

    @Override // mf.h
    public InputStream h1() {
        return new b();
    }

    public int hashCode() {
        z zVar = this.f34446a;
        if (zVar != null) {
            int i10 = 1;
            do {
                int i11 = zVar.f34510c;
                for (int i12 = zVar.f34509b; i12 < i11; i12++) {
                    i10 = (i10 * 31) + zVar.f34508a[i12];
                }
                zVar = zVar.f34513f;
                qe.k.c(zVar);
            } while (zVar != this.f34446a);
            return i10;
        }
        return 0;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // mf.h, mf.g
    public f j() {
        return this;
    }

    @Override // mf.h
    public void j0(long j10) throws EOFException {
        if (this.f34447b < j10) {
            throw new EOFException();
        }
    }

    public f j1(String str, int i10, int i11, Charset charset) {
        qe.k.f(str, "string");
        qe.k.f(charset, "charset");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 >= i10) {
            if (i11 <= str.length()) {
                if (qe.k.a(charset, ve.d.f38080b)) {
                    return S(str, i10, i11);
                }
                String substring = str.substring(i10, i11);
                qe.k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = substring.getBytes(charset);
                qe.k.e(bytes, "(this as java.lang.String).getBytes(charset)");
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
    }

    @Override // mf.e0
    public f0 k() {
        return f0.f34457d;
    }

    @Override // mf.g
    /* renamed from: k1 */
    public f M(String str) {
        qe.k.f(str, "string");
        return S(str, 0, str.length());
    }

    @Override // mf.g
    /* renamed from: l1 */
    public f S(String str, int i10, int i11) {
        qe.k.f(str, "string");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 >= i10) {
            if (!(i11 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    z K0 = K0(1);
                    byte[] bArr = K0.f34508a;
                    int i12 = K0.f34510c - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt;
                    while (i13 < min) {
                        char charAt2 = str.charAt(i13);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i13 + i12] = (byte) charAt2;
                        i13++;
                    }
                    int i14 = K0.f34510c;
                    int i15 = (i12 + i13) - i14;
                    K0.f34510c = i14 + i15;
                    z0(C0() + i15);
                    i10 = i13;
                } else {
                    if (charAt < 2048) {
                        z K02 = K0(2);
                        byte[] bArr2 = K02.f34508a;
                        int i16 = K02.f34510c;
                        bArr2[i16] = (byte) ((charAt >> 6) | DownloadResource.STATUS_RUNNING);
                        bArr2[i16 + 1] = (byte) ((charAt & '?') | 128);
                        K02.f34510c = i16 + 2;
                        z0(C0() + 2);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i17 = i10 + 1;
                        char charAt3 = i17 < i11 ? str.charAt(i17) : (char) 0;
                        if (charAt <= 56319 && 56320 <= charAt3 && 57343 >= charAt3) {
                            int i18 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + Constants.MIN_PROGRESS_STEP;
                            z K03 = K0(4);
                            byte[] bArr3 = K03.f34508a;
                            int i19 = K03.f34510c;
                            bArr3[i19] = (byte) ((i18 >> 18) | 240);
                            bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                            bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                            bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                            K03.f34510c = i19 + 4;
                            z0(C0() + 4);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i17;
                        }
                    } else {
                        z K04 = K0(3);
                        byte[] bArr4 = K04.f34508a;
                        int i20 = K04.f34510c;
                        bArr4[i20] = (byte) ((charAt >> '\f') | 224);
                        bArr4[i20 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                        bArr4[i20 + 2] = (byte) ((charAt & '?') | 128);
                        K04.f34510c = i20 + 3;
                        z0(C0() + 3);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
    }

    public short m0() throws EOFException {
        return mf.c.d(readShort());
    }

    public f m1(int i10) {
        if (i10 < 128) {
            writeByte(i10);
        } else if (i10 < 2048) {
            z K0 = K0(2);
            byte[] bArr = K0.f34508a;
            int i11 = K0.f34510c;
            bArr[i11] = (byte) ((i10 >> 6) | DownloadResource.STATUS_RUNNING);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            K0.f34510c = i11 + 2;
            z0(C0() + 2);
        } else if (55296 <= i10 && 57343 >= i10) {
            writeByte(63);
        } else if (i10 < 65536) {
            z K02 = K0(3);
            byte[] bArr2 = K02.f34508a;
            int i12 = K02.f34510c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            K02.f34510c = i12 + 3;
            z0(C0() + 3);
        } else if (i10 <= 1114111) {
            z K03 = K0(4);
            byte[] bArr3 = K03.f34508a;
            int i13 = K03.f34510c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            K03.f34510c = i13 + 4;
            z0(C0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + mf.c.f(i10));
        }
        return this;
    }

    @Override // mf.c0
    public void n0(f fVar, long j10) {
        z zVar;
        z zVar2;
        qe.k.f(fVar, "source");
        if (fVar != this) {
            mf.c.b(fVar.C0(), 0L, j10);
            while (j10 > 0) {
                z zVar3 = fVar.f34446a;
                qe.k.c(zVar3);
                int i10 = zVar3.f34510c;
                qe.k.c(fVar.f34446a);
                if (j10 < i10 - zVar.f34509b) {
                    z zVar4 = this.f34446a;
                    if (zVar4 != null) {
                        qe.k.c(zVar4);
                        zVar2 = zVar4.f34514g;
                    } else {
                        zVar2 = null;
                    }
                    if (zVar2 != null && zVar2.f34512e) {
                        if ((zVar2.f34510c + j10) - (zVar2.f34511d ? 0 : zVar2.f34509b) <= ((long) Constants.BUFFER_SIZE)) {
                            z zVar5 = fVar.f34446a;
                            qe.k.c(zVar5);
                            zVar5.g(zVar2, (int) j10);
                            fVar.z0(fVar.C0() - j10);
                            z0(C0() + j10);
                            return;
                        }
                    }
                    z zVar6 = fVar.f34446a;
                    qe.k.c(zVar6);
                    fVar.f34446a = zVar6.e((int) j10);
                }
                z zVar7 = fVar.f34446a;
                qe.k.c(zVar7);
                long j11 = zVar7.f34510c - zVar7.f34509b;
                fVar.f34446a = zVar7.b();
                z zVar8 = this.f34446a;
                if (zVar8 == null) {
                    this.f34446a = zVar7;
                    zVar7.f34514g = zVar7;
                    zVar7.f34513f = zVar7;
                } else {
                    qe.k.c(zVar8);
                    z zVar9 = zVar8.f34514g;
                    qe.k.c(zVar9);
                    zVar9.c(zVar7).a();
                }
                fVar.z0(fVar.C0() - j11);
                z0(C0() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // mf.h
    public i o0(long j10) throws EOFException {
        if (j10 >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (C0() >= j10) {
                if (j10 >= 4096) {
                    i H0 = H0((int) j10);
                    O0(j10);
                    return H0;
                }
                return new i(b0(j10));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    @Override // mf.h
    public f p() {
        return this;
    }

    @Override // mf.h
    public h peek() {
        return r.d(new w(this));
    }

    public final f q() {
        f fVar = new f();
        if (C0() != 0) {
            z zVar = this.f34446a;
            qe.k.c(zVar);
            z d10 = zVar.d();
            fVar.f34446a = d10;
            d10.f34514g = d10;
            d10.f34513f = d10;
            for (z zVar2 = zVar.f34513f; zVar2 != zVar; zVar2 = zVar2.f34513f) {
                z zVar3 = d10.f34514g;
                qe.k.c(zVar3);
                qe.k.c(zVar2);
                zVar3.c(zVar2.d());
            }
            fVar.z0(C0());
        }
        return fVar;
    }

    public String q0(long j10, Charset charset) throws EOFException {
        qe.k.f(charset, "charset");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            if (this.f34447b >= j10) {
                if (i10 == 0) {
                    return "";
                }
                z zVar = this.f34446a;
                qe.k.c(zVar);
                int i11 = zVar.f34509b;
                if (i11 + j10 > zVar.f34510c) {
                    return new String(b0(j10), charset);
                }
                int i12 = (int) j10;
                String str = new String(zVar.f34508a, i11, i12, charset);
                int i13 = zVar.f34509b + i12;
                zVar.f34509b = i13;
                this.f34447b -= j10;
                if (i13 == zVar.f34510c) {
                    this.f34446a = zVar.b();
                    a0.b(zVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j10).toString());
    }

    public String r0() {
        return q0(this.f34447b, ve.d.f38080b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        qe.k.f(byteBuffer, "sink");
        z zVar = this.f34446a;
        if (zVar != null) {
            int min = Math.min(byteBuffer.remaining(), zVar.f34510c - zVar.f34509b);
            byteBuffer.put(zVar.f34508a, zVar.f34509b, min);
            int i10 = zVar.f34509b + min;
            zVar.f34509b = i10;
            this.f34447b -= min;
            if (i10 == zVar.f34510c) {
                this.f34446a = zVar.b();
                a0.b(zVar);
            }
            return min;
        }
        return -1;
    }

    @Override // mf.h
    public byte readByte() throws EOFException {
        if (C0() != 0) {
            z zVar = this.f34446a;
            qe.k.c(zVar);
            int i10 = zVar.f34509b;
            int i11 = zVar.f34510c;
            int i12 = i10 + 1;
            byte b10 = zVar.f34508a[i10];
            z0(C0() - 1);
            if (i12 == i11) {
                this.f34446a = zVar.b();
                a0.b(zVar);
            } else {
                zVar.f34509b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // mf.h
    public void readFully(byte[] bArr) throws EOFException {
        qe.k.f(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int U = U(bArr, i10, bArr.length - i10);
            if (U == -1) {
                throw new EOFException();
            }
            i10 += U;
        }
    }

    @Override // mf.h
    public int readInt() throws EOFException {
        if (C0() >= 4) {
            z zVar = this.f34446a;
            qe.k.c(zVar);
            int i10 = zVar.f34509b;
            int i11 = zVar.f34510c;
            if (i11 - i10 < 4) {
                return ((readByte() & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
            }
            byte[] bArr = zVar.f34508a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
            z0(C0() - 4);
            if (i17 == i11) {
                this.f34446a = zVar.b();
                a0.b(zVar);
            } else {
                zVar.f34509b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // mf.h
    public long readLong() throws EOFException {
        if (C0() >= 8) {
            z zVar = this.f34446a;
            qe.k.c(zVar);
            int i10 = zVar.f34509b;
            int i11 = zVar.f34510c;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = zVar.f34508a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i12] & 255) << 48) | ((bArr[i13] & 255) << 40);
            int i15 = i14 + 1;
            long j11 = ((bArr[i14] & 255) << 32) | j10;
            int i16 = i15 + 1;
            int i17 = i16 + 1;
            long j12 = j11 | ((bArr[i15] & 255) << 24) | ((bArr[i16] & 255) << 16);
            int i18 = i17 + 1;
            int i19 = i18 + 1;
            long j13 = j12 | ((bArr[i17] & 255) << 8) | (bArr[i18] & 255);
            z0(C0() - 8);
            if (i19 == i11) {
                this.f34446a = zVar.b();
                a0.b(zVar);
            } else {
                zVar.f34509b = i19;
            }
            return j13;
        }
        throw new EOFException();
    }

    @Override // mf.h
    public short readShort() throws EOFException {
        if (C0() >= 2) {
            z zVar = this.f34446a;
            qe.k.c(zVar);
            int i10 = zVar.f34509b;
            int i11 = zVar.f34510c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & fq.i.NETWORK_LOAD_LIMIT_DISABLED));
            }
            byte[] bArr = zVar.f34508a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
            z0(C0() - 2);
            if (i13 == i11) {
                this.f34446a = zVar.b();
                a0.b(zVar);
            } else {
                zVar.f34509b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    public String s0(long j10) throws EOFException {
        return q0(j10, ve.d.f38080b);
    }

    @Override // mf.g
    public long t(e0 e0Var) throws IOException {
        qe.k.f(e0Var, "source");
        long j10 = 0;
        while (true) {
            long e02 = e0Var.e0(this, (long) Constants.BUFFER_SIZE);
            if (e02 == -1) {
                return j10;
            }
            j10 += e02;
        }
    }

    public String toString() {
        return E0().toString();
    }

    @Override // mf.h
    public byte[] u0() {
        return b0(C0());
    }

    public final f w(f fVar, long j10, long j11) {
        qe.k.f(fVar, "out");
        mf.c.b(C0(), j10, j11);
        if (j11 != 0) {
            fVar.z0(fVar.C0() + j11);
            z zVar = this.f34446a;
            while (true) {
                qe.k.c(zVar);
                int i10 = zVar.f34510c;
                int i11 = zVar.f34509b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                zVar = zVar.f34513f;
            }
            while (j11 > 0) {
                qe.k.c(zVar);
                z d10 = zVar.d();
                int i12 = d10.f34509b + ((int) j10);
                d10.f34509b = i12;
                d10.f34510c = Math.min(i12 + ((int) j11), d10.f34510c);
                z zVar2 = fVar.f34446a;
                if (zVar2 == null) {
                    d10.f34514g = d10;
                    d10.f34513f = d10;
                    fVar.f34446a = d10;
                } else {
                    qe.k.c(zVar2);
                    z zVar3 = zVar2.f34514g;
                    qe.k.c(zVar3);
                    zVar3.c(d10);
                }
                j11 -= d10.f34510c - d10.f34509b;
                zVar = zVar.f34513f;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // mf.h
    public boolean w0() {
        return this.f34447b == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2 A[EDGE_INSN: B:51:0x00c2->B:41:0x00c2 ?: BREAK  , SYNTHETIC] */
    @Override // mf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long x0() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.f.x0():long");
    }

    @Override // mf.g
    /* renamed from: y */
    public f u() {
        return this;
    }

    @Override // mf.h
    public void y0(f fVar, long j10) throws EOFException {
        qe.k.f(fVar, "sink");
        if (C0() >= j10) {
            fVar.n0(this, j10);
        } else {
            fVar.n0(this, C0());
            throw new EOFException();
        }
    }

    @Override // mf.g
    /* renamed from: z */
    public f D() {
        return this;
    }

    public final void z0(long j10) {
        this.f34447b = j10;
    }

    /* compiled from: Buffer.kt */
    /* loaded from: classes3.dex */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(f.this.C0(), (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (f.this.C0() > 0) {
                return f.this.readByte() & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        public String toString() {
            return f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            qe.k.f(bArr, "sink");
            return f.this.U(bArr, i10, i11);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        qe.k.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            z K0 = K0(1);
            int min = Math.min(i10, 8192 - K0.f34510c);
            byteBuffer.get(K0.f34508a, K0.f34510c, min);
            i10 -= min;
            K0.f34510c += min;
        }
        this.f34447b += remaining;
        return remaining;
    }
}
