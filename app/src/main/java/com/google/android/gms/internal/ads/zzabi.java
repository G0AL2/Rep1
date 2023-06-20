package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public class zzabi implements zzbk {
    public static final Parcelable.Creator<zzabi> CREATOR = new zzabh();
    public final String zza;
    public final String zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzabi(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    public zzabi(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzabi zzabiVar = (zzabi) obj;
            if (this.zza.equals(zzabiVar.zza) && this.zzb.equals(zzabiVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "VC: " + str + "=" + str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        char c10;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            zzbfVar.zzr(this.zzb);
        } else if (c10 == 1) {
            zzbfVar.zze(this.zzb);
        } else if (c10 == 2) {
            zzbfVar.zzd(this.zzb);
        } else if (c10 == 3) {
            zzbfVar.zzc(this.zzb);
        } else if (c10 != 4) {
        } else {
            zzbfVar.zzi(this.zzb);
        }
    }
}
