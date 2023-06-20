package com.inmobi.media;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.fw;
import com.inmobi.media.fy;
import com.inmobi.media.gd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ConfigComponent.java */
/* loaded from: classes3.dex */
public class fs {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25482a = false;

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f25483b = null;

    /* renamed from: c  reason: collision with root package name */
    public static CopyOnWriteArrayList<fr> f25484c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f25485d = "fs";

    /* renamed from: e  reason: collision with root package name */
    private static Map<fr, ArrayList<WeakReference<c>>> f25486e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static a f25487f;

    /* compiled from: ConfigComponent.java */
    /* loaded from: classes3.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final String f25492a;

        /* renamed from: b  reason: collision with root package name */
        final String f25493b;

        b(String str, String str2) {
            this.f25492a = str;
            this.f25493b = str2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f25492a.equals(bVar.f25492a) && this.f25493b.equals(bVar.f25493b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f25492a.hashCode() + this.f25493b.hashCode();
        }
    }

    /* compiled from: ConfigComponent.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(fr frVar);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ConfigBootstrapHandler");
        handlerThread.start();
        f25487f = new a(handlerThread.getLooper());
        f25483b = new AtomicBoolean(false);
        f25484c = new CopyOnWriteArrayList<>();
    }

    public static void a() {
        if (f25483b.getAndSet(true)) {
            return;
        }
        new ft();
        f25484c.addAll(ft.a());
        a("root", ho.f(), null);
    }

    public static void b() {
        if (f25483b.getAndSet(false)) {
            f25484c.clear();
            f25487f.sendEmptyMessage(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigComponent.java */
    /* loaded from: classes3.dex */
    public static final class a extends Handler implements fw.a {

        /* renamed from: a  reason: collision with root package name */
        private List<fr> f25488a;

        /* renamed from: b  reason: collision with root package name */
        private Map<b, Map<String, fr>> f25489b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, fr> f25490c;

        /* renamed from: d  reason: collision with root package name */
        private ExecutorService f25491d;

        a(Looper looper) {
            super(looper);
            this.f25488a = new ArrayList();
            this.f25489b = new HashMap();
            this.f25490c = new HashMap();
        }

        @Override // com.inmobi.media.fw.a
        public final void a(fy.a aVar) {
            Message obtain = Message.obtain();
            obtain.what = 6;
            obtain.obj = aVar;
            sendMessage(obtain);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            fx fxVar = null;
            int i10 = 0;
            int i11 = 1;
            switch (message.what) {
                case 0:
                    fv fvVar = (fv) message.obj;
                    fr frVar = fvVar.f25498a;
                    if (!fs.f25483b.get()) {
                        String unused = fs.f25485d;
                        frVar.b();
                        return;
                    }
                    fs.a(frVar, fvVar.f25499b);
                    if (frVar.g() == null) {
                        String unused2 = fs.f25485d;
                        frVar.b();
                        return;
                    }
                    fs.a(frVar.b(), frVar.g());
                    return;
                case 1:
                    fr frVar2 = (fr) message.obj;
                    if (frVar2.g() == null) {
                        String unused3 = fs.f25485d;
                        frVar2.b();
                        return;
                    }
                    String b10 = frVar2.b();
                    String g10 = frVar2.g();
                    new ft();
                    b bVar = new b(((gd) ft.a("root", g10)).b(b10), g10);
                    if (this.f25489b.get(bVar) != null && this.f25489b.get(bVar).containsKey(b10)) {
                        i10 = 1;
                    }
                    Map<String, fr> map = this.f25490c;
                    if (map == null || !map.containsKey(b10)) {
                        i11 = i10;
                    }
                    String unused4 = fs.f25485d;
                    frVar2.b();
                    if (i11 != 0) {
                        String unused5 = fs.f25485d;
                        frVar2.b();
                        return;
                    }
                    this.f25488a.add(frVar2);
                    if (hasMessages(2)) {
                        return;
                    }
                    Message obtain = Message.obtain();
                    obtain.what = 2;
                    obtain.obj = frVar2.g();
                    sendMessage(obtain);
                    return;
                case 2:
                    new ft();
                    sendEmptyMessageDelayed(3, ((gd) ft.a("root", (String) message.obj)).waitTime * 1000);
                    return;
                case 3:
                    List<fr> list = this.f25488a;
                    while (i10 < list.size()) {
                        fr frVar3 = list.get(i10);
                        if (frVar3.g() != null) {
                            new ft();
                            b bVar2 = new b(((gd) ft.a("root", frVar3.g())).b(frVar3.b()), frVar3.g());
                            HashMap hashMap = (HashMap) this.f25489b.get(bVar2);
                            if (hashMap == null) {
                                hashMap = new HashMap();
                                this.f25489b.put(bVar2, hashMap);
                            }
                            hashMap.put(frVar3.b(), frVar3);
                        }
                        i10++;
                    }
                    this.f25488a.clear();
                    ExecutorService executorService = this.f25491d;
                    if (executorService == null || executorService.isShutdown()) {
                        this.f25491d = Executors.newFixedThreadPool(1, new ht(fs.f25485d));
                        sendEmptyMessage(4);
                        return;
                    }
                    return;
                case 4:
                    if (this.f25489b.isEmpty()) {
                        String unused6 = fs.f25485d;
                        sendEmptyMessage(5);
                        return;
                    }
                    Map.Entry<b, Map<String, fr>> next = this.f25489b.entrySet().iterator().next();
                    this.f25490c = next.getValue();
                    this.f25489b.remove(next.getKey());
                    b key = next.getKey();
                    Map<String, fr> map2 = this.f25490c;
                    String str = next.getKey().f25493b;
                    new ft();
                    gd gdVar = (gd) ft.a("root", str);
                    int h10 = gdVar.h();
                    int e10 = gdVar.e();
                    ir irVar = new ir(gdVar.f());
                    boolean f10 = ie.f();
                    if (f10 || !map2.containsKey("root")) {
                        i11 = f10 ? 1 : 0;
                    } else {
                        map2 = fs.a(map2);
                    }
                    fx fxVar2 = new fx(map2, irVar, key.f25492a, e10, h10, i11, str);
                    if (map2.containsKey("root")) {
                        fxVar = new fx(fs.a(map2), irVar, gdVar.k(), e10, h10, true, i11, str);
                    }
                    try {
                        this.f25491d.execute(new fw(this, fxVar2, fxVar));
                        return;
                    } catch (OutOfMemoryError unused7) {
                        String unused8 = fs.f25485d;
                        return;
                    }
                case 5:
                    ExecutorService executorService2 = this.f25491d;
                    if (executorService2 == null || executorService2.isShutdown()) {
                        return;
                    }
                    this.f25490c = null;
                    this.f25489b.clear();
                    removeMessages(3);
                    this.f25491d.shutdownNow();
                    return;
                case 6:
                    fy.a aVar = (fy.a) message.obj;
                    new ft();
                    if (aVar.a()) {
                        String unused9 = fs.f25485d;
                        aVar.f25517b.b();
                        return;
                    } else if (aVar.f25516a == 304) {
                        String unused10 = fs.f25485d;
                        aVar.f25517b.b();
                        if (aVar.f25517b.g() != null) {
                            ft.a(aVar.f25517b.b(), aVar.f25517b.g(), System.currentTimeMillis());
                            return;
                        }
                        return;
                    } else {
                        ft.a(aVar.f25517b);
                        String unused11 = fs.f25485d;
                        aVar.f25517b.b();
                        String unused12 = fs.f25485d;
                        aVar.f25517b.c();
                        String unused13 = fs.f25485d;
                        aVar.f25517b.g();
                        fs.f25484c.remove(aVar.f25517b);
                        fs.f25484c.add(aVar.f25517b);
                        fs.a(aVar.f25517b);
                        return;
                    }
                default:
                    String unused14 = fs.f25485d;
                    return;
            }
        }

