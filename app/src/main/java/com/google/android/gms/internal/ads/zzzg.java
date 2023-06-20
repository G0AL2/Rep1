package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzg {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = zzeg.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzbl zzblVar) {
        for (int i10 = 0; i10 < zzblVar.zza(); i10++) {
            zzbk zzb = zzblVar.zzb(i10);
            if (zzb instanceof zzabu) {
                zzabu zzabuVar = (zzabu) zzb;
                if ("iTunSMPB".equals(zzabuVar.zzb) && zzc(zzabuVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzacd) {
                zzacd zzacdVar = (zzacd) zzb;
                if ("com.apple.iTunes".equals(zzacdVar.zza) && "iTunSMPB".equals(zzacdVar.zzb) && zzc(zzacdVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
