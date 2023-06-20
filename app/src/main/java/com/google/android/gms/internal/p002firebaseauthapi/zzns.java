package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "FinalizeMfaEnrollmentAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzns  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzns extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzns> CREATOR = new zznt();
    @SafeParcelable.Field(getter = "getPhoneAuthCredential", id = 1)
    private final PhoneAuthCredential zza;
    @SafeParcelable.Field(getter = "getCachedTokenState", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private final String zzc;

    @SafeParcelable.Constructor
    public zzns(@SafeParcelable.Param(id = 1) PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.zza = phoneAuthCredential;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final PhoneAuthCredential zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
