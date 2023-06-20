package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "GetAccountInfoUserListCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvz  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvz> CREATOR = new zzwa();
    @SafeParcelable.Field(getter = "getUsers", id = 2)
    private final List zza;

    public zzvz() {
        this.zza = new ArrayList();
    }

    public static zzvz zza(zzvz zzvzVar) {
        Preconditions.checkNotNull(zzvzVar);
        List list = zzvzVar.zza;
        zzvz zzvzVar2 = new zzvz();
        if (list != null && !list.isEmpty()) {
            zzvzVar2.zza.addAll(list);
        }
        return zzvzVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzvz(@SafeParcelable.Param(id = 2) List list) {
        List unmodifiableList;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zza = unmodifiableList;
    }
}
