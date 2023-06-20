package u5;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.util.Map;
import w5.i;
import w5.j;

/* compiled from: DefaultImageDecoder.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f37565a;

    /* renamed from: b  reason: collision with root package name */
    private final c f37566b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.d f37567c;

    /* renamed from: d  reason: collision with root package name */
    private final c f37568d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<com.facebook.imageformat.c, c> f37569e;

    /* compiled from: DefaultImageDecoder.java */
    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // u5.c
        public w5.c a(w5.e eVar, int i10, j jVar, q5.b bVar) {
            com.facebook.imageformat.c A = eVar.A();
            if (A == com.facebook.imageformat.b.f14800a) {
                return b.this.d(eVar, i10, jVar, bVar);
            }
            if (A == com.facebook.imageformat.b.f14802c) {
                return b.this.c(eVar, i10, jVar, bVar);
            }
            if (A == com.facebook.imageformat.b.f14809j) {
                return b.this.b(eVar, i10, jVar, bVar);
            }
            if (A != com.facebook.imageformat.c.f14812b) {
                return b.this.e(eVar, bVar);
            }
            throw new u5.a("unknown image format", eVar);
        }
    }

    public b(c cVar, c cVar2, com.facebook.imagepipeline.platform.d dVar) {
        this(cVar, cVar2, dVar, null);
    }

    @Override // u5.c
    public w5.c a(w5.e eVar, int i10, j jVar, q5.b bVar) {
        InputStream C;
        c cVar;
        c cVar2 = bVar.f35925i;
        if (cVar2 != null) {
            return cVar2.a(eVar, i10, jVar, bVar);
        }
        com.facebook.imageformat.c A = eVar.A();
        if ((A == null || A == com.facebook.imageformat.c.f14812b) && (C = eVar.C()) != null) {
            A = com.facebook.imageformat.d.c(C);
            eVar.Q0(A);
        }
        Map<com.facebook.imageformat.c, c> map = this.f37569e;
        if (map != null && (cVar = map.get(A)) != null) {
            return cVar.a(eVar, i10, jVar, bVar);
        }
        return this.f37568d.a(eVar, i10, jVar, bVar);
    }

    public w5.c b(w5.e eVar, int i10, j jVar, q5.b bVar) {
        c cVar = this.f37566b;
        if (cVar != null) {
            return cVar.a(eVar, i10, jVar, bVar);
        }
        throw new u5.a("Animated WebP support not set up!", eVar);
    }

    public w5.c c(w5.e eVar, int i10, j jVar, q5.b bVar) {
        c cVar;
        if (eVar.Z() != -1 && eVar.z() != -1) {
            if (!bVar.f35922f && (cVar = this.f37565a) != null) {
                return cVar.a(eVar, i10, jVar, bVar);
            }
            return e(eVar, bVar);
        }
        throw new u5.a("image width or height is incorrect", eVar);
    }

    public w5.d d(w5.e eVar, int i10, j jVar, q5.b bVar) {
        c4.a<Bitmap> a10 = this.f37567c.a(eVar, bVar.f35923g, null, i10, bVar.f35927k);
        try {
            e6.b.a(bVar.f35926j, a10);
            w5.d dVar = new w5.d(a10, jVar, eVar.O(), eVar.w());
            dVar.e("is_rounded", false);
            return dVar;
        } finally {
            a10.close();
        }
    }

    public w5.d e(w5.e eVar, q5.b bVar) {
        c4.a<Bitmap> b10 = this.f37567c.b(eVar, bVar.f35923g, null, bVar.f35927k);
        try {
            e6.b.a(bVar.f35926j, b10);
            w5.d dVar = new w5.d(b10, i.f38227d, eVar.O(), eVar.w());
            dVar.e("is_rounded", false);
            return dVar;
        } finally {
            b10.close();
        }
    }

    public b(c cVar, c cVar2, com.facebook.imagepipeline.platform.d dVar, Map<com.facebook.imageformat.c, c> map) {
        this.f37568d = new a();
        this.f37565a = cVar;
        this.f37566b = cVar2;
        this.f37567c = dVar;
        this.f37569e = map;
    }
}
