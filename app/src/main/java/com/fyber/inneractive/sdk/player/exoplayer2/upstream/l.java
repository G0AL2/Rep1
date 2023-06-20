package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class l implements a0<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.p f19477a;

    /* renamed from: b  reason: collision with root package name */
    public int f19478b;

    /* renamed from: c  reason: collision with root package name */
    public long f19479c;

    /* renamed from: d  reason: collision with root package name */
    public long f19480d;

    /* renamed from: e  reason: collision with root package name */
    public long f19481e;

    /* renamed from: f  reason: collision with root package name */
    public long f19482f;

    /* renamed from: g  reason: collision with root package name */
    public long f19483g;

    public l(Handler handler, d dVar) {
        this(null, null, 2000);
    }

    public synchronized void a(Object obj, j jVar) {
        if (this.f19478b == 0) {
            this.f19479c = SystemClock.elapsedRealtime();
        }
        this.f19478b++;
    }

    public l(Handler handler, d dVar, int i10) {
        this.f19477a = new com.fyber.inneractive.sdk.player.exoplayer2.util.p(i10);
        this.f19483g = -1L;
    }

    public synchronized void a(Object obj) {
        p.c cVar;
        float f10;
        int i10 = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f19478b > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = (int) (elapsedRealtime - this.f19479c);
        long j10 = i11;
        this.f19481e += j10;
        long j11 = this.f19482f;
        long j12 = this.f19480d;
        this.f19482f = j11 + j12;
        if (i11 > 0) {
            float f11 = (float) ((8000 * j12) / j10);
            com.fyber.inneractive.sdk.player.exoplayer2.util.p pVar = this.f19477a;
            int sqrt = (int) Math.sqrt(j12);
            if (pVar.f19592d != 1) {
                Collections.sort(pVar.f19590b, com.fyber.inneractive.sdk.player.exoplayer2.util.p.f19587h);
                pVar.f19592d = 1;
            }
            int i12 = pVar.f19595g;
            if (i12 > 0) {
                p.c[] cVarArr = pVar.f19591c;
                int i13 = i12 - 1;
                pVar.f19595g = i13;
                cVar = cVarArr[i13];
            } else {
                cVar = new p.c();
            }
            int i14 = pVar.f19593e;
            pVar.f19593e = i14 + 1;
            cVar.f19596a = i14;
            cVar.f19597b = sqrt;
            cVar.f19598c = f11;
            pVar.f19590b.add(cVar);
            pVar.f19594f += sqrt;
            while (true) {
                int i15 = pVar.f19594f;
                int i16 = pVar.f19589a;
                if (i15 <= i16) {
                    break;
                }
                int i17 = i15 - i16;
                p.c cVar2 = pVar.f19590b.get(0);
                int i18 = cVar2.f19597b;
                if (i18 <= i17) {
                    pVar.f19594f -= i18;
                    pVar.f19590b.remove(0);
                    int i19 = pVar.f19595g;
                    if (i19 < 5) {
                        p.c[] cVarArr2 = pVar.f19591c;
                        pVar.f19595g = i19 + 1;
                        cVarArr2[i19] = cVar2;
                    }
                } else {
                    cVar2.f19597b = i18 - i17;
                    pVar.f19594f -= i17;
                }
            }
            if (this.f19481e >= Constants.MIN_PROGRESS_TIME || this.f19482f >= 524288) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.p pVar2 = this.f19477a;
                if (pVar2.f19592d != 0) {
                    Collections.sort(pVar2.f19590b, com.fyber.inneractive.sdk.player.exoplayer2.util.p.f19588i);
                    pVar2.f19592d = 0;
                }
                float f12 = 0.5f * pVar2.f19594f;
                int i20 = 0;
                while (true) {
                    if (i10 < pVar2.f19590b.size()) {
                        p.c cVar3 = pVar2.f19590b.get(i10);
                        i20 += cVar3.f19597b;
                        if (i20 >= f12) {
                            f10 = cVar3.f19598c;
                            break;
                        }
                        i10++;
                    } else if (pVar2.f19590b.isEmpty()) {
                        f10 = Float.NaN;
                    } else {
                        ArrayList<p.c> arrayList = pVar2.f19590b;
                        f10 = arrayList.get(arrayList.size() - 1).f19598c;
                    }
                }
                this.f19483g = Float.isNaN(f10) ? -1L : f10;
            }
        }
        int i21 = this.f19478b - 1;
        this.f19478b = i21;
        if (i21 > 0) {
            this.f19479c = elapsedRealtime;
        }
        this.f19480d = 0L;
    }
}
