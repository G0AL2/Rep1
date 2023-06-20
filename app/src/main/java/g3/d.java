package g3;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.gms.common.api.Api;
import g3.c;
import i3.a;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o3.d;

/* compiled from: SSMediaPlayerWrapper.java */
/* loaded from: classes.dex */
public class d implements c.a, c.b, c.InterfaceC0392c, c.d, c.e, c.f, c.g, i3.a, d.a {
    private static final SparseIntArray J = new SparseIntArray();
    private boolean D;
    private boolean I;

    /* renamed from: a  reason: collision with root package name */
    private SurfaceTexture f30544a;

    /* renamed from: b  reason: collision with root package name */
    private SurfaceHolder f30545b;

    /* renamed from: h  reason: collision with root package name */
    private boolean f30551h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f30552i;

    /* renamed from: l  reason: collision with root package name */
    private final Handler f30555l;

    /* renamed from: s  reason: collision with root package name */
    private boolean f30562s;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<Runnable> f30563t;

    /* renamed from: u  reason: collision with root package name */
    private int f30564u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f30565v;

    /* renamed from: c  reason: collision with root package name */
    private int f30546c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30547d = false;

    /* renamed from: e  reason: collision with root package name */
    private g3.c f30548e = null;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30549f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f30550g = false;

    /* renamed from: j  reason: collision with root package name */
    private volatile int f30553j = 201;

    /* renamed from: k  reason: collision with root package name */
    private long f30554k = -1;

    /* renamed from: m  reason: collision with root package name */
    private boolean f30556m = false;

    /* renamed from: n  reason: collision with root package name */
    private long f30557n = 0;

    /* renamed from: o  reason: collision with root package name */
    private long f30558o = Long.MIN_VALUE;

    /* renamed from: p  reason: collision with root package name */
    private long f30559p = 0;

    /* renamed from: q  reason: collision with root package name */
    private long f30560q = 0;

    /* renamed from: r  reason: collision with root package name */
    private long f30561r = 0;

    /* renamed from: w  reason: collision with root package name */
    private final List<WeakReference<a.InterfaceC0404a>> f30566w = Collections.synchronizedList(new ArrayList());

    /* renamed from: x  reason: collision with root package name */
    private l3.c f30567x = null;

    /* renamed from: y  reason: collision with root package name */
    private boolean f30568y = false;

