package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes2.dex */
public final class zzll extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzll> CREATOR = new zzlm();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final String zzb;
    @SafeParcelable.Field(id = 3)
    public final long zzc;
    @SafeParcelable.Field(id = 4)
    public final Long zzd;
    @SafeParcelable.Field(id = 6)
    public final String zze;
    @SafeParcelable.Field(id = 7)
    public final String zzf;
    @SafeParcelable.Field(id = 8)
    public final Double zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzll(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j10, @SafeParcelable.Param(id = 4) Long l10, @SafeParcelable.Param(id = 5) Float f10, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Double d10) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = l10;
        if (i10 == 1) {
            this.zzg = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.zzg = d10;
        }
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzlm.zza(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.zzd;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.zzg;
        if (d10 != null) {
            return d10;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzll(zzln zzlnVar) {
        this(zzlnVar.zzc, zzlnVar.zzd, zzlnVar.zze, zzlnVar.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzll(String str, long j10, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j10;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else if (obj instanceof Double) {
            this.zzd = null;
            this.zzg = (Double) obj;
            this.zze = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
