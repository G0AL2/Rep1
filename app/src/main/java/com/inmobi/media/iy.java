package com.inmobi.media;

import android.annotation.TargetApi;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.google.android.gms.common.api.Api;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CellTowerInfo.java */
/* loaded from: classes3.dex */
public class iy {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25817d = "iy";

    /* renamed from: a  reason: collision with root package name */
    String f25818a;

    /* renamed from: b  reason: collision with root package name */
    int f25819b;

    /* renamed from: c  reason: collision with root package name */
    int f25820c;

    public iy() {
    }

    public static String a(String str, int i10, int i11, int i12) {
        return str + "#" + i10 + "#" + i11 + "#" + i12;
    }

    @TargetApi(18)
    public iy(CellInfo cellInfo, String str, String str2, int i10) {
        if (cellInfo instanceof CellInfoGsm) {
            this.f25820c = i10;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f25819b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            this.f25818a = a(str, str2, cellIdentity.getLac(), cellIdentity.getCid(), -1, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else if (cellInfo instanceof CellInfoCdma) {
            this.f25820c = i10;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.f25819b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            this.f25818a = a(str, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
        } else if (Build.VERSION.SDK_INT >= 18) {
            if (cellInfo instanceof CellInfoWcdma) {
                this.f25820c = i10;
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                this.f25819b = cellInfoWcdma.getCellSignalStrength().getDbm();
                CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
                this.f25818a = a(str, str2, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        } else if (cellInfo instanceof CellInfoLte) {
            this.f25820c = i10;
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            this.f25819b = cellInfoLte.getCellSignalStrength().getDbm();
            CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
            this.f25818a = a(str, str2, cellIdentity4.getTac(), cellIdentity4.getCi(), -1, cellIdentity4.getPci());
        }
    }

    public static String a(String str, String str2, int i10, int i11, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("#");
        sb2.append(str2);
        sb2.append("#");
        sb2.append(i10);
        sb2.append("#");
        sb2.append(i11);
        sb2.append("#");
        sb2.append(i12 == -1 ? "" : Integer.valueOf(i12));
        sb2.append("#");
        sb2.append(i13 != Integer.MAX_VALUE ? Integer.valueOf(i13) : "");
        return sb2.toString();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f25818a);
            int i10 = this.f25819b;
            if (i10 != Integer.MAX_VALUE) {
                jSONObject.put("ss", i10);
            }
            jSONObject.put("nt", this.f25820c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
