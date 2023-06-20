package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class g1 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ActionCodeSettings f23266a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseUser f23267b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(FirebaseUser firebaseUser, ActionCodeSettings actionCodeSettings) {
        this.f23267b = firebaseUser;
        this.f23266a = actionCodeSettings;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f23267b.C1()).V(this.f23266a, (String) Preconditions.checkNotNull(((t) task.getResult()).f()));
    }
}
