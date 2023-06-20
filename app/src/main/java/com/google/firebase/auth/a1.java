package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzte;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzag;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class a1 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f23254a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f23255b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(FirebaseAuth firebaseAuth, z zVar) {
        this.f23255b = firebaseAuth;
        this.f23254a = zVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String a10;
        String str;
        PhoneAuthProvider.a O;
        zzte zzteVar;
        String str2;
        zzte zzteVar2;
        String str3;
        if (!task.isSuccessful()) {
            Log.e("FirebaseAuth", task.getException() != null ? "Error while validating application identity: ".concat(String.valueOf(task.getException().getMessage())) : "Error while validating application identity: ");
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str = null;
            a10 = null;
        } else {
            String b10 = ((sb.c0) task.getResult()).b();
            a10 = ((sb.c0) task.getResult()).a();
            str = b10;
        }
        long longValue = this.f23254a.h().longValue();
        O = this.f23255b.O(this.f23254a.i(), this.f23254a.f());
        zzag zzagVar = (zzag) Preconditions.checkNotNull(this.f23254a.d());
        if (zzagVar.zze()) {
            zzteVar2 = this.f23255b.f23214e;
            String str4 = (String) Preconditions.checkNotNull(this.f23254a.i());
            str3 = this.f23255b.f23218i;
            zzteVar2.zzD(zzagVar, str4, str3, longValue, this.f23254a.e() != null, this.f23254a.k(), str, a10, this.f23255b.N(), O, this.f23254a.j(), this.f23254a.b());
            return;
        }
        zzteVar = this.f23255b.f23214e;
        PhoneMultiFactorInfo phoneMultiFactorInfo = (PhoneMultiFactorInfo) Preconditions.checkNotNull(this.f23254a.g());
        str2 = this.f23255b.f23218i;
        zzteVar.zzE(zzagVar, phoneMultiFactorInfo, str2, longValue, this.f23254a.e() != null, this.f23254a.k(), str, a10, this.f23255b.N(), O, this.f23254a.j(), this.f23254a.b());
    }
}
