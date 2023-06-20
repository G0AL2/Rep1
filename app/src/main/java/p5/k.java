package p5;

import android.net.Uri;

/* compiled from: DefaultCacheKeyFactory.java */
/* loaded from: classes.dex */
public class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private static k f35556a;

    protected k() {
    }

    public static synchronized k f() {
        k kVar;
        synchronized (k.class) {
            if (f35556a == null) {
                f35556a = new k();
            }
            kVar = f35556a;
        }
        return kVar;
    }

    @Override // p5.f
    public t3.d a(b6.b bVar, Object obj) {
        return d(bVar, bVar.q(), obj);
    }

    @Override // p5.f
    public t3.d b(b6.b bVar, Object obj) {
        t3.d dVar;
        String str;
        b6.d g10 = bVar.g();
        if (g10 != null) {
            t3.d b10 = g10.b();
            str = g10.getClass().getName();
            dVar = b10;
        } else {
            dVar = null;
            str = null;
        }
        return new b(e(bVar.q()).toString(), bVar.m(), bVar.o(), bVar.d(), dVar, str, obj);
    }

    @Override // p5.f
    public t3.d c(b6.b bVar, Object obj) {
        return new b(e(bVar.q()).toString(), bVar.m(), bVar.o(), bVar.d(), null, null, obj);
    }

    @Override // p5.f
    public t3.d d(b6.b bVar, Uri uri, Object obj) {
        return new t3.i(e(uri).toString());
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}
