package g3;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: AndroidMediaPlayer.java */
/* loaded from: classes.dex */
public class b extends g3.a {

    /* renamed from: i  reason: collision with root package name */
    private final MediaPlayer f30537i;

    /* renamed from: j  reason: collision with root package name */
    private final a f30538j;

    /* renamed from: k  reason: collision with root package name */
    private v2.a f30539k;

    /* renamed from: l  reason: collision with root package name */
    private Surface f30540l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f30541m;

    /* renamed from: n  reason: collision with root package name */
    private volatile boolean f30542n;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidMediaPlayer.java */
    /* loaded from: classes.dex */
    public static class a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<b> f30543a;

        public a(b bVar) {
            this.f30543a = new WeakReference<>(bVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                b bVar = this.f30543a.get();
                if (bVar != null) {
                    bVar.p(i10);
                }
            } catch (Throwable th) {
                o3.c.m("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: ", th);
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                b bVar = this.f30543a.get();
                if (bVar != null) {
                    bVar.u();
                }
            } catch (Throwable th) {
                o3.c.m("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onCompletion error: ", th);
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                o3.c.j("CSJ_VIDEO", "onError: ", Integer.valueOf(i10), Integer.valueOf(i11));
                b bVar = this.f30543a.get();
                if (bVar != null) {
                    return bVar.r(i10, i11);
                }
                return false;
            } catch (Throwable th) {
                o3.c.m("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onError error: ", th);
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                o3.c.h("CSJ_VIDEO", "onInfo: ");
                b bVar = this.f30543a.get();
                if (bVar != null) {
                    return bVar.t(i10, i11);
                }
                return false;
            } catch (Throwable th) {
                o3.c.m("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onInfo error: ", th);
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                b bVar = this.f30543a.get();
                if (bVar != null) {
                    bVar.s();
                }
            } catch (Throwable th) {
                o3.c.m("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onPrepared error: ", th);
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                b bVar = this.f30543a.get();
                if (bVar != null) {
                    bVar.v();
                }
            } catch (Throwable th) {
                o3.c.m("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onSeekComplete error: ", th);
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                b bVar = this.f30543a.get();
                if (bVar != null) {
                    bVar.q(i10, i11, 1, 1);
                }
            } catch (Throwable th) {
                o3.c.m("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: ", th);
            }
        }
    }

    public b() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f30541m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f30537i = mediaPlayer;
        }
        w(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable th) {
            o3.c.m("CSJ_VIDEO", "setAudioStreamType error: ", th);
        }
        this.f30538j = new a(this);
        y();
    }

    private void w(MediaPlayer mediaPlayer) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(i3.b.a(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, new Handler());
            declaredField.setAccessible(false);
            mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
        } catch (Throwable th) {
            o3.c.m("CSJ_VIDEO", "setSubtitleController error: ", th);
        }
    }

    private void x() {
        v2.a aVar;
        if (Build.VERSION.SDK_INT < 23 || (aVar = this.f30539k) == null) {
            return;
        }
        try {
            aVar.close();
        } catch (Throwable th) {
            o3.c.m("CSJ_VIDEO", "releaseMediaDataSource error: ", th);
        }
        this.f30539k = null;
    }

    private void y() {
        this.f30537i.setOnPreparedListener(this.f30538j);
        this.f30537i.setOnBufferingUpdateListener(this.f30538j);
        this.f30537i.setOnCompletionListener(this.f30538j);
        this.f30537i.setOnSeekCompleteListener(this.f30538j);
        this.f30537i.setOnVideoSizeChangedListener(this.f30538j);
        this.f30537i.setOnErrorListener(this.f30538j);
        this.f30537i.setOnInfoListener(this.f30538j);
    }

    private void z() {
        try {
            Surface surface = this.f30540l;
            if (surface != null) {
                surface.release();
                this.f30540l = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // g3.c
    public void a(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f30541m) {
            try {
                if (!this.f30542n && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f30536h) {
                    this.f30537i.setDisplay(surfaceHolder);
                }
            }
        }
    }

    @Override // g3.c
    public void b(boolean z10) throws Throwable {
        this.f30537i.setScreenOnWhilePlaying(z10);
    }

    @Override // g3.c
    public void c(FileDescriptor fileDescriptor) throws Throwable {
        this.f30537i.setDataSource(fileDescriptor);
    }

    @Override // g3.c
    public void d(boolean z10) throws Throwable {
        MediaPlayer mediaPlayer = this.f30537i;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // g3.c
    public void e() throws Throwable {
        this.f30537i.start();
    }

    @Override // g3.c
    public void f() throws Throwable {
        this.f30537i.stop();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        z();
    }

    @Override // g3.c
    public void g() throws Throwable {
        this.f30537i.pause();
    }

    @Override // g3.c
    @TargetApi(14)
    public void h(Surface surface) {
        z();
        this.f30540l = surface;
        this.f30537i.setSurface(surface);
    }

    @Override // g3.c
    public long i() {
        try {
            return this.f30537i.getCurrentPosition();
        } catch (Throwable th) {
            o3.c.m("CSJ_VIDEO", "getCurrentPosition error: ", th);
            return 0L;
        }
    }

    @Override // g3.c
    public long j() {
        try {
            return this.f30537i.getDuration();
        } catch (Throwable th) {
            o3.c.m("CSJ_VIDEO", "getDuration error: ", th);
            return 0L;
        }
    }

    @Override // g3.c
    public void k() throws Throwable {
        synchronized (this.f30541m) {
            if (!this.f30542n) {
                this.f30537i.release();
                this.f30542n = true;
                z();
                x();
                o();
                y();
            }
        }
    }

    @Override // g3.c
    public void l() throws Throwable {
        try {
            this.f30537i.reset();
        } catch (Throwable th) {
            o3.c.m("CSJ_VIDEO", "reset error: ", th);
        }
        x();
        o();
        y();
    }

    @Override // g3.c
    public int m() {
        MediaPlayer mediaPlayer = this.f30537i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // g3.c
    public int n() {
        MediaPlayer mediaPlayer = this.f30537i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // g3.c
    public void c(boolean z10) throws Throwable {
        this.f30537i.setLooping(z10);
    }

    @Override // g3.c
    public void h() {
        MediaPlayer mediaPlayer = this.f30537i;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // g3.c
    public void a(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.f30537i.setDataSource(parse.getPath());
        } else {
            this.f30537i.setDataSource(str);
        }
    }

    @Override // g3.c
    public synchronized void a(l3.c cVar) {
        this.f30539k = v2.a.b(i3.b.a(), cVar);
        x2.c.b(cVar);
        this.f30537i.setDataSource(this.f30539k);
    }

    @Override // g3.c
    public void a(long j10) throws Throwable {
        this.f30537i.seekTo((int) j10);
    }
}
