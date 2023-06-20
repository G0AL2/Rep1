package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "GetTokenResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwe  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwe extends AbstractSafeParcelable implements zztt<zzwe> {
    @SafeParcelable.Field(getter = "getRefreshToken", id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getAccessToken", id = 3)
    private String zzc;
    @SafeParcelable.Field(getter = "getExpiresIn", id = 4)
    private Long zzd;
    @SafeParcelable.Field(getter = "getTokenType", id = 5)
    private String zze;
    @SafeParcelable.Field(getter = "getIssuedAt", id = 6)
    private Long zzf;
    private static final String zza = zzwe.class.getSimpleName();
    public static final Parcelable.Creator<zzwe> CREATOR = new zzwf();

    public zzwe() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public static zzwe zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzwe zzweVar = new zzwe();
            zzweVar.zzb = jSONObject.optString("refresh_token", null);
            zzweVar.zzc = jSONObject.optString("access_token", null);
            zzweVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzweVar.zze = jSONObject.optString("token_type", null);
            zzweVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzweVar;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zznd(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLongObject(parcel, 4, Long.valueOf(zzb()), false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeLongObject(parcel, 6, Long.valueOf(this.zzf.longValue()), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("refresh_token"));
            this.zzc = Strings.emptyToNull(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = Strings.emptyToNull(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzc() {
        return this.zzf.longValue();
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zze;
    }

    public final String zzh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zznd(e10);
        }
    }

    public final void zzi(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    public final boolean zzj() {
        return DefaultClock.getInstance().currentTimeMillis() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }

    public zzwe(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzwe(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) Long l10, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }
}
