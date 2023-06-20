package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;
import java.util.List;
import sb.q;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "OnFailedMfaSignInAidlResponseCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzps  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzps extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzps> CREATOR = new zzpt();
    @SafeParcelable.Field(getter = "getMfaPendingCredential", id = 1)
    final String zza;
    @SafeParcelable.Field(getter = "getMfaInfoList", id = 2)
    final List zzb;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 3)
    final zze zzc;

    @SafeParcelable.Constructor
    public zzps(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) zze zzeVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zze zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List zzc() {
        return q.b(this.zzb);
    }
}
