package com.apm.insight.runtime.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.runtime.a.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f6593a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6594b;

    /* renamed from: c  reason: collision with root package name */
    private Map<CrashType, c> f6595c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private b f6596d;

    /* renamed from: e  reason: collision with root package name */
    private d f6597e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apm.insight.runtime.a.f$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6598a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6598a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6598a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6598a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6598a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6598a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6598a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6598a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6598a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(Context context) {
        this.f6594b = context;
        try {
            this.f6596d = b.d();
            this.f6597e = new d(this.f6594b);
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
        }
    }

    private c a(CrashType crashType) {
        c cVar = this.f6595c.get(crashType);
        if (cVar != null) {
            return cVar;
        }
        switch (AnonymousClass1.f6598a[crashType.ordinal()]) {
            case 1:
                cVar = new j(this.f6594b, this.f6596d, this.f6597e);
                break;
            case 2:
                cVar = new k(this.f6594b, this.f6596d, this.f6597e);
                break;
            case 3:
                cVar = new l(this.f6594b, this.f6596d, this.f6597e);
                break;
            case 4:
                cVar = new a(this.f6594b, this.f6596d, this.f6597e);
                break;
            case 5:
                cVar = new h(this.f6594b, this.f6596d, this.f6597e);
                break;
            case 6:
                cVar = new g(this.f6594b, this.f6596d, this.f6597e);
                break;
            case 7:
                cVar = new e(this.f6594b, this.f6596d, this.f6597e);
                break;
            case 8:
                cVar = new i(this.f6594b, this.f6596d, this.f6597e);
                break;
        }
        if (cVar != null) {
            this.f6595c.put(crashType, cVar);
        }
        return cVar;
    }

    public static f a() {
        if (f6593a == null) {
            Context g10 = com.apm.insight.h.g();
            if (g10 == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f6593a = new f(g10);
        }
        return f6593a;
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar) {
        c a10;
        return (crashType == null || (a10 = a(crashType)) == null) ? aVar : a10.a(aVar, null, false);
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar, c.a aVar2, boolean z10) {
        c a10;
        return (crashType == null || (a10 = a(crashType)) == null) ? aVar : a10.a(aVar, aVar2, z10);
    }

    public com.apm.insight.entity.a a(List<com.apm.insight.entity.a> list, JSONArray jSONArray) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        JSONArray jSONArray2 = new JSONArray();
        for (com.apm.insight.entity.a aVar2 : list) {
            jSONArray2.put(aVar2.h());
        }
        aVar.a("data", (Object) jSONArray2);
        aVar.a("all_data", (Object) jSONArray);
        Header a10 = Header.a(this.f6594b);
        Header.a(a10);
        a10.c();
        a10.d();
        a10.e();
        Header.b(a10);
        aVar.a(a10);
        return aVar;
    }
}
