package qa;

import android.content.Context;
import android.graphics.Color;
import ua.b;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f36054a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36055b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36056c;

    /* renamed from: d  reason: collision with root package name */
    private final float f36057d;

    public a(Context context) {
        this.f36054a = b.b(context, ha.b.f31144o, false);
        this.f36055b = na.a.a(context, ha.b.f31143n, 0);
        this.f36056c = na.a.a(context, ha.b.f31141l, 0);
        this.f36057d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i10) {
        return z.a.f(i10, 255) == this.f36056c;
    }

    public float a(float f10) {
        float f11 = this.f36057d;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        float a10 = a(f10);
        return z.a.f(na.a.f(z.a.f(i10, 255), this.f36055b, a10), Color.alpha(i10));
    }

    public int c(int i10, float f10) {
        return (this.f36054a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f36054a;
    }
}
