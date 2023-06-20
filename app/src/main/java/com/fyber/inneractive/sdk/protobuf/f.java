package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.i;
import com.fyber.inneractive.sdk.protobuf.j0;
import com.google.android.gms.common.api.Api;
import com.inmobi.media.fq;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class f implements e1 {

    /* loaded from: classes2.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f19862a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f19863b;

        /* renamed from: c  reason: collision with root package name */
        public int f19864c;

        /* renamed from: d  reason: collision with root package name */
        public int f19865d;

        /* renamed from: e  reason: collision with root package name */
        public int f19866e;

        /* renamed from: f  reason: collision with root package name */
        public int f19867f;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f19862a = z10;
            this.f19863b = byteBuffer.array();
            this.f19864c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f19865d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        public final int A() throws IOException {
            int i10;
            int i11 = this.f19864c;
            int i12 = this.f19865d;
            if (i12 != i11) {
                byte[] bArr = this.f19863b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f19864c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return (int) C();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                i16 = i14 + 1;
                                byte b11 = bArr[i14];
                                i10 = (i18 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i14 = i16 + 1;
                                    if (bArr[i16] < 0) {
                                        i16 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i16 + 1;
                                            if (bArr[i16] < 0) {
                                                i16 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i16 + 1;
                                                    if (bArr[i16] < 0) {
                                                        throw a0.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i16;
                    }
                    this.f19864c = i14;
                    return i10;
                }
            }
            throw a0.i();
        }

        public long B() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            int i11 = this.f19864c;
            int i12 = this.f19865d;
            if (i12 != i11) {
                byte[] bArr = this.f19863b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f19864c = i13;
                    return b10;
                } else if (i12 - i13 < 9) {
                    return C();
                } else {
                    int i14 = i13 + 1;
                    int i15 = b10 ^ (bArr[i13] << 7);
                    if (i15 >= 0) {
                        int i16 = i14 + 1;
                        int i17 = i15 ^ (bArr[i14] << 14);
                        if (i17 >= 0) {
                            i14 = i16;
                            j10 = i17 ^ 16256;
                        } else {
                            i14 = i16 + 1;
                            int i18 = i17 ^ (bArr[i16] << 21);
                            if (i18 < 0) {
                                i10 = i18 ^ (-2080896);
                            } else {
                                long j13 = i18;
                                int i19 = i14 + 1;
                                long j14 = j13 ^ (bArr[i14] << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i14 = i19 + 1;
                                    long j15 = j14 ^ (bArr[i19] << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i19 = i14 + 1;
                                        j14 = j15 ^ (bArr[i14] << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i14 = i19 + 1;
                                            j15 = j14 ^ (bArr[i19] << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i20 = i14 + 1;
                                                long j16 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i14 = i20 + 1;
                                                    if (bArr[i20] < 0) {
                                                        throw a0.e();
                                                    }
                                                } else {
                                                    i14 = i20;
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                }
                                j10 = j14 ^ j12;
                                i14 = i19;
                            }
                        }
                        this.f19864c = i14;
                        return j10;
                    }
                    i10 = i15 ^ (-128);
                    j10 = i10;
                    this.f19864c = i14;
                    return j10;
                }
            }
            throw a0.i();
        }

        public final long C() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte v10 = v();
                j10 |= (v10 & Byte.MAX_VALUE) << i10;
                if ((v10 & 128) == 0) {
                    return j10;
                }
            }
            throw a0.e();
        }

        public String a(boolean z10) throws IOException {
            c(2);
            int A = A();
            if (A == 0) {
                return "";
            }
            a(A);
            if (z10) {
                byte[] bArr = this.f19863b;
                int i10 = this.f19864c;
                if (!s1.b(bArr, i10, i10 + A)) {
                    throw a0.c();
                }
            }
            String str = new String(this.f19863b, this.f19864c, A, z.f20078a);
            this.f19864c += A;
            return str;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public <T> T b(Class<T> cls, q qVar) throws IOException {
            c(2);
            return (T) d(b1.f19840c.a(cls), qVar);
        }

        public final <T> T c(f1<T> f1Var, q qVar) throws IOException {
            int i10 = this.f19867f;
            int i11 = this.f19866e;
            int i12 = t1.f20010a;
            this.f19867f = t1.a(i11 >>> 3, 4);
            try {
                T a10 = f1Var.a();
                f1Var.a(a10, this, qVar);
                f1Var.c(a10);
                if (this.f19866e == this.f19867f) {
                    return a10;
                }
                throw a0.g();
            } finally {
                this.f19867f = i10;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public int d() throws IOException {
            c(0);
            return A();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public int e() {
            return this.f19866e;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public long f() throws IOException {
            c(0);
            return B();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public long g() throws IOException {
            c(1);
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public double h() throws IOException {
            c(1);
            return Double.longBitsToDouble(y());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public boolean i() throws IOException {
            int i10;
            int i11;
            if (u() || (i10 = this.f19866e) == (i11 = this.f19867f)) {
                return false;
            }
            int i12 = t1.f20010a;
            int i13 = i10 & 7;
            if (i13 == 0) {
                int i14 = this.f19865d;
                int i15 = this.f19864c;
                if (i14 - i15 >= 10) {
                    byte[] bArr = this.f19863b;
                    int i16 = 0;
                    while (i16 < 10) {
                        int i17 = i15 + 1;
                        if (bArr[i15] >= 0) {
                            this.f19864c = i17;
                            break;
                        }
                        i16++;
                        i15 = i17;
                    }
                }
                for (int i18 = 0; i18 < 10; i18++) {
                    if (v() >= 0) {
                        return true;
                    }
                }
                throw a0.e();
            } else if (i13 == 1) {
                d(8);
                return true;
            } else if (i13 == 2) {
                d(A());
                return true;
            } else if (i13 != 3) {
                if (i13 == 5) {
                    d(4);
                    return true;
                }
                throw a0.d();
            } else {
                this.f19867f = t1.a(i10 >>> 3, 4);
                while (s() != Integer.MAX_VALUE && i()) {
                }
                if (this.f19866e == this.f19867f) {
                    this.f19867f = i11;
                    return true;
                }
                throw a0.g();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public int j() throws IOException {
            c(0);
            return j.b(A());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public float k() throws IOException {
            c(5);
            return Float.intBitsToFloat(w());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public long l() throws IOException {
            c(0);
            return j.a(B());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public int m() throws IOException {
            c(5);
            return w();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public String n() throws IOException {
            return a(false);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public long o() throws IOException {
            c(0);
            return B();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public String p() throws IOException {
            return a(true);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public int q() throws IOException {
            c(5);
            return w();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public boolean r() throws IOException {
            c(0);
            return A() != 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public int s() throws IOException {
            if (u()) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            int A = A();
            this.f19866e = A;
            if (A == this.f19867f) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            int i10 = t1.f20010a;
            return A >>> 3;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public long t() throws IOException {
            c(1);
            return y();
        }

        public final boolean u() {
            return this.f19864c == this.f19865d;
        }

        public final byte v() throws IOException {
            int i10 = this.f19864c;
            if (i10 != this.f19865d) {
                byte[] bArr = this.f19863b;
                this.f19864c = i10 + 1;
                return bArr[i10];
            }
            throw a0.i();
        }

        public final int w() throws IOException {
            a(4);
            return x();
        }

        public final int x() {
            int i10 = this.f19864c;
            byte[] bArr = this.f19863b;
            this.f19864c = i10 + 4;
            return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public final long y() throws IOException {
            a(8);
            return z();
        }

        public final long z() {
            int i10 = this.f19864c;
            byte[] bArr = this.f19863b;
            this.f19864c = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void e(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 2) {
                    int A = A();
                    e(A);
                    int i15 = this.f19864c + A;
                    while (this.f19864c < i15) {
                        yVar.c(x());
                    }
                    return;
                } else if (i14 == 5) {
                    do {
                        yVar.c(q());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i16 = this.f19866e;
            int i17 = t1.f20010a;
            int i18 = i16 & 7;
            if (i18 == 2) {
                int A2 = A();
                e(A2);
                int i19 = this.f19864c + A2;
                while (this.f19864c < i19) {
                    list.add(Integer.valueOf(x()));
                }
            } else if (i18 == 5) {
                do {
                    list.add(Integer.valueOf(q()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else {
                throw a0.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void n(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 1) {
                    do {
                        h0Var.a(g());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else if (i14 == 2) {
                    int A = A();
                    f(A);
                    int i15 = this.f19864c + A;
                    while (this.f19864c < i15) {
                        h0Var.a(z());
                    }
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i16 = this.f19866e;
            int i17 = t1.f20010a;
            int i18 = i16 & 7;
            if (i18 == 1) {
                do {
                    list.add(Long.valueOf(g()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else if (i18 == 2) {
                int A2 = A();
                f(A2);
                int i19 = this.f19864c + A2;
                while (this.f19864c < i19) {
                    list.add(Long.valueOf(z()));
                }
            } else {
                throw a0.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void p(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 == 2) {
                        int A = this.f19864c + A();
                        while (this.f19864c < A) {
                            yVar.c(A());
                        }
                        return;
                    }
                    throw a0.d();
                }
                do {
                    yVar.c(b());
                    if (u()) {
                        return;
                    }
                    i11 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i11;
                return;
            }
            int i15 = this.f19866e;
            int i16 = t1.f20010a;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 2) {
                    int A2 = this.f19864c + A();
                    while (this.f19864c < A2) {
                        list.add(Integer.valueOf(A()));
                    }
                    return;
                }
                throw a0.d();
            }
            do {
                list.add(Integer.valueOf(b()));
                if (u()) {
                    return;
                }
                i10 = this.f19864c;
            } while (A() == this.f19866e);
            this.f19864c = i10;
        }

        public final <T> T d(f1<T> f1Var, q qVar) throws IOException {
            int A = A();
            a(A);
            int i10 = this.f19865d;
            int i11 = this.f19864c + A;
            this.f19865d = i11;
            try {
                T a10 = f1Var.a();
                f1Var.a(a10, this, qVar);
                f1Var.c(a10);
                if (this.f19864c == i11) {
                    return a10;
                }
                throw a0.g();
            } finally {
                this.f19865d = i10;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void f(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 2) {
                    int A = A();
                    e(A);
                    int i15 = this.f19864c + A;
                    while (this.f19864c < i15) {
                        yVar.c(x());
                    }
                    return;
                } else if (i14 == 5) {
                    do {
                        yVar.c(m());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i16 = this.f19866e;
            int i17 = t1.f20010a;
            int i18 = i16 & 7;
            if (i18 == 2) {
                int A2 = A();
                e(A2);
                int i19 = this.f19864c + A2;
                while (this.f19864c < i19) {
                    list.add(Integer.valueOf(x()));
                }
            } else if (i18 == 5) {
                do {
                    list.add(Integer.valueOf(m()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else {
                throw a0.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void g(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 == 2) {
                        int A = this.f19864c + A();
                        while (this.f19864c < A) {
                            h0Var.a(j.a(B()));
                        }
                        return;
                    }
                    throw a0.d();
                }
                do {
                    h0Var.a(l());
                    if (u()) {
                        return;
                    }
                    i11 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i11;
                return;
            }
            int i15 = this.f19866e;
            int i16 = t1.f20010a;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 2) {
                    int A2 = this.f19864c + A();
                    while (this.f19864c < A2) {
                        list.add(Long.valueOf(j.a(B())));
                    }
                    return;
                }
                throw a0.d();
            }
            do {
                list.add(Long.valueOf(l()));
                if (u()) {
                    return;
                }
                i10 = this.f19864c;
            } while (A() == this.f19866e);
            this.f19864c = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void h(List<i> list) throws IOException {
            int i10;
            int i11 = this.f19866e;
            int i12 = t1.f20010a;
            if ((i11 & 7) == 2) {
                do {
                    list.add(a());
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
                return;
            }
            throw a0.d();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void j(List<Double> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof n) {
                n nVar = (n) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 1) {
                    do {
                        nVar.a(h());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else if (i14 == 2) {
                    int A = A();
                    f(A);
                    int i15 = this.f19864c + A;
                    while (this.f19864c < i15) {
                        nVar.a(Double.longBitsToDouble(z()));
                    }
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i16 = this.f19866e;
            int i17 = t1.f20010a;
            int i18 = i16 & 7;
            if (i18 == 1) {
                do {
                    list.add(Double.valueOf(h()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else if (i18 == 2) {
                int A2 = A();
                f(A2);
                int i19 = this.f19864c + A2;
                while (this.f19864c < i19) {
                    list.add(Double.valueOf(Double.longBitsToDouble(z())));
                }
            } else {
                throw a0.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void k(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 0) {
                    do {
                        h0Var.a(o());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else if (i14 == 2) {
                    int A = this.f19864c + A();
                    while (this.f19864c < A) {
                        h0Var.a(B());
                    }
                    b(A);
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i15 = this.f19866e;
            int i16 = t1.f20010a;
            int i17 = i15 & 7;
            if (i17 == 0) {
                do {
                    list.add(Long.valueOf(o()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else if (i17 == 2) {
                int A2 = this.f19864c + A();
                while (this.f19864c < A2) {
                    list.add(Long.valueOf(B()));
                }
                b(A2);
            } else {
                throw a0.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void l(List<Boolean> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof g) {
                g gVar = (g) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 == 2) {
                        int A = this.f19864c + A();
                        while (this.f19864c < A) {
                            gVar.a(A() != 0);
                        }
                        b(A);
                        return;
                    }
                    throw a0.d();
                }
                do {
                    gVar.a(r());
                    if (u()) {
                        return;
                    }
                    i11 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i11;
                return;
            }
            int i15 = this.f19866e;
            int i16 = t1.f20010a;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 2) {
                    int A2 = this.f19864c + A();
                    while (this.f19864c < A2) {
                        list.add(Boolean.valueOf(A() != 0));
                    }
                    b(A2);
                    return;
                }
                throw a0.d();
            }
            do {
                list.add(Boolean.valueOf(r()));
                if (u()) {
                    return;
                }
                i10 = this.f19864c;
            } while (A() == this.f19866e);
            this.f19864c = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void m(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 1) {
                    do {
                        h0Var.a(t());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else if (i14 == 2) {
                    int A = A();
                    f(A);
                    int i15 = this.f19864c + A;
                    while (this.f19864c < i15) {
                        h0Var.a(z());
                    }
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i16 = this.f19866e;
            int i17 = t1.f20010a;
            int i18 = i16 & 7;
            if (i18 == 1) {
                do {
                    list.add(Long.valueOf(t()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else if (i18 == 2) {
                int A2 = A();
                f(A2);
                int i19 = this.f19864c + A2;
                while (this.f19864c < i19) {
                    list.add(Long.valueOf(z()));
                }
            } else {
                throw a0.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void o(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 0) {
                    do {
                        yVar.c(d());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else if (i14 == 2) {
                    int A = this.f19864c + A();
                    while (this.f19864c < A) {
                        yVar.c(A());
                    }
                    b(A);
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i15 = this.f19866e;
            int i16 = t1.f20010a;
            int i17 = i15 & 7;
            if (i17 == 0) {
                do {
                    list.add(Integer.valueOf(d()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else if (i17 == 2) {
                int A2 = this.f19864c + A();
                while (this.f19864c < A2) {
                    list.add(Integer.valueOf(A()));
                }
                b(A2);
            } else {
                throw a0.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void q(List<String> list) throws IOException {
            a(list, false);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public <T> T b(f1<T> f1Var, q qVar) throws IOException {
            c(2);
            return (T) d(f1Var, qVar);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public int b() throws IOException {
            c(0);
            return A();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public <T> T a(Class<T> cls, q qVar) throws IOException {
            c(3);
            return (T) c(b1.f19840c.a(cls), qVar);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void b(List<String> list) throws IOException {
            a(list, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public <T> void b(List<T> list, f1<T> f1Var, q qVar) throws IOException {
            int i10;
            int i11 = this.f19866e;
            int i12 = t1.f20010a;
            if ((i11 & 7) == 2) {
                do {
                    list.add(d(f1Var, qVar));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == i11);
                this.f19864c = i10;
                return;
            }
            throw a0.d();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public <T> T a(f1<T> f1Var, q qVar) throws IOException {
            c(3);
            return (T) c(f1Var, qVar);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public int c() throws IOException {
            c(0);
            return A();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public i a() throws IOException {
            i a10;
            c(2);
            int A = A();
            if (A == 0) {
                return i.f19881b;
            }
            a(A);
            if (this.f19862a) {
                byte[] bArr = this.f19863b;
                int i10 = this.f19864c;
                i iVar = i.f19881b;
                a10 = new i.d(bArr, i10, A);
            } else {
                a10 = i.a(this.f19863b, this.f19864c, A);
            }
            this.f19864c += A;
            return a10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void c(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 == 2) {
                        int A = this.f19864c + A();
                        while (this.f19864c < A) {
                            yVar.c(j.b(A()));
                        }
                        return;
                    }
                    throw a0.d();
                }
                do {
                    yVar.c(j());
                    if (u()) {
                        return;
                    }
                    i11 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i11;
                return;
            }
            int i15 = this.f19866e;
            int i16 = t1.f20010a;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 2) {
                    int A2 = this.f19864c + A();
                    while (this.f19864c < A2) {
                        list.add(Integer.valueOf(j.b(A())));
                    }
                    return;
                }
                throw a0.d();
            }
            do {
                list.add(Integer.valueOf(j()));
                if (u()) {
                    return;
                }
                i10 = this.f19864c;
            } while (A() == this.f19866e);
            this.f19864c = i10;
        }

        public final void b(int i10) throws IOException {
            if (this.f19864c != i10) {
                throw a0.i();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void d(List<Float> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof w) {
                w wVar = (w) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 2) {
                    int A = A();
                    e(A);
                    int i15 = this.f19864c + A;
                    while (this.f19864c < i15) {
                        wVar.a(Float.intBitsToFloat(x()));
                    }
                    return;
                } else if (i14 == 5) {
                    do {
                        wVar.a(k());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i16 = this.f19866e;
            int i17 = t1.f20010a;
            int i18 = i16 & 7;
            if (i18 == 2) {
                int A2 = A();
                e(A2);
                int i19 = this.f19864c + A2;
                while (this.f19864c < i19) {
                    list.add(Float.valueOf(Float.intBitsToFloat(x())));
                }
            } else if (i18 == 5) {
                do {
                    list.add(Float.valueOf(k()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else {
                throw a0.d();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void i(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof y) {
                y yVar = (y) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 == 2) {
                        int A = this.f19864c + A();
                        while (this.f19864c < A) {
                            yVar.c(A());
                        }
                        return;
                    }
                    throw a0.d();
                }
                do {
                    yVar.c(c());
                    if (u()) {
                        return;
                    }
                    i11 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i11;
                return;
            }
            int i15 = this.f19866e;
            int i16 = t1.f20010a;
            int i17 = i15 & 7;
            if (i17 != 0) {
                if (i17 == 2) {
                    int A2 = this.f19864c + A();
                    while (this.f19864c < A2) {
                        list.add(Integer.valueOf(A()));
                    }
                    return;
                }
                throw a0.d();
            }
            do {
                list.add(Integer.valueOf(c()));
                if (u()) {
                    return;
                }
                i10 = this.f19864c;
            } while (A() == this.f19866e);
            this.f19864c = i10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public void a(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (list instanceof h0) {
                h0 h0Var = (h0) list;
                int i12 = this.f19866e;
                int i13 = t1.f20010a;
                int i14 = i12 & 7;
                if (i14 == 0) {
                    do {
                        h0Var.a(f());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                } else if (i14 == 2) {
                    int A = this.f19864c + A();
                    while (this.f19864c < A) {
                        h0Var.a(B());
                    }
                    b(A);
                    return;
                } else {
                    throw a0.d();
                }
            }
            int i15 = this.f19866e;
            int i16 = t1.f20010a;
            int i17 = i15 & 7;
            if (i17 == 0) {
                do {
                    list.add(Long.valueOf(f()));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
            } else if (i17 == 2) {
                int A2 = this.f19864c + A();
                while (this.f19864c < A2) {
                    list.add(Long.valueOf(B()));
                }
                b(A2);
            } else {
                throw a0.d();
            }
        }

        public final void e(int i10) throws IOException {
            a(i10);
            if ((i10 & 3) != 0) {
                throw a0.g();
            }
        }

        public final void f(int i10) throws IOException {
            a(i10);
            if ((i10 & 7) != 0) {
                throw a0.g();
            }
        }

        public final void c(int i10) throws IOException {
            int i11 = this.f19866e;
            int i12 = t1.f20010a;
            if ((i11 & 7) != i10) {
                throw a0.d();
            }
        }

        public final void d(int i10) throws IOException {
            a(i10);
            this.f19864c += i10;
        }

        public void a(List<String> list, boolean z10) throws IOException {
            int i10;
            int i11;
            int i12 = this.f19866e;
            int i13 = t1.f20010a;
            if ((i12 & 7) == 2) {
                if ((list instanceof f0) && !z10) {
                    f0 f0Var = (f0) list;
                    do {
                        f0Var.a(a());
                        if (u()) {
                            return;
                        }
                        i11 = this.f19864c;
                    } while (A() == this.f19866e);
                    this.f19864c = i11;
                    return;
                }
                do {
                    list.add(a(z10));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == this.f19866e);
                this.f19864c = i10;
                return;
            }
            throw a0.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public <T> void a(List<T> list, f1<T> f1Var, q qVar) throws IOException {
            int i10;
            int i11 = this.f19866e;
            int i12 = t1.f20010a;
            if ((i11 & 7) == 3) {
                do {
                    list.add(c(f1Var, qVar));
                    if (u()) {
                        return;
                    }
                    i10 = this.f19864c;
                } while (A() == i11);
                this.f19864c = i10;
                return;
            }
            throw a0.d();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public <K, V> void a(Map<K, V> map, j0.a<K, V> aVar, q qVar) throws IOException {
            c(2);
            int A = A();
            a(A);
            int i10 = this.f19865d;
            this.f19865d = this.f19864c + A;
            try {
                throw null;
            } catch (Throwable th) {
                this.f19865d = i10;
                throw th;
            }
        }

        public final void a(int i10) throws IOException {
            if (i10 < 0 || i10 > this.f19865d - this.f19864c) {
                throw a0.i();
            }
        }
    }

    public f() {
    }
}
