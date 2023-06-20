package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcs {
    private final Pattern zza;

    @VisibleForTesting
    public zzfcs() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfQ));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zza = pattern;
    }

    public final String zza(String str) {
        Pattern pattern = this.zza;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
