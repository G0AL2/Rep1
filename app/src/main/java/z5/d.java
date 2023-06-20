package z5;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolBackend.java */
/* loaded from: classes.dex */
public class d extends m<Bitmap> {
    @Override // z5.m, z5.p
    /* renamed from: c */
    public Bitmap get(int i10) {
        Bitmap bitmap = (Bitmap) super.get(i10);
        if (bitmap == null || !e(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // z5.p
    /* renamed from: d */
    public int a(Bitmap bitmap) {
        return com.facebook.imageutils.a.e(bitmap);
    }

    protected boolean e(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            z3.a.M("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            z3.a.M("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    @Override // z5.m, z5.p
    /* renamed from: f */
    public void put(Bitmap bitmap) {
        if (e(bitmap)) {
            super.put(bitmap);
        }
    }
}
