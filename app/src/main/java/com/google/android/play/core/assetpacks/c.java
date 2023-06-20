package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class c {
    public static c a(long j10, Map<String, AssetPackState> map) {
        return new g0(j10, map);
    }

    public static c b(Bundle bundle, w0 w0Var) {
        return c(bundle, w0Var, new ArrayList());
    }

    public static c c(Bundle bundle, w0 w0Var, List<String> list) {
        return d(bundle, w0Var, list, z.f23109a);
    }

    private static c d(Bundle bundle, w0 w0Var, List<String> list, x xVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            hashMap.put(str, AssetPackState.a(bundle, str, w0Var, xVar));
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String str2 = list.get(i11);
            hashMap.put(str2, AssetPackState.b(str2, 4, 0, 0L, 0L, 0.0d));
        }
        return a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    public abstract Map<String, AssetPackState> e();

    public abstract long f();
}
