package a6;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import t3.d;
import t3.i;
import y3.k;

/* compiled from: IterativeBoxBlurPostProcessor.java */
/* loaded from: classes.dex */
public class a extends b6.a {

    /* renamed from: c  reason: collision with root package name */
    private final int f77c;

    /* renamed from: d  reason: collision with root package name */
    private final int f78d;

    /* renamed from: e  reason: collision with root package name */
    private d f79e;

    public a(int i10, int i11) {
        k.b(Boolean.valueOf(i10 > 0));
        k.b(Boolean.valueOf(i11 > 0));
        this.f77c = i10;
        this.f78d = i11;
    }

    @Override // b6.a, b6.d
    public d b() {
        if (this.f79e == null) {
            this.f79e = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f77c), Integer.valueOf(this.f78d)));
        }
        return this.f79e;
    }

    @Override // b6.a
    public void e(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f77c, this.f78d);
    }
}
