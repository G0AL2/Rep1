package e5;

import android.graphics.Bitmap;
import f4.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import o5.f;
import p5.i;
import t3.d;
import w5.c;
import y3.n;

/* compiled from: ExperimentalBitmapAnimationDrawableFactory.java */
/* loaded from: classes.dex */
public class a implements v5.a {

    /* renamed from: a  reason: collision with root package name */
    private final m5.a f29570a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f29571b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f29572c;

    /* renamed from: d  reason: collision with root package name */
    private final b f29573d;

    /* renamed from: e  reason: collision with root package name */
    private final f f29574e;

    /* renamed from: f  reason: collision with root package name */
    private final i<d, c> f29575f;

    /* renamed from: g  reason: collision with root package name */
    private final n<Integer> f29576g;

    /* renamed from: h  reason: collision with root package name */
    private final n<Integer> f29577h;

    public a(m5.a aVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, b bVar, f fVar, i<d, c> iVar, n<Integer> nVar, n<Integer> nVar2) {
        this.f29570a = aVar;
        this.f29571b = scheduledExecutorService;
        this.f29572c = executorService;
        this.f29573d = bVar;
        this.f29574e = fVar;
        this.f29575f = iVar;
        this.f29576g = nVar;
        this.f29577h = nVar2;
    }

    private k5.a c(k5.c cVar) {
        throw null;
    }

    private m5.b d(k5.c cVar) {
        throw null;
    }

    private y4.a e(k5.c cVar) {
        b5.d dVar;
        b5.b bVar;
        k5.a c10 = c(cVar);
        z4.b f10 = f(cVar);
        c5.b bVar2 = new c5.b(f10, c10);
        int intValue = this.f29577h.get().intValue();
        if (intValue > 0) {
            b5.d dVar2 = new b5.d(intValue);
            bVar = g(bVar2);
            dVar = dVar2;
        } else {
            dVar = null;
            bVar = null;
        }
        return y4.c.n(new z4.a(this.f29574e, f10, new c5.a(c10), bVar2, dVar, bVar), this.f29573d, this.f29571b);
    }

    private z4.b f(k5.c cVar) {
        int intValue = this.f29576g.get().intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    return new a5.c();
                }
                return new a5.b();
            }
            return new a5.a(d(cVar), false);
        }
        return new a5.a(d(cVar), true);
    }

    private b5.b g(z4.c cVar) {
        return new b5.c(this.f29574e, cVar, Bitmap.Config.ARGB_8888, this.f29572c);
    }

    @Override // v5.a
    public boolean b(c cVar) {
        return cVar instanceof w5.a;
    }

    @Override // v5.a
    /* renamed from: h */
    public d5.a a(c cVar) {
        return new d5.a(e(((w5.a) cVar).l()));
    }
}
