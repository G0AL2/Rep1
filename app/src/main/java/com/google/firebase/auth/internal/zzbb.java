package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "MultiFactorInfoListCreator")
/* loaded from: classes3.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new d();
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List f23292a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param(id = 1) List list) {
        this.f23292a = list == null ? new ArrayList() : list;
    }

    public final List j1() {
        ArrayList arrayList = new ArrayList();
        for (PhoneMultiFactorInfo phoneMultiFactorInfo : this.f23292a) {
            arrayList.add(phoneMultiFactorInfo);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f23292a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
