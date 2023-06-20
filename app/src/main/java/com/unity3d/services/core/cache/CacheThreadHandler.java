package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0382 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.unity3d.services.core.webview.WebViewApp] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.unity3d.services.core.webview.WebViewApp] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.unity3d.services.core.webview.WebViewApp] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.unity3d.services.core.webview.WebViewApp] */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.unity3d.services.core.webview.WebViewApp] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.unity3d.services.core.webview.WebViewApp] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v42, types: [long] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void downloadFile(java.lang.String r24, java.lang.String r25, int r26, int r27, final int r28, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.CacheThreadHandler.downloadFile(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean):void");
    }

    private WebRequest getWebRequest(String str, int i10, int i11, HashMap<String, List<String>> hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new WebRequest(str, "GET", hashMap2, i10, i11);
    }

    private void postProcessDownload(long j10, String str, File file, long j11, long j12, boolean z10, int i10, Map<String, List<String>> map) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (!z10) {
            DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j11 + " bytes downloaded in " + elapsedRealtime + "ms");
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_END, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(elapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(elapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        HashMap<String, List<String>> hashMap;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString(Analytics.Param.TARGET);
        data.remove(Analytics.Param.TARGET);
        int i10 = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i11 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i12 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z10 = data.getBoolean("append", false);
        data.remove("append");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            HashMap<String, List<String>> hashMap2 = new HashMap<>();
            for (String str : data.keySet()) {
                hashMap2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z10 && !file.exists()) || (!z10 && file.exists())) {
            this._active = false;
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z10), Boolean.valueOf(file.exists()));
        } else if (message.what == 1) {
            downloadFile(string, string2, i10, i11, i12, hashMap, z10);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z10) {
        WebRequest webRequest;
        this._canceled = z10;
        if (!z10 || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
