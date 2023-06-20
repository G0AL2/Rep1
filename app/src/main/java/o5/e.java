package o5;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

/* compiled from: HoneycombBitmapFactory.java */
@TargetApi(11)
/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: e  reason: collision with root package name */
    private static final String f35004e = "e";

    /* renamed from: a  reason: collision with root package name */
    private final b f35005a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.d f35006b;

    /* renamed from: c  reason: collision with root package name */
    private final r5.a f35007c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35008d;

    public e(b bVar, com.facebook.imagepipeline.platform.d dVar, r5.a aVar) {
        this.f35005a = bVar;
        this.f35006b = dVar;
        this.f35007c = aVar;
    }

    private c4.a<Bitmap> e(int i10, int i11, Bitmap.Config config) {
        return this.f35007c.c(Bitmap.createBitmap(i10, i11, config), h.b());
    }

    @Override // o5.f
    @TargetApi(12)
    public c4.a<Bitmap> d(int i10, int i11, Bitmap.Config config) {
        if (this.f35008d) {
            return e(i10, i11, config);
        }
        c4.a<b4.g> a10 = this.f35005a.a((short) i10, (short) i11);
        try {
            w5.e eVar = new w5.e(a10);
            eVar.Q0(com.facebook.imageformat.b.f14800a);
            c4.a<Bitmap> c10 = this.f35006b.c(eVar, config, null, a10.y().size());
            if (!c10.y().isMutable()) {
                c4.a.w(c10);
                this.f35008d = true;
                z3.a.K(f35004e, "Immutable bitmap returned by decoder");
                c4.a<Bitmap> e10 = e(i10, i11, config);
                w5.e.d(eVar);
                return e10;
            }
            c10.y().setHasAlpha(true);
            c10.y().eraseColor(0);
            w5.e.d(eVar);
            return c10;
        } finally {
            a10.close();
        }
    }
}
