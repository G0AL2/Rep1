package r5;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import u3.e;

/* compiled from: DiskStorageCacheFactory.java */
/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private d f36238a;

    public c(d dVar) {
        this.f36238a = dVar;
    }

    public static u3.e b(u3.c cVar, u3.d dVar) {
        return c(cVar, dVar, Executors.newSingleThreadExecutor());
    }

    public static u3.e c(u3.c cVar, u3.d dVar, Executor executor) {
        return new u3.e(dVar, cVar.h(), new e.c(cVar.k(), cVar.j(), cVar.f()), cVar.e(), cVar.d(), cVar.g(), executor, cVar.i());
    }

    @Override // r5.g
    public u3.i a(u3.c cVar) {
        return b(cVar, this.f36238a.a(cVar));
    }
}
