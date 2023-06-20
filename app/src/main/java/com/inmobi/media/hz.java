package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: SystemBroadcastObserver.java */
/* loaded from: classes3.dex */
public class hz {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25711a = "hz";

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, CopyOnWriteArrayList<c>> f25712b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, b> f25713c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static HashMap<String, ConnectivityManager.NetworkCallback> f25714d = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemBroadcastObserver.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final hz f25716a = new hz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemBroadcastObserver.java */
    /* loaded from: classes3.dex */
    public static final class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f25717a = b.class.getSimpleName();

        b() {
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public final void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo;
            if (intent != null) {
                try {
                    if (intent.getAction() != null) {
                        boolean z10 = true;
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                                hz.b(z10, intent.getAction());
                                intent.getAction();
                            }
                            z10 = false;
                            hz.b(z10, intent.getAction());
                            intent.getAction();
                        } else if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equalsIgnoreCase(intent.getAction())) {
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                                z10 = powerManager.isDeviceIdleMode();
                                hz.b(z10, intent.getAction());
                                intent.getAction();
                            }
                            z10 = false;
                            hz.b(z10, intent.getAction());
                            intent.getAction();
                        } else {
                            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                                hz.b(z10, intent.getAction());
                                intent.getAction();
                            }
                            z10 = false;
                            hz.b(z10, intent.getAction());
                            intent.getAction();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* compiled from: SystemBroadcastObserver.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z10, String str) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = f25712b.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(z10);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static hz a() {
        return a.f25716a;
    }

    public final void a(String str, c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = f25712b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(cVar);
        }
        f25712b.put(str, copyOnWriteArrayList);
        if (copyOnWriteArrayList.size() == 1) {
            a(str);
        }
    }

    public static void b(c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            a(cVar, "android.net.conn.CONNECTIVITY_CHANGE");
        } else {
            a(cVar, "SYSTEM_CONNECTIVITY_CHANGE");
        }
    }

    public final void a(c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            a("android.net.conn.CONNECTIVITY_CHANGE", cVar);
        } else {
            a("SYSTEM_CONNECTIVITY_CHANGE", cVar);
        }
    }

    @SuppressLint({"NewApi"})
    private void a(String str) {
        Context c10 = ho.c();
        if (c10 != null) {
            if ("SYSTEM_CONNECTIVITY_CHANGE".equals(str)) {
                ConnectivityManager connectivityManager = (ConnectivityManager) c10.getSystemService("connectivity");
                if (connectivityManager != null) {
                    ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.inmobi.media.hz.1
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onAvailable(Network network) {
                            super.onAvailable(network);
                            hz.b(true, "SYSTEM_CONNECTIVITY_CHANGE");
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onLost(Network network) {
                            super.onLost(network);
                            hz.b(false, "SYSTEM_CONNECTIVITY_CHANGE");
                        }
                    };
                    f25714d.put(str, networkCallback);
                    connectivityManager.registerDefaultNetworkCallback(networkCallback);
                    return;
                }
                return;
            }
            b bVar = new b();
            f25713c.put(str, bVar);
            c10.registerReceiver(bVar, new IntentFilter(str));
        }
    }

    @SuppressLint({"NewApi"})
    public static void a(c cVar, String str) {
        Context c10;
        CopyOnWriteArrayList<c> copyOnWriteArrayList = f25712b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(cVar);
            if (copyOnWriteArrayList.size() != 0 || (c10 = ho.c()) == null) {
                return;
            }
            if ("SYSTEM_CONNECTIVITY_CHANGE".equals(str) && f25714d.get(str) != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) c10.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(f25714d.get(str));
                    f25714d.remove(str);
                }
            } else if (f25713c.get(str) != null) {
                c10.unregisterReceiver(f25713c.get(str));
                f25713c.remove(str);
            }
        }
    }
}
