package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "LinkFederatedCredentialAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoc  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzoc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoc> CREATOR = new zzod();
    @SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getVerifyAssertionRequest", id = 2)
    private final zzxe zzb;

    @SafeParcelable.Constructor
    public zzoc(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) zzxe zzxeVar) {
        this.zza = str;
        this.zzb = zzxeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzxe zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
