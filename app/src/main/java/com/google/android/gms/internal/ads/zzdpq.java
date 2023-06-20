package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdpq {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdpq(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j10 = elapsedRealtime2 - elapsedRealtime;
            boolean z10 = Looper.getMainLooper().getThread() == Thread.currentThread();
            com.google.android.gms.ads.internal.util.zze.zza("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j10 + " on ui thread: " + z10);
        }
        return decodeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Bitmap zza(double d10, boolean z10, zzaix zzaixVar) {
        byte[] bArr = zzaixVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfd)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfe)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final zzfvl zzb(String str, final double d10, final boolean z10) {
        return zzfvc.zzm(this.zza.zza(str), new zzfok() { // from class: com.google.android.gms.internal.ads.zzdpp
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return zzdpq.this.zza(d10, z10, (zzaix) obj);
            }
        }, this.zzc);
    }
}
