package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "StringListCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxc> CREATOR = new zzxd();
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getValues", id = 2)
    private List zzb;

    public zzxc() {
        this(null);
    }

    public static zzxc zza(zzxc zzxcVar) {
        return new zzxc(zzxcVar.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List zzb() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzxc(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) List list) {
        this.zza = i10;
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, Strings.emptyToNull((String) list.get(i11)));
            }
            this.zzb = Collections.unmodifiableList(list);
            return;
        }
        this.zzb = Collections.emptyList();
    }

    public zzxc(List list) {
        this.zza = 1;
        this.zzb = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.zzb.addAll(list);
    }
}
