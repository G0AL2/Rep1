package com.ironsource.environment.a;

import com.ironsource.mediationsdk.C1741o;
import java.util.ArrayList;
import org.json.JSONObject;
import qe.k;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f26125a = new ArrayList<>(new a().f26123a);

    /* renamed from: b  reason: collision with root package name */
    private final C1741o f26126b = new C1741o();

    public final JSONObject a() {
        JSONObject a10 = this.f26126b.a(this.f26125a);
        k.e(a10, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a11 = com.ironsource.environment.c.b.a(a10.optJSONObject("md"));
        if (a11 != null) {
            a10.put("md", a11);
        }
        return a10;
    }
}
