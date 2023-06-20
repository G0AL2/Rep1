package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "ProviderUserInfoListCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwm  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwm> CREATOR = new zzwn();
    @SafeParcelable.Field(getter = "getProviderUserInfos", id = 2)
    private final List zza;

    public zzwm() {
        this.zza = new ArrayList();
    }

    public static zzwm zza(JSONArray jSONArray) throws JSONException {
        zzwk zzwkVar;
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject == null) {
                    zzwkVar = new zzwk();
                } else {
                    zzwkVar = new zzwk(Strings.emptyToNull(jSONObject.optString("federatedId", null)), Strings.emptyToNull(jSONObject.optString("displayName", null)), Strings.emptyToNull(jSONObject.optString("photoUrl", null)), Strings.emptyToNull(jSONObject.optString("providerId", null)), null, Strings.emptyToNull(jSONObject.optString("phoneNumber", null)), Strings.emptyToNull(jSONObject.optString(Scopes.EMAIL, null)));
                }
                arrayList.add(zzwkVar);
            }
            return new zzwm(arrayList);
        }
        return new zzwm(new ArrayList());
    }

    public static zzwm zzb(zzwm zzwmVar) {
        List list = zzwmVar.zza;
        zzwm zzwmVar2 = new zzwm();
        if (list != null) {
            zzwmVar2.zza.addAll(list);
        }
        return zzwmVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzwm(@SafeParcelable.Param(id = 2) List list) {
        if (list != null && !list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }
}
