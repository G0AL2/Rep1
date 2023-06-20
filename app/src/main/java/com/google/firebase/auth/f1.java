package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class f1 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseUser f23265a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(FirebaseUser firebaseUser) {
        this.f23265a = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f23265a.C1()).V(null, (String) Preconditions.checkNotNull(((t) task.getResult()).f()));
    }
}
