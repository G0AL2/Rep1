package com.fyber.inneractive.sdk.mraid;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends a {
    public d(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        L l10;
        com.fyber.inneractive.sdk.web.d dVar = this.f17490c;
        Map<String, String> map = this.f17489b;
        Context g10 = dVar.g();
        boolean z10 = true;
        if (com.fyber.inneractive.sdk.util.k.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"))) {
            try {
                Map<String, Object> a10 = dVar.a(map);
                Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
                HashMap hashMap = (HashMap) a10;
                for (String str : hashMap.keySet()) {
                    Object obj = hashMap.get(str);
                    if (obj instanceof Long) {
                        type.putExtra(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        type.putExtra(str, ((Integer) obj).intValue());
                    } else {
                        type.putExtra(str, (String) obj);
                    }
                }
                type.setFlags(268435456);
                g10.startActivity(type);
            } catch (ActivityNotFoundException unused) {
                IAlog.a("There is no calendar app installed!", new Object[0]);
                dVar.a(f.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
            } catch (IllegalArgumentException e10) {
                IAlog.a("invalid parameters for create calendar ", e10.getMessage());
                dVar.a(f.CREATE_CALENDAR_EVENT, e10.getMessage());
            } catch (Exception unused2) {
                IAlog.a("Failed to create calendar event.", new Object[0]);
                dVar.a(f.CREATE_CALENDAR_EVENT, "could not create calendar event");
            }
            if (z10 || (l10 = dVar.f20370g) == 0) {
            }
            ((d.f) l10).b();
            return;
        }
        IAlog.a("createCalendarEvent supported for devices post-ICS", new Object[0]);
        dVar.a(f.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
        z10 = false;
        if (z10) {
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public String c() {
        return null;
    }
}
