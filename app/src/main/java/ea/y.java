package ea;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: e */
    private static y f29780e;

    /* renamed from: a */
    private final Handler f29781a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<c>> f29782b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f29783c = new Object();

    /* renamed from: d */
    private int f29784d = 0;

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private static volatile boolean f29785a;
    }

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes2.dex */
    public final class d extends BroadcastReceiver {
        private d() {
            y.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int g10 = y.g(context);
            int i10 = n0.f29709a;
            if (i10 >= 29 && !b.f29785a && g10 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) ea.a.e((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i10 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, 1048576);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            y.this.k(g10);
        }
    }

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes2.dex */
    private class e extends PhoneStateListener {
        private e() {
            y.this = r1;
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            y.this.k(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            y.this.k(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private y(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static /* synthetic */ void a(y yVar, c cVar) {
        yVar.h(cVar);
    }

    public static synchronized y d(Context context) {
        y yVar;
        synchronized (y.class) {
            if (f29780e == null) {
                f29780e = new y(context);
            }
            yVar = f29780e;
        }
        return yVar;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return n0.f29709a >= 29 ? 9 : 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        Iterator<WeakReference<c>> it = this.f29782b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f29782b.remove(next);
            }
        }
    }

    public void k(int i10) {
        synchronized (this.f29783c) {
            if (this.f29784d == i10) {
                return;
            }
            this.f29784d = i10;
            Iterator<WeakReference<c>> it = this.f29782b.iterator();
            while (it.hasNext()) {
                WeakReference<c> next = it.next();
                c cVar = next.get();
                if (cVar != null) {
                    cVar.a(i10);
                } else {
                    this.f29782b.remove(next);
                }
            }
        }
    }

    public int f() {
        int i10;
        synchronized (this.f29783c) {
            i10 = this.f29784d;
        }
        return i10;
    }

    public void i(final c cVar) {
        j();
        this.f29782b.add(new WeakReference<>(cVar));
        this.f29781a.post(new Runnable() { // from class: ea.x
            @Override // java.lang.Runnable
            public final void run() {
                y.a(y.this, cVar);
            }
        });
    }
}
