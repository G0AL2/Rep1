package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.h;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f19035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Looper looper) {
        super(looper);
        this.f19035a = gVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        g gVar = this.f19035a;
        gVar.getClass();
        switch (message.what) {
            case 0:
                gVar.f19048m--;
                return;
            case 1:
                gVar.f19046k = message.arg1;
                Iterator<e.a> it = gVar.f19041f.iterator();
                while (it.hasNext()) {
                    it.next().a(gVar.f19045j, gVar.f19046k);
                }
                return;
            case 2:
                gVar.f19049n = message.arg1 != 0;
                Iterator<e.a> it2 = gVar.f19041f.iterator();
                while (it2.hasNext()) {
                    it2.next().a(gVar.f19049n);
                }
                return;
            case 3:
                if (gVar.f19048m == 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h) message.obj;
                    gVar.f19044i = true;
                    gVar.f19052q = hVar.f19370a;
                    gVar.f19053r = hVar.f19371b;
                    gVar.f19037b.a(hVar.f19372c);
                    Iterator<e.a> it3 = gVar.f19041f.iterator();
                    while (it3.hasNext()) {
                        it3.next().a(gVar.f19052q, gVar.f19053r);
                    }
                    return;
                }
                return;
            case 4:
                int i10 = gVar.f19047l - 1;
                gVar.f19047l = i10;
                if (i10 == 0) {
                    gVar.f19055t = (h.b) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<e.a> it4 = gVar.f19041f.iterator();
                        while (it4.hasNext()) {
                            it4.next().a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (gVar.f19047l == 0) {
                    gVar.f19055t = (h.b) message.obj;
                    Iterator<e.a> it5 = gVar.f19041f.iterator();
                    while (it5.hasNext()) {
                        it5.next().a();
                    }
                    return;
                }
                return;
            case 6:
                h.d dVar = (h.d) message.obj;
                gVar.f19047l -= dVar.f19113d;
                if (gVar.f19048m == 0) {
                    gVar.f19050o = dVar.f19110a;
                    gVar.f19051p = dVar.f19111b;
                    gVar.f19055t = dVar.f19112c;
                    Iterator<e.a> it6 = gVar.f19041f.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(gVar.f19050o, gVar.f19051p);
                    }
                    return;
                }
                return;
            case 7:
                m mVar = (m) message.obj;
                if (gVar.f19054s.equals(mVar)) {
                    return;
                }
                gVar.f19054s = mVar;
                Iterator<e.a> it7 = gVar.f19041f.iterator();
                while (it7.hasNext()) {
                    it7.next().a(mVar);
                }
                return;
            case 8:
                d dVar2 = (d) message.obj;
                Iterator<e.a> it8 = gVar.f19041f.iterator();
                while (it8.hasNext()) {
                    it8.next().a(dVar2);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
