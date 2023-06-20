package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "SendVerificationCodeAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzom  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzon();
    @SafeParcelable.Field(getter = "getSendVerificationCodeRequest", id = 1)
    private final zzwr zza;

    @SafeParcelable.Constructor
    public zzom(@SafeParcelable.Param(id = 1) zzwr zzwrVar) {
        this.zza = zzwrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzwr zza() {
        return this.zza;
    }
}
