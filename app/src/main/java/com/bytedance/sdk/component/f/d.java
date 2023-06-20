package com.bytedance.sdk.component.f;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PoolTaskStatistics.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    private static AtomicInteger f10422c = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f10420a = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f10421b = {"tt_pangle", "bd_tracker"};

    /* renamed from: d  reason: collision with root package name */
    private static int f10423d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static int f10424e = 0;

    /* compiled from: PoolTaskStatistics.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10425a;

        /* renamed from: b  reason: collision with root package name */
        public String f10426b;

        /* renamed from: c  reason: collision with root package name */
        public String f10427c;

        /* renamed from: d  reason: collision with root package name */
        public String f10428d;

        public a(String str, int i10, String str2, String str3) {
            this.f10425a = 0;
            this.f10426b = null;
            this.f10427c = null;
            this.f10428d = null;
            this.f10427c = str;
            this.f10425a = i10;
            this.f10428d = str2;
            this.f10426b = str3;
        }

        public void a(int i10) {
            this.f10425a = i10;
        }

        public String toString() {
            return "ThreadModel{times=" + this.f10425a + ", name='" + this.f10426b + "', lastStackStack='" + this.f10427c + "'}";
        }

        public int a() {
            return this.f10425a;
        }
    }

    public static void a() {
        String str;
        c g10 = e.g();
        if (g10 == null) {
            return;
        }
        int i10 = 1;
        int addAndGet = f10422c.addAndGet(1);
        int i11 = e.f10431c;
        if (i11 < 0 || addAndGet % i11 != 0 || Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        HashMap hashMap = new HashMap();
        if (allStackTraces == null) {
            return;
        }
        boolean a10 = l.a();
        int size = allStackTraces.size();
        if (size > f10424e) {
            f10424e = size;
        }
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            i13 += i10;
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            StringBuilder sb2 = new StringBuilder("\n");
            if (a10) {
                sb2.append("Thread Name is : " + key.getName());
                sb2.append("\n");
            }
            String str2 = null;
            int length = value.length;
            int i14 = 0;
            while (i14 < length) {
                String stackTraceElement = value[i14].toString();
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                if (a10) {
                    sb2.append(stackTraceElement + "\n");
                }
                if (TextUtils.isEmpty(str2)) {
                    if (a(stackTraceElement, f10420a)) {
                        str = stackTraceElement;
                    } else {
                        str = stackTraceElement;
                        if (!a(key.getName(), f10421b)) {
                        }
                    }
                    i12++;
                    str2 = str;
                }
                i14++;
                it = it2;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
            if (a10) {
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = str2 + "&" + key.getName();
                    a aVar = (a) hashMap.get(str3);
                    if (aVar != null) {
                        aVar.a(aVar.a() + 1);
                    } else {
                        aVar = new a(str3, 1, sb2.toString(), key.getName());
                    }
                    hashMap.put(str3, aVar);
                }
                if (!TextUtils.isEmpty(sb2.toString())) {
                    Log.e("PoolTaskStatistics", "Thread index = " + i13 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                    Log.w("PoolTaskStatistics", sb2.toString());
                }
            }
            it = it3;
            i10 = 1;
        }
        if (i12 > f10423d) {
            f10423d = i12;
        }
        if (a10) {
            Log.e("PoolTaskStatistics", "SDK current threads=" + i12 + ", SDK Max threads=" + f10423d + ", Application threads = " + size + ", Application max threads = " + f10424e);
            for (Map.Entry entry : hashMap.entrySet()) {
                Log.i("PoolTaskStatistics", ((a) entry.getValue()).toString());
            }
        }
        g10.a(new com.bytedance.sdk.component.f.a.a(i12, f10423d, size, f10424e));
    }

    private static boolean a(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
