package sb;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p002firebaseauthapi.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class w implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private static final w f36971b = new w();

    /* renamed from: a  reason: collision with root package name */
    private final Handler f36972a = new zze(Looper.getMainLooper());

    private w() {
    }

    public static w a() {
        return f36971b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f36972a.post(runnable);
    }
}
