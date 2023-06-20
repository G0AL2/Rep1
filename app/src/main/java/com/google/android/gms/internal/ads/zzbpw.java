package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbpw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j10 = 0;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 5:
                    strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 6:
                    strArr2 = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 7:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    j10 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbpv(z10, str, i10, bArr, strArr, strArr2, z11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbpv[i10];
    }
}
