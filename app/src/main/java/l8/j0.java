package l8;

import ea.n0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import l8.f;

/* compiled from: SonicAudioProcessor.java */
/* loaded from: classes2.dex */
public final class j0 implements f {

    /* renamed from: b  reason: collision with root package name */
    private int f33860b;

    /* renamed from: c  reason: collision with root package name */
    private float f33861c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f33862d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private f.a f33863e;

    /* renamed from: f  reason: collision with root package name */
    private f.a f33864f;

    /* renamed from: g  reason: collision with root package name */
    private f.a f33865g;

    /* renamed from: h  reason: collision with root package name */
    private f.a f33866h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f33867i;

    /* renamed from: j  reason: collision with root package name */
    private i0 f33868j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f33869k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f33870l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f33871m;

    /* renamed from: n  reason: collision with root package name */
    private long f33872n;

    /* renamed from: o  reason: collision with root package name */
    private long f33873o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f33874p;

    public j0() {
        f.a aVar = f.a.f33812e;
        this.f33863e = aVar;
        this.f33864f = aVar;
        this.f33865g = aVar;
        this.f33866h = aVar;
        ByteBuffer byteBuffer = f.f33811a;
        this.f33869k = byteBuffer;
        this.f33870l = byteBuffer.asShortBuffer();
        this.f33871m = byteBuffer;
        this.f33860b = -1;
    }

    @Override // l8.f
    public boolean a() {
        return this.f33864f.f33813a != -1 && (Math.abs(this.f33861c - 1.0f) >= 1.0E-4f || Math.abs(this.f33862d - 1.0f) >= 1.0E-4f || this.f33864f.f33813a != this.f33863e.f33813a);
    }

    @Override // l8.f
    public ByteBuffer b() {
        int k10;
        i0 i0Var = this.f33868j;
        if (i0Var != null && (k10 = i0Var.k()) > 0) {
            if (this.f33869k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f33869k = order;
                this.f33870l = order.asShortBuffer();
            } else {
                this.f33869k.clear();
                this.f33870l.clear();
            }
            i0Var.j(this.f33870l);
            this.f33873o += k10;
            this.f33869k.limit(k10);
            this.f33871m = this.f33869k;
        }
        ByteBuffer byteBuffer = this.f33871m;
        this.f33871m = f.f33811a;
        return byteBuffer;
    }

    @Override // l8.f
    public f.a c(f.a aVar) throws f.b {
        if (aVar.f33815c == 2) {
            int i10 = this.f33860b;
            if (i10 == -1) {
                i10 = aVar.f33813a;
            }
            this.f33863e = aVar;
            f.a aVar2 = new f.a(i10, aVar.f33814b, 2);
            this.f33864f = aVar2;
            this.f33867i = true;
            return aVar2;
        }
        throw new f.b(aVar);
    }

    @Override // l8.f
    public boolean d() {
        i0 i0Var;
        return this.f33874p && ((i0Var = this.f33868j) == null || i0Var.k() == 0);
    }

    @Override // l8.f
    public void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f33872n += remaining;
            ((i0) ea.a.e(this.f33868j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // l8.f
    public void f() {
        i0 i0Var = this.f33868j;
        if (i0Var != null) {
            i0Var.s();
        }
        this.f33874p = true;
    }

    @Override // l8.f
    public void flush() {
        if (a()) {
            f.a aVar = this.f33863e;
            this.f33865g = aVar;
            f.a aVar2 = this.f33864f;
            this.f33866h = aVar2;
            if (this.f33867i) {
                this.f33868j = new i0(aVar.f33813a, aVar.f33814b, this.f33861c, this.f33862d, aVar2.f33813a);
            } else {
                i0 i0Var = this.f33868j;
                if (i0Var != null) {
                    i0Var.i();
                }
            }
        }
        this.f33871m = f.f33811a;
        this.f33872n = 0L;
        this.f33873o = 0L;
        this.f33874p = false;
    }

    public long g(long j10) {
        if (this.f33873o >= 1024) {
            long l10 = this.f33872n - ((i0) ea.a.e(this.f33868j)).l();
            int i10 = this.f33866h.f33813a;
            int i11 = this.f33865g.f33813a;
            if (i10 == i11) {
                return n0.O0(j10, l10, this.f33873o);
            }
            return n0.O0(j10, l10 * i10, this.f33873o * i11);
        }
        return (long) (this.f33861c * j10);
    }

    public void h(float f10) {
        if (this.f33862d != f10) {
            this.f33862d = f10;
            this.f33867i = true;
        }
    }

    public void i(float f10) {
        if (this.f33861c != f10) {
            this.f33861c = f10;
            this.f33867i = true;
        }
    }

    @Override // l8.f
    public void reset() {
        this.f33861c = 1.0f;
        this.f33862d = 1.0f;
        f.a aVar = f.a.f33812e;
        this.f33863e = aVar;
        this.f33864f = aVar;
        this.f33865g = aVar;
        this.f33866h = aVar;
        ByteBuffer byteBuffer = f.f33811a;
        this.f33869k = byteBuffer;
        this.f33870l = byteBuffer.asShortBuffer();
        this.f33871m = byteBuffer;
        this.f33860b = -1;
        this.f33867i = false;
        this.f33868j = null;
        this.f33872n = 0L;
        this.f33873o = 0L;
        this.f33874p = false;
    }
}
