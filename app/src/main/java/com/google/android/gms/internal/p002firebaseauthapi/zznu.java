package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "FinalizeMfaSignInAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zznu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznu> CREATOR = new zznv();
    @SafeParcelable.Field(getter = "getPhoneAuthCredential", id = 1)
    private final PhoneAuthCredential zza;
    @SafeParcelable.Field(getter = "getPendingCredential", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zznu(@SafeParcelable.Param(id = 1) PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param(id = 2) String str) {
        this.zza = phoneAuthCredential;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final PhoneAuthCredential zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
