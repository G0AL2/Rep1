package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: d  reason: collision with root package name */
    private static String f2567d;

    /* renamed from: g  reason: collision with root package name */
    private static d f2570g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f2571a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f2572b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f2566c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f2568e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f2569f = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f2577a;

        /* renamed from: b  reason: collision with root package name */
        final int f2578b;

        /* renamed from: c  reason: collision with root package name */
        final String f2579c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f2580d;

        b(String str, int i10, String str2, Notification notification) {
            this.f2577a = str;
            this.f2578b = i10;
            this.f2579c = str2;
            this.f2580d = notification;
        }

        @Override // androidx.core.app.l.e
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            aVar.T(this.f2577a, this.f2578b, this.f2579c, this.f2580d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f2577a + ", id:" + this.f2578b + ", tag:" + this.f2579c + "]";
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f2581a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f2582b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f2581a = componentName;
            this.f2582b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2583a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f2584b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f2585c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<ComponentName, a> f2586d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f2587e = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NotificationManagerCompat.java */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f2588a;

            /* renamed from: c  reason: collision with root package name */
            android.support.v4.app.a f2590c;

            /* renamed from: b  reason: collision with root package name */
            boolean f2589b = false;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<e> f2591d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f2592e = 0;

            a(ComponentName componentName) {
                this.f2588a = componentName;
            }
        }

        d(Context context) {
            this.f2583a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2584b = handlerThread;
            handlerThread.start();
            this.f2585c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f2589b) {
                return true;
            }
            boolean bindService = this.f2583a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2588a), this, 33);
            aVar.f2589b = bindService;
            if (bindService) {
                aVar.f2592e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f2588a);
                this.f2583a.unbindService(this);
            }
            return aVar.f2589b;
        }

        private void b(a aVar) {
            if (aVar.f2589b) {
                this.f2583a.unbindService(this);
                aVar.f2589b = false;
            }
            aVar.f2590c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f2586d.values()) {
                aVar.f2591d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f2586d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f2586d.get(componentName);
            if (aVar != null) {
                aVar.f2590c = a.AbstractBinderC0026a.X(iBinder);
                aVar.f2592e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f2586d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f2588a + ", " + aVar.f2591d.size() + " queued tasks");
            }
            if (aVar.f2591d.isEmpty()) {
                return;
            }
            if (a(aVar) && aVar.f2590c != null) {
                while (true) {
                    e peek = aVar.f2591d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f2590c);
                        aVar.f2591d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f2588a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f2588a, e10);
                    }
                }
                if (aVar.f2591d.isEmpty()) {
                    return;
                }
                i(aVar);
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f2585c.hasMessages(3, aVar.f2588a)) {
                return;
            }
            int i10 = aVar.f2592e + 1;
            aVar.f2592e = i10;
            if (i10 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + aVar.f2591d.size() + " tasks to " + aVar.f2588a + " after " + aVar.f2592e + " retries");
                aVar.f2591d.clear();
                return;
            }
            int i11 = (1 << (i10 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            this.f2585c.sendMessageDelayed(this.f2585c.obtainMessage(3, aVar.f2588a), i11);
        }

        private void j() {
            Set<String> g10 = l.g(this.f2583a);
            if (g10.equals(this.f2587e)) {
                return;
            }
            this.f2587e = g10;
            List<ResolveInfo> queryIntentServices = this.f2583a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (g10.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f2586d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f2586d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f2586d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f2585c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((e) message.obj);
                return true;
            } else if (i10 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f2581a, cVar.f2582b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f2585c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f2585c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        void a(android.support.v4.app.a aVar) throws RemoteException;
    }

    private l(Context context) {
        this.f2571a = context;
        this.f2572b = (NotificationManager) context.getSystemService("notification");
    }

    public static l f(Context context) {
        return new l(context);
    }

    public static Set<String> g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2566c) {
            if (string != null) {
                if (!string.equals(f2567d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f2568e = hashSet;
                    f2567d = string;
                }
            }
            set = f2568e;
        }
        return set;
    }

    private void j(e eVar) {
        synchronized (f2569f) {
            if (f2570g == null) {
                f2570g = new d(this.f2571a.getApplicationContext());
            }
            f2570g.h(eVar);
        }
    }

    private static boolean k(Notification notification) {
        Bundle a10 = i.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return this.f2572b.areNotificationsEnabled();
        }
        if (i10 >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f2571a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f2571a.getApplicationInfo();
            String packageName = this.f2571a.getApplicationContext().getPackageName();
            int i11 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName)).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                return true;
            }
        }
        return true;
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f2572b.cancel(str, i10);
        if (Build.VERSION.SDK_INT <= 19) {
            j(new a(this.f2571a.getPackageName(), i10, str));
        }
    }

    public void d() {
        this.f2572b.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            j(new a(this.f2571a.getPackageName()));
        }
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2572b.createNotificationChannel(notificationChannel);
        }
    }

    public void h(int i10, Notification notification) {
        i(null, i10, notification);
    }

    public void i(String str, int i10, Notification notification) {
        if (k(notification)) {
            j(new b(this.f2571a.getPackageName(), i10, str, notification));
            this.f2572b.cancel(str, i10);
            return;
        }
        this.f2572b.notify(str, i10, notification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f2573a;

        /* renamed from: b  reason: collision with root package name */
        final int f2574b;

        /* renamed from: c  reason: collision with root package name */
        final String f2575c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f2576d;

        a(String str) {
            this.f2573a = str;
            this.f2574b = 0;
            this.f2575c = null;
            this.f2576d = true;
        }

        @Override // androidx.core.app.l.e
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            if (this.f2576d) {
                aVar.C(this.f2573a);
            } else {
                aVar.i(this.f2573a, this.f2574b, this.f2575c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f2573a + ", id:" + this.f2574b + ", tag:" + this.f2575c + ", all:" + this.f2576d + "]";
        }

        a(String str, int i10, String str2) {
            this.f2573a = str;
            this.f2574b = i10;
            this.f2575c = str2;
            this.f2576d = false;
        }
    }
}
