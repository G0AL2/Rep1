package com.chartboost.sdk.impl;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public class i implements SurfaceHolder.Callback {

    /* renamed from: a */
    private MediaPlayer f14052a;

    /* renamed from: b */
    private SurfaceView f14053b;

    /* renamed from: c */
    private j f14054c;

    /* renamed from: d */
    private final Handler f14055d;

    /* renamed from: e */
    private int f14056e;

    /* renamed from: f */
    private SurfaceHolder f14057f;

    /* renamed from: g */
    private boolean f14058g;

    /* renamed from: h */
    private boolean f14059h;

    /* renamed from: i */
    private boolean f14060i;

    /* renamed from: j */
    private boolean f14061j;

    /* renamed from: k */
    private float f14062k;

    /* renamed from: l */
    private RandomAccessFile f14063l;

    /* renamed from: m */
    private long f14064m;

    /* renamed from: n */
    private long f14065n;

    /* renamed from: o */
    private final c f14066o;

    /* renamed from: p */
    private final Runnable f14067p;

    /* renamed from: q */
    private final a f14068q;

    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        a() {
            i.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlayer mediaPlayer = i.this.f14052a;
            if (mediaPlayer == null) {
                return;
            }
            i iVar = i.this;
            iVar.f14056e = mediaPlayer.getCurrentPosition();
            j jVar = iVar.f14054c;
            if (jVar != null) {
                jVar.a(iVar.f14056e);
            }
            iVar.h();
        }

        public String toString() {
            return DownloadWorker.KEY_OUT_PROGRESS;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Runnable {
        b() {
            i.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.b();
        }

        public String toString() {
            return "runCalculateBufferStatus";
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Runnable {
        c() {
            i.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.k();
        }

        public String toString() {
            return "startMediaPlayerWithDelayRunnable";
        }
    }

    public i(MediaPlayer mediaPlayer, SurfaceView surfaceView, j jVar, Handler handler) {
        qe.k.f(handler, "uiHandler");
        this.f14052a = mediaPlayer;
        this.f14053b = surfaceView;
        this.f14054c = jVar;
        this.f14055d = handler;
        this.f14057f = surfaceView == null ? null : surfaceView.getHolder();
        this.f14062k = 0.01f;
        this.f14066o = new c();
        this.f14067p = new b();
        this.f14068q = new a();
    }

    public static /* synthetic */ boolean c(i iVar, MediaPlayer mediaPlayer, int i10, int i11) {
        return a(iVar, mediaPlayer, i10, i11);
    }

    public static /* synthetic */ void d(i iVar, MediaPlayer mediaPlayer) {
        a(iVar, mediaPlayer);
    }

    public static /* synthetic */ boolean e(i iVar, MediaPlayer mediaPlayer, int i10, int i11) {
        return b(iVar, mediaPlayer, i10, i11);
    }

    private final void f() {
        MediaPlayer mediaPlayer = this.f14052a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.f14054c = null;
        this.f14052a = null;
        this.f14057f = null;
        this.f14053b = null;
    }

    public static /* synthetic */ void f(i iVar, MediaPlayer mediaPlayer) {
        b(iVar, mediaPlayer);
    }

    private final void g() {
        this.f14055d.removeCallbacks(this.f14068q);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x001c A[Catch: IOException -> 0x0031, TryCatch #0 {IOException -> 0x0031, blocks: (B:37:0x0003, B:48:0x001c, B:51:0x0022, B:53:0x002b, B:40:0x0008, B:43:0x000f, B:46:0x0015), top: B:63:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002b A[Catch: IOException -> 0x0031, TRY_LEAVE, TryCatch #0 {IOException -> 0x0031, blocks: (B:37:0x0003, B:48:0x001c, B:51:0x0022, B:53:0x002b, B:40:0x0008, B:43:0x000f, B:46:0x0015), top: B:63:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() {
        /*
            r4 = this;
            java.lang.String r0 = "AdsMediaPlayer"
            r1 = 0
            java.io.RandomAccessFile r2 = r4.f14063l     // Catch: java.io.IOException -> L31
            if (r2 != 0) goto L8
            goto L13
        L8:
            java.io.FileDescriptor r2 = r2.getFD()     // Catch: java.io.IOException -> L31
            if (r2 != 0) goto Lf
            goto L13
        Lf:
            android.media.MediaPlayer r3 = r4.f14052a     // Catch: java.io.IOException -> L31
            if (r3 != 0) goto L15
        L13:
            r2 = r1
            goto L1a
        L15:
            r3.setDataSource(r2)     // Catch: java.io.IOException -> L31
            ee.u r2 = ee.u.f29813a     // Catch: java.io.IOException -> L31
        L1a:
            if (r2 != 0) goto L29
            com.chartboost.sdk.impl.j r2 = r4.f14054c     // Catch: java.io.IOException -> L31
            if (r2 != 0) goto L22
            r2 = r1
            goto L29
        L22:
            java.lang.String r3 = "Missing video asset"
            r2.a(r3)     // Catch: java.io.IOException -> L31
            ee.u r2 = ee.u.f29813a     // Catch: java.io.IOException -> L31
        L29:
            if (r2 != 0) goto L4b
            java.lang.String r2 = "MediaPlayer missing callback on error"
            com.chartboost.sdk.Libraries.CBLogging.b(r0, r2)     // Catch: java.io.IOException -> L31
            goto L4b
        L31:
            r2 = move-exception
            com.chartboost.sdk.impl.j r3 = r4.f14054c
            if (r3 != 0) goto L37
            goto L40
        L37:
            java.lang.String r1 = r2.toString()
            r3.a(r1)
            ee.u r1 = ee.u.f29813a
        L40:
            if (r1 != 0) goto L4b
            java.lang.String r1 = "MediaPlayer missing callback on IOException: "
            java.lang.String r1 = qe.k.l(r1, r2)
            com.chartboost.sdk.Libraries.CBLogging.b(r0, r1)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.i.i():void");
    }

    private final void j() {
        MediaPlayer mediaPlayer = this.f14052a;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.chartboost.sdk.impl.w3
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    i.d(i.this, mediaPlayer2);
                }
            });
        }
        MediaPlayer mediaPlayer2 = this.f14052a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.chartboost.sdk.impl.v3
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer3, int i10, int i11) {
                    return i.c(i.this, mediaPlayer3, i10, i11);
                }
            });
        }
        MediaPlayer mediaPlayer3 = this.f14052a;
        if (mediaPlayer3 != null) {
            mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.chartboost.sdk.impl.t3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer4) {
                    i.f(i.this, mediaPlayer4);
                }
            });
        }
        MediaPlayer mediaPlayer4 = this.f14052a;
        if (mediaPlayer4 == null) {
            return;
        }
        mediaPlayer4.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.chartboost.sdk.impl.u3
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer5, int i10, int i11) {
                return i.e(i.this, mediaPlayer5, i10, i11);
            }
        });
    }

    private final void l() {
        this.f14055d.postDelayed(this.f14066o, 500L);
    }

    private final void n() {
        this.f14055d.removeCallbacks(this.f14067p);
        this.f14060i = true;
        MediaPlayer mediaPlayer = this.f14052a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.reset();
        RandomAccessFile randomAccessFile = this.f14063l;
        mediaPlayer.setDataSource(randomAccessFile == null ? null : randomAccessFile.getFD());
        mediaPlayer.prepareAsync();
    }

    public void d() {
        MediaPlayer mediaPlayer = this.f14052a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setVolume(0.0f, 0.0f);
    }

    public void e() {
        if (this.f14059h && this.f14060i) {
            this.f14055d.removeCallbacks(this.f14067p);
            g();
            MediaPlayer mediaPlayer = this.f14052a;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            MediaPlayer mediaPlayer2 = this.f14052a;
            this.f14056e = mediaPlayer2 == null ? 0 : mediaPlayer2.getCurrentPosition();
            this.f14060i = false;
            this.f14061j = true;
        }
    }

    protected final void h() {
        this.f14055d.postDelayed(this.f14068q, 500L);
    }

    protected final void k() {
        MediaPlayer mediaPlayer = this.f14052a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.start();
        h();
        j jVar = this.f14054c;
        if (jVar != null) {
            jVar.a();
        }
        mediaPlayer.seekTo(this.f14056e);
    }

    public void m() {
        if (this.f14059h) {
            this.f14055d.removeCallbacks(this.f14067p);
            this.f14056e = 0;
            g();
            MediaPlayer mediaPlayer = this.f14052a;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            this.f14060i = false;
            this.f14061j = false;
            RandomAccessFile randomAccessFile = this.f14063l;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f14063l = null;
            f();
        }
    }

    public void o() {
        MediaPlayer mediaPlayer = this.f14052a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setVolume(1.0f, 1.0f);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        qe.k.f(surfaceHolder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        qe.k.f(surfaceHolder, "holder");
        if (this.f14061j) {
            MediaPlayer mediaPlayer = this.f14052a;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(surfaceHolder);
            }
            a(false);
            return;
        }
        try {
            j();
            i();
            MediaPlayer mediaPlayer2 = this.f14052a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepareAsync();
            }
            MediaPlayer mediaPlayer3 = this.f14052a;
            if (mediaPlayer3 == null) {
                return;
            }
            mediaPlayer3.setDisplay(surfaceHolder);
        } catch (Exception e10) {
            CBLogging.b("AdsMediaPlayer", qe.k.l("SurfaceCreated exception: ", e10));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        qe.k.f(surfaceHolder, "holder");
        MediaPlayer mediaPlayer = this.f14052a;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setDisplay(null);
    }

    public static final void b(i iVar, MediaPlayer mediaPlayer) {
        qe.k.f(iVar, "this$0");
        if (iVar.f14056e >= mediaPlayer.getDuration() - (mediaPlayer.getDuration() * 0.05d)) {
            j jVar = iVar.f14054c;
            if (jVar == null) {
                return;
            }
            jVar.b();
            return;
        }
        iVar.a();
    }

    public void c(int i10, int i11) {
        CBLogging.b("AdsMediaPlayer", qe.k.l("MediaPlayer error: ", "error: " + i10 + " extra: " + i11));
        if (this.f14059h) {
            a();
        }
    }

    public void a(RandomAccessFile randomAccessFile, long j10) {
        qe.k.f(randomAccessFile, "accessFile");
        if (this.f14052a == null) {
            return;
        }
        this.f14064m = j10;
        this.f14063l = randomAccessFile;
        SurfaceHolder surfaceHolder = this.f14057f;
        if (surfaceHolder == null) {
            return;
        }
        surfaceHolder.addCallback(this);
    }

    private final void c() {
        this.f14055d.postDelayed(this.f14067p, 1000L);
    }

    public static final void a(i iVar, MediaPlayer mediaPlayer) {
        qe.k.f(iVar, "this$0");
        qe.k.e(mediaPlayer, "mp");
        iVar.a(mediaPlayer);
    }

    public static final boolean b(i iVar, MediaPlayer mediaPlayer, int i10, int i11) {
        qe.k.f(iVar, "this$0");
        iVar.c(i10, i11);
        return true;
    }

    public static final boolean a(i iVar, MediaPlayer mediaPlayer, int i10, int i11) {
        qe.k.f(iVar, "this$0");
        if ((i10 == 805 || i10 == 804) && i11 == -1004) {
            iVar.a();
            return true;
        }
        return true;
    }

    public void b(int i10, int i11) {
        a(i11, i10);
    }

    public void a(boolean z10) {
        if (this.f14059h && !this.f14060i) {
            l();
        }
        this.f14060i = true;
        this.f14061j = z10;
    }

    protected final void b() {
        RandomAccessFile randomAccessFile = this.f14063l;
        long length = randomAccessFile == null ? 1L : randomAccessFile.length();
        long j10 = this.f14064m;
        float f10 = ((float) (length - this.f14065n)) / ((float) j10);
        if (length == j10) {
            this.f14065n = 0L;
            n();
        } else if (f10 > this.f14062k) {
            this.f14065n = 0L;
            n();
        } else {
            c();
        }
    }

    public /* synthetic */ i(MediaPlayer mediaPlayer, SurfaceView surfaceView, j jVar, Handler handler, int i10, qe.g gVar) {
        this((i10 & 1) != 0 ? new MediaPlayer() : mediaPlayer, surfaceView, jVar, handler);
    }

    private final void a(MediaPlayer mediaPlayer) {
        this.f14058g = false;
        int duration = mediaPlayer.getDuration();
        SurfaceView surfaceView = this.f14053b;
        int width = surfaceView == null ? 0 : surfaceView.getWidth();
        SurfaceView surfaceView2 = this.f14053b;
        a(width, surfaceView2 != null ? surfaceView2.getHeight() : 0);
        j jVar = this.f14054c;
        if (jVar != null) {
            jVar.b(duration);
        }
        this.f14059h = true;
        a(duration);
        if (this.f14060i) {
            k();
        }
    }

    private final void a(int i10) {
        long j10 = this.f14064m;
        if (j10 <= 0 || i10 <= 0) {
            return;
        }
        float f10 = ((float) j10) / 1000000.0f;
        this.f14062k = ((f10 / 1000.0f) / ((i10 / 60000.0f) * 0.0075f)) / (f10 * 8);
    }

    public void a() {
        if (this.f14058g || !this.f14060i) {
            return;
        }
        if (this.f14065n == 0) {
            RandomAccessFile randomAccessFile = this.f14063l;
            this.f14065n = randomAccessFile != null ? randomAccessFile.length() : 0L;
        }
        this.f14058g = true;
        e();
        c();
    }

    private final void a(int i10, int i11) {
        MediaPlayer mediaPlayer = this.f14052a;
        if (mediaPlayer == null) {
            return;
        }
        qe.k.c(mediaPlayer);
        float videoWidth = mediaPlayer.getVideoWidth();
        MediaPlayer mediaPlayer2 = this.f14052a;
        qe.k.c(mediaPlayer2);
        float videoHeight = mediaPlayer2.getVideoHeight();
        float f10 = i10;
        float f11 = f10 / videoWidth;
        float f12 = i11;
        float f13 = f12 / videoHeight;
        float f14 = videoWidth / videoHeight;
        SurfaceView surfaceView = this.f14053b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (surfaceView == null ? null : surfaceView.getLayoutParams());
        if (layoutParams != null) {
            if (f11 > f13) {
                layoutParams.width = (int) (f12 * f14);
                layoutParams.height = i11;
            } else {
                layoutParams.width = i10;
                layoutParams.height = (int) (f10 / f14);
            }
            layoutParams.gravity = 17;
        }
        SurfaceView surfaceView2 = this.f14053b;
        if (surfaceView2 == null) {
            return;
        }
        surfaceView2.setLayoutParams(layoutParams);
    }
}