    /* renamed from: z  reason: collision with root package name */
    private volatile int f30569z = 200;
    private Surface A = null;
    private Runnable B = new e();
    private n C = new n();
    private final Object E = new Object();
    private StringBuilder F = null;
    private long G = 0;
    private long H = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f30555l != null) {
                d.this.f30555l.sendEmptyMessage(104);
                o3.c.e("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke ! sendMsg --> OP_PREPARE_ASYNC");
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f30555l != null) {
                d.this.f30555l.sendEmptyMessage(105);
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f30572a;

        c(long j10) {
            this.f30572a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f30555l != null) {
                d.this.f30555l.obtainMessage(106, Long.valueOf(this.f30572a)).sendToTarget();
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* renamed from: g3.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0393d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f30574a;

        RunnableC0393d(SurfaceTexture surfaceTexture) {
            this.f30574a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.Z();
            if (d.this.f30555l != null) {
                d.this.f30555l.obtainMessage(111, this.f30574a).sendToTarget();
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long X = d.this.X();
            if (X > 0 && Build.VERSION.SDK_INT >= 23 && d.this.l() && d.this.f30558o != Long.MIN_VALUE) {
                if (d.this.f30558o == X) {
                    if (!d.this.f30556m && d.this.f30559p >= 400) {
                        d.this.E(701, 800);
                        d.this.f30556m = true;
                    }
                    d.this.f30559p += d.this.f30569z;
                } else {
                    if (d.this.f30556m) {
                        d.this.f30557n += d.this.f30559p;
                        d.this.E(702, 800);
                        o3.c.j("CSJ_VIDEO_MEDIA", "handleMsg:  bufferingDuration =", Long.valueOf(d.this.f30557n), "  bufferCount =", Integer.valueOf(d.this.f30546c));
                    }
                    d.this.f30559p = 0L;
                    d.this.f30556m = false;
                }
            }
            if (d.this.q() > 0) {
                if (d.this.f30558o != X) {
                    if (i3.b.i()) {
                        o3.c.j("CSJ_VIDEO_MEDIA", "run: lastCur = ", Long.valueOf(d.this.f30558o), "  curPosition = ", Long.valueOf(X));
                    }
                    d dVar = d.this;
                    dVar.w(X, dVar.q());
                }
                d.this.f30558o = X;
            }
            if (!d.this.h()) {
                d.this.f30555l.postDelayed(this, d.this.f30569z);
                return;
            }
            d dVar2 = d.this;
            dVar2.w(dVar2.q(), d.this.q());
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurfaceHolder f30577a;

        f(SurfaceHolder surfaceHolder) {
            this.f30577a = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.Z();
            if (d.this.f30555l != null) {
                d.this.f30555l.obtainMessage(110, this.f30577a).sendToTarget();
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l3.c f30579a;

        g(l3.c cVar) {
            this.f30579a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.Z();
            if (d.this.f30555l != null) {
                d.this.f30555l.obtainMessage(107, this.f30579a).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f30555l.getLooper() != null) {
                try {
                    o3.c.e("CSJ_VIDEO_MEDIA", "onDestory............");
                    d.this.f30555l.getLooper().quit();
                } catch (Throwable th) {
                    o3.c.f("CSJ_VIDEO_MEDIA", "onDestroy error: ", th);
                }
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.f30548e.g();
                d.this.f30553j = 207;
                d.this.D = false;
            } catch (Throwable th) {
                o3.c.f("CSJ_VIDEO_MEDIA", "onPrepared error: ", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f30583a;

        j(boolean z10) {
            this.f30583a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            o3.c.j("CSJ_VIDEO_MEDIA", "run:before setQuietPlay ", Boolean.valueOf(this.f30583a));
            if (d.this.f30552i || d.this.f30553j == 203 || d.this.f30548e == null) {
                return;
            }
            try {
                o3.c.j("CSJ_VIDEO_MEDIA", "run:exec  setQuietPlay ", Boolean.valueOf(this.f30583a));
                d.this.f30568y = this.f30583a;
                d.this.f30548e.d(this.f30583a);
            } catch (Throwable th) {
                o3.c.f("CSJ_VIDEO_MEDIA", "setQuietPlay error: ", th);
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    public class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f30586a;

        l(boolean z10) {
            this.f30586a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f30548e != null) {
                d.this.f30548e.a(this.f30586a);
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!d.this.m() || d.this.f30548e == null) {
                return;
            }
            try {
                d.this.f30548e.e();
                o3.c.h("CSJ_VIDEO_MEDIA", "resume play exec start ");
                for (WeakReference weakReference : d.this.f30566w) {
                    if (weakReference != null && weakReference.get() != null) {
                        ((a.InterfaceC0404a) weakReference.get()).e(d.this);
                    }
                }
                d.this.f30553j = 206;
            } catch (Throwable th) {
                o3.c.j("CSJ_VIDEO_MEDIA", "play: catch exception ", th.getMessage());
            }
        }
    }

    /* compiled from: SSMediaPlayerWrapper.java */
    /* loaded from: classes.dex */
    class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private long f30589a;

        n() {
        }

        public void a(long j10) {
            this.f30589a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f30548e != null) {
                try {
                    long i10 = d.this.f30548e.i();
                    d.this.f30554k = Math.max(this.f30589a, i10);
                } catch (Throwable th) {
                    o3.c.e("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start  error: getCurrentPosition :" + th.toString());
                }
            }
            d.this.f30555l.sendEmptyMessageDelayed(100, 0L);
            o3.c.e("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start not first play ! sendMsg --> OP_START , video start to play !");
        }
    }

    public d() {
        this.f30564u = 0;
        this.I = false;
        this.f30564u = 0;
        HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_SSMediaPlayerWrapper", -1);
        handlerThread.start();
        o3.d dVar = new o3.d(handlerThread.getLooper(), this);
        this.f30555l = dVar;
        this.I = Build.VERSION.SDK_INT >= 17;
        dVar.post(new k());
    }

    private void A(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f30548e.c(fileInputStream.getFD());
        fileInputStream.close();
    }

    private boolean B(int i10, int i11) {
        o3.c.e("CSJ_VIDEO_MEDIA", "OnError - Error code: " + i10 + " Extra code: " + i11);
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(int i10, int i11) {
        String str;
        if (i10 == 701) {
            this.G = SystemClock.elapsedRealtime();
            this.f30546c++;
            for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().a(this, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
                }
            }
            o3.c.j("CSJ_VIDEO_MEDIA", "bufferCount = ", Integer.valueOf(this.f30546c));
        } else if (i10 == 702) {
            if (this.G > 0) {
                str = "CSJ_VIDEO_MEDIA";
                this.H += SystemClock.elapsedRealtime() - this.G;
                this.G = 0L;
            } else {
                str = "CSJ_VIDEO_MEDIA";
            }
            for (WeakReference<a.InterfaceC0404a> weakReference2 : this.f30566w) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().a((i3.a) this, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            }
            o3.c.j(str, "bufferCount = ", Integer.valueOf(this.f30546c), " mBufferTotalTime = ", Long.valueOf(this.H));
        } else if (this.I && i10 == 3) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f30561r;
            this.f30547d = true;
            for (WeakReference<a.InterfaceC0404a> weakReference3 : this.f30566w) {
                if (weakReference3 != null && weakReference3.get() != null) {
                    weakReference3.get().a(this, elapsedRealtime);
                }
            }
            a(this.f30568y);
            o3.c.h("CSJ_VIDEO_MEDIA", "onRenderStart");
        }
    }

    private void F(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!this.f30552i) {
            runnable.run();
        } else {
            z(runnable);
        }
    }

    private void G(String str) {
        Handler handler = this.f30555l;
        if (handler != null) {
            handler.removeMessages(201);
        }
        synchronized (this.E) {
            if (this.F != null) {
                this.F = null;
            }
        }
    }

    private void Y() {
        this.f30557n = 0L;
        this.f30546c = 0;
        this.f30559p = 0L;
        this.f30556m = false;
        this.f30558o = Long.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        if (this.f30548e == null) {
            g3.b bVar = new g3.b();
            this.f30548e = bVar;
            bVar.i(this);
            this.f30548e.e(this);
            this.f30548e.f(this);
            this.f30548e.d(this);
            this.f30548e.a(this);
            this.f30548e.g(this);
            this.f30548e.b(this);
            try {
                this.f30548e.c(this.f30549f);
            } catch (Throwable th) {
                o3.c.f("CSJ_VIDEO_MEDIA", "setLooping error: ", th);
            }
            this.f30550g = false;
        }
    }

    private void a0() {
        o3.c.e("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start first play prepare invoke !");
        F(new a());
    }

    private void b0() {
        o3.c.h("CSJ_VIDEO_MEDIA", "releaseMediaPlayer: ");
        g3.c cVar = this.f30548e;
        if (cVar == null) {
            return;
        }
        try {
            cVar.l();
        } catch (Throwable th) {
            o3.c.f("CSJ_VIDEO_MEDIA", "releaseMediaplayer error1: ", th);
        }
        this.f30548e.e(null);
        this.f30548e.b((c.g) null);
        this.f30548e.d((c.a) null);
        this.f30548e.g(null);
        this.f30548e.f(null);
        this.f30548e.i(null);
        this.f30548e.a((c.f) null);
        try {
            this.f30548e.k();
        } catch (Throwable th2) {
            o3.c.f("CSJ_VIDEO_MEDIA", "releaseMediaplayer error2: ", th2);
        }
    }

    private void c0() {
        Handler handler = this.f30555l;
        if (handler == null || handler.getLooper() == null) {
            return;
        }
        this.f30555l.post(new h());
    }

    private void d0() {
        SparseIntArray sparseIntArray = J;
        Integer valueOf = Integer.valueOf(sparseIntArray.get(this.f30564u));
        if (valueOf == null) {
            sparseIntArray.put(this.f30564u, 1);
        } else {
            sparseIntArray.put(this.f30564u, Integer.valueOf(valueOf.intValue() + 1).intValue());
        }
    }

    private void e0() {
        if (this.f30551h) {
            return;
        }
        this.f30551h = true;
        Iterator it = new ArrayList(this.f30563t).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f30563t.clear();
        this.f30551h = false;
    }

    private void r() {
        ArrayList<Runnable> arrayList = this.f30563t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        e0();
    }

    private void s() {
        ArrayList<Runnable> arrayList = this.f30563t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.f30563t.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(long j10, long j11) {
        for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().a(this, j10, j11);
            }
        }
    }

    private void z(Runnable runnable) {
        if (this.f30563t == null) {
            this.f30563t = new ArrayList<>();
        }
        this.f30563t.add(runnable);
    }

    public boolean W() {
        return this.f30553j == 205;
    }

    public long X() {
        if (this.f30553j == 206 || this.f30553j == 207) {
            try {
                return this.f30548e.i();
            } catch (Throwable unused) {
                return 0L;
            }
        }
        return 0L;
    }

    @Override // i3.a
    public void a() {
        Handler handler = this.f30555l;
        if (handler != null) {
            handler.post(new m());
        }
    }

    @Override // i3.a
    public void b(boolean z10) {
        this.f30565v = z10;
        g3.c cVar = this.f30548e;
        if (cVar != null) {
            cVar.a(z10);
        } else {
            this.f30555l.post(new l(z10));
        }
    }

    @Override // i3.a
    public void c() {
        F(new b());
    }

    @Override // i3.a
    public void d() {
        this.f30553j = 203;
        s();
        if (this.f30555l != null) {
            try {
                G("release");
                this.f30555l.removeCallbacksAndMessages(null);
                if (this.f30548e != null) {
                    this.f30552i = true;
                    this.f30555l.sendEmptyMessage(103);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // i3.a
    public boolean e() {
        return this.f30547d;
    }

    @Override // g3.c.d
    public boolean f(g3.c cVar, int i10, int i11) {
        o3.c.l("CSJ_VIDEO_MEDIA", "what,extra:" + i10 + "," + i11);
        if (this.f30548e != cVar) {
            return false;
        }
        if (i11 == -1004) {
            l3.a aVar = new l3.a(i10, i11);
            for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().a(this, aVar);
                }
            }
        }
        E(i10, i11);
        return false;
    }

    @Override // g3.c.b
    public void g(g3.c cVar) {
        this.f30553j = !this.f30549f ? 209 : 206;
        J.delete(this.f30564u);
        for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().a(this);
            }
        }
        G("completion");
    }

    @Override // i3.a
    public boolean h() {
        return this.f30553j == 209;
    }

    @Override // i3.a
    public boolean i() {
        return W() || l() || m();
    }

    @Override // i3.a
    public int j() {
        g3.c cVar = this.f30548e;
        if (cVar != null) {
            return cVar.m();
        }
        return 0;
    }

    @Override // i3.a
    public int k() {
        g3.c cVar = this.f30548e;
        if (cVar != null) {
            return cVar.n();
        }
        return 0;
    }

    @Override // i3.a
    public boolean l() {
        return (this.f30553j == 206 || this.f30555l.hasMessages(100)) && !this.D;
    }

    @Override // i3.a
    public boolean m() {
        return (this.f30553j == 207 || this.D) && !this.f30555l.hasMessages(100);
    }

    @Override // i3.a
    public boolean n() {
        return this.f30553j == 203;
    }

    @Override // i3.a
    public long o() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f30556m) {
                long j10 = this.f30559p;
                if (j10 > 0) {
                    return this.f30557n + j10;
                }
            }
            return this.f30557n;
        }
        return this.H;
    }

    @Override // i3.a
    public int p() {
        return this.f30546c;
    }

    @Override // i3.a
    public long q() {
        long j10 = this.f30560q;
        if (j10 != 0) {
            return j10;
        }
        if (this.f30553j == 206 || this.f30553j == 207) {
            try {
                this.f30560q = this.f30548e.j();
            } catch (Throwable unused) {
            }
        }
        return this.f30560q;
    }

    @Override // g3.c.f
    public void c(g3.c cVar) {
        for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().a((i3.a) this, true);
            }
        }
    }

    @Override // g3.c.e
    public void e(g3.c cVar) {
        this.f30553j = 205;
        if (this.D) {
            this.f30555l.post(new i());
        } else {
            Handler handler = this.f30555l;
            handler.sendMessage(handler.obtainMessage(100, -1, -1));
        }
        J.delete(this.f30564u);
        if (!this.I && !this.f30562s) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f30561r;
            for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().a(this, elapsedRealtime);
                }
            }
            this.f30547d = true;
            this.f30562s = true;
        }
        for (WeakReference<a.InterfaceC0404a> weakReference2 : this.f30566w) {
            if (weakReference2 != null && weakReference2.get() != null) {
                weakReference2.get().b(this);
            }
        }
    }

    @Override // g3.c.a
    public void h(g3.c cVar, int i10) {
        if (this.f30548e != cVar) {
            return;
        }
        for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().b(this, i10);
            }
        }
    }

    @Override // g3.c.g
    public void i(g3.c cVar, int i10, int i11, int i12, int i13) {
        for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().a((i3.a) this, i10, i11);
            }
        }
    }

    @Override // i3.a
    public void a(long j10) {
        if (this.f30553j == 207 || this.f30553j == 206 || this.f30553j == 209) {
            F(new c(j10));
        }
    }

    @Override // i3.a
    public void a(SurfaceTexture surfaceTexture) {
        this.f30544a = surfaceTexture;
        b(true);
        F(new RunnableC0393d(surfaceTexture));
    }

    @Override // i3.a
    public void b(boolean z10, long j10, boolean z11) {
        o3.c.e("CSJ_VIDEO_MEDIA", "[video] MediaPlayerProxy#start firstSeekToPosition=" + j10 + ",firstPlay :" + z10 + ",isPauseOtherMusicVolume=" + z11);
        if (this.f30548e == null) {
            return;
        }
        this.f30568y = z11;
        this.D = false;
        a(z11);
        if (z10) {
            o3.c.e("CSJ_VIDEO_MEDIA", "[video] first start , SSMediaPlayer  start method !");
            this.f30554k = j10;
            a0();
        } else {
            this.C.a(j10);
            if (this.f30565v) {
                F(this.C);
            } else {
                z(this.C);
            }
        }
        this.f30555l.postDelayed(this.B, this.f30569z);
    }

    @Override // i3.a
    public SurfaceTexture g() {
        return this.f30544a;
    }

    @Override // i3.a
    public void a(SurfaceHolder surfaceHolder) {
        this.f30545b = surfaceHolder;
        b(true);
        F(new f(surfaceHolder));
    }

    @Override // i3.a
    public SurfaceHolder f() {
        return this.f30545b;
    }

    @Override // i3.a
    public void a(l3.c cVar) {
        this.f30567x = cVar;
        F(new g(cVar));
    }

    @Override // g3.c.InterfaceC0392c
    public boolean d(g3.c cVar, int i10, int i11) {
        o3.c.l("CSJ_VIDEO_MEDIA", "what=" + i10 + "extra=" + i11);
        d0();
        this.f30553j = 200;
        Handler handler = this.f30555l;
        if (handler != null) {
            handler.removeCallbacks(this.B);
        }
        if (B(i10, i11)) {
            c0();
        }
        if (!this.f30550g) {
            l3.a aVar = new l3.a(308, i11);
            for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().a(this, aVar);
                }
            }
            this.f30550g = true;
            return true;
        }
        l3.a aVar2 = new l3.a(i10, i11);
        for (WeakReference<a.InterfaceC0404a> weakReference2 : this.f30566w) {
            if (weakReference2 != null && weakReference2.get() != null) {
                weakReference2.get().a(this, aVar2);
            }
        }
        return true;
    }

    @Override // o3.d.a
    public void a(Message message) {
        int i10 = message.what;
        o3.c.e("CSJ_VIDEO_MEDIA", "[video]  execute , mCurrentState = " + this.f30553j + " handlerMsg=" + i10);
        g3.c cVar = this.f30548e;
        boolean z10 = false;
        if (cVar != null) {
            switch (message.what) {
                case 100:
                    if (this.f30553j == 205 || this.f30553j == 207 || this.f30553j == 209) {
                        try {
                            this.f30548e.e();
                            this.f30561r = SystemClock.elapsedRealtime();
                            o3.c.e("CSJ_VIDEO_MEDIA", "[video] OP_START execute , mMediaPlayer real start !");
                            this.f30553j = 206;
                            long j10 = this.f30554k;
                            if (j10 > 0) {
                                this.f30548e.a(j10);
                                this.f30554k = -1L;
                            }
                            if (this.f30567x != null) {
                                a(this.f30568y);
                                break;
                            }
                        } catch (Throwable th) {
                            o3.c.f("CSJ_VIDEO_MEDIA", "OP_START error: ", th);
                            break;
                        }
                    }
                    z10 = true;
                    break;
                case 101:
                    if (this.f30556m) {
                        this.f30557n += this.f30559p;
                    }
                    this.f30556m = false;
                    this.f30559p = 0L;
                    this.f30558o = Long.MIN_VALUE;
                    if (this.f30553j == 206 || this.f30553j == 207 || this.f30553j == 209) {
                        try {
                            o3.c.e("CSJ_VIDEO_MEDIA", "[video] OP_PAUSE execute , mMediaPlayer  OP_PAUSE !");
                            this.f30548e.g();
                            this.f30553j = 207;
                            this.D = false;
                            for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().d(this);
                                }
                            }
                            break;
                        } catch (Throwable th2) {
                            o3.c.f("CSJ_VIDEO_MEDIA", "OP_PAUSE error: ", th2);
                            break;
                        }
                    }
                    z10 = true;
                    break;
                case 102:
                    try {
                        cVar.l();
                        o3.c.e("CSJ_VIDEO_MEDIA", "[video] OP_RELEASE execute , releaseMediaplayer !");
                        this.f30553j = 201;
                        break;
                    } catch (Throwable th3) {
                        o3.c.f("CSJ_VIDEO_MEDIA", "OP_RESET error: ", th3);
                        break;
                    }
                case 103:
                    try {
                        b0();
                        o3.c.e("CSJ_VIDEO_MEDIA", "[video] OP_RELEASE execute , releaseMediaplayer !");
                    } catch (Throwable th4) {
                        o3.c.m("CSJ_VIDEO_MEDIA", "OP_RELEASE error: ", th4);
                    }
                    this.f30552i = false;
                    for (WeakReference<a.InterfaceC0404a> weakReference2 : this.f30566w) {
                        if (weakReference2 != null && weakReference2.get() != null) {
                            weakReference2.get().c(this);
                        }
                    }
                    this.f30553j = 203;
                    break;
                case 104:
                    if (this.f30553j == 202 || this.f30553j == 208) {
                        try {
                            this.f30548e.h();
                            o3.c.e("CSJ_VIDEO_MEDIA", "[video] OP_PREPARE_ASYNC execute , mMediaPlayer real prepareAsync !");
                            break;
                        } catch (Throwable th5) {
                            o3.c.m("CSJ_VIDEO_MEDIA", "OP_PREPARE_ASYNC error: ", th5);
                            break;
                        }
                    }
                    z10 = true;
                    break;
                case 105:
                    if (this.f30553j == 205 || this.f30553j == 206 || this.f30553j == 208 || this.f30553j == 207 || this.f30553j == 209) {
                        try {
                            this.f30548e.f();
                            this.f30553j = 208;
                            break;
                        } catch (Throwable th6) {
                            o3.c.f("CSJ_VIDEO_MEDIA", "OP_STOP error: ", th6);
                            break;
                        }
                    }
                    z10 = true;
                    break;
                case 106:
                    if (this.f30553j == 206 || this.f30553j == 207 || this.f30553j == 209) {
                        try {
                            this.f30548e.a(((Long) message.obj).longValue());
                            break;
                        } catch (Throwable th7) {
                            o3.c.f("CSJ_VIDEO_MEDIA", "OP_SEEKTO error: ", th7);
                            break;
                        }
                    }
                    z10 = true;
                    break;
                case 107:
                    Y();
                    if (this.f30553j == 201 || this.f30553j == 203) {
                        try {
                            l3.c cVar2 = (l3.c) message.obj;
                            if (TextUtils.isEmpty(cVar2.a())) {
                                cVar2.d(i3.b.e());
                            }
                            File file = new File(cVar2.a(), cVar2.A());
                            if (file.exists()) {
                                o3.c.e("CSJ_VIDEO_MEDIA", "setDataSource： try paly local:" + file.getAbsolutePath());
                                if (i3.b.g()) {
                                    A(file.getAbsolutePath());
                                } else {
                                    this.f30548e.a(file.getAbsolutePath());
                                }
                            } else {
                                o3.c.e("CSJ_VIDEO_MEDIA", "setDataSource： paly net:" + cVar2.z());
                                if (cVar2.f33691i == 1 && Build.VERSION.SDK_INT < 23) {
                                    this.f30548e.a(cVar2.z());
                                    o3.c.e("CSJ_VIDEO_MEDIA", "setDataSource： 直接设置 url" + cVar2.z());
                                } else if (Build.VERSION.SDK_INT >= 23) {
                                    this.f30548e.a(cVar2);
                                    o3.c.e("CSJ_VIDEO_MEDIA", "setDataSource： 使用MediaDataSource接口 url" + cVar2.z());
                                } else {
                                    String c10 = e3.a.a().c(cVar2);
                                    o3.c.g("CSJ_VIDEO_MEDIA", "setDataSource： 本地代理模式 local url = ", c10);
                                    if (c10 != null && i3.b.g() && c10.startsWith("file")) {
                                        A(Uri.parse(c10).getPath());
                                    } else {
                                        this.f30548e.a(c10);
                                    }
                                }
                            }
                            this.f30553j = 202;
                            break;
                        } catch (Throwable th8) {
                            o3.c.f("CSJ_VIDEO_MEDIA", "OP_SET_DATASOURCE error: ", th8);
                            break;
                        }
                    }
                    z10 = true;
                    break;
                case 110:
                    o3.c.h("CSJ_VIDEO_MEDIA", "resumeVideo:  OP_SET_DISPLAY ");
                    try {
                        this.f30548e.a((SurfaceHolder) message.obj);
                        this.f30548e.b(true);
                        r();
                        break;
                    } catch (Throwable th9) {
                        o3.c.f("CSJ_VIDEO_MEDIA", "OP_SET_DISPLAY error: ", th9);
                        break;
                    }
                case 111:
                    try {
                        if (Build.VERSION.SDK_INT >= 14) {
                            Surface surface = new Surface((SurfaceTexture) message.obj);
                            this.A = surface;
                            this.f30548e.h(surface);
                        }
                        this.f30548e.b(true);
                        r();
                        break;
                    } catch (Throwable th10) {
                        o3.c.f("CSJ_VIDEO_MEDIA", "OP_SET_SURFACE error: ", th10);
                        break;
                    }
            }
        }
        if (z10) {
            this.f30553j = 200;
            if (this.f30550g) {
                return;
            }
            l3.a aVar = new l3.a(308, i10);
            for (WeakReference<a.InterfaceC0404a> weakReference3 : this.f30566w) {
                if (weakReference3 != null && weakReference3.get() != null) {
                    weakReference3.get().a(this, aVar);
                }
            }
            this.f30550g = true;
        }
    }

    @Override // i3.a
    public void b() {
        o3.c.h("CSJ_VIDEO_MEDIA", "pause: ");
        this.f30555l.removeMessages(100);
        this.D = true;
        this.f30555l.sendEmptyMessage(101);
    }

    @Override // i3.a
    public void a(boolean z10) {
        i3.b.f().post(new j(z10));
    }

    @Override // i3.a
    public void a(a.InterfaceC0404a interfaceC0404a) {
        if (interfaceC0404a == null) {
            return;
        }
        for (WeakReference<a.InterfaceC0404a> weakReference : this.f30566w) {
            if (weakReference != null && weakReference.get() == interfaceC0404a) {
                return;
            }
        }
        this.f30566w.add(new WeakReference<>(interfaceC0404a));
    }
}
