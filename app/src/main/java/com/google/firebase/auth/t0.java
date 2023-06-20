package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class t0 implements sb.l {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseUser f23326a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23327b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.f23327b = firebaseAuth;
        this.f23326a = firebaseUser;
    }

    @Override // sb.l
    public final void zza() {
        FirebaseUser firebaseUser;
        FirebaseUser firebaseUser2;
        FirebaseAuth firebaseAuth = this.f23327b;
        firebaseUser = firebaseAuth.f23215f;
        if (firebaseUser != null) {
            firebaseUser2 = firebaseAuth.f23215f;
            if (firebaseUser2.e().equalsIgnoreCase(this.f23326a.e())) {
                this.f23327b.G();
            }
        }
    }

    @Override // sb.m
    public final void zzb(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005) {
            this.f23327b.z();
        }
    }
}
