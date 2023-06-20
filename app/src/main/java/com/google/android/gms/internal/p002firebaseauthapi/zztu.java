package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import fm.castbox.mediation.model.NetworkName;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zztu {
    private final int zza;

    public zztu(String str) {
        int i10 = -1;
        try {
            List zzd = zzad.zzc("[.-]").zzd(str);
            if (zzd.size() == 1) {
                i10 = Integer.parseInt(str);
                str = str;
            } else {
                str = str;
                if (zzd.size() >= 3) {
                    int parseInt = (Integer.parseInt((String) zzd.get(0)) * 1000000) + (Integer.parseInt((String) zzd.get(1)) * 1000);
                    int parseInt2 = Integer.parseInt((String) zzd.get(2));
                    i10 = parseInt + parseInt2;
                    str = parseInt2;
                }
            }
        } catch (IllegalArgumentException e10) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e10));
            }
        }
        this.zza = i10;
    }

    public static zztu zza() {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        return new zztu((TextUtils.isEmpty(version) || version.equals(NetworkName.UNKNOWN)) ? "-1" : "-1");
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }
}
