package sb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class a0 implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36908a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        this.f36908a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = d0.f36917a;
        Log.e(str, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        this.f36908a.setResult(new c0(null, null));
    }
}
