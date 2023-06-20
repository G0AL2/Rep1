package o5;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import y3.k;

/* compiled from: ArtBitmapFactory.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final z5.c f34999a;

    /* renamed from: b  reason: collision with root package name */
    private final r5.a f35000b;

    public a(z5.c cVar, r5.a aVar) {
        this.f34999a = cVar;
        this.f35000b = aVar;
    }

    @Override // o5.f
    public c4.a<Bitmap> d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmap = this.f34999a.get(com.facebook.imageutils.a.d(i10, i11, config));
        k.b(Boolean.valueOf(bitmap.getAllocationByteCount() >= (i10 * i11) * com.facebook.imageutils.a.c(config)));
        bitmap.reconfigure(i10, i11, config);
        return this.f35000b.c(bitmap, this.f34999a);
    }
}
