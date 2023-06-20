package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.unity3d.services.core.log.DeviceLog;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class CacheThread extends Thread {
    public static final int MSG_DOWNLOAD = 1;
    private static int _connectTimeout = 30000;
    private static CacheThreadHandler _handler = null;
    private static int _progressInterval = 0;
    private static int _readTimeout = 30000;
    private static boolean _ready = false;
    private static final Object _readyLock = new Object();

    public static void cancel() {
        if (_ready) {
            _handler.removeMessages(1);
            _handler.setCancelStatus(true);
        }
    }

    public static synchronized void download(String str, String str2, HashMap<String, List<String>> hashMap, boolean z10) {
        synchronized (CacheThread.class) {
            if (!_ready) {
                init();
            }
            Bundle bundle = new Bundle();
            bundle.putString("source", str);
            bundle.putString(Analytics.Param.TARGET, str2);
            bundle.putInt("connectTimeout", _connectTimeout);
            bundle.putInt("readTimeout", _readTimeout);
            bundle.putInt("progressInterval", _progressInterval);
            bundle.putBoolean("append", z10);
            if (hashMap != null) {
                for (String str3 : hashMap.keySet()) {
                    bundle.putStringArray(str3, (String[]) hashMap.get(str3).toArray(new String[hashMap.get(str3).size()]));
                }
            }
            Message message = new Message();
            message.what = 1;
            message.setData(bundle);
            _handler.setCancelStatus(false);
            _handler.sendMessage(message);
        }
    }

    public static int getConnectTimeout() {
        return _connectTimeout;
    }

    public static int getProgressInterval() {
        return _progressInterval;
    }

    public static int getReadTimeout() {
        return _readTimeout;
    }

    private static void init() {
        CacheThread cacheThread = new CacheThread();
        cacheThread.setName("UnityAdsCacheThread");
        cacheThread.start();
        while (!_ready) {
            try {
                Object obj = _readyLock;
                synchronized (obj) {
                    obj.wait();
                }
            } catch (InterruptedException unused) {
                DeviceLog.debug("Couldn't synchronize thread");
            }
        }
    }

    public static boolean isActive() {
        if (_ready) {
            return _handler.isActive();
        }
        return false;
    }

    public static void setConnectTimeout(int i10) {
        _connectTimeout = i10;
    }

    public static void setProgressInterval(int i10) {
        _progressInterval = i10;
    }

    public static void setReadTimeout(int i10) {
        _readTimeout = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        _handler = new CacheThreadHandler();
        _ready = true;
        Object obj = _readyLock;
        synchronized (obj) {
            obj.notify();
        }
        Looper.loop();
    }
}
