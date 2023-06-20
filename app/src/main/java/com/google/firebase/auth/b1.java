package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class b1 extends PhoneAuthProvider.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PhoneAuthProvider.a f23256a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23257b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(FirebaseAuth firebaseAuth, PhoneAuthProvider.a aVar) {
        this.f23257b = firebaseAuth;
        this.f23256a = aVar;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        sb.q0 q0Var;
        PhoneAuthProvider.a aVar = this.f23256a;
        q0Var = this.f23257b.f23216g;
        aVar.onVerificationCompleted(PhoneAuthProvider.a(str, (String) Preconditions.checkNotNull(q0Var.d())));
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.f23256a.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationFailed(ob.k kVar) {
        this.f23256a.onVerificationFailed(kVar);
    }
}
