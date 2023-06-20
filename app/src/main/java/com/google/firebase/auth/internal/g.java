package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzwe zzweVar = null;
        zzt zztVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzz zzzVar = null;
        zze zzeVar = null;
        zzbb zzbbVar = null;
        boolean z10 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzweVar = (zzwe) SafeParcelReader.createParcelable(parcel, readHeader, zzwe.CREATOR);
                    break;
                case 2:
                    zztVar = (zzt) SafeParcelReader.createParcelable(parcel, readHeader, zzt.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzt.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    bool = SafeParcelReader.readBooleanObject(parcel, readHeader);
                    break;
                case 9:
                    zzzVar = (zzz) SafeParcelReader.createParcelable(parcel, readHeader, zzz.CREATOR);
                    break;
                case 10:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, readHeader, zze.CREATOR);
                    break;
                case 12:
                    zzbbVar = (zzbb) SafeParcelReader.createParcelable(parcel, readHeader, zzbb.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzx(zzweVar, zztVar, str, str2, arrayList, arrayList2, str3, bool, zzzVar, z10, zzeVar, zzbbVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzx[i10];
    }
}
