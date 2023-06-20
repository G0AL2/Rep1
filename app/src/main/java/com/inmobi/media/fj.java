package com.inmobi.media;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.av;
import com.inmobi.media.ey;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: NativeVideoView.java */
/* loaded from: classes3.dex */
public class fj extends TextureView implements MediaController.MediaPlayerControl, ey.a {

    /* renamed from: g  reason: collision with root package name */
    private static final String f25400g = fj.class.getSimpleName();
    private MediaPlayer.OnCompletionListener A;
    private MediaPlayer.OnInfoListener B;
    private MediaPlayer.OnBufferingUpdateListener C;
    private MediaPlayer.OnErrorListener D;
    private final TextureView.SurfaceTextureListener E;

    /* renamed from: a  reason: collision with root package name */
    public fd f25401a;

    /* renamed from: b  reason: collision with root package name */
    public final ey f25402b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f25403c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f25404d;

    /* renamed from: e  reason: collision with root package name */
    MediaPlayer.OnVideoSizeChangedListener f25405e;

    /* renamed from: f  reason: collision with root package name */
    MediaPlayer.OnPreparedListener f25406f;

    /* renamed from: h  reason: collision with root package name */
    private Uri f25407h;

    /* renamed from: i  reason: collision with root package name */
    private Map<String, String> f25408i;

    /* renamed from: j  reason: collision with root package name */
    private Surface f25409j;

    /* renamed from: k  reason: collision with root package name */
    private int f25410k;

    /* renamed from: l  reason: collision with root package name */
    private int f25411l;

    /* renamed from: m  reason: collision with root package name */
    private int f25412m;

    /* renamed from: n  reason: collision with root package name */
    private int f25413n;

    /* renamed from: o  reason: collision with root package name */
    private int f25414o;

    /* renamed from: p  reason: collision with root package name */
    private int f25415p;

    /* renamed from: q  reason: collision with root package name */
    private c f25416q;

    /* renamed from: r  reason: collision with root package name */
    private b f25417r;

    /* renamed from: s  reason: collision with root package name */
    private a f25418s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f25419t;

    /* renamed from: u  reason: collision with root package name */
    private d f25420u;

    /* renamed from: v  reason: collision with root package name */
    private fi f25421v;

