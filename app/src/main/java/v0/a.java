package v0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f37738f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static a f37739g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f37740a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f37741b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f37742c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<b> f37743d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f37744e;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: v0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class HandlerC0517a extends Handler {
        HandlerC0517a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final Intent f37746a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<c> f37747b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f37746a = intent;
            this.f37747b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalBroadcastManager.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f37748a;

        /* renamed from: b  reason: collision with root package name */
        final BroadcastReceiver f37749b;

        /* renamed from: c  reason: collision with root package name */
        boolean f37750c;

        /* renamed from: d  reason: collision with root package name */
        boolean f37751d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f37748a = intentFilter;
            this.f37749b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f37749b);
            sb2.append(" filter=");
            sb2.append(this.f37748a);
            if (this.f37751d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f37740a = context;
        this.f37744e = new HandlerC0517a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f37738f) {
            if (f37739g == null) {
                f37739g = new a(context.getApplicationContext());
            }
            aVar = f37739g;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f37741b) {
                size = this.f37743d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f37743d.toArray(bVarArr);
                this.f37743d.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f37747b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f37747b.get(i11);
                    if (!cVar.f37751d) {
                        cVar.f37749b.onReceive(this.f37740a, bVar.f37746a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f37741b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f37741b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f37741b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f37742c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f37742c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f37741b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f37740a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f37742c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f37748a);
                    }
                    if (cVar.f37750c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f37748a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f37750c = true;
                            i11 = i10 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).f37750c = false;
                    }
                    this.f37743d.add(new b(intent, arrayList5));
                    if (!this.f37744e.hasMessages(1)) {
                        this.f37744e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f37741b) {
            ArrayList<c> remove = this.f37741b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f37751d = true;
                for (int i10 = 0; i10 < cVar.f37748a.countActions(); i10++) {
                    String action = cVar.f37748a.getAction(i10);
                    ArrayList<c> arrayList = this.f37742c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f37749b == broadcastReceiver) {
                                cVar2.f37751d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f37742c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
