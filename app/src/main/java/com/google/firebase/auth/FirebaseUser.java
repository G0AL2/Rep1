package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public abstract class FirebaseUser extends AbstractSafeParcelable implements d0 {
    public Task<Void> A1(String str) {
        return B1(str, null);
    }

    public Task<Void> B1(String str, ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(C1()).R(this, false).continueWithTask(new h1(this, str, actionCodeSettings));
    }

    public abstract ob.e C1();

    public abstract FirebaseUser D1();

    public abstract FirebaseUser E1(List list);

    public abstract zzwe F1();

    public abstract void G1(zzwe zzweVar);

    public abstract void H1(List list);

    @Override // com.google.firebase.auth.d0
    public abstract String e();

    @Override // com.google.firebase.auth.d0
    public abstract String getDisplayName();

    @Override // com.google.firebase.auth.d0
    public abstract String getEmail();

    @Override // com.google.firebase.auth.d0
    public abstract String getPhoneNumber();

    @Override // com.google.firebase.auth.d0
    public abstract Uri getPhotoUrl();

    public Task<Void> j1() {
        return FirebaseAuth.getInstance(C1()).Q(this);
    }

    public Task<t> k1(boolean z10) {
        return FirebaseAuth.getInstance(C1()).R(this, z10);
    }

    public abstract FirebaseUserMetadata l1();

    public abstract w m1();

    public abstract List<? extends d0> n1();

    public abstract String o1();

    public abstract boolean p1();

    @Override // com.google.firebase.auth.d0
    public abstract String q();

    public Task<AuthResult> q1(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        return FirebaseAuth.getInstance(C1()).S(this, authCredential);
    }

    public Task<AuthResult> r1(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        return FirebaseAuth.getInstance(C1()).T(this, authCredential);
    }

    public Task<Void> s1() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C1());
        return firebaseAuth.U(this, new d1(firebaseAuth));
    }

    public Task<Void> t1() {
        return FirebaseAuth.getInstance(C1()).R(this, false).continueWithTask(new f1(this));
    }

    public Task<Void> u1(ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(C1()).R(this, false).continueWithTask(new g1(this, actionCodeSettings));
    }

    public Task<AuthResult> v1(String str) {
        Preconditions.checkNotEmpty(str);
        return FirebaseAuth.getInstance(C1()).W(this, str);
    }

    public Task<Void> w1(String str) {
        Preconditions.checkNotEmpty(str);
        return FirebaseAuth.getInstance(C1()).X(this, str);
    }

    public Task<Void> x1(String str) {
        Preconditions.checkNotEmpty(str);
        return FirebaseAuth.getInstance(C1()).Y(this, str);
    }

    public Task<Void> y1(PhoneAuthCredential phoneAuthCredential) {
        return FirebaseAuth.getInstance(C1()).Z(this, phoneAuthCredential);
    }

    public Task<Void> z1(UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.checkNotNull(userProfileChangeRequest);
        return FirebaseAuth.getInstance(C1()).a0(this, userProfileChangeRequest);
    }

    public abstract String zze();

    public abstract String zzf();

    public abstract List zzg();
}
