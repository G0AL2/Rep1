package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.s1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class l extends h {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f19945b = Logger.getLogger(l.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f19946c = r1.f19983g;

    /* renamed from: a  reason: collision with root package name */
    public m f19947a;

    /* loaded from: classes2.dex */
    public static abstract class b extends l {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f19948d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19949e;

        /* renamed from: f  reason: collision with root package name */
        public int f19950f;

        /* renamed from: g  reason: collision with root package name */
        public int f19951g;

        public b(int i10) {
            super();
            if (i10 >= 0) {
                int max = Math.max(i10, 20);
                this.f19948d = new byte[max];
                this.f19949e = max;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final int a() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void b(byte b10) {
            byte[] bArr = this.f19948d;
            int i10 = this.f19950f;
            this.f19950f = i10 + 1;
            bArr[i10] = b10;
            this.f19951g++;
        }

        public final void e(long j10) {
            byte[] bArr = this.f19948d;
            int i10 = this.f19950f;
            int i11 = i10 + 1;
            this.f19950f = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            this.f19950f = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            this.f19950f = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            this.f19950f = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            this.f19950f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f19950f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f19950f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f19950f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f19951g += 8;
        }

        public final void f(long j10) {
            if (l.f19946c) {
                long j11 = this.f19950f;
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f19948d;
                    int i10 = this.f19950f;
                    this.f19950f = i10 + 1;
                    r1.a(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f19948d;
                int i11 = this.f19950f;
                this.f19950f = i11 + 1;
                r1.a(bArr2, i11, (byte) j10);
                this.f19951g += (int) (this.f19950f - j11);
                return;
            }
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f19948d;
                int i12 = this.f19950f;
                this.f19950f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                this.f19951g++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f19948d;
            int i13 = this.f19950f;
            this.f19950f = i13 + 1;
            bArr4[i13] = (byte) j10;
            this.f19951g++;
        }

        public final void h(int i10) {
            byte[] bArr = this.f19948d;
            int i11 = this.f19950f;
            int i12 = i11 + 1;
            this.f19950f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f19950f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f19950f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f19950f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f19951g += 4;
        }

        public final void i(int i10) {
            if (l.f19946c) {
                long j10 = this.f19950f;
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f19948d;
                    int i11 = this.f19950f;
                    this.f19950f = i11 + 1;
                    r1.a(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f19948d;
                int i12 = this.f19950f;
                this.f19950f = i12 + 1;
                r1.a(bArr2, i12, (byte) i10);
                this.f19951g += (int) (this.f19950f - j10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f19948d;
                int i13 = this.f19950f;
                this.f19950f = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                this.f19951g++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f19948d;
            int i14 = this.f19950f;
            this.f19950f = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.f19951g++;
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int a(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static l a(byte[] bArr) {
        return new c(bArr, 0, bArr.length);
    }

    public static int b(int i10, int i11) {
        return b(i10) + 4;
    }

    public static long b(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int c(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int c(int i10, int i11) {
        return b(i10) + a(i11);
    }

    public static int d(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int d(int i10, int i11) {
        return b(i10) + 4;
    }

    public static int e(int i10, int i11) {
        return b(i10) + c(d(i11));
    }

    public static int f(int i10, int i11) {
        return b(i10) + c(i11);
    }

    public abstract int a();

    public abstract void a(byte b10) throws IOException;

    public abstract void a(int i10, q0 q0Var) throws IOException;

    public abstract void b(int i10, i iVar) throws IOException;

    public abstract void b(int i10, q0 q0Var, f1 f1Var) throws IOException;

    public abstract void b(int i10, String str) throws IOException;

    public abstract void b(int i10, boolean z10) throws IOException;

    public abstract void c(int i10, i iVar) throws IOException;

    public abstract void c(long j10) throws IOException;

    public abstract void d(long j10) throws IOException;

    public abstract void e(int i10) throws IOException;

    public abstract void f(int i10) throws IOException;

    public abstract void f(int i10, long j10) throws IOException;

    public abstract void g(int i10) throws IOException;

    public abstract void g(int i10, int i11) throws IOException;

    public abstract void g(int i10, long j10) throws IOException;

    public abstract void h(int i10, int i11) throws IOException;

    public abstract void i(int i10, int i11) throws IOException;

    public abstract void j(int i10, int i11) throws IOException;

    /* loaded from: classes2.dex */
    public static class c extends l {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f19952d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19953e;

        /* renamed from: f  reason: collision with root package name */
        public int f19954f;

        public c(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                this.f19952d = bArr;
                this.f19954f = i10;
                this.f19953e = i12;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void a(int i10, q0 q0Var) throws IOException {
            g(t1.a(1, 3));
            j(2, i10);
            g(t1.a(3, 2));
            g(q0Var.getSerializedSize());
            q0Var.writeTo(this);
            g(t1.a(1, 4));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void b(int i10, boolean z10) throws IOException {
            g(t1.a(i10, 0));
            a(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void c(int i10, i iVar) throws IOException {
            g(t1.a(1, 3));
            j(2, i10);
            b(3, iVar);
            g(t1.a(1, 4));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void d(long j10) throws IOException {
            if (l.f19946c && a() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f19952d;
                    int i10 = this.f19954f;
                    this.f19954f = i10 + 1;
                    r1.a(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f19952d;
                int i11 = this.f19954f;
                this.f19954f = i11 + 1;
                r1.a(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f19952d;
                    int i12 = this.f19954f;
                    this.f19954f = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19954f), Integer.valueOf(this.f19953e), 1), e10);
                }
            }
            byte[] bArr4 = this.f19952d;
            int i13 = this.f19954f;
            this.f19954f = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void e(int i10) throws IOException {
            try {
                byte[] bArr = this.f19952d;
                int i11 = this.f19954f;
                int i12 = i11 + 1;
                this.f19954f = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                this.f19954f = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                this.f19954f = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f19954f = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19954f), Integer.valueOf(this.f19953e), 1), e10);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void f(int i10, long j10) throws IOException {
            g(t1.a(i10, 1));
            c(j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void g(int i10) throws IOException {
            if (!l.f19946c || com.fyber.inneractive.sdk.protobuf.d.a() || a() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f19952d;
                        int i11 = this.f19954f;
                        this.f19954f = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e10) {
                        throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19954f), Integer.valueOf(this.f19953e), 1), e10);
                    }
                }
                byte[] bArr2 = this.f19952d;
                int i12 = this.f19954f;
                this.f19954f = i12 + 1;
                bArr2[i12] = (byte) i10;
            } else if ((i10 & (-128)) == 0) {
                byte[] bArr3 = this.f19952d;
                int i13 = this.f19954f;
                this.f19954f = i13 + 1;
                r1.a(bArr3, i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f19952d;
                int i14 = this.f19954f;
                this.f19954f = i14 + 1;
                r1.a(bArr4, i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & (-128)) == 0) {
                    byte[] bArr5 = this.f19952d;
                    int i16 = this.f19954f;
                    this.f19954f = i16 + 1;
                    r1.a(bArr5, i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f19952d;
                int i17 = this.f19954f;
                this.f19954f = i17 + 1;
                r1.a(bArr6, i17, (byte) (i15 | 128));
                int i18 = i15 >>> 7;
                if ((i18 & (-128)) == 0) {
                    byte[] bArr7 = this.f19952d;
                    int i19 = this.f19954f;
                    this.f19954f = i19 + 1;
                    r1.a(bArr7, i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f19952d;
                int i20 = this.f19954f;
                this.f19954f = i20 + 1;
                r1.a(bArr8, i20, (byte) (i18 | 128));
                int i21 = i18 >>> 7;
                if ((i21 & (-128)) == 0) {
                    byte[] bArr9 = this.f19952d;
                    int i22 = this.f19954f;
                    this.f19954f = i22 + 1;
                    r1.a(bArr9, i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f19952d;
                int i23 = this.f19954f;
                this.f19954f = i23 + 1;
                r1.a(bArr10, i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f19952d;
                int i24 = this.f19954f;
                this.f19954f = i24 + 1;
                r1.a(bArr11, i24, (byte) (i21 >>> 7));
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void h(int i10, int i11) throws IOException {
            g(t1.a(i10, 0));
            if (i11 >= 0) {
                g(i11);
            } else {
                d(i11);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void i(int i10, int i11) throws IOException {
            g(t1.a(i10, i11));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void j(int i10, int i11) throws IOException {
            g(t1.a(i10, 0));
            g(i11);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void b(int i10, i iVar) throws IOException {
            g(t1.a(i10, 2));
            b(iVar);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void f(int i10) throws IOException {
            if (i10 >= 0) {
                g(i10);
            } else {
                d(i10);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void b(int i10, q0 q0Var, f1 f1Var) throws IOException {
            g(t1.a(i10, 2));
            g(((com.fyber.inneractive.sdk.protobuf.a) q0Var).getSerializedSize(f1Var));
            f1Var.a((f1) q0Var, (u1) this.f19947a);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void c(long j10) throws IOException {
            try {
                byte[] bArr = this.f19952d;
                int i10 = this.f19954f;
                int i11 = i10 + 1;
                this.f19954f = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                this.f19954f = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                this.f19954f = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                this.f19954f = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                this.f19954f = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                this.f19954f = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                this.f19954f = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f19954f = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19954f), Integer.valueOf(this.f19953e), 1), e10);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void a(byte b10) throws IOException {
            try {
                byte[] bArr = this.f19952d;
                int i10 = this.f19954f;
                this.f19954f = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19954f), Integer.valueOf(this.f19953e), 1), e10);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void b(int i10, String str) throws IOException {
            g(t1.a(i10, 2));
            b(str);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.h
        public final void a(byte[] bArr, int i10, int i11) throws IOException {
            b(bArr, i10, i11);
        }

        public final void b(i iVar) throws IOException {
            g(iVar.size());
            iVar.a(this);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final int a() {
            return this.f19953e - this.f19954f;
        }

        public final void b(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f19952d, this.f19954f, i11);
                this.f19954f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19954f), Integer.valueOf(this.f19953e), Integer.valueOf(i11)), e10);
            }
        }

        public final void b(String str) throws IOException {
            int i10 = this.f19954f;
            try {
                int c10 = l.c(str.length() * 3);
                int c11 = l.c(str.length());
                if (c11 == c10) {
                    int i11 = i10 + c11;
                    this.f19954f = i11;
                    int a10 = s1.f19988a.a(str, this.f19952d, i11, a());
                    this.f19954f = i10;
                    g((a10 - i10) - c11);
                    this.f19954f = a10;
                } else {
                    g(s1.a(str));
                    this.f19954f = s1.f19988a.a(str, this.f19952d, this.f19954f, a());
                }
            } catch (s1.d e10) {
                this.f19954f = i10;
                a(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void g(int i10, int i11) throws IOException {
            g(t1.a(i10, 5));
            e(i11);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public final void g(int i10, long j10) throws IOException {
            g(t1.a(i10, 0));
            d(j10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: h  reason: collision with root package name */
        public final OutputStream f19955h;

        public e(OutputStream outputStream, int i10) {
            super(i10);
            Objects.requireNonNull(outputStream, "out");
            this.f19955h = outputStream;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void a(int i10, q0 q0Var) throws IOException {
            g(t1.a(1, 3));
            j(2, i10);
            g(t1.a(3, 2));
            g(q0Var.getSerializedSize());
            q0Var.writeTo(this);
            g(t1.a(1, 4));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void b(int i10, i iVar) throws IOException {
            g(t1.a(i10, 2));
            b(iVar);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void c(int i10, i iVar) throws IOException {
            g(t1.a(1, 3));
            j(2, i10);
            b(3, iVar);
            g(t1.a(1, 4));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void d(long j10) throws IOException {
            j(10);
            f(j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void e(int i10) throws IOException {
            j(4);
            h(i10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void f(int i10, long j10) throws IOException {
            j(18);
            i(t1.a(i10, 1));
            e(j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void g(int i10, int i11) throws IOException {
            j(14);
            i(t1.a(i10, 5));
            h(i11);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void h(int i10, int i11) throws IOException {
            j(20);
            i(t1.a(i10, 0));
            if (i11 >= 0) {
                i(i11);
            } else {
                f(i11);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void i(int i10, int i11) throws IOException {
            g(t1.a(i10, i11));
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void j(int i10, int i11) throws IOException {
            j(20);
            i(t1.a(i10, 0));
            i(i11);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void b(int i10, q0 q0Var, f1 f1Var) throws IOException {
            g(t1.a(i10, 2));
            g(((com.fyber.inneractive.sdk.protobuf.a) q0Var).getSerializedSize(f1Var));
            f1Var.a((f1) q0Var, (u1) this.f19947a);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void f(int i10) throws IOException {
            if (i10 >= 0) {
                j(5);
                i(i10);
                return;
            }
            d(i10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void g(int i10, long j10) throws IOException {
            j(20);
            i(t1.a(i10, 0));
            f(j10);
        }

        public final void j(int i10) throws IOException {
            if (this.f19949e - this.f19950f < i10) {
                b();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void c(long j10) throws IOException {
            j(8);
            e(j10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void b(int i10, String str) throws IOException {
            g(t1.a(i10, 2));
            b(str);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void a(byte b10) throws IOException {
            if (this.f19950f == this.f19949e) {
                b();
            }
            b(b10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void g(int i10) throws IOException {
            j(5);
            i(i10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.l
        public void b(int i10, boolean z10) throws IOException {
            j(11);
            i(t1.a(i10, 0));
            b(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.h
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            b(bArr, i10, i11);
        }

        public void b(i iVar) throws IOException {
            g(iVar.size());
            iVar.a(this);
        }

        public void b(String str) throws IOException {
            int a10;
            try {
                int length = str.length() * 3;
                int c10 = l.c(length);
                int i10 = c10 + length;
                int i11 = this.f19949e;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int a11 = s1.f19988a.a(str, bArr, 0, length);
                    g(a11);
                    b(bArr, 0, a11);
                    return;
                }
                if (i10 > i11 - this.f19950f) {
                    b();
                }
                int c11 = l.c(str.length());
                int i12 = this.f19950f;
                try {
                    if (c11 == c10) {
                        int i13 = i12 + c11;
                        this.f19950f = i13;
                        int a12 = s1.f19988a.a(str, this.f19948d, i13, this.f19949e - i13);
                        this.f19950f = i12;
                        a10 = (a12 - i12) - c11;
                        i(a10);
                        this.f19950f = a12;
                    } else {
                        a10 = s1.a(str);
                        i(a10);
                        this.f19950f = s1.f19988a.a(str, this.f19948d, this.f19950f, a10);
                    }
                    this.f19951g += a10;
                } catch (s1.d e10) {
                    this.f19951g -= this.f19950f - i12;
                    this.f19950f = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (s1.d e12) {
                a(str, e12);
            }
        }

        public void b(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f19949e;
            int i13 = this.f19950f;
            int i14 = i12 - i13;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, this.f19948d, i13, i11);
                this.f19950f += i11;
                this.f19951g += i11;
                return;
            }
            System.arraycopy(bArr, i10, this.f19948d, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f19950f = this.f19949e;
            this.f19951g += i14;
            b();
            if (i16 <= this.f19949e) {
                System.arraycopy(bArr, i15, this.f19948d, 0, i16);
                this.f19950f = i16;
            } else {
                this.f19955h.write(bArr, i15, i16);
            }
            this.f19951g += i16;
        }

        public final void b() throws IOException {
            this.f19955h.write(this.f19948d, 0, this.f19950f);
            this.f19950f = 0;
        }
    }

    public l() {
    }

    public static int b(int i10, long j10) {
        return b(i10) + a(j10);
    }

    public static int c(int i10, long j10) {
        return b(i10) + 8;
    }

    public static int d(int i10, long j10) {
        return b(i10) + a(b(j10));
    }

    public static int a(d0 d0Var) {
        int serializedSize;
        if (d0Var.f19852b != null) {
            serializedSize = d0Var.f19852b.size();
        } else {
            serializedSize = d0Var.f19851a != null ? d0Var.f19851a.getSerializedSize() : 0;
        }
        return c(serializedSize) + serializedSize;
    }

    public static int e(int i10, long j10) {
        return b(i10) + a(j10);
    }

    public static int b(int i10) {
        return c(t1.a(i10, 0));
    }

    public static int a(int i10, long j10) {
        return b(i10) + 8;
    }

    public static int a(int i10, float f10) {
        return b(i10) + 4;
    }

    public static int a(int i10, double d10) {
        return b(i10) + 8;
    }

    public static int a(int i10, boolean z10) {
        return b(i10) + 1;
    }

    public static int a(int i10, int i11) {
        return b(i10) + a(i11);
    }

    public static int a(int i10, String str) {
        return b(i10) + a(str);
    }

    public static int a(int i10, i iVar) {
        int b10 = b(i10);
        int size = iVar.size();
        return b10 + c(size) + size;
    }

    public static int a(int i10) {
        if (i10 >= 0) {
            return c(i10);
        }
        return 10;
    }

    public static int a(String str) {
        int length;
        try {
            length = s1.a(str);
        } catch (s1.d unused) {
            length = str.getBytes(z.f20078a).length;
        }
        return c(length) + length;
    }

    public static int a(i iVar) {
        int size = iVar.size();
        return c(size) + size;
    }

    public final void a(String str, s1.d dVar) throws IOException {
        f19945b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(z.f20078a);
        try {
            g(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (d e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new d(e11);
        }
    }

    @Deprecated
    public static int a(int i10, q0 q0Var, f1 f1Var) {
        return (b(i10) * 2) + ((com.fyber.inneractive.sdk.protobuf.a) q0Var).getSerializedSize(f1Var);
    }
}
