package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class a extends g {

    /* renamed from: p  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.mediaplayer.a f17859p;

    /* renamed from: q  reason: collision with root package name */
    public int f17860q;

    /* renamed from: r  reason: collision with root package name */
    public int f17861r;

    /* renamed from: s  reason: collision with root package name */
    public int f17862s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f17863t;

    public a(Context context) {
        super(context);
        this.f17860q = 0;
        this.f17861r = 2;
        this.f17862s = 0;
        this.f17863t = false;
        IAlog.a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            IAlog.a("%s seek to called with = %d mPlayAfterSeek = %s", aVar.c(), Integer.valueOf(i10), Boolean.valueOf(z10));
            if (!aVar.b()) {
                IAlog.a("%s seek called when player is not ready!", aVar.c());
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = aVar.f19706b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Seeking;
            if (bVar == bVar2) {
                IAlog.a("%s seek called when player is already seeking!", aVar.c());
                return;
            }
            aVar.a(bVar2);
            aVar.f19707c = z10;
            aVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.b(aVar, i10));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void b() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            aVar.reset();
            this.f17859p.release();
            this.f17859p = null;
        }
        super.b();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int c() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void d(boolean z10) {
        c(false);
        if (i() || !this.f17900n) {
            this.f17900n = z10;
            com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
            if (aVar != null) {
                IAlog.a("%s unmute", aVar.c());
                aVar.f19708d = false;
                if (aVar.b()) {
                    aVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.c(aVar));
                } else {
                    IAlog.a("%s unmute called when player is not ready!", aVar.c());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public Bitmap e() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public String f() {
        return "media";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int g() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            return aVar.f19724t;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int h() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            return aVar.f19723s;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean i() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            return aVar.f19708d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void k() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            aVar.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void l() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            aVar.start();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void b(boolean z10) {
        c(true);
        if (i() && this.f17900n) {
            return;
        }
        this.f17900n = z10;
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(Surface surface) {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            aVar.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int d() {
        com.fyber.inneractive.sdk.player.mediaplayer.a aVar = this.f17859p;
        if (aVar != null) {
            return aVar.f19722r;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(boolean z10) {
        if (this.f17859p == null) {
            IAlog.a("MediaPlayerController: creating media player", new Object[0]);
            this.f17859p = new com.fyber.inneractive.sdk.player.mediaplayer.a(this.f17887a, this, this.f17895i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(String str, int i10) {
        this.f17859p.a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(int i10) {
        this.f17895i.post(new g.b(i10));
        if (i10 >= d()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Completed);
        } else if (i10 == this.f17860q) {
            IAlog.a("%sVideo is stuck! Progress doesn't change", IAlog.a(this));
            int i11 = this.f17862s + 1;
            this.f17862s = i11;
            if (i11 == this.f17861r) {
                a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                this.f17863t = true;
            }
        } else if (this.f17863t) {
            IAlog.a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.a(this));
            a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            this.f17862s = 0;
            this.f17863t = false;
        }
        this.f17860q = i10;
    }
}
