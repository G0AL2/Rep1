package ea;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* compiled from: EGLSurfaceTexture.java */
/* loaded from: classes2.dex */
public final class i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f29681h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a  reason: collision with root package name */
    private final Handler f29682a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f29683b;

    /* renamed from: c  reason: collision with root package name */
    private final c f29684c;

    /* renamed from: d  reason: collision with root package name */
    private EGLDisplay f29685d;

    /* renamed from: e  reason: collision with root package name */
    private EGLContext f29686e;

    /* renamed from: f  reason: collision with root package name */
    private EGLSurface f29687f;

    /* renamed from: g  reason: collision with root package name */
    private SurfaceTexture f29688g;

    /* compiled from: EGLSurfaceTexture.java */
    /* loaded from: classes2.dex */
    public static final class b extends RuntimeException {
        private b(String str) {
            super(str);
        }
    }

    /* compiled from: EGLSurfaceTexture.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    public i(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f29681h, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new b(n0.C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    private void d() {
        c cVar = this.f29684c;
        if (cVar != null) {
            cVar.a();
        }
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        m.g();
    }

    private static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new b("eglInitialize failed");
        }
        throw new b("eglGetDisplay failed");
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) ea.a.e(this.f29688g);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.f29685d = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f29685d, a10, i10);
        this.f29686e = b10;
        this.f29687f = c(this.f29685d, a10, b10, i10);
        e(this.f29683b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f29683b[0]);
        this.f29688g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public void i() {
        this.f29682a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f29688g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f29683b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f29685d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f29685d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f29687f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f29685d, this.f29687f);
            }
            EGLContext eGLContext = this.f29686e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f29685d, eGLContext);
            }
            if (n0.f29709a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f29685d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f29685d);
            }
            this.f29685d = null;
            this.f29686e = null;
            this.f29687f = null;
            this.f29688g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f29682a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f29688g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public i(Handler handler, c cVar) {
        this.f29682a = handler;
        this.f29684c = cVar;
        this.f29683b = new int[1];
    }
}
