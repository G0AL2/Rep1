package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class y0 implements sb.x {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23339a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(FirebaseAuth firebaseAuth) {
        this.f23339a = firebaseAuth;
    }

    @Override // sb.e0
    public final void a(zzwe zzweVar, FirebaseUser firebaseUser) {
        FirebaseAuth.K(this.f23339a, firebaseUser, zzweVar, true, true);
    }

    @Override // sb.m
    public final void zzb(Status status) {
        int statusCode = status.getStatusCode();
        if (statusCode == 17011 || statusCode == 17021 || statusCode == 17005) {
            this.f23339a.z();
        }
    }
}
