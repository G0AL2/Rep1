package i9;

import da.b;
import i9.n0;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p8.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SampleDataQueue.java */
/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final da.b f31697a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31698b;

    /* renamed from: c  reason: collision with root package name */
    private final ea.a0 f31699c;

    /* renamed from: d  reason: collision with root package name */
    private a f31700d;

    /* renamed from: e  reason: collision with root package name */
    private a f31701e;

    /* renamed from: f  reason: collision with root package name */
    private a f31702f;

    /* renamed from: g  reason: collision with root package name */
    private long f31703g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SampleDataQueue.java */
    /* loaded from: classes2.dex */
    public static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public long f31704a;

        /* renamed from: b  reason: collision with root package name */
        public long f31705b;

        /* renamed from: c  reason: collision with root package name */
        public da.a f31706c;

        /* renamed from: d  reason: collision with root package name */
        public a f31707d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // da.b.a
        public da.a a() {
            return (da.a) ea.a.e(this.f31706c);
        }

        public a b() {
            this.f31706c = null;
            a aVar = this.f31707d;
            this.f31707d = null;
            return aVar;
        }

        public void c(da.a aVar, a aVar2) {
            this.f31706c = aVar;
            this.f31707d = aVar2;
        }

        public void d(long j10, int i10) {
            ea.a.f(this.f31706c == null);
            this.f31704a = j10;
            this.f31705b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f31704a)) + this.f31706c.f29119b;
        }

        @Override // da.b.a
        public b.a next() {
            a aVar = this.f31707d;
            if (aVar == null || aVar.f31706c == null) {
                return null;
            }
            return aVar;
        }
    }

    public l0(da.b bVar) {
        this.f31697a = bVar;
        int f10 = bVar.f();
        this.f31698b = f10;
        this.f31699c = new ea.a0(32);
        a aVar = new a(0L, f10);
        this.f31700d = aVar;
        this.f31701e = aVar;
        this.f31702f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f31706c == null) {
            return;
        }
        this.f31697a.b(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f31705b) {
            aVar = aVar.f31707d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f31703g + i10;
        this.f31703g = j10;
        a aVar = this.f31702f;
        if (j10 == aVar.f31705b) {
            this.f31702f = aVar.f31707d;
        }
    }

    private int h(int i10) {
        a aVar = this.f31702f;
        if (aVar.f31706c == null) {
            aVar.c(this.f31697a.a(), new a(this.f31702f.f31705b, this.f31698b));
        }
        return Math.min(i10, (int) (this.f31702f.f31705b - this.f31703g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f31705b - j10));
            byteBuffer.put(d10.f31706c.f29118a, d10.e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == d10.f31705b) {
                d10 = d10.f31707d;
            }
        }
        return d10;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f31705b - j10));
            System.arraycopy(d10.f31706c.f29118a, d10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == d10.f31705b) {
                d10 = d10.f31707d;
            }
        }
        return d10;
    }

    private static a k(a aVar, m8.g gVar, n0.b bVar, ea.a0 a0Var) {
        int i10;
        long j10 = bVar.f31743b;
        a0Var.L(1);
        a j11 = j(aVar, j10, a0Var.d(), 1);
        long j12 = j10 + 1;
        byte b10 = a0Var.d()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        m8.c cVar = gVar.f34289b;
        byte[] bArr = cVar.f34265a;
        if (bArr == null) {
            cVar.f34265a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j13 = j(j11, j12, cVar.f34265a, i11);
        long j14 = j12 + i11;
        if (z10) {
            a0Var.L(2);
            j13 = j(j13, j14, a0Var.d(), 2);
            j14 += 2;
            i10 = a0Var.J();
        } else {
            i10 = 1;
        }
        int[] iArr = cVar.f34268d;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f34269e;
        if (iArr3 == null || iArr3.length < i10) {
            iArr3 = new int[i10];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i10 * 6;
            a0Var.L(i12);
            j13 = j(j13, j14, a0Var.d(), i12);
            j14 += i12;
            a0Var.P(0);
            for (int i13 = 0; i13 < i10; i13++) {
                iArr2[i13] = a0Var.J();
                iArr4[i13] = a0Var.H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f31742a - ((int) (j14 - bVar.f31743b));
        }
        a0.a aVar2 = (a0.a) ea.n0.j(bVar.f31744c);
        cVar.c(i10, iArr2, iArr4, aVar2.f35612b, cVar.f34265a, aVar2.f35611a, aVar2.f35613c, aVar2.f35614d);
        long j15 = bVar.f31743b;
        int i14 = (int) (j14 - j15);
        bVar.f31743b = j15 + i14;
        bVar.f31742a -= i14;
        return j13;
    }

    private static a l(a aVar, m8.g gVar, n0.b bVar, ea.a0 a0Var) {
        if (gVar.r()) {
            aVar = k(aVar, gVar, bVar, a0Var);
        }
        if (gVar.j()) {
            a0Var.L(4);
            a j10 = j(aVar, bVar.f31743b, a0Var.d(), 4);
            int H = a0Var.H();
            bVar.f31743b += 4;
            bVar.f31742a -= 4;
            gVar.p(H);
            a i10 = i(j10, bVar.f31743b, gVar.f34290c, H);
            bVar.f31743b += H;
            int i11 = bVar.f31742a - H;
            bVar.f31742a = i11;
            gVar.t(i11);
            return i(i10, bVar.f31743b, gVar.f34293f, bVar.f31742a);
        }
        gVar.p(bVar.f31742a);
        return i(aVar, bVar.f31743b, gVar.f34290c, bVar.f31742a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f31700d;
            if (j10 < aVar.f31705b) {
                break;
            }
            this.f31697a.d(aVar.f31706c);
            this.f31700d = this.f31700d.b();
        }
        if (this.f31701e.f31704a < aVar.f31704a) {
            this.f31701e = aVar;
        }
    }

    public void c(long j10) {
        ea.a.a(j10 <= this.f31703g);
        this.f31703g = j10;
        if (j10 != 0) {
            a aVar = this.f31700d;
            if (j10 != aVar.f31704a) {
                while (this.f31703g > aVar.f31705b) {
                    aVar = aVar.f31707d;
                }
                a aVar2 = (a) ea.a.e(aVar.f31707d);
                a(aVar2);
                a aVar3 = new a(aVar.f31705b, this.f31698b);
                aVar.f31707d = aVar3;
                if (this.f31703g == aVar.f31705b) {
                    aVar = aVar3;
                }
                this.f31702f = aVar;
                if (this.f31701e == aVar2) {
                    this.f31701e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f31700d);
        a aVar4 = new a(this.f31703g, this.f31698b);
        this.f31700d = aVar4;
        this.f31701e = aVar4;
        this.f31702f = aVar4;
    }

    public long e() {
        return this.f31703g;
    }

    public void f(m8.g gVar, n0.b bVar) {
        l(this.f31701e, gVar, bVar, this.f31699c);
    }

    public void m(m8.g gVar, n0.b bVar) {
        this.f31701e = l(this.f31701e, gVar, bVar, this.f31699c);
    }

    public void n() {
        a(this.f31700d);
        this.f31700d.d(0L, this.f31698b);
        a aVar = this.f31700d;
        this.f31701e = aVar;
        this.f31702f = aVar;
        this.f31703g = 0L;
        this.f31697a.e();
    }

    public void o() {
        this.f31701e = this.f31700d;
    }

    public int p(da.i iVar, int i10, boolean z10) throws IOException {
        int h10 = h(i10);
        a aVar = this.f31702f;
        int c10 = iVar.c(aVar.f31706c.f29118a, aVar.e(this.f31703g), h10);
        if (c10 != -1) {
            g(c10);
            return c10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void q(ea.a0 a0Var, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f31702f;
            a0Var.j(aVar.f31706c.f29118a, aVar.e(this.f31703g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
