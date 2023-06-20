package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class d1 implements sb.x {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23259a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(FirebaseAuth firebaseAuth) {
        this.f23259a = firebaseAuth;
    }

    @Override // sb.e0
    public final void a(zzwe zzweVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzweVar);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.G1(zzweVar);
        FirebaseAuth.K(this.f23259a, firebaseUser, zzweVar, true, true);
    }

    @Override // sb.m
    public final void zzb(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
            this.f23259a.z();
        }
    }
}
