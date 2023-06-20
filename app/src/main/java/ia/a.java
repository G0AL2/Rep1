package ia;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: AnimationUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f31869a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f31870b = new r0.b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f31871c = new r0.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f31872d = new r0.c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f31873e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int b(int i10, int i11, float f10) {
        return i10 + Math.round(f10 * (i11 - i10));
    }
}
