package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "VerifyBeforeUpdateEmailAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpo  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzpo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpo> CREATOR = new zzpp();
    @SafeParcelable.Field(getter = "getIdToken", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getNewEmail", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getActionCodeSettings", id = 3)
    private final ActionCodeSettings zzc;

    @SafeParcelable.Constructor
    public zzpo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = actionCodeSettings;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ActionCodeSettings zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
