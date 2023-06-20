package com.bytedance.sdk.openadsdk.k;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TrackAdUrlUtils.java */
/* loaded from: classes.dex */
public class e {
    private static int a(int i10) {
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    i11 = 5;
                    if (i10 != 5 && i10 != 15) {
                        return -1;
                    }
                }
            }
        }
        return i11;
    }

    public static List<String> a(List<String> list, boolean z10) {
        String a10 = j.a(m.a());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(a10)) {
                next = next.replace("{UID}", a10).replace("__UID__", a10);
            }
            if (z10) {
                next = a(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public static List<String> a(List<String> list, boolean z10, n nVar) {
        String a10 = j.a(m.a());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(a10)) {
                next = next.replace("{UID}", a10).replace("__UID__", a10);
            }
            if (next.contains("__CID__") && nVar != null && !TextUtils.isEmpty(nVar.Y())) {
                next = next.replace("__CID__", nVar.Y());
            }
            if (next.contains("__CTYPE__") && nVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(a(nVar.ad())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", s3.a.a().c());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(u.b()));
            }
            if (z10) {
                next = a(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
