package u8;

import com.inmobi.media.fq;
import j8.j2;
import java.io.IOException;
import java.util.ArrayDeque;
import p8.j;

/* compiled from: DefaultEbmlReader.java */
/* loaded from: classes2.dex */
final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f37589a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<b> f37590b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final g f37591c = new g();

    /* renamed from: d  reason: collision with root package name */
    private u8.b f37592d;

    /* renamed from: e  reason: collision with root package name */
    private int f37593e;

    /* renamed from: f  reason: collision with root package name */
    private int f37594f;

    /* renamed from: g  reason: collision with root package name */
    private long f37595g;

    /* compiled from: DefaultEbmlReader.java */
    /* loaded from: classes2.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f37596a;

        /* renamed from: b  reason: collision with root package name */
        private final long f37597b;

        private b(int i10, long j10) {
            this.f37596a = i10;
            this.f37597b = j10;
        }
    }

    private long c(j jVar) throws IOException {
        jVar.f();
        while (true) {
            jVar.p(this.f37589a, 0, 4);
            int c10 = g.c(this.f37589a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f37589a, c10, false);
                if (this.f37592d.f(a10)) {
                    jVar.m(c10);
                    return a10;
                }
            }
            jVar.m(1);
        }
    }

    private double d(j jVar, int i10) throws IOException {
        long e10 = e(jVar, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) e10);
        }
        return Double.longBitsToDouble(e10);
    }

    private long e(j jVar, int i10) throws IOException {
        jVar.readFully(this.f37589a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f37589a[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return j10;
    }

    private static String f(j jVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        jVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // u8.c
    public boolean a(j jVar) throws IOException {
        ea.a.h(this.f37592d);
        while (true) {
            b peek = this.f37590b.peek();
            if (peek != null && jVar.getPosition() >= peek.f37597b) {
                this.f37592d.a(this.f37590b.pop().f37596a);
                return true;
            }
            if (this.f37593e == 0) {
                long d10 = this.f37591c.d(jVar, true, false, 4);
                if (d10 == -2) {
                    d10 = c(jVar);
                }
                if (d10 == -1) {
                    return false;
                }
                this.f37594f = (int) d10;
                this.f37593e = 1;
            }
            if (this.f37593e == 1) {
                this.f37595g = this.f37591c.d(jVar, false, true, 8);
                this.f37593e = 2;
            }
            int e10 = this.f37592d.e(this.f37594f);
            if (e10 != 0) {
                if (e10 == 1) {
                    long position = jVar.getPosition();
                    this.f37590b.push(new b(this.f37594f, this.f37595g + position));
                    this.f37592d.h(this.f37594f, position, this.f37595g);
                    this.f37593e = 0;
                    return true;
                } else if (e10 == 2) {
                    long j10 = this.f37595g;
                    if (j10 <= 8) {
                        this.f37592d.d(this.f37594f, e(jVar, (int) j10));
                        this.f37593e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid integer size: ");
                    sb2.append(j10);
                    throw j2.a(sb2.toString(), null);
                } else if (e10 == 3) {
                    long j11 = this.f37595g;
                    if (j11 <= 2147483647L) {
                        this.f37592d.g(this.f37594f, f(jVar, (int) j11));
                        this.f37593e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j11);
                    throw j2.a(sb3.toString(), null);
                } else if (e10 == 4) {
                    this.f37592d.b(this.f37594f, (int) this.f37595g, jVar);
                    this.f37593e = 0;
                    return true;
                } else if (e10 == 5) {
                    long j12 = this.f37595g;
                    if (j12 != 4 && j12 != 8) {
                        StringBuilder sb4 = new StringBuilder(40);
                        sb4.append("Invalid float size: ");
                        sb4.append(j12);
                        throw j2.a(sb4.toString(), null);
                    }
                    this.f37592d.c(this.f37594f, d(jVar, (int) j12));
                    this.f37593e = 0;
                    return true;
                } else {
                    StringBuilder sb5 = new StringBuilder(32);
                    sb5.append("Invalid element type ");
                    sb5.append(e10);
                    throw j2.a(sb5.toString(), null);
                }
            }
            jVar.m((int) this.f37595g);
            this.f37593e = 0;
        }
    }

    @Override // u8.c
    public void b(u8.b bVar) {
        this.f37592d = bVar;
    }

    @Override // u8.c
    public void reset() {
        this.f37593e = 0;
        this.f37590b.clear();
        this.f37591c.e();
    }
}
