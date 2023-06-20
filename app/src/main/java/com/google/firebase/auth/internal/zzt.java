package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p002firebaseauthapi.zznd;
import com.google.android.gms.internal.p002firebaseauthapi.zzvx;
import com.google.android.gms.internal.p002firebaseauthapi.zzwk;
import com.google.firebase.auth.d0;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import org.json.JSONException;
import org.json.JSONObject;
import sb.o0;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "DefaultAuthUserInfoCreator")
/* loaded from: classes3.dex */
public final class zzt extends AbstractSafeParcelable implements d0 {
    public static final Parcelable.Creator<zzt> CREATOR = new o0();
    @SafeParcelable.Field(getter = "getUid", id = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f23300a;
    @SafeParcelable.Field(getter = "getProviderId", id = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f23301b;
    @SafeParcelable.Field(getter = "getDisplayName", id = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f23302c;
    @SafeParcelable.Field(getter = "getPhotoUrlString", id = 4)

    /* renamed from: d  reason: collision with root package name */
    private String f23303d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f23304e;
    @SafeParcelable.Field(getter = "getEmail", id = 5)

    /* renamed from: f  reason: collision with root package name */
    private final String f23305f;
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 6)

    /* renamed from: g  reason: collision with root package name */
    private final String f23306g;
    @SafeParcelable.Field(getter = "isEmailVerified", id = 7)

    /* renamed from: h  reason: collision with root package name */
    private final boolean f23307h;
    @SafeParcelable.Field(getter = "getRawUserInfo", id = 8)

    /* renamed from: i  reason: collision with root package name */
    private final String f23308i;

    public zzt(zzvx zzvxVar, String str) {
        Preconditions.checkNotNull(zzvxVar);
        Preconditions.checkNotEmpty("firebase");
        this.f23300a = Preconditions.checkNotEmpty(zzvxVar.zzo());
        this.f23301b = "firebase";
        this.f23305f = zzvxVar.zzn();
        this.f23302c = zzvxVar.zzm();
        Uri zzc = zzvxVar.zzc();
        if (zzc != null) {
            this.f23303d = zzc.toString();
            this.f23304e = zzc;
        }
        this.f23307h = zzvxVar.zzs();
        this.f23308i = null;
        this.f23306g = zzvxVar.zzp();
    }

    @Override // com.google.firebase.auth.d0
    public final String e() {
        return this.f23300a;
    }

    @Override // com.google.firebase.auth.d0
    public final String getDisplayName() {
        return this.f23302c;
    }

    @Override // com.google.firebase.auth.d0
    public final String getEmail() {
        return this.f23305f;
    }

    @Override // com.google.firebase.auth.d0
    public final String getPhoneNumber() {
        return this.f23306g;
    }

    @Override // com.google.firebase.auth.d0
    public final Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.f23303d) && this.f23304e == null) {
            this.f23304e = Uri.parse(this.f23303d);
        }
        return this.f23304e;
    }

    @Override // com.google.firebase.auth.d0
    public final String q() {
        return this.f23301b;
    }

    @Override // com.google.firebase.auth.d0
    public final boolean r0() {
        return this.f23307h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f23300a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f23301b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f23302c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f23303d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f23305f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f23306g, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f23307h);
        SafeParcelWriter.writeString(parcel, 8, this.f23308i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.f23308i;
    }

    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(DataKeys.USER_ID, this.f23300a);
            jSONObject.putOpt("providerId", this.f23301b);
            jSONObject.putOpt("displayName", this.f23302c);
            jSONObject.putOpt("photoUrl", this.f23303d);
            jSONObject.putOpt(Scopes.EMAIL, this.f23305f);
            jSONObject.putOpt("phoneNumber", this.f23306g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f23307h));
            jSONObject.putOpt("rawUserInfo", this.f23308i);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zznd(e10);
        }
    }

    public zzt(zzwk zzwkVar) {
        Preconditions.checkNotNull(zzwkVar);
        this.f23300a = zzwkVar.zzd();
        this.f23301b = Preconditions.checkNotEmpty(zzwkVar.zzf());
        this.f23302c = zzwkVar.zzb();
        Uri zza = zzwkVar.zza();
        if (zza != null) {
            this.f23303d = zza.toString();
            this.f23304e = zza;
        }
        this.f23305f = zzwkVar.zzc();
        this.f23306g = zzwkVar.zze();
        this.f23307h = false;
        this.f23308i = zzwkVar.zzg();
    }

    @SafeParcelable.Constructor
    @VisibleForTesting
    public zzt(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 3) String str5, @SafeParcelable.Param(id = 6) String str6, @SafeParcelable.Param(id = 7) boolean z10, @SafeParcelable.Param(id = 8) String str7) {
        this.f23300a = str;
        this.f23301b = str2;
        this.f23305f = str3;
        this.f23306g = str4;
        this.f23302c = str5;
        this.f23303d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f23304e = Uri.parse(this.f23303d);
        }
        this.f23307h = z10;
        this.f23308i = str7;
    }
}
