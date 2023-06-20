package com.apm.insight.k;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.l.r;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f6421a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f6422b;

    private d(Context context) {
        this.f6422b = context;
    }

    public static d a() {
        if (f6421a == null) {
            f6421a = new d(com.apm.insight.h.g());
        }
        return f6421a;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String f10 = e.f();
            File file = new File(o.a(this.f6422b), o.c());
            com.apm.insight.l.i.a(file, file.getName(), f10, jSONObject, e.b());
            if (e.a(f10, jSONObject.toString()).a()) {
                com.apm.insight.l.i.a(file);
            }
        } catch (Throwable th) {
            q.b(th);
        }
    }

    public void a(JSONObject jSONObject, long j10, boolean z10) {
        File[] fileArr;
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c10 = e.c();
                int i10 = 0;
                File file = new File(o.a(this.f6422b), com.apm.insight.h.a(j10, CrashType.ANR, false, false));
                com.apm.insight.l.i.a(file, file.getName(), c10, jSONObject, e.b());
                if (z10 && !Npth.isStopUpload()) {
                    jSONObject.put("upload_scene", "direct");
                    jSONObject.put("crash_uuid", file.getName());
                    r.a(jSONObject);
                    if (com.apm.insight.runtime.a.j()) {
                        HashMap<String, r.a> a10 = com.apm.insight.runtime.r.a(j10, "anr_trace");
                        fileArr = new File[a10.size() + 2];
                        for (Map.Entry<String, r.a> entry : a10.entrySet()) {
                            if (!entry.getKey().equals(com.apm.insight.l.a.c(this.f6422b))) {
                                fileArr[i10] = o.a(this.f6422b, entry.getValue().f6657b);
                                i10++;
                            }
                        }
                    } else {
                        fileArr = new File[2];
                    }
                    fileArr[fileArr.length - 1] = o.a(this.f6422b, com.apm.insight.h.f());
                    fileArr[fileArr.length - 2] = com.apm.insight.runtime.r.a(j10);
                    if (!e.a(c10, jSONObject.toString(), fileArr).a()) {
                        return;
                    }
                    com.apm.insight.l.i.a(file);
                    if (Npth.hasCrash()) {
                        return;
                    }
                    com.apm.insight.l.i.a(o.e(com.apm.insight.h.g()));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a(long j10, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c10 = e.c();
                File file = new File(o.a(this.f6422b), o.a(com.apm.insight.h.e()));
                com.apm.insight.l.i.a(file, file.getName(), c10, jSONObject, e.a());
                jSONObject.put("upload_scene", "direct");
                com.apm.insight.l.r.a(jSONObject);
                if (e.b(c10, jSONObject.toString()).a()) {
                    com.apm.insight.l.i.a(file);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                q.b(th);
            }
        }
        return false;
    }

    public boolean a(JSONObject jSONObject, File file, File file2) {
        try {
            String g10 = e.g();
            com.apm.insight.l.r.a(jSONObject);
            return e.a(g10, jSONObject.toString(), file, file2, com.apm.insight.runtime.r.a(System.currentTimeMillis()), new File(com.apm.insight.h.b.a())).a();
        } catch (Throwable th) {
            q.b(th);
            return false;
        }
    }

    public void b(final JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        p.b().a(new Runnable() { // from class: com.apm.insight.k.d.1
            @Override // java.lang.Runnable
            public void run() {
                String c10 = e.c();
                try {
                    jSONObject.put("upload_scene", "direct");
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                e.b(c10, jSONObject.toString());
            }
        });
    }
}
