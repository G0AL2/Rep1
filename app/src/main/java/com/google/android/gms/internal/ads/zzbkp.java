package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* loaded from: classes2.dex */
public final class zzbkp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkp> CREATOR = new zzbkq();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(id = 3)
    public final int zzc;
    @SafeParcelable.Field(id = 4)
    public final boolean zzd;
    @SafeParcelable.Field(id = 5)
    public final int zze;
    @SafeParcelable.Field(id = 6)
    public final com.google.android.gms.ads.internal.client.zzff zzf;
    @SafeParcelable.Field(id = 7)
    public final boolean zzg;
    @SafeParcelable.Field(id = 8)
    public final int zzh;

    @SafeParcelable.Constructor
    public zzbkp(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) boolean z11, @SafeParcelable.Param(id = 5) int i12, @SafeParcelable.Param(id = 6) com.google.android.gms.ads.internal.client.zzff zzffVar, @SafeParcelable.Param(id = 7) boolean z12, @SafeParcelable.Param(id = 8) int i13) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = i11;
        this.zzd = z11;
        this.zze = i12;
        this.zzf = zzffVar;
        this.zzg = z12;
        this.zzh = i13;
    }

    public static NativeAdOptions zza(zzbkp zzbkpVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbkpVar == null) {
            return builder.build();
        }
        int i10 = zzbkpVar.zza;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbkpVar.zzg);
                    builder.setMediaAspectRatio(zzbkpVar.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzbkpVar.zzb);
                builder.setRequestMultipleImages(zzbkpVar.zzd);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzff zzffVar = zzbkpVar.zzf;
            if (zzffVar != null) {
                builder.setVideoOptions(new VideoOptions(zzffVar));
            }
        }
        builder.setAdChoicesPlacement(zzbkpVar.zze);
        builder.setReturnUrlsForImageAssets(zzbkpVar.zzb);
        builder.setRequestMultipleImages(zzbkpVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzbkp(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzff(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }
}
