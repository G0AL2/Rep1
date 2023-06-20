package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzacr implements zzbk {
    public static final Parcelable.Creator<zzacr> CREATOR = new zzacp();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzacr(long j10, long j11, long j12, long j13, long j14) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzacr(Parcel parcel, zzacq zzacqVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacr.class == obj.getClass()) {
            zzacr zzacrVar = (zzacr) obj;
            if (this.zza == zzacrVar.zza && this.zzb == zzacrVar.zzb && this.zzc == zzacrVar.zzc && this.zzd == zzacrVar.zzd && this.zze == zzacrVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        long j11 = this.zzb;
        long j12 = this.zzc;
        long j13 = this.zzd;
        long j14 = this.zze;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        long j10 = this.zza;
        long j11 = this.zzb;
        long j12 = this.zzc;
        long j13 = this.zzd;
        long j14 = this.zze;
        return "Motion photo metadata: photoStartPosition=" + j10 + ", photoSize=" + j11 + ", photoPresentationTimestampUs=" + j12 + ", videoStartPosition=" + j13 + ", videoSize=" + j14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}
