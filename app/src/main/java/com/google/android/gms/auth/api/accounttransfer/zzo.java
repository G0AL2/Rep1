package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzo implements Parcelable.Creator<zzn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzn createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        ArrayList arrayList = null;
        zzr zzrVar = null;
        int i11 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(1);
            } else if (fieldId == 2) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzt.CREATOR);
                hashSet.add(2);
            } else if (fieldId == 3) {
                i11 = SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(3);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzrVar = (zzr) SafeParcelReader.createParcelable(parcel, readHeader, zzr.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new zzn(hashSet, i10, arrayList, i11, zzrVar);
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Overread allowed size end=");
        sb2.append(validateObjectHeader);
        throw new SafeParcelReader.ParseException(sb2.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzn[] newArray(int i10) {
        return new zzn[i10];
    }
}
