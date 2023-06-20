package sb;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class c implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f36910a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z f36911b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Activity f36912c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36913d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ d0 f36914e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(d0 d0Var, FirebaseAuth firebaseAuth, z zVar, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f36914e = d0Var;
        this.f36910a = firebaseAuth;
        this.f36911b = zVar;
        this.f36912c = activity;
        this.f36913d = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = d0.f36917a;
        Log.e(str, "Problem retrieving SafetyNet Token: ".concat(String.valueOf(exc.getMessage())));
        this.f36914e.e(this.f36910a, this.f36911b, this.f36912c, this.f36913d);
    }
}
