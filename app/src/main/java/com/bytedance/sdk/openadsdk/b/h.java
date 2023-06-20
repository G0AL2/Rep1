package com.bytedance.sdk.openadsdk.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.b.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: AdEventThread.java */
/* loaded from: classes.dex */
public class h<T extends k> extends HandlerThread implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static String f11091a = "AdEventThread";

    /* renamed from: b  reason: collision with root package name */
    public static String f11092b = "ttad_bk";

    /* renamed from: l  reason: collision with root package name */
    private static long f11093l = 180000;

    /* renamed from: c  reason: collision with root package name */
    public final f<T> f11094c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.n<T> f11095d;

    /* renamed from: e  reason: collision with root package name */
    public final List<T> f11096e;

    /* renamed from: f  reason: collision with root package name */
    public long f11097f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11098g;

    /* renamed from: h  reason: collision with root package name */
    public int f11099h;

    /* renamed from: i  reason: collision with root package name */
    public Handler f11100i;

    /* renamed from: j  reason: collision with root package name */
    public final b f11101j;

    /* renamed from: k  reason: collision with root package name */
    public final c f11102k;

    /* compiled from: AdEventThread.java */
    /* loaded from: classes.dex */
    private static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<Handler> f11103a;

        public a(Handler handler) {
            this.f11103a = new WeakReference<>(handler);
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            com.bytedance.sdk.component.utils.l.c(h.f11091a, "EventTimerRunnable: run");
            WeakReference<Handler> weakReference = this.f11103a;
            if (weakReference == null || weakReference.get() == null || (handler = this.f11103a.get()) == null) {
                return;
            }
            handler.removeMessages(6);
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 6;
            handler.sendMessage(obtainMessage);
            com.bytedance.sdk.openadsdk.core.k.c().postDelayed(this, h.f11093l);
        }
    }

    /* compiled from: AdEventThread.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a();
    }

    /* compiled from: AdEventThread.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f11104a;

        /* renamed from: b  reason: collision with root package name */
        final long f11105b;

        /* renamed from: c  reason: collision with root package name */
        final long f11106c;

        /* renamed from: d  reason: collision with root package name */
        final int f11107d;

        /* renamed from: e  reason: collision with root package name */
        final long f11108e;

        /* renamed from: f  reason: collision with root package name */
        final long f11109f;

        c(int i10, long j10, long j11, int i11, long j12, long j13) {
            this.f11104a = i10;
            this.f11105b = j10;
            this.f11106c = j11;
            this.f11107d = i11;
            this.f11108e = j12;
            this.f11109f = j13;
        }

        public static c a() {
            return new c(1, 120000L, 15000L, 5, 172800000L, 300000L);
        }

        public static c b() {
            return new c(3, 120000L, 15000L, 5, 172800000L, 300000L);
        }
    }

    public h(f<T> fVar, com.bytedance.sdk.openadsdk.core.n<T> nVar, c cVar, b bVar) {
        this(f11092b, f11091a, fVar, nVar, cVar, bVar);
    }

    private boolean a(List<T> list, boolean z10) {
        i a10 = a(list);
        if (a10 != null) {
            if (a10.f11110a) {
                a("onHandleServerBusyRetryEvent, success");
                e(list);
                a(z10);
                return true;
            } else if (a(a10)) {
                int i10 = this.f11099h + 1;
                this.f11099h = i10;
                this.f11094c.a(i10);
                f<T> fVar = this.f11094c;
                c cVar = this.f11102k;
                fVar.a(list, cVar.f11107d, cVar.f11108e);
                i();
                a("onHandleServerBusyRetryEvent, serverbusy, count = " + this.f11099h);
                return false;
            } else if (!b(a10) && !a(list, a10)) {
                j();
                return false;
            } else {
                e(list);
                a(true);
                return false;
            }
        }
        return false;
    }

    private void c() {
        f<T> fVar = this.f11094c;
        c cVar = this.f11102k;
        fVar.a(cVar.f11107d, cVar.f11108e);
        this.f11098g = this.f11094c.a();
        this.f11099h = this.f11094c.b();
        if (this.f11098g) {
            a("onHandleInitEvent serverBusy, retryCount = " + this.f11099h);
            i();
            return;
        }
        b(this.f11094c.a(30, "_id"));
        a("onHandleInitEvent cacheData count = " + this.f11096e.size());
        h();
    }

    private void d() {
        f<T> fVar = this.f11094c;
        c cVar = this.f11102k;
        fVar.a(cVar.f11107d, cVar.f11108e);
        this.f11098g = this.f11094c.a();
        this.f11099h = this.f11094c.b();
        if (this.f11098g) {
            a("onHandleInitEvent serverBusy, retryCount = " + this.f11099h);
            i();
            return;
        }
        b(this.f11094c.a(30, "_id"));
        d(this.f11096e);
        a("onHandleInitEvent cacheData count = " + this.f11096e.size());
        h();
    }

    private void e() {
        if (!this.f11101j.a()) {
            a(4, this.f11102k.f11106c);
            a("onHandleServerBusyRetryEvent, no net");
            return;
        }
        List<T> a10 = this.f11094c.a(30, "_id");
        if (com.bytedance.sdk.component.utils.j.a(a10)) {
            a("onHandleServerBusyRetryEvent, empty list start routine");
            o();
            k();
        } else if (a()) {
            Iterator<Map.Entry<String, List<T>>> it = f(a10).entrySet().iterator();
            while (it.hasNext() && a(it.next().getValue(), !it.hasNext())) {
            }
        } else {
            a((List) a10, true);
        }
    }

    private void f() {
        if (this.f11098g) {
            return;
        }
        a("onHandleRoutineRetryEvent");
        h();
    }

    private void g() {
        if (this.f11098g) {
            return;
        }
        a("onHandleRoutineUploadEvent");
        h();
    }

    private void h() {
        com.bytedance.sdk.component.utils.l.c("ReportEvent", "execute doRoutineUpload ... start ");
        this.f11100i.removeMessages(3);
        this.f11100i.removeMessages(2);
        this.f11100i.removeMessages(6);
        com.bytedance.sdk.component.utils.l.c("ReportEvent", "execute doRoutineUpload ... ListUtils.isEmpty(mCacheList) :" + com.bytedance.sdk.component.utils.j.a(this.f11096e));
        if (com.bytedance.sdk.component.utils.j.a(this.f11096e)) {
            this.f11097f = System.currentTimeMillis();
            k();
        } else if (!this.f11101j.a()) {
            com.bytedance.sdk.component.utils.l.c("ReportEvent", "execute doRoutineUpload ...no network, wait retry ");
            j();
        } else if (a()) {
            Iterator<Map.Entry<String, List<T>>> it = f(this.f11096e).entrySet().iterator();
            while (it.hasNext() && b(it.next().getValue(), !it.hasNext())) {
            }
        } else {
            b(this.f11096e, true);
        }
    }

    private void i() {
        a(4, m());
    }

    private void j() {
        a(3, this.f11102k.f11106c);
    }

    private void k() {
        a(2, this.f11102k.f11105b);
    }

    private void l() {
        this.f11098g = true;
        this.f11094c.a(true);
        this.f11096e.clear();
        this.f11100i.removeMessages(3);
        this.f11100i.removeMessages(2);
        i();
    }

    private long m() {
        return ((this.f11099h % 3) + 1) * this.f11102k.f11109f;
    }

    private boolean n() {
        return !this.f11098g && (this.f11096e.size() >= this.f11102k.f11104a || System.currentTimeMillis() - this.f11097f >= this.f11102k.f11105b);
    }

    private void o() {
        this.f11098g = false;
        this.f11094c.a(false);
        this.f11099h = 0;
        this.f11094c.a(0);
        this.f11100i.removeMessages(4);
    }

    protected boolean a() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                a((h<T>) ((k) message.obj));
                return true;
            case 2:
                g();
                return true;
            case 3:
                f();
                return true;
            case 4:
                e();
                return true;
            case 5:
                c();
                return true;
            case 6:
                d();
                return true;
            default:
                return true;
        }
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        this.f11097f = System.currentTimeMillis();
        this.f11100i = new Handler(getLooper(), this);
        com.bytedance.sdk.openadsdk.core.k.c().postDelayed(new a(this.f11100i), f11093l);
    }

    public h(String str, String str2, f<T> fVar, com.bytedance.sdk.openadsdk.core.n<T> nVar, c cVar, b bVar) {
        super(str);
        f11091a = str2;
        this.f11102k = cVar;
        this.f11101j = bVar;
        this.f11094c = fVar;
        this.f11095d = nVar;
        this.f11096e = Collections.synchronizedList(new LinkedList());
    }

    private void b(List<T> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    HashSet hashSet = new HashSet();
                    for (T t10 : this.f11096e) {
                        hashSet.add(t10.d());
                    }
                    for (T t11 : list) {
                        if (!hashSet.contains(t11.d())) {
                            this.f11096e.add(t11);
                        }
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        a("reloadCacheList adEventList is empty======");
    }

    private HashMap<String, List<T>> f(List<T> list) {
        com.bytedance.sdk.openadsdk.b.a aVar;
        JSONObject b10;
        HashMap<String, List<T>> hashMap = new HashMap<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if ((list.get(i10) instanceof com.bytedance.sdk.openadsdk.b.a) && (b10 = (aVar = (com.bytedance.sdk.openadsdk.b.a) list.get(i10)).b()) != null) {
                String optString = b10.optString("app_log_url");
                List<T> list2 = hashMap.get(optString);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    hashMap.put(optString, list2);
                }
                list2.add(aVar);
            }
        }
        return hashMap;
    }

    private boolean b(List<T> list, boolean z10) {
        i a10 = a(list);
        if (a10 != null) {
            if (a10.f11110a) {
                com.bytedance.sdk.component.utils.l.c("ReportEvent", "doRoutineUpload success");
                e(list);
                a(z10);
                return true;
            } else if (a(a10)) {
                l();
                return false;
            } else if (!b(a10) && !a(list, a10)) {
                if (this.f11098g) {
                    return false;
                }
                j();
                return false;
            } else {
                e(list);
                a(true);
                return false;
            }
        }
        return false;
    }

    private boolean c(List<T> list) {
        JSONObject b10;
        if (list == null || list.size() == 0 || !(list.get(0) instanceof com.bytedance.sdk.openadsdk.b.a) || (b10 = ((com.bytedance.sdk.openadsdk.b.a) list.get(0)).b()) == null) {
            return true;
        }
        return TextUtils.isEmpty(b10.optString("app_log_url"));
    }

    private void d(List<T> list) {
        if (list == null) {
            return;
        }
        if (list.size() <= 45) {
            a("start and return, checkAndDeleteEvent local size:" + list.size() + "less than:45");
            return;
        }
        int size = list.size() - 30;
        a("start checkAndDeleteEvent local size,deleteCnt:" + list.size() + "," + size);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10));
        }
        list.removeAll(arrayList);
        a("end checkAndDeleteEvent local size:" + list.size());
    }

    private void e(List<T> list) {
        this.f11094c.a(list);
        this.f11096e.removeAll(list);
    }

    public i a(List<T> list) {
        if (this.f11095d == null) {
            com.bytedance.sdk.openadsdk.core.m.f();
        }
        com.bytedance.sdk.openadsdk.core.n<T> nVar = this.f11095d;
        if (nVar == null) {
            return null;
        }
        return nVar.a(list);
    }

    private void a(T t10) {
        com.bytedance.sdk.component.utils.l.b("ReportEvent", "execute onHandleReceivedAdEvent()  start...");
        this.f11094c.a((f<T>) t10);
        if (this.f11098g) {
            return;
        }
        a("onHandleReceivedAdEvent");
        this.f11096e.add(t10);
        d(this.f11096e);
        com.bytedance.sdk.component.utils.l.b("ReportEvent", "execute onHandleReceivedAdEvent() ... mIsServerBusy =" + this.f11098g);
        if (n()) {
            com.bytedance.sdk.component.utils.l.b("ReportEvent", "execute onHandleReceivedAdEvent()  needUploadRoutine ... upload ");
            h();
        }
    }

    private static boolean b(i iVar) {
        return iVar.f11113d;
    }

    private void a(boolean z10) {
        this.f11097f = System.currentTimeMillis();
        o();
        if (z10) {
            k();
        }
    }

    private void a(int i10, long j10) {
        Message obtainMessage = this.f11100i.obtainMessage();
        obtainMessage.what = i10;
        this.f11100i.sendMessageDelayed(obtainMessage, j10);
    }

    private static boolean a(i iVar) {
        return iVar.f11111b == 509;
    }

    private boolean a(List<T> list, i iVar) {
        int i10;
        return !c(list) && (i10 = iVar.f11111b) >= 400 && i10 < 500;
    }

    private void a(String str) {
        com.bytedance.sdk.component.utils.l.c(f11091a, str);
    }
}
