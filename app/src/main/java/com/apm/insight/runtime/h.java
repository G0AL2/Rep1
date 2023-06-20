package com.apm.insight.runtime;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private Context f6623a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Long> f6624b;

    /* renamed from: c  reason: collision with root package name */
    private int f6625c = 50;

    /* renamed from: d  reason: collision with root package name */
    private int f6626d = 100;

    public h(Context context) {
        this.f6624b = null;
        this.f6623a = context;
        this.f6624b = c();
        b();
    }

    private void a(File file) {
        File g10 = com.apm.insight.l.o.g(this.f6623a);
        file.renameTo(new File(g10, String.valueOf(System.currentTimeMillis())));
        String[] list = g10.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g10, list[0]).delete();
        }
    }

    private void b() {
        this.f6625c = a.a(this.f6625c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f6626d = a.a(this.f6626d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> c() {
        JSONArray b10;
        File h10 = com.apm.insight.l.o.h(this.f6623a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            b10 = com.apm.insight.l.i.b(h10.getAbsolutePath());
        } catch (IOException unused) {
        } catch (Throwable th) {
            com.apm.insight.b.a().a("NPTH_CATCH", th);
        }
        if (com.apm.insight.l.l.a(b10)) {
            return hashMap;
        }
        Long decode = Long.decode(b10.optString(0, null));
        if (System.currentTimeMillis() - decode.longValue() > 86400000) {
            a(h10);
            return hashMap;
        }
        hashMap.put("time", decode);
        for (int i10 = 1; i10 < b10.length(); i10++) {
            String[] split = b10.optString(i10, "").split(" ");
            if (split.length == 2) {
                hashMap.put(split[0], Long.decode(split[1]));
            }
        }
        return hashMap;
    }

    public void a() {
        HashMap<String, Long> hashMap = this.f6624b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            com.apm.insight.b.a().a("NPTH_CATCH", new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(remove);
        sb2.append('\n');
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(' ');
            sb2.append(entry.getValue());
            sb2.append('\n');
        }
        try {
            com.apm.insight.l.i.a(com.apm.insight.l.o.h(this.f6623a), sb2.toString(), false);
        } catch (IOException unused) {
        }
    }

    public boolean a(String str) {
        if (str == null) {
            str = "default";
        }
        return com.apm.insight.l.r.a(this.f6624b, str, 1L).longValue() < ((long) this.f6625c) && com.apm.insight.l.r.a(this.f6624b, "all", 1L).longValue() < ((long) this.f6626d);
    }
}
