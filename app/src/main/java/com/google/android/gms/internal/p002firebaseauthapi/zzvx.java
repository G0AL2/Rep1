package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "GetAccountInfoUserCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvx  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvx> CREATOR = new zzvy();
    @SafeParcelable.Field(getter = "getLocalId", id = 2)
    private String zza;
    @SafeParcelable.Field(getter = "getEmail", id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "isEmailVerified", id = 4)
    private boolean zzc;
    @SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private String zzd;
    @SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    private String zze;
    @SafeParcelable.Field(getter = "getProviderInfoList", id = 7)
    private zzwm zzf;
    @SafeParcelable.Field(getter = "getPassword", id = 8)
    private String zzg;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 9)
    private String zzh;
    @SafeParcelable.Field(getter = "getCreationTimestamp", id = 10)
    private long zzi;
    @SafeParcelable.Field(getter = "getLastSignInTimestamp", id = 11)
    private long zzj;
    @SafeParcelable.Field(getter = "isNewUser", id = 12)
    private boolean zzk;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 13)
    private zze zzl;
    @SafeParcelable.Field(getter = "getMfaInfoList", id = 14)
    private List zzm;

    public zzvx() {
        this.zzf = new zzwm();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i10, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i10, false);
        SafeParcelWriter.writeTypedList(parcel, 14, this.zzm, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zze zzd() {
        return this.zzl;
    }

    public final zzvx zze(zze zzeVar) {
        this.zzl = zzeVar;
        return this;
    }

    public final zzvx zzf(String str) {
        this.zzd = str;
        return this;
    }

    public final zzvx zzg(String str) {
        this.zzb = str;
        return this;
    }

    public final zzvx zzh(boolean z10) {
        this.zzk = z10;
        return this;
    }

    public final zzvx zzi(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzg = str;
        return this;
    }

    public final zzvx zzj(String str) {
        this.zze = str;
        return this;
    }

    public final zzvx zzk(List list) {
        Preconditions.checkNotNull(list);
        zzwm zzwmVar = new zzwm();
        this.zzf = zzwmVar;
        zzwmVar.zzc().addAll(list);
        return this;
    }

    public final zzwm zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzd;
    }

    public final String zzn() {
        return this.zzb;
    }

    public final String zzo() {
        return this.zza;
    }

    public final String zzp() {
        return this.zzh;
    }

    public final List zzq() {
        return this.zzm;
    }

    public final List zzr() {
        return this.zzf.zzc();
    }

    public final boolean zzs() {
        return this.zzc;
    }

    public final boolean zzt() {
        return this.zzk;
    }

    public zzvx(String str) {
        this.zza = str;
        this.zzf = new zzwm();
        this.zzm = new ArrayList();
    }

    @SafeParcelable.Constructor
    public zzvx(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z10, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) zzwm zzwmVar, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) String str6, @SafeParcelable.Param(id = 10) long j10, @SafeParcelable.Param(id = 11) long j11, @SafeParcelable.Param(id = 12) boolean z11, @SafeParcelable.Param(id = 13) zze zzeVar, @SafeParcelable.Param(id = 14) List list) {
        zzwm zzb;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = str3;
        this.zze = str4;
        if (zzwmVar == null) {
            zzb = new zzwm();
        } else {
            zzb = zzwm.zzb(zzwmVar);
        }
        this.zzf = zzb;
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = z11;
        this.zzl = zzeVar;
        this.zzm = list == null ? new ArrayList() : list;
    }
}
