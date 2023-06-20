package sb;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class b0 implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f36909a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(d0 d0Var, TaskCompletionSource taskCompletionSource) {
        this.f36909a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f36909a.setResult(new c0(null, (String) obj));
    }
}
