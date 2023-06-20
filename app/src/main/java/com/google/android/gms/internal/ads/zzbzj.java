package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzj> CREATOR = new zzbzk();
    @SafeParcelable.Field(id = 2)
    public final boolean zza;
    @SafeParcelable.Field(id = 3)
    public final List zzb;

    public zzbzj() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbzj(@SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) List list) {
        this.zza = z10;
        this.zzb = list;
    }
}
