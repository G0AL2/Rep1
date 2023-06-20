package sb;

import android.app.Activity;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class p implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36949a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f36950b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ z f36951c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Activity f36952d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ d0 f36953e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(d0 d0Var, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, z zVar, Activity activity) {
        this.f36953e = d0Var;
        this.f36949a = taskCompletionSource;
        this.f36950b = firebaseAuth;
        this.f36951c = zVar;
        this.f36952d = activity;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        SafetyNetApi.AttestationResponse attestationResponse = (SafetyNetApi.AttestationResponse) obj;
        if (s.a(attestationResponse)) {
            this.f36949a.setResult(new c0(attestationResponse.getJwsResult(), null));
        } else {
            this.f36953e.e(this.f36950b, this.f36951c, this.f36952d, this.f36949a);
        }
    }
}
