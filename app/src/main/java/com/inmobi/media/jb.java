package com.inmobi.media;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/* compiled from: WifiInfoUtil.java */
/* loaded from: classes3.dex */
public final class jb {
    public static boolean a(int i10) {
        return !a(i10, 2);
    }

    public static boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static ja a(boolean z10, boolean z11) {
        Context c10 = ho.c();
        ja jaVar = null;
        String str = null;
        if (c10 == null) {
            return null;
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) c10.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                String bssid = connectionInfo.getBSSID();
                String ssid = connectionInfo.getSSID();
                if (bssid == null || a(z10, ssid)) {
                    return null;
                }
                ja jaVar2 = new ja();
                try {
                    jaVar2.f25824a = a(bssid);
                    if (ssid != null && ssid.startsWith("\"") && ssid.endsWith("\"")) {
                        ssid = ssid.substring(1, ssid.length() - 1);
                    }
                    if (!z11) {
                        str = ssid;
                    }
                    jaVar2.f25825b = str;
                    jaVar2.f25826c = connectionInfo.getRssi();
                    jaVar2.f25827d = connectionInfo.getIpAddress();
                    return jaVar2;
                } catch (Exception e10) {
                    e = e10;
                    jaVar = jaVar2;
                    gg.a().a(new hg(e));
                    return jaVar;
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(boolean z10, String str) {
        return z10 && str != null && str.endsWith("_nomap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(String str) {
        String[] split = str.split("\\:");
        byte[] bArr = new byte[6];
        for (int i10 = 0; i10 < 6; i10++) {
            try {
                bArr[i10] = (byte) Integer.parseInt(split[i10], 16);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        long j10 = (bArr[5] & 255) | ((bArr[4] & 255) << 8);
        return ((bArr[0] & 255) << 40) | ((bArr[3] & 255) << 16) | j10 | ((bArr[2] & 255) << 24) | ((bArr[1] & 255) << 32);
    }
}
