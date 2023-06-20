package com.ironsource.mediationsdk.adunit.b;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class e extends f {
    public e(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.AUCTION_REQUEST);
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        a(b.AUCTION_SUCCESS, hashMap);
    }

    public final void a(long j10, int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
        }
        a(b.AUCTION_FAILED, hashMap);
    }

    public final void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        a(b.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    public final void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        a(b.AUCTION_RESULT_WATERFALL, hashMap);
    }

    public final void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("auctionId", str);
        a(b.AD_UNIT_CAPPED, hashMap);
    }
}
