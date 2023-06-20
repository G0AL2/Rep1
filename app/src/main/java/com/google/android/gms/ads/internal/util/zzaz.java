package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfdc;
import com.google.android.gms.internal.ads.zzfpi;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SafeParcelable.Class(creator = "ExceptionParcelCreator")
/* loaded from: classes2.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    @SafeParcelable.Field(id = 1)
    public final String zza;
    @SafeParcelable.Field(id = 2)
    public final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = str == null ? "" : str;
        this.zzb = i10;
    }

    public static zzaz zza(Throwable th) {
        String message;
        com.google.android.gms.ads.internal.client.zze zza = zzfdc.zza(th);
        if (zzfpi.zzd(th.getMessage())) {
            message = zza.zzb;
        } else {
            message = th.getMessage();
        }
        return new zzaz(message, zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
