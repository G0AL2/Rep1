package z5;

import android.graphics.Bitmap;
import java.util.Set;

/* compiled from: DummyTrackingInUseBitmapPool.java */
/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Bitmap> f40009a = y3.m.b();

    @Override // b4.e
    /* renamed from: f */
    public Bitmap get(int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i10 / 2.0d), Bitmap.Config.RGB_565);
        this.f40009a.add(createBitmap);
        return createBitmap;
    }

    @Override // b4.e, c4.h
    /* renamed from: g */
    public void a(Bitmap bitmap) {
        y3.k.g(bitmap);
        this.f40009a.remove(bitmap);
        bitmap.recycle();
    }
}
