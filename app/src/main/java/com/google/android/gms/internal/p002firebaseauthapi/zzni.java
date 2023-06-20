package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "ChangePasswordAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzni  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzni extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzni> CREATOR = new zznj();
    @SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zzni(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
