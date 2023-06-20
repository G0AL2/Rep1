package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.l.o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f6514a;

    public a(File file) {
        String a10;
        File c10 = o.c(file);
        if (!c10.exists() || c10.length() == 0 || (a10 = NativeImpl.a(c10.getAbsolutePath())) == null) {
            return;
        }
        String[] split = a10.split("\n");
        this.f6514a = new HashMap();
        for (String str : split) {
            String[] split2 = str.split("=");
            if (split2.length == 2) {
                this.f6514a.put(split2[0], split2[1]);
            }
        }
    }

    public boolean a() {
        Map<String, String> map = this.f6514a;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f6514a.get("process_name")) || TextUtils.isEmpty(this.f6514a.get("crash_thread_name")) || TextUtils.isEmpty(this.f6514a.get("pid")) || TextUtils.isEmpty(this.f6514a.get("tid")) || TextUtils.isEmpty(this.f6514a.get("start_time")) || TextUtils.isEmpty(this.f6514a.get("crash_time")) || TextUtils.isEmpty(this.f6514a.get("signal_line"))) ? false : true;
    }

    public String b() {
        return this.f6514a.get("signal_line");
    }

    public Map<String, String> c() {
        return this.f6514a;
    }
}
