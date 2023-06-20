package ga;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import ea.i0;
import j8.p1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SceneRenderer.java */
/* loaded from: classes2.dex */
public final class i implements fa.h, a {

    /* renamed from: i */
    private int f30749i;

    /* renamed from: j */
    private SurfaceTexture f30750j;

    /* renamed from: m */
    private byte[] f30753m;

    /* renamed from: a */
    private final AtomicBoolean f30741a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f30742b = new AtomicBoolean(true);

    /* renamed from: c */
    private final g f30743c = new g();

    /* renamed from: d */
    private final c f30744d = new c();

    /* renamed from: e */
    private final i0<Long> f30745e = new i0<>();

    /* renamed from: f */
    private final i0<e> f30746f = new i0<>();

    /* renamed from: g */
    private final float[] f30747g = new float[16];

    /* renamed from: h */
    private final float[] f30748h = new float[16];

    /* renamed from: k */
    private volatile int f30751k = 0;

    /* renamed from: l */
    private int f30752l = -1;

    public static /* synthetic */ void d(i iVar, SurfaceTexture surfaceTexture) {
        iVar.g(surfaceTexture);
    }

    public /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f30741a.set(true);
    }

    private void i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f30753m;
        int i11 = this.f30752l;
        this.f30753m = bArr;
        if (i10 == -1) {
            i10 = this.f30751k;
        }
        this.f30752l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f30753m)) {
            return;
        }
        byte[] bArr3 = this.f30753m;
        e a10 = bArr3 != null ? f.a(bArr3, this.f30752l) : null;
        if (a10 == null || !g.c(a10)) {
            a10 = e.b(this.f30752l);
        }
        this.f30746f.a(j10, a10);
    }

    @Override // fa.h
    public void a(long j10, long j11, p1 p1Var, MediaFormat mediaFormat) {
        this.f30745e.a(j11, Long.valueOf(j10));
        i(p1Var.f32719v, p1Var.f32720w, j11);
    }

    @Override // ga.a
    public void b(long j10, float[] fArr) {
        this.f30744d.e(j10, fArr);
    }

    @Override // ga.a
    public void c() {
        this.f30745e.c();
        this.f30744d.d();
        this.f30742b.set(true);
    }

    public void e(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        ea.m.g();
        if (this.f30741a.compareAndSet(true, false)) {
            ((SurfaceTexture) ea.a.e(this.f30750j)).updateTexImage();
            ea.m.g();
            if (this.f30742b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f30747g, 0);
            }
            long timestamp = this.f30750j.getTimestamp();
            Long g10 = this.f30745e.g(timestamp);
            if (g10 != null) {
                this.f30744d.c(this.f30747g, g10.longValue());
            }
            e j10 = this.f30746f.j(timestamp);
            if (j10 != null) {
                this.f30743c.d(j10);
            }
        }
        Matrix.multiplyMM(this.f30748h, 0, fArr, 0, this.f30747g, 0);
        this.f30743c.a(this.f30749i, this.f30748h, z10);
    }

    public SurfaceTexture f() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        ea.m.g();
        this.f30743c.b();
        ea.m.g();
        this.f30749i = ea.m.j();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f30749i);
        this.f30750j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ga.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.d(i.this, surfaceTexture2);
            }
        });
        return this.f30750j;
    }

    public void h(int i10) {
        this.f30751k = i10;
    }
}
