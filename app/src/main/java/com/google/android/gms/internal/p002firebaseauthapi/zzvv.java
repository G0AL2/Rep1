package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "GetAccountInfoResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvv  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzvv extends AbstractSafeParcelable implements zztt<zzvv> {
    @SafeParcelable.Field(getter = "getUserList", id = 2)
    private zzvz zzb;
    private static final String zza = zzvv.class.getSimpleName();
    public static final Parcelable.Creator<zzvv> CREATOR = new zzvw();

    public zzvv() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        zzvz zzvzVar;
        int i10;
        zzvx zzvxVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("users")) {
                this.zzb = new zzvz();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                Parcelable.Creator<zzvz> creator = zzvz.CREATOR;
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzvxVar = new zzvx();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            zzvxVar = new zzvx(Strings.emptyToNull(jSONObject2.optString("localId", null)), Strings.emptyToNull(jSONObject2.optString(Scopes.EMAIL, null)), jSONObject2.optBoolean("emailVerified", z10), Strings.emptyToNull(jSONObject2.optString("displayName", null)), Strings.emptyToNull(jSONObject2.optString("photoUrl", null)), zzwm.zza(jSONObject2.optJSONArray("providerUserInfo")), Strings.emptyToNull(jSONObject2.optString("rawPassword", null)), Strings.emptyToNull(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzwi.zzf(jSONObject2.optJSONArray("mfaInfo")));
                        }
                        arrayList.add(zzvxVar);
                        i11 = i10 + 1;
                        z10 = false;
                    }
                    zzvzVar = new zzvz(arrayList);
                    this.zzb = zzvzVar;
                }
                zzvzVar = new zzvz(new ArrayList());
                this.zzb = zzvzVar;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final List zzb() {
        return this.zzb.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzvv(@SafeParcelable.Param(id = 2) zzvz zzvzVar) {
        zzvz zza2;
        if (zzvzVar == null) {
            zza2 = new zzvz();
        } else {
            zza2 = zzvz.zza(zzvzVar);
        }
        this.zzb = zza2;
    }
}
