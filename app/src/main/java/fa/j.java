package fa;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.video.DummySurface;
import ea.n0;

/* compiled from: VideoFrameReleaseHelper.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a */
    private final fa.d f30239a = new fa.d();

    /* renamed from: b */
    private final b f30240b;

    /* renamed from: c */
    private final e f30241c;

    /* renamed from: d */
    private boolean f30242d;

    /* renamed from: e */
    private Surface f30243e;

    /* renamed from: f */
    private float f30244f;

    /* renamed from: g */
    private float f30245g;

    /* renamed from: h */
    private float f30246h;

    /* renamed from: i */
    private float f30247i;

    /* renamed from: j */
    private int f30248j;

    /* renamed from: k */
    private long f30249k;

    /* renamed from: l */
    private long f30250l;

    /* renamed from: m */
    private long f30251m;

    /* renamed from: n */
    private long f30252n;

    /* renamed from: o */
    private long f30253o;

    /* renamed from: p */
    private long f30254p;

    /* renamed from: q */
    private long f30255q;

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                ea.r.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public interface b {

        /* compiled from: VideoFrameReleaseHelper.java */
        /* loaded from: classes2.dex */
        public interface a {
            void a(Display display);
        }

        void a();

        void b(a aVar);
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final WindowManager f30256a;

        private c(WindowManager windowManager) {
            this.f30256a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // fa.j.b
        public void a() {
        }

        @Override // fa.j.b
        public void b(b.a aVar) {
            aVar.a(this.f30256a.getDefaultDisplay());
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f30257a;

        /* renamed from: b */
        private b.a f30258b;

        private d(DisplayManager displayManager) {
            this.f30257a = displayManager;
        }

        private Display c() {
            return this.f30257a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // fa.j.b
        public void a() {
            this.f30257a.unregisterDisplayListener(this);
            this.f30258b = null;
        }

        @Override // fa.j.b
        public void b(b.a aVar) {
            this.f30258b = aVar;
            this.f30257a.registerDisplayListener(this, n0.w());
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f30258b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoFrameReleaseHelper.java */
    /* loaded from: classes2.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        private static final e f30259f = new e();

        /* renamed from: a */
        public volatile long f30260a = -9223372036854775807L;

        /* renamed from: b */
        private final Handler f30261b;

        /* renamed from: c */
        private final HandlerThread f30262c;

        /* renamed from: d */
        private Choreographer f30263d;

        /* renamed from: e */
        private int f30264e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f30262c = handlerThread;
            handlerThread.start();
            Handler v10 = n0.v(handlerThread.getLooper(), this);
            this.f30261b = v10;
            v10.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f30263d;
            if (choreographer != null) {
                int i10 = this.f30264e + 1;
                this.f30264e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f30263d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                ea.r.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static e d() {
            return f30259f;
        }

        private void f() {
            Choreographer choreographer = this.f30263d;
            if (choreographer != null) {
                int i10 = this.f30264e - 1;
                this.f30264e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f30260a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f30261b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f30260a = j10;
            ((Choreographer) ea.a.e(this.f30263d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f30261b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public j(Context context) {
        b f10 = f(context);
        this.f30240b = f10;
        this.f30241c = f10 != null ? e.d() : null;
        this.f30249k = -9223372036854775807L;
        this.f30250l = -9223372036854775807L;
        this.f30244f = -1.0f;
        this.f30247i = 1.0f;
        this.f30248j = 0;
    }

    public static /* synthetic */ void a(j jVar, Display display) {
        jVar.p(display);
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (n0.f29709a < 30 || (surface = this.f30243e) == null || this.f30248j == Integer.MIN_VALUE || this.f30246h == 0.0f) {
            return;
        }
        this.f30246h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private static b f(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            b d10 = n0.f29709a >= 17 ? d.d(applicationContext) : null;
            return d10 == null ? c.c(applicationContext) : d10;
        }
        return null;
    }

    private void n() {
        this.f30251m = 0L;
        this.f30254p = -1L;
        this.f30252n = -1L;
    }

    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f30249k = refreshRate;
            this.f30250l = (refreshRate * 80) / 100;
            return;
        }
        ea.r.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f30249k = -9223372036854775807L;
        this.f30250l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r8.f30245g) >= (r8.f30239a.e() && (r8.f30239a.d() > 5000000000L ? 1 : (r8.f30239a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005f, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x006a, code lost:
        if (r8.f30239a.c() >= 30) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q() {
        /*
            r8 = this;
            int r0 = ea.n0.f29709a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r8.f30243e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            fa.d r0 = r8.f30239a
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
            fa.d r0 = r8.f30239a
            float r0 = r0.b()
            goto L1d
        L1b:
            float r0 = r8.f30244f
        L1d:
            float r2 = r8.f30245g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            fa.d r1 = r8.f30239a
            boolean r1 = r1.e()
            if (r1 == 0) goto L49
            fa.d r1 = r8.f30239a
            long r1 = r1.d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r8.f30245g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r5 = 0
            goto L6c
        L61:
            if (r6 == 0) goto L64
            goto L6c
        L64:
            fa.d r2 = r8.f30239a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6c:
            if (r5 == 0) goto L73
            r8.f30245g = r0
            r8.r(r4)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.j.q():void");
    }

    private void r(boolean z10) {
        Surface surface;
        if (n0.f29709a < 30 || (surface = this.f30243e) == null || this.f30248j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f30242d) {
            float f11 = this.f30245g;
            if (f11 != -1.0f) {
                f10 = this.f30247i * f11;
            }
        }
        if (z10 || this.f30246h != f10) {
            this.f30246h = f10;
            a.a(surface, f10);
        }
    }

    public long b(long j10) {
        long j11;
        e eVar;
        if (this.f30254p != -1 && this.f30239a.e()) {
            long a10 = this.f30255q + (((float) (this.f30239a.a() * (this.f30251m - this.f30254p))) / this.f30247i);
            if (!c(j10, a10)) {
                n();
            } else {
                j11 = a10;
                this.f30252n = this.f30251m;
                this.f30253o = j11;
                eVar = this.f30241c;
                if (eVar != null || this.f30249k == -9223372036854775807L) {
                    return j11;
                }
                long j12 = eVar.f30260a;
                return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f30249k) - this.f30250l;
            }
        }
        j11 = j10;
        this.f30252n = this.f30251m;
        this.f30253o = j11;
        eVar = this.f30241c;
        if (eVar != null) {
        }
        return j11;
    }

    public void g(float f10) {
        this.f30244f = f10;
        this.f30239a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f30252n;
        if (j11 != -1) {
            this.f30254p = j11;
            this.f30255q = this.f30253o;
        }
        this.f30251m++;
        this.f30239a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f30247i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f30242d = true;
        n();
        if (this.f30240b != null) {
            ((e) ea.a.e(this.f30241c)).a();
            this.f30240b.b(new b.a() { // from class: fa.i
                @Override // fa.j.b.a
                public final void a(Display display) {
                    j.a(j.this, display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f30242d = false;
        b bVar = this.f30240b;
        if (bVar != null) {
            bVar.a();
            ((e) ea.a.e(this.f30241c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof DummySurface) {
            surface = null;
        }
        if (this.f30243e == surface) {
            return;
        }
        d();
        this.f30243e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f30248j == i10) {
            return;
        }
        this.f30248j = i10;
        r(true);
    }
}
