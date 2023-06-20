package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import z0.h;

/* compiled from: SQLiteCopyOpenHelperFactory.kt */
/* loaded from: classes.dex */
public final class s0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f4044a;

    /* renamed from: b  reason: collision with root package name */
    private final File f4045b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable<InputStream> f4046c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f4047d;

    public s0(String str, File file, Callable<InputStream> callable, h.c cVar) {
        qe.k.f(cVar, "mDelegate");
        this.f4044a = str;
        this.f4045b = file;
        this.f4046c = callable;
        this.f4047d = cVar;
    }

    @Override // z0.h.c
    public z0.h a(h.b bVar) {
        qe.k.f(bVar, "configuration");
        return new r0(bVar.f39885a, this.f4044a, this.f4045b, this.f4046c, bVar.f39887c.f39883a, this.f4047d.a(bVar));
    }
}
