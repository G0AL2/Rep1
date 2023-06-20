package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "VerifyCustomTokenResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxi  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzxi extends AbstractSafeParcelable implements zztt<zzxi> {
    @SafeParcelable.Field(getter = "getIdToken", id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getRefreshToken", id = 3)
    private String zzc;
    @SafeParcelable.Field(getter = "getExpiresIn", id = 4)
    private long zzd;
    @SafeParcelable.Field(getter = "isNewUser", id = 5)
    private boolean zze;
    private static final String zza = zzxi.class.getSimpleName();
    public static final Parcelable.Creator<zzxi> CREATOR = new zzxj();

    public zzxi() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final long zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzxi(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) long j10, @SafeParcelable.Param(id = 5) boolean z10) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j10;
        this.zze = z10;
    }
}
