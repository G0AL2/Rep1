package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.player.cache.c;
import com.fyber.inneractive.sdk.player.cache.h;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* loaded from: classes.dex */
public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f17808a;

    public f(h hVar) {
        this.f17808a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            h hVar = this.f17808a;
            c.f b10 = hVar.f17811b.b(hVar.a());
            h hVar2 = this.f17808a;
            hVar2.f17812c = b10;
            if (b10 == null) {
                c.C0241c a10 = hVar2.f17811b.a(hVar2.a());
                if (a10 == null) {
                    this.f17808a.f17823n = true;
                }
                if (a10 != null) {
                    h hVar3 = this.f17808a;
                    IAlog.d("%s | start | got an editor for %s", hVar3.f17810a, hVar3.a());
                    a10.a();
                }
            }
        } catch (IOException e10) {
            h hVar4 = this.f17808a;
            IAlog.a(String.format("%s | Exception raised starting a new caching process for %s", hVar4.f17810a, hVar4.a()), e10, new Object[0]);
            r.a("Exception raised starting a new caching process", e10.getMessage(), null, null);
        }
        h hVar5 = this.f17808a;
        if (hVar5.f17812c == null && !hVar5.f17823n) {
            h.e eVar = hVar5.f17817h;
            if (eVar != null) {
                eVar.start();
                return;
            }
            return;
        }
        h.b(hVar5, true);
    }
}
