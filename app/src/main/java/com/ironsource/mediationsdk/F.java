package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    private static a f26260a = new a((byte) 0);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        private static JSONObject b(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        public final C1743q a(Context context) {
            qe.k.f(context, "context");
            JSONObject b10 = b(context);
            String optString = b10.optString("appKey");
            String optString2 = b10.optString(DataKeys.USER_ID);
            String optString3 = b10.optString("response");
            qe.k.e(optString, "cachedAppKey");
            qe.k.e(optString2, "cachedUserId");
            qe.k.e(optString3, "cachedSettings");
            return new C1743q(optString, optString2, optString3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        if ((r0.f27318c.length() > 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.ironsource.mediationsdk.utils.l a(android.content.Context r4) {
        /*
            com.ironsource.mediationsdk.F$a r0 = com.ironsource.mediationsdk.F.f26260a
            java.lang.String r1 = "context"
            qe.k.f(r4, r1)
            com.ironsource.mediationsdk.q r0 = r0.a(r4)
            java.lang.String r1 = r0.f27316a
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto L35
            java.lang.String r1 = r0.f27317b
            int r1 = r1.length()
            if (r1 <= 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L35
            java.lang.String r1 = r0.f27318c
            int r1 = r1.length()
            if (r1 <= 0) goto L31
            r1 = 1
            goto L32
        L31:
            r1 = 0
        L32:
            if (r1 == 0) goto L35
            goto L36
        L35:
            r2 = 0
        L36:
            r1 = 0
            if (r2 == 0) goto L3a
            goto L3b
        L3a:
            r0 = r1
        L3b:
            if (r0 == 0) goto L4d
            com.ironsource.mediationsdk.utils.l r1 = new com.ironsource.mediationsdk.utils.l
            java.lang.String r2 = r0.f27316a
            java.lang.String r3 = r0.f27317b
            java.lang.String r0 = r0.f27318c
            r1.<init>(r4, r2, r3, r0)
            int r4 = com.ironsource.mediationsdk.utils.l.a.f27519b
            r1.a(r4)
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.F.a(android.content.Context):com.ironsource.mediationsdk.utils.l");
    }

    public static final boolean b(Context context) {
        a aVar = f26260a;
        qe.k.f(context, "context");
        C1743q a10 = aVar.a(context);
        if (a10.f27316a.length() > 0) {
            if (a10.f27317b.length() > 0) {
                if (a10.f27318c.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
