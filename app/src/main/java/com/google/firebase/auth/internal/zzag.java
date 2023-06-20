package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DefaultMultiFactorSessionCreator")
/* loaded from: classes3.dex */
public final class zzag extends MultiFactorSession {
    public static final Parcelable.Creator<zzag> CREATOR = new a();
    @SafeParcelable.Field(getter = "getIdToken", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private String f23289a;
    @SafeParcelable.Field(getter = "getPendingCredential", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private String f23290b;
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private List f23291c;

    private zzag() {
    }

    public static zzag j1(List list, String str) {
        Preconditions.checkNotNull(list);
        Preconditions.checkNotEmpty(str);
        zzag zzagVar = new zzag();
        zzagVar.f23291c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzagVar.f23291c.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        zzagVar.f23290b = str;
        return zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23289a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f23290b, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f23291c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzc() {
        return this.f23289a;
    }

    public final String zzd() {
        return this.f23290b;
    }

    public final boolean zze() {
        return this.f23289a != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzag(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) List list) {
        this.f23289a = str;
        this.f23290b = str2;
        this.f23291c = list;
    }
}
