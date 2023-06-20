package p5;

import android.app.ActivityManager;
import android.os.Build;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultBitmapMemoryCacheParamsSupplier.java */
/* loaded from: classes.dex */
public class j implements y3.n<t> {

    /* renamed from: b  reason: collision with root package name */
    private static final long f35554b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f35555a;

    public j(ActivityManager activityManager) {
        this.f35555a = activityManager;
    }

    private int b() {
        int min = Math.min(this.f35555a.getMemoryClass() * 1048576, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT < 11) {
            return 8388608;
        }
        return min / 4;
    }

    @Override // y3.n
    /* renamed from: a */
    public t get() {
        return new t(b(), 256, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, f35554b);
    }
}
