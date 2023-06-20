package com.inmobi.media;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: CellularInfoUtil.java */
@TargetApi(17)
/* loaded from: classes3.dex */
public class iz {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25821a = "iz";

    public static Map<String, String> a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        Context c10 = ho.c();
        if (c10 == null) {
            return hashMap;
        }
        iw.a();
        String m10 = ho.m();
        jd c11 = jf.c();
        String str3 = null;
        String e10 = c11 != null ? c11.e() : null;
        if ((m10 == null || iw.a(m10).f25527c.f25526oe) && (e10 == null || c11.c()) && (!(c11 != null && c11.d()) || iw.a(e10).f25527c.f25526oe)) {
            String g10 = "InMobi".equals(str) ? ho.g() : ho.h();
            iw.a();
            int i10 = iw.a(g10).f25527c.cof;
            boolean a10 = a(i10, 2);
            boolean a11 = a(i10, 1);
            ix ixVar = new ix();
            TelephonyManager telephonyManager = (TelephonyManager) c10.getSystemService("phone");
            if (!a10) {
                int[] b10 = b(telephonyManager.getNetworkOperator());
                ixVar.f25812a = b10[0];
                ixVar.f25813b = b10[1];
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (networkCountryIso != null) {
                    ixVar.f25816e = networkCountryIso.toLowerCase(Locale.ENGLISH);
                }
            }
            if (!a11) {
                int[] b11 = b(telephonyManager.getSimOperator());
                ixVar.f25814c = b11[0];
                ixVar.f25815d = b11[1];
            }
            if (ixVar.f25814c == -1 && ixVar.f25815d == -1) {
                str2 = null;
            } else {
                str2 = ixVar.f25814c + "_" + ixVar.f25815d;
            }
            hashMap.put("s-ho", str2);
            if (ixVar.f25812a != -1 || ixVar.f25813b != -1) {
                str3 = ixVar.f25812a + "_" + ixVar.f25813b;
            }
            hashMap.put("s-co", str3);
            hashMap.put("s-iso", ixVar.f25816e);
            hashMap.put("s-cn", ib.a(c10));
            return hashMap;
        }
        return hashMap;
    }

    private static boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    private static int[] b(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !"".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str.substring(0, 3));
                int parseInt2 = Integer.parseInt(str.substring(3));
                iArr[0] = parseInt;
                iArr[1] = parseInt2;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }

    @SuppressLint({"NewApi"})
    private static boolean c() {
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = (LocationManager) ho.c().getSystemService("location");
            return locationManager != null && locationManager.isLocationEnabled();
        }
        return true;
    }

    private static boolean d() {
        if (ho.a()) {
            boolean a10 = hw.a(ho.c(), "android.permission.READ_PHONE_STATE");
            boolean a11 = hw.a(ho.c(), "android.permission.ACCESS_FINE_LOCATION");
            int i10 = Build.VERSION.SDK_INT;
            return i10 == 29 ? a11 : i10 >= 30 ? a11 && a10 : hw.a(ho.c(), "android.permission.ACCESS_COARSE_LOCATION") || a11;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> b() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.iz.b():java.util.Map");
    }

    @SuppressLint({"MissingPermission"})
    private static int a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return telephonyManager.getDataNetworkType();
        }
        return telephonyManager.getNetworkType();
    }

    public static Map<String, String> a() {
        Context c10;
        List<CellInfo> allCellInfo;
        iw.a();
        String m10 = ho.m();
        jd c11 = jf.c();
        iy iyVar = null;
        String e10 = c11 != null ? c11.e() : null;
        if (((m10 == null || iw.a(m10).f25527c.cce) && (e10 == null || c11.c()) && (!(c11 != null && c11.d()) || iw.a(e10).f25527c.cce)) && d() && c() && (c10 = ho.c()) != null) {
            TelephonyManager telephonyManager = (TelephonyManager) c10.getSystemService("phone");
            int[] b10 = b(telephonyManager.getNetworkOperator());
            String valueOf = String.valueOf(b10[0]);
            String valueOf2 = String.valueOf(b10[1]);
            if (Build.VERSION.SDK_INT >= 17 && (allCellInfo = telephonyManager.getAllCellInfo()) != null) {
                CellInfo cellInfo = null;
                for (int i10 = 0; i10 < allCellInfo.size(); i10++) {
                    cellInfo = allCellInfo.get(i10);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    iyVar = new iy(cellInfo, valueOf, valueOf2, a(telephonyManager));
                }
            }
            CellLocation cellLocation = telephonyManager.getCellLocation();
            if (cellLocation != null && b10[0] != -1) {
                iyVar = new iy();
                if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    iyVar.f25819b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    iyVar.f25820c = a(telephonyManager);
                    iyVar.f25818a = iy.a(valueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                } else {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    iyVar.f25819b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    iyVar.f25820c = a(telephonyManager);
                    iyVar.f25818a = iy.a(valueOf, valueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            }
        }
        HashMap hashMap = new HashMap();
        if (iyVar != null) {
            hashMap.put("c-sc", iyVar.a().toString());
        }
        return hashMap;
    }
}
