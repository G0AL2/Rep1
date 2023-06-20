package yb;

import ac.a0;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Integer> f39471e;

    /* renamed from: f  reason: collision with root package name */
    static final String f39472f;

    /* renamed from: a  reason: collision with root package name */
    private final Context f39473a;

    /* renamed from: b  reason: collision with root package name */
    private final v f39474b;

    /* renamed from: c  reason: collision with root package name */
    private final a f39475c;

    /* renamed from: d  reason: collision with root package name */
    private final ic.d f39476d;

    static {
        HashMap hashMap = new HashMap();
        f39471e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f39472f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.9");
    }

    public n(Context context, v vVar, a aVar, ic.d dVar) {
        this.f39473a = context;
        this.f39474b = vVar;
        this.f39475c = aVar;
        this.f39476d = dVar;
    }

    private a0.b a() {
        return ac.a0.b().h("18.2.9").d(this.f39475c.f39360a).e(this.f39474b.a()).b(this.f39475c.f39364e).c(this.f39475c.f39365f).g(4);
    }

    private static int e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f39471e.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private a0.e.d.a.b.AbstractC0012a f() {
        return a0.e.d.a.b.AbstractC0012a.a().b(0L).d(0L).c(this.f39475c.f39363d).e(this.f39475c.f39361b).a();
    }

    private ac.b0<a0.e.d.a.b.AbstractC0012a> g() {
        return ac.b0.b(f());
    }

    private a0.e.d.a h(int i10, a0.a aVar) {
        return a0.e.d.a.a().b(Boolean.valueOf(aVar.b() != 100)).f(i10).d(m(aVar)).a();
    }

    private a0.e.d.a i(int i10, ic.e eVar, Thread thread, int i11, int i12, boolean z10) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j10 = g.j(this.f39475c.f39363d, this.f39473a);
        if (j10 != null) {
            bool = Boolean.valueOf(j10.importance != 100);
        } else {
            bool = null;
        }
        return a0.e.d.a.a().b(bool).f(i10).d(n(eVar, thread, i11, i12, z10)).a();
    }

    private a0.e.d.c j(int i10) {
        d a10 = d.a(this.f39473a);
        Float b10 = a10.b();
        Double valueOf = b10 != null ? Double.valueOf(b10.doubleValue()) : null;
        int c10 = a10.c();
        boolean o10 = g.o(this.f39473a);
        return a0.e.d.c.a().b(valueOf).c(c10).f(o10).e(i10).g(g.s() - g.a(this.f39473a)).d(g.b(Environment.getDataDirectory().getPath())).a();
    }

    private a0.e.d.a.b.c k(ic.e eVar, int i10, int i11) {
        return l(eVar, i10, i11, 0);
    }

    private a0.e.d.a.b.c l(ic.e eVar, int i10, int i11, int i12) {
        String str = eVar.f31927b;
        String str2 = eVar.f31926a;
        StackTraceElement[] stackTraceElementArr = eVar.f31928c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ic.e eVar2 = eVar.f31929d;
        if (i12 >= i11) {
            ic.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f31929d;
                i13++;
            }
        }
        a0.e.d.a.b.c.AbstractC0015a d10 = a0.e.d.a.b.c.a().f(str).e(str2).c(ac.b0.a(p(stackTraceElementArr, i10))).d(i13);
        if (eVar2 != null && i13 == 0) {
            d10.b(l(eVar2, i10, i11, i12 + 1));
        }
        return d10.a();
    }

    private a0.e.d.a.b m(a0.a aVar) {
        return a0.e.d.a.b.a().b(aVar).e(u()).c(g()).a();
    }

    private a0.e.d.a.b n(ic.e eVar, Thread thread, int i10, int i11, boolean z10) {
        return a0.e.d.a.b.a().f(x(eVar, thread, i10, z10)).d(k(eVar, i10, i11)).e(u()).c(g()).a();
    }

    private a0.e.d.a.b.AbstractC0018e.AbstractC0020b o(StackTraceElement stackTraceElement, a0.e.d.a.b.AbstractC0018e.AbstractC0020b.AbstractC0021a abstractC0021a) {
        long j10 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j10 = stackTraceElement.getLineNumber();
        }
        return abstractC0021a.e(max).f(str).b(fileName).d(j10).a();
    }

    private ac.b0<a0.e.d.a.b.AbstractC0018e.AbstractC0020b> p(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(o(stackTraceElement, a0.e.d.a.b.AbstractC0018e.AbstractC0020b.a().c(i10)));
        }
        return ac.b0.a(arrayList);
    }

    private a0.e.a q() {
        return a0.e.a.a().e(this.f39474b.f()).g(this.f39475c.f39364e).d(this.f39475c.f39365f).f(this.f39474b.a()).b(this.f39475c.f39366g.d()).c(this.f39475c.f39366g.e()).a();
    }

    private a0.e r(String str, long j10) {
        return a0.e.a().l(j10).i(str).g(f39472f).b(q()).k(t()).d(s()).h(3).a();
    }

    private a0.e.c s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e10 = e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s10 = g.s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean x10 = g.x(this.f39473a);
        int m10 = g.m(this.f39473a);
        String str = Build.MANUFACTURER;
        return a0.e.c.a().b(e10).f(Build.MODEL).c(availableProcessors).h(s10).d(blockCount).i(x10).j(m10).e(str).g(Build.PRODUCT).a();
    }

    private a0.e.AbstractC0023e t() {
        return a0.e.AbstractC0023e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(g.y(this.f39473a)).a();
    }

    private a0.e.d.a.b.AbstractC0016d u() {
        return a0.e.d.a.b.AbstractC0016d.a().d("0").c("0").b(0L).a();
    }

    private a0.e.d.a.b.AbstractC0018e v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return w(thread, stackTraceElementArr, 0);
    }

    private a0.e.d.a.b.AbstractC0018e w(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        return a0.e.d.a.b.AbstractC0018e.a().d(thread.getName()).c(i10).b(ac.b0.a(p(stackTraceElementArr, i10))).a();
    }

    private ac.b0<a0.e.d.a.b.AbstractC0018e> x(ic.e eVar, Thread thread, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(w(thread, eVar.f31928c, i10));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(v(key, this.f39476d.a(entry.getValue())));
                }
            }
        }
        return ac.b0.a(arrayList);
    }

    public a0.e.d b(a0.a aVar) {
        int i10 = this.f39473a.getResources().getConfiguration().orientation;
        return a0.e.d.a().f("anr").e(aVar.h()).b(h(i10, aVar)).c(j(i10)).a();
    }

    public a0.e.d c(Throwable th, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        int i12 = this.f39473a.getResources().getConfiguration().orientation;
        return a0.e.d.a().f(str).e(j10).b(i(i12, new ic.e(th, this.f39476d), thread, i10, i11, z10)).c(j(i12)).a();
    }

    public ac.a0 d(String str, long j10) {
        return a().i(r(str, j10)).a();
    }
}
