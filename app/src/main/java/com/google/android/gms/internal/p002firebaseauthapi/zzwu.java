package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzwu implements zzts {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private final zzxc zzg = new zzxc(null);
    private final zzxc zzh = new zzxc(null);
    private String zzi;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzts
    public final String zza() throws JSONException {
        char c10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        if (!this.zzh.zzb().isEmpty()) {
            List zzb = this.zzh.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < zzb.size(); i10++) {
                jSONArray.put(zzb.get(i10));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List zzb2 = this.zzg.zzb();
        int size = zzb2.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < zzb2.size(); i11++) {
            String str = (String) zzb2.get(i11);
            int i12 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
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
                i12 = 1;
            } else if (c10 != 1) {
                i12 = c10 != 2 ? c10 != 3 ? 0 : 4 : 5;
            }
            iArr[i11] = i12;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < size; i13++) {
                jSONArray2.put(iArr[i13]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put(Scopes.EMAIL, str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzi;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final zzwu zzb(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzh.zzb().add(str);
        return this;
    }

    public final zzwu zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final zzwu zzd(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final zzwu zze(String str) {
        this.zza = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzwu zzf(String str) {
        this.zze = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzwu zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzwu zzh(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzwu zzi(String str) {
        this.zzi = str;
        return this;
    }

    public final String zzj() {
        return this.zzb;
    }

    public final String zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zzd;
    }

    public final String zzm() {
        return this.zzf;
    }

    public final boolean zzn(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zzg.zzb().contains(str);
    }
}
