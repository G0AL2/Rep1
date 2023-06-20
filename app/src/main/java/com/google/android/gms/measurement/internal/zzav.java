package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    @SafeParcelable.Field(id = 2)
    public final String zza;
    @SafeParcelable.Field(id = 3)
    public final zzat zzb;
    @SafeParcelable.Field(id = 4)
    public final String zzc;
    @SafeParcelable.Field(id = 5)
    public final long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzav zzavVar, long j10) {
        Preconditions.checkNotNull(zzavVar);
        this.zza = zzavVar.zza;
        this.zzb = zzavVar.zzb;
        this.zzc = zzavVar.zzc;
        this.zzd = j10;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzaw.zza(this, parcel, i10);
    }

    @SafeParcelable.Constructor
    public zzav(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzat zzatVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j10) {
        this.zza = str;
        this.zzb = zzatVar;
        this.zzc = str2;
        this.zzd = j10;
    }
}
