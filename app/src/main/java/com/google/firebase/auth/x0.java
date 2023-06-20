package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class x0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23334a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(FirebaseAuth firebaseAuth) {
        this.f23334a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<FirebaseAuth.a> list;
        list = this.f23334a.f23213d;
        for (FirebaseAuth.a aVar : list) {
            aVar.a(this.f23334a);
        }
    }
}
