package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes2.dex */
public final class zzfme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfme> CREATOR = new zzfmf();
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzaly zzb = null;
    private byte[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzfme(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaly zzalyVar = this.zzb;
        if (zzalyVar != null || this.zzc == null) {
            if (zzalyVar == null || this.zzc != null) {
                if (zzalyVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzalyVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaw();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaly zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaly.zze(this.zzc, zzgkc.zza());
                this.zzc = null;
            } catch (zzglc | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }
}
