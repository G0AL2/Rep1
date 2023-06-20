package sb;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
final class i implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f36927a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j jVar) {
        this.f36927a = jVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger logger;
        if (exc instanceof ob.l) {
            logger = k.f36933h;
            logger.v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f36927a.f36932b.d();
        }
    }
}
