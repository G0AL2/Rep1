package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class u0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth.b f23328a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23329b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f23329b = firebaseAuth;
        this.f23328a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23328a.a(this.f23329b);
    }
}
