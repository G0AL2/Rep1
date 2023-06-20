package w5;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import y3.k;
import y3.n;

/* compiled from: EncodedImage.java */
/* loaded from: classes.dex */
public class e implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    private static boolean f38208m;

    /* renamed from: a  reason: collision with root package name */
    private final c4.a<b4.g> f38209a;

    /* renamed from: b  reason: collision with root package name */
    private final n<FileInputStream> f38210b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.imageformat.c f38211c;

    /* renamed from: d  reason: collision with root package name */
    private int f38212d;

    /* renamed from: e  reason: collision with root package name */
    private int f38213e;

    /* renamed from: f  reason: collision with root package name */
    private int f38214f;

    /* renamed from: g  reason: collision with root package name */
    private int f38215g;

    /* renamed from: h  reason: collision with root package name */
    private int f38216h;

    /* renamed from: i  reason: collision with root package name */
    private int f38217i;

    /* renamed from: j  reason: collision with root package name */
    private q5.a f38218j;

    /* renamed from: k  reason: collision with root package name */
    private ColorSpace f38219k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f38220l;

    public e(c4.a<b4.g> aVar) {
        this.f38211c = com.facebook.imageformat.c.f14812b;
        this.f38212d = -1;
        this.f38213e = 0;
        this.f38214f = -1;
        this.f38215g = -1;
        this.f38216h = 1;
        this.f38217i = -1;
        k.b(Boolean.valueOf(c4.a.C(aVar)));
        this.f38209a = aVar.clone();
        this.f38210b = null;
    }

    private com.facebook.imageutils.b C0() {
        InputStream inputStream;
        try {
            inputStream = C();
            try {
                com.facebook.imageutils.b b10 = com.facebook.imageutils.a.b(inputStream);
                this.f38219k = b10.a();
                Pair<Integer, Integer> b11 = b10.b();
                if (b11 != null) {
                    this.f38214f = ((Integer) b11.first).intValue();
                    this.f38215g = ((Integer) b11.second).intValue();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b10;
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private Pair<Integer, Integer> E0() {
        Pair<Integer, Integer> g10 = com.facebook.imageutils.f.g(C());
        if (g10 != null) {
            this.f38214f = ((Integer) g10.first).intValue();
            this.f38215g = ((Integer) g10.second).intValue();
        }
        return g10;
    }

    public static e b(e eVar) {
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static void d(e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    private void g0() {
        Pair<Integer, Integer> b10;
        com.facebook.imageformat.c c10 = com.facebook.imageformat.d.c(C());
        this.f38211c = c10;
        if (com.facebook.imageformat.b.b(c10)) {
            b10 = E0();
        } else {
            b10 = C0().b();
        }
        if (c10 == com.facebook.imageformat.b.f14800a && this.f38212d == -1) {
            if (b10 != null) {
                int b11 = com.facebook.imageutils.c.b(C());
                this.f38213e = b11;
                this.f38212d = com.facebook.imageutils.c.a(b11);
            }
        } else if (c10 == com.facebook.imageformat.b.f14810k && this.f38212d == -1) {
            int a10 = HeifExifUtil.a(C());
            this.f38213e = a10;
            this.f38212d = com.facebook.imageutils.c.a(a10);
        } else if (this.f38212d == -1) {
            this.f38212d = 0;
        }
    }

    public static boolean m0(e eVar) {
        return eVar.f38212d >= 0 && eVar.f38214f >= 0 && eVar.f38215g >= 0;
    }

    public static boolean r0(e eVar) {
        return eVar != null && eVar.q0();
    }

    private void z0() {
        if (this.f38214f < 0 || this.f38215g < 0) {
            s0();
        }
    }

    public com.facebook.imageformat.c A() {
        z0();
        return this.f38211c;
    }

    public InputStream C() {
        n<FileInputStream> nVar = this.f38210b;
        if (nVar != null) {
            return nVar.get();
        }
        c4.a q10 = c4.a.q(this.f38209a);
        if (q10 != null) {
            try {
                return new b4.i((b4.g) q10.y());
            } finally {
                c4.a.w(q10);
            }
        }
        return null;
    }

    public void H0(q5.a aVar) {
        this.f38218j = aVar;
    }

    public void K0(int i10) {
        this.f38213e = i10;
    }

    public InputStream L() {
        return (InputStream) k.g(C());
    }

    public void N0(int i10) {
        this.f38215g = i10;
    }

    public int O() {
        z0();
        return this.f38212d;
    }

    public void Q0(com.facebook.imageformat.c cVar) {
        this.f38211c = cVar;
    }

    public int T() {
        return this.f38216h;
    }

    public void T0(int i10) {
        this.f38212d = i10;
    }

    public int U() {
        c4.a<b4.g> aVar = this.f38209a;
        if (aVar != null && aVar.y() != null) {
            return this.f38209a.y().size();
        }
        return this.f38217i;
    }

    public void U0(int i10) {
        this.f38216h = i10;
    }

    public void X0(int i10) {
        this.f38214f = i10;
    }

    public int Z() {
        z0();
        return this.f38214f;
    }

    public e a() {
        e eVar;
        n<FileInputStream> nVar = this.f38210b;
        if (nVar != null) {
            eVar = new e(nVar, this.f38217i);
        } else {
            c4.a q10 = c4.a.q(this.f38209a);
            if (q10 == null) {
                eVar = null;
            } else {
                try {
                    eVar = new e(q10);
                } finally {
                    c4.a.w(q10);
                }
            }
        }
        if (eVar != null) {
            eVar.e(this);
        }
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c4.a.w(this.f38209a);
    }

    protected boolean d0() {
        return this.f38220l;
    }

    public void e(e eVar) {
        this.f38211c = eVar.A();
        this.f38214f = eVar.Z();
        this.f38215g = eVar.z();
        this.f38212d = eVar.O();
        this.f38213e = eVar.w();
        this.f38216h = eVar.T();
        this.f38217i = eVar.U();
        this.f38218j = eVar.l();
        this.f38219k = eVar.q();
        this.f38220l = eVar.d0();
    }

    public c4.a<b4.g> h() {
        return c4.a.q(this.f38209a);
    }

    public boolean h0(int i10) {
        com.facebook.imageformat.c cVar = this.f38211c;
        if ((cVar == com.facebook.imageformat.b.f14800a || cVar == com.facebook.imageformat.b.f14811l) && this.f38210b == null) {
            k.g(this.f38209a);
            b4.g y10 = this.f38209a.y();
            return y10.f(i10 + (-2)) == -1 && y10.f(i10 - 1) == -39;
        }
        return true;
    }

    public q5.a l() {
        return this.f38218j;
    }

    public ColorSpace q() {
        z0();
        return this.f38219k;
    }

    public synchronized boolean q0() {
        boolean z10;
        if (!c4.a.C(this.f38209a)) {
            z10 = this.f38210b != null;
        }
        return z10;
    }

    public void s0() {
        if (!f38208m) {
            g0();
        } else if (this.f38220l) {
        } else {
            g0();
            this.f38220l = true;
        }
    }

    public int w() {
        z0();
        return this.f38213e;
    }

    public String y(int i10) {
        c4.a<b4.g> h10 = h();
        if (h10 == null) {
            return "";
        }
        int min = Math.min(U(), i10);
        byte[] bArr = new byte[min];
        try {
            b4.g y10 = h10.y();
            if (y10 == null) {
                return "";
            }
            y10.c(0, bArr, 0, min);
            h10.close();
            StringBuilder sb2 = new StringBuilder(min * 2);
            for (int i11 = 0; i11 < min; i11++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i11])));
            }
            return sb2.toString();
        } finally {
            h10.close();
        }
    }

    public int z() {
        z0();
        return this.f38215g;
    }

    public e(n<FileInputStream> nVar) {
        this.f38211c = com.facebook.imageformat.c.f14812b;
        this.f38212d = -1;
        this.f38213e = 0;
        this.f38214f = -1;
        this.f38215g = -1;
        this.f38216h = 1;
        this.f38217i = -1;
        k.g(nVar);
        this.f38209a = null;
        this.f38210b = nVar;
    }

    public e(n<FileInputStream> nVar, int i10) {
        this(nVar);
        this.f38217i = i10;
    }
}
