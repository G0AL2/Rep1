package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* renamed from: f  reason: collision with root package name */
    private static AppLovinBroadcastManager f7939f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f7940g = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f7941a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Receiver, ArrayList<b>> f7942b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f7943c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f7944d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f7945e = new Handler(Looper.getMainLooper()) { // from class: com.applovin.impl.sdk.AppLovinBroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.this.a();
            } else {
                super.handleMessage(message);
            }
        }
    };

    /* loaded from: classes.dex */
    public interface Receiver {
        void onReceive(Context context, Intent intent, Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f7947a;

        /* renamed from: b  reason: collision with root package name */
        final Map<String, Object> f7948b;

        /* renamed from: c  reason: collision with root package name */
        final List<b> f7949c;

        a(Intent intent, Map<String, Object> map, List<b> list) {
            this.f7947a = intent;
            this.f7948b = map;
            this.f7949c = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f7950a;

        /* renamed from: b  reason: collision with root package name */
        final Receiver f7951b;

        /* renamed from: c  reason: collision with root package name */
        boolean f7952c;

        /* renamed from: d  reason: collision with root package name */
        boolean f7953d;

        b(IntentFilter intentFilter, Receiver receiver) {
            this.f7950a = intentFilter;
            this.f7951b = receiver;
        }
    }

    private AppLovinBroadcastManager(Context context) {
        this.f7941a = context;
    }

    private List<b> a(Intent intent) {
        synchronized (this.f7942b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f7941a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<b> arrayList = this.f7943c.get(action);
            if (arrayList == null) {
                return null;
            }
            ArrayList<b> arrayList2 = null;
            for (b bVar : arrayList) {
                if (!bVar.f7952c && bVar.f7950a.match(action, resolveTypeIfNeeded, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList3.add(bVar);
                    bVar.f7952c = true;
                    arrayList2 = arrayList3;
                }
            }
            if (arrayList2 == null) {
                return null;
            }
            for (b bVar2 : arrayList2) {
                bVar2.f7952c = false;
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (this.f7942b) {
                size = this.f7944d.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                this.f7944d.toArray(aVarArr);
                this.f7944d.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = aVarArr[i10];
                if (aVar != null) {
                    for (b bVar : aVar.f7949c) {
                        if (bVar != null && !bVar.f7953d) {
                            bVar.f7951b.onReceive(this.f7941a, aVar.f7947a, aVar.f7948b);
                        }
                    }
                }
            }
        }
    }

    public static AppLovinBroadcastManager getInstance(Context context) {
        AppLovinBroadcastManager appLovinBroadcastManager;
        synchronized (f7940g) {
            if (f7939f == null) {
                f7939f = new AppLovinBroadcastManager(context.getApplicationContext());
            }
            appLovinBroadcastManager = f7939f;
        }
        return appLovinBroadcastManager;
    }

    public void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        synchronized (this.f7942b) {
            b bVar = new b(intentFilter, receiver);
            ArrayList<b> arrayList = this.f7942b.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f7942b.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                ArrayList<b> arrayList2 = this.f7943c.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f7943c.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (this.f7942b) {
            List<b> a10 = a(intent);
            if (a10 == null) {
                return false;
            }
            this.f7944d.add(new a(intent, map, a10));
            if (!this.f7945e.hasMessages(1)) {
                this.f7945e.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<b> a10 = a(intent);
        if (a10 == null) {
            return;
        }
        for (b bVar : a10) {
            if (!bVar.f7953d) {
                bVar.f7951b.onReceive(this.f7941a, intent, map);
            }
        }
    }

    public void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            a();
        }
    }

    public boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public void unregisterReceiver(Receiver receiver) {
        synchronized (this.f7942b) {
            ArrayList<b> remove = this.f7942b.remove(receiver);
            if (remove == null) {
                return;
            }
            for (b bVar : remove) {
                bVar.f7953d = true;
                Iterator<String> actionsIterator = bVar.f7950a.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    ArrayList<b> arrayList = this.f7943c.get(next);
                    if (arrayList != null) {
                        Iterator<b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().f7951b == receiver) {
                                bVar.f7953d = true;
                                it.remove();
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f7943c.remove(next);
                        }
                    }
                }
            }
        }
    }
}