        @Override // com.inmobi.media.fw.a
        public final void a(String str) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            sendMessage(obtain);
        }
    }

    private static void b(fr frVar) {
        Message obtainMessage = f25487f.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = frVar;
        f25487f.sendMessage(obtainMessage);
    }

    public static fr a(String str, String str2, c cVar) {
        fr a10 = fr.a(str, str2);
        if (str2 == null) {
            return a10;
        }
        Message obtainMessage = f25487f.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = new fv(a10, cVar);
        f25487f.sendMessage(obtainMessage);
        if (!f25484c.isEmpty()) {
            Iterator<fr> it = f25484c.iterator();
            while (it.hasNext()) {
                fr next = it.next();
                if (next.equals(a10)) {
                    return next;
                }
            }
        }
        return a10;
    }

    private static boolean b(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        try {
            for (String str3 : split) {
                if (Integer.valueOf(str3).intValue() < 0) {
                    return false;
                }
            }
            for (String str4 : split2) {
                if (Integer.valueOf(str4).intValue() < 0) {
                    return false;
                }
            }
            int length = split.length < split2.length ? split.length : split2.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!split[i10].equals(split2[i10])) {
                    return Integer.valueOf(split[i10]).intValue() < Integer.valueOf(split2[i10]).intValue();
                }
            }
        } catch (NumberFormatException unused) {
        }
        return split.length < split2.length;
    }

    public static void a(String str) {
        new ft();
        gd.c cVar = ((gd) ft.a("root", str)).latestSdkInfo;
        String str2 = cVar.version;
        String str3 = cVar.url;
        if (str2.trim().length() == 0 || !b(hp.b(), str2.trim())) {
            return;
        }
        String str4 = f25485d;
        hu.a((byte) 2, str4, "A newer version (version " + str2 + ") of the InMobi SDK is available! You are currently on an older version (Version " + hp.b() + "). Please download the latest InMobi SDK from " + str3);
    }

    private static boolean a(long j10, long j11) {
        return System.currentTimeMillis() - j10 > j11 * 1000;
    }

    static /* synthetic */ void a(fr frVar, c cVar) {
        ArrayList<WeakReference<c>> arrayList = f25486e.get(frVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(cVar == null ? null : new WeakReference<>(cVar));
        f25486e.put(frVar, arrayList);
    }

    static /* synthetic */ void a(String str, String str2) {
        new ft();
        fr a10 = fr.a(str, str2);
        if (ft.b("root", str2)) {
            b(fr.a("root", str2));
            return;
        }
        gd gdVar = (gd) ft.a("root", str2);
        if (a(ft.c(gdVar.b(), str2), gdVar.a(gdVar.b()))) {
            b(fr.a("root", str2));
        }
        if ("root".equals(str)) {
            return;
        }
        if (ft.b(str, str2)) {
            b(a10);
        } else if (a(ft.c(str, str2), gdVar.a(str))) {
            b(a10);
        }
    }

    static /* synthetic */ void a(fr frVar) {
        c cVar;
        ArrayList<WeakReference<c>> arrayList = f25486e.get(frVar);
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) != null && (cVar = arrayList.get(i10).get()) != null) {
                    cVar.a(frVar);
                }
            }
        }
    }

    static /* synthetic */ Map a(Map map) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("root", (fr) map.get("root"));
        return hashMap;
    }
}
