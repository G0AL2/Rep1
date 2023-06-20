package p5;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultEncodedMemoryCacheParamsSupplier.java */
/* loaded from: classes.dex */
public class l implements y3.n<t> {

    /* renamed from: a  reason: collision with root package name */
    private static final long f35557a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    @Override // y3.n
    /* renamed from: a */
    public t get() {
        int b10 = b();
        return new t(b10, Api.BaseClientBuilder.API_PRIORITY_OTHER, b10, Api.BaseClientBuilder.API_PRIORITY_OTHER, b10 / 8, f35557a);
    }
}
