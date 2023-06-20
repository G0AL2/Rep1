package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "SendGetOobConfirmationCodeEmailAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzok  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzok extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzok> CREATOR = new zzol();
    @SafeParcelable.Field(getter = "getEmail", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getActionCodeSettings", id = 2)
    private final ActionCodeSettings zzb;
    @SafeParcelable.Field(getter = "getTenantId", id = 3)
    private final String zzc;

    @SafeParcelable.Constructor
    public zzok(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) ActionCodeSettings actionCodeSettings, @SafeParcelable.Param(id = 3) String str2) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ActionCodeSettings zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }
}
