package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zze;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DefaultAuthResultCreator")
/* loaded from: classes3.dex */
public final class zzr implements AuthResult {
    public static final Parcelable.Creator<zzr> CREATOR = new f();
    @SafeParcelable.Field(getter = "getUser", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private zzx f23297a;
    @SafeParcelable.Field(getter = "getAdditionalUserInfo", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private zzp f23298b;
    @SafeParcelable.Field(getter = "getOAuthCredential", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private zze f23299c;

    public zzr(zzx zzxVar) {
        zzx zzxVar2 = (zzx) Preconditions.checkNotNull(zzxVar);
        this.f23297a = zzxVar2;
        List M1 = zzxVar2.M1();
        this.f23298b = null;
        for (int i10 = 0; i10 < M1.size(); i10++) {
            if (!TextUtils.isEmpty(((zzt) M1.get(i10)).zza())) {
                this.f23298b = new zzp(((zzt) M1.get(i10)).q(), ((zzt) M1.get(i10)).zza(), zzxVar.zzs());
            }
        }
        if (this.f23298b == null) {
            this.f23298b = new zzp(zzxVar.zzs());
        }
        this.f23299c = zzxVar.I1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 1) zzx zzxVar, @SafeParcelable.Param(id = 2) zzp zzpVar, @SafeParcelable.Param(id = 3) zze zzeVar) {
        this.f23297a = zzxVar;
        this.f23298b = zzpVar;
        this.f23299c = zzeVar;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final AdditionalUserInfo K0() {
        return this.f23298b;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final FirebaseUser d0() {
        return this.f23297a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f23297a, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f23298b, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f23299c, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