    /* renamed from: w  reason: collision with root package name */
    private int f25422w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f25423x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f25424y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f25425z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeVideoView.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* compiled from: NativeVideoView.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(byte b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeVideoView.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(byte b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeVideoView.java */
    /* loaded from: classes3.dex */
    public static final class d extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<fj> f25434a;

        d(fj fjVar) {
            this.f25434a = new WeakReference<>(fjVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            fj fjVar = this.f25434a.get();
            if (fjVar != null && message.what == 1) {
                int duration = fjVar.getDuration();
                int currentPosition = fjVar.getCurrentPosition();
                if (duration != -1 && currentPosition != 0) {
                    cg cgVar = (cg) fjVar.getTag();
                    if (!((Boolean) cgVar.f24830v.get("didCompleteQ1")).booleanValue() && (currentPosition * 4) - duration >= 0) {
                        cgVar.f24830v.put("didCompleteQ1", Boolean.TRUE);
                        fjVar.getQuartileCompletedListener().a((byte) 0);
                    }
                    if (!((Boolean) cgVar.f24830v.get("didCompleteQ2")).booleanValue() && (currentPosition * 2) - duration >= 0) {
                        cgVar.f24830v.put("didCompleteQ2", Boolean.TRUE);
                        fjVar.getQuartileCompletedListener().a((byte) 1);
                    }
                    if (!((Boolean) cgVar.f24830v.get("didCompleteQ3")).booleanValue() && (currentPosition * 4) - (duration * 3) >= 0) {
                        cgVar.f24830v.put("didCompleteQ3", Boolean.TRUE);
                        fjVar.getQuartileCompletedListener().a((byte) 2);
                    }
                    boolean booleanValue = ((Boolean) cgVar.f24830v.get("didQ4Fire")).booleanValue();
                    if ((currentPosition / duration) * 100.0f > cgVar.E && !booleanValue) {
                        fjVar.getPlaybackEventListener().a((byte) 5);
                    }
                }
                sendEmptyMessageDelayed(1, 1000L);
            }
            super.handleMessage(message);
        }
    }

    public fj(Context context) {
        super(context);
        this.f25409j = null;
        this.f25401a = null;
        this.f25414o = RecyclerView.UNDEFINED_DURATION;
        this.f25415p = 0;
        this.f25405e = new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.fj.1
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                fj.this.f25411l = mediaPlayer.getVideoWidth();
                fj.this.f25412m = mediaPlayer.getVideoHeight();
                if (fj.this.f25411l == 0 || fj.this.f25412m == 0) {
                    return;
                }
                fj.this.requestLayout();
            }
        };
        this.f25406f = new MediaPlayer.OnPreparedListener() { // from class: com.inmobi.media.fj.2
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                if (fj.this.f25401a == null) {
                    return;
                }
                fj.this.f25401a.f25381a = 2;
                fj fjVar = fj.this;
                fjVar.f25423x = fjVar.f25424y = fj.d(fjVar);
                if (fj.this.f25421v != null) {
                    fj.this.f25421v.setEnabled(true);
                }
                fj.this.f25411l = mediaPlayer.getVideoWidth();
                fj.this.f25412m = mediaPlayer.getVideoHeight();
                cg cgVar = (cg) fj.this.getTag();
                int i10 = 0;
                if (cgVar != null && ((Boolean) cgVar.f24830v.get("didCompleteQ4")).booleanValue()) {
                    fj.this.a(8, 0);
                    if (((Byte) cgVar.f24830v.get("placementType")).byteValue() == 1) {
                        return;
                    }
                }
                if (fj.this.getPlaybackEventListener() != null) {
                    fj.this.getPlaybackEventListener().a((byte) 0);
                }
                if (cgVar != null && !((Boolean) cgVar.f24830v.get("didCompleteQ4")).booleanValue()) {
                    i10 = ((Integer) cgVar.f24830v.get("seekPosition")).intValue();
                }
                if (fj.this.f25411l != 0 && fj.this.f25412m != 0) {
                    if (3 == fj.this.f25401a.f25382b) {
                        if (cgVar != null && ((Boolean) cgVar.f24830v.get("isFullScreen")).booleanValue()) {
                            fj.this.start();
                        }
                        if (fj.this.f25421v != null) {
                            fj.this.f25421v.a();
                        }
                    } else if (fj.this.isPlaying()) {
                    } else {
                        if ((i10 != 0 || fj.this.getCurrentPosition() > 0) && fj.this.f25421v != null) {
                            fj.this.f25421v.a();
                        }
                    }
                } else if (3 == fj.this.f25401a.f25382b && cgVar != null && ((Boolean) cgVar.f24830v.get("isFullScreen")).booleanValue()) {
                    fj.this.start();
                }
            }
        };
        this.A = new MediaPlayer.OnCompletionListener() { // from class: com.inmobi.media.fj.3
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                try {
                    fj.f(fj.this);
                } catch (Exception e10) {
                    String unused = fj.f25400g;
                    gg.a().a(new hg(e10));
                }
            }
        };
        this.B = new MediaPlayer.OnInfoListener() { // from class: com.inmobi.media.fj.4
            @Override // android.media.MediaPlayer.OnInfoListener
            @TargetApi(17)
            public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
                if (Build.VERSION.SDK_INT < 17 || 3 != i10) {
                    return true;
                }
                fj.this.a(8, 8);
                return true;
            }
        };
        this.C = new MediaPlayer.OnBufferingUpdateListener() { // from class: com.inmobi.media.fj.5
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
                fj.this.f25422w = i10;
            }
        };
        this.D = new MediaPlayer.OnErrorListener() { // from class: com.inmobi.media.fj.6
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                String unused = fj.f25400g;
                if (fj.this.f25418s != null) {
                    fj.this.f25418s.a();
                }
                if (fj.this.f25401a != null) {
                    fj.this.f25401a.f25381a = -1;
                    fj.this.f25401a.f25382b = -1;
                }
                if (fj.this.f25421v != null) {
                    fj.this.f25421v.b();
                }
                fj.h(fj.this);
                return true;
            }
        };
        this.E = new TextureView.SurfaceTextureListener() { // from class: com.inmobi.media.fj.7
            @Override // android.view.TextureView.SurfaceTextureListener
            @TargetApi(16)
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
                fj.this.f25409j = new Surface(surfaceTexture);
                fj.this.k();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (fj.this.f25409j != null) {
                    fj.this.f25409j.release();
                    fj.this.f25409j = null;
                }
                if (fj.this.f25421v != null) {
                    fj.this.f25421v.b();
                }
                fj.this.g();
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
                int intValue;
                boolean z10 = true;
                boolean z11 = fj.this.f25401a != null && fj.this.f25401a.f25382b == 3;
                z10 = (i10 <= 0 || i11 <= 0) ? false : false;
                if (fj.this.f25401a != null && z11 && z10) {
                    if (fj.this.getTag() != null && (intValue = ((Integer) ((cg) fj.this.getTag()).f24830v.get("seekPosition")).intValue()) != 0) {
                        fj.this.a(intValue);
                    }
                    fj.this.start();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.f25402b = new ey(getContext(), this);
        requestLayout();
        invalidate();
    }

    static /* synthetic */ boolean d(fj fjVar) {
        fjVar.f25425z = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        fd a10;
        if (this.f25407h == null || this.f25409j == null) {
            return;
        }
        if (this.f25401a == null) {
            cg cgVar = (cg) getTag();
            if (1 == (cgVar != null ? ((Byte) cgVar.f24830v.get("placementType")).byteValue() : (byte) 1)) {
                a10 = new fd();
            } else {
                a10 = fd.a();
            }
            this.f25401a = a10;
            int i10 = this.f25410k;
            if (i10 != 0) {
                a10.setAudioSessionId(i10);
            } else {
                this.f25410k = a10.getAudioSessionId();
            }
            try {
                this.f25401a.setDataSource(getContext().getApplicationContext(), this.f25407h, this.f25408i);
            } catch (IOException unused) {
                fd fdVar = this.f25401a;
                fdVar.f25381a = -1;
                fdVar.f25382b = -1;
                return;
            }
        }
        try {
            cg cgVar2 = (cg) getTag();
            this.f25401a.setOnPreparedListener(this.f25406f);
            this.f25401a.setOnVideoSizeChangedListener(this.f25405e);
            this.f25401a.setOnCompletionListener(this.A);
            this.f25401a.setOnErrorListener(this.D);
            this.f25401a.setOnInfoListener(this.B);
            this.f25401a.setOnBufferingUpdateListener(this.C);
            this.f25401a.setSurface(this.f25409j);
            if (Build.VERSION.SDK_INT >= 26) {
                this.f25401a.setAudioAttributes(this.f25402b.f25314a);
            } else {
                this.f25401a.setAudioStreamType(3);
            }
            this.f25401a.prepareAsync();
            this.f25422w = 0;
            this.f25401a.f25381a = 1;
            o();
            if (cgVar2 != null) {
                if (((Boolean) cgVar2.f24830v.get("shouldAutoPlay")).booleanValue()) {
                    this.f25401a.f25382b = 3;
                }
                if (((Boolean) cgVar2.f24830v.get("didCompleteQ4")).booleanValue()) {
                    a(8, 0);
                    return;
                }
            }
            a(0, 0);
        } catch (Exception e10) {
            fd fdVar2 = this.f25401a;
            fdVar2.f25381a = -1;
            fdVar2.f25382b = -1;
            this.D.onError(fdVar2, 1, 0);
            gg.a().a(new hg(e10));
        }
    }

    private void l() {
        this.f25401a.setOnPreparedListener(null);
        this.f25401a.setOnVideoSizeChangedListener(null);
        this.f25401a.setOnCompletionListener(null);
        this.f25401a.setOnErrorListener(null);
        this.f25401a.setOnInfoListener(null);
        this.f25401a.setOnBufferingUpdateListener(null);
    }

    private void m() {
        fd fdVar = this.f25401a;
        if (fdVar != null) {
            this.f25413n = 0;
            fdVar.setVolume(0.0f, 0.0f);
            if (getTag() != null) {
                ((cg) getTag()).f24830v.put("currentMediaVolume", 0);
            }
        }
    }

    private void n() {
        fd fdVar = this.f25401a;
        if (fdVar != null) {
            this.f25413n = 1;
            fdVar.setVolume(1.0f, 1.0f);
            if (getTag() != null) {
                ((cg) getTag()).f24830v.put("currentMediaVolume", 15);
            }
        }
    }

    private void o() {
        fi fiVar;
        if (this.f25401a == null || (fiVar = this.f25421v) == null) {
            return;
        }
        fiVar.setMediaPlayer(this);
        this.f25421v.setEnabled(f());
        this.f25421v.a();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f25423x;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f25424y;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f25425z;
    }

    public final boolean f() {
        int i10;
        fd fdVar = this.f25401a;
        return (fdVar == null || (i10 = fdVar.f25381a) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    public ey getAudioFocusManager() {
        return this.f25402b;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f25410k == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f25410k = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f25410k;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f25401a != null) {
            return this.f25422w;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (f()) {
            return this.f25401a.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (f()) {
            return this.f25401a.getDuration();
        }
        return -1;
    }

    public int getLastVolume() {
        return this.f25414o;
    }

    public fi getMediaController() {
        return this.f25421v;
    }

    public fd getMediaPlayer() {
        return this.f25401a;
    }

    public b getPlaybackEventListener() {
        return this.f25417r;
    }

    public c getQuartileCompletedListener() {
        return this.f25416q;
    }

    public int getState() {
        fd fdVar = this.f25401a;
        if (fdVar != null) {
            return fdVar.f25381a;
        }
        return 0;
    }

    public int getVideoVolume() {
        if (isPlaying()) {
            return this.f25413n;
        }
        return -1;
    }

    public int getVolume() {
        if (f()) {
            return this.f25413n;
        }
        return -1;
    }

    public final void h() {
        if (this.f25401a != null) {
            this.f25402b.a();
            m();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return f() && this.f25401a.isPlaying();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f25411l     // Catch: java.lang.Exception -> L81
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)     // Catch: java.lang.Exception -> L81
            int r1 = r5.f25412m     // Catch: java.lang.Exception -> L81
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)     // Catch: java.lang.Exception -> L81
            int r2 = r5.f25411l     // Catch: java.lang.Exception -> L81
            if (r2 <= 0) goto L7e
            int r2 = r5.f25412m     // Catch: java.lang.Exception -> L81
            if (r2 <= 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch: java.lang.Exception -> L81
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch: java.lang.Exception -> L81
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch: java.lang.Exception -> L81
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch: java.lang.Exception -> L81
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L43
            int r0 = r5.f25411l     // Catch: java.lang.Exception -> L81
            int r1 = r0 * r7
            int r2 = r5.f25412m     // Catch: java.lang.Exception -> L81
            int r3 = r6 * r2
            if (r1 >= r3) goto L39
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L54
        L39:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L63
            int r0 = r0 * r7
            int r0 = r0 / r2
            goto L7d
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.f25412m     // Catch: java.lang.Exception -> L81
            int r0 = r0 * r6
            int r2 = r5.f25411l     // Catch: java.lang.Exception -> L81
            int r0 = r0 / r2
            if (r1 != r3) goto L53
            if (r0 <= r7) goto L53
            goto L63
        L53:
            r1 = r0
        L54:
            r0 = r6
            goto L7e
        L56:
            if (r1 != r2) goto L65
            int r1 = r5.f25411l     // Catch: java.lang.Exception -> L81
            int r1 = r1 * r7
            int r2 = r5.f25412m     // Catch: java.lang.Exception -> L81
            int r1 = r1 / r2
            if (r0 != r3) goto L7c
            if (r1 <= r6) goto L7c
        L63:
            r0 = r6
            goto L7d
        L65:
            int r2 = r5.f25411l     // Catch: java.lang.Exception -> L81
            int r4 = r5.f25412m     // Catch: java.lang.Exception -> L81
            if (r1 != r3) goto L71
            if (r4 <= r7) goto L71
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L73
        L71:
            r1 = r2
            r7 = r4
        L73:
            if (r0 != r3) goto L7c
            if (r1 <= r6) goto L7c
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L54
        L7c:
            r0 = r1
        L7d:
            r1 = r7
        L7e:
            r5.setMeasuredDimension(r0, r1)     // Catch: java.lang.Exception -> L81
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.fj.onMeasure(int, int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (f() && this.f25401a.isPlaying()) {
            this.f25401a.pause();
            this.f25401a.f25381a = 4;
            this.f25402b.a();
            if (getTag() != null) {
                cg cgVar = (cg) getTag();
                cgVar.f24830v.put("didPause", Boolean.TRUE);
                cgVar.f24830v.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            getPlaybackEventListener().a((byte) 2);
        }
        fd fdVar = this.f25401a;
        if (fdVar != null) {
            fdVar.f25382b = 4;
        }
        this.f25404d = false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
    }

    public void setIsLockScreen(boolean z10) {
        this.f25419t = z10;
    }

    public void setLastVolume(int i10) {
        this.f25414o = i10;
    }

    public void setMediaController(fi fiVar) {
        if (fiVar != null) {
            this.f25421v = fiVar;
            o();
        }
    }

    public void setMediaErrorListener(a aVar) {
        this.f25418s = aVar;
    }

    public void setPlaybackEventListener(b bVar) {
        this.f25417r = bVar;
    }

    public void setQuartileCompletedListener(c cVar) {
        this.f25416q = cVar;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.f25407h = uri;
        this.f25408i = null;
        k();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    @TargetApi(20)
    public void start() {
        PowerManager powerManager = (PowerManager) getContext().getSystemService("power");
        boolean inKeyguardRestrictedInputMode = ((KeyguardManager) getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        boolean isScreenOn = Build.VERSION.SDK_INT < 20 ? powerManager.isScreenOn() : powerManager.isInteractive();
        boolean f10 = f();
        cg cgVar = (cg) getTag();
        boolean z10 = cgVar == null || ((Boolean) cgVar.f24830v.get("shouldAutoPlay")).booleanValue();
        if (f10 && !z10) {
            a(8, 0);
        }
        if (f10 && isScreenOn && !this.f25401a.isPlaying() && z10 && (this.f25419t || !inKeyguardRestrictedInputMode)) {
            a((cgVar == null || ((Boolean) cgVar.f24830v.get("didCompleteQ4")).booleanValue()) ? 0 : ((Integer) cgVar.f24830v.get("seekPosition")).intValue());
            if (cgVar != null ? cgVar.a() : false) {
                this.f25402b.b();
            } else {
                h();
            }
            this.f25401a.start();
            this.f25401a.f25381a = 3;
            a(8, 8);
            if (cgVar != null) {
                Map<String, Object> map = cgVar.f24830v;
                Boolean bool = Boolean.FALSE;
                map.put("didCompleteQ4", bool);
                if (((Boolean) cgVar.f24830v.get("didPause")).booleanValue()) {
                    getPlaybackEventListener().a((byte) 3);
                    cgVar.f24830v.put("didPause", bool);
                } else {
                    getPlaybackEventListener().a((byte) 1);
                }
                d dVar = this.f25420u;
                if (dVar != null && !dVar.hasMessages(1)) {
                    this.f25420u.sendEmptyMessage(1);
                }
            }
            fi fiVar = this.f25421v;
            if (fiVar != null) {
                fiVar.a();
            }
        }
        fd fdVar = this.f25401a;
        if (fdVar != null) {
            fdVar.f25382b = 3;
        }
    }

    @Override // com.inmobi.media.ey.a
    public final void d() {
        m();
        fi fiVar = this.f25421v;
        if (fiVar != null) {
            fiVar.d();
        }
    }

    public final void e() {
        Surface surface = this.f25409j;
        if (surface != null) {
            surface.release();
            this.f25409j = null;
        }
        g();
    }

    public final void g() {
        if (this.f25401a != null) {
            this.f25402b.c();
            d dVar = this.f25420u;
            if (dVar != null) {
                dVar.removeMessages(1);
            }
            if (getTag() != null) {
                ((cg) getTag()).f24830v.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            fd fdVar = this.f25401a;
            fdVar.f25381a = 0;
            fdVar.f25382b = 0;
            fdVar.reset();
            l();
            if (getTag() != null) {
                if (((Byte) ((cg) getTag()).f24830v.get("placementType")).byteValue() == 0) {
                    this.f25401a.b();
                }
            } else {
                this.f25401a.b();
            }
            this.f25401a = null;
        }
    }

    public final void i() {
        if (this.f25401a != null) {
            if (isPlaying()) {
                this.f25402b.b();
            } else {
                n();
            }
        }
    }

    static /* synthetic */ void f(fj fjVar) {
        fd fdVar = fjVar.f25401a;
        if (fdVar != null) {
            fdVar.f25381a = 5;
            fdVar.f25382b = 5;
        }
        fi fiVar = fjVar.f25421v;
        if (fiVar != null) {
            fiVar.b();
        }
        d dVar = fjVar.f25420u;
        if (dVar != null) {
            dVar.removeMessages(1);
        }
        if (fjVar.getTag() != null) {
            cg cgVar = (cg) fjVar.getTag();
            if (!((Boolean) cgVar.f24830v.get("didCompleteQ4")).booleanValue()) {
                cgVar.f24830v.put("didCompleteQ4", Boolean.TRUE);
                if (fjVar.getQuartileCompletedListener() != null) {
                    fjVar.getQuartileCompletedListener().a((byte) 3);
                }
            }
            cgVar.f24830v.put("didSignalVideoCompleted", Boolean.TRUE);
            Map<String, Object> map = cgVar.f24830v;
            Boolean bool = Boolean.FALSE;
            map.put("didCompleteQ1", bool);
            cgVar.f24830v.put("didCompleteQ2", bool);
            cgVar.f24830v.put("didCompleteQ3", bool);
            cgVar.f24830v.put("didPause", bool);
            cgVar.f24830v.put("didStartPlaying", bool);
            cgVar.f24830v.put("didQ4Fire", bool);
            if (cgVar.C) {
                fjVar.start();
                return;
            }
            fjVar.f25402b.a();
            if (((Boolean) cgVar.f24830v.get("isFullScreen")).booleanValue()) {
                fjVar.a(8, 0);
            }
        }
    }

    @Override // com.inmobi.media.ey.a
    public final void c() {
        if (isPlaying()) {
            n();
            fi fiVar = this.f25421v;
            if (fiVar != null) {
                fiVar.c();
            }
        }
    }

    static /* synthetic */ void h(fj fjVar) {
        try {
            Uri uri = fjVar.f25407h;
            if (uri != null) {
                String uri2 = uri.toString();
                be.a();
                he a10 = he.a();
                List<ContentValues> a11 = a10.a("asset", be.f24702a, "disk_uri=? ", new String[]{uri2}, null, null, "created_ts DESC ", "1");
                a10.b();
                av a12 = a11.isEmpty() ? null : be.a(a11.get(0));
                av.a aVar = new av.a();
                if (a12 != null) {
                    av a13 = aVar.a(a12.f24630d, 0, 0L).a();
                    be.a();
                    be.b(a13);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.inmobi.media.ey.a
    public final void b() {
        m();
        fi fiVar = this.f25421v;
        if (fiVar != null) {
            fiVar.d();
        }
    }

    public final void a(cg cgVar) {
        fd a10;
        this.f25411l = 0;
        this.f25412m = 0;
        this.f25407h = Uri.parse(((dt) cgVar.f24813e).b());
        if (1 == ((Byte) cgVar.f24830v.get("placementType")).byteValue()) {
            a10 = new fd();
        } else {
            a10 = fd.a();
        }
        this.f25401a = a10;
        int i10 = this.f25410k;
        if (i10 != 0) {
            a10.setAudioSessionId(i10);
        } else {
            this.f25410k = a10.getAudioSessionId();
        }
        try {
            this.f25401a.setDataSource(getContext().getApplicationContext(), this.f25407h, this.f25408i);
            setTag(cgVar);
            this.f25420u = new d(this);
            setSurfaceTextureListener(this.E);
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
        } catch (IOException unused) {
            fd fdVar = this.f25401a;
            fdVar.f25381a = -1;
            fdVar.f25382b = -1;
        }
    }

    final void a(int i10) {
        if (f()) {
            this.f25401a.seekTo(i10);
        }
    }

    @Override // com.inmobi.media.ey.a
    public final void a() {
        n();
        fi fiVar = this.f25421v;
        if (fiVar != null) {
            fiVar.c();
        }
    }

    final void a(int i10, int i11) {
        if (this.f25401a != null) {
            ProgressBar progressBar = ((fk) getParent()).getProgressBar();
            ImageView poster = ((fk) getParent()).getPoster();
            progressBar.setVisibility(i10);
            poster.setVisibility(i11);
        }
    }
}
