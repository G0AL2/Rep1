package r3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.p;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.y;
import com.bytedance.sdk.openadsdk.utils.u;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: GPDownLoader.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f36166a;

    /* renamed from: b  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.e.c f36167b;

    /* renamed from: c  reason: collision with root package name */
    protected n f36168c;

    /* renamed from: d  reason: collision with root package name */
    protected String f36169d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f36170e = false;

    /* renamed from: f  reason: collision with root package name */
    protected final AtomicBoolean f36171f = new AtomicBoolean(false);

    public b(Context context, n nVar, String str) {
        this.f36166a = new WeakReference<>(context);
        this.f36168c = nVar;
        this.f36167b = nVar.aa();
        this.f36169d = str;
        l.c("GPDownLoader", "====tag===" + str);
        if (m.a() == null) {
            m.a(context);
        }
    }

    public static boolean d(Context context, String str) {
        Intent launchIntentForPackage;
        if (context != null && str != null && !TextUtils.isEmpty(str)) {
            l.c("GPDownLoader", "gotoGooglePlay :market://details?id=" + str);
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse("market://details?id=" + str);
            intent.setData(parse);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, Constants.MIN_PROGRESS_STEP)) {
                if (resolveInfo.activityInfo.packageName.equals("com.android.vending") && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending")) != null) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    launchIntentForPackage.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    launchIntentForPackage.setData(parse);
                    if (!(context instanceof Activity)) {
                        launchIntentForPackage.setFlags(268435456);
                    }
                    context.startActivity(launchIntentForPackage);
                    return true;
                }
            }
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    @Override // r3.c
    public void a(boolean z10) {
    }

    @Override // r3.c
    public boolean a() {
        Intent a10;
        if (this.f36167b == null) {
            return false;
        }
        n nVar = this.f36168c;
        if (nVar == null || nVar.as() != 0) {
            String c10 = this.f36167b.c();
            if (TextUtils.isEmpty(c10) || !u.b(f(), c10) || (a10 = u.a(f(), c10)) == null) {
                return false;
            }
            a10.putExtra("START_ONLY_FOR_ANDROID", true);
            try {
                f().startActivity(a10);
                e.d(f(), this.f36168c, this.f36169d, "click_open", (Map<String, Object>) null);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean b(Context context, String str) {
        return d(context, str);
    }

    public boolean c() {
        if (this.f36168c.ab() != null) {
            String a10 = this.f36168c.ab().a();
            if (!TextUtils.isEmpty(a10)) {
                Uri parse = Uri.parse(a10);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (u.a(f(), intent)) {
                    if (!(f() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        e.d(m.a(), this.f36168c, this.f36169d, "open_url_app", (Map<String, Object>) null);
                        f().startActivity(intent);
                        p.a().a(this.f36168c, this.f36169d);
                        return true;
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
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

    @Override // r3.c
    public boolean e() {
        this.f36171f.set(true);
        return this.f36167b != null && b(f(), this.f36167b.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context f() {
        WeakReference<Context> weakReference = this.f36166a;
        return (weakReference == null || weakReference.get() == null) ? m.a() : this.f36166a.get();
    }

    @Override // r3.c
    public void d() {
        if (f() == null) {
            return;
        }
        if (c()) {
            this.f36171f.set(true);
        } else if (a() || e() || this.f36168c.aa() != null || this.f36168c.O() == null) {
        } else {
            y.a(f(), this.f36168c.O(), this.f36168c, u.a(this.f36169d), this.f36169d, true);
        }
    }
}
