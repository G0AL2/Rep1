package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DeleteAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznq  reason: invalid package */
/* loaded from: classes2.dex */
public final class zznq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznq> CREATOR = new zznr();
    @SafeParcelable.Field(getter = "getCachedState", id = 1)
    private final String zza;

    @SafeParcelable.Constructor
    public zznq(@SafeParcelable.Param(id = 1) String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }
}
