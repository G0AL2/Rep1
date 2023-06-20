package z6;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;

/* compiled from: AbstractLayoutAnimation.java */
/* loaded from: classes.dex */
abstract class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<d, BaseInterpolator> f40060e = h6.e.g(d.LINEAR, new LinearInterpolator(), d.EASE_IN, new AccelerateInterpolator(), d.EASE_OUT, new DecelerateInterpolator(), d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* renamed from: a  reason: collision with root package name */
    private Interpolator f40061a;

    /* renamed from: b  reason: collision with root package name */
    private int f40062b;

    /* renamed from: c  reason: collision with root package name */
    protected b f40063c;

    /* renamed from: d  reason: collision with root package name */
    protected int f40064d;

    private static Interpolator c(d dVar, ReadableMap readableMap) {
        BaseInterpolator baseInterpolator;
        if (dVar.equals(d.SPRING)) {
            baseInterpolator = new n(n.a(readableMap));
        } else {
            baseInterpolator = f40060e.get(dVar);
        }
        if (baseInterpolator != null) {
            return baseInterpolator;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + dVar);
    }

    public final Animation a(View view, int i10, int i11, int i12, int i13) {
        if (e()) {
            Animation b10 = b(view, i10, i11, i12, i13);
            if (b10 != null) {
                b10.setDuration(this.f40064d * 1);
                b10.setStartOffset(this.f40062b * 1);
                b10.setInterpolator(this.f40061a);
            }
            return b10;
        }
        return null;
    }

    abstract Animation b(View view, int i10, int i11, int i12, int i13);

    public void d(ReadableMap readableMap, int i10) {
        this.f40063c = readableMap.hasKey("property") ? b.a(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i10 = readableMap.getInt("duration");
        }
        this.f40064d = i10;
        this.f40062b = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (readableMap.hasKey("type")) {
            this.f40061a = c(d.a(readableMap.getString("type")), readableMap);
            if (e()) {
                return;
            }
            throw new com.facebook.react.uimanager.h("Invalid layout animation : " + readableMap);
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    abstract boolean e();

    public void f() {
        this.f40063c = null;
        this.f40064d = 0;
        this.f40062b = 0;
        this.f40061a = null;
    }
}
