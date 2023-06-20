package z5;

import android.graphics.Bitmap;

/* compiled from: DummyBitmapPool.java */
/* loaded from: classes.dex */
public class j implements c {
    @Override // b4.e
    /* renamed from: f */
    public Bitmap get(int i10) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i10 / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // b4.e, c4.h
    /* renamed from: g */
    public void a(Bitmap bitmap) {
        y3.k.g(bitmap);
        bitmap.recycle();
    }
}
