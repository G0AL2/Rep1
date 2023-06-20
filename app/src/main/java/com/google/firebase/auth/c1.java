package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* loaded from: classes3.dex */
public class c1 implements sb.e0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23258a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(FirebaseAuth firebaseAuth) {
        this.f23258a = firebaseAuth;
    }

    @Override // sb.e0
    public final void a(zzwe zzweVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzweVar);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.G1(zzweVar);
        this.f23258a.H(firebaseUser, zzweVar, true);
    }
}
