package com.fyber.inneractive.sdk.player.controller;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.player.controller.q;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;

/* loaded from: classes.dex */
public class j extends k<q.a> implements q {
    public float A;
    public boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: y  reason: collision with root package name */
    public Runnable f17911y;

    /* renamed from: z  reason: collision with root package name */
    public float f17912z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.h(false);
            j.this.f17911y = null;
        }
    }

    public j(com.fyber.inneractive.sdk.player.c cVar, com.fyber.inneractive.sdk.player.ui.i iVar, y yVar, com.fyber.inneractive.sdk.config.global.s sVar, boolean z10) {
        super(cVar, iVar, yVar, sVar, z10);
        this.A = 0.0f;
        this.B = false;
        this.C = false;
        this.D = false;
        this.f17912z = yVar.b().b().intValue() / 100.0f;
        D();
    }

    public final void A() {
        if (this.f17920g == 0 || this.D) {
            return;
        }
        C();
        super.j();
        ((q.a) this.f17920g).c();
        IAlog.a("%sopening fullscreen", IAlog.a(this));
        this.D = true;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar != null) {
            com.fyber.inneractive.sdk.player.f fVar = (com.fyber.inneractive.sdk.player.f) cVar;
            fVar.a(fVar.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.EVENT_FULLSCREEN, com.fyber.inneractive.sdk.model.vast.q.EVENT_EXPAND);
        }
    }

    public final void B() {
        com.fyber.inneractive.sdk.player.c cVar;
        g gVar;
        com.fyber.inneractive.sdk.player.ui.i iVar;
        if (this.A < this.f17912z || (cVar = this.f17914a) == null || (gVar = cVar.f17724b) == null || gVar.f17891e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) || (iVar = this.f17917d) == null || iVar.d() || this.f17914a.f17724b.f17896j == null) {
            return;
        }
        if (((y) this.f17915b).f17077f.f16899a.booleanValue() || this.B) {
            b(IAConfigManager.J.f16873i.f17009b);
        }
    }

    public final void C() {
        if (this.f17911y != null) {
            IAlog.a("%sCancelling play runnable", IAlog.a(this));
            this.f17917d.removeCallbacks(this.f17911y);
            this.f17911y = null;
        }
    }

    public final void D() {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null || gVar.f17900n) {
            return;
        }
        if (((y) this.f17915b).f17077f.f16902d.booleanValue()) {
            this.f17914a.f17724b.b(false);
        } else if (o()) {
        } else {
            this.f17914a.f17724b.d(false);
        }
    }

    public void E() {
        com.fyber.inneractive.sdk.player.ui.i iVar;
        ImageView imageView;
        if (((y) this.f17915b).f17077f.f16907i != TapAction.FULLSCREEN && (imageView = (iVar = this.f17917d).f19785u) != null) {
            imageView.setVisibility(0);
            iVar.f19785u.setSelected(false);
        }
        x();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.ui.h
    public void a(boolean z10) {
        if (z10) {
            a(this.A);
        }
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(int i10) {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null || gVar.f17891e == com.fyber.inneractive.sdk.player.enums.b.Playing || this.f17911y != null) {
            return;
        }
        IAlog.a("%splayVideo %s", IAlog.a(this), this.f17917d);
        if (i10 == 0) {
            h(false);
            return;
        }
        a aVar = new a();
        this.f17911y = aVar;
        this.f17917d.postDelayed(aVar, i10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public void d(boolean z10) {
        g gVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar != null && (gVar = cVar.f17724b) != null && !gVar.f17891e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) {
            E();
        }
        com.fyber.inneractive.sdk.player.c cVar2 = this.f17914a;
        Bitmap bitmap = cVar2 != null ? cVar2.f17734l : null;
        if (bitmap != null) {
            this.f17917d.b(true);
            this.f17917d.setLastFrameBitmap(bitmap);
        }
        super.d(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public void destroy() {
        C();
        this.f17920g = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void h(boolean z10) {
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || cVar.f17724b == null) {
            return;
        }
        D();
        super.h(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    @SuppressLint({"NewApi"})
    public boolean i() {
        super.i();
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar != null && cVar.f17724b != null) {
            IAlog.a("%sconnectToTextureView playing state = %s", IAlog.a(this), this.f17914a.f17724b.f17891e);
            if (this.f17914a.f17724b.j()) {
                this.f17917d.c(!this.f17914a.f17733k);
                com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
                com.fyber.inneractive.sdk.player.ui.b bVar = new com.fyber.inneractive.sdk.player.ui.b();
                bVar.f19755b = false;
                iVar.a(new com.fyber.inneractive.sdk.player.ui.a(bVar));
                this.f17917d.b(false);
                D();
            }
        }
        a(this.A);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void j() {
        C();
        super.j();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public int l() {
        return IAConfigManager.J.f16886v.f16987b.a("VideoAdBufferingTimeout", 5, 1) * 1000;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public int n() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void p() {
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        if (this.f17917d.f19768e) {
            this.f17934u = true;
            c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public void pauseVideo() {
        C();
        super.pauseVideo();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void r() {
        A();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void s() {
        h();
        this.f17917d.a(false);
        y();
        C();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void t() {
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || cVar.f17724b == null) {
            return;
        }
        i();
        h(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void u() {
        B();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void v() {
        super.v();
        E();
        this.f17917d.b(false);
        this.B = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public boolean w() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void a(p0 p0Var) {
        TapAction tapAction = ((y) this.f17915b).f17077f.f16907i;
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || cVar.f17724b == null || this.A >= this.f17912z) {
            if (tapAction == TapAction.CTR) {
                Bitmap g10 = g(false);
                if (!a(false, VideoClickOrigin.CTA, p0Var) || g10 == null) {
                    return;
                }
                this.f17917d.setLastFrameBitmap(g10);
                this.f17917d.b(true);
            } else if (tapAction == TapAction.FULLSCREEN) {
                A();
            } else if (tapAction != TapAction.DO_NOTHING) {
                IAlog.a("%sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
            } else if (cVar != null) {
                cVar.g();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public void b(boolean z10) {
        com.fyber.inneractive.sdk.player.c cVar;
        g gVar;
        this.C = z10;
        if (!z10 || (cVar = this.f17914a) == null || (gVar = cVar.f17724b) == null || gVar.f17896j != null || !this.f17917d.f19768e || gVar.f17891e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed)) {
            return;
        }
        i();
        a(this.A);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.ui.h
    public void d() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        j();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public void a(float f10) {
        g gVar;
        this.A = f10;
        if (IAlog.f20222a >= 3) {
            IAlog.c("%sonVisibilityChanged called with: %s vfpl = %s vfpa = %s", IAlog.a(this), Float.valueOf(f10), Float.valueOf(this.f17912z), Float.valueOf(1.0f - this.f17912z));
        }
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null) {
            return;
        }
        if (gVar.f17891e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            if (f10 <= this.f17912z) {
                IAlog.d("%sonVisibilityChanged pausing player", IAlog.a(this));
                if (this.f17914a.f17724b.f17896j != null) {
                    this.B = false;
                    g(false);
                    C();
                    super.pauseVideo();
                    f(false);
                    return;
                }
                return;
            }
            return;
        }
        B();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public void a() {
        g gVar;
        IAlog.a("%sfullscreenExited called", IAlog.a(this));
        this.D = false;
        b(this.C);
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null) {
            return;
        }
        a(gVar.f17891e);
        a(this.f17914a.f17724b.c());
    }
}
