package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class h1 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f23268a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ActionCodeSettings f23269b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirebaseUser f23270c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(FirebaseUser firebaseUser, String str, ActionCodeSettings actionCodeSettings) {
        this.f23270c = firebaseUser;
        this.f23268a = str;
        this.f23269b = actionCodeSettings;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) throws Exception {
        return FirebaseAuth.getInstance(this.f23270c.C1()).b0((String) Preconditions.checkNotNull(((t) task.getResult()).f()), this.f23268a, this.f23269b);
    }
}
