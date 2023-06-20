package sb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: c  reason: collision with root package name */
    private static o f36946c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f36947a = false;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f36948b;

    private o() {
    }

    public static o a() {
        if (f36946c == null) {
            f36946c = new o();
        }
        return f36946c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        o oVar = f36946c;
        oVar.f36947a = false;
        if (oVar.f36948b != null) {
            v0.a.b(context).e(f36946c.f36948b);
        }
        f36946c.f36948b = null;
    }

    private final void d(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f36948b = broadcastReceiver;
        v0.a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    public final boolean c(Activity activity, TaskCompletionSource taskCompletionSource) {
        if (this.f36947a) {
            return false;
        }
        d(activity, new n(this, activity, taskCompletionSource));
        this.f36947a = true;
        return true;
    }
}
