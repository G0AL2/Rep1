package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "LinkPhoneAuthCredentialAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoe  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzoe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoe> CREATOR = new zzof();
    @SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getCredential", id = 2)
    private final PhoneAuthCredential zzb;

    @SafeParcelable.Constructor
    public zzoe(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) PhoneAuthCredential phoneAuthCredential) {
        this.zza = str;
        this.zzb = phoneAuthCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final PhoneAuthCredential zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
