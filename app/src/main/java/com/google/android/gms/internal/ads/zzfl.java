package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfl extends zzfj {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzfl(int i10, String str, IOException iOException, Map map, zzev zzevVar, byte[] bArr) {
        super("Response code: " + i10, iOException, zzevVar, 2004, 1);
        this.zzd = i10;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}
