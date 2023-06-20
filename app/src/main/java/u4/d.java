package u4;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableProperties.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f37445a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37446b = false;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f37447c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f37448d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f37449e = -1;

    @SuppressLint({"Range"})
    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i10 = this.f37445a;
        if (i10 != -1) {
            drawable.setAlpha(i10);
        }
        if (this.f37446b) {
            drawable.setColorFilter(this.f37447c);
        }
        int i11 = this.f37448d;
        if (i11 != -1) {
            drawable.setDither(i11 != 0);
        }
        int i12 = this.f37449e;
        if (i12 != -1) {
            drawable.setFilterBitmap(i12 != 0);
        }
    }

    public void b(int i10) {
        this.f37445a = i10;
    }

    public void c(ColorFilter colorFilter) {
        this.f37447c = colorFilter;
        this.f37446b = colorFilter != null;
    }

    public void d(boolean z10) {
        this.f37448d = z10 ? 1 : 0;
    }

    public void e(boolean z10) {
        this.f37449e = z10 ? 1 : 0;
    }
}
