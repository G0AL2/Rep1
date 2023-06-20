package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzwm zzwmVar = null;
        String str5 = null;
        String str6 = null;
        zze zzeVar = null;
        ArrayList arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    zzwmVar = (zzwm) SafeParcelReader.createParcelable(parcel, readHeader, zzwm.CREATOR);
                    break;
                case 8:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 11:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 13:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzwi.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzvx(str, str2, z10, str3, str4, zzwmVar, str5, str6, j10, j11, z11, zzeVar, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvx[i10];
    }
}
