package sb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzti;
import com.google.android.gms.internal.p002firebaseauthapi.zztu;
import com.google.android.gms.internal.p002firebaseauthapi.zzvf;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f36917a = "d0";

    /* renamed from: b  reason: collision with root package name */
    private static final d0 f36918b = new d0();

    private d0() {
    }

    public static d0 b() {
        return f36918b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(FirebaseAuth firebaseAuth, z zVar, Activity activity, TaskCompletionSource taskCompletionSource) {
        Task task;
        zVar.f(firebaseAuth.i().l(), firebaseAuth);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        if (!o.a().c(activity, taskCompletionSource2)) {
            task = Tasks.forException(zzti.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.i().q().b());
            if (!TextUtils.isEmpty(firebaseAuth.m())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.m());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zztu.zza().zzb());
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", firebaseAuth.i().p());
            activity.startActivity(intent);
            task = taskCompletionSource2.getTask();
        }
        task.addOnSuccessListener(new b0(this, taskCompletionSource)).addOnFailureListener(new a0(this, taskCompletionSource));
    }

    public final Task a(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z10) {
        q0 q0Var = (q0) firebaseAuth.k();
        SafetyNetClient client = z10 ? SafetyNet.getClient(firebaseAuth.i().l()) : null;
        z b10 = z.b();
        if (!zzvf.zzg(firebaseAuth.i()) && !q0Var.g()) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Task a10 = b10.a();
            if (a10 != null) {
                if (a10.isSuccessful()) {
                    return Tasks.forResult(new c0(null, (String) a10.getResult()));
                }
                String str2 = f36917a;
                Log.e(str2, "Error in previous reCAPTCHA flow: ".concat(String.valueOf(a10.getException().getMessage())));
                Log.e(str2, "Continuing with application verification as normal");
            }
            if (client != null && !q0Var.e()) {
                ob.e i10 = firebaseAuth.i();
                byte[] bArr = new byte[0];
                if (str != null) {
                    try {
                        bArr = str.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e10) {
                        Log.e(f36917a, "Failed to getBytes with exception: ".concat(String.valueOf(e10.getMessage())));
                    }
                }
                client.attest(bArr, i10.q().b()).addOnSuccessListener(new p(this, taskCompletionSource, firebaseAuth, b10, activity)).addOnFailureListener(new c(this, firebaseAuth, b10, activity, taskCompletionSource));
            } else {
                e(firebaseAuth, b10, activity, taskCompletionSource);
            }
            return taskCompletionSource.getTask();
        }
        return Tasks.forResult(new c0(null, null));
    }
}
