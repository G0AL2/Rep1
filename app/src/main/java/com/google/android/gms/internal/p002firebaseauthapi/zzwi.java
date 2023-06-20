package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "MfaInfoCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwi  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwi> CREATOR = new zzwj();
    @SafeParcelable.Field(getter = "getPhoneInfo", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getMfaEnrollmentId", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getEnrolledAtTimestampInSeconds", id = 4)
    private final long zzd;
    private String zze;

    @SafeParcelable.Constructor
    public zzwi(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) long j10) {
        this.zza = str;
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zzd = j10;
    }

    public static zzwi zzb(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("phoneInfo", null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", null);
        String optString3 = jSONObject.optString("displayName", null);
        long j10 = 0;
        if (jSONObject.has("enrolledAt") && (optJSONObject = jSONObject.optJSONObject("enrolledAt")) != null && optJSONObject.has("seconds")) {
            j10 = optJSONObject.optLong("seconds", 0L);
        }
        zzwi zzwiVar = new zzwi(optString, optString2, optString3, j10);
        zzwiVar.zze = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzwiVar;
    }

    public static List zzf(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(zzb(jSONArray.getJSONObject(i10)));
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }
}
