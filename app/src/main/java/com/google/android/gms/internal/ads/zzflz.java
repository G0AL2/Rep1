package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SafeParcelable.Class(creator = "GassEventParcelCreator")
/* loaded from: classes2.dex */
public final class zzflz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzflz> CREATOR = new zzfma();
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzflz(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzflz(byte[] bArr) {
        this(1, bArr);
    }
}
