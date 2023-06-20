package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
/* loaded from: classes2.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();
    @SafeParcelable.VersionField(id = 1)
    final int zza;
    @SafeParcelable.Field(id = 2)
    final int zzb;
    @SafeParcelable.Field(id = 3)
    int zzc;
    @SafeParcelable.Field(id = 4)
    String zzd;
    @SafeParcelable.Field(id = 5)
    IBinder zze;
    @SafeParcelable.Field(id = 6)
    Scope[] zzf;
    @SafeParcelable.Field(id = 7)
    Bundle zzg;
    @SafeParcelable.Field(id = 8)
    Account zzh;
    @SafeParcelable.Field(id = 10)
    Feature[] zzi;
    @SafeParcelable.Field(id = 11)
    Feature[] zzj;
    @SafeParcelable.Field(id = 12)
    boolean zzk;
    @SafeParcelable.Field(defaultValue = "0", id = 13)
    int zzl;
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean zzm;
    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    private String zzn;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z10, @SafeParcelable.Param(id = 13) int i13, @SafeParcelable.Param(id = 14) boolean z11, @SafeParcelable.Param(id = 15) String str2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        if ("com.google.android.gms".equals(str)) {
            this.zzd = "com.google.android.gms";
        } else {
            this.zzd = str;
        }
        if (i10 < 2) {
            this.zzh = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zze = iBinder;
            this.zzh = account;
        }
        this.zzf = scopeArr;
        this.zzg = bundle;
        this.zzi = featureArr;
        this.zzj = featureArr2;
        this.zzk = z10;
        this.zzl = i13;
        this.zzm = z11;
        this.zzn = str2;
    }

    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzg;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzm.zza(this, parcel, i10);
    }

    public final String zza() {
        return this.zzn;
    }

    public GetServiceRequest(int i10, String str) {
        this.zza = 6;
        this.zzc = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzb = i10;
        this.zzk = true;
        this.zzn = str;
    }
}
