package com.fyber.inneractive.sdk.metrics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f17358a;

    public a(String str) {
        this.f17358a = str;
    }

    public static boolean a(int i10, int i11, JSONArray jSONArray, List<Long> list) {
        if (i10 <= 0 || i11 <= 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(i10);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= jSONArray.length()) {
                break;
            }
            long optLong = jSONArray.optLong(i12, 0L);
            if (optLong > currentTimeMillis) {
                i13++;
                list.add(Long.valueOf(optLong));
            }
            i12++;
        }
        return i13 >= i11;
    }
}
