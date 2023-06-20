package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "SignInWithCredentialAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzos  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = new zzot();
    @SafeParcelable.Field(getter = "getVerifyAssertionRequest", id = 1)
    private final zzxe zza;

    @SafeParcelable.Constructor
    public zzos(@SafeParcelable.Param(id = 1) zzxe zzxeVar) {
        this.zza = zzxeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzxe zza() {
        return this.zza;
    }
}
