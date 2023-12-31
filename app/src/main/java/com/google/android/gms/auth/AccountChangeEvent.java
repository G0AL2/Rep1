package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import fm.castbox.mediation.model.NetworkName;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class(creator = "AccountChangeEventCreator")
/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();
    @SafeParcelable.VersionField(id = 1)
    final int zza;
    @SafeParcelable.Field(id = 2)
    final long zzb;
    @SafeParcelable.Field(id = 3)
    final String zzc;
    @SafeParcelable.Field(id = 4)
    final int zzd;
    @SafeParcelable.Field(id = 5)
    final int zze;
    @SafeParcelable.Field(id = 6)
    final String zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public AccountChangeEvent(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) long j10, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) int i12, @SafeParcelable.Param(id = 6) String str2) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AccountChangeEvent) {
            if (obj == this) {
                return true;
            }
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.zza == accountChangeEvent.zza && this.zzb == accountChangeEvent.zzb && Objects.equal(this.zzc, accountChangeEvent.zzc) && this.zzd == accountChangeEvent.zzd && this.zze == accountChangeEvent.zze && Objects.equal(this.zzf, accountChangeEvent.zzf);
        }
        return false;
    }

    public String getAccountName() {
        return this.zzc;
    }

    public String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf);
    }

    public String toString() {
        int i10 = this.zzd;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? NetworkName.UNKNOWN : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.zzc;
        String str3 = this.zzf;
        int i11 = this.zze;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb2.append("AccountChangeEvent {accountName = ");
        sb2.append(str2);
        sb2.append(", changeType = ");
        sb2.append(str);
        sb2.append(", changeData = ");
        sb2.append(str3);
        sb2.append(", eventIndex = ");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEvent(long j10, String str, int i10, int i11, String str2) {
        this.zza = 1;
        this.zzb = j10;
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzd = i10;
        this.zze = i11;
        this.zzf = str2;
    }
}
