package o5;

import android.graphics.Bitmap;

/* compiled from: SimpleBitmapReleaser.java */
/* loaded from: classes.dex */
public class h implements c4.h<Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private static h f35009a;

    private h() {
    }

    public static h b() {
        if (f35009a == null) {
            f35009a = new h();
        }
        return f35009a;
    }

    @Override // c4.h
    /* renamed from: c */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
