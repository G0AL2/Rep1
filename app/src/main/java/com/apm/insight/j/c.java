package com.apm.insight.j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.h;
import com.apm.insight.l.q;

/* loaded from: classes.dex */
public class c extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Handler handler, long j10, long j11) {
        super(handler, j10, j11);
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (h.c().b()) {
            return;
        }
        String d10 = h.a().d();
        if (TextUtils.isEmpty(d10) || "0".equals(d10)) {
            a(c());
            str = "[DeviceIdTask] did is null, continue check.";
        } else {
            h.c().a(d10);
            str = "[DeviceIdTask] did is " + d10;
        }
        q.a((Object) str);
    }
}
