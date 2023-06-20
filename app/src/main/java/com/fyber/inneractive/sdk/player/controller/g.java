package com.fyber.inneractive.sdk.player.controller;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.player.mediaplayer.a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class g implements a.l {

    /* renamed from: a  reason: collision with root package name */
    public Context f17887a;

    /* renamed from: d  reason: collision with root package name */
    public InterfaceC0243g f17890d;

    /* renamed from: f  reason: collision with root package name */
    public d f17892f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17893g;

    /* renamed from: i  reason: collision with root package name */
    public Handler f17895i;

    /* renamed from: j  reason: collision with root package name */
    public TextureView f17896j;

    /* renamed from: k  reason: collision with root package name */
    public SurfaceTexture f17897k;

    /* renamed from: l  reason: collision with root package name */
    public Surface f17898l;

    /* renamed from: m  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f17899m;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17901o;

    /* renamed from: e  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.b f17891e = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* renamed from: n  reason: collision with root package name */
    public boolean f17900n = false;

    /* renamed from: b  reason: collision with root package name */
    public List<f> f17888b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<e> f17889c = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.e f17894h = new com.fyber.inneractive.sdk.player.e(this);

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Exception f17902a;

        public a(Exception exc) {
            this.f17902a = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if (gVar.f17893g) {
                return;
            }
            try {
                List<f> list = gVar.f17888b;
                if (list != null) {
                    for (f fVar : list) {
                        fVar.a(this.f17902a);
                    }
                }
            } catch (Exception e10) {
                if (IAlog.f20222a <= 3) {
                    g gVar2 = g.this;
                    gVar2.getClass();
                    IAlog.a("%sonPlayerError callback threw an exception!", IAlog.a(gVar2));
                    e10.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17904a;

        public b(int i10) {
            this.f17904a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<e> list = g.this.f17889c;
                if (list != null) {
                    for (e eVar : list) {
                        eVar.a(this.f17904a);
                    }
                }
            } catch (Exception e10) {
                if (IAlog.f20222a <= 3) {
                    g gVar = g.this;
                    gVar.getClass();
                    IAlog.a("%sonPlayerProgress callback threw an exception!", IAlog.a(gVar));
                    e10.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f17906a;

        public c(com.fyber.inneractive.sdk.player.enums.b bVar) {
            this.f17906a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar;
            TextureView textureView;
            TextureView textureView2;
            com.fyber.inneractive.sdk.player.enums.b bVar;
            TextureView textureView3;
            try {
                try {
                    List<f> list = g.this.f17888b;
                    if (list != null) {
                        for (f fVar : list) {
                            fVar.a(this.f17906a);
                        }
                    }
                    bVar = this.f17906a;
                } catch (Exception e10) {
                    if (IAlog.f20222a <= 3) {
                        g gVar2 = g.this;
                        gVar2.getClass();
                        IAlog.a("%sonPlayerStateChanged callback threw an exception!", IAlog.a(gVar2));
                        e10.printStackTrace();
                    }
                    com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f17906a;
                    if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Error && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Completed) {
                        return;
                    }
                    g gVar3 = g.this;
                    if (gVar3.f17897k != null && (textureView = gVar3.f17896j) != null && textureView.getParent() != null) {
                        ((ViewGroup) g.this.f17896j.getParent()).removeView(g.this.f17896j);
                    }
                    gVar = g.this;
                    gVar.f17896j = null;
                }
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                    g gVar4 = g.this;
                    if (gVar4.f17897k != null && (textureView3 = gVar4.f17896j) != null && textureView3.getParent() != null) {
                        ((ViewGroup) g.this.f17896j.getParent()).removeView(g.this.f17896j);
                    }
                    gVar = g.this;
                    gVar.f17896j = null;
                    gVar.f17897k = null;
                }
            } catch (Throwable th) {
                com.fyber.inneractive.sdk.player.enums.b bVar3 = this.f17906a;
                if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                    g gVar5 = g.this;
                    if (gVar5.f17897k != null && (textureView2 = gVar5.f17896j) != null && textureView2.getParent() != null) {
                        ((ViewGroup) g.this.f17896j.getParent()).removeView(g.this.f17896j);
                    }
                    g gVar6 = g.this;
                    gVar6.f17896j = null;
                    gVar6.f17897k = null;
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(int i10);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(com.fyber.inneractive.sdk.player.enums.b bVar);

        void a(Exception exc);

        void e();

        void e(boolean z10);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0243g {
    }

    public g(Context context) {
        this.f17887a = null;
        this.f17887a = context.getApplicationContext();
        this.f17895i = new Handler(context.getMainLooper());
        a(true);
    }

    public abstract void a(int i10, boolean z10);

    public abstract void a(Surface surface);

    public abstract void a(String str, int i10);

    public abstract void a(boolean z10);

    public abstract boolean a();

    @SuppressLint({"NewApi"})
    public void b() {
        IAlog.a("%sdestroy started", IAlog.a(this));
        m();
        this.f17894h = null;
        Handler handler = this.f17895i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        List<f> list = this.f17888b;
        if (list != null) {
            list.clear();
        }
        this.f17888b = null;
        this.f17892f = null;
        this.f17893g = true;
        IAlog.a("%sdestroy finished", IAlog.a(this));
    }

    public abstract void b(boolean z10);

    public abstract int c();

    public final void c(boolean z10) {
        com.fyber.inneractive.sdk.measurement.g gVar;
        d dVar = this.f17892f;
        if (dVar == null || (gVar = com.fyber.inneractive.sdk.player.c.this.f17731i) == null) {
            return;
        }
        if (z10) {
            if (gVar.f17341c != null) {
                IAlog.a("%s mute", "OMVideo");
                try {
                    gVar.f17341c.volumeChange(0.0f);
                } catch (Throwable th) {
                    gVar.a(th);
                }
            }
        } else if (gVar.f17341c != null) {
            IAlog.a("%s unMute", "OMVideo");
            try {
                gVar.f17341c.volumeChange(1.0f);
            } catch (Throwable th2) {
                gVar.a(th2);
            }
        }
    }

    public abstract int d();

    public abstract void d(boolean z10);

    public abstract Bitmap e();

    public abstract String f();

    public abstract int g();

    public abstract int h();

    public abstract boolean i();

    public boolean j() {
        return this.f17891e == com.fyber.inneractive.sdk.player.enums.b.Playing;
    }

    public abstract void k();

    public abstract void l();

    public void m() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.fyber.inneractive.sdk.player.e eVar = this.f17894h;
        if (eVar == null || (scheduledThreadPoolExecutor = eVar.f17947b) == null) {
            return;
        }
        scheduledThreadPoolExecutor.shutdownNow();
        eVar.f17947b = null;
    }

    public void a(Exception exc) {
        a(com.fyber.inneractive.sdk.player.enums.b.Error);
        IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(this), exc);
        this.f17895i.post(new a(exc));
        m();
    }

    public void a(int i10) {
        this.f17895i.post(new b(i10));
    }

    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.f17891e) {
            return;
        }
        this.f17891e = bVar;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            com.fyber.inneractive.sdk.player.e eVar = this.f17894h;
            if (eVar != null && eVar.f17947b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                eVar.f17947b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(eVar.f17948c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            m();
        }
        this.f17895i.post(new c(bVar));
    }
}
