package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzws implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzwr(str, j10, z10, str2, str3, str4, z11, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzwr[i10];
    }
}
