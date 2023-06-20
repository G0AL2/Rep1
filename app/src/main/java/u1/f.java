package u1;

import android.content.ActivityNotFoundException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: GooglePlusShare.java */
/* loaded from: classes.dex */
public class f extends n {
    public f(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // u1.m
    protected String c() {
        return "https://plus.google.com/share?url={url}";
    }

    @Override // u1.m
    protected String i() {
        return "com.google.android.apps.plus";
    }

    @Override // u1.m
    protected String j() {
        return "market://details?id=com.google.android.apps.plus";
    }

    @Override // u1.n, u1.m
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        n();
    }
}
