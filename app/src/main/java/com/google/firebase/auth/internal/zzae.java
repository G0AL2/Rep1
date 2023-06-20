package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DefaultMultiFactorResolverCreator")
/* loaded from: classes3.dex */
public final class zzae extends MultiFactorResolver {
    public static final Parcelable.Creator<zzae> CREATOR = new sb.f();
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List f23284a = new ArrayList();
    @SafeParcelable.Field(getter = "getSession", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private final zzag f23285b;
    @SafeParcelable.Field(getter = "getFirebaseAppName", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f23286c;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 4)

    /* renamed from: d  reason: collision with root package name */
    private final zze f23287d;
    @SafeParcelable.Field(getter = "getReauthUser", id = 5)

    /* renamed from: e  reason: collision with root package name */
    private final zzx f23288e;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) zzag zzagVar, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) zze zzeVar, @SafeParcelable.Param(id = 5) zzx zzxVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                this.f23284a.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        this.f23285b = (zzag) Preconditions.checkNotNull(zzagVar);
        this.f23286c = Preconditions.checkNotEmpty(str);
        this.f23287d = zzeVar;
        this.f23288e = zzxVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f23284a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f23285b, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.f23286c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f23287d, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f23288e, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
