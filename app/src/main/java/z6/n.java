package z6;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SimpleSpringInterpolator.java */
/* loaded from: classes.dex */
public class n implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float f40108a;

    public n(float f10) {
        this.f40108a = f10;
    }

    public static float a(ReadableMap readableMap) {
        if (readableMap.getType("springDamping").equals(ReadableType.Number)) {
            return (float) readableMap.getDouble("springDamping");
        }
        return 0.5f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        double pow = Math.pow(2.0d, (-10.0f) * f10);
        float f11 = this.f40108a;
        return (float) ((pow * Math.sin((((f10 - (f11 / 4.0f)) * 3.141592653589793d) * 2.0d) / f11)) + 1.0d);
    }
}
