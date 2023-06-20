package ga;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import ea.n0;
import ga.d;
import ga.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: SphericalGLSurfaceView.java */
/* loaded from: classes2.dex */
public final class l extends GLSurfaceView {

    /* renamed from: a */
    private final CopyOnWriteArrayList<b> f30757a;

    /* renamed from: b */
    private final SensorManager f30758b;

    /* renamed from: c */
    private final Sensor f30759c;

    /* renamed from: d */
    private final d f30760d;

    /* renamed from: e */
    private final Handler f30761e;

    /* renamed from: f */
    private final m f30762f;

    /* renamed from: g */
    private final i f30763g;

    /* renamed from: h */
    private SurfaceTexture f30764h;

    /* renamed from: i */
    private Surface f30765i;

    /* renamed from: j */
    private boolean f30766j;

    /* renamed from: k */
    private boolean f30767k;

    /* renamed from: l */
    private boolean f30768l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: classes2.dex */
    public final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* renamed from: a */
        private final i f30769a;

        /* renamed from: d */
        private final float[] f30772d;

        /* renamed from: e */
        private final float[] f30773e;

        /* renamed from: f */
        private final float[] f30774f;

        /* renamed from: g */
        private float f30775g;

        /* renamed from: h */
        private float f30776h;

        /* renamed from: b */
        private final float[] f30770b = new float[16];

        /* renamed from: c */
        private final float[] f30771c = new float[16];

        /* renamed from: i */
        private final float[] f30777i = new float[16];

        /* renamed from: j */
        private final float[] f30778j = new float[16];

        public a(i iVar) {
            l.this = r5;
            float[] fArr = new float[16];
            this.f30772d = fArr;
            float[] fArr2 = new float[16];
            this.f30773e = fArr2;
            float[] fArr3 = new float[16];
            this.f30774f = fArr3;
            this.f30769a = iVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f30776h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f30773e, 0, -this.f30775g, (float) Math.cos(this.f30776h), (float) Math.sin(this.f30776h), 0.0f);
        }

        @Override // ga.d.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f30772d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f30776h = -f10;
            d();
        }

        @Override // ga.m.a
        public synchronized void b(PointF pointF) {
            this.f30775g = pointF.y;
            d();
            Matrix.setRotateM(this.f30774f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f30778j, 0, this.f30772d, 0, this.f30774f, 0);
                Matrix.multiplyMM(this.f30777i, 0, this.f30773e, 0, this.f30778j, 0);
            }
            Matrix.multiplyMM(this.f30771c, 0, this.f30770b, 0, this.f30777i, 0);
            this.f30769a.e(this.f30771c, false);
        }

        @Override // ga.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f30770b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.g(this.f30769a.f());
        }
    }

    /* compiled from: SphericalGLSurfaceView.java */
    /* loaded from: classes2.dex */
    public interface b {
        void x(Surface surface);

        void y(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(l lVar, SurfaceTexture surfaceTexture) {
        lVar.f(surfaceTexture);
    }

    public static /* synthetic */ void b(l lVar) {
        lVar.e();
    }

    public /* synthetic */ void e() {
        Surface surface = this.f30765i;
        if (surface != null) {
            Iterator<b> it = this.f30757a.iterator();
            while (it.hasNext()) {
                it.next().x(surface);
            }
        }
        h(this.f30764h, surface);
        this.f30764h = null;
        this.f30765i = null;
    }

    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f30764h;
        Surface surface = this.f30765i;
        Surface surface2 = new Surface(surfaceTexture);
        this.f30764h = surfaceTexture;
        this.f30765i = surface2;
        Iterator<b> it = this.f30757a.iterator();
        while (it.hasNext()) {
            it.next().y(surface2);
        }
        h(surfaceTexture2, surface);
    }

    public void g(final SurfaceTexture surfaceTexture) {
        this.f30761e.post(new Runnable() { // from class: ga.k
            @Override // java.lang.Runnable
            public final void run() {
                l.a(l.this, surfaceTexture);
            }
        });
    }

    private static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void j() {
        boolean z10 = this.f30766j && this.f30767k;
        Sensor sensor = this.f30759c;
        if (sensor == null || z10 == this.f30768l) {
            return;
        }
        if (z10) {
            this.f30758b.registerListener(this.f30760d, sensor, 0);
        } else {
            this.f30758b.unregisterListener(this.f30760d);
        }
        this.f30768l = z10;
    }

    public void d(b bVar) {
        this.f30757a.add(bVar);
    }

    public ga.a getCameraMotionListener() {
        return this.f30763g;
    }

    public fa.h getVideoFrameMetadataListener() {
        return this.f30763g;
    }

    public Surface getVideoSurface() {
        return this.f30765i;
    }

    public void i(b bVar) {
        this.f30757a.remove(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30761e.post(new Runnable() { // from class: ga.j
            @Override // java.lang.Runnable
            public final void run() {
                l.b(l.this);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f30767k = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f30767k = true;
        j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f30763g.h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f30766j = z10;
        j();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30757a = new CopyOnWriteArrayList<>();
        this.f30761e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) ea.a.e(context.getSystemService("sensor"));
        this.f30758b = sensorManager;
        Sensor defaultSensor = n0.f29709a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f30759c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f30763g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f30762f = mVar;
        this.f30760d = new d(((WindowManager) ea.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f30766j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
