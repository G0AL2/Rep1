package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.v;
import com.apm.insight.l.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    protected CrashType f6584a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f6585b;

    /* renamed from: c  reason: collision with root package name */
    protected ICommonParams f6586c = com.apm.insight.h.a().c();

    /* renamed from: d  reason: collision with root package name */
    protected b f6587d;

    /* renamed from: e  reason: collision with root package name */
    protected d f6588e;

    /* loaded from: classes.dex */
    public interface a {
        com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar, boolean z10);

        void a(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(CrashType crashType, Context context, b bVar, d dVar) {
        this.f6584a = crashType;
        this.f6585b = context;
        this.f6587d = bVar;
        this.f6588e = dVar;
    }

    private void i(com.apm.insight.entity.a aVar) {
        List<AttachUserData> a10 = com.apm.insight.h.b().a(this.f6584a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = aVar.h().optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            aVar.a("custom", optJSONObject);
        }
        if (a10 != null) {
            for (int i10 = 0; i10 < a10.size(); i10++) {
                try {
                    AttachUserData attachUserData = a10.get(i10);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    com.apm.insight.entity.a.a(optJSONObject, attachUserData.getUserData(this.f6584a));
                    hashMap.put("custom_cost_" + attachUserData.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    com.apm.insight.entity.a.a(optJSONObject, th);
                }
            }
        }
        try {
            optJSONObject.put("fd_count", com.apm.insight.l.h.a());
        } catch (Throwable unused) {
        }
        List<AttachUserData> b10 = com.apm.insight.h.b().b(this.f6584a);
        if (b10 != null) {
            JSONObject optJSONObject2 = aVar.h().optJSONObject("custom_long");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
                aVar.a("custom_long", optJSONObject2);
            }
            for (int i11 = 0; i11 < b10.size(); i11++) {
                try {
                    AttachUserData attachUserData2 = b10.get(i11);
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    com.apm.insight.entity.a.a(optJSONObject2, attachUserData2.getUserData(this.f6584a));
                    hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                } catch (Throwable th2) {
                    com.apm.insight.entity.a.a(optJSONObject2, th2);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                optJSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Throwable unused2) {
            }
        }
    }

    public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i10 == 0) {
            b(aVar);
        } else if (i10 == 1) {
            c(aVar);
            i(aVar);
        } else if (i10 == 2) {
            e(aVar);
        } else if (i10 == 4) {
            f(aVar);
        } else if (i10 == 5) {
            d(aVar);
        }
        return aVar;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar, a aVar2, boolean z10) {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVar3 = aVar;
        for (int i10 = 0; i10 < b(); i10++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.a(i10, aVar3);
                } catch (Throwable th) {
                    aVar2.a(th);
                }
            }
            try {
                aVar3 = a(i10, aVar3);
            } catch (Throwable th2) {
                if (aVar2 != null) {
                    aVar2.a(th2);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z11 = true;
                    if (i10 != b() - 1) {
                        z11 = false;
                    }
                    aVar3 = aVar2.a(i10, aVar3, z11);
                } catch (Throwable th3) {
                    aVar2.a(th3);
                }
                if (z10) {
                    if (i10 != 0) {
                        aVar.c(aVar3.h());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new com.apm.insight.entity.a();
                }
            }
            aVar.b("step_cost_" + i10, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return a(aVar);
    }

    protected boolean a() {
        return false;
    }

    public int b() {
        return 6;
    }

    public com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) {
        aVar.a(com.apm.insight.h.p(), com.apm.insight.h.q());
        if (com.apm.insight.h.m()) {
            aVar.a("is_mp", (Object) 1);
        }
        try {
            aVar.a(this.f6586c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("代码中发生了错误导致数据获取失败:\n" + v.a(th), 0);
                aVar.a(hashMap);
            } catch (Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.h.o());
        aVar.a("process_name", com.apm.insight.l.a.c(com.apm.insight.h.g()));
        return aVar;
    }

    public com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) {
        b bVar;
        if (!com.apm.insight.l.a.b(com.apm.insight.h.g())) {
            aVar.a("remote_process", (Object) 1);
        }
        aVar.a("pid", Integer.valueOf(Process.myPid()));
        aVar.a(com.apm.insight.h.j());
        if (c() && (bVar = this.f6587d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.f6586c.getPatchInfo());
        } catch (Throwable th) {
            try {
                aVar.a(Arrays.asList("代码中发生了错误导致数据获取失败:\n" + v.a(th)));
            } catch (Throwable unused) {
            }
        }
        String k10 = com.apm.insight.h.k();
        if (k10 != null) {
            aVar.a("business", (Object) k10);
        }
        aVar.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a(this.f6585b)));
        return aVar;
    }

    protected boolean c() {
        return true;
    }

    public com.apm.insight.entity.a d(com.apm.insight.entity.a aVar) {
        if (d()) {
            aVar.b(w.a(this.f6585b));
        }
        return aVar;
    }

    protected boolean d() {
        return true;
    }

    public com.apm.insight.entity.a e(com.apm.insight.entity.a aVar) {
        d dVar = this.f6588e;
        aVar.a("battery", Integer.valueOf(dVar == null ? 0 : dVar.a()));
        aVar.c(com.apm.insight.h.b().a());
        return aVar;
    }

    public com.apm.insight.entity.a f(com.apm.insight.entity.a aVar) {
        if (a()) {
            h(aVar);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(com.apm.insight.entity.a aVar) {
    }

    protected void h(com.apm.insight.entity.a aVar) {
    }
}
