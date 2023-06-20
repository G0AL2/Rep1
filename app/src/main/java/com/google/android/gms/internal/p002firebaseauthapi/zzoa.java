package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "LinkEmailAuthCredentialAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoa  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzoa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoa> CREATOR = new zzob();
    @SafeParcelable.Field(getter = "getEmail", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getPassword", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getCachedState", id = 3)
    private final String zzc;

    @SafeParcelable.Constructor
    public zzoa(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
