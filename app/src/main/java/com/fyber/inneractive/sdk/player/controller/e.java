package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;

/* loaded from: classes.dex */
public class e extends k<s> {
    public boolean A;

    /* renamed from: y  reason: collision with root package name */
    public boolean f17883y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f17884z;

    public e(com.fyber.inneractive.sdk.player.c cVar, com.fyber.inneractive.sdk.player.ui.d dVar, z zVar, com.fyber.inneractive.sdk.config.global.s sVar, boolean z10, boolean z11, Skip skip, boolean z12) {
        super(cVar, dVar, zVar, sVar, z11, skip);
        this.f17883y = false;
        this.f17884z = false;
        this.f17883y = z10;
        this.A = z12;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.ui.h
    public void a(boolean z10) {
        com.fyber.inneractive.sdk.player.c cVar;
        g gVar;
        if (z10 && (cVar = this.f17914a) != null && (gVar = cVar.f17724b) != null && !gVar.f17891e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) && !this.f17917d.d()) {
            h(false);
        }
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.ui.h
    public void b() {
        if (this.f17921h) {
            q();
        } else {
            i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k, com.fyber.inneractive.sdk.player.controller.b
    public void d(boolean z10) {
        g gVar;
        com.fyber.inneractive.sdk.player.enums.b bVar;
        super.d(z10);
        if (this.f17883y) {
            this.f17917d.f();
            this.f17917d.d(false);
            this.f17919f = 0;
        }
        x();
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        this.f17917d.b((cVar == null || (gVar = cVar.f17724b) == null || ((bVar = gVar.f17891e) != com.fyber.inneractive.sdk.player.enums.b.Preparing && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared)) ? false : true);
        this.f17917d.c(false);
        com.fyber.inneractive.sdk.player.ui.i iVar = this.f17917d;
        com.fyber.inneractive.sdk.player.ui.b bVar2 = new com.fyber.inneractive.sdk.player.ui.b();
        bVar2.f19755b = false;
        iVar.a(new com.fyber.inneractive.sdk.player.ui.a(bVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    @Override // com.fyber.inneractive.sdk.player.controller.k
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i() {
        /*
            r7 = this;
            super.i()
            com.fyber.inneractive.sdk.player.c r0 = r7.f17914a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L76
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f17724b
            if (r0 == 0) goto L76
            boolean r0 = r7.f17884z
            if (r0 == 0) goto L12
            goto L76
        L12:
            r0 = 2
            com.fyber.inneractive.sdk.player.ui.i r3 = r7.f17917d     // Catch: java.lang.Throwable -> L2a
            android.content.Context r3 = r3.getContext()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: java.lang.Throwable -> L2a
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch: java.lang.Throwable -> L2a
            int r4 = r3.getRingerMode()     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.getStreamVolume(r0)     // Catch: java.lang.Throwable -> L2b
            goto L2c
        L2a:
            r4 = 0
        L2b:
            r3 = 0
        L2c:
            boolean r5 = r7.f17883y
            if (r5 != 0) goto L40
            com.fyber.inneractive.sdk.config.z r5 = r7.f17915b
            com.fyber.inneractive.sdk.config.y r5 = (com.fyber.inneractive.sdk.config.y) r5
            com.fyber.inneractive.sdk.config.a0 r5 = r5.f17077f
            java.lang.Boolean r5 = r5.f16902d
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L40
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            if (r5 != 0) goto L6e
            boolean r5 = r7.A
            if (r5 == 0) goto L55
            com.fyber.inneractive.sdk.config.z r5 = r7.f17915b
            com.fyber.inneractive.sdk.config.y r5 = (com.fyber.inneractive.sdk.config.y) r5
            com.fyber.inneractive.sdk.config.a0 r5 = r5.f17077f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.f16908j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r5 == r6) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = 0
        L56:
            if (r5 == 0) goto L59
            goto L6e
        L59:
            if (r3 <= 0) goto L71
            if (r4 != r0) goto L71
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = com.fyber.inneractive.sdk.util.IAlog.a(r7)
            r0[r2] = r3
            java.lang.String r3 = "%s setting default volume. unmuting player"
            com.fyber.inneractive.sdk.util.IAlog.a(r3, r0)
            r7.i(r2)
            goto L71
        L6e:
            r7.f(r2)
        L71:
            r7.z()
            r7.f17884z = r1
        L76:
            r7.h(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.e.i():boolean");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public int l() {
        return IAConfigManager.J.f16886v.f16987b.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.controller.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int n() {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.J
            com.fyber.inneractive.sdk.config.i r0 = r0.f16886v
            com.fyber.inneractive.sdk.config.h r0 = r0.f16987b
            com.fyber.inneractive.sdk.config.z r1 = r6.f17915b
            com.fyber.inneractive.sdk.config.enums.Skip r2 = r6.f17937x
            java.lang.String r3 = "vast_configuration"
            com.fyber.inneractive.sdk.config.f r0 = r0.a(r3)
            java.lang.String r3 = "skip_d"
            r0.getClass()
            r4 = -1
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.f16936a     // Catch: java.lang.Exception -> L2b
            boolean r5 = r5.containsKey(r3)     // Catch: java.lang.Exception -> L2b
            if (r5 == 0) goto L2b
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f16936a     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L2b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L2b
            goto L2c
        L2b:
            r0 = -1
        L2c:
            int r0 = java.lang.Math.max(r0, r4)
            if (r0 <= r4) goto L33
            goto L4b
        L33:
            if (r2 != 0) goto L3b
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.y) r1
            com.fyber.inneractive.sdk.config.a0 r0 = r1.f17077f
            com.fyber.inneractive.sdk.config.enums.Skip r2 = r0.f16906h
        L3b:
            com.fyber.inneractive.sdk.config.enums.Skip r0 = com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT
            if (r2 != r0) goto L43
            r0 = 99999(0x1869f, float:1.40128E-40)
            goto L4b
        L43:
            java.lang.Integer r0 = r2.value()
            int r0 = r0.intValue()
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.e.n():int");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void p() {
        this.f17934u = true;
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void r() {
        ListenerT listenert = this.f17920g;
        if (listenert != 0) {
            listenert.k();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void t() {
        this.f17917d.d(true);
        x();
        k();
        i();
        h(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void v() {
        super.v();
        this.f17917d.b(false);
        if (this.f17883y) {
            this.f17917d.f();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public boolean w() {
        return !this.f17883y;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void y() {
        g gVar;
        super.y();
        com.fyber.inneractive.sdk.player.c cVar = this.f17914a;
        if (cVar == null || (gVar = cVar.f17724b) == null || !gVar.f17891e.equals(com.fyber.inneractive.sdk.player.enums.b.Completed) || !this.f17883y) {
            return;
        }
        this.f17917d.f();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.k
    public void a(p0 p0Var) {
        j.b bVar;
        TapAction tapAction = ((y) this.f17915b).f17077f.f16907i;
        if (tapAction == TapAction.CTR) {
            a(false, VideoClickOrigin.VIDEO, p0Var);
        } else if (tapAction != TapAction.FULLSCREEN && tapAction != TapAction.DO_NOTHING) {
            IAlog.a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
        } else {
            String a10 = ((com.fyber.inneractive.sdk.config.global.features.j) this.f17916c.a(com.fyber.inneractive.sdk.config.global.features.j.class)).a("click_action", "none");
            j.b[] values = j.b.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    bVar = values[i10];
                    if (a10.equalsIgnoreCase(bVar.f16959a)) {
                        break;
                    }
                    i10++;
                } else {
                    bVar = j.b.NONE;
                    break;
                }
            }
            if (bVar.equals(j.b.OPEN)) {
                a(false, VideoClickOrigin.VIDEO, p0Var);
            }
        }
    }
}
