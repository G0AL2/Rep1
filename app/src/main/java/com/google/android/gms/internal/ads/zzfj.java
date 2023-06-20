package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfj extends zzer {
    public final zzev zzb;
    public final int zzc;

    public zzfj(zzev zzevVar, int i10, int i11) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzevVar;
        this.zzc = 1;
    }

    public static zzfj zza(IOException iOException, zzev zzevVar, int i10) {
        String message = iOException.getMessage();
        int i11 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL;
        } else if (message != null && zzfoc.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        }
        if (i11 == 2007) {
            return new zzfi(iOException, zzevVar);
        }
        return new zzfj(iOException, zzevVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10;
    }

    public zzfj(IOException iOException, zzev zzevVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = zzevVar;
        this.zzc = i11;
    }

    public zzfj(String str, zzev zzevVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = zzevVar;
        this.zzc = i11;
    }

    public zzfj(String str, IOException iOException, zzev zzevVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = zzevVar;
        this.zzc = i11;
    }
}
