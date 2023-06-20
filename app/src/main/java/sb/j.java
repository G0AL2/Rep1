package sb;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f36931a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f36932b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(k kVar, String str) {
        this.f36932b = kVar;
        this.f36931a = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger logger;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(ob.e.o(this.f36931a));
        if (firebaseAuth.j() != null) {
            Task h10 = firebaseAuth.h(true);
            logger = k.f36933h;
            logger.v("Token refreshing started", new Object[0]);
            h10.addOnFailureListener(new i(this));
        }
    }
}
