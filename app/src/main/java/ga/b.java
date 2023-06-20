package ga;

import ea.a0;
import ea.n0;
import j8.n;
import j8.p1;
import j8.x2;
import java.nio.ByteBuffer;

/* compiled from: CameraMotionRenderer.java */
/* loaded from: classes2.dex */
public final class b extends j8.f {

    /* renamed from: m  reason: collision with root package name */
    private final m8.g f30697m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f30698n;

    /* renamed from: o  reason: collision with root package name */
    private long f30699o;

    /* renamed from: p  reason: collision with root package name */
    private a f30700p;

    /* renamed from: q  reason: collision with root package name */
    private long f30701q;

    public b() {
        super(6);
        this.f30697m = new m8.g(1);
        this.f30698n = new a0();
    }

    private float[] O(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f30698n.N(byteBuffer.array(), byteBuffer.limit());
        this.f30698n.P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f30698n.q());
        }
        return fArr;
    }

    private void P() {
        a aVar = this.f30700p;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // j8.f
    protected void E() {
        P();
    }

    @Override // j8.f
    protected void G(long j10, boolean z10) {
        this.f30701q = Long.MIN_VALUE;
        P();
    }

    @Override // j8.f
    protected void K(p1[] p1VarArr, long j10, long j11) {
        this.f30699o = j11;
    }

    @Override // j8.y2
    public int a(p1 p1Var) {
        if ("application/x-camera-motion".equals(p1Var.f32709l)) {
            return x2.a(4);
        }
        return x2.a(0);
    }

    @Override // j8.w2
    public boolean d() {
        return g();
    }

    @Override // j8.w2, j8.y2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // j8.w2
    public boolean isReady() {
        return true;
    }

    @Override // j8.f, j8.r2.b
    public void k(int i10, Object obj) throws n {
        if (i10 == 8) {
            this.f30700p = (a) obj;
        } else {
            super.k(i10, obj);
        }
    }

    @Override // j8.w2
    public void r(long j10, long j11) {
        while (!g() && this.f30701q < 100000 + j10) {
            this.f30697m.g();
            if (L(z(), this.f30697m, 0) != -4 || this.f30697m.l()) {
                return;
            }
            m8.g gVar = this.f30697m;
            this.f30701q = gVar.f34292e;
            if (this.f30700p != null && !gVar.k()) {
                this.f30697m.q();
                float[] O = O((ByteBuffer) n0.j(this.f30697m.f34290c));
                if (O != null) {
                    ((a) n0.j(this.f30700p)).b(this.f30701q - this.f30699o, O);
                }
            }
        }
    }
}
