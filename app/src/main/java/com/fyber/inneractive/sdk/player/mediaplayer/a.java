package com.fyber.inneractive.sdk.player.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.n;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a extends MediaPlayer implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f19705a;

    /* renamed from: h  reason: collision with root package name */
    public Handler f19712h;

    /* renamed from: i  reason: collision with root package name */
    public l f19713i;

    /* renamed from: j  reason: collision with root package name */
    public Surface f19714j;

    /* renamed from: k  reason: collision with root package name */
    public SurfaceHolder f19715k;

    /* renamed from: l  reason: collision with root package name */
    public long f19716l;

    /* renamed from: n  reason: collision with root package name */
    public HandlerThread f19718n;

    /* renamed from: o  reason: collision with root package name */
    public Handler f19719o;

    /* renamed from: p  reason: collision with root package name */
    public Runnable f19720p;

    /* renamed from: q  reason: collision with root package name */
    public Runnable f19721q;

    /* renamed from: b  reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.enums.b f19706b = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* renamed from: c  reason: collision with root package name */
    public boolean f19707c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19708d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19709e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19710f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19711g = false;

    /* renamed from: m  reason: collision with root package name */
    public int f19717m = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f19722r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f19723s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f19724t = 0;

    /* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0263a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f19725a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f19726b;

        public RunnableC0263a(int i10, int i11) {
            this.f19725a = i10;
            this.f19726b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f19713i != null) {
                ((com.fyber.inneractive.sdk.player.controller.g) a.this.f19713i).a(new m(String.format(Locale.ENGLISH, "Player Error: %d, %d", Integer.valueOf(this.f19725a), Integer.valueOf(this.f19726b))));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.a(a.this);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAlog.a("%sCannot wait for video size anymore", a.this.c());
            a aVar = a.this;
            if (aVar.f19722r == 0) {
                IAlog.a("%sCannot wait for video size anymore. duration is still 0 - aborting", aVar.c());
                a aVar2 = a.this;
                aVar2.onError(aVar2, 0, 0);
                return;
            }
            IAlog.a("%sCannot wait for video size anymore. moving into ready", aVar.c());
            a.this.f19710f = true;
            a.this.d();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f19730a;

        public d(com.fyber.inneractive.sdk.player.enums.b bVar) {
            this.f19730a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = a.this.f19713i;
            if (lVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.g) lVar).a(this.f19730a);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f19732a;

        public e(SurfaceHolder surfaceHolder) {
            this.f19732a = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.a(a.this, this.f19732a);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Surface f19734a;

        public f(Surface surface) {
            this.f19734a = surface;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.a(a.this, this.f19734a);
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.b(a.this);
            Handler handler = a.this.f19719o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                a.this.f19719o = null;
            }
            a.this.f19718n = null;
            Looper.myLooper().quit();
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.c(a.this);
        }
    }

    /* loaded from: classes2.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.d(a.this);
        }
    }

    /* loaded from: classes2.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            String c10 = aVar.c();
            long currentTimeMillis = System.currentTimeMillis();
            aVar.setVolume(0.0f, 0.0f);
            IAlog.d(c10 + "timelog: mute took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public interface l {
    }

    /* loaded from: classes2.dex */
    public static class m extends Exception {
        public m(String str) {
            super(str);
        }

        public m(Throwable th, String str) {
            super(str, th);
        }
    }

    public a(Context context, l lVar, Handler handler) {
        this.f19705a = context;
        this.f19713i = lVar;
        this.f19712h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        a();
    }

    public static void c(a aVar) {
        String c10 = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = aVar.f19706b;
        if (bVar != com.fyber.inneractive.sdk.player.enums.b.Paused && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared && bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar != com.fyber.inneractive.sdk.player.enums.b.Start_in_progress) {
            IAlog.a("%s Start called in wrong mState! %s", aVar.c(), bVar);
            if (aVar.f19706b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                aVar.f19707c = true;
            }
        } else {
            super.start();
            aVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        }
        IAlog.d(c10 + "timelog: start took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    public static void d(a aVar) {
        String c10 = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            IAlog.a("%s paused called cannot set to pause, canceled", aVar.c());
        }
        IAlog.d(c10 + "timelog: delayed pause took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    public boolean b() {
        return (this.f19706b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.f19706b == com.fyber.inneractive.sdk.player.enums.b.Preparing) ? false : true;
    }

    public void e() {
        this.f19708d = true;
        if (b()) {
            a(new k());
        } else {
            IAlog.a("%s mute called when player is not ready!", c());
        }
        IAlog.a("%s mute", c());
    }

    public final void f() {
        String c10 = c();
        long currentTimeMillis = System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = this.f19706b;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Idle;
        if (bVar == bVar2) {
            IAlog.a("%s reset called, but player is already resetted. Do nothing", c());
            return;
        }
        a(bVar2);
        try {
            super.reset();
        } catch (Exception unused) {
        }
        IAlog.d(c10 + "timelog: reset took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    @Override // android.media.MediaPlayer
    public int getCurrentPosition() {
        if (b()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public int getDuration() {
        return this.f19722r;
    }

    @Override // android.media.MediaPlayer
    public int getVideoHeight() {
        return this.f19724t;
    }

    @Override // android.media.MediaPlayer
    public int getVideoWidth() {
        return this.f19723s;
    }

    @Override // android.media.MediaPlayer
    public boolean isPlaying() {
        return b() && this.f19706b != com.fyber.inneractive.sdk.player.enums.b.Paused && super.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        a(com.fyber.inneractive.sdk.player.enums.b.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.e("%s onError code = %d code2 = %d", c(), Integer.valueOf(i10), Integer.valueOf(i11));
        f();
        this.f19712h.post(new RunnableC0263a(i10, i11));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("%s onPrepared %s gotPrepared = %s", c(), this, Boolean.valueOf(this.f19711g));
        IAlog.a("%sMedia prepare time took %d msec", c(), Long.valueOf(System.currentTimeMillis() - this.f19716l));
        if (this.f19706b != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.f19706b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.e("%s onPrepared: previous error encountered. Aborting", c());
        } else if (this.f19711g) {
            IAlog.a("%s onPrepared called again??? We are already prepared", c());
        } else {
            this.f19711g = true;
            d();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        IAlog.a("%s onSeekComplete called current position = %d", c(), Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.f19706b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            IAlog.a("%s onSeekComplete called when Story is not seeking", c());
            return;
        }
        if (this.f19708d) {
            e();
        }
        if (this.f19707c) {
            IAlog.a("%s onSeekComplete mPlayAfterSeek = true", c());
            this.f19706b = com.fyber.inneractive.sdk.player.enums.b.Paused;
            start();
            return;
        }
        IAlog.a("%s onSeekComplete mPlayAfterSeek = false", c());
        a(com.fyber.inneractive.sdk.player.enums.b.Paused);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.a("%s onVideoSizeChanged %d, %d", c(), Integer.valueOf(i10), Integer.valueOf(i11));
        if (this.f19710f) {
            return;
        }
        Runnable runnable = this.f19720p;
        if (runnable != null) {
            n.f20310b.removeCallbacks(runnable);
            IAlog.a("%s onVideoSizeChanged cancelling prepared runnable", c());
        }
        this.f19710f = true;
        if (i10 != 0 && i11 != 0) {
            IAlog.a("%sMedia got video size time took %d msec", c(), Long.valueOf(System.currentTimeMillis() - this.f19716l));
            this.f19723s = i10;
            this.f19724t = i11;
            d();
            return;
        }
        IAlog.e("%s onVideoSizeChanged - Invalid video size!", c());
        onError(this, 0, 0);
    }

    @Override // android.media.MediaPlayer
    public void pause() {
        if (this.f19706b != com.fyber.inneractive.sdk.player.enums.b.Idle && this.f19706b != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f19706b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Paused;
            if (bVar != bVar2 && this.f19706b != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                a(bVar2);
                if (b()) {
                    a(new j());
                } else {
                    IAlog.a("%s paused called when player is not ready!", c());
                }
                IAlog.a("%s pause", c());
                return;
            }
        }
        IAlog.a("%s paused called when player is in mState: %s ignoring", c(), this.f19706b);
    }

    @Override // android.media.MediaPlayer
    public void release() {
        if (!this.f19709e) {
            a(new g());
        }
        this.f19713i = null;
        this.f19721q = null;
        this.f19709e = true;
        IAlog.a("%s release called", c());
    }

    @Override // android.media.MediaPlayer
    public void reset() {
        IAlog.a("%s reset called", c());
        Runnable runnable = this.f19720p;
        if (runnable != null) {
            n.f20310b.removeCallbacks(runnable);
        }
        a(new h());
    }

    @Override // android.media.MediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        IAlog.a("%s setDisplay called", c());
        if (!b()) {
            IAlog.a("%s setDisplay called when player is not ready!", c());
            return;
        }
        SurfaceHolder surfaceHolder2 = this.f19715k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            IAlog.a("%s setDisplay called with existing surface. ignoring!", c());
            return;
        }
        this.f19715k = surfaceHolder;
        a(new e(surfaceHolder));
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public void setSurface(Surface surface) {
        IAlog.a("%s setSurface called", c());
        Surface surface2 = this.f19714j;
        if (surface2 != null && surface2.equals(surface)) {
            IAlog.a("%s setSurface called with existing surface. ignoring!", c());
            return;
        }
        this.f19714j = surface;
        a(new f(surface));
    }

    @Override // android.media.MediaPlayer
    public void start() {
        IAlog.a("%s Start called", c());
        if (!b()) {
            IAlog.a("%s MediaPlayer: Start called when player is not ready! - mState = %s", c(), this.f19706b);
        } else if (this.f19706b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            this.f19707c = true;
        } else if (isPlaying()) {
            IAlog.a("%s MediaPlayer: Start called when player is already playing. do nothing", c());
        } else {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            a(new i());
        }
    }

    @Override // android.media.MediaPlayer
    public void stop() {
        String c10 = c();
        long currentTimeMillis = System.currentTimeMillis();
        if (b()) {
            super.stop();
        }
        IAlog.a("%s stop called", c());
        IAlog.d(c10 + "timelog: stop took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    public static void b(a aVar) {
        String c10 = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        super.release();
        IAlog.d(c10 + "timelog: release took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }

    public void a(String str) {
        String c10 = c();
        long currentTimeMillis = System.currentTimeMillis();
        this.f19710f = false;
        this.f19711g = false;
        if (isPlaying()) {
            IAlog.a("%s loadUri stopping play before refresh", c());
            stop();
        }
        this.f19716l = System.currentTimeMillis();
        f();
        IAlog.a("%s calling setDataSource with %s", c(), str);
        try {
            setDataSource(str);
            IAlog.a("%s setDataSource succeeded, calling prepareAsync", c());
            a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
            try {
                prepareAsync();
            } catch (IllegalStateException e10) {
                IAlog.b("%s prepareAsync failed with illegal mState exception: %s", c(), e10.getMessage());
                this.f19717m++;
                if (this.f19717m < 5) {
                    a(str);
                }
                this.f19717m = 0;
            }
            IAlog.d(c10 + "timelog: loadUri took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception e11) {
            IAlog.b("%s error setting data source %s", c(), str);
            IAlog.b("%s exception message: %s", c(), e11.getMessage());
        }
    }

    public final void b(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (this.f19706b == bVar) {
            IAlog.a("%s updatePlayerState - mState didn't change!", c());
            return;
        }
        IAlog.a("%s updatePlayerState - changing from %s to %s", c(), this.f19706b, bVar);
        this.f19706b = bVar;
        this.f19712h.post(new d(bVar));
    }

    public final void d() {
        if (this.f19711g) {
            if (this.f19710f) {
                IAlog.a("%sMedia load time took %d msec", c(), Long.valueOf(System.currentTimeMillis() - this.f19716l));
                this.f19722r = super.getDuration();
                a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                if (this.f19708d) {
                    e();
                    return;
                }
                return;
            }
            IAlog.a("%sGot prepared only, waiting for video size", c());
            if (this.f19720p == null) {
                this.f19720p = new c();
            }
            n.f20310b.postDelayed(this.f19720p, Constants.MIN_PROGRESS_TIME);
        }
    }

    public final String c() {
        return "mp(" + this + "): T:" + Thread.currentThread().getId() + Constants.FILENAME_SEQUENCE_SEPARATOR + Thread.currentThread().getName() + ": ";
    }

    public final void a() {
        HandlerThread handlerThread = new HandlerThread("MP-Worker");
        this.f19718n = handlerThread;
        handlerThread.start();
        this.f19719o = new Handler(this.f19718n.getLooper());
        this.f19721q = new b();
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%s updatePlayerState - %s", c(), bVar);
        synchronized (this.f19706b) {
            b(bVar);
        }
    }

    public static void a(a aVar, Surface surface) {
        String c10 = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setSurface called with %s", aVar.c(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                IAlog.a("%s setSurface with null! current surface cleared", aVar.c());
            } else {
                IAlog.a("%s setSurface - replacing surface!", aVar.c());
            }
            IAlog.d(c10 + "timelog: setSurface took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setSurface threw exception!", aVar.c());
        }
    }

    public static void a(a aVar, SurfaceHolder surfaceHolder) {
        String c10 = aVar.c();
        long currentTimeMillis = System.currentTimeMillis();
        IAlog.a("%s setDisplay called with %s", aVar.c(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                IAlog.a("%s setDisplay with null! current display cleared", aVar.c());
            } else {
                IAlog.a("%s setDisplay - replacing surface holder!", aVar.c());
            }
            IAlog.d(c10 + "timelog: setDisplayInternal took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
        } catch (Exception unused) {
            IAlog.a("%s super.setDisplay threw exception!", aVar.c());
        }
    }

    public final void a(Runnable runnable) {
        Handler handler;
        Handler handler2;
        HandlerThread handlerThread = this.f19718n;
        if (handlerThread != null && handlerThread.isAlive() && !this.f19718n.isInterrupted() && (handler2 = this.f19719o) != null) {
            handler2.post(runnable);
        }
        if ((this.f19723s == 0 || this.f19724t == 0 || this.f19722r == 0) && (handler = this.f19719o) != null) {
            handler.post(this.f19721q);
        }
    }

    public static void a(a aVar) {
        if (aVar.b()) {
            aVar.f19723s = super.getVideoWidth();
            aVar.f19724t = super.getVideoHeight();
            aVar.f19722r = super.getDuration();
        }
    }
}
