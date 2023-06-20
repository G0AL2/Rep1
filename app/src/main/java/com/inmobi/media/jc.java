package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WifiScanner.java */
/* loaded from: classes3.dex */
public class jc {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25828a = "jc";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static Context f25829b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Handler f25830c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f25831d = false;

    /* renamed from: f  reason: collision with root package name */
    private static List<ja> f25833f;

    /* renamed from: e  reason: collision with root package name */
    private static final IntentFilter f25832e = new IntentFilter("android.net.wifi.SCAN_RESULTS");

    /* renamed from: g  reason: collision with root package name */
    private static Runnable f25834g = new Runnable() { // from class: com.inmobi.media.jc.1
        @Override // java.lang.Runnable
        public final void run() {
            jc.e();
        }
    };
    @SuppressLint({"WifiManagerPotentialLeak", "MissingPermission"})

    /* renamed from: h  reason: collision with root package name */
    private static final BroadcastReceiver f25835h = new BroadcastReceiver() { // from class: com.inmobi.media.jc.2
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            jc.e();
            List<ScanResult> scanResults = ((WifiManager) jc.f25829b.getSystemService("wifi")).getScanResults();
            iw.a();
            int i10 = iw.e().f25528w.wf;
            boolean a10 = jb.a(i10);
            boolean a11 = jb.a(i10, 1);
            ArrayList arrayList = new ArrayList();
            if (scanResults != null) {
                for (ScanResult scanResult : scanResults) {
                    if (!jb.a(a10, scanResult.SSID)) {
                        ja jaVar = new ja();
                        jaVar.f25824a = jb.a(scanResult.BSSID);
                        jaVar.f25825b = a11 ? null : scanResult.SSID;
                        jaVar.f25826c = scanResult.level;
                        arrayList.add(jaVar);
                    }
                }
            }
            List unused = jc.f25833f = arrayList;
        }
    };

    public static List<ja> b() {
        return f25833f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void e() {
        synchronized (jc.class) {
            Handler handler = f25830c;
            if (handler == null) {
                return;
            }
            handler.removeCallbacks(f25834g);
            if (f25831d) {
                f25831d = false;
                try {
                    f25829b.unregisterReceiver(f25835h);
                } catch (IllegalArgumentException unused) {
                }
            }
            f25830c = null;
            f25829b = null;
        }
    }

    public static void a() {
        f25829b = ho.c();
        a(Looper.myLooper());
    }

    @SuppressLint({"MissingPermission"})
    private static synchronized void a(Looper looper) {
        synchronized (jc.class) {
            if (f25830c != null) {
                return;
            }
            Context c10 = ho.c();
            if (c10 == null) {
                return;
            }
            WifiManager wifiManager = (WifiManager) c10.getSystemService("wifi");
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                Handler handler = new Handler(looper);
                f25830c = handler;
                handler.postDelayed(f25834g, 10000L);
                if (!f25831d) {
                    f25831d = true;
                    f25829b.registerReceiver(f25835h, f25832e, null, f25830c);
                }
                wifiManager.startScan();
            }
        }
    }
}
