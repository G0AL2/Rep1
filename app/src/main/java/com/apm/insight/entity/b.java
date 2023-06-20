package com.apm.insight.entity;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.g;
import com.apm.insight.l.i;
import com.apm.insight.l.l;
import com.apm.insight.l.q;
import com.apm.insight.l.v;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentLinkedQueue<g> f6280a = new ConcurrentLinkedQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<Integer, g> f6281b = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    public static File a(File file) {
        return new File(file, "all_data.json");
    }

    public static JSONArray a() {
        g next;
        JSONArray jSONArray = new JSONArray();
        Iterator<g> it = f6280a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.c());
        }
        return jSONArray;
    }

    public static JSONArray a(Object obj) {
        JSONArray jSONArray = new JSONArray();
        Iterator<g> it = f6280a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g next = it.next();
            if (next != null && next.a(obj)) {
                jSONArray.put(next.a(CrashType.JAVA, (JSONArray) null));
                break;
            }
        }
        return jSONArray;
    }

    public static JSONArray a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr) {
        Iterator<g> it = f6280a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next != null && next.a(obj)) {
                JSONArray a10 = next.a(stackTraceElementArr, th);
                JSONArray jSONArray = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("aid", next.b());
                    jSONObject.put("lines", a10);
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
                return jSONArray;
            }
        }
        return null;
    }

    public static JSONArray a(String str) {
        g next;
        JSONArray jSONArray = new JSONArray();
        String[] split = str.split("\n");
        Iterator<g> it = f6280a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (com.apm.insight.runtime.a.b(next.b())) {
                JSONArray a10 = next.a(split);
                if (!l.a(a10)) {
                    jSONArray.put(next.a(CrashType.ANR, a10));
                }
            }
        }
        return jSONArray;
    }

    public static JSONArray a(String str, String str2, JSONArray jSONArray) {
        JSONObject optJSONObject;
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject2 = jSONArray.optJSONObject(i10);
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("header")) != null && com.apm.insight.runtime.a.c(String.valueOf(optJSONObject.opt("aid")))) {
                if (!TextUtils.isEmpty(optJSONObject.optString("package"))) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("so_list");
                    if (!l.a(optJSONArray)) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            if (!str.contains(optJSONArray.optString(i11))) {
                            }
                        }
                    }
                }
                jSONArray2.put(optJSONObject2);
                break;
            }
        }
        return jSONArray2;
    }

    public static JSONArray a(Throwable th, Thread thread, File file) {
        g next;
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] b10 = v.b(th);
        Iterator<g> it = f6280a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            if (com.apm.insight.runtime.a.a(next.b())) {
                JSONArray a10 = next.a(b10, th);
                if (!l.a(a10)) {
                    jSONArray.put(next.a(CrashType.JAVA, a10));
                }
            } else {
                q.a((Object) ("not enable javaCrash aid: " + next.b()));
            }
        }
        if (l.a(jSONArray)) {
            return null;
        }
        if (file != null) {
            try {
                i.a(new File(file, "all_data.json"), jSONArray, false);
            } catch (IOException unused) {
            }
        }
        return jSONArray;
    }

    public static void a(g gVar) {
        f6280a.add(gVar);
        if (gVar.d()) {
            f6281b.put(4444, gVar);
        }
    }

    public static void a(JSONObject jSONObject, JSONArray jSONArray, a aVar) {
        JSONObject optJSONObject;
        q.a((Object) ("uploadFromFile with allData " + jSONArray));
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length() && (optJSONObject = jSONArray.optJSONObject(i10)) != null; i10++) {
            if (l.a(optJSONObject, 0, "header", "single_upload") == 1) {
                JSONObject jSONObject2 = new JSONObject();
                com.apm.insight.entity.a.b(jSONObject2, jSONObject);
                com.apm.insight.entity.a.b(jSONObject2, optJSONObject);
                aVar.a(jSONObject2);
            } else {
                jSONArray2.put(optJSONObject);
            }
        }
        if (jSONArray2.length() == 0) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        com.apm.insight.entity.a.b(jSONObject3, jSONObject);
        try {
            jSONObject3.put("all_data", jSONArray2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        aVar.a(jSONObject3);
    }

    public static String b(Object obj) {
        Iterator<g> it = f6280a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next != null && next.a(obj)) {
                return next.b();
            }
        }
        return null;
    }

    public static JSONArray b() {
        g next;
        JSONArray jSONArray = new JSONArray();
        Iterator<g> it = f6280a.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            jSONArray.put(next.a((CrashType) null));
        }
        return jSONArray;
    }

    public static int c() {
        return f6280a.size();
    }
}
