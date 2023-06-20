package i2;

import android.util.Log;
import com.airbnb.lottie.g0;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LogcatLogger.java */
/* loaded from: classes.dex */
public class c implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f31513a = new HashSet();

    @Override // com.airbnb.lottie.g0
    public void a(String str) {
        d(str, null);
    }

    @Override // com.airbnb.lottie.g0
    public void b(String str, Throwable th) {
        if (com.airbnb.lottie.c.f5729a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // com.airbnb.lottie.g0
    public void c(String str) {
        e(str, null);
    }

    @Override // com.airbnb.lottie.g0
    public void d(String str, Throwable th) {
        Set<String> set = f31513a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    public void e(String str, Throwable th) {
        if (com.airbnb.lottie.c.f5729a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
