package sb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzti;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class n extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f36944a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f36945b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(o oVar, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f36944a = new WeakReference(activity);
        this.f36945b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f36944a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f36945b.setException(zzti.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            o.b(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                this.f36945b.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                o.b(context);
                return;
            }
            TaskCompletionSource taskCompletionSource = this.f36945b;
            taskCompletionSource.setException(zzti.zza(g.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        } else if (y.d(intent)) {
            this.f36945b.setException(zzti.zza(y.a(intent)));
            o.b(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f36945b.setException(zzti.zza(g.a("WEB_CONTEXT_CANCELED")));
            o.b(context);
        }
    }
}
