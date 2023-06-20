package u1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import cl.json.RNShareModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.internal.ImagesContract;

/* compiled from: SingleShareIntent.java */
/* loaded from: classes.dex */
public abstract class n extends m {
    public n(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        String j10;
        System.out.println(i());
        if (i() != null || c() != null || j() != null) {
            if (m.l(i(), this.f37337a)) {
                System.out.println("INSTALLED");
                if (b() != null) {
                    g().setComponent(new ComponentName(i(), b()));
                } else {
                    g().setPackage(i());
                }
                super.m(readableMap);
                return;
            }
            System.out.println("NOT INSTALLED");
            if (c() != null) {
                j10 = c().replace("{url}", m.p(readableMap.getString(ImagesContract.URL))).replace("{message}", m.p(readableMap.getString("message")));
            } else {
                j10 = j() != null ? j() : "";
            }
            o(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(j10))));
        }
        super.m(readableMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u1.m
    public void n() throws ActivityNotFoundException {
        q(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(ReadableMap readableMap) throws ActivityNotFoundException {
        if (this.f37341e.hasKey("forceDialog") && this.f37341e.getBoolean("forceDialog")) {
            Activity currentActivity = this.f37337a.getCurrentActivity();
            if (currentActivity == null) {
                p.d(false, "Something went wrong");
                return;
            } else if (readableMap != null && !m.k("social", readableMap)) {
                throw new IllegalArgumentException("social is empty");
            } else {
                if (p.b()) {
                    Intent createChooser = Intent.createChooser(g(), this.f37339c, p.a(this.f37337a));
                    createChooser.addFlags(1073741824);
                    currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
                    return;
                }
                Intent createChooser2 = Intent.createChooser(g(), this.f37339c);
                createChooser2.addFlags(1073741824);
                currentActivity.startActivityForResult(createChooser2, RNShareModule.SHARE_REQUEST_CODE);
                p.d(true, Boolean.TRUE, "OK");
                return;
            }
        }
        g().addFlags(268435456);
        this.f37337a.startActivity(g());
        p.d(true, Boolean.TRUE, g().getPackage());
    }
}
