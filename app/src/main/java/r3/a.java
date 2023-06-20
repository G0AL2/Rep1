package r3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.p;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidRGPDownLoader.java */
/* loaded from: classes.dex */
public class a extends b {
    public a(Context context, n nVar, String str) {
        super(context, nVar, str);
    }

    @Override // r3.b, r3.c
    public boolean a() {
        com.bytedance.sdk.openadsdk.core.e.c cVar;
        Intent a10;
        n nVar = this.f36168c;
        if ((nVar != null && nVar.as() == 0) || (cVar = this.f36167b) == null) {
            return false;
        }
        try {
            String c10 = cVar.c();
            if (TextUtils.isEmpty(c10) || (a10 = u.a(f(), c10)) == null) {
                return false;
            }
            a10.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(f() instanceof Activity)) {
                a10.addFlags(268435456);
            }
            f().startActivity(a10);
            e.d(f(), this.f36168c, this.f36169d, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // r3.b
    public boolean c() {
        if (this.f36168c.ab() != null) {
            try {
                String a10 = this.f36168c.ab().a();
                if (!TextUtils.isEmpty(a10)) {
                    Uri parse = Uri.parse(a10);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    if (!(f() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    e.d(m.a(), this.f36168c, this.f36169d, "open_url_app", (Map<String, Object>) null);
                    f().startActivity(intent);
                    p.a().a(this.f36168c, this.f36169d);
                    return true;
                }
            } catch (Throwable unused) {
            }
            if (!this.f36170e || this.f36171f.get()) {
                this.f36170e = true;
                e.d(f(), this.f36168c, this.f36169d, "open_fallback_url", (Map<String, Object>) null);
                return false;
            }
            return false;
        }
        return false;
    }
}
