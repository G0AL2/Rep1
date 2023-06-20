package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.player.controller.g;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class f implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f17885a;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.InterfaceC0243g interfaceC0243g = f.this.f17885a.f17890d;
            if (interfaceC0243g != null) {
                p pVar = (p) interfaceC0243g;
                pVar.f17942a.f17917d.post(new o(pVar));
            }
        }
    }

    public f(g gVar) {
        this.f17885a = gVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        g gVar = this.f17885a;
        gVar.getClass();
        IAlog.a("%sonSurfaceTextureAvailable", IAlog.a(gVar));
        g gVar2 = this.f17885a;
        boolean z10 = !surfaceTexture.equals(gVar2.f17897k);
        gVar2.f17897k = surfaceTexture;
        if (gVar2.f17898l == null || z10) {
            gVar2.f17898l = new Surface(gVar2.f17897k);
        }
        gVar2.a(gVar2.f17898l);
        g.InterfaceC0243g interfaceC0243g = this.f17885a.f17890d;
        if (interfaceC0243g != null) {
            k kVar = ((p) interfaceC0243g).f17942a;
            kVar.getClass();
            IAlog.a("%sonSurfaceTextureAvailable", IAlog.a(kVar));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        g gVar = this.f17885a;
        gVar.getClass();
        IAlog.a("%s onSurfaceTextureDestroyed", IAlog.a(gVar));
        this.f17885a.k();
        this.f17885a.a((Surface) null);
        this.f17885a.f17901o = true;
        g gVar2 = this.f17885a;
        com.fyber.inneractive.sdk.player.enums.b bVar = gVar2.f17891e;
        if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar != com.fyber.inneractive.sdk.player.enums.b.Error && bVar != com.fyber.inneractive.sdk.player.enums.b.Idle) {
            IAlog.a("%s caching surface texture", IAlog.a(gVar2));
            g gVar3 = this.f17885a;
            gVar3.f17897k = surfaceTexture;
            gVar3.f17895i.post(new a());
            return false;
        }
        IAlog.a("%sReleasing surface texture", IAlog.a(gVar2));
        this.f17885a.f17897k = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        com.fyber.inneractive.sdk.player.c cVar;
        g gVar;
        g.InterfaceC0243g interfaceC0243g = this.f17885a.f17890d;
        if (interfaceC0243g != null && (cVar = ((p) interfaceC0243g).f17942a.f17914a) != null && (gVar = cVar.f17724b) != null) {
            gVar.f17895i.post(new i(gVar));
        }
        g gVar2 = this.f17885a;
        if (!gVar2.f17901o || (surface = gVar2.f17898l) == null) {
            return;
        }
        gVar2.a(surface);
        this.f17885a.f17901o = false;
    }
}
