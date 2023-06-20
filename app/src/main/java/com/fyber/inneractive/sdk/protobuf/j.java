package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.i;
import com.fyber.inneractive.sdk.protobuf.q0;
import com.fyber.inneractive.sdk.protobuf.r1;
import com.fyber.inneractive.sdk.protobuf.s1;
import com.google.android.gms.common.api.Api;
import com.inmobi.media.fq;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public int f19910a;

    /* renamed from: b  reason: collision with root package name */
    public int f19911b;

    /* renamed from: c  reason: collision with root package name */
    public int f19912c;

    /* renamed from: d  reason: collision with root package name */
    public k f19913d;

    /* loaded from: classes2.dex */
    public static final class b extends j {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f19914e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f19915f;

        /* renamed from: g  reason: collision with root package name */
        public int f19916g;

        /* renamed from: h  reason: collision with root package name */
        public int f19917h;

        /* renamed from: i  reason: collision with root package name */
        public int f19918i;

        /* renamed from: j  reason: collision with root package name */
        public int f19919j;

        /* renamed from: k  reason: collision with root package name */
        public int f19920k;

        /* renamed from: l  reason: collision with root package name */
        public int f19921l;

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f19921l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f19914e = bArr;
            this.f19916g = i11 + i10;
            this.f19918i = i10;
            this.f19919j = i10;
            this.f19915f = z10;
        }

        public long A() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte w10 = w();
                j10 |= (w10 & Byte.MAX_VALUE) << i10;
                if ((w10 & 128) == 0) {
                    return j10;
                }
            }
            throw a0.e();
        }

        public final void B() {
            int i10 = this.f19916g + this.f19917h;
            this.f19916g = i10;
            int i11 = i10 - this.f19919j;
            int i12 = this.f19921l;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f19917h = i13;
                this.f19916g = i10 - i13;
                return;
            }
            this.f19917h = 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i10) throws a0 {
            if (this.f19920k != i10) {
                throw a0.a();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int b() {
            return this.f19918i - this.f19919j;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void c(int i10) {
            this.f19921l = i10;
            B();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean d() throws IOException {
            return z() != 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean e(int i10) throws IOException {
            int t10;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 == 0) {
                if (this.f19916g - this.f19918i >= 10) {
                    while (i13 < 10) {
                        byte[] bArr = this.f19914e;
                        int i14 = this.f19918i;
                        this.f19918i = i14 + 1;
                        if (bArr[i14] < 0) {
                            i13++;
                        }
                    }
                    throw a0.e();
                }
                while (i13 < 10) {
                    if (w() < 0) {
                        i13++;
                    }
                }
                throw a0.e();
                return true;
            } else if (i12 == 1) {
                f(8);
                return true;
            } else if (i12 == 2) {
                f(m());
                return true;
            } else if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 == 5) {
                        f(4);
                        return true;
                    }
                    throw a0.d();
                }
                return false;
            } else {
                do {
                    t10 = t();
                    if (t10 == 0) {
                        break;
                    }
                } while (e(t10));
                a(t1.a(i10 >>> 3, 4));
                return true;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public double f() throws IOException {
            return Double.longBitsToDouble(y());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int g() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int h() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long i() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public float j() throws IOException {
            return Float.intBitsToFloat(x());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int k() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long l() throws IOException {
            return z();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f19918i
                int r1 = r5.f19916g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f19914e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f19918i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.A()
                int r1 = (int) r0
                return r1
            L70:
                r5.f19918i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.b.m():int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int n() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long o() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int p() throws IOException {
            return j.b(m());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long q() throws IOException {
            return j.a(z());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String r() throws IOException {
            int m10 = m();
            if (m10 > 0) {
                int i10 = this.f19916g;
                int i11 = this.f19918i;
                if (m10 <= i10 - i11) {
                    String str = new String(this.f19914e, i11, m10, z.f20078a);
                    this.f19918i += m10;
                    return str;
                }
            }
            if (m10 == 0) {
                return "";
            }
            if (m10 < 0) {
                throw a0.f();
            }
            throw a0.i();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String s() throws IOException {
            int m10 = m();
            if (m10 > 0) {
                int i10 = this.f19916g;
                int i11 = this.f19918i;
                if (m10 <= i10 - i11) {
                    String a10 = s1.f19988a.a(this.f19914e, i11, m10);
                    this.f19918i += m10;
                    return a10;
                }
            }
            if (m10 == 0) {
                return "";
            }
            if (m10 <= 0) {
                throw a0.f();
            }
            throw a0.i();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int t() throws IOException {
            if (c()) {
                this.f19920k = 0;
                return 0;
            }
            int m10 = m();
            this.f19920k = m10;
            int i10 = t1.f20010a;
            if ((m10 >>> 3) != 0) {
                return m10;
            }
            throw a0.b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int u() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long v() throws IOException {
            return z();
        }

        public byte w() throws IOException {
            int i10 = this.f19918i;
            if (i10 != this.f19916g) {
                byte[] bArr = this.f19914e;
                this.f19918i = i10 + 1;
                return bArr[i10];
            }
            throw a0.i();
        }

        public int x() throws IOException {
            int i10 = this.f19918i;
            if (this.f19916g - i10 >= 4) {
                byte[] bArr = this.f19914e;
                this.f19918i = i10 + 4;
                return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
            }
            throw a0.i();
        }

        public long y() throws IOException {
            int i10 = this.f19918i;
            if (this.f19916g - i10 >= 8) {
                byte[] bArr = this.f19914e;
                this.f19918i = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw a0.i();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long z() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.b.z():long");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int d(int i10) throws a0 {
            if (i10 >= 0) {
                int b10 = i10 + b();
                int i11 = this.f19921l;
                if (b10 <= i11) {
                    this.f19921l = b10;
                    B();
                    return i11;
                }
                throw a0.i();
            }
            throw a0.f();
        }

        public void f(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f19916g;
                int i12 = this.f19918i;
                if (i10 <= i11 - i12) {
                    this.f19918i = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw a0.f();
            }
            throw a0.i();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i10, q0.a aVar, q qVar) throws IOException {
            int i11 = this.f19910a;
            if (i11 < this.f19911b) {
                this.f19910a = i11 + 1;
                ((GeneratedMessageLite.a) aVar).a(this, qVar);
                a(t1.a(i10, 4));
                this.f19910a--;
                return;
            }
            throw a0.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean c() throws IOException {
            return this.f19918i == this.f19916g;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(q0.a aVar, q qVar) throws IOException {
            int m10 = m();
            if (this.f19910a < this.f19911b) {
                int d10 = d(m10);
                this.f19910a++;
                ((GeneratedMessageLite.a) aVar).a(this, qVar);
                a(0);
                this.f19910a--;
                this.f19921l = d10;
                B();
                return;
            }
            throw a0.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public i e() throws IOException {
            byte[] bArr;
            int m10 = m();
            if (m10 > 0) {
                int i10 = this.f19916g;
                int i11 = this.f19918i;
                if (m10 <= i10 - i11) {
                    i a10 = i.a(this.f19914e, i11, m10);
                    this.f19918i += m10;
                    return a10;
                }
            }
            if (m10 == 0) {
                return i.f19881b;
            }
            if (m10 > 0) {
                int i12 = this.f19916g;
                int i13 = this.f19918i;
                if (m10 <= i12 - i13) {
                    int i14 = m10 + i13;
                    this.f19918i = i14;
                    bArr = Arrays.copyOfRange(this.f19914e, i13, i14);
                    i iVar = i.f19881b;
                    return new i.h(bArr);
                }
            }
            if (m10 <= 0) {
                if (m10 == 0) {
                    bArr = z.f20079b;
                    i iVar2 = i.f19881b;
                    return new i.h(bArr);
                }
                throw a0.f();
            }
            throw a0.i();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int a() {
            int i10 = this.f19921l;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends j {

        /* renamed from: e  reason: collision with root package name */
        public final InputStream f19922e;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f19923f;

        /* renamed from: g  reason: collision with root package name */
        public int f19924g;

        /* renamed from: h  reason: collision with root package name */
        public int f19925h;

        /* renamed from: i  reason: collision with root package name */
        public int f19926i;

        /* renamed from: j  reason: collision with root package name */
        public int f19927j;

        /* renamed from: k  reason: collision with root package name */
        public int f19928k;

        /* renamed from: l  reason: collision with root package name */
        public int f19929l;

        public c(InputStream inputStream, int i10) {
            super();
            this.f19929l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            z.a(inputStream, "input");
            this.f19922e = inputStream;
            this.f19923f = new byte[i10];
            this.f19924g = 0;
            this.f19926i = 0;
            this.f19928k = 0;
        }

        public long A() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte w10 = w();
                j10 |= (w10 & Byte.MAX_VALUE) << i10;
                if ((w10 & 128) == 0) {
                    return j10;
                }
            }
            throw a0.e();
        }

        public final void B() {
            int i10 = this.f19924g + this.f19925h;
            this.f19924g = i10;
            int i11 = this.f19928k + i10;
            int i12 = this.f19929l;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f19925h = i13;
                this.f19924g = i10 - i13;
                return;
            }
            this.f19925h = 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i10) throws a0 {
            if (this.f19927j != i10) {
                throw a0.a();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int b() {
            return this.f19928k + this.f19926i;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void c(int i10) {
            this.f19929l = i10;
            B();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean d() throws IOException {
            return z() != 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean e(int i10) throws IOException {
            int t10;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 == 0) {
                if (this.f19924g - this.f19926i >= 10) {
                    while (i13 < 10) {
                        byte[] bArr = this.f19923f;
                        int i14 = this.f19926i;
                        this.f19926i = i14 + 1;
                        if (bArr[i14] < 0) {
                            i13++;
                        }
                    }
                    throw a0.e();
                }
                while (i13 < 10) {
                    if (w() < 0) {
                        i13++;
                    }
                }
                throw a0.e();
                return true;
            } else if (i12 == 1) {
                i(8);
                return true;
            } else if (i12 == 2) {
                i(m());
                return true;
            } else if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 == 5) {
                        i(4);
                        return true;
                    }
                    throw a0.d();
                }
                return false;
            } else {
                do {
                    t10 = t();
                    if (t10 == 0) {
                        break;
                    }
                } while (e(t10));
                a(t1.a(i10 >>> 3, 4));
                return true;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public double f() throws IOException {
            return Double.longBitsToDouble(y());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int g() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int h() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long i() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public float j() throws IOException {
            return Float.intBitsToFloat(x());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int k() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long l() throws IOException {
            return z();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f19926i
                int r1 = r5.f19924g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f19923f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f19926i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.A()
                int r1 = (int) r0
                return r1
            L70:
                r5.f19926i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.c.m():int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int n() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long o() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int p() throws IOException {
            return j.b(m());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long q() throws IOException {
            return j.a(z());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String r() throws IOException {
            int m10 = m();
            if (m10 > 0) {
                int i10 = this.f19924g;
                int i11 = this.f19926i;
                if (m10 <= i10 - i11) {
                    String str = new String(this.f19923f, i11, m10, z.f20078a);
                    this.f19926i += m10;
                    return str;
                }
            }
            if (m10 == 0) {
                return "";
            }
            if (m10 <= this.f19924g) {
                h(m10);
                String str2 = new String(this.f19923f, this.f19926i, m10, z.f20078a);
                this.f19926i += m10;
                return str2;
            }
            return new String(a(m10, false), z.f20078a);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String s() throws IOException {
            byte[] a10;
            int m10 = m();
            int i10 = this.f19926i;
            int i11 = this.f19924g;
            if (m10 <= i11 - i10 && m10 > 0) {
                a10 = this.f19923f;
                this.f19926i = i10 + m10;
            } else if (m10 == 0) {
                return "";
            } else {
                if (m10 <= i11) {
                    h(m10);
                    a10 = this.f19923f;
                    this.f19926i = m10 + 0;
                } else {
                    a10 = a(m10, false);
                }
                i10 = 0;
            }
            return s1.f19988a.a(a10, i10, m10);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int t() throws IOException {
            if (c()) {
                this.f19927j = 0;
                return 0;
            }
            int m10 = m();
            this.f19927j = m10;
            int i10 = t1.f20010a;
            if ((m10 >>> 3) != 0) {
                return m10;
            }
            throw a0.b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int u() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long v() throws IOException {
            return z();
        }

        public byte w() throws IOException {
            if (this.f19926i == this.f19924g) {
                h(1);
            }
            byte[] bArr = this.f19923f;
            int i10 = this.f19926i;
            this.f19926i = i10 + 1;
            return bArr[i10];
        }

        public int x() throws IOException {
            int i10 = this.f19926i;
            if (this.f19924g - i10 < 4) {
                h(4);
                i10 = this.f19926i;
            }
            byte[] bArr = this.f19923f;
            this.f19926i = i10 + 4;
            return ((bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public long y() throws IOException {
            int i10 = this.f19926i;
            if (this.f19924g - i10 < 8) {
                h(8);
                i10 = this.f19926i;
            }
            byte[] bArr = this.f19923f;
            this.f19926i = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long z() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.c.z():long");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int d(int i10) throws a0 {
            if (i10 >= 0) {
                int i11 = i10 + this.f19928k + this.f19926i;
                int i12 = this.f19929l;
                if (i11 <= i12) {
                    this.f19929l = i11;
                    B();
                    return i12;
                }
                throw a0.i();
            }
            throw a0.f();
        }

        public final byte[] f(int i10) throws IOException {
            if (i10 == 0) {
                return z.f20079b;
            }
            if (i10 >= 0) {
                int i11 = this.f19928k;
                int i12 = this.f19926i;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f19912c <= 0) {
                    int i14 = this.f19929l;
                    if (i13 <= i14) {
                        int i15 = this.f19924g - i12;
                        int i16 = i10 - i15;
                        if (i16 < 4096 || i16 <= this.f19922e.available()) {
                            byte[] bArr = new byte[i10];
                            System.arraycopy(this.f19923f, this.f19926i, bArr, 0, i15);
                            this.f19928k += this.f19924g;
                            this.f19926i = 0;
                            this.f19924g = 0;
                            while (i15 < i10) {
                                int read = this.f19922e.read(bArr, i15, i10 - i15);
                                if (read != -1) {
                                    this.f19928k += read;
                                    i15 += read;
                                } else {
                                    throw a0.i();
                                }
                            }
                            return bArr;
                        }
                        return null;
                    }
                    i((i14 - i11) - i12);
                    throw a0.i();
                }
                throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw a0.f();
        }

        public final List<byte[]> g(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f19922e.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f19928k += read;
                        i11 += read;
                    } else {
                        throw a0.i();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final void h(int i10) throws IOException {
            if (j(i10)) {
                return;
            }
            if (i10 > (this.f19912c - this.f19928k) - this.f19926i) {
                throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw a0.i();
        }

        public void i(int i10) throws IOException {
            int i11 = this.f19924g;
            int i12 = this.f19926i;
            int i13 = i11 - i12;
            if (i10 <= i13 && i10 >= 0) {
                this.f19926i = i12 + i10;
            } else if (i10 >= 0) {
                int i14 = this.f19928k;
                int i15 = i14 + i12;
                int i16 = i15 + i10;
                int i17 = this.f19929l;
                if (i16 <= i17) {
                    this.f19928k = i15;
                    this.f19924g = 0;
                    this.f19926i = 0;
                    while (i13 < i10) {
                        try {
                            long j10 = i10 - i13;
                            long skip = this.f19922e.skip(j10);
                            int i18 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i18 < 0 || skip > j10) {
                                throw new IllegalStateException(this.f19922e.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            } else if (i18 == 0) {
                                break;
                            } else {
                                i13 += (int) skip;
                            }
                        } finally {
                            this.f19928k += i13;
                            B();
                        }
                    }
                    if (i13 >= i10) {
                        return;
                    }
                    int i19 = this.f19924g;
                    int i20 = i19 - this.f19926i;
                    this.f19926i = i19;
                    h(1);
                    while (true) {
                        int i21 = i10 - i20;
                        int i22 = this.f19924g;
                        if (i21 > i22) {
                            i20 += i22;
                            this.f19926i = i22;
                            h(1);
                        } else {
                            this.f19926i = i21;
                            return;
                        }
                    }
                } else {
                    i((i17 - i14) - i12);
                    throw a0.i();
                }
            } else {
                throw a0.f();
            }
        }

        public final boolean j(int i10) throws IOException {
            int i11 = this.f19926i;
            int i12 = i11 + i10;
            int i13 = this.f19924g;
            if (i12 > i13) {
                int i14 = this.f19912c;
                int i15 = this.f19928k;
                if (i10 <= (i14 - i15) - i11 && i15 + i11 + i10 <= this.f19929l) {
                    if (i11 > 0) {
                        if (i13 > i11) {
                            byte[] bArr = this.f19923f;
                            System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                        }
                        this.f19928k += i11;
                        this.f19924g -= i11;
                        this.f19926i = 0;
                    }
                    InputStream inputStream = this.f19922e;
                    byte[] bArr2 = this.f19923f;
                    int i16 = this.f19924g;
                    int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f19912c - this.f19928k) - i16));
                    if (read == 0 || read < -1 || read > this.f19923f.length) {
                        throw new IllegalStateException(this.f19922e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    } else if (read > 0) {
                        this.f19924g += read;
                        B();
                        if (this.f19924g >= i10) {
                            return true;
                        }
                        return j(i10);
                    } else {
                        return false;
                    }
                }
                return false;
            }
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i10, q0.a aVar, q qVar) throws IOException {
            int i11 = this.f19910a;
            if (i11 < this.f19911b) {
                this.f19910a = i11 + 1;
                ((GeneratedMessageLite.a) aVar).a(this, qVar);
                a(t1.a(i10, 4));
                this.f19910a--;
                return;
            }
            throw a0.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean c() throws IOException {
            return this.f19926i == this.f19924g && !j(1);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(q0.a aVar, q qVar) throws IOException {
            int m10 = m();
            if (this.f19910a < this.f19911b) {
                int d10 = d(m10);
                this.f19910a++;
                ((GeneratedMessageLite.a) aVar).a(this, qVar);
                a(0);
                this.f19910a--;
                this.f19929l = d10;
                B();
                return;
            }
            throw a0.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public i e() throws IOException {
            int m10 = m();
            int i10 = this.f19924g;
            int i11 = this.f19926i;
            if (m10 <= i10 - i11 && m10 > 0) {
                i a10 = i.a(this.f19923f, i11, m10);
                this.f19926i += m10;
                return a10;
            } else if (m10 == 0) {
                return i.f19881b;
            } else {
                byte[] f10 = f(m10);
                if (f10 != null) {
                    i iVar = i.f19881b;
                    return i.a(f10, 0, f10.length);
                }
                int i12 = this.f19926i;
                int i13 = this.f19924g;
                int i14 = i13 - i12;
                this.f19928k += i13;
                this.f19926i = 0;
                this.f19924g = 0;
                List<byte[]> g10 = g(m10 - i14);
                byte[] bArr = new byte[m10];
                System.arraycopy(this.f19923f, i12, bArr, 0, i14);
                Iterator it = ((ArrayList) g10).iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    i14 += bArr2.length;
                }
                i iVar2 = i.f19881b;
                return new i.h(bArr);
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int a() {
            int i10 = this.f19929l;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f19928k + this.f19926i);
        }

        public final byte[] a(int i10, boolean z10) throws IOException {
            byte[] f10 = f(i10);
            if (f10 != null) {
                return z10 ? (byte[]) f10.clone() : f10;
            }
            int i11 = this.f19926i;
            int i12 = this.f19924g;
            int i13 = i12 - i11;
            this.f19928k += i12;
            this.f19926i = 0;
            this.f19924g = 0;
            List<byte[]> g10 = g(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f19923f, i11, bArr, 0, i13);
            Iterator it = ((ArrayList) g10).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends j {

        /* renamed from: e  reason: collision with root package name */
        public final ByteBuffer f19930e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f19931f;

        /* renamed from: g  reason: collision with root package name */
        public final long f19932g;

        /* renamed from: h  reason: collision with root package name */
        public long f19933h;

        /* renamed from: i  reason: collision with root package name */
        public long f19934i;

        /* renamed from: j  reason: collision with root package name */
        public long f19935j;

        /* renamed from: k  reason: collision with root package name */
        public int f19936k;

        /* renamed from: l  reason: collision with root package name */
        public int f19937l;

        /* renamed from: m  reason: collision with root package name */
        public int f19938m;

        public d(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f19938m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f19930e = byteBuffer;
            long a10 = r1.a(byteBuffer);
            this.f19932g = a10;
            this.f19933h = byteBuffer.limit() + a10;
            long position = a10 + byteBuffer.position();
            this.f19934i = position;
            this.f19935j = position;
            this.f19931f = z10;
        }

        public long A() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte w10 = w();
                j10 |= (w10 & Byte.MAX_VALUE) << i10;
                if ((w10 & 128) == 0) {
                    return j10;
                }
            }
            throw a0.e();
        }

        public final void B() {
            long j10 = this.f19933h + this.f19936k;
            this.f19933h = j10;
            int i10 = (int) (j10 - this.f19935j);
            int i11 = this.f19938m;
            if (i10 > i11) {
                int i12 = i10 - i11;
                this.f19936k = i12;
                this.f19933h = j10 - i12;
                return;
            }
            this.f19936k = 0;
        }

        public final int C() {
            return (int) (this.f19933h - this.f19934i);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i10) throws a0 {
            if (this.f19937l != i10) {
                throw a0.a();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int b() {
            return (int) (this.f19934i - this.f19935j);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void c(int i10) {
            this.f19938m = i10;
            B();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean d() throws IOException {
            return z() != 0;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean e(int i10) throws IOException {
            int t10;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 == 0) {
                if (C() >= 10) {
                    while (i13 < 10) {
                        long j10 = this.f19934i;
                        this.f19934i = 1 + j10;
                        if (r1.f19981e.a(j10) < 0) {
                            i13++;
                        }
                    }
                    throw a0.e();
                }
                while (i13 < 10) {
                    if (w() < 0) {
                        i13++;
                    }
                }
                throw a0.e();
                return true;
            } else if (i12 == 1) {
                f(8);
                return true;
            } else if (i12 == 2) {
                f(m());
                return true;
            } else if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 == 5) {
                        f(4);
                        return true;
                    }
                    throw a0.d();
                }
                return false;
            } else {
                do {
                    t10 = t();
                    if (t10 == 0) {
                        break;
                    }
                } while (e(t10));
                a(t1.a(i10 >>> 3, 4));
                return true;
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public double f() throws IOException {
            return Double.longBitsToDouble(y());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int g() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int h() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long i() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public float j() throws IOException {
            return Float.intBitsToFloat(x());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int k() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long l() throws IOException {
            return z();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
            if (r6.a(r4) < 0) goto L34;
         */
        @Override // com.fyber.inneractive.sdk.protobuf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m() throws java.io.IOException {
            /*
                r11 = this;
                long r0 = r11.f19934i
                long r2 = r11.f19933h
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L87
            La:
                r2 = 1
                long r4 = r0 + r2
                com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.r1.f19981e
                byte r0 = r6.a(r0)
                if (r0 < 0) goto L19
                r11.f19934i = r4
                return r0
            L19:
                long r7 = r11.f19933h
                long r7 = r7 - r4
                r9 = 9
                int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r1 >= 0) goto L23
                goto L87
            L23:
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L31
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8d
            L31:
                long r4 = r7 + r2
                byte r1 = r6.a(r7)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L40
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3e:
                r7 = r4
                goto L8d
            L40:
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L50
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8d
            L50:
                long r4 = r7 + r2
                byte r1 = r6.a(r7)
                int r7 = r1 << 28
                r0 = r0 ^ r7
                r7 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r7
                if (r1 >= 0) goto L3e
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                if (r1 >= 0) goto L8d
                long r4 = r7 + r2
                byte r1 = r6.a(r7)
                if (r1 >= 0) goto L3e
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                if (r1 >= 0) goto L8d
                long r4 = r7 + r2
                byte r1 = r6.a(r7)
                if (r1 >= 0) goto L3e
                long r7 = r4 + r2
                byte r1 = r6.a(r4)
                if (r1 >= 0) goto L8d
            L87:
                long r0 = r11.A()
                int r1 = (int) r0
                return r1
            L8d:
                r11.f19934i = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.j.d.m():int");
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int n() throws IOException {
            return x();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long o() throws IOException {
            return y();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int p() throws IOException {
            return j.b(m());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long q() throws IOException {
            return j.a(z());
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String r() throws IOException {
            int m10 = m();
            if (m10 <= 0 || m10 > C()) {
                if (m10 == 0) {
                    return "";
                }
                if (m10 < 0) {
                    throw a0.f();
                }
                throw a0.i();
            }
            byte[] bArr = new byte[m10];
            long j10 = m10;
            r1.f19981e.a(this.f19934i, bArr, 0L, j10);
            String str = new String(bArr, z.f20078a);
            this.f19934i += j10;
            return str;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public String s() throws IOException {
            String a10;
            int m10 = m();
            if (m10 <= 0 || m10 > C()) {
                if (m10 == 0) {
                    return "";
                }
                if (m10 <= 0) {
                    throw a0.f();
                }
                throw a0.i();
            }
            int b10 = b(this.f19934i);
            ByteBuffer byteBuffer = this.f19930e;
            s1.b bVar = s1.f19988a;
            bVar.getClass();
            if (byteBuffer.hasArray()) {
                a10 = bVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + b10, m10);
            } else if (byteBuffer.isDirect()) {
                a10 = bVar.b(byteBuffer, b10, m10);
            } else {
                a10 = bVar.a(byteBuffer, b10, m10);
            }
            this.f19934i += m10;
            return a10;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int t() throws IOException {
            if (c()) {
                this.f19937l = 0;
                return 0;
            }
            int m10 = m();
            this.f19937l = m10;
            int i10 = t1.f20010a;
            if ((m10 >>> 3) != 0) {
                return m10;
            }
            throw a0.b();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int u() throws IOException {
            return m();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public long v() throws IOException {
            return z();
        }

        public byte w() throws IOException {
            long j10 = this.f19934i;
            if (j10 != this.f19933h) {
                this.f19934i = 1 + j10;
                return r1.f19981e.a(j10);
            }
            throw a0.i();
        }

        public int x() throws IOException {
            long j10 = this.f19934i;
            if (this.f19933h - j10 >= 4) {
                this.f19934i = 4 + j10;
                r1.d dVar = r1.f19981e;
                return ((dVar.a(j10 + 3) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (dVar.a(j10) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((dVar.a(1 + j10) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((dVar.a(2 + j10) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
            }
            throw a0.i();
        }

        public long y() throws IOException {
            long j10 = this.f19934i;
            if (this.f19933h - j10 >= 8) {
                this.f19934i = 8 + j10;
                r1.d dVar = r1.f19981e;
                return ((dVar.a(j10 + 7) & 255) << 56) | (dVar.a(j10) & 255) | ((dVar.a(1 + j10) & 255) << 8) | ((dVar.a(2 + j10) & 255) << 16) | ((dVar.a(3 + j10) & 255) << 24) | ((dVar.a(4 + j10) & 255) << 32) | ((dVar.a(5 + j10) & 255) << 40) | ((dVar.a(6 + j10) & 255) << 48);
            }
            throw a0.i();
        }

        public long z() throws IOException {
            long a10;
            long j10;
            long j11;
            int i10;
            long j12 = this.f19934i;
            if (this.f19933h != j12) {
                long j13 = j12 + 1;
                r1.d dVar = r1.f19981e;
                byte a11 = dVar.a(j12);
                if (a11 >= 0) {
                    this.f19934i = j13;
                    return a11;
                } else if (this.f19933h - j13 >= 9) {
                    long j14 = j13 + 1;
                    int a12 = a11 ^ (dVar.a(j13) << 7);
                    if (a12 >= 0) {
                        long j15 = j14 + 1;
                        int a13 = a12 ^ (dVar.a(j14) << 14);
                        if (a13 >= 0) {
                            a10 = a13 ^ 16256;
                        } else {
                            j14 = j15 + 1;
                            int a14 = a13 ^ (dVar.a(j15) << 21);
                            if (a14 < 0) {
                                i10 = a14 ^ (-2080896);
                            } else {
                                j15 = j14 + 1;
                                long a15 = a14 ^ (dVar.a(j14) << 28);
                                if (a15 < 0) {
                                    long j16 = j15 + 1;
                                    long a16 = a15 ^ (dVar.a(j15) << 35);
                                    if (a16 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        j15 = j16 + 1;
                                        a15 = a16 ^ (dVar.a(j16) << 42);
                                        if (a15 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            j16 = j15 + 1;
                                            a16 = a15 ^ (dVar.a(j15) << 49);
                                            if (a16 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                j15 = j16 + 1;
                                                a10 = (a16 ^ (dVar.a(j16) << 56)) ^ 71499008037633920L;
                                                if (a10 < 0) {
                                                    long j17 = 1 + j15;
                                                    if (dVar.a(j15) >= 0) {
                                                        j14 = j17;
                                                        this.f19934i = j14;
                                                        return a10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    a10 = a16 ^ j10;
                                    j14 = j16;
                                    this.f19934i = j14;
                                    return a10;
                                }
                                j11 = 266354560;
                                a10 = a15 ^ j11;
                            }
                        }
                        j14 = j15;
                        this.f19934i = j14;
                        return a10;
                    }
                    i10 = a12 ^ (-128);
                    a10 = i10;
                    this.f19934i = j14;
                    return a10;
                }
            }
            return A();
        }

        public final int b(long j10) {
            return (int) (j10 - this.f19932g);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int d(int i10) throws a0 {
            if (i10 >= 0) {
                int b10 = i10 + b();
                int i11 = this.f19938m;
                if (b10 <= i11) {
                    this.f19938m = b10;
                    B();
                    return i11;
                }
                throw a0.i();
            }
            throw a0.f();
        }

        public void f(int i10) throws IOException {
            if (i10 >= 0 && i10 <= C()) {
                this.f19934i += i10;
            } else if (i10 < 0) {
                throw a0.f();
            } else {
                throw a0.i();
            }
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(int i10, q0.a aVar, q qVar) throws IOException {
            int i11 = this.f19910a;
            if (i11 < this.f19911b) {
                this.f19910a = i11 + 1;
                ((GeneratedMessageLite.a) aVar).a(this, qVar);
                a(t1.a(i10, 4));
                this.f19910a--;
                return;
            }
            throw a0.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public boolean c() throws IOException {
            return this.f19934i == this.f19933h;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public void a(q0.a aVar, q qVar) throws IOException {
            int m10 = m();
            if (this.f19910a < this.f19911b) {
                int d10 = d(m10);
                this.f19910a++;
                ((GeneratedMessageLite.a) aVar).a(this, qVar);
                a(0);
                this.f19910a--;
                this.f19938m = d10;
                B();
                return;
            }
            throw a0.h();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public i e() throws IOException {
            int m10 = m();
            if (m10 <= 0 || m10 > C()) {
                if (m10 == 0) {
                    return i.f19881b;
                }
                if (m10 < 0) {
                    throw a0.f();
                }
                throw a0.i();
            }
            byte[] bArr = new byte[m10];
            long j10 = m10;
            r1.f19981e.a(this.f19934i, bArr, 0L, j10);
            this.f19934i += j10;
            i iVar = i.f19881b;
            return new i.h(bArr);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.j
        public int a() {
            int i10 = this.f19938m;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - b();
        }
    }

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static j a(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = z.f20079b;
            return a(bArr, 0, bArr.length, false);
        }
        return new c(inputStream, 4096);
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int a();

    public abstract void a(int i10) throws a0;

    public abstract void a(int i10, q0.a aVar, q qVar) throws IOException;

    public abstract void a(q0.a aVar, q qVar) throws IOException;

    public abstract int b();

    public abstract void c(int i10);

    public abstract boolean c() throws IOException;

    public abstract int d(int i10) throws a0;

    public abstract boolean d() throws IOException;

    public abstract i e() throws IOException;

    public abstract boolean e(int i10) throws IOException;

    public abstract double f() throws IOException;

    public abstract int g() throws IOException;

    public abstract int h() throws IOException;

    public abstract long i() throws IOException;

    public abstract float j() throws IOException;

    public abstract int k() throws IOException;

    public abstract long l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract long o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract String r() throws IOException;

    public abstract String s() throws IOException;

    public abstract int t() throws IOException;

    public abstract int u() throws IOException;

    public abstract long v() throws IOException;

    public j() {
        this.f19911b = 100;
        this.f19912c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static j a(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.d(i11);
            return bVar;
        } catch (a0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static j a(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && r1.f19982f) {
            return new d(byteBuffer, z10);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return a(bArr, 0, remaining, true);
    }
}
