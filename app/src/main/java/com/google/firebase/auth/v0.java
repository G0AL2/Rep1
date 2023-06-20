package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class v0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth.a f23330a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23331b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f23331b = firebaseAuth;
        this.f23330a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23330a.a(this.f23331b);
    }
}
