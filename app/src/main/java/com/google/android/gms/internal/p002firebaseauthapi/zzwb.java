package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwb  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwb implements zzts {
    private final String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private ActionCodeSettings zze;
    private String zzf;

    public zzwb(int i10) {
        this.zza = i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private zzwb(int i10, ActionCodeSettings actionCodeSettings, String str, String str2, String str3, String str4) {
        this.zza = "VERIFY_AND_CHANGE_EMAIL";
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
    }

    public static zzwb zzc(ActionCodeSettings actionCodeSettings, String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(actionCodeSettings);
        return new zzwb(7, actionCodeSettings, null, str2, str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        char c10;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            i10 = 1;
        } else if (c10 == 1) {
            i10 = 4;
        } else if (c10 == 2) {
            i10 = 6;
        } else if (c10 == 3) {
            i10 = 7;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(Scopes.EMAIL, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.zze;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.k1());
            jSONObject.put("canHandleCodeInApp", this.zze.j1());
            if (this.zze.o1() != null) {
                jSONObject.put("continueUrl", this.zze.o1());
            }
            if (this.zze.n1() != null) {
                jSONObject.put("iosBundleId", this.zze.n1());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.m1() != null) {
                jSONObject.put("androidPackageName", this.zze.m1());
            }
            if (this.zze.l1() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.l1());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        return jSONObject.toString();
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzwb zzd(ActionCodeSettings actionCodeSettings) {
        this.zze = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        return this;
    }

    public final zzwb zze(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzwb zzf(String str) {
        this.zzf = str;
        return this;
    }

    public final zzwb zzg(String str) {
        this.zzd = Preconditions.checkNotEmpty(str);
        return this;
    }
}
