package com.amazon.device.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class DtbPackageNativeData {
    private static DtbPackageNativeData packageNativeDataInstance;
    private String applicationLabel;
    private JSONObject json = new JSONObject();
    private String packageName;
    private String versionCode;
    private String versionName;

    private DtbPackageNativeData(Context context) {
        PackageInfo packageInfo;
        this.packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        this.applicationLabel = (String) packageManager.getApplicationLabel(context.getApplicationInfo());
        try {
            packageInfo = packageManager.getPackageInfo(this.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            DtbLog.error("Package " + this.packageName + " not found");
            packageInfo = null;
        }
        this.versionName = packageInfo != null ? packageInfo.versionName : "";
        this.versionCode = packageInfo != null ? Integer.toString(packageInfo.versionCode) : "";
        try {
            this.json.put("lbl", this.applicationLabel);
            this.json.put("pn", this.packageName);
            if (!this.versionCode.equals("")) {
                this.json.put("v", this.versionCode);
            }
            if (this.versionName.equals("")) {
                return;
            }
            this.json.put("vn", this.versionName);
        } catch (JSONException unused2) {
            DtbLog.error("JSON exception while buildinf package native data");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized DtbPackageNativeData getPackageNativeDataInstance(Context context) {
        DtbPackageNativeData dtbPackageNativeData;
        synchronized (DtbPackageNativeData.class) {
            if (packageNativeDataInstance == null) {
                packageNativeDataInstance = new DtbPackageNativeData(context);
            }
            dtbPackageNativeData = packageNativeDataInstance;
        }
        return dtbPackageNativeData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSONObject getParamsJson() {
        return this.json;
    }
}
