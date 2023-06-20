package o5;

import android.graphics.Bitmap;

/* compiled from: PlatformBitmapFactory.java */
/* loaded from: classes.dex */
public abstract class f {
    public c4.a<Bitmap> a(int i10, int i11) {
        return b(i10, i11, Bitmap.Config.ARGB_8888);
    }

    public c4.a<Bitmap> b(int i10, int i11, Bitmap.Config config) {
        return c(i10, i11, config, null);
    }

    public c4.a<Bitmap> c(int i10, int i11, Bitmap.Config config, Object obj) {
        return d(i10, i11, config);
    }

    public abstract c4.a<Bitmap> d(int i10, int i11, Bitmap.Config config);
}
