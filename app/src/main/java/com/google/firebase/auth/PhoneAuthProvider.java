package com.google.firebase.auth;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.z;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public class PhoneAuthProvider {

    /* renamed from: a  reason: collision with root package name */
    private FirebaseAuth f23237a;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
    @SafeParcelable.Class(creator = "DefaultForceResendingTokenCreator")
    /* loaded from: classes3.dex */
    public static class ForceResendingToken extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ForceResendingToken> CREATOR = new p0();

        public static ForceResendingToken j1() {
            return new ForceResendingToken();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
    /* loaded from: classes3.dex */
    public static abstract class a {
        private static final Logger zza = new Logger("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.i("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void onCodeSent(String str, ForceResendingToken forceResendingToken) {
        }

        public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

        public abstract void onVerificationFailed(ob.k kVar);
    }

    private PhoneAuthProvider(FirebaseAuth firebaseAuth) {
        this.f23237a = firebaseAuth;
    }

    public static PhoneAuthCredential a(String str, String str2) {
        return PhoneAuthCredential.n1(str, str2);
    }

    @Deprecated
    public static PhoneAuthProvider b(FirebaseAuth firebaseAuth) {
        return new PhoneAuthProvider(firebaseAuth);
    }

    public static void c(z zVar) {
        Preconditions.checkNotNull(zVar);
        zVar.c().L(zVar);
    }

    @Deprecated
    public void d(String str, long j10, TimeUnit timeUnit, Activity activity, a aVar) {
        z.a a10 = z.a(this.f23237a);
        a10.e(str);
        a10.f(Long.valueOf(j10), timeUnit);
        a10.b(activity);
        a10.c(aVar);
        c(a10.a());
    }

    @Deprecated
    public void e(String str, long j10, TimeUnit timeUnit, Activity activity, a aVar, ForceResendingToken forceResendingToken) {
        z.a a10 = z.a(this.f23237a);
        a10.e(str);
        a10.f(Long.valueOf(j10), timeUnit);
        a10.b(activity);
        a10.c(aVar);
        if (forceResendingToken != null) {
            a10.d(forceResendingToken);
        }
        c(a10.a());
    }
}
