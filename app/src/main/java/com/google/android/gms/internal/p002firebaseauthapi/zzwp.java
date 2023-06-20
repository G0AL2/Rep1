package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@SafeParcelable.Class(creator = "ResetPasswordResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwp  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwp extends AbstractSafeParcelable implements zztt<zzwp> {
    @SafeParcelable.Field(getter = "getEmail", id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getNewEmail", id = 3)
    private String zzc;
    @SafeParcelable.Field(getter = "getRequestType", id = 4)
    private String zzd;
    @SafeParcelable.Field(getter = "getMfaInfo", id = 5)
    private zzwi zze;
    private static final String zza = zzwp.class.getSimpleName();
    public static final Parcelable.Creator<zzwp> CREATOR = new zzwq();

    public zzwp() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztt
    public final /* bridge */ /* synthetic */ zztt zza(String str) throws zzrm {
        String str2;
        char c10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString(Scopes.EMAIL));
            this.zzc = Strings.emptyToNull(jSONObject.optString("newEmail"));
            int optInt = jSONObject.optInt("reqType");
            if (optInt != 1) {
                switch (optInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.zzd = str2;
            if (TextUtils.isEmpty(str2)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        if (optString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                this.zzd = (c10 == 0 || c10 == 1 || c10 == 2 || c10 == 3 || c10 == 4 || c10 == 5) ? optString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.zze = zzwi.zzb(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzxq.zza(e10, zza, str);
        }
    }

    public final zzwi zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zzb != null;
    }

    public final boolean zzg() {
        return this.zze != null;
    }

    public final boolean zzh() {
        return this.zzc != null;
    }

    public final boolean zzi() {
        return this.zzd != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzwp(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) zzwi zzwiVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = zzwiVar;
    }
}
